package com.mi.module.base.service;

import com.mi.module.base.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 *
 * 博客用户; InnoDB free: 3072 kB 服务接口
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
public interface IUserService extends IService<User> {

    /**
     * 根据用户名获取用户登录信息
     * @param username
     * @return
     */
    User selectByName(String username);
}
