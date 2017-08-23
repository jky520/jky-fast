package com.jky.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jky.modules.sys.entity.SysRoleEntity;

import java.util.List;

/**
 * 角色管理
 * 
 * @author @DT人
 * @email jky1988@qq.com
 * @date 2016年9月18日 上午9:33:33
 */
@Mapper
public interface SysRoleDao extends BaseDao<SysRoleEntity> {
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
