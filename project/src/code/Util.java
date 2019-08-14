/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Victoria
 */
public class Util {
    
    private String root;
    private String wd;
    
    public Util() {
        this.wd = Paths.get("").toAbsolutePath().toString().substring(0, 
                Paths.get("").toAbsolutePath().toString().indexOf("Tourist-Train-Manage-System"));
        this.root = this.wd + "Tourist-Train-Manage-System/project/data";
    }
    
    public Util(String root) {
        this.root = root;
    }
    
    public Object readObject(String dir) {
        dir = root + dir;
        Object obj = null;
        obj = readObj(dir);
        
        return obj;
    }
    
    public void writeObject(String dir, Serializable obj) {
        dir = root + dir;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream(dir);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(obj);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private Object readObj(String dir) {
        Object obj = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(dir);
            ois = new ObjectInputStream(fis);
            
            obj = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return obj;
    }
    
    public ArrayList getObj(String dir) {
        dir = root + dir;
        File f = new File(dir);
        File[] fs = f.listFiles((File file) -> !file.isHidden());
        ArrayList<Object> obj = new ArrayList<Object>();
        
        try {
            for (File tmp : fs) {
                String path = tmp.getPath();
                obj.add(readObj(path));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
    
    public void addObj(String dir, String sub, Serializable obj) {
        
        try {
            
            if (!new File(root+dir).isDirectory()) {
                new File(root+dir).mkdir();
            }
            
            dir = dir + "/" + sub;
            writeObject(dir, obj);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
