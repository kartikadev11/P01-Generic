/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author karti
 */
public class Musik {
    String path, fileName, fileSize, extention;
    public Musik(String p, String fn, String fs, String e){
        this.path = p;
        this.fileName = fn;
        this.fileSize = fs;
        this.extention = e;
    }
    public String getPath(){
        return path;
    }
    public String getFileName(){
        return fileName;
    }
    public String getFileSize(){
        return fileSize;
    }
    public String getExtention(){
        return extention;
    }
}
