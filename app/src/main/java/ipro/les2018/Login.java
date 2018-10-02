package ipro.les2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.lang.reflect.Type;

import ipro.les2018.Model.Usuario;

public class Login extends AppCompatActivity {
    private EditText edtLogin,edtSenha;
    private TextView btnEntar,btnCadastrar, btnRecuperarSenha;
    private String login,senha,json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_login );

        //identificando os objetos que serão acessados da Activitie
        edtLogin = findViewById ( R.id.edtLoginLogin );
        edtSenha = findViewById ( R.id.edtLoginSenha );
        btnEntar = findViewById ( R.id.btnLoginEntrar );
        btnCadastrar = findViewById ( R.id.btnLoginCadastrar );
        btnRecuperarSenha = findViewById ( R.id.btnLoginRecuperarSenha );

        /*Configuração dos eventos dos botões da tela de Login*/

        //Botão Entrar
            btnEntar.setOnClickListener ( new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    usuarioFromJson ();
                }
            } );
        //Botão Cadastrar
        btnCadastrar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent it  = new Intent ( Login.this, Cadastro.class );
                startActivity ( it );
            }
        } );

        //Botão Recuperar senha
        btnRecuperarSenha.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent it  = new Intent ( Login.this, RecuperarSenha.class );
                startActivity ( it );
            }
        } );

    }
    public void usuarioFromJson(){
        this.login = edtLogin.getText ().toString ();
        this.senha = edtSenha.getText ().toString ();


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String url = "http://192.168.15.4:8080/WebServ/webresources/generic/usuario/retornar/"+this.login+"/"+this.senha;
        JsonObjectRequest objectRequest = new JsonObjectRequest (
                Request.Method.GET, url, null, new Response.Listener<JSONObject> () {
                @Override
                public void onResponse(JSONObject response) {
                    Log.e("Rest response", response.toString ());
                    setJson ( response.toString ());
                    validarLogin ();
                }
            }, new Response.ErrorListener () {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("Rest error", error.toString ());
                    setJson ( error.toString ());

                }
            }
        );


        requestQueue.add ( objectRequest );



    }
    public void setJson(String string){
        this.json = string;
    }
    public void sendMessage(String texto){
        Toast.makeText ( this, texto, Toast.LENGTH_SHORT ).show ();
    }

    public boolean validarLogin(){
        Usuario us;
        Gson g = new Gson ();
        us = g.fromJson ( this.json, Usuario.class );
        if(!(us.getEmail ().equals ( "noemail@nodomain.com" ))){
            Intent it = new Intent ( this,Home.class );
            startActivity ( it );
        }else{
            sendMessage ( "Usuario inválido" );
        }
        return true;
    }
}
//PENDÊNCIA: Implementar o botão Entrar (Realização do Login)
    //DEPENDÊNCIA: Banco de dados
