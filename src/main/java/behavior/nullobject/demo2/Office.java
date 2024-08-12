package behavior.nullobject.demo2;


import java.util.Optional;

public class Office {
    private String id;
    private Optional<Address> address;

    public String getId() {
        return id;
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public Office(String id, Optional<Address> address) {
        this.id = id;
        this.address = address;
    }
}
