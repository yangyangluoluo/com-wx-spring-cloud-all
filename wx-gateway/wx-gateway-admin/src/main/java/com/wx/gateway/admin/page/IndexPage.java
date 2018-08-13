package com.wx.gateway.admin.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/12
 * @time: 下午5:59
 * @description : 启动的页面
 */
@Controller
public class IndexPage {

    @RequestMapping("/")
    public  String getIndex(){

        return "/index";
    }
}
