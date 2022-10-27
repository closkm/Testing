import java.util.ArrayList;

public class Computer {
    //fields, properties, ATTRIBUTES
    public boolean builtInKeyboard;
    private int gigsOfRam; // 0

    public ArrayList<String> names; //NULL
    public Computer(boolean builtInKeyboard, int gigsOfRam){
        this.builtInKeyboard = builtInKeyboard;
        this.gigsOfRam = gigsOfRam;
        names = new ArrayList<String>();  //[]
        names.add("Farzad");
        names.add("Sandy");
    }
    public int getGigsOfRam(){
        return gigsOfRam;
    }
    public void replaceRam(int gigsOfRam){
        this.gigsOfRam = gigsOfRam;
    }

    public void printNames(){
        for(String name : names) {
            System.out.println(name);
        }
    }
    public void addName(ArrayList<String> amazon, String name){
        amazon.add(name);
    }
}
