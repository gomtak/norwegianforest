package gomtak.norwegianforest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping(value="/")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/design-studio")
    public String design_studio(){
        return "design-studio";
    }

    @RequestMapping(value="/digital-agency")
    public String digital_agency(){
        return "digital-agency";
    }

    @RequestMapping(value="/construction")
    public String construction(){
        return "construction";
    }

    @RequestMapping(value="/about")
    public String about(){
        return "about";
    }

    @RequestMapping(value="/blog-three-col")
    public String blog_three_col(){
        return "blog-three-col";
    }

    @RequestMapping(value="/contact")
    public String contact(){
        return "contact";
    }

}
