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

@Entity(name = "Webinar")
@Table(name = "\"Webinar\"", schema =  "\"webinarregistrations_backend_2\"")
@Data
                        
public class Webinar {
	public Webinar () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"WebinarId\"", nullable = true )
  private Integer webinarId;
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"Description\"", nullable = true )
  private String description;
  
	  
  @Column(name = "\"InvitationLink\"", nullable = true )
  private String invitationLink;
  
	  
  @Column(name = "\"Topics\"", nullable = true )
  private String topics;
  
	  
  @Column(name = "\"Speaker\"", nullable = true )
  private String speaker;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Webinar [" 
  + "WebinarId= " + webinarId  + ", " 
  + "Name= " + name  + ", " 
  + "Description= " + description  + ", " 
  + "InvitationLink= " + invitationLink  + ", " 
  + "Topics= " + topics  + ", " 
  + "Speaker= " + speaker 
 + "]";
	}
	
}