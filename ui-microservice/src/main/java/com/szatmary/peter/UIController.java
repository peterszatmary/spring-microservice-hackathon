package com.szatmary.peter;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by peterszatmary on 06/05/2017.
 */
@Controller
@RequestMapping("/")
public class UIController {

    @RequestMapping(value = "/")
    public String index(Map<String, Object> model) {
        return "index";
    }
}