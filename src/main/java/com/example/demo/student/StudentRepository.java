package com.example.demo.student;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = StudentProjection.class)
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
}