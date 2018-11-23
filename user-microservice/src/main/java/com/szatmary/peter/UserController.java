package com.szatmary.peter;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peterszatmary on 06/05/2017.
 */
@RestController
public class UserController {

    @Value("${admin.name}")
    private String adminName;

    @Value("${admin.surname}")
    private String adminSurname;

    @Value("${admin.role}")
    private String adminRole;

    @Value("${superuser.name}")
    private String superUserName;

    @Value("${superuser.surname}")
    private String superUserSurname;

    @Value("${superuser.role}")
    private String superUserRole;

    @RequestMapping(value = "/users")
    public @ResponseBody  List<User> showSystemUsers() {
        List<User> result = new ArrayList<>();
        result.add(new User(adminName, adminSurname, adminRole));
        result.add(new User(superUserName, superUserSurname, superUserRole));
        return result;
    }
}