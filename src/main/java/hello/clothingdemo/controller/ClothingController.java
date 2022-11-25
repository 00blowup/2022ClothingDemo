package hello.clothingdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClothingController {

    //메인화면
    @GetMapping("/")
    public String main(){
        return "main";
    }

    //새 옷 정보 추가화면
    @GetMapping("/add")
    public String add(){
        return "add";
    }

    //옷 정보 상세화면
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("data", "1234");
        return "details";
    }

    //옷 정보 수정화면
    @GetMapping("/update")
    public String update(Model model){
        model.addAttribute("data", "1234");
        return "update";
    }
}
