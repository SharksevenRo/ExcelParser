package com.shark.excel.toExcel;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.shark.domain.StandardGrade;


public class DataToExcel {

	
		protected HSSFWorkbook wb;
		protected HSSFSheet sh;
		protected POIFSFileSystem ts;
		protected FileInputStream file;

		
		public void toExcel(List<StandardGrade> objs, String templateFilePath) {

			try {
				FileInputStream fis = new FileInputStream(templateFilePath);
				this.setFile(fis);
				int cloums=0;
				HSSFRow ro=null;
				HSSFCell cell=null;
				while((ro=sh.getRow(cloums)) != null){
					cloums++;
//					while((cell=ro.getCell(j)) != null){
//						j++;
//					}
				}
				
				int index=0;
				Class clazz=StandardGrade.class;
				Field[] fields = clazz.getDeclaredFields();
				Field field=null;
				for (int i=0;i<fields.length; i++) {
					
					index++;
					HSSFRow tempRow=sh.createRow(index);
					field=fields[i];
					Class<?> type = field.getType();
					String type_name=type.getName();
					
					
					for (int j = 0; j <cloums; j++) {
						HSSFCell temCell = tempRow.createCell(j);
						
					}
					
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		/**
		 * 设置模板excel文件,给HSSFWorkbook赋值
		 * @param templateFilePath
		 */
		private void setFile(FileInputStream file) {
			
			// 获取指向该excel的POIFSFileSystem实例
			try {
				ts = new POIFSFileSystem(file);
				wb = new HSSFWorkbook(ts);
				sh = wb.getSheetAt(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
