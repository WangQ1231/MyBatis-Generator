package com.wq.mkcode.xml;

import java.util.HashMap;
import java.util.Map;

public class ConfigXml {

	@SuppressWarnings("unchecked")
	public static Map<String, Map<String, String>> readConfig() {

		//mysql
		@SuppressWarnings("rawtypes")
		Map mysqlMap = new HashMap<String, String>();
		mysqlMap.put("databaseTYPE", "MYSQL");
		mysqlMap.put("driverName", "com.mysql.jdbc.Driver");
		mysqlMap.put("url", "jdbc:mysql://[ip]:3306/[db]?characterEncoding=UTF8");
		mysqlMap.put("dialect", "org.hibernate.dialect.MySQLInnoDBDialect");
		mysqlMap.put("generator", "<![CDATA[<generator class=\"native\"></generator>]]>");

		//oracle
		@SuppressWarnings("rawtypes")
		Map oracleMap = new HashMap<String, String>();
		oracleMap.put("databaseTYPE", "ORACLE");
		oracleMap.put("driverName", "oracle.jdbc.driver.OracleDriver");
		oracleMap.put("url", "jdbc:oracle:thin:@[ip]:1521:ORCL");
		oracleMap.put("dialect", "org.hibernate.dialect.Oracle10gDialect");
		oracleMap.put("generator", "<![CDATA[<generator class=\"org.hibernate.id.SequenceGenerator\"><param name=\"sequence\">[table]_seq</param></generator>]]>");

		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		map.put("MYSQL", mysqlMap);
		map.put("ORACLE", oracleMap);
		return map;
	}

}
