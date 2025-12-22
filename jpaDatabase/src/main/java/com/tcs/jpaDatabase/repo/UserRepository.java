package com.tcs.jpaDatabase.repo;

import com.tcs.jpaDatabase.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
