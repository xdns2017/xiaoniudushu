package com.xiaoniu.cms.controller;

import com.xiaoniu.cms.common.base.DeResponse;
import com.xiaoniu.cms.model.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wzyoung on 2017/1/8.
 */
@Controller
@RequestMapping("/user")
public class UserAction {

    @RequestMapping("/login")
    @ResponseBody
    public DeResponse login(HttpServletRequest request, HttpServletResponse response) {
        DeResponse deResponse = new DeResponse();
        User user = new User();
        deResponse.setContent(user);
        System.out.println("access:" + request.getRequestURI());
        return deResponse;
    }

}
