package com.elend.spider.common.mapper;

import java.util.List;

import com.elend.p2p.mapper.SqlMapper;
import com.elend.spider.common.vo.AntiSpiderBlackListSearchVO;
import com.elend.spider.common.model.AntiSpiderBlackListPO;

public interface AntiSpiderBlackListMapper extends SqlMapper {

    /**
     * 根据搜索条件返回列表
     * 
     * @param svo
     * @return
     */
    List<AntiSpiderBlackListPO> list(AntiSpiderBlackListSearchVO svo);

    /**
     * 根据搜索条件返回列表总数
     * 
     * @param svo
     * @return
     */
    int count(AntiSpiderBlackListSearchVO svo);

    /**
     * 根据主键id获取单条记录
     * 
     * @param id
     * @return
     */
    AntiSpiderBlackListPO get(int id);

    /**
     * 插入记录
     * 
     * @param vo
     */
    void insert(AntiSpiderBlackListPO po);

    /**
     * 更新记录
     * 
     * @param vo
     */
    void update(AntiSpiderBlackListPO po);

    /**
     * 根据主键id删除记录
     * 
     * @param id
     */
    void delete(int id);

    /**
     * 根据ip删除
     * @param ip
     */
    int deleteByIp(String ip);

}
