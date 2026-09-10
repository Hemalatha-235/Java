package exceptionex;

public class Ex10 {
    public static void main(String[] args) {
        try {
            Thread t = new Thread();
            t.setPriority(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument!");
        }
    }
}

