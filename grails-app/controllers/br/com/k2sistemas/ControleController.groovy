package br.com.k2sistemas

import grails.converters.XML
import br.com.k2sistemas.livroVisitas.Feedback
import br.com.k2sistemas.livroVisitas.User

//ControleController.groovy
class ControleController {

    def index() { 
		render(view: "/index")//render "<h1>Inicio!</h1>"
	}
	
	def ola = {
		render "<h1>Ola Pessoal da K2!</h1>"
	}
	
	def acao = {
		[par1: "Hello", par2: "World!", date: new Date()]
	}

	def xmlList = {
		render Feedback.list() as XML
    }

		
	def login() {
		
		if(!params.username)
		{
			render(view: "login")
			return
		}
		//AQUI INCLUIR TODAS AS REGRAS DE AUTENTICAÇÃO
		def user = User.findByName(params.username)
		
		if (user) {
			session.user = params.username
			render(view: "/index")
		} else {
			render(view: "login", model: [message: "Usuario ${params.username} nao encontrado"])
		}
	}
	
	def logout () {
		session.invalidate()
		render(view: "login")
	}
}


