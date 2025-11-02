import java.io.*;
import java.util.Scanner;

public class FileDisplay {
    // --- Class Attributes ---
    private final String fileName; //stores file name/path

    //Constructor
    public FileDisplay(String fileName){
        this.fileName = fileName;
    }

    // --- Methods ---

    public int fileLength() throws IOException{
        /*
         * Helper Method
         * Uses while loop to count the # of lines the file has
         */

        int lineCount = 0;
        File f = new File(fileName); //file object representing file specified by constructor

        // Check if file actually exists
        if(!f.exists()){
            System.out.println("The file does not exists");
            System.exit(0);
        }

        try (Scanner fileReader = new Scanner(f)){

            while (fileReader.hasNextLine()){
                lineCount ++; // Increment line count
                fileReader.nextLine(); // Advance to next line
            }

        }

        //returns # of lines in file for other methods to use
        return lineCount;
    }
    public void display() throws IOException{
        /*
         * First checks if file defined by constructor exists.
         * If file exist:
         *  - Displays entire contents of file line by line.
         *
         * If file foes NOT exist:
         *  -  Displays the message "The file does not exist"
         */

        //File object representing file specified by constructor
        File f = new File(fileName);

        //Check if file actually exists
        if (!f.exists()){
            System.out.println("The file does not exists");
            System.exit(0);
        }

        try (Scanner fileReader = new Scanner(f)){

            // Loops through entire file until EOF reached
            while(fileReader.hasNextLine()){

                //Prints file contents of each file line
                System.out.println(fileReader.nextLine());
            }

        }


    }

    public void display(int n) throws IOException{
        /*
         * First checks if file defined by constructor exists.
         * If file exist:
         *  - Displays the first n lines of the file's contents.
         *  - If the file contains fewer than n lines, displays the entire file line by line.
         *
         * If file foes NOT exist:
         *  -  Displays the message "The file does not exist"
         */

        //File object representing file specified by constructor
        File f = new File(fileName);

        //Check if file actually exists
        if (!f.exists()){
            System.out.println("The file does not exists");
            System.exit(0);
        }

        //Uses helper method to get the length of file
        int lineCount = fileLength();

        try (Scanner fileReader = new Scanner(f)){

            //If shorter than n lines, print all lines
            if(lineCount < n){
                while(fileReader.hasNextLine()){
                    //Prints file contents of each file line
                    System.out.println(fileReader.nextLine());
                }
                return;
            }

            //Otherwise, print only the first n lines
            int counter = 0;
            while(fileReader.hasNextLine() && counter < n){
                //Prints file contents of each file line
                System.out.println(fileReader.nextLine());
                counter ++;
            }

        }

    }

    public void display(int from, int to) throws IOException{
        /*
         * First checks if file defined by constructor exists.
         * If file exist:
         *  - Displays file's contents starting from line number "from" to line number "to".
         *  - If the file contains fewer than "to" lines, displays the entire file line by line.
         *
         * If file foes NOT exist:
         *  -  Displays the message "The file does not exist"
         */

        //File object representing file specified by constructor
        File f = new File(fileName);

        //Check if file actually exists
        if (!f.exists()){
            System.out.println("The file does not exists");
            System.exit(0);
        }

        //Uses helper method to get the length of file
        int lineCount = fileLength();



        try (Scanner fileReader = new Scanner(f)){

            int lineNo = 1;

            //If shorter than to lines, print all lines
            if(lineCount < to){
                while(fileReader.hasNextLine()){
                    String line = fileReader.nextLine();

                    if (lineNo >= from){
                        //Prints file contents of each file line
                        System.out.println(line);
                    }

                    lineNo++;
                }
                return;
            }

            //Otherwise, print from line number "from" to line number "to"
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();

                if (lineNo >= from && lineNo <= to){
                    //Prints file contents of each file line
                    System.out.println(line);
                }

                //Stop once we pass the "to" index
                if (lineNo > to){
                    break;
                }

                //Increment counter
                lineNo ++;
            }

        }

    }
}
