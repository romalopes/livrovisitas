package livrovisitas

class SecurityFilters {
    def filters = {
        loginCheck(controller: '*', action: '*') {
            before = {

                if (!session.user && actionName != "login") {
		            redirect( controller: "controle", action: "login")
                    return false
                }
            }
        }
    }
}
