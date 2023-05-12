package com.github.eduardovsousa.study_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.eduardovsousa.study_thymeleaf.model.Pessoa;
import com.github.eduardovsousa.study_thymeleaf.repository.PessoaMockup;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
    	model.addAttribute("pessoa", new Pessoa());
        return "pessoa/form.html";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
    	model.addAttribute("pessoas", PessoaMockup.list());
        return "pessoa/list.html";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute Pessoa pessoa, Model model) {
    	System.out.println(pessoa.getNome());
    	
    	model.addAttribute("pessoa", new Pessoa());
        return "pessoa/list.html";
    }

}
