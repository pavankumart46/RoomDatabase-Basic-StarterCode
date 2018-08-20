package com.blogspot.pavankreddytadi.roomdatabase_basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity
{
    EditText et_name,et_id;
    TextView tv_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.student_name);
        et_id = findViewById(R.id.student_id);
        tv_view = findViewById(R.id.data_text_view);
    }

    public void saveData(View view)
    {
        String name = et_name.getText().toString();
        int id = Integer.parseInt(et_id.getText().toString());
    }

    public void retrieveData(View view)
    {
        
    }
}
