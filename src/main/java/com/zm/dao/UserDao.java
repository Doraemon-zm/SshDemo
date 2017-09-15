package com.zm.dao;

import com.zm.pojo.ExamEntity;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/15.
 */
@Repository
public class UserDao {
    //注入HibernateTemplate对象
    @Resource
    private HibernateTemplate template;
    public ExamEntity show(){
        ExamEntity examEntity = template.get(ExamEntity.class, 2);
        return examEntity;
    }
}
