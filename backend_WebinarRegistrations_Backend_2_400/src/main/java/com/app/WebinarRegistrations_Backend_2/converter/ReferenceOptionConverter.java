package com.app.WebinarRegistrations_Backend_2.converter;

import com.app.WebinarRegistrations_Backend_2.enums.ReferenceOption;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class ReferenceOptionConverter implements AttributeConverter<ReferenceOption, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ReferenceOption referenceOption) {
        return referenceOption != null ? referenceOption.ordinal() : null;
    }

    @Override
    public ReferenceOption convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return ReferenceOption.getReferenceOption(dbData);
    }
}
