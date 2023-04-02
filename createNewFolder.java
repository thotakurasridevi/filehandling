import java.io.File;
public class createNewFolder {
    public static void main(String[] args) {
        try{
            String folderName="index";
            File fileObject= new File(folderName);
            if(fileObject.exists()){
                System.out.println("folder already exist");
            }else{
                fileObject.createNewFile();
                System.out.println("New folder is created");
            }


        }catch (Exception e){
            System.out.println("run time error");
        }
    }
}

        
