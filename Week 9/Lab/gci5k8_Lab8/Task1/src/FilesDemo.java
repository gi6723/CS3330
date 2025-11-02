import java.io.*;
import java.util.Scanner;
public class FilesDemo {
    public static void main(String[] args) throws IOException{

        //Creating instance of class file save to create new file

        FileSave newFile = new FileSave("lines.txt");

        //Printing lines specified by lab to lines.txt
        newFile.save("1-Lorem ipsum dolor sit amet");
        newFile.save("2-Consectetuer adipiscing elit");
        newFile.save("3-Sed diam nonummy nibh euismod tincidunt");
        newFile.save("4-Ut wisi enim ad minim veniam");
        newFile.save("5-Quis nostrud exerci tation ullamcorper");
        newFile.save("6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat");
        newFile.save("7-Duis autem vel eum iriure dolor in hendrerit");
        newFile.save("8-Vel illum dolore eu feugiat nulla facilisis at vero eros");

        //Creating instance of FileDisplay to open the "lines.txt" file
        FileDisplay display1 = new FileDisplay("lines.txt");

        //Displaying file contents
        System.out.println(" ----- Displaying entire files contents ----- ");
        display1.display();
        System.out.print("\n");

        System.out.println(" ----- Displaying up to line 3 ----- ");
        display1.display(3);
        System.out.print("\n");

        System.out.println(" ----- Displaying up to line 10 ----- ");
        display1.display(10);
        System.out.print("\n");

        System.out.println(" ----- Displaying from line 3 to 5 ----- ");
        display1.display(3, 5);
        System.out.print("\n");

        System.out.println(" ----- Displaying from line 3 to 10 ----- ");
        display1.display(3, 10);
        System.out.print("\n");

    }
}
