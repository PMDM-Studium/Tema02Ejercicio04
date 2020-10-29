package es.studium.tema02ejercicio04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnBoton;
    EditText texto;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBoton = findViewById(R.id.boton_pulsar);
        btnBoton.setOnClickListener(this);
        texto = findViewById(R.id.text_placeholder);
        texto.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (texto.length() == 0) {
            Toast.makeText(MainActivity.this, R.string.MensajeError, Toast.LENGTH_SHORT).show();
        } else {
            if (texto.getText().toString().trim().matches(emailPattern)) {
                Toast.makeText(MainActivity.this, texto.getText(), Toast.LENGTH_SHORT).show();
                texto.setText("");
            } else {
                Toast.makeText(getApplicationContext(), R.string.validacionEmail, Toast.LENGTH_SHORT).show();
            }

        }
    }
}