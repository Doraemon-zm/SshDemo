package com.zm.service;

import com.zm.dao.UserDao;
import com.zm.pojo.ExamEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/15.
 */
@Service
@Transactional
public class UserService {
    @Resource
    private UserDao userDao;

    public ExamEntity show(){
        ExamEntity examEntity = userDao.show();
        return examEntity;
    }

}
