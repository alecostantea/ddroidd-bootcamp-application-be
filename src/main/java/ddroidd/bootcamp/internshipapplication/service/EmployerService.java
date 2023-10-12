package ddroidd.bootcamp.internshipapplication.service;

import ddroidd.bootcamp.internshipapplication.model.Applicant;
import ddroidd.bootcamp.internshipapplication.model.Employer;
import ddroidd.bootcamp.internshipapplication.model.JobListing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployerService {

    public JobListing createJobListing(Employer employer, String title, String description) {
        if (employer == null) {
            System.out.println("Employer parameter is null. Please provide a non null value.");
            return null;
        }

        if (title == null || title.isBlank()) {
            System.out.println("Invalid [title]. Please provide a non empty value for it.");
            return null;
        }

        if (description == null || description.isBlank()) {
            System.out.println("Invalid [description]. Please provide a non empty value for it.");
            return null;
        }

        JobListing jobListing = new JobListing(title, description, employer);
        employer.getJobListings().add(jobListing);
        System.out.println("Job listing added successfully: " + jobListing);
        return jobListing;
    }

    public void displayJobListings(Employer employer) {
        List<JobListing> jobListings = employer.getJobListings();
        for (JobListing jobListing : jobListings) {
            System.out.println(jobListing);
        }
    }

    public Set<Applicant> getAllApplicants(Employer employer) {
        List<JobListing> jobListings = employer.getJobListings();
        Set<Applicant> applicants = new HashSet<>();
        for (JobListing jobListing : jobListings) {
            List<Applicant> applicantList = jobListing.getApplicantList();
            applicants.addAll(applicantList);
        }
        return applicants;
    }

    public void deleteJobListing(JobListing jobListing) {
        Employer employer = jobListing.getEmployer();
        List<JobListing> jobListings = employer.getJobListings();
        jobListings.remove(jobListing);
    }
}
