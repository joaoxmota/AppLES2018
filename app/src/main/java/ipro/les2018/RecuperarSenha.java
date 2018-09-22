package ipro.les2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RecuperarSenha extends AppCompatActivity {
    //Elementos da Activitie Recuperar Senha
    EditText edtRecuperarSenha;
    TextView btnRecuperarSenha, btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_recuperar_senha );

        //identificando os objetos que serão acessados da Activitie
        edtRecuperarSenha = findViewById ( R.id.edtRecuperaSenhaEmail );
        btnRecuperarSenha = findViewById ( R.id.btnRecuperarSenhaEnviar );
        btnCancelar = findViewById ( R.id.btnRecuperarSenhaCancelar );

        /*Configuração dos eventos dos botões da tela de Login*/

        //Botão Recuperar Senha

        //Botão Cancelar
        btnCancelar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                onBackPressed ();
            }
        } );

    }

    @Override
    public void onBackPressed() {
        Intent it = new Intent ( this, Login.class );
        startActivity ( it );
    }
}

//PENDÊNCIA : Implementar o botão Recuperar Senha
    //DEPENDÊNCIA:  Implementar o envio de email pelo aplicativo
                    //Banco de de dados