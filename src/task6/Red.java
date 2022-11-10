package task6;

public class Red extends Printer{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    void print(String value){
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }

}
