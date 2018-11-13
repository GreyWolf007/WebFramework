package com.wolf.web.common.controller;

import com.wolf.web.common.domain.dto.TestUserDto;
import com.wolf.web.common.exception.GlobalExceptionHandler;
import com.wolf.web.common.service.TestUserService;
import com.wolf.web.common.util.JsonResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: GreyWolf
 * @create: 2018/11/13 09:29
 **/
@Controller
@RequestMapping("/test")
public class TestController {
    private static Logger logger = LogManager.getLogger(TestController.class);


    @Autowired
    private TestUserService testUserService;

    @RequestMapping("/t1")
    @ResponseBody
    public Object t1() throws Exception {
        if (Math.abs(1) > 0)
            throw new Exception("kkk哈哈哈");
        return "中文chinese";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object list() {
        return new JsonResult(0, "successful!", this.testUserService.list());
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Object insert(TestUserDto user) {
        int r = this.testUserService.insert(user);
        return new JsonResult(0, "successful!", user);
    }

    @RequestMapping("/load")
    @ResponseBody
    public Object load(int id, String name) {
        return new JsonResult(0, "successful!", this.testUserService.load(id, name));
    }

    @RequestMapping("/update")
    @ResponseBody
    public Object update(TestUserDto user) {
        try {
            int r = this.testUserService.update(user);
            return new JsonResult(0, "successful!", user);
        } catch (Exception e) {
            logger.error("发生异常", e);
            return new JsonResult(-1, "失败:" + e.getMessage());
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(int id) {
        return new JsonResult(0, "successful!", this.testUserService.delete(id));
    }
}
