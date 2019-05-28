package edu.up.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declarando todas as Views da Activity
    //Activity = Tela

    //Declarando os numerais
    private Button btnNumero1, btnNumero2, btnNumero3, btnNumero4, btnNumero5,
            btnNumero6, btnNumero7, btnNumero8, btnNumero9, btnNumero0;

    //Declarando as operações
    private Button btnDivisao, btnSoma, btnMultiplicacao, btnSubtracao;

    //Declarando os demais botãos
    private Button btnResultado, btnClear, btnPonto;
    private TextView txtResultado;

    private double numero1, numero2, resultado;
    private String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_linear); //É onde determina em qual activity irá apresentar

        //R representa a pasta de Res
        btnNumero0 = (Button) findViewById(R.id.btnNumero0);
        btnNumero1 = (Button) findViewById(R.id.btnNumero1);
        btnNumero2 = (Button) findViewById(R.id.btnNumero2);
        btnNumero3 = (Button) findViewById(R.id.btnNumero3);
        btnNumero4 = (Button) findViewById(R.id.btnNumero4);
        btnNumero5 = (Button) findViewById(R.id.btnNumero5);
        btnNumero6 = (Button) findViewById(R.id.btnNumero6);
        btnNumero7 = (Button) findViewById(R.id.btnNumero7);
        btnNumero8 = (Button) findViewById(R.id.btnNumero8);
        btnNumero9 = (Button) findViewById(R.id.btnNumero9);

        btnDivisao = (Button) findViewById(R.id.btnDivisao);
        btnMultiplicacao = (Button) findViewById(R.id.btnMultiplicacao);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSubtracao = (Button) findViewById(R.id.btnSubtracao);

        btnResultado = (Button) findViewById(R.id.btnResultado);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnPonto = (Button) findViewById(R.id.btnPonto);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

    }

    //Numerais
    public void btnNumero0Click(View view) {
        txtResultado.setText(txtResultado.getText() + "0");
    }

    public void btnNumero1Click(View view) {
        txtResultado.setText(txtResultado.getText() + "1");
    }

    public void btnNumero2Click(View view) {
        txtResultado.setText(txtResultado.getText() + "2");
    }

    public void btnNumero3Click(View view) {
        txtResultado.setText(txtResultado.getText() + "3");
    }

    public void btnNumero4Click(View view) {
        txtResultado.setText(txtResultado.getText() + "4");
    }

    public void btnNumero5Click(View view) {
        txtResultado.setText(txtResultado.getText() + "5");
    }

    public void btnNumero6Click(View view) {
        txtResultado.setText(txtResultado.getText() + "6");
    }

    public void btnNumero7Click(View view) {
        txtResultado.setText(txtResultado.getText() + "7");
    }

    public void btnNumero8Click(View view) {
        txtResultado.setText(txtResultado.getText() + "8");
    }

    public void btnNumero9Click(View view) {
        txtResultado.setText(txtResultado.getText() + "9");
    }

    //Operações
    public void btnDivisaoClick(View view) {
        numero1 = Integer.parseInt(txtResultado.getText().toString());
        txtResultado.setText("");
        operador = "/";
    }

    public void btnMultiplicacaoClick(View view) {
        numero1 = Integer.parseInt(txtResultado.getText().toString());
        txtResultado.setText("");
        operador = "*";
    }

    public void btnSubtracaoClick(View view) {
        numero1 = Integer.parseInt(txtResultado.getText().toString());
        txtResultado.setText("");
        operador = "-";
    }

    public void btnSomaClick(View view) {
        numero1 = Integer.parseInt(txtResultado.getText().toString());
        txtResultado.setText("");
        operador = "+";
    }

    public void btnResultadoClick(View view) {
        numero2 = Double.parseDouble(txtResultado.getText().toString());
        switch (operador){
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                break;
        }

        txtResultado.setText(String.valueOf(resultado));
    }


    public void btnPontoClick(View view) {
        if(!txtResultado.getText().toString().contains("."))
        {
            txtResultado.setText(txtResultado.getText() + ".");
        }
    }

    public void btnClearClick(View view) {
        txtResultado.setText("");
    }

    public void btnNumeroClick(View view){
        Button btn = (Button) view;
        txtResultado.setText(txtResultado.getText() + btn.getText().toString());
    }

    public void btnOperadorClick(View view) {
       Button btn = (Button) view;
       numero1 = Double.parseDouble(txtResultado.getText().toString());
       txtResultado.setText("");
       operador = btn.getText().toString();
    }
}
