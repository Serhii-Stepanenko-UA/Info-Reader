package app;

public class Main {

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String directory = "files/";
        String file = "info.txt";
        String content = handler.readFile(directory + file);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}