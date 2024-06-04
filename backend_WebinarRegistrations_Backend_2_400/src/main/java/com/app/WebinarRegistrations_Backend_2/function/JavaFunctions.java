package com.app.WebinarRegistrations_Backend_2.function;

import com.app.WebinarRegistrations_Backend_2.model.User;
import com.app.WebinarRegistrations_Backend_2.model.Webinar;
import com.app.WebinarRegistrations_Backend_2.enums.ReferenceOption;
import com.app.WebinarRegistrations_Backend_2.converter.ReferenceOptionConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.WebinarRegistrations_Backend_2.repository.UserRepository;
import com.app.WebinarRegistrations_Backend_2.repository.WebinarRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
