package com.mashibing.test.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zjw
 * @description
 */
public interface ClientBalanceMapper {

    @Select("select balance from client_balance where client_id = #{clientId}")
    Long findByClientId(@Param("clientId")Long clientId);

}
