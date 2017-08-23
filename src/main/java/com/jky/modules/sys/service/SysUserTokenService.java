package com.jky.modules.sys.service;

import com.jky.common.utils.R;
import com.jky.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 * 
 * @author @DT人
 * @email jky1988@qq.com
 * @date 2017-03-23 15:22:07
 */
public interface SysUserTokenService {

	SysUserTokenEntity queryByUserId(Long userId);

	SysUserTokenEntity queryByToken(String token);
	
	void save(SysUserTokenEntity token);
	
	void update(SysUserTokenEntity token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

}
