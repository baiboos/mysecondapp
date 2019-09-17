package com.zjt.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private String TAG="main";

    TextView text;
    EditText inp;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.tx);
        inp=findViewById(R.id.inp);
        btn=findViewById(R.id.btn);
        //btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.i(TAG , "vnjfkdnvjkd");
        String str=inp.getText().toString();
        text.setText(str);
    }

    public void abc(View v){
        text.setText("NEWclick");
    }

}
