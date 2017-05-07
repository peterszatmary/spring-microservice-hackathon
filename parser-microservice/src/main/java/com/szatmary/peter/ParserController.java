package com.szatmary.peter;


import com.szatmary.peter.obj.WordCountObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


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
        return String.format("Going to parse site = %s and parse word group counts.",
                siteToParse);
    }

    @RequestMapping(value = "/group-words", method = RequestMethod.POST)
    public @ResponseBody WordCountObj groupWords(@RequestBody String inputToParse) {
        return wordGroupCount.get(inputToParse);
    }
}