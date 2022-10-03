public class Main {

    public static void main(String[] args) {
        // write your code here

        Shelter shelter = new Shelter(" Maike ", 24);
        Dog dog = new Dog(shelter, "Home name: Bars ,", " Парода: Овчарка ",
                new String[]{" команда: сидеть ", " лежать"},
                Color.BLACK);
        System.out.println(dog.getInfo());
dog.makeVoice(" гав гав ",3);

    }
}