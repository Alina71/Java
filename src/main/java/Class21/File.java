package Class21;
/*
Create a class File that will have the following behaviors:
 open(), edit(), close() and fields like name and size.
  Edit and close are implemented method while open is an abstract.
   Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide
    specific implementation of open behaviour:
     Example: to open .java file we need notepad++ or sublime text,
      to open .doc file we need Microsoft word to be installed etc.
      Create a tester
 class and call all of the methods from these classes.
 */
public abstract class File {
    private String name;
    private double size;

    public abstract void open();
    public void edit(){
        System.out.println("You have edit your "+name);
    }
    public void close(){
        System.out.println("Please close your file");
    }
    public File(String name,double size){
        this.name=name;
        this.size=size;

    }
}
class JavaFile extends File{
    public JavaFile(String name, double size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("To open .java file we need notepad");
    }

    @Override
    public void edit() {
        super.edit();
    }

    @Override
    public void close() {
        super.close();
        System.out.println("*******************");
    }

}
class WordFile extends File{
    public WordFile(String name, double size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("To open .doc file we need Microsoft word to be installed etc");
    }

    @Override
    public void edit() {
        super.edit();
    }

    @Override
    public void close() {
        super.close();
        System.out.println("*******************");
    }

}
class PdFile extends File{
    public PdFile(String name, double size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("To open .doc file we need Microsoft");
    }

    @Override
    public void edit() {
        super.edit();
    }

    @Override
    public void close() {
        super.close();
    }

}