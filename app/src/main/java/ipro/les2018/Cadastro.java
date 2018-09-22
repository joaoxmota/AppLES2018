package ipro.les2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cadastro extends AppCompatActivity {
    //Elementos da activitie Cadastro
    private EditText edtLogin,edtSenha,edtConfirmaSenha;
    private TextView btnCadastrar, btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_cadastro );

        //identificando os objetos que serão acessados da Activitie
        edtLogin = findViewById ( R.id.edtCadastroLogin );
        edtSenha = findViewById ( R.id.edtCadastroSenha );
        edtConfirmaSenha = findViewById ( R.id.edtCadastroConfirmaSenha );
        btnCadastrar = findViewById ( R.id.btnCadastroCadastrar );
        btnCancelar = findViewById ( R.id.btnCadastroCancelar);

        /*Configuração dos eventos dos botões da tela de Login*/

        //Botão Cadastrar

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

//PENDÊNCIA: Implementar botão cadastrar
    //DEPENDÊNCIA: Banco de dados