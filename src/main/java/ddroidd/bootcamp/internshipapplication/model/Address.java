package ddroidd.bootcamp.internshipapplication.model;

public class Address {
    private static long nextUniqueId = 0;

    private final long id;
    private String line1;
    private String line2;
    private String country;
    private String state;
    private String city;

    public Address() {
        this.id = nextUniqueId++;
    }

    public Address(String line1, String country, String city) {
        this();
        this.line1 = line1;
        this.country = country;
        this.city = city;
    }

    public Address(String line1, String line2, String country, String state, String city) {
        this(line1, country, city);
        this.line2 = line2;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
