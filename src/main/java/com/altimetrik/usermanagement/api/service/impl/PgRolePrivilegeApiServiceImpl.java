package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgRolePrivilege;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgRolePrivilegeApiServiceImpl implements PgRolePrivilegeApiService {
		  	  
	  @Autowired
	
  	  private PgRolePrivilegeRepository  pgRolePrivilegeRepository ;
	   
  
  
				
			
      @Override
      public List<PgRolePrivilege> findAllPgRolePrivilege()
      throws NotFoundException {
      
        
  		
  		
  			return pgRolePrivilegeRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRolePrivilege updatePgRolePrivilege(PgRolePrivilege pgRolePrivilege)
      throws NotFoundException {
      
         
        	return pgRolePrivilegeRepository.save(pgRolePrivilege);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRolePrivilege addPgRolePrivilege(PgRolePrivilege pgRolePrivilege)
      throws NotFoundException {
      
         
        	return pgRolePrivilegeRepository.save(pgRolePrivilege);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRolePrivilege findByIdPgRolePrivilege(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgRolePrivilegeRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgRolePrivilege(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

