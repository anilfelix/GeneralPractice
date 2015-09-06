import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by This1 on 01/09/2015.
 */
public class FileCopyj7 {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("files", "abc.txt");
        Path destFile = Paths.get("files", "target.txt");

        try {
            Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
