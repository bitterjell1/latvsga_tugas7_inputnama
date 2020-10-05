package com.fitriasari.latsvgsa_inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etnamatext;
    private TextView namaTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         etnamatext = findViewById(R.id.etnamatext);
         namaTextView = findViewById(R.id.textmasukannama);
    }

    public void tampilkan(View view) {

        String nama = etnamatext.getText().toString();
        namaTextView.setText(getString(R.string.nama_anda, nama));
//        namaTextView.setText("Nama Anda : "+etnamatext.getText());
    }
}