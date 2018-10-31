package com.sk.learn.recruitingapp.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sk on 27/08/17.
 */
@RestController
public class RecruitingResource {

    @RequestMapping(value = "/reports")
    public String available() {
        return "Recruiting reports";
    }

}
