package com.pusilkom.demo.service;

import com.pusilkom.demo.dto.form.cmd.UserCmd;
import com.pusilkom.demo.model.User;
import com.pusilkom.demo.model.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


}
