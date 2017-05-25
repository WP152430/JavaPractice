package org.dimigo.interfaces;

public interface IDBManager {
	
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	public static IDBManager getDBObject(String database){
		if(database.equals(ORACLE_DATABASE))
			return new OracleDB();
		
		else
			return new SybaseDB();
		
	}
	
}
