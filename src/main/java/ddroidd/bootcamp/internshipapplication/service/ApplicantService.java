package ddroidd.bootcamp.internshipapplication.service;

import ddroidd.bootcamp.internshipapplication.model.Address;
import ddroidd.bootcamp.internshipapplication.model.Applicant;
import ddroidd.bootcamp.internshipapplication.model.JobListing;

public class ApplicantService {

    public void apply(JobListing jobListing, String firstName, String lastName,
                      String phoneNumber, String email, String addressLine1,
                      String addressLine2, String country,
                      String state, String city) {
        if (jobListing == null) {
            System.out.println("Could not apply for a job listing. [jobListing] parameter is null");
            return;
        }

        if (firstName == null || firstName.isBlank() ||
                lastName == null || lastName.isBlank() ||
                phoneNumber == null || phoneNumber.isBlank() ||
                email == null || email.isBlank()) {
            System.out.println("Invalid fields for contact information. Please provide valid values for the fields");
            return;
        }

        if (addressLine1 == null || addressLine1.isBlank() ||
                country == null || country.isBlank() ||
                city == null || city.isBlank()) {
            System.out.println("Invalid fields for address. Please provide valid values for the fields");
            return;
        }

        Address address = new Address(addressLine1, addressLine2, country, state, city);
        Applicant applicant = new Applicant(firstName, lastName, phoneNumber, email, address);
        jobListing.getApplicantList().add(applicant);
    }
}
