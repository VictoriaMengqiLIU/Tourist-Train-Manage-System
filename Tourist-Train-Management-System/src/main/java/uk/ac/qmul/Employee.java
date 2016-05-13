package uk.ac.qmul;


public class Employee {

    private long id;
	private String name;
	private int type;
	private String password;

	public Employee() {
	
	}

	public static boolean verify(int type, long id, String password) {
	    boolean verify_result = false;

		try {
		    DB db = new DB();
			verify_result = db.getValidation(type, id, password);
            db.close();
        }
		catch (Exception e) {
		    e.printStackTrace();

        }
		
		return verify_result;
    }

