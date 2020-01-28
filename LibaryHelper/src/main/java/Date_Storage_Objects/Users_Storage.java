package Date_Storage_Objects;

public class Users_Storage {
    private int id;
    private String first_name;
    private String last_name;
    private int PESEL_number;
    private String added_date;

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getPESEL_number() {
        return PESEL_number;
    }

    public String getAdded_date() {
        return added_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPESEL_number(int PESEL_number) {
        this.PESEL_number = PESEL_number;
    }

    public void setAdded_date(String added_date) {
        this.added_date = added_date;
    }
}
