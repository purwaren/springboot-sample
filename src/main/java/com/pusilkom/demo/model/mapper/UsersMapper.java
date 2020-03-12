package com.pusilkom.demo.model.mapper;

import com.pusilkom.demo.dto.form.search.UsersSearchForm;
import com.pusilkom.demo.dto.table.UsersItem;
import com.pusilkom.demo.model.Users;
import com.pusilkom.demo.model.UsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper extends BaseMapper<Users, Long, UsersExample> {
    List<UsersItem> getListUserItemBySearchForm(@Param("searchForm") UsersSearchForm searchForm);
    Long getTotalUserItemBySearchForm(@Param("searchForm") UsersSearchForm searchForm);
    UsersItem getUsersItemByUsername(@Param("username") String username);
}
