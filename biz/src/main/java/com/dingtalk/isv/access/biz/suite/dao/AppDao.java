package com.dingtalk.isv.access.biz.suite.dao;

import com.dingtalk.isv.access.biz.suite.model.AppDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("appDao")
public interface AppDao {


	/**
	 * 创建一个套件
	 * @param appDO
	 */
	public void addApp(AppDO appDO);

	/**
	 * 根据suiteKey查询为应用
	 * @param suiteKey
	 * @return
	 */
	public List<AppDO> getAppBySuiteKey(@Param("suiteKey") String suiteKey);


    /**
     * 根据appId查询为应用
     * @param appId
     * @return
     */
    public AppDO getAppByAppId(@Param("appId") Long appId);


}

