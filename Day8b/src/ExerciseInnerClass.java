public class ExerciseInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        IOne i = o.new Middle();
        i.test();

        Kendaraan k = ((Outer.Middle)i).new Inner();
        k.jalan();
    }
}
