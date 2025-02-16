package com.mike.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mike.curso.springboot.webapp.springbootweb.model.dto.ParamDto;
import com.mike.curso.springboot.webapp.springbootweb.model.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "hola que tal default") String message) {

        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;

    }

    @GetMapping("/bar")

    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {
        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMessage(text);

        return params;

    }

    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request){

        Integer code = 0;

        try {
            code = Integer.parseInt(request.getParameter("code"));  
        } catch (NumberFormatException e) {
            e.getMessage();
        }

        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));

        return params;


    }
}
