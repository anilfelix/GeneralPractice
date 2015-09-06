import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by This1 on 01/09/2015.
 */
public class FileCopyApache {
    public static void main(String[] args) {
        File sourceFile = new File("files/abc.txt");
        File destFile = new File("files/target.txt");
        try {
            FileUtils.copyFile(sourceFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
