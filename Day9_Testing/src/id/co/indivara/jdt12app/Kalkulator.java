package id.co.indivara.jdt12app;

public class Kalkulator {
    int num1, num2;

    public Kalkulator(int a, int b){
        num1 = a;
        num2 = b;
    }

    public int kali(){
        return (num1*num2);
    }

    public int bagi(){
        return (num1/num2);
    }

    public int jumlah(){
        return (num1+num2);
    }

    public int kurang(){
        return (num1-num2);
    }
}

