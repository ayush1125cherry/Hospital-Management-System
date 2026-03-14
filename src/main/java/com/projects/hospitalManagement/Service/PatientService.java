package com.projects.hospitalManagement.Service;

import com.projects.hospitalManagement.Repository.PatientRepository;
import com.projects.hospitalManagement.entity.Patient;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

@Transactional
public class PatientService {

    public final PatientRepository patientRepository;

    public Patient getPatientById(Long id){

        Patient p1 = patientRepository.findById(id).orElseThrow();

        Patient p2 = patientRepository.findById(id).orElseThrow();

        return p1;

    }
}
