package com.example.emailconfiguration.controller;

import com.example.emailconfiguration.model.Email;
import com.example.emailconfiguration.service.LanguagesService;
import com.example.emailconfiguration.service.PageSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {
    @Autowired
    private final LanguagesService languagesService = new LanguagesService();
    private final PageSizeService pageSizeService = new PageSizeService();



    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("email", new Email());
        model.addAttribute("languages", languagesService.findAll());
        model.addAttribute("pageSizes", pageSizeService.findAll());
        return "create";
    }

    @PostMapping("/save")
    public String saveConfig(@ModelAttribute("email") Email email, Model model) {
        // Lưu lại cấu hình email (ở đây có thể lưu vào database hoặc session tùy ý)
        model.addAttribute("email", email);
        return "info";
    }
}
