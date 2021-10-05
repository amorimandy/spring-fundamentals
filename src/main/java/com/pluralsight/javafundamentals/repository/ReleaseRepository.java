package com.pluralsight.javafundamentals.repository;

import com.pluralsight.javafundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
