package org.example;

public class Main {

    public static void main(String[] args) {
        for (String arg : args) {
            if (!arg.matches("\\d+")) {
                System.out.println("Please enter only numbers");
                System.exit(0);
            }
        }


        int[] intArgs = castStringArrayToIntArray(args);
        System.out.println(
                "Result of int material(int[] spaceship) is: " + start(intArgs));
    }

    public static int[] castStringArrayToIntArray(String[] args) {
        int[] intArgs = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            intArgs[i] = Integer.parseInt(args[i]);
        }

        return intArgs;
    }

    public static int start(int[] intArray){
        MaterialCounter materialCounter = new MaterialCounter();
        return materialCounter.material(intArray);
    }

}
