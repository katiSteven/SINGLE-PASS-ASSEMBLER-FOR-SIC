package SIC;
import java.io.IOException;
import java.text.DecimalFormat;
public class Result {
    static String[] SymInOrderArray;        //to store the symbol address location in order of declaration
    static int endingAddress = 3 + Integer.parseInt(SymTab.allAddressArray[SymTab.allAddressArray.length-1]);   //calculating the ending address
    public static void Start(String resultFileLocation) throws IOException{
        String result;
        StringBuilder TProgram = new StringBuilder();
        StringBuilder symAddressSB = new StringBuilder();
        String Header = "H^" + SymTab.programName + "^" + SymTab.startingAddress + "^" + Integer.toHexString((endingAddress-SymTab.startingAddress)) ;
        String THead = "T^" + new DecimalFormat("000000").format(SymTab.startingAddress) + "^" + Integer.toHexString((endingAddress-SymTab.startingAddress));
        String End = "E^" + new DecimalFormat("000000").format(SymTab.startingAddress);
        for(int i=0;;i++){
            if(Input.Program[i].equals("END"))
                break;
            if(SymTab.SymMatcher(Input.Program[i]) && !SymTab.DataTypeChecker(Input.Program[i+1])){
                for(int j=0;j<SymTab.symAddressArray.length;j++){
                    if(SymTab.symAddressArray[j].contains(Input.Program[i]))
                        symAddressSB.append(SymTab.symAddressArray[j+1]).append(" ");
                }
            }
        }
        SymInOrderArray = Ex6Methods.ToStringAndSplit(symAddressSB, " ");
        for(int i=0;i<OpTab.OpcodeInOrderArray.length;i++)
            TProgram.append("^").append(OpTab.OpcodeInOrderArray[i]).append(SymInOrderArray[i]);
        result = Header + System.getProperty("line.separator") + THead + TProgram + System.getProperty("line.separator") + End;
        Ex6Methods.WriteFile(resultFileLocation, result);
    }
}