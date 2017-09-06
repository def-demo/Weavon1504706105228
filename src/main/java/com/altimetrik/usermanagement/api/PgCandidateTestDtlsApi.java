package com.altimetrik.usermanagement.api;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.api.service.PgCandidateTestDtlsApiService;

import com.altimetrik.usermanagement.exception.NotFoundException;

import com.altimetrik.usermanagement.models.PgCandidateTestDtls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class PgCandidateTestDtlsApi {

   @Autowired
   private PgCandidateTestDtlsApiService service;
  

  @RequestMapping(value = "/pg_candidate_test_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgCandidateTestDtls>> findAllPgCandidateTestDtls()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgCandidateTestDtls>>(service.findAllPgCandidateTestDtls(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_candidate_test_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgCandidateTestDtls> updatePgCandidateTestDtls(@RequestBody PgCandidateTestDtls pgCandidateTestDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgCandidateTestDtls>(service.updatePgCandidateTestDtls(pgCandidateTestDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_candidate_test_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgCandidateTestDtls> addPgCandidateTestDtls(@RequestBody PgCandidateTestDtls pgCandidateTestDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgCandidateTestDtls>(service.addPgCandidateTestDtls(pgCandidateTestDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_candidate_test_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgCandidateTestDtls> findByIdPgCandidateTestDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgCandidateTestDtls>(service.findByIdPgCandidateTestDtls(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_candidate_test_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgCandidateTestDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgCandidateTestDtls(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

