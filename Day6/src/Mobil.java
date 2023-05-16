public class Mobil extends Kendaraan {

    public void berhenti(){
        System.out.println("Berhenti ala Mobil");
    }
    public void mundur(){
        System.out.println("Mundur...");
    }

    public void mengenangParent(){
        super.berhenti();
    }
}
