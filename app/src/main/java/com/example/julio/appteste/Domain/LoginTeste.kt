package com.example.julio.appteste.Domain

class Login ( emailLogin: String, senhaLogin: String ){
    val email = emailLogin
    val senha = senhaLogin

    fun fazerLogin(): Int {
        val retornoEmail = email == "juliojcmedeiros@gmail.com"
        val retornoSenha = senha == "123456"

        if ((retornoEmail)&&(retornoSenha)){
            //Email Senha Certos
            return 0
        }else if (retornoEmail){
            //Email Certo Senha Errada
            return 1
        }else{
            //Senha Certa Email Errado
            return 2
        }
    }

}

