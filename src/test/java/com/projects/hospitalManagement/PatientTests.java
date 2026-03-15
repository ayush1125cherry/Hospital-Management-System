package com.projects.hospitalManagement;

import com.projects.hospitalManagement.Repository.PatientRepository;
import com.projects.hospitalManagement.Service.PatientService;
import com.projects.hospitalManagement.entity.Patient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatientRepository() {

        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);

    }
    @Test
    public void testTransactionMethod(){
//    Patient patient= patientService.getPatientById(1L);
//
//        System.out.println(patient);

//        Patient patient= patientRepository.getPatientByName("Aarav Sharma");
//        System.out.println(patient);



        List<Patient> patientList =
                patientRepository.getPatientByDobOrEmail(
                        LocalDate.of(1995,8,20),"aarav.sharma@example.com");

       for(Patient patient: patientList ){
           System.out.println(patient);
       }


    }

}