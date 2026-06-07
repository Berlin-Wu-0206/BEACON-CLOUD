package com.mashibing.webmaster.service.impl;

import com.mashibing.webmaster.entity.SmsRoleExample;
import com.mashibing.webmaster.mapper.SmsRoleMapper;
import com.mashibing.webmaster.service.SmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author zjw
 * @description
 */
@Service
public class SmsRoleServiceImpl implements SmsRoleService {

    @Resource
    private SmsRoleMapper roleMapper;

    @Override
    public Set<String> getRoleName(Integer userId) {
        Set<String> roleNameSet = roleMapper.findRoleNameByUserId(userId);
        return roleNameSet;
    }
}
