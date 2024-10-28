package Task_2;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the paths to the text files as command-line arguments.");
            return;
        }

        // Loop through each file path provided in the command-line arguments
        for (String filePath : args) {
            System.out.println("Reading file: " + filePath);

            String text = FileReader.readFileIntoString(filePath);

            if (text != null && !text.isEmpty()) {
                TextData textData = new TextData(filePath, text);
                System.out.println(textData);
            } else {
                System.out.println("The file at " + filePath + " is empty or couldn't be read.");
            }
        }
    }
}
