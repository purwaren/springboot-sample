package com.pusilkom.demo.model.mapper;

import com.pusilkom.demo.dto.form.search.UserSearchForm;
import com.pusilkom.demo.dto.table.UserItem;
import com.pusilkom.demo.dto.view.UserDetail;
import com.pusilkom.demo.model.User;
import com.pusilkom.demo.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User, Long, UserExample> {
//    @Select("Select * from User where id_institusi = #{idInstitusi} Limit 1")
//    @ResultMap("UserDetailResultMap")
//    UserDetail getUserDetailbyIdInstitusi (@Param("idInstitusi") Long idInstitusi);

    //untuk menampilkan datatable
    List<UserItem> getListUserItemBySearchForm(@Param("searchForm") UserSearchForm searchForm);
    Long getTotalUserItemBySearchForm(@Param("searchForm") UserSearchForm searchForm);
}
