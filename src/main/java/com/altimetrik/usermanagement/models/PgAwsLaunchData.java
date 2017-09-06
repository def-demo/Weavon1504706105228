package com.altimetrik.usermanagement.models;

import com.altimetrik.usermanagement.models.PgUserInfoDtls;

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

public class PgAwsLaunchData  {
  
  
   
  
  @Id
   
  
  private Long launchId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "USER_INFO_DTLS_ID", insertable=false, updatable=false) 
  
  private PgUserInfoDtls pgUserInfoDtls = null;
  
   
   
  
  private String adId = null;
  
   
   
  
  private String awsLnk = null;
  
   
   
  
  private String registrationCode = null;
  
   
   
  
  private String workspaceId = null;
  
   
   
  
  private String state = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getLaunchId() {
    return launchId;
  }
  public void setLaunchId(Long launchId) {
    this.launchId = launchId;
  }

  
  /**
   * {"foreignKeyColumn":"USER_INFO_DTLS_ID","relation":"OneToOne"}
   **/
  public PgUserInfoDtls getPgUserInfoDtls() {
    return pgUserInfoDtls;
  }
  public void setPgUserInfoDtls(PgUserInfoDtls pgUserInfoDtls) {
    this.pgUserInfoDtls = pgUserInfoDtls;
  }

  
  /**
   * {}
   **/
  public String getAdId() {
    return adId;
  }
  public void setAdId(String adId) {
    this.adId = adId;
  }

  
  /**
   * {}
   **/
  public String getAwsLnk() {
    return awsLnk;
  }
  public void setAwsLnk(String awsLnk) {
    this.awsLnk = awsLnk;
  }

  
  /**
   * {}
   **/
  public String getRegistrationCode() {
    return registrationCode;
  }
  public void setRegistrationCode(String registrationCode) {
    this.registrationCode = registrationCode;
  }

  
  /**
   * {}
   **/
  public String getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  
  /**
   * {}
   **/
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgAwsLaunchData pgAwsLaunchData = (PgAwsLaunchData) o;
    return Objects.equals(launchId, pgAwsLaunchData.launchId) &&
        Objects.equals(pgUserInfoDtls, pgAwsLaunchData.pgUserInfoDtls) &&
        Objects.equals(adId, pgAwsLaunchData.adId) &&
        Objects.equals(awsLnk, pgAwsLaunchData.awsLnk) &&
        Objects.equals(registrationCode, pgAwsLaunchData.registrationCode) &&
        Objects.equals(workspaceId, pgAwsLaunchData.workspaceId) &&
        Objects.equals(state, pgAwsLaunchData.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchId, pgUserInfoDtls, adId, awsLnk, registrationCode, workspaceId, state);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgAwsLaunchData {\n");
    
    sb.append("  launchId: ").append(launchId).append("\n");
    sb.append("  pgUserInfoDtls: ").append(pgUserInfoDtls).append("\n");
    sb.append("  adId: ").append(adId).append("\n");
    sb.append("  awsLnk: ").append(awsLnk).append("\n");
    sb.append("  registrationCode: ").append(registrationCode).append("\n");
    sb.append("  workspaceId: ").append(workspaceId).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

