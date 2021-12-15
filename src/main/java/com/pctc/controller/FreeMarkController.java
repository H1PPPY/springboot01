package com.pctc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author H1PPPY
 * @date 2021/10/25 16:57
 */
@Controller
public class FreeMarkController {
    @RequestMapping("page")
    public String page(Map<String, Object> map) {
        map.put("hello", "大家好");
        return "indexpage";
    }
}
