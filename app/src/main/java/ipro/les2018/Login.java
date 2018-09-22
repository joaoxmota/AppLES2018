package ipro.les2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {
    private EditText edtLogin,edtSenha;
    private TextView btnEntar,btnCadastrar, btnRecuperarSenha;

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
}
//PENDÊNCIA: Implementar o botão Entrar (Realização do Login)
    //DEPENDÊNCIA: Banco de dados
