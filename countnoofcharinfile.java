import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class countnoofcharinfile {

   private static final String FILE_PATH = "HeroVired.txt";
   public static void main(String args[]) throws IOException {
      FileUtil fileUtil = new FileUtil(FILE_PATH);
      System.out.println("No. of characters in file: " + fileUtil.getCharCount());
   }
}

class FileUtil {
   static BufferedReader reader = null;    
   public FileUtil(String filePath) throws FileNotFoundException {
      File file = new File(filePath);
      FileInputStream fileStream = new FileInputStream(file);
      InputStreamReader input = new InputStreamReader(fileStream);
      reader = new BufferedReader(input);
   }

   public static int getCharCount() throws IOException {
      int charCount = 0;
      String HeroVired;        
      while((HeroVired = reader.readLine()) != null) {
         charCount += HeroVired.length();                        
      }            
      return charCount;
   }
}