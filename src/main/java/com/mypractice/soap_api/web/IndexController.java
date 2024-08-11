//package com.mypractice.soap_api.web;
//
//import com.mypractice.soap_api.service.info.InfoService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@RequiredArgsConstructor
//@Controller
//public class IndexController {
//    private final InfoService infoService;
//
//    @GetMapping("/")
//    public @ResponseBody String index(){
//        return "hello world!!";
//    }
//
//    @GetMapping(value = "/info/{filename}", produces = MediaType.APPLICATION_XML_VALUE)
//    public @ResponseBody String getInfo(@PathVariable String filename){
//        return infoService.get(filename);
//    }
//}
