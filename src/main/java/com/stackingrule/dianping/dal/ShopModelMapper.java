package com.stackingrule.dianping.dal;

import com.stackingrule.dianping.model.ShopModel;

import java.util.List;

public interface ShopModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbg.generated Tue Jan 28 11:50:23 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbg.generated Tue Jan 28 11:50:23 CST 2020
     */
    int insert(ShopModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbg.generated Tue Jan 28 11:50:23 CST 2020
     */
    int insertSelective(ShopModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbg.generated Tue Jan 28 11:50:23 CST 2020
     */
    ShopModel selectByPrimaryKey(Integer id);

    List<ShopModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbg.generated Tue Jan 28 11:50:23 CST 2020
     */
    int updateByPrimaryKeySelective(ShopModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbg.generated Tue Jan 28 11:50:23 CST 2020
     */
    int updateByPrimaryKey(ShopModel record);
}