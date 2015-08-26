package com.isea533.mybatis.mapper;

import com.isea533.mybatis.model.UserLoginInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user login info
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("username") String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user login info
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    int insert(UserLoginInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user login info
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    UserLoginInfo selectByPrimaryKey(@Param("id") Integer id, @Param("username") String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user login info
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    List<UserLoginInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user login info
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    int updateByPrimaryKey(UserLoginInfo record);
}