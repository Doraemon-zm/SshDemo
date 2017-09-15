package com.zm.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.zm.pojo.ExamEntity;
import com.zm.service.UserService;
import org.hibernate.criterion.Example;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/15.
 */
@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<ExamEntity>{

    @Resource
    private UserService userService;
    public String show(){
        ExamEntity examEntity = userService.show();
        ActionContext.getContext().getValueStack().set("user" , examEntity);
        return "show";
    }


    //模型驱动
    private ExamEntity examEntity = new ExamEntity();
    public ExamEntity getModel() {
        return examEntity;
    }
}
