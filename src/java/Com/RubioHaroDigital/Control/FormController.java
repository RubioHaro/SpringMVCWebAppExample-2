package Com.RubioHaroDigital.Control;

import Com.RubioHaroDigital.Modelos.Persona;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/*Author : Rodrigo R. Rubio Haro*/
@Controller
@RequestMapping("Form.htm")
public class FormController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView Form() {
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("Form");
        MAV.addObject("Persona", new Persona());
        return MAV;
    }

    //Receptor y validador de datos
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView Form(@ModelAttribute("Persona") Persona p, BindingResult result, SessionStatus Estatus) {

    }

    @ModelAttribute("ListaPais")
    public Map<String, String> ListaDePaises() {
        Map<String, String> paises = new LinkedHashMap<>();
        paises.put("1", "Mexico");
        paises.put("2", "España");
        paises.put("3", "Bolivia");
        paises.put("4", "Argentina");
        paises.put("5", "Ecuador");
        return paises;
    }

}
