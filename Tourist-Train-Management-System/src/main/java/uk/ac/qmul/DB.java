package uk.ac.qmul;


/*
 * inteface for the future added DB, 
 * read from local file for now
 */
public class DB {

    private long id;
    private int type;
    private String password;

    public DB() {

    }

    public static boolean getValidation(int type, long id, String password) {
        boolean valid = false;

        /*
         * read from the local file
         * @return if the 3-input are all valid
         */

        return valid;
    }

    public static void close() {

    }
