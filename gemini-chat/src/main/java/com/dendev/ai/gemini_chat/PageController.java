package com.dendev.ai.gemini_chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String showQnAForm() {
        return "qna"; // Loads qna.html
    }
}
