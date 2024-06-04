package com.app.WebinarRegistrations_Backend_2.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum ReferenceOption{
	    Email,
	    SocialMedia,
	    Website,
	    Referral,
	    Others; 
    public int value(ReferenceOption referenceOption) {
        return referenceOption.ordinal();
    }
    public static ReferenceOption getReferenceOption(int ordinal) {
        for(ReferenceOption referenceOption : ReferenceOption.values())
                if(referenceOption.ordinal() == ordinal)
                        return referenceOption;
        return null;
    }
}


