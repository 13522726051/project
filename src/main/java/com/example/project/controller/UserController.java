package com.example.project.controller;
import com.example.project.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description ="用户管理API")
@RestController("/hello")
public class UserController {

    @ApiOperation("添加用户")
    @PostMapping("/add")
    public User add(@ApiParam("用户名") String username, @ApiParam("密码") String password){

        return new User();
    }

    @ApiOperation("修改用户")
    @RequestMapping("/update")
    public String update(){
        return "修改";
    }

    @ApiOperation("删除用户")
    @RequestMapping("/delete")
    public Boolean delete(@ApiParam("用户编号") Integer id){
        return true;

    }

    @ApiOperation("查询用户")
    @RequestMapping("/query")
    public User query(){

        User user = new User();
        user.setUsername("jack");
        user.setPassword("1234");

        return user;
    }
}
//add1