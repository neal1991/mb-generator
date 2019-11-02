package com.doctor.mybatisdemo.dao;

import com.doctor.mybatisdemo.domain.user;
import com.doctor.mybatisdemo.domain.userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    int countByExample(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    int deleteByExample(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    int insert(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    int insertSelective(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    List<user> selectByExample(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    user selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") user record, @Param("example") userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    int updateByExample(@Param("record") user record, @Param("example") userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    int updateByPrimaryKeySelective(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 31 20:32:51 CST 2019
     */
    int updateByPrimaryKey(user record);
}