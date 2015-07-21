package com.shark.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.excel.toObj.ExcelToObj;

public class Test {

	
	public void testPIO() {
		try {
			
			FileInputStream file = new FileInputStream(new File("C:/Users/shark/Desktop/原始参考资料/EXCEL模板/标准化检查成绩批量导出模板.xls"));
			POIFSFileSystem ts;
			// 获取指向该excel的POIFSFileSystem实例

			ts = new POIFSFileSystem(file);
			HSSFWorkbook wb = new HSSFWorkbook(ts);
			HSSFSheet sh = wb.getSheetAt(0);
			HSSFRow ro = null;
			
			for(int i=0;(ro=sh.getRow(i))!=null;i++){
				
				for(int j=0;ro.getCell(j)!=null;j++){
					System.out.print(new ExcelToObj().changeCellToString(ro.getCell(j))+"i="+i+"j="+j+"  ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		new ExcelToObj().complexExcelToObject(new File("C:/Users/shark/Desktop/原始参考资料/EXCEL模板/标准化检查成绩批量导出模板.xls"));
	}
		

}
