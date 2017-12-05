package br.com.ondanetpe.gleibsonalves_cadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private String varNomeSegun, varEnailSegun, varSexoSegun;
    private int valorBandle,varIdadeSegun;
    private TextView nomeTe,emailTe, sexoTe, idadeTe;
    UsuarioCadastro u;
    private Button buttonVoltarAc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //Bundle Pega os valores que passamos na Activity 1
        Bundle bundleGetValores = getIntent().getExtras();

        //Setar valores do Bundle a Variavel
        varNomeSegun = bundleGetValores.getString("Objeto1",u.getNome());
        varEnailSegun = bundleGetValores.getString("Objeto1",u.getEmail());
        varIdadeSegun = bundleGetValores.getInt("Objeto10",u.getIdade());
        varSexoSegun = bundleGetValores.getString("Objeto1",u.getSexo());

        //Pegar o Id dos TextView da Segunda Activity para associar depois
        nomeTe = findViewById(R.id.imputTextoNome);
        emailTe = findViewById(R.id.imputTextoEmail);
        idadeTe = findViewById(R.id.imputTextoIdade);
        sexoTe = findViewById(R.id.imputTextoSexo);

        //Setar as TextView da segunda Activity os vcalores Passado na Primeira
        nomeTe.setText(varNomeSegun);
        emailTe.setText(varEnailSegun);
        idadeTe.setText(varIdadeSegun);
        sexoTe.setText(varSexoSegun);

        //Pegar o Id dos Butao da Segunda Activity para Ir para a primeira



    }
}
