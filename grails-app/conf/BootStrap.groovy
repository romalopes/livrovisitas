import br.com.k2sistemas.livroVisitas.User


class BootStrap {

	def init = { servletContext ->
		  User user = new User(name:'anderson', email:'romalopes@romalopes.com.br', webpage:'http://www.romalopes.com.br')

		  if (!user.save()){
			  log.error "Could not save user!!"
			  log.error "${user.errors}"
		  }
  }
	 def destroy = {
	 }
}