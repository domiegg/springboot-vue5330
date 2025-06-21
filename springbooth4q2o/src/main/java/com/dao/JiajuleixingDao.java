package com.dao;

import com.entity.JiajuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiajuleixingVO;
import com.entity.view.JiajuleixingView;


/**
 * 家具类型
 * 
 * @author 
 * @email 
 * @date 2022-03-27 14:06:04
 */
public interface JiajuleixingDao extends BaseMapper<JiajuleixingEntity> {
	
	List<JiajuleixingVO> selectListVO(@Param("ew") Wrapper<JiajuleixingEntity> wrapper);
	
	JiajuleixingVO selectVO(@Param("ew") Wrapper<JiajuleixingEntity> wrapper);
	
	List<JiajuleixingView> selectListView(@Param("ew") Wrapper<JiajuleixingEntity> wrapper);

	List<JiajuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<JiajuleixingEntity> wrapper);
	
	JiajuleixingView selectView(@Param("ew") Wrapper<JiajuleixingEntity> wrapper);
	

}
