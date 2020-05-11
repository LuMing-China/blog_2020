package com.lrm.web;

import com.lrm.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shkstart
 * @date 2020/4/30 - 15:11
 */
@Controller
public class IndexController {

    @GetMapping("/")//{id}/{name}
    public String index(){//@PathVariable Integer id, @PathVariable String name
//        int i = 9/0;
//        String blog = null;
//        if(blog==null){
//            throw  new NotFoundException("博客不存在");
//        }
//        System.out.println("--------index----------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

}