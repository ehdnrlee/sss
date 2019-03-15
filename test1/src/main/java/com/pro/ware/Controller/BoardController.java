package com.pro.ware.Controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pro.ware.Service.BoardService;

@Controller
public class BoardController {
		@Autowired BoardService bs;
	
	
		@RequestMapping(value="/", method= RequestMethod.GET)
		public String home(Model model) {
			System.out.println("asdfkmalskdvnklasdv");
			System.out.println(bs);
			model.addAttribute("boardList", bs.test());
			return "home";
			
		}

}

