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
public class ParserController {

    @Value("${site.to.parse}")
    private String siteToParse;


    @RequestMapping(value = "/about")
    public @ResponseBody String about() {
        return String.format("Microservice will parse site = {}", siteToParse);
    }
}