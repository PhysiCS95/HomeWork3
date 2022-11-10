package task6;

public class Yellow extends Printer{
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    void print(String value){
        System.out.println(ANSI_YELLOW+value+ANSI_RESET);
    }
}
