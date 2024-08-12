package behavior.nullobject.demo2;

import java.util.Optional;

public class Address {
    private Optional<String> street;
    private Optional<String> city;

    public Address(Optional<String> street, Optional<String> city) {
        this.street = street;
        this.city = city;
    }

    public Optional<String> getStreet() {
        return street;
    }

    public Optional<String> getCity() {
        return city;
    }
}
