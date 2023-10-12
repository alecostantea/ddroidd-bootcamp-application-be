package ddroidd.bootcamp.internshipapplication;

import ddroidd.bootcamp.internshipapplication.data.DataStructure;
import ddroidd.bootcamp.internshipapplication.model.Applicant;
import ddroidd.bootcamp.internshipapplication.model.Employer;
import ddroidd.bootcamp.internshipapplication.model.JobListing;
import ddroidd.bootcamp.internshipapplication.service.ApplicantService;
import ddroidd.bootcamp.internshipapplication.service.EmployerService;
import ddroidd.bootcamp.internshipapplication.service.JobListingService;
import ddroidd.bootcamp.internshipapplication.util.DataStructureUtil;

import java.util.List;
import java.util.Set;

public class InternshipApplication {

    public static void main(String[] args) {

        ApplicantService applicantService = new ApplicantService();
        EmployerService employerService = new EmployerService();
        JobListingService jobListingService = new JobListingService();

        //build the data structure
        DataStructure dataStructure = DataStructureUtil.buildDataStructure();
        List<Employer> employers = dataStructure.getEmployers();

        //add 2 new Job Listings for both Employers
        for (Employer employer : employers) {
            JobListing jobListing1 = employerService.createJobListing(employer, "Mid Automation Engineer", "description for automation engineer");
            JobListing jobListing2 = employerService.createJobListing(employer, "Senior Data Engineer", "description for data engineer");

            //add 5 applicants to the newly created Job Listing
            applicantService.apply(jobListing1, "Alexandra", "Popa", "0756258963", "alexandrapopa@gmail.com", "adresa", "", "Romania", "", "Cluj-Napoca");
            applicantService.apply(jobListing1, "Mihai", "Serban", "0756556963", "mihaiserban@gmail.com", "adresa", "", "Romania", "", "Oradea");
            applicantService.apply(jobListing2, "Ilinca", "Muresan", "0756234985", "ilincamuresan@gmail.com", "adresa", "", "Romania", "", "Cluj-Napoca");
            applicantService.apply(jobListing2, "Patricia", "Popa", "0756258778", "patriciapopa@gmail.com", "adresa", "", "Romania", "", "Iasi");
            applicantService.apply(jobListing2, "Anca", "Daniel", "0736958963", "ancadaniel@gmail.com", "adresa", "", "Romania", "", "Brasov");
        }

        //display the data structure
        DataStructureUtil.displayDataStructure();

        //display all Job Listings for an Employer
        Employer google = employers.get(0);
        System.out.println("\n Displaying all job listings for employer " + google.getName());
        employerService.displayJobListings(google);

        //display all applicants for an Employer
        Employer employer1 = employers.get(1);
        Set<Applicant> applicantsForEmployer = employerService.getAllApplicants(employer1);
        System.out.println("\n Displaying all applicants for employer " + employer1.getName());
        for (Applicant applicant : applicantsForEmployer) {
            System.out.println(applicant);
        }

        //display all applicants for a Job Listing
        JobListing jobListing = google.getJobListings().get(0);
        System.out.println("\n Displaying all applicants for job listing " + jobListing.getTitle());
        List<Applicant> applicantList = jobListingService.getApplicantList(jobListing);
        for (Applicant applicant : applicantList) {
            System.out.println(applicant);
        }

        //delete a job listing
        JobListing jobListing1 = google.getJobListings().get(0);
        employerService.deleteJobListing(jobListing1);
        System.out.println("\n Displaying all job listings for employer " + google.getName());
        employerService.displayJobListings(google);

    }

}
