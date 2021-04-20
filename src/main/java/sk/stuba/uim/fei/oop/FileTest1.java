package sk.stuba.uim.fei.oop;

import java.io.File;

public class FileTest1 {

    public static void main(String[] args){
        File dir = new File (".");//bodka je aktualny adresar
        String[] list = dir.list();
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
        System.out.println("--------------------");
        for(int i=0;i<list.length;i++){
            if(list[i].endsWith(".java")){
                File temp = new File(dir, list[i]);
                long length = temp.length();//pri fajloch vrati pocet bajtov
                System.out.println(list[i] + " ["+length+"]");
            }
            System.out.println(list[i]);
        }
    }
}
