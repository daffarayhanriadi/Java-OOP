package daffa.belajarjava.application;

public class StackTraceApp {
    public static void main(String[] args) {

//        try {
//            String[] names = {"Daffa", "Rayhan", "Riadi"};
//            System.out.println(names[100]);
//        } catch (Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//
//            throwable.printStackTrace();
//        }
//    }

        try {
           sampleError();
        } catch (RuntimeException  exception) {
            exception.printStackTrace();
        }
    }

    // Multiple StackTraceElements
    public static void sampleError() {
        try {
            String[] names = {"Daffa", "Rayhan", "Riadi"};
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
