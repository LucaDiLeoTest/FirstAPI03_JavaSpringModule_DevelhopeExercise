package co.develhope.FirstAPI03.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class StringController {


    @GetMapping("/concatenation")
    public String getConcatenation(@RequestParam String s1, @RequestParam(required = false) String s2){
      if(s2==null){
          return s1;
      }else{
          return s1+s2;
      }
    }
}
