import java.io.File;
public class createNewFile {
    public static void main(String[] args) {
        try{
            String fileName="index.txt";
            File fileObject= new File(fileName);
            if(fileObject.exists()){
                System.out.println("file already exist");
            }else{
                fileObject.createNewFile();
                System.out.println("New file is created");
            }


        }catch (Exception e){
            System.out.println("run time error");
        }
    }
}

        