/**
 * packageName :  com.example.jenkinstest
 * fileName : HelloController
 * author :  ichunghui
 * date : 12/22/23
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 12/22/23                ichunghui             최초 생성
 */

package com.example.jenkinstest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello", "hello-jenkins");
        System.out.println("test-hi");
        return "hello";
    }
}

