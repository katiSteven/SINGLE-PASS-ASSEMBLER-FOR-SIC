package SIC;
import java.io.IOException;
public class SICAssembler {
    public static void main(String[] args) throws IOException  {
        
        //Replace the below file locations with your own text file locations.
        
        Input.Start("D:\\collegeDocuments\\LabExperiments\\GitHub-Projects\\SINGLE PASS ASSEMBLER FOR SIC\\SINGLE-PASS-ASSEMBLER-FOR-SIC\\src\\Files\\SICInput.txt");   //getting SIC assembly program.
        OpTab.Start("D:\\collegeDocuments\\LabExperiments\\GitHub-Projects\\SINGLE PASS ASSEMBLER FOR SIC\\SINGLE-PASS-ASSEMBLER-FOR-SIC\\src\\Files\\Optab.txt");      //getting the operator table.
        SymTab.Start("D:\\collegeDocuments\\LabExperiments\\GitHub-Projects\\SINGLE PASS ASSEMBLER FOR SIC\\SINGLE-PASS-ASSEMBLER-FOR-SIC\\src\\Files\\Symtab.txt");    //getting the location for storing symbol table.
        Result.Start("D:\\collegeDocuments\\LabExperiments\\GitHub-Projects\\SINGLE PASS ASSEMBLER FOR SIC\\SINGLE-PASS-ASSEMBLER-FOR-SIC\\src\\Files\\Result.txt");    //getting the location for storing the intermediate object code
    }
}