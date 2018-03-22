package SIC;
import java.io.FileNotFoundException;
import java.io.IOException;
public class OpTab {
    static String[] mnemonicsAndOpcode;         //STORES MNEUMONICS & OPCODE FROM Optab.txt
    static String[] OpcodeInOrderArray;       //to store every Opcode by splitting the OpcodeInOrderSB string builder in the SYMTAB CLASS
    static StringBuilder OpcodeInOrderSB = new StringBuilder();     //will sppend when OpcodeMatcher is called from the SymTab class & send as a splitting parameter from the SymTab class
    public static void Start(String optabFileLocation) throws FileNotFoundException, IOException {
        StringBuilder OpcodeInALine = new StringBuilder();
        String currentLine;
        Ex6Methods.ReadFile(optabFileLocation);
        while((currentLine = Ex6Methods.GetLine())!= null)
            OpcodeInALine.append(Ex6Methods.SingleSpaceSepration(currentLine));
        mnemonicsAndOpcode = Ex6Methods.ToStringAndSplit(OpcodeInALine, " ");
    }
    public static boolean OpcodeMatcher(String Opcode){
        for(int i=0;i<mnemonicsAndOpcode.length;i++){
            if(mnemonicsAndOpcode[i].equals(Opcode)){
                OpcodeInOrderSB.append(mnemonicsAndOpcode[i+1]).append(" ");
                return true;
            }
        }
        return false;
    }
}