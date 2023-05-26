package id.co.indivara.jdt12.file;

import java.io.*;
import java.util.ArrayList;

public class FileProcessor {
    public static void bacaFileText(String namaFile)throws Exception{
        File f = new File(namaFile);
        if (f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String baris = null;
            while ((baris=br.readLine()) != null){
                System.out.println(baris);

            }
            br.close();
            fr.close();
        } else {
            System.out.println("File anda fiktif");
        }
    }

    public static void bacaFileModeBytes(String namaFile) throws Exception {
        File f = new File(namaFile);
        if (f.exists()){
            FileInputStream fis = new FileInputStream(f);
            int data = 0;
            while ((data=fis.read()) !=-1){
                System.out.print((char) data);
            }
        } else {
            System.out.println("File anda fiktif");
        }
    }

    public static void copyFileModeByte(String fileSumber, String fileTujuan) throws Exception {
        File fileInput = new File(fileSumber);
        if(fileInput.exists()){
            FileInputStream fis = new FileInputStream(fileInput);
            FileOutputStream fos = new FileOutputStream(fileTujuan);

            int data = 0;
            while ((data=fis.read()) != -1){
                fos.write(data);
            }
            fos.flush();
            fos.close();
            fis.close();
            System.out.println("Copy file dari " + fileSumber + " ke " + fileTujuan + " Sukses");
        } else {
            System.out.println("File sumber tidak ada");
        }
    }

    public static void copyFileModeString(String fileSumber, String fileTujuan) throws Exception {
        File fileInput = new File(fileSumber);
        if (fileInput.exists()){
            FileReader fr = new FileReader(fileInput);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(fileTujuan);
            PrintWriter pw = new PrintWriter(fw);
            String data = null;
            while ((data= br.readLine()) != null){
                pw.println(data);
            }
            pw.flush();
            pw.close();
            br.close();

            System.out.println("Copy file dari " + fileSumber + " ke " + fileTujuan + " Sukses");
        } else {
            System.out.println("File sumber tidak ada");
        }
    }
}
