import id.co.indivara.jdt12.file.FileProcessor;

public class DemoJavaIO {
    public static void main(String[] args)throws Exception {
//        FileProcessor.bacaFileText("d:/javaioexample.txt");

//        FileProcessor.bacaFileModeBytes("d:javaioexample.txt");

//        FileProcessor.copyFileModeByte("d:/temanvirtual.json", "d:/hasilcopy.txt");
        FileProcessor.copyFileModeString("d:/temanvirtual.json", "d:/hasilcopyModeString.pdf");
    }
}
