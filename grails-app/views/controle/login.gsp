<html>
   <body>
        <div class="body">
            <h1>Login</h1>
            <div class="message"><h3>${message}</h3></div>
            <g:form action="login" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <g:message code="message" default="Nome do Usuário:" />
                                </td>
                                <td valign="top" class="value">
                                    <g:textField name="username" value="${username}" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                  <g:message code="message" default="Senha: " />
                                </td>
                                <td valign="top" class="value ">
                                    <g:passwordField name="password" />
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit action="login" value="logado" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
