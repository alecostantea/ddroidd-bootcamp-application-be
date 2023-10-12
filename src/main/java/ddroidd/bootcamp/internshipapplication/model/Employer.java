package ddroidd.bootcamp.internshipapplication.model;

import java.util.ArrayList;
import java.util.List;

public class Employer {
    private static long nextUniqueId = 0;

    private final long id;
    private String name;
    private List<JobListing> jobListings;

    public Employer() {
        this.id = nextUniqueId++;
        this.jobListings = new ArrayList<>();
    }

    public Employer(String name) {
        this();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobListing> getJobListings() {
        return jobListings;
    }

    public void setJobListings(List<JobListing> jobListings) {
        this.jobListings = jobListings;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' + '}';
    }
}
