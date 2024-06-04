package com.app.WebinarRegistrations_Backend_2.function;

import com.app.WebinarRegistrations_Backend_2.model.User;
import com.app.WebinarRegistrations_Backend_2.model.Webinar;




import com.app.WebinarRegistrations_Backend_2.enums.ReferenceOption;
import com.app.WebinarRegistrations_Backend_2.converter.ReferenceOptionConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  