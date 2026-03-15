package com.projects.hospitalManagement.Repository;

import com.projects.hospitalManagement.entity.Patient;
import com.projects.hospitalManagement.entity.type.BloodGroupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient getPatientByName(String name);
    List<Patient> getPatientByDobOrEmail(LocalDate DOB , String email);


    @Query("select p from Patient p where p.bloodGroup = ?1")
    List<Patient> findByBloodGroup(BloodGroupType bloodGroup);

    @Query("select p from Patient p where p.dob > :dob")
    List<Patient> findByBornAfterDate(@Param("dob") LocalDate dob);

}
