package br.com.bossini.meuprimeiroappsi3anmca1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Agora sim, com uma torrada", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage (View view){
        //Toast t = Toast.makeText(this, "É, funciona", Toast.LENGTH_SHORT);
        //t.show();
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String texto = editText.getEditableText().toString();
        Intent i = new Intent (this, DisplayMessageActivity.class);
        i.putExtra(TXT, texto);
        startActivity(i);

    }

    public static final String TXT = "txt";
}
