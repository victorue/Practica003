package com.example.victorruelas.practica003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Practica003 extends AppCompatActivity {

    EditText varTxtNum1, varTxtNum2;
    RadioButton varRdSuma, varRdResta, varRdMulti, varRdDiv;
    Button varButton;
    TextView txtResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica003);

        varTxtNum1 = (EditText)findViewById(R.id.txtNum1);
        varTxtNum2 = (EditText)findViewById(R.id.txtNum2);

        varRdSuma = (RadioButton)findViewById(R.id.rdSuma);
        varRdResta = (RadioButton)findViewById(R.id.rdResta);
        varRdMulti=(RadioButton)findViewById(R.id.rdMultiplicacion);
        varRdDiv=(RadioButton) findViewById(R.id.rdDivision);


        varButton = (Button)findViewById(R.id.btnOperacion);
        txtResultado =(TextView)findViewById(R.id.txtResultado);

        //Evento del boton
        varButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float resultado=0;
                float num1=Integer.parseInt(varTxtNum1.getText().toString());
                float num2=Integer.parseInt(varTxtNum2.getText().toString());
                if (varRdSuma.isChecked())
                    resultado=num1+num2;
                if (varRdResta.isChecked())
                    resultado=num1-num2;
                if (varRdMulti.isChecked())
                    resultado=num1*num2;
                if (varRdDiv.isChecked())
                    resultado=num1/num2;
                txtResultado.setText("El Resultadoes : " + resultado);
            }
        });


    }
}
