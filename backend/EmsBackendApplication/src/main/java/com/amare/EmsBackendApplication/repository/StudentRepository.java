package com.amare.EmsBackendApplication.repository;
import com.amare.EmsBackendApplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
