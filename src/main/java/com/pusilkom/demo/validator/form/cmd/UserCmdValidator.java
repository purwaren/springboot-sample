package com.pusilkom.demo.validator.form.cmd;

import com.pusilkom.demo.dto.form.cmd.UserCmd;
import com.pusilkom.demo.util.ValidatorUtil;
import com.pusilkom.demo.util.ValidatorWebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author Sumayyah
 */
@Component
public class UserCmdValidator implements Validator {
    @Autowired
    ValidatorWebUtil validatorWebUtil;
    @Autowired
    ValidatorUtil validatorUtil;

    @Override
    public boolean supports(Class<?> type) {
        return UserCmd.class.isAssignableFrom(type);
    }
    
    @Override
    public void validate(Object o, Errors errors) {
        UserCmd cmd = (UserCmd) o;

        validatorWebUtil.validateNotBlank("username", errors, cmd.getUsername());
        validatorWebUtil.validateNotDuplicate("username", errors, cmd);
        validatorWebUtil.validateNotBlank("password", errors, cmd.getPassword());
        validatorWebUtil.validateNotBlank("role", errors, cmd.getRole());
        validatorWebUtil.validateNotBlank("idInstitusi", errors, cmd.getIdInstitusi());
    }
     
}
