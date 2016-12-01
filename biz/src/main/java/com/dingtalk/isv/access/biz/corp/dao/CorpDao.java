package com.dingtalk.isv.access.biz.corp.dao;

import com.dingtalk.isv.access.biz.corp.model.CorpDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("corpDao")
public interface CorpDao {


	/**
	 * 创建一个企业信息
	 * @param corpDO
	 */
	public void saveOrUpdateCorp(CorpDO corpDO);

	/**
	 * 根据corpId查询企业
	 * @param corpId
	 * @return
	 */
	public CorpDO getCorpByCorpId(@Param("corpId") String corpId);

	/**
	 * 更新日事清相关信息，例如rsq_id
	 * @param corpDO
	 * @return
	 */
	public CorpDO updateRsqInfo(CorpDO corpDO);


}

