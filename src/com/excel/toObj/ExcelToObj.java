package com.excel.toObj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.annotation.Mark;

/**
 * 从读取Excel文件封装成对应的对象
 * 
 * @author shark
 * 
 */
public class ExcelToObj {

	/**
	 * 
	 * @param t
	 *            生成对象的对象实例
	 * @param path
	 */
	public <T> void toExcel(File path) {

		FileInputStream file = null;
		POIFSFileSystem ts;
		try {

			File name = path.getAbsoluteFile();
			System.out.println(name.getName());
			// 读取文件
			file = new FileInputStream(path);

			// 获取指向该excel的POIFSFileSystem实例
			ts = new POIFSFileSystem(file);
			HSSFWorkbook wb = new HSSFWorkbook(ts);
			HSSFSheet sh = wb.getSheetAt(0);
			HSSFRow ro = null;

			// 获取模板excel对应类的字节码
			Class clazz = null;
			// 模板对应excel对应类的实例集合
			List<T> objs = null;

			// 遍历excel表的每一行（从第一行数据读，不读表头）
			for (int i = 1; sh.getRow(i) != null; i++) {

				ro = sh.getRow(i);
				objs = new ArrayList<T>();
				// 实例化一个excel对应类的实例
				Object obj = clazz.newInstance();
				// 遍历excel表的每一列
				// 获取excel对应类的的成员变量
				Field[] fields = clazz.getDeclaredFields();
				for (int j = 0; ro.getCell(j) != null; j++) {

					// 按顺序获取成员变量中的每一个
					Field field = fields[j];
					// 获取成员变量的名
					String fieldName = field.getName();
					// 获取成员变量的类型
					Class<?> type = field.getType();
					// 获取类型名
					String tyep_name = type.getName();
					// 将成员变量名的一个字母转大写
					fieldName = fieldName.replaceFirst(fieldName
							.substring(0, 1), fieldName.substring(0, 1)
							.toUpperCase());
					// 获取成员变量所对应的set方法
					Method method = clazz.getMethod("set" + fieldName, type);
					// 根据下标获取单元格对象
					HSSFCell cell = ro.getCell(j);
					Object value = null;

					// 根据成员变量的类型获取单元格数据
					switch (tyep_name) {
					// 成员变量为String时
					case "java.lang.String":
						// 调用方法获取，并强转
						value = (String) changeCellToString(cell);
						break;
					// 成员变量类型为int时
					case "int":
						// 获取单元格中的数据，转为String
						value = (String) (String) changeCellToString(cell);
						// 转为Integer
						value = (Integer) Integer.valueOf(value.toString());
					default:
						System.out.println("无类型");
						break;
					}
					// invoke实现对当前对象的设置值
					method.invoke(obj, value);
				}
				System.out.println(obj.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				file = null;
			}
		}
		System.out.println("ok");
	}

	// private Object checkNum(Cell cell){
	// Object inputValue = null;// 单元格值
	// if(!isEmpty(cell) && cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	// long longVal = Math.round(cell.getNumericCellValue());
	// double doubleVal=Math.round(cell.getNumericCellValue());
	// if(Double.parseDouble(longVal + ".0") == doubleVal)
	// inputValue = longVal;
	// else
	// inputValue = doubleVal;
	// }
	// return inputValue;
	// }
	//
	// private boolean isEmpty(Cell cell){
	//
	// return true;
	// }
	//
	/**
	 * 根据单元格中的数据类型获取数据
	 * 
	 * @param cell
	 * @return
	 */
	public String changeCellToString(HSSFCell cell) {

		String returnValue = "";
		if (null != cell) {
			switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_NUMERIC: // 数字
				Double doubleValue = cell.getNumericCellValue();
				String str = doubleValue.toString();
				if (str.contains(".0")) {
					str = str.replace(".0", "");
				}
				Integer intValue = Integer.parseInt(str);
				returnValue = intValue.toString();
				break;
			case HSSFCell.CELL_TYPE_STRING: // 字符串

				returnValue = cell.getStringCellValue();
				break;
			case HSSFCell.CELL_TYPE_BOOLEAN: // 布尔
				Boolean booleanValue = cell.getBooleanCellValue();
				returnValue = booleanValue.toString();
				break;
			case HSSFCell.CELL_TYPE_BLANK: // 空值
				returnValue = "";
				break;
			case HSSFCell.CELL_TYPE_FORMULA: // 公式

				returnValue = cell.getCellFormula();
				break;
			case HSSFCell.CELL_TYPE_ERROR: // 故障
				returnValue = "";
				break;
			default:
				System.out.println("未知类型");
				break;
			}

		}
		return returnValue;
	}

	public void complexExcelToObject(File path) {

		int t = 1;
		FileInputStream file = null;
		POIFSFileSystem ts;
		// 模板对应excel对应类的实例集合
		List<Object> objs = new ArrayList<Object>();
		try {

			File name = path.getAbsoluteFile();
			System.out.println(name.getName());
			// 读取文件
			file = new FileInputStream(path);

			// 获取指向该excel的POIFSFileSystem实例
			ts = new POIFSFileSystem(file);
			HSSFWorkbook wb = new HSSFWorkbook(ts);
			HSSFSheet sh = wb.getSheetAt(0);
			HSSFRow ro = null;

			// 获取模板excel和对应类（可能多个类）逻辑配置信息
			List<ExcelObjStruct> configs = ExcelConfig.getObjectFromConfig(name
					.getName());
			Class<?> clazz = null;
			String clazzName = null;
			String clomns = null;

			// 遍历excel表，从第一行开始
			for (int i = ExcelConfig.getDataBegin(name.getName()); sh.getRow(i) != null; i++) {

				// 获取一行数据
				ro = sh.getRow(i);

				// 遍历逻辑配置对象集合
				for (ExcelObjStruct eos : configs) {

					// 获取数据对应的类的全路径
					clazzName = eos.getClassName();
					// 获取数据对应类的字节码
					clazz = Class.forName(clazzName);

					// 获取数据对应类的成员变量
					Field[] fields = clazz.getDeclaredFields();
					Method method;
					Object value = null;
					List<Integer[]> objRefIndexs = new ArrayList<Integer[]>();

					if (eos.getFieldIndex().equals("*")) {
						
						List<Integer> inter=new ArrayList<Integer>(); 
						for(int k=1;ro.getCell(k)!=null;k++){
							inter.add(k);
						}
						Integer[] array =inter.toArray(new Integer[inter.size()]);
						objRefIndexs.add(array);
					} else {
						// 获取excel一行数据上的多个同类对象的数据行号集合
						objRefIndexs = getIndexs(eos.getFieldIndex());
					}
					// 遍历单个对象所对应excel的单元格的列号
					for (Integer[] integers : objRefIndexs) {

						// 记录遍历成员变量位置的游标
						int cursor = 0;
						// 实例化一个和数据对应的对象实例
						Object object = clazz.newInstance();
						for (Integer integer : integers) {

							// 获取对象所对应行号列号上的数据

							Field field = fields[cursor];

							// 获取成员变量名
							String fieldName = field.getName();
							// 将首字母转大写
							fieldName = fieldName.replaceFirst(fieldName
									.substring(0, 1), fieldName.substring(0, 1)
									.toUpperCase());
							// 获取成员变量所对应的set方法
							method = clazz.getMethod("set" + fieldName,
									field.getType());
							String type_name = field.getType().getName();
							HSSFCell cell = null;

							Mark annotation = field.getAnnotation(Mark.class);
							if (annotation == null) {
								cell = ro.getCell(integer);
							} else {
								cell = sh.getRow(annotation.row()).getCell(
										annotation.clomn());
							}
							// 根据成员变量的类型获取单元格数据
							switch (type_name) {
							// 成员变量为String时
							case "java.lang.String":
								// 调用方法获取，并强转
								value = (String) changeCellToString(cell);
								break;
							// 成员变量类型为int时
							case "int":
								// 获取单元格中的数据，转为String
								value = (String) changeCellToString(cell);
								// 转为Integer
								value = (Integer) Integer.valueOf(value
										.toString());
								break;
							case "java.util.Date":

								value = (Date) cell.getDateCellValue();
								// 时间格式转换
								String result = (((Date) value).getYear() + 1900)
										+ "年"
										+ (((Date) value).getMonth() + 1)
										+ "月" + ((Date) value).getDate() + "日";
								System.out.println(result);
								break;
							}
							// 当前实例赋对应的值
							method.invoke(object, value);
							cursor++;

						}
						System.out.println(object.toString());
						objs.add(object);
					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private List<Integer[]> getIndexs(String fieldIndex) {

		Integer[] indexs;
		List<Integer[]> objIndex = new ArrayList<Integer[]>();
		int item;
		String[] split = fieldIndex.split(":");
		for (String string : split) {

			String[] split2 = string.split(",");
			indexs = new Integer[split2.length];
			for (int i = 0; i < split2.length; i++) {
				indexs[i] = item = Integer.parseInt(split2[i]);
			}
			objIndex.add(indexs);
		}
		return objIndex;
	}
}
