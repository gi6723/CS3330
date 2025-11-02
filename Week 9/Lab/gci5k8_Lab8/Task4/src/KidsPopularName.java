import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class KidsPopularName {

    // Class Attributes
    private final String[] kidsNames;
    private final String fileName;

    //Class Constructor
    public KidsPopularName(String fileName) throws IOException{
        this.fileName = fileName;
        this.kidsNames = new String[getNumNames()];

        //Calling helper method "fillName" to populate "KidsNames" array
        fillNames();
    }

    // --- Methods ---

    // Helper function to determine the total # of items in the file
    private int getNumNames() throws IOException {
        //Creating file object
        File f = new File(fileName);

        //Int variable to store counted # of names within file
        int numOfNames = 0;

        //Checking file existence
        if (!f.exists()){
            System.out.println("The file does not exists");
            System.exit(0);
        }

        try (Scanner fileReader = new Scanner(f)){

            //Loops through file until it reaches EOF and counts # of lines
            while (fileReader.hasNextLine()){
                numOfNames++; // Incrementing each read line
                fileReader.nextLine(); // Progressing to next line

            }
        }
        return numOfNames;
    }

    // Helper function to read the names from the file and assign them to "kidsNames" array
    private void fillNames() throws IOException{
        // Creating file object
        File f = new File(fileName);

        //Checking file existence
        if(!f.exists()){
            System.out.println("The file does not exists");
            System.exit(0);
        }

        int i = 0;
        try (Scanner fileReader = new Scanner(f)){
            while(fileReader.hasNextLine()){
                //Adding each scanned line into kidsNames array
                kidsNames[i] = fileReader.nextLine();
                //Increment index of kidsNames
                i++;
            }
        }
    }

    /*
     * Searches for passed in name within array "kidsName"
     * Returns True if name is found
     */
    public boolean isPopularName(String name){
        boolean found = false;

        // Loops through array checks each index if name stored in that index
        // Matches passed in name
        for(int i = 0; i <= kidsNames.length - 1; i++){
            if(kidsNames[i].equalsIgnoreCase(name)){
                found = true;
                break;
            }
        }
        return found;
    }
}
