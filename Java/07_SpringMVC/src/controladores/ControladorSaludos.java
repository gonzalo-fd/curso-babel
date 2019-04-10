package controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import entidades.Persona;
import entidades.Saludos;

@Controller
@RequestScope
public class ControladorSaludos {
	
	@Autowired
	private Saludos saludosSession;
	
	//por defecto las peticiones on get
	@RequestMapping(path="verFormularioSaludo", method=RequestMethod.GET)
	public String verFormulario() {
		return "formularioSaludos";
	}
	
	/*estos metodos estan muy sobrecargados (hecho por reflection) por lo que
	 * podemos injectar muchos tipos de obejtos en el metodo
	 */
	@PostMapping("altaSaludo")
	public ModelAndView alta(HttpSession session, HttpServletRequest request,
			@RequestParam("nombre") String nombre) {
		//siempre que se hace un POST se hace un redirect
		//siempre que se hace un GET se hace un forward
		ModelAndView mav = new ModelAndView("redirect:verSaludos");
		String nombreRequest = request.getParameter("nombre");
		System.out.println(nombreRequest);
		System.out.println(nombre);
		session.setAttribute("atributoSession","Valor 1");
//		Saludos saludos = (Saludos)session.getAttribute("saludos");
		saludosSession.getListaSaludos().add(nombre);
		System.out.println(saludosSession.getListaSaludos());
		
		mav.addObject("nombre",nombre);
		return mav;
	}
	
	@GetMapping("verSaludos")
	public ModelAndView mostrarSaludos(@RequestParam("nombre") String nombre) {
		
		ModelAndView mav = new ModelAndView();
		//pasar datos del controlador a la vista
		
		Persona p = new Persona();
		p.setNombre(nombre);
		
		mav.addObject("persona",p);
		mav.addObject("listaSaludos", saludosSession.getListaSaludos());
		mav.addObject("saludo", nombre);
		return mav;
	}
}
