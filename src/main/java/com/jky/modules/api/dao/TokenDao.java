package com.jky.modules.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jky.modules.api.entity.TokenEntity;
import com.jky.modules.sys.dao.BaseDao;

/**
 * 用户Token
 * 
 * @author @DT人
 * @email jky1988@qq.com
 * @date 2017-03-23 15:22:07
 */
@Mapper
public interface TokenDao extends BaseDao<TokenEntity> {
    
    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);
	
}
