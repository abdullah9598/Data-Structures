import java.lang.Thread;

class NewThread extends Thread {
    public void run() {

        System.out.println("Hello");
        System.out.println("I am here");
        System.out.println("How are you");

    }
}

class Demo {
    public static void main(String args[]) {

        Runtime rn = Runtime.getRuntime();
        rn.addShutdownHook(new NewThread());

        for (int i = 0; i < 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}