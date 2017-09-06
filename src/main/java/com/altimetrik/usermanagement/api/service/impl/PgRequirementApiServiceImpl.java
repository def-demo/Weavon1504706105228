package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgRequirement;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgRequirementApiServiceImpl implements PgRequirementApiService {
		  	  
	  @Autowired
	
  	  private PgRequirementRepository  pgRequirementRepository ;
	   
  
  
				
			
      @Override
      public List<PgRequirement> findAllPgRequirement()
      throws NotFoundException {
      
        
  		
  		
  			return pgRequirementRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRequirement updatePgRequirement(PgRequirement pgRequirement)
      throws NotFoundException {
      
         
        	return pgRequirementRepository.save(pgRequirement);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRequirement addPgRequirement(PgRequirement pgRequirement)
      throws NotFoundException {
      
         
        	return pgRequirementRepository.save(pgRequirement);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRequirement findByIdPgRequirement(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgRequirementRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgRequirement(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

