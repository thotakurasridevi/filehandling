import java.io.File;

public class deletingFile {
    public static void main(String[] args) {
        String fileNameOLD = "index.txt";
        File fileObjectOLD = new File(fileNameOLD);
        
        String fileNameNEW = "demo.txt";
        File fileObjectNEW = new File(fileNameNEW);

        if(fileObjectOLD.delete()){
            System.out.println("File deleted sucessfully");
        }else{
            System.out.println("Error");
        }
    }
}