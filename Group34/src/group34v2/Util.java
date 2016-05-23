/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group34v2;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Victoria
 */
public class Util {
    
    private String root;
    
    public Util() {
        this.root = "./src/group34v2/data";
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
        File[] fs = f.listFiles();
        ArrayList<Object> obj = new ArrayList<Object>();
        
//        int i = 0;
//        for (File tmp: fs) {
//            if (i != 0) {
//                String p = tmp.getPath();
//                obj.add(readObj(p));
//            }
//            
//            i++;
//        }
//        
        for (File tmp : fs) {
            String p = tmp.getPath();
            obj.add(readObj(p));
        }
        
        return obj;
    }
    
    public void addObj (String dir, String subdir, Serializable obj) {
        
        try {
            
            if (!new File(root+dir).isDirectory()) {
                new File(root+dir).mkdir();
            }
            
            dir = dir + "/" + subdir;
            writeObject(dir, obj);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList readDir (String dir) {
        String[] list = new File(root+dir).list();
        ArrayList<Object> obj = new ArrayList<Object>();
        
        int i = 0;
        
        for (String sub : list) {
            if (i != 0)
            {
                obj.add(readObject(dir+sub));
            }
            i++;
        }
        
        return obj;
    }
}
