package com.altimetrik.usermanagement.models.repository;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.models.PgPrivilegeMstr;
import com.altimetrik.usermanagement.models.PgRoleMstr;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgRolePrivilegeRepository extends JpaRepository<PgRolePrivilege, Long>{

}



