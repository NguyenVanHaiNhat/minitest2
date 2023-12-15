public class ProgrammingBook extends Book{
    private String lauguage;
    private String framework;

    public ProgrammingBook(int bookCode, String name, double price, String author, String lauguage, String framework) {
        super(bookCode, name, price, author);
        this.lauguage = lauguage;
        this.framework = framework;
    }

    public ProgrammingBook(String lauguage, String framework) {
        this.lauguage = lauguage;
        this.framework = framework;
    }
    public ProgrammingBook(){

    }

    public String getLauguage() {
        return lauguage;
    }

    public void setLauguage(String lauguage) {
        this.lauguage = lauguage;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
