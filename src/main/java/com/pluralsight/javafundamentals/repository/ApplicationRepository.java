package com.pluralsight.javafundamentals.repository;

import com.pluralsight.javafundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
