package com.app.WebinarRegistrations_Backend_2.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.WebinarRegistrations_Backend_2.model.User;
import com.app.WebinarRegistrations_Backend_2.model.Webinar;
import com.app.WebinarRegistrations_Backend_2.enums.ReferenceOption;
import com.app.WebinarRegistrations_Backend_2.converter.ReferenceOptionConverter;
import com.app.WebinarRegistrations_Backend_2.converter.DurationConverter;
import com.app.WebinarRegistrations_Backend_2.converter.UUIDToByteConverter;
import com.app.WebinarRegistrations_Backend_2.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "User")
@Table(name = "\"User\"", schema =  "\"webinarregistrations_backend_2\"")
@Data
                        
public class User {
	public User () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"UserId\"", nullable = true )
  private Long userId;
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"Email\"", nullable = true )
  private String email;
  
	  
  @Column(name = "\"PhoneNumber\"", nullable = true )
  private String phoneNumber;
  
	  
  @Column(name = "\"JobTitle\"", nullable = true )
  private String jobTitle;
  
	  
  @Column(name = "\"Company\"", nullable = true )
  private String company;
  
	  
  @Column(name = "\"Industry\"", nullable = true )
  private String industry;
  
	  
  @Column(name = "\"Reference\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = ReferenceOptionConverter.class)
  private ReferenceOption reference;
  
	  
  @Column(name = "\"HopeToLearn\"", nullable = true )
  private String hopeToLearn;
  
	  
  @Column(name = "\"Questions\"", nullable = true )
  private String questions;
  
	  
  @Column(name = "\"ConsentForFutureCommunication\"", nullable = true )
  private Boolean consentForFutureCommunication;
  
	  
  @Column(name = "\"AgreeToTermsAndCondition\"", nullable = true )
  private Boolean agreeToTermsAndCondition;
  
	  
  @Column(name = "\"Country\"", nullable = true )
  private String country;
  
	  
  @Column(name = "\"TimeZone\"", nullable = true )
  private String timeZone;
  
	  
  @Column(name = "\"LikeToReceiveInformation\"", nullable = true )
  private Boolean likeToReceiveInformation;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"UserPlannedWebinar\"", referencedColumnName = "\"WebinarId\"", insertable = false, updatable = false)
	private Webinar plannedWebinar;
	
	@Column(name = "\"UserPlannedWebinar\"")
	private Integer userPlannedWebinar;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "User [" 
  + "UserId= " + userId  + ", " 
  + "Name= " + name  + ", " 
  + "Email= " + email  + ", " 
  + "PhoneNumber= " + phoneNumber  + ", " 
  + "JobTitle= " + jobTitle  + ", " 
  + "Company= " + company  + ", " 
  + "Industry= " + industry  + ", " 
  + "Reference= " + reference  + ", " 
  + "HopeToLearn= " + hopeToLearn  + ", " 
  + "Questions= " + questions  + ", " 
  + "ConsentForFutureCommunication= " + consentForFutureCommunication  + ", " 
  + "AgreeToTermsAndCondition= " + agreeToTermsAndCondition  + ", " 
  + "Country= " + country  + ", " 
  + "TimeZone= " + timeZone  + ", " 
  + "LikeToReceiveInformation= " + likeToReceiveInformation 
 + "]";
	}
	
}