public class DemoBreakContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 15; i++){
            if ((i==6)||(i==7)||(i==8)){
                continue;
            } if (i==11){
                break;
            }
            System.out.println("Putaran ke - " + i);
        }

    }
}
