package com.jky.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jky.modules.sys.entity.SysUserTokenEntity;

/**
 * 系统用户Token
 * 
 * @author @DT人
 * @email jky1988@qq.com
 * @date 2017-03-23 15:22:07
 */
@Mapper
public interface SysUserTokenDao extends BaseDao<SysUserTokenEntity> {
    
    SysUserTokenEntity queryByUserId(Long userId);

    SysUserTokenEntity queryByToken(String token);
	
}
