package generics;

public class Run {

    public static void main(String[] args) {
        Fruit<Integer,Integer,Integer> fruit1 = new Fruit<>(234512, 22, 123);
        Fruit<String,String,String> fruit2 = new Fruit<>("A234512", "51", "BASS");
        Fruit<String,Integer,String> fruit3 = new Fruit<>("A234512", 22, "POOP");

        System.out.println(fruit1);
        System.out.println(fruit2);
        System.out.println(fruit3);
    }
}


