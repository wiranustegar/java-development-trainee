public class DemoClassGenerics <A,B>  {
    A roda;
    B mesin;

    DemoClassGenerics(A roda, B mesin){
        this.roda = roda;
        this.mesin = mesin;
    }

    void setRoda(A roda){
        this.roda = roda;
    }

    void setMesin (B mesin){
        this.mesin = mesin;
    }

    A getRoda() {
        return roda;
    }

    B getMesin() {
        return mesin;
    }

    void cetakProperties(){
        System.out.println("roda = " + roda);
        System.out.println("mesin = " + mesin);
        System.out.println("============");
    }
}
