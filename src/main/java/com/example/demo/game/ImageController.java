package com.example.demo.game;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ImageController {

	@GetMapping("/")
	public String getIndex() {
		return "image";
	}

	@RequestMapping("/getImg")
	@ResponseBody
	public HttpEntity<byte[]> getImg(@RequestParam("name") String fileName){
		File fileImg = new File("img/"+ fileName +".png");

		byte[] byteImg = null;
		HttpHeaders headers = null;
		try {
			//バイト列に変換
			byteImg = Files.readAllBytes(fileImg.toPath());
			headers = new HttpHeaders();

			//Responseのヘッダーを作成
			headers.setContentType(MediaType.IMAGE_PNG);
			headers.setContentLength(byteImg.length);
		}catch(IOException e) {
			return null;
		}
		return new HttpEntity<byte[]>(byteImg,headers);
	}
}
