package com.itheima.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.itheima.dao.Result;
import com.itheima.dao.User;
import com.itheima.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/user")
@Api(value = "user",tags = "获取用户信息")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据id获取用户信息")
    @RequestMapping(value = "/getUserById" , method = {RequestMethod.GET})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",dataType = "string",defaultValue = "1")
    })
    @ResponseBody
    public JSONObject getUserById(String id){
        JSONObject jsonObject = new JSONObject();
        try {
            List<User> list = userService.getUserById(id);
            jsonObject.put("data",list);
            jsonObject.put("code",200);
        } catch (Exception e) {
            jsonObject.put("code",400);
            e.printStackTrace();
        }
        return jsonObject;
    }

    @ApiOperation(value = "根据id获取用户信息2")
    @RequestMapping(value = "/getUserById2" , method = {RequestMethod.GET})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",dataType = "string",defaultValue = "1")
    })
    @ResponseBody
    public List<User> getUserById2(String id){
        return userService.getUserById(id);
    }
}
