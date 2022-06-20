package com.wondong.halre.wondonghalre.repository;

import com.wondong.halre.wondonghalre.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
