package com.jky.modules.oss.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jky.modules.oss.entity.SysOssEntity;
import com.jky.modules.sys.dao.BaseDao;

/**
 * 文件上传
 * 
 * @author @DT人
 * @email jky1988@qq.com
 * @date 2017-03-25 12:13:26
 */
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
