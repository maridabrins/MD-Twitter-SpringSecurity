package com.auth.springsecurity.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.springsecurity.model.Roles;



public interface RolesRepository extends JpaRepository<Roles,Long>{
 

}
