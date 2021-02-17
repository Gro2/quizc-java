package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class OnlyUperCaseValidator implements Validator{

	private static final String ERROR_MESSAGE = "The text must be written in capital letters";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
     
            if(!(value.equals(value.toUpperCase())))                 
            errors.add(ERROR_MESSAGE);
       
    }

}
