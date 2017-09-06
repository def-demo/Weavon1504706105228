package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgCandidateTestDtls;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgCandidateTestDtlsApiService {
  
      List<PgCandidateTestDtls> findAllPgCandidateTestDtls()
      throws NotFoundException;
  
      PgCandidateTestDtls updatePgCandidateTestDtls(PgCandidateTestDtls pgCandidateTestDtls)
      throws NotFoundException;
  
      PgCandidateTestDtls addPgCandidateTestDtls(PgCandidateTestDtls pgCandidateTestDtls)
      throws NotFoundException;
  
      PgCandidateTestDtls findByIdPgCandidateTestDtls(Long id)
      throws NotFoundException;
  
      void deletePgCandidateTestDtls(Long id)
      throws NotFoundException;
  
}

