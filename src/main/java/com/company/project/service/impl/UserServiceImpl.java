package com.company.project.service.impl;

import com.company.project.core.ServiceException;
import com.company.project.dao.UserMapper;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

   public User get(Integer id){
       if (id==null){
           throw new ServiceException("id不能为空");
       }
        return userMapper.get(id);
    }

}
