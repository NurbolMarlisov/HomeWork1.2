import java.lang.reflect.Array;
import java.util.Arrays;

public class Dog extends Pet {


    private String name;
    private String bread;
    private String[] commands;

    public Dog(Shelter sheltor, String name, String bread, String[] commands, Color color) {
        this.name = name;
        this.bread = bread;
        this.commands = commands;
        super.setSheltor(sheltor);
        super.setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog(String name, String bread, Color color, Shelter shelter) {
        this.name = name;
        this.bread = bread;
        super.setSheltor(shelter);
        super.setColor(color);

    }

    public Dog(Shelter sheltor) {
        super(sheltor);
    }

    public String getInfo() {
        return super.getInfo() + name + bread + Arrays.toString(commands);
    }

    void makeVoice(String voice) {
        System.out.println(voice);
    }

    void makeVoice(String voice, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }
        void makeVoice(int count, String voice){
            for (int i = 0; i < count; i++) {
                System.out.println(voice);
            }
        }

}