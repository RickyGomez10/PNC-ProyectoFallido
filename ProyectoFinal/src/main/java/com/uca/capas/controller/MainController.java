package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.uca.capas.domain.Usuario;
import com.uca.capas.service.UsuarioService;

@Controller
public class MainController {
	@Autowired
	private UsuarioService usuarioService;
	

	@RequestMapping("/login")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		Usuario usuario = new Usuario();
		
		
		mav.addObject("usuario", usuario);
		mav.setViewName("Login");
		
		return mav;
	}
	
	
	@RequestMapping("/verificar")
	public ModelAndView verificar(@ModelAttribute Usuario us) {
		ModelAndView mav = new ModelAndView();
		Usuario usuario = new Usuario();
		
		
		try {
			usuario = usuarioService.findUsuarioById(us.getUsuario());
			
			if(usuario.getUsuario().equals(us.getUsuario())) {
				if(usuario.getUsuario().equals(us.getClave())) {
					mav.addObject("usuario", usuario);
					mav.setViewName("Si");
				}else {
					mav.setViewName("Error");
				}
			}else {
				mav.setViewName("Error");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
			mav.addObject("usuario", usuario);
			
		}
		
		
		
		
		return mav;
	}
	
}
