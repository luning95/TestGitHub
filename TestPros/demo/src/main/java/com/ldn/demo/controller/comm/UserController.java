package com.ldn.demo.controller.comm;

import com.ldn.demo.domain.UserPojo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/user")
public class UserController {

    @RequestMapping("/getuser")
    public UserPojo getUser(@RequestParam String uid) {
        UserPojo userPojo = new UserPojo();
        userPojo.setUid(1);
        userPojo.setUage(18);
        userPojo.setUname("ning");
        userPojo.setUsex(true);
        return userPojo;
    }
}
