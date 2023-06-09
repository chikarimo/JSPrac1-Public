package com.example.demo.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	//6-1-3ログイン画面のGET用コントローラー
	@GetMapping("/login")
	public String getLogin(Model model) {

		//6-1-3login.htmlに画面遷移
		return "login/login";
	}

	//6-1-3ログイン画面のPOST用コントローラー
	@PostMapping("/login")
	public String postLogin(Model model) {

		//6-1-3login.htmlに画面遷移
		//return "login/login";
		//8-2-2ホーム画面に遷移
		return "redirect:/home";
	}
}
