package com.example.videoconferencia.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class InicioController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/video")
    public String videoconferencia(){
        return "reunion";
    }

}
