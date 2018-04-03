package ua.vn.os.jenkinsintro;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RequestMapping(path = "jenkins")
public class JenkinsController {

    @GetMapping(path = "version")
    @ResponseBody
    public String jenkinsVersion() {
        return "2.107.1";
    }
}
