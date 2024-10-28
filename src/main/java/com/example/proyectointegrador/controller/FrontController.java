package com.example.proyectointegrador.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/reward")
    public String reward(){
        return "reward";
    }

    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("/shop")
    public String shop(){
        return "shop";
    }

    @GetMapping("/claims")
    public String claims(){
        return "claims";
    }

//    @GetMapping("/merch")
//    public String merch(){
//        return "merch";
//    }
//
//    @GetMapping("/packs")
//    public String packs(){
//        return "packs";
//    }
//
//    @GetMapping("/food")
//    public String food(){
//        return "food";
//    }
//
//    @GetMapping("/drinks")
//    public String drinks(){
//        return "drinks";
//    }
    //    Todavia no se si colocarlo
//    @GetMapping("/locals")
//    public String locals(){
//        return "public locals";
//    }
}
