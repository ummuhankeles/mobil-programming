package ummuhan.keles.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLineer, btnRelative, btnTable, btnGrid, btnFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLineer = findViewById(R.id.btn_Lineer);
        btnRelative = findViewById(R.id.btn_Relative);
        btnTable = findViewById(R.id.btn_Table);
        btnGrid = findViewById(R.id.btn_Grid);
        btnFrame = findViewById(R.id.btn_Frame);

        btnLineer.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnTable.setOnClickListener(this);
        btnGrid.setOnClickListener(this);
        btnFrame.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int Id = view.getId();
        Intent i;
        switch (Id) {
            case R.id.btn_Lineer:
                i = new Intent(MainActivity.this, LinearActivity.class);
                break;
            case R.id.btn_Relative:
                i = new Intent(MainActivity.this, RelativeActivity.class);
                break;
            case R.id.btn_Frame:
                i = new Intent(MainActivity.this, FrameActivity.class);
                break;
            case R.id.btn_Table:
                i = new Intent(MainActivity.this, TableActivity.class);
                break;
            case R.id.btn_Grid:
                i = new Intent(MainActivity.this, GridActivity.class);
                break;
        }
    }
}