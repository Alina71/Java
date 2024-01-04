package Class21;
interface FileReader{
    public void read();
}
//Created by Microsoft
public class ExcelFile implements FileReader {
    @Override
    public void read() {
        System.out.println("Reading an Excel file.");
    }
}
//created by NotePad++
class TxtFile implements FileReader{
    @Override
    public void read() {
        System.out.println("Reading an Text file.");
    }
}