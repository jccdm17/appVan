package com.example.julio.appteste

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import com.example.julio.appteste.Domain.Login
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.toast
import android.content.Intent
import com.example.julio.appteste.R.layout.tela2


class MainActivityK :
        AppCompatActivity(),
        View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        login.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val login = Login(
                email.text.toString(),
                senha.text.toString()
                )

        val resposta: String
        val respostaLogin = login.fazerLogin()

        if (respostaLogin == 0) {
            irParaMenu()
        }else if(respostaLogin == 1){
            resposta = "Senha Incorreta!"
            TextoaExibir.text = resposta
            alert("Senha Incorreta!").show()
        }else if (respostaLogin == 2){
            resposta = "Email Incorreto!"
            TextoaExibir.text = resposta
            alert("Email Incorreto!").show()
        }





    }

    fun irParaMenu(){
        val intent: Intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
}