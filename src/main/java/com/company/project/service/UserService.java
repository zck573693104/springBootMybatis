package com.company.project.service;
import com.company.project.model.User;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2017/07/04.
 */
public interface UserService extends Service<User> {

		User get(Integer id);
}
