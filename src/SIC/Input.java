package SIC;
import java.io.IOException;
public class Input {
    static String[] Program = null;
    public static void Start(String inputFileLocation) throws IOException{
        StringBuilder ProgramInALine = new StringBuilder();
        String currentLine;
        Ex6Methods.ReadFile(inputFileLocation);
        while((currentLine = Ex6Methods.GetLine())!= null){
            ProgramInALine.append(Ex6Methods.SingleSpaceSepration(currentLine));
            if(currentLine.contains("END"))break;
        }
        Program = Ex6Methods.ToStringAndSplit(ProgramInALine, " ");
    }
}