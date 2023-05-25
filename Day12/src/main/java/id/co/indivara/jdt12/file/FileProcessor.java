package id.co.indivara.jdt12.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

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
}
