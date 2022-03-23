package ummuhan.keles.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReturnActivity extends AppCompatActivity {
    EditText etName;
    Button btnSendBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return);

        btnSendBack=findViewById(R.id.btn_SendBack);
        etName=findViewById(R.id.et_Name);
        btnSendBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=etName.getText().toString();
                Intent returnIntent=new Intent();
                returnIntent.putExtra("NAME", name);
                setResult(Activity.RESULT_OK,returnIntent);
                finish();
            }
        });

    }
}