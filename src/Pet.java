import java.util.Random;

public class Pet   {
    private int age = generateDefaultAge();
    Color color;
    private Shelter sheltor;

    public Pet() {

    }

    public Shelter getSheltor() {
        return sheltor;
    }

    public Pet(Shelter sheltor) {
        super();
        this.sheltor = sheltor;
    }

    public void setSheltor(Shelter sheltor) {
        this.sheltor = sheltor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(20)+1;
    }
public String getInfo(){
        return " Age " + getAge() +" Color "+ getColor() + sheltor.getName() + sheltor.getAddress();
}

}
