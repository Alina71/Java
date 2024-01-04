package Class21;

public class FileTester {
    public static void main(String[] args) {

        File []array={new JavaFile("Notepad",5),
                new PdFile("Pdf",8)};
        for (int i=0; i< array.length; i++){

            File f=array[i];
            f.edit();
            f.open();
            f.close();
        }

    }
}
