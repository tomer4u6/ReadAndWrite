//Version 1.0
package com.example.tomer.readandwrite;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText et;
    Button write_btn,read_btn;
    String data_st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);
        et = (EditText)findViewById(R.id.et);
        write_btn = (Button)findViewById(R.id.write_btn);
        read_btn = (Button)findViewById(R.id.read_btn);

    }

    public void writeToFile(View view) {
    }

    public void ReadFromFile(View view) {
    }
}
