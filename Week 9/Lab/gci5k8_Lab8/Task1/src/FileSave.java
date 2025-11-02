import java.io. *;
public class FileSave {
    // --- Class Attributes ---
    private final String fileName;

    //Constructor
    public FileSave(String fileName){
        this.fileName = fileName;
    }

    // --- Methods ---

    //Method to create and write to a file named lines.txt
    public void save(String line) throws IOException{

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
            pw.println(line);
        }
    }
}
