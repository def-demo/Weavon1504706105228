package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgCandidateTestDtls;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgCandidateTestDtlsApiServiceImpl implements PgCandidateTestDtlsApiService {
		  	  
	  @Autowired
	
  	  private PgCandidateTestDtlsRepository  pgCandidateTestDtlsRepository ;
	   
  
  
				
			
      @Override
      public List<PgCandidateTestDtls> findAllPgCandidateTestDtls()
      throws NotFoundException {
      
        
  		
  		
  			return pgCandidateTestDtlsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgCandidateTestDtls updatePgCandidateTestDtls(PgCandidateTestDtls pgCandidateTestDtls)
      throws NotFoundException {
      
         
        	return pgCandidateTestDtlsRepository.save(pgCandidateTestDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgCandidateTestDtls addPgCandidateTestDtls(PgCandidateTestDtls pgCandidateTestDtls)
      throws NotFoundException {
      
         
        	return pgCandidateTestDtlsRepository.save(pgCandidateTestDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgCandidateTestDtls findByIdPgCandidateTestDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgCandidateTestDtlsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgCandidateTestDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

