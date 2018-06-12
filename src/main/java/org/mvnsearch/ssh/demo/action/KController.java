package org.mvnsearch.ssh.demo.action;

import org.mvnsearch.ssh.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/get-test")
    public Model test() {
        Model model = new Model();
        model.b += userService.toString();
        return model;
    }

    public static class Model {
        public int a = 7;
        public String b = "abc ";
    }

}

