package lab8;

public class PetApp {
    public static void main(String[] args) {

        dog d1 = new  dog();
        d1.setName("Safe");
        d1.setAge(5);

        System.out.println(d1.toString()+""+d1.getClass().getName());

        Cat c1 = new Cat();
        c1.setName("momin");
        c1.setAge(3);
        System.out.println(c1.toString()+""+c1.getClass().getName());
    }
}
