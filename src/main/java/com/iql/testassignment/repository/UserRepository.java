package com.iql.testassignment.repository;

import com.iql.testassignment.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    @Override
    Optional<UserEntity> findById(Long id);
}
