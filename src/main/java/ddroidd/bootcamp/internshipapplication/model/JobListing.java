package ddroidd.bootcamp.internshipapplication.model;

import java.util.ArrayList;
import java.util.List;

public class JobListing {
    private static long nextUniqueId = 0;

    private long id;
    private String title;
    private String description;
    private Employer employer;
    private List<Applicant> applicantList;

    public JobListing() {
        this.id = nextUniqueId++;
        this.applicantList = new ArrayList<>();
    }

    public JobListing(String title, String description, Employer employer) {
        this();
        this.title = title;
        this.description = description;
        this.employer = employer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(List<Applicant> applicantList) {
        this.applicantList = applicantList;
    }

    @Override
    public String toString() {
        return "JobListing{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", employer=" + employer + '}';
    }
}
