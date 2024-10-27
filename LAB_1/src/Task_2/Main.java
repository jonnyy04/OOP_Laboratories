package Task_2;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the path to the text file as a command-line argument.");
            return;
        }

        String filePath = args[0];
        System.out.println(filePath);
        String text = FileReader.readFileIntoString(filePath);

        if (!text.isEmpty()) {
            TextData textData = new TextData(filePath, text);
            System.out.println(textData);
        } else {
            System.out.println("The file is empty or couldn't be read.");
        }
    }
}
