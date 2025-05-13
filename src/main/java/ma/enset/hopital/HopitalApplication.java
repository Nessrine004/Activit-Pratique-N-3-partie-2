package ma.enset.hopital;

import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 134));
        patientRepository.save(new Patient(null, "Hanane", new Date(), false, 431));
        patientRepository.save(new Patient(null, "Imane", new Date(), true, 134));
        patientRepository.save(new Patient(null, "Yassine", new Date(), true, 342));
        patientRepository.save(new Patient(null, "Laila", new Date(), false, 123));
        System.out.println("Patients insérés : " + patientRepository.count());
    }




}

