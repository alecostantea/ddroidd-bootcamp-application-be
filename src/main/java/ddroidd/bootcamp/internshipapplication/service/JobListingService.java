package ddroidd.bootcamp.internshipapplication.service;

import ddroidd.bootcamp.internshipapplication.model.Applicant;
import ddroidd.bootcamp.internshipapplication.model.JobListing;

import java.util.List;

public class JobListingService {

    public List<Applicant> getApplicantList(JobListing jobListing) {
        return jobListing.getApplicantList();
    }
}
