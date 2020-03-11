package com.pusilkom.demo.controller;

import com.github.dandelion.datatables.core.ajax.DataSet;
import com.github.dandelion.datatables.core.ajax.DatatablesCriterias;
import com.github.dandelion.datatables.core.ajax.DatatablesResponse;
import com.pusilkom.demo.dto.form.cmd.InstitusiCmd;
import com.pusilkom.demo.dto.form.cmd.UsersCmd;
import com.pusilkom.demo.dto.form.search.UsersSearchForm;
import com.pusilkom.demo.dto.table.UsersItem;
import com.pusilkom.demo.model.Users;
import com.pusilkom.demo.service.UsersService;
import com.pusilkom.demo.util.DebugUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class UsersController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DebugUtil d;

    @Autowired
    UsersService usersService;

    @GetMapping(value = "/admin/users")
    public String getAdminUsers(@Valid UsersSearchForm searchForm, BindingResult result) {
        return "admin/users/list";
    }

    @RequestMapping(value = "/admin/users/table", method = RequestMethod.POST)
    @ResponseBody
    public DatatablesResponse<UsersItem> postAdminUsersTable(UsersSearchForm searchForm, HttpServletRequest request) {
        DatatablesCriterias criterias = DatatablesCriterias.getFromRequest(request);
        searchForm.setCriterias(criterias);

        DataSet<UsersItem> dataSet = null;
        try {
            dataSet = usersService.getDataSet(searchForm);
        } catch (Exception e) {
            log.error("TABLE USER : ", e);
        }

        return DatatablesResponse.build(dataSet, criterias);
    }

    @GetMapping(value = "/admin/users/add")
    public String getAdminUsersAdd(Model model) {
        model.addAttribute("cmd", new UsersCmd());
        return "admin/users/add";
    }

    @PostMapping(value = "/admin/users/add")
    public String postAdminUsersAdd(@Valid UsersCmd cmd, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            return "admin/users/add";
        }

        try {
            usersService.save(cmd);
        } catch (Exception e) {
            attributes.addFlashAttribute("ERROR", "Gagal tambah user");
            return "redirect:/admin/users";
        }

        attributes.addFlashAttribute("SUCCESS", "Berhasil tambah user");
        return "redirect:/admin/users";
    }

    @GetMapping(value = "/admin/users/edit/{id}")
    public String editGet(@PathVariable Long id, Model model, RedirectAttributes attributes) {
        UsersCmd cmd = usersService.getById(id);
        if (cmd == null) {
            attributes.addFlashAttribute("ERROR", "User tidak ditemukan");
            return "redirect:/admin/users";
        }

        model.addAttribute("cmd", cmd);
        return "/admin/users/edit";
    }
}
