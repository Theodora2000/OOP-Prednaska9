package sk.stuba.uim.fei.oop;

import java.io.File;

public class FileTest1 {

    public static void main(String[] args){
        String meno_suboru = ZKlavesnice.readString("Zadaj meno suboru:");
        File file = new File(meno_suboru);//objekt typu subor
        if(file.exists() && !file.isDirectory()){
            System.out.println("Subor " + file.getName() +" bol najdeni");
            System.out.println("Cela cesta " +file.getAbsolutePath());
        }else{
            System.out.println("Nenasiel som");
        }


    }
}
