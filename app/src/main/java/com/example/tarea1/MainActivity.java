package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.act1);
        wv1 = (WebView)findViewById(R.id.web);

        String url = getIntent().getStringExtra("sitioWeb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl(url);
        et1.setText("");
    }

    //Método botón ir
    public void Navegar(View view){
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("sitioWeb", et1.getText().toString());
        startActivity(i);
    }

}

