package com.altimetrik.usermanagement.models.repository;

import com.altimetrik.usermanagement.models.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgRuleMstrRepository extends JpaRepository<PgRuleMstr, Long>{

}



