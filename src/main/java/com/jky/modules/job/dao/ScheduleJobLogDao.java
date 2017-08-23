package com.jky.modules.job.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jky.modules.job.entity.ScheduleJobLogEntity;
import com.jky.modules.sys.dao.BaseDao;

/**
 * 定时任务日志
 * 
 * @author @DT人
 * @email jky1988@qq.com
 * @date 2016年12月1日 下午10:30:02
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
