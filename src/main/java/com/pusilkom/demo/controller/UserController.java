package com.pusilkom.demo.controller;

import com.github.dandelion.datatables.core.ajax.DataSet;
import com.github.dandelion.datatables.core.ajax.DatatablesCriterias;
import com.github.dandelion.datatables.core.ajax.DatatablesResponse;
import com.pusilkom.demo.dto.form.cmd.UserCmd;
import com.pusilkom.demo.dto.form.search.InstitusiSearchForm;
import com.pusilkom.demo.dto.form.search.UserSearchForm;
import com.pusilkom.demo.dto.table.UserItem;
import com.pusilkom.demo.service.UserService;
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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class UserController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    final static String ERROR_MSG = "Failed to process";

    @Autowired
    UserCmdValidator userCmdValidator;
    @Autowired
    UserService userService;

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

    @PostMapping("/username/add")
    public String postUsernameAdd (@Valid UserCmd userCmd, BindingResult result, RedirectAttributes attributes){
        if (result.hasErrors()) {
            return "username/add";
        }

        try {
            userService.saveCmd(userCmd);
        } catch (Exception e) {
            attributes.addFlashAttribute("ERROR", "Gagal tambah user");
            return "redirect:/username";
        }

        attributes.addFlashAttribute("SUCCESS", "Berhasil tambah user");
        return "redirect:/username";
    }

    @RequestMapping(value = "/username/table", method = RequestMethod.POST)
    @ResponseBody
    public DatatablesResponse<UserItem> postTableSearch(UserSearchForm searchForm, HttpServletRequest httpServletRequest) {

        DatatablesCriterias criterias = DatatablesCriterias.getFromRequest(httpServletRequest);
        searchForm.setCriterias(criterias);

        DataSet<UserItem> dataSet = null;
        try {
            log.info(">>> searchForm : {}", d.toString(searchForm));

            dataSet = userService.getDataSet(searchForm);

        } catch (Exception e) {
            log.error("TABLE USER : ", e);

        }

        return DatatablesResponse.build(dataSet, criterias);
    }
}
