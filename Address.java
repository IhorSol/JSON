package XML.HomeWork.Task1.task2;

/**
 * @author Ihor Solohub.
 */
public class Address {
    public String country;
    public String city;
    public String street;

    public Address(){}

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

