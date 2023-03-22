public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox<>(5);
        magicBox.add(1);
        magicBox.add(44);
        magicBox.add(676);
        magicBox.add(34);
        magicBox.add(656);

        System.out.println(magicBox.pick());


    }
}
