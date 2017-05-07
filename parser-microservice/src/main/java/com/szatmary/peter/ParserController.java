package com.szatmary.peter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by peterszatmary on 06/05/2017.
 */
@RestController
public class ParserController {

    @Value("${site.to.parse}")
    private String siteToParse;

    @Autowired
    private WordGroupCount wordGroupCount;


    @RequestMapping(value = "/about")
    public @ResponseBody String about() {

        return String.format("Going to parse site = %s spark counted %s word groups.",
                siteToParse, wordGroupCount.get());
    }
}