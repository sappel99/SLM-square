package at.fhtw.appel.square.Controller;

import at.fhtw.appel.square.Service.SquareService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class SquareController {
    private final SquareService squareService;

    public SquareController(SquareService squareService) {
        this.squareService = squareService;
    }


    @GetMapping("/home")
    public String home() {
        return "home";  //home.html
    }

    @GetMapping("/square")
    String getSqu(Model model) {
        model.addAttribute("square", squareService.getSquare()); //set the message for mes.html

        return "erg";   //mes.html
    }
    @GetMapping("/square/{square}")
    String setSqu(@PathVariable int square, Model model) {
        squareService.setSquare(square);
        model.addAttribute("square",squareService.getSquare());   //set the text for change.html
        return "erg";    //erg.html
    }
}
