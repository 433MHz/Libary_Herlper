package Date_Storage_Objects;

public class Books_Storage {
    private int id;
    private String title;
    private String author_first_name;
    private String author_last_name;
    private String printer;
    private String create_year;
    private int ISBN_number;
    private String added_date;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public String getPrinter() {
        return printer;
    }

    public String getCreate_year() {
        return create_year;
    }

    public int getISBN_number() {
        return ISBN_number;
    }

    public String getAdded_date() {
        return added_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public void setCreate_year(String create_year) {
        this.create_year = create_year;
    }

    public void setISBN_number(int ISBN_number) {
        this.ISBN_number = ISBN_number;
    }

    public void setAdded_date(String added_date) {
        this.added_date = added_date;
    }
}
