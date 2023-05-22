package id.co.indivara.jdt12app;

public class StringProcessor {
    public String sambungKata(String a, String b){
        return (a + " " + b);
    }

    public String gedeinKata(String s){
        return s.toUpperCase();
    }

    public String kecilinKata(String s){
        return s.toLowerCase();
    }

    public int hurufKeAngka(String s){
        return Integer.parseInt(s);
    }
}
