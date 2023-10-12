package ddroidd.bootcamp.internshipapplication.data;

import ddroidd.bootcamp.internshipapplication.model.Employer;

import java.util.ArrayList;
import java.util.List;

public class DataStructure {

    private List<Employer> employers;

    public DataStructure() {
        this.employers = new ArrayList<>();
    }

    public List<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(List<Employer> employers) {
        this.employers = employers;
    }
}
