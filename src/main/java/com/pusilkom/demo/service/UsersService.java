package com.pusilkom.demo.service;

import com.github.dandelion.datatables.core.ajax.DataSet;
import com.pusilkom.demo.dto.form.cmd.UsersCmd;
import com.pusilkom.demo.dto.form.search.UsersSearchForm;
import com.pusilkom.demo.dto.table.UsersItem;
import com.pusilkom.demo.model.Users;
import com.pusilkom.demo.model.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UsersService {
    @Autowired
    UsersMapper usersMapper;

    public DataSet<UsersItem> getDataSet(UsersSearchForm searchForm) {
        List<UsersItem> list = usersMapper.getListUserItemBySearchForm(searchForm);
        Long total = usersMapper.getTotalUserItemBySearchForm(searchForm);

        return new DataSet<UsersItem>(list, total, total);
    }

    @Transactional(readOnly = false)
    public void save(UsersCmd cmd) {
        Users user = cmd.toUser();
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));

        if (user.getId() == null) {
            usersMapper.insert(user);
        } else {
            usersMapper.updateByPrimaryKey(user);
        }
    }

    public UsersCmd getById(Long id) {
        Users user = usersMapper.selectByPrimaryKey(id);
        if (user == null) {
            return null;
        }
        return new UsersCmd(user);
    }

    public UsersItem getUsersItemByUsername(String username) {
        return usersMapper.getUsersItemByUsername(username);
    }
}
