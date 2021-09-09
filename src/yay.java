
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class yay {
    public static void main(String[] args) throws IOException{
        var Names = new ArrayList<String>();
        var Numbers = new ArrayList<Integer>();
        var filename = "Test.txt";
        var filePath = Paths.get(filename);
        var list  = Files.readAllLines(filePath);
        for (var line: list){
            var splitLine = line.split(",");
            Names.add(splitLine[0]);
            Numbers.add(Integer.parseInt(splitLine[1]));

        }
        for(int i = 0; 1< Names.size(); i++){
            System.out.println("Student "+ Names.get(i)+ " has Jersey Number "+ Numbers.get(i));
        }
    }
}
