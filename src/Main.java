import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String varibaleName = "Mike"; // strings are IMMUTABLE
        varibaleName = varibaleName + "s"; //Mikes
        String s = "";

        int[] nums;
        nums = new int[5];
        nums[0] = 1;


        StringBuilder sb = new StringBuilder(); //STRingBuilders are MUTABLE
        sb.append("mike");
        sb.append("s");
        // sb.toString();

        //  OR -> 1st TRUE
        // AND -> 1st False

        Computer computer = new Computer(true, 16);
        System.out.println(String.format("Keyboard? %b", computer.builtInKeyboard));
        System.out.println(String.format("Gigs of ram: %d", computer.getGigsOfRam()));
        computer.replaceRam(32);
        System.out.println(String.format("Gigs of ram: %d", computer.getGigsOfRam()));

        // primitives are passed by VALUE
        // objects are passed by REFERENCE

        computer.printNames();
        computer.addName(computer.names, "mike");
        computer.printNames();

    }
}

