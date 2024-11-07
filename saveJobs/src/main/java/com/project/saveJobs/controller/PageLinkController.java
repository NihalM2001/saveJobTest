package com.project.saveJobs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageLinkController {

    @RequestMapping("/")
    public String helloWWorld()
    {
        return "index";
    }
}
