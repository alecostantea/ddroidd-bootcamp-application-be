package ddroidd.bootcamp.internshipapplication.util;

import ddroidd.bootcamp.internshipapplication.data.DataStructure;
import ddroidd.bootcamp.internshipapplication.model.Address;
import ddroidd.bootcamp.internshipapplication.model.Applicant;
import ddroidd.bootcamp.internshipapplication.model.Employer;
import ddroidd.bootcamp.internshipapplication.model.JobListing;

public class DataStructureUtil {

    private static DataStructure dataStructure;

    private DataStructureUtil() {
    }

    public static DataStructure buildDataStructure() {
        if (dataStructure != null) {
            return dataStructure;
        }

        Employer google = new Employer("Google");
        Employer facebook = new Employer("Facebook");

        JobListing googleJobListing1 = new JobListing("Junior Software Developer", "junior software developer description", google);
        JobListing googleJobListing2 = new JobListing("Mid Software Developer", "mid software developer description", google);
        JobListing googleJobListing3 = new JobListing("Senior Software Developer", "senior software developer description", google);
        JobListing googleJobListing4 = new JobListing("Software Architect", "software architect description", google);

        google.getJobListings().add(googleJobListing1);
        google.getJobListings().add(googleJobListing2);
        google.getJobListings().add(googleJobListing3);
        google.getJobListings().add(googleJobListing4);

        JobListing facebookJobListing1 = new JobListing("Junior Software Developer", "junior software developer description", facebook);
        JobListing facebookJobListing2 = new JobListing("Mid Software Developer", "mid software developer description", facebook);
        JobListing facebookJobListing3 = new JobListing("Senior Software Developer", "senior software developer description", facebook);
        JobListing facebookJobListing4 = new JobListing("Software Architect", "software architect description", facebook);

        facebook.getJobListings().add(facebookJobListing1);
        facebook.getJobListings().add(facebookJobListing2);
        facebook.getJobListings().add(facebookJobListing3);
        facebook.getJobListings().add(facebookJobListing4);

        Address address1 = new Address("Line 1", "Romania", "Cluj-Napoca");
        Applicant googleApplicant1 = new Applicant("Ionut", "Popa", "0711223344", "ionutpopa@gmail.com", address1);
        googleJobListing1.getApplicantList().add(googleApplicant1);

        Address address2 = new Address("Line 1", "Romania", "Iasi");
        Applicant googleApplicant2 = new Applicant("John", "Doe", "0722665588", "johndoe@gmail.com", address2);
        googleJobListing1.getApplicantList().add(googleApplicant2);

        Address address3 = new Address("Line 1", "Romania", "Oradea");
        Applicant googleApplicant3 = new Applicant("Maria", "Pop", "0735223344", "mariapop@gmail.com", address3);
        googleJobListing1.getApplicantList().add(googleApplicant3);

        Address address4 = new Address("Line 1", "Romania", "Bucuresti");
        Applicant googleApplicant4 = new Applicant("Cristina", "Popescu", "0759223344", "cristinapopescu@gmail.com", address4);
        googleJobListing1.getApplicantList().add(googleApplicant4);

        Address address5 = new Address("Line 1", "Romania", "Timisoara");
        Applicant googleApplicant5 = new Applicant("Ana", "Ionescu", "0758223344", "anaionescu@gmail.com", address5);
        googleJobListing2.getApplicantList().add(googleApplicant5);

        Address address6 = new Address("Line 1", "Romania", "Baia Mare");
        Applicant googleApplicant6 = new Applicant("Irina", "Badea", "0756223344", "irinabadea@gmail.com", address6);
        googleJobListing2.getApplicantList().add(googleApplicant6);

        Address address7 = new Address("Line 1", "Italy", "Milano");
        Applicant googleApplicant7 = new Applicant("Maurizio", "Alberti", "0711223344", "maurizioalberti@gmail.com.com", address7);
        googleJobListing2.getApplicantList().add(googleApplicant7);

        Address address8 = new Address("Line 1", "Romania", "Brasov");
        Applicant googleApplicant8 = new Applicant("Mihai", "Petrescu", "07562236664", "mihaipetrescu@gmail.com", address8);
        googleJobListing3.getApplicantList().add(googleApplicant8);

        Address address9 = new Address("Line 1", "Romania", "Sibiu");
        Applicant googleApplicant9 = new Applicant("Horea", "Pop", "0756523344", "horeapop@gmail.com", address9);
        googleJobListing3.getApplicantList().add(googleApplicant9);

        Address address10 = new Address("Line 1", "Romania", "Constanta");
        Applicant googleApplicant10 = new Applicant("Andreea", "Nistor", "0756268344", "andreeanistor@gmail.com", address10);
        googleJobListing4.getApplicantList().add(googleApplicant10);


        Address address11 = new Address("Line 1", "Romania", "Cluj-Napoca");
        Applicant facebookApplicant1 = new Applicant("Andrei", "Nistor", "0756245644", "andreinistor@gmail.com", address11);
        facebookJobListing1.getApplicantList().add(facebookApplicant1);

        Address address12 = new Address("Line 1", "Romania", "Iasi");
        Applicant facebookApplicant2 = new Applicant("Mihai", "Pop", "0755289344", "mihaipop@gmail.com", address12);
        facebookJobListing1.getApplicantList().add(facebookApplicant2);

        Address address13 = new Address("Line 1", "Romania", "Arad");
        Applicant facebookApplicant3 = new Applicant("Ioana", "Cenan", "0756248244", "ioanacenan@gmail.com", address13);
        facebookJobListing2.getApplicantList().add(facebookApplicant3);

        Address address14 = new Address("Line 1", "Romania", "Alba-Iulia");
        Applicant facebookApplicant4 = new Applicant("Vlad", "Urcan", "0756245569", "vladurcan@gmail.com", address14);
        facebookJobListing2.getApplicantList().add(facebookApplicant4);

        Address address15 = new Address("Line 1", "Romania", "Bucuresti");
        Applicant facebookApplicant5 = new Applicant("Cristian", "Apostol", "0743245644", "cristianapostol@gmail.com", address15);
        facebookJobListing3.getApplicantList().add(facebookApplicant5);

        Address address16 = new Address("Line 1", "Romania", "Buzau");
        Applicant facebookApplicant6 = new Applicant("Ovidiu", "Popescu", "0753245234", "ovidiupopescu@gmail.com", address16);
        facebookJobListing3.getApplicantList().add(facebookApplicant6);

        Address address17 = new Address("Line 1", "Romania", "Turda");
        Applicant facebookApplicant7 = new Applicant("Teodora", "Boca", "0748245644", "teodoraboca@gmail.com", address17);
        facebookJobListing3.getApplicantList().add(facebookApplicant7);

        Address address18 = new Address("Line 1", "Romania", "Sibiu");
        Applicant facebookApplicant8 = new Applicant("Mihai", "Dan", "0756256487", "mihaidan@gmail.com", address18);
        facebookJobListing4.getApplicantList().add(facebookApplicant8);

        Address address19 = new Address("Line 1", "Romania", "Dej");
        Applicant facebookApplicant9 = new Applicant("Alina", "Neagu", "0759634824", "neagualina@gmail.com", address19);
        facebookJobListing4.getApplicantList().add(facebookApplicant9);

        Address address20 = new Address("Line 1", "Romania", "Orastie");
        Applicant facebookApplicant10 = new Applicant("Alexandru", "Popa", "0756245644", "alexandrupopa@gmail.com", address20);
        facebookJobListing4.getApplicantList().add(facebookApplicant10);

        dataStructure = new DataStructure();
        dataStructure.getEmployers().add(google);
        dataStructure.getEmployers().add(facebook);

        return dataStructure;
    }

    public static void displayDataStructure() {
        for (Employer employer : dataStructure.getEmployers()) {
            System.out.println(employer);
            for (JobListing jobListing : employer.getJobListings()) {
                System.out.println("\t" + jobListing);

                for (Applicant applicant : jobListing.getApplicantList()) {
                    System.out.println("\t\t" + applicant);
                }
            }
        }
    }
}
