package com.pusilkom.demo.service;

import com.github.dandelion.datatables.core.ajax.DataSet;
import com.pusilkom.demo.dto.form.cmd.UserCmd;
import com.pusilkom.demo.dto.form.search.InstitusiSearchForm;
import com.pusilkom.demo.dto.form.search.UserSearchForm;
import com.pusilkom.demo.dto.table.UserItem;
import com.pusilkom.demo.model.User;
import com.pusilkom.demo.model.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserService {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserMapper userMapper;

    public User getById (Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void saveCmd (UserCmd userCmd){
//      boolean isNew = (userCmd.getId() == null);


        this.save(userCmd.toUser());

    }

    @Transactional
    public void save (User user){
        if(user.getId() == null){
            userMapper.insert(user);
        } else {
            userMapper.updateByPrimaryKey(user);
        }
    }

    public DataSet<UserItem> getDataSet(UserSearchForm searchForm) {
        List<UserItem> listItem = userMapper.getListUserItemBySearchForm(searchForm);
        Long totalItemFiltered = userMapper.getTotalUserItemBySearchForm(searchForm);
        Long totalItem = totalItemFiltered;

        return new DataSet<UserItem>(listItem, totalItem, totalItemFiltered);
    }
}
