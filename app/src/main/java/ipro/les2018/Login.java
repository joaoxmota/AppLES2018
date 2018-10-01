package ipro.les2018;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

import ipro.les2018.Model.WsClient;


public class Login extends AppCompatActivity implements Runnable{
    private EditText edtLogin,edtSenha;
    private TextView btnEntar,btnCadastrar, btnRecuperarSenha;
    Handler handler = new Handler (  );
    ProgressDialog janela;
    Thread tarefa;

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

        /*Escopo de teste
        Aqui está o Usuário e Pessoa física de teste para inplantação da lógica do Login antes da criação do banco
         */




        /*Configuração dos eventos dos botões da tela de Login*/

        //Botão Entrar
        btnEntar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                janela = new ProgressDialog ( Login.this );
                janela.setTitle ( "Prova WebService" );
                janela.setMessage ( "Verificando os dados no servidor" );
                janela.show();

                tarefa = new Thread ( Login.this );
                tarefa.start ();
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

    @Override
    public void run() {
        WsClient client = new WsClient ();
        try {
            final boolean resposta = client.validarLogin ( edtLogin.getText ().toString (),edtSenha.getText ().toString () );
            handler.post ( new Runnable () {
                @Override
                public void run() {
                if(resposta){
                        Intent it = new Intent ( Login.this,RecuperarSenha.class );
                        startActivity ( it );
                }else
                {
                    Toast.makeText ( Login.this, "Login ou senha incorretos", Toast.LENGTH_SHORT ).show ();
                }
                }
            } );
        } catch (IOException e) {
            Toast.makeText ( Login.this, "Falha IO Exception", Toast.LENGTH_SHORT ).show ();
            e.printStackTrace ();
        } catch (XmlPullParserException e) {
            Toast.makeText ( Login.this, "Falha Xml Pull Parse", Toast.LENGTH_SHORT ).show ();
            e.printStackTrace ();
        }finally {
            janela.dismiss ();
        }
    }
}
//PENDÊNCIA: Implementar o botão Entrar (Realização do Login)
    //DEPENDÊNCIA: Banco de dados
