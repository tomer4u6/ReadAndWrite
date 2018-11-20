//Version 1.1
package com.example.tomer.readandwrite;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    String data_st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);
        et = (EditText)findViewById(R.id.et);

    }

    public void writeToFile(View view) {
        if(!(et.getText().toString().equals(""))){
            data_st = et.getText().toString();

            try {
                FileOutputStream fos = openFileOutput("albert.txt", Context.MODE_PRIVATE);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                try {
                    bw.write(data_st);
                    Toast.makeText(this, "File saved", Toast.LENGTH_SHORT).show();
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        else{
            Toast.makeText(this, "No data was entered", Toast.LENGTH_SHORT).show();
        }
    }

    public void ReadFromFile(View view) {
    }
}
