package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Enrollment;
import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository  extends JpaRepository<Enrollment, EnrollmentPK> {
}
