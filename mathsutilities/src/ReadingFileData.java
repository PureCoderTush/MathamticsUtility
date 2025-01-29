import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileData {
    String filePath="";
    public void dataInFile(String filePath){
       StringBuilder fileContent = new StringBuilder();
        try {
            String line="";
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            while((line=br.readLine()) !=null){
                fileContent.append(line).append(System.lineSeparator());
            }
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("exception in file reading");
        }
        String content = fileContent.toString();
        System.out.println(content);

    }
}
