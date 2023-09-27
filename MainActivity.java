package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText priNumero;
    EditText segNumero;
    RadioGroup rbGroup01;
    RadioGroup rbGroup;
    TextView edResultado;
    double M1, res;
    float N1, N2, result;
    int op;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        priNumero = findViewById(R.id.priNumero);
        segNumero = findViewById(R.id.segNumero);
        rbGroup01 = findViewById(R.id.rbGroup01);
        rbGroup = findViewById(R.id.rbGroup);
        edResultado = findViewById(R.id.edResultado);

        rbGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbGasolina)
                    op = 5;
                else {
                    if (i == R.id.rbAlcool)
                        op = 6;
                }
                {
                    if (i == R.id.rbDiesel)
                        op = 7;
                }
            }
        });


        rbGroup01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbCredito)
                    op = 1;
                else {
                    if (i == R.id.rbDebito)
                        op = 2;
                }
                {
                    if (i == R.id.rbPix)
                        op = 3;
                }
                {
                    if (i == R.id.rbEspecie)
                        op = 4;
                }
            }
        });
    }
    public void Gasolina(View v) {
        M1 = Double.parseDouble(segNumero.getText().toString());

        if (op == 5) {
            res = 5.46;
        } else {
            if (op == 6) {
                res = 4.45;
            } else {
                if (op == 7) {
                    res = 3.75;
                }
            }
        }
        segNumero.setText((int) res);
    }
    public void Calcular(View v) {
        N1 = Float.parseFloat(priNumero.getText().toString());
        N2 = Float.parseFloat(segNumero.getText().toString());

        if (op == 1) {
            result = (float) ((N1 * N2) * 1.1);
        } else {
            if (op == 2) {
                result = (float) ((N1 * N2) * 1.05);
            } else {
                if (op == 3) {
                    result = (float) ((N1 * N2) * 1.05);
                } else {
                    result = result = (float) ((N1 * N2) / 1.05);
                    ;
                }
            }
        }
        edResultado.setText("R$" + result);
    }


}




