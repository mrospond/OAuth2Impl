package com.example.scs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.beans.IntrospectionException;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home(OAuth2AuthenticationToken token, Model model) throws IntrospectionException {

        log.info(token.getPrincipal().toString());
        log.info(token.getDetails().toString());

        model.addAttribute("principal", token.getPrincipal());
        return "home.html";
    }

}
