import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EnglishWords {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("javaCollectionOptionalTask\\src\\main\\resources\\englishwords");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner scan = new Scanner(bufferedReader);
            Set<String> englishWords = new HashSet<>();
            while (scan.hasNext()){
            englishWords.add(scan.next().toLowerCase());}
            System.out.println(englishWords);
        }
        catch (Exception ex) {
            ex.getMessage();
        }
    }
}
