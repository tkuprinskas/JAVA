package JavaBasics;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Billy Bob Joe";
        System.out.println("Name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("Last char: " + name.charAt(12));
        System.out.println("Substring: " + name.substring(10, 13)); //cuts the string and makes in a range of numbers


    }
}