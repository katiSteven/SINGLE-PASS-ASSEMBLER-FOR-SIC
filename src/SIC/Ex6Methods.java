package SIC;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class Ex6Methods {
    static BufferedReader bf;
    static BufferedWriter bw;
    public static void ReadFile(String FileLocation)throws FileNotFoundException, IOException{
        File file=new File(FileLocation);
        FileReader fread=new FileReader(file);
        bf=new BufferedReader(fread);
    }
    public static String GetLine() throws IOException{
        String Line = bf.readLine();
        if(Line!=null)
            return Line;
        return null;
    }
    public static void WriteFile(String FileLocation,String towrite) throws IOException{
        Ex6Methods.WriteInitialize(FileLocation);
        bw.write(towrite);
        bw.close();
    }
    public static void WriteInitialize(String FileLocation)throws FileNotFoundException, IOException{
        File file=new File(FileLocation);
        FileWriter fwrite=new FileWriter(file);
        bw=new BufferedWriter(fwrite);
    }
    public static String SingleSpaceSepration(String currentLine) {
        StringTokenizer st = new StringTokenizer(currentLine);
        StringBuilder appendedLine = new StringBuilder();
        while (st.hasMoreTokens())
            appendedLine.append(st.nextToken()).append(" ");
        return appendedLine.toString();
    }
    public static String[] ToStringAndSplit(StringBuilder SBname,String SplitWord){
        return SBname.toString().split(SplitWord);
    }
}