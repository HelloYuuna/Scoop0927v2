package com.example.scoop.controller;

import com.example.scoop.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName     :Scoop
 * fileName        :MemberController
 * author          :yuuna
 * since           :2022/09/14
 */

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    /**
     * 로그인 폼으로 이동
     * 로그인 상태가 아니면 여기로 항상 이동
     * @return loginForm
     */
    @GetMapping("loginForm")
    public String gotoLogin() {
        return "/loginView/loginForm";
    }

    /**
     * 회원가입 폼으로 이동
     * @return signupForm
     */
    @GetMapping("/signupForm")
    public String gotoSignup(Model model) {

        model.addAttribute("member", new Member());
        return "/loginView/signupForm";
    }

}
