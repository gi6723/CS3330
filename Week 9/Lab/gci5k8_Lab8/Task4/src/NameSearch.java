import java.io.IOException;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) throws IOException {
        // Creating two instances of KidsPopular name (one for boy and one for girl names)
        KidsPopularName boyNames = new KidsPopularName("BoyNames.txt");
        KidsPopularName girlNames = new KidsPopularName("GirlNames.txt");

        //Scanner object to read user input
        Scanner s = new Scanner(System.in);

        // Prompting user to enter a kid name
        System.out.print("Enter a kid name: ");
        String name = s.nextLine();

        // Querying both files
        boolean inBoyNamesFile = boyNames.isPopularName(name);
        boolean inGirlNamesFile = girlNames.isPopularName(name);

        // Checking if name exists in "BoyNames.txt" or "GirlNames.txt" or neither
        if(inBoyNamesFile){
            System.out.println("It is one of the most popular boy's names");
        }

        if (inGirlNamesFile) {
            System.out.println("It is one of the most popular girl's names");
        }

        if(!inBoyNamesFile && !inGirlNamesFile){
            System.out.println("It is not one of the most popular kid's names");
        }



    }
}
