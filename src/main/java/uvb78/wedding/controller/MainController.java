package uvb78.wedding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LiYangpan on 2018/5/29  下午9:28.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
@Controller
public class MainController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }
}
