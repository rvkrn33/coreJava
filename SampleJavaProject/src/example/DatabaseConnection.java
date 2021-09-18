package example;

public class DatabaseConnection {

	//Variable , method, block , inner
	
	private String tableName;
	
	static String userName;
	static String url;
	static String dbName;
	static DatabaseConnection db=new DatabaseConnection();
	
	public DatabaseConnection() {
		this.tableName=tableName;
}
	
	static {
		System.out.println("Static block execution");
		db.userName="ravi";
		db.url="localhost:3306/userdb";
		dbName="oracle";
	}
	
	//instance block 
	{
		System.out.println("Instance block");
	}
	
	public static DatabaseConnection getConnection() {
		return  db;
	}
	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}
