package com.infybuzz.report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class FirstReport {

	public static void main(String[] args) {
		
		try {
			String filePath = "D:\\M\\U\\Teaching\\Jasper-Reports\\Data"
					+ "\\Projects\\Jasper-Report\\src\\main\\resources\\FirstReport.jrxml";
			
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("studentName", "John");
			
			Student student1 = new Student(1L, "Raj", "Joshi", "Happy Street",
					"Delhi");
			
			Student student2 = new Student(1L, "Peter", "Smith", "Any Street",
					"Mumbai");
			
			List<Student> list = new ArrayList<Student>();
			list.add(student1);
			list.add(student2);
			
			JRBeanCollectionDataSource dataSource = 
					new JRBeanCollectionDataSource(list);
			
		} catch(Exception e) {
			System.out.println("Exception while creating report");
		}
	}

}
