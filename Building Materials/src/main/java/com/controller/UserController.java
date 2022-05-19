package com.controller;

import com.dao.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session){
        String username = user.getUsername();
        String password = user.getPassword();
        try {
            User user1 =userMapper.selectUser(username);
            if(user1.getPassword().equals(password)){
                session.setAttribute("loginuser",user1);
                return "redirect:home";
            }
            else{
                model.addAttribute("msg","密码错误");
            }
        } catch (Exception e) {
            model.addAttribute("msg","请输入账号密码");
        }
        return "login";
    }
@RequestMapping("home")
    public String zhuyemian (){
        return "home";
}

    /*注册*/
    @RequestMapping("/register")
    public String sign(User user,Model model,HttpSession session){
        User user1=null;
        String username = user.getUsername();
        String password= user.getPassword();

        Integer phonenumber = user.getPhonenumber();
        String email = user.getEmail();
        if(username!="" && password!="" && email!=""&&username!=null&&password!=null&&phonenumber!=null&&email!=null){

            try{
                user1 = userMapper.selectUser(username);
                System.out.println("注册失败");
            }catch (NullPointerException e){
                System.out.println("数据库里没有，可以注册");


            } if (user1 == null) {
                userMapper.insertUser(user);
            }
        }
        else{
            model.addAttribute("msg","不能为空，请输入内容");

        }
        return "register";
    }

}