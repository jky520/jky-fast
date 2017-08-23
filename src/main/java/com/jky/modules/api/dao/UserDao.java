package com.jky.modules.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jky.modules.api.entity.UserEntity;
import com.jky.modules.sys.dao.BaseDao;

/**
 * 用户
 * 
 * @author @DT人
 * @email jky1988@qq.com
 * @date 2017-03-23 15:22:06
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
