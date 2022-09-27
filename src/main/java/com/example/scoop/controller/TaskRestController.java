package com.example.scoop.controller;

import com.example.scoop.config.auth.dto.SessionUser;
import com.example.scoop.domain.Project;
import com.example.scoop.domain.Task;
import com.example.scoop.domain.User;
import com.example.scoop.service.TaskService;
import com.example.scoop.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * projectName     :Scoop
 * fileName        :TaskRestController
 * author          :yuuna
 * since           :2022/09/23
 */

@Controller
@ResponseBody
@RequestMapping("/task")
@RequiredArgsConstructor
@Slf4j
public class TaskRestController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private UserService userService;

    @PostMapping("insertTask")
    public int insertTask(Task task) {
        log.debug("모달창에서 입력받은 내용: {}", task);




        return 0;
    }
}
