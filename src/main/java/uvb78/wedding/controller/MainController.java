package uvb78.wedding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/myshow",method = RequestMethod.GET)
    public String myshow(){
        return "myshow";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String testRespo(@RequestHeader Object o1,@RequestHeader Object o2,@RequestParam Object attr){

        System.out.println("request head o1 = " + o1.toString());
        System.out.println("request head o2 = " + o2.toString());
        System.out.println("request param attr = " + attr.toString());
        //System.out.println(reqb.toString());
        return "get";
    }

    @PostMapping("/hello")
    @ResponseBody
    public String testRespo1(@RequestHeader Object o1,@RequestHeader Object o2,@RequestParam Object attr){
        System.out.println("request head o1 = " + o1.toString());
        System.out.println("request head o2 = " + o2.toString());
        System.out.println("request param attr = " + attr.toString());
        return "post";
    }

}
