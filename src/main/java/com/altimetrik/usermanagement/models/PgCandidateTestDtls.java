package com.altimetrik.usermanagement.models;

import com.altimetrik.usermanagement.models.PgScheduleCandidateDtls;

import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class PgCandidateTestDtls  {
  
  
   
  
  @Id
   
  
  private Long candidateTestDtlsId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "SCHEDULE_CANDIDATE_ID", insertable=false, updatable=false) 
  
  private PgScheduleCandidateDtls pgScheduleCandidateDtls = null;
  
   
   
  
  private String testStatus = null;
  
   
   
  
  private String completionMode = null;
  
   
   
  
  private Integer totalMarks = null;
  
   
   
  
  private Double percentile = null;
  
   
   
  
  private String pdfReport = null;
  
   
   
  
  private String htmlReport = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getCandidateTestDtlsId() {
    return candidateTestDtlsId;
  }
  public void setCandidateTestDtlsId(Long candidateTestDtlsId) {
    this.candidateTestDtlsId = candidateTestDtlsId;
  }

  
  /**
   * {"foreignKeyColumn":"SCHEDULE_CANDIDATE_ID","relation":"OneToOne"}
   **/
  public PgScheduleCandidateDtls getPgScheduleCandidateDtls() {
    return pgScheduleCandidateDtls;
  }
  public void setPgScheduleCandidateDtls(PgScheduleCandidateDtls pgScheduleCandidateDtls) {
    this.pgScheduleCandidateDtls = pgScheduleCandidateDtls;
  }

  
  /**
   * {}
   **/
  public String getTestStatus() {
    return testStatus;
  }
  public void setTestStatus(String testStatus) {
    this.testStatus = testStatus;
  }

  
  /**
   * {}
   **/
  public String getCompletionMode() {
    return completionMode;
  }
  public void setCompletionMode(String completionMode) {
    this.completionMode = completionMode;
  }

  
  /**
   * {}
   **/
  public Integer getTotalMarks() {
    return totalMarks;
  }
  public void setTotalMarks(Integer totalMarks) {
    this.totalMarks = totalMarks;
  }

  
  /**
   * {}
   **/
  public Double getPercentile() {
    return percentile;
  }
  public void setPercentile(Double percentile) {
    this.percentile = percentile;
  }

  
  /**
   * {}
   **/
  public String getPdfReport() {
    return pdfReport;
  }
  public void setPdfReport(String pdfReport) {
    this.pdfReport = pdfReport;
  }

  
  /**
   * {}
   **/
  public String getHtmlReport() {
    return htmlReport;
  }
  public void setHtmlReport(String htmlReport) {
    this.htmlReport = htmlReport;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgCandidateTestDtls pgCandidateTestDtls = (PgCandidateTestDtls) o;
    return Objects.equals(candidateTestDtlsId, pgCandidateTestDtls.candidateTestDtlsId) &&
        Objects.equals(pgScheduleCandidateDtls, pgCandidateTestDtls.pgScheduleCandidateDtls) &&
        Objects.equals(testStatus, pgCandidateTestDtls.testStatus) &&
        Objects.equals(completionMode, pgCandidateTestDtls.completionMode) &&
        Objects.equals(totalMarks, pgCandidateTestDtls.totalMarks) &&
        Objects.equals(percentile, pgCandidateTestDtls.percentile) &&
        Objects.equals(pdfReport, pgCandidateTestDtls.pdfReport) &&
        Objects.equals(htmlReport, pgCandidateTestDtls.htmlReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateTestDtlsId, pgScheduleCandidateDtls, testStatus, completionMode, totalMarks, percentile, pdfReport, htmlReport);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgCandidateTestDtls {\n");
    
    sb.append("  candidateTestDtlsId: ").append(candidateTestDtlsId).append("\n");
    sb.append("  pgScheduleCandidateDtls: ").append(pgScheduleCandidateDtls).append("\n");
    sb.append("  testStatus: ").append(testStatus).append("\n");
    sb.append("  completionMode: ").append(completionMode).append("\n");
    sb.append("  totalMarks: ").append(totalMarks).append("\n");
    sb.append("  percentile: ").append(percentile).append("\n");
    sb.append("  pdfReport: ").append(pdfReport).append("\n");
    sb.append("  htmlReport: ").append(htmlReport).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

