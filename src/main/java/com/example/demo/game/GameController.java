package com.example.demo.game;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

	//6-1-3ログイン画面のGET用コントローラー
	@GetMapping("/scroll")
	public String getLogin(Model model) {

		//6-1-3login.htmlに画面遷移
		return "game/scroll";
	}
}
