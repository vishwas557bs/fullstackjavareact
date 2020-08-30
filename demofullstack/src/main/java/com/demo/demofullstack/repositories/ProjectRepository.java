package com.demo.demofullstack.repositories;

import com.demo.demofullstack.dto.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
