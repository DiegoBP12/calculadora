package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.security.interfaces.DSAPublicKey;

public class MainActivity extends AppCompatActivity {
    private double resultado;
    private TextView ShowResult;
    private TextView n1;
    private TextView n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowResult = (EditText) findViewById(R.id.et_resultado);
        n1 = (EditText) findViewById(R.id.et_numero1);
        n2 = (EditText) findViewById(R.id.et_numero2);
    }

    public void Suma(View view) {
        String numero1 = n1.getText().toString();
        String numero2 = n2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = num1 + num2;
            if (ShowResult != null)
                ShowResult.setText(Double.toString(resultado));
        }catch (Exception e){
            Log.e("Error","Error en la suma");
        }
    }

    public void Resta(View view) {
        String numero1 = n1.getText().toString();
        String numero2 = n2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = (num1 - num2);
            if (ShowResult != null)
                ShowResult.setText(Double.toString(resultado));
        }catch (Exception e){
            Log.e("Error","Error en la resta");
        }
    }

    public void Multi(View view) {
        String numero1 = n1.getText().toString();
        String numero2 = n2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = (num1 * num2);

            if (ShowResult != null)
                ShowResult.setText(Double.toString(resultado));
        }
        catch (Exception e){
            Log.e("Error","Error en la multiplicacion");
        }
    }

    public void Division(View view) {
        String numero1 = n1.getText().toString();
        String numero2 = n2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = (num1 / num2);
            if (num1 == 0) {
                Toast mensaje = Toast.makeText(this,R.string.error,Toast.LENGTH_SHORT);
                mensaje.show();
            }
            else if (num2 == 0){
                Toast mensaje = Toast.makeText(this,R.string.error,Toast.LENGTH_SHORT);
                mensaje.show();
            }
            else {
                if (ShowResult != null)
                    ShowResult.setText(Double.toString(resultado));
            }
        }
        catch (Exception e){
            Log.e("Error","Error en la division");
        }

    }

    public void Residuo(View view) {
        String numero1 = n1.getText().toString();
        String numero2 = n2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = (num1 % num2);
            if (ShowResult != null)
                ShowResult.setText(Double.toString(resultado));
        }
        catch (Exception e){
            Log.e("Error","Error en el residuo");
        }
    }
}
