//package com.example.proyectointegrador.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RequestMapping ("/v1")
//@RequiredArgsConstructor
//@RestController
//public class HomeController {
//
//    @GetMapping("/home")
//    public String home() {
//        return "Private home";
//    }
//
//    @GetMapping("/admin")
//    @PreAuthorize("hasAuthority('ADMIN')")
//    public String admin() {
//        return "Admin";
//    }
//}
