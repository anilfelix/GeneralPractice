import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by This1 on 01/09/2015.
 */
public class FilesPgm {
    public static void main(String[] args) {

        String sourceFile1 = "files/abc.txt";
        String targetFile1 = "files/target.txt";
        try (FileReader fileReader = new FileReader(sourceFile1);
             BufferedReader bReader = new BufferedReader(fileReader);
             FileWriter writer = new FileWriter(targetFile1);


        ) {
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    writer.write(line + "\n");
                }
            }
            System.out.println("file copied");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
