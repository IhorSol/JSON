package XML.HomeWork.Task1.task2;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ihor Solohub.
 */
public class PersonalInfo {
    public String name;
    public String surname;
    public List<String> phones;
    public List<String> sites;
    public Address address;

    public PersonalInfo(){}

    public PersonalInfo(String name, String surname, List<String> phones, List<String> sites, Address address) {
        this.name = name;
        this.surname = surname;
        this.phones = phones;
        this.sites = sites;
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + Arrays.deepToString(phones.toArray()) +
                ", sites=" + Arrays.deepToString(sites.toArray()) +
                ", address=" + address +
                '}';
    }
}
