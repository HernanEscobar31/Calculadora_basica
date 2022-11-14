package com.example.calculadorabasica;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    Button sumar, restar, dividir, multiplicar;
    TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1= findViewById(R.id.num1);
        n2= findViewById(R.id.num2);
        sumar = findViewById(R.id.btn1);
        restar = findViewById(R.id.bt2);
        dividir = findViewById(R.id.btn3);
        multiplicar = findViewById(R.id.btn4);
        r = findViewById(R.id.resultado);
    }

    public void sumar(View view){
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int s = valor1 + valor2;
        r.setText(s+"");
    }
    public void restar(View view){
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int s = valor1 - valor2;
        r.setText(s+"");
    }
    public void dividir(View view){
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int s = valor1 / valor2;
        r.setText(s+"");
    }
    public void multiplicar(View view){
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int s = valor1 * valor2;
        r.setText(s+"");
    }
    public void limpiar(View view){
        n1.setText("");
        n2.setText("");
        r.setText("");
    }
}

