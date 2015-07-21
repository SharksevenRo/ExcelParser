package com.shark.excel.toExcel;

import java.util.List;

import com.shark.domain.StandardGrade;

public class Test {

	public static void main(String[] args) {
		
		List<StandardGrade> objs=null;
		new DataToExcel().toExcel(objs, "C:/Users/shark/Desktop/原始参考资料/EXCEL模板/标准化检查成绩批量导出模板.xls");
	}
}
