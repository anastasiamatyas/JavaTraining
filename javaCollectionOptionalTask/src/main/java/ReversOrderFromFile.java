import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReversOrderFromFile {
    public static void main (String[] args){
        List<String> stringFromFile = new ArrayList<>();
        try(FileReader fileReader = new FileReader("javaCollectionOptionalTask\\src\\main\\resources\\somelines.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("javaCollectionOptionalTask\\src\\main\\resources\\reversordersomelines.txt")) {
            while (bufferedReader.ready()) {
                stringFromFile.add(bufferedReader.readLine());
            }
            for (int i = stringFromFile.size() - 1; i < stringFromFile.size() && i >= 0; i--) {
                fileWriter.write(stringFromFile.get(i) +'\n');
            }
        }
        catch (Exception ex) {
        }
    }
}
