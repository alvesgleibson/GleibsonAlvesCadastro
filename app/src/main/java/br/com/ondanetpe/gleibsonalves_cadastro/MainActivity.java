package br.com.ondanetpe.gleibsonalves_cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nome, email, idade, sexo;
    String nomePassar, emailPassar, sexoPassar;
    int idadePassar;
    UsuarioCadastro cadastroUsuario;
    private Button butaoGravarDisco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pegar os Valores nas EditText
        nome = findViewById(R.id.imputTextoNome);
        email = findViewById(R.id.imputTextoEmail);
        idade = findViewById(R.id.imputTextoIdade);
        sexo = findViewById(R.id.imputTextoSexo);

        //Setar os Valores nos seus determinado Variavel
         nomePassar = nome.toString();
         emailPassar = email.toString();
         idadePassar = Integer.parseInt(String.valueOf(idade));
         sexoPassar = sexo.toString();

        //Instanciar a classe usuarioCadastro


        butaoGravarDisco.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                cadastroUsuario = new UsuarioCadastro(nomePassar,emailPassar,idadePassar,sexoPassar);
                Intent i = new Intent(getApplicationContext(), SegundaActivity.class);
                i.putExtra("Objeto1", cadastroUsuario);
                startActivity(i);
            }

        });



    }
}
