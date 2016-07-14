package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.repositories.*;
import com.example.entities.*;

@RestController
public class Controller {
	@Autowired
	EpisodeRepository episodeRepository;
	@RequestMapping("/greeting")
	public @ResponseBody Episode greeting() {

		Episode e = episodeRepository.findOneById(2);
		return e;
    }

}
