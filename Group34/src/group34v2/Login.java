/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group34v2;

/**
 *
 * @author Victoria
 */
public class Login 
        implements java.io.Serializable

{
    public Login(String un, String pass,int s)
    {
        username = un; password = pass; state = s;
    }
    
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public int getState() {return state; }
    
    public void setUsername(String value) { username = value; }
    public void setPassword(String value) { password = value; }
    public void setState(int value) { state = value; }      // 开发者是0, manager是1, dirver/train是2, stop/route是3
    
    public String toString()
    {
        return "[Username:" + username +
                " Password:" + password +
                "]";
    }
    
    private String username;
    private String password;
    private int state;
}
