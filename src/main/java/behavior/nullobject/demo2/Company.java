package behavior.nullobject.demo2;

import java.util.Optional;

public class Company {
    private String name;
    private Optional<Office> office;

    public Company(String name, Optional<Office> office) {
        this.name = name;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public Optional<Office> getOffice() {
        return office;
    }
}
