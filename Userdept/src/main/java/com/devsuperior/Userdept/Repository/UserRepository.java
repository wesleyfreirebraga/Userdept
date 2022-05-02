package com.devsuperior.Userdept.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.Userdept.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
