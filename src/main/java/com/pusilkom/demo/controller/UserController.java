package com.pusilkom.demo.controller;

import com.pusilkom.demo.dto.form.cmd.UserCmd;
import com.pusilkom.demo.dto.form.search.UserSearchForm;
import com.pusilkom.demo.util.DebugUtil;
import com.pusilkom.demo.util.RestValidatorUtil;
import com.pusilkom.demo.validator.form.cmd.UserCmdValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;

import javax.validation.Valid;

@Controller
public class UserController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    final static String ERROR_MSG = "Failed to process";

    @Autowired
    UserCmdValidator userCmdValidator;

    @Autowired
    DebugUtil d;
    @Autowired
    RestValidatorUtil rv;

    @InitBinder("UserCmd")
    protected void registerUserCmdValidator(WebDataBinder binder) {
        binder.setValidator(userCmdValidator);
    }

    @InitBinder("UserSearchForm")
    protected void registerUserSearchFormValidator(WebDataBinder binder){

    }


    @GetMapping("/username")
    public String indexGet (@Valid UserSearchForm userSearchForm, BindingResult result, Model uiModel){
        if (result.hasErrors()) {
            return "username/list";
        }

        return "username/list";
    }

    @GetMapping("/username/add")
    public String getUsernameAdd (Model uiModel){
        UserCmd userCmd = new UserCmd();
        uiModel.addAttribute("userCmd", userCmd);

        return "username/add";
    }

}