package ummuhan.keles.week3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class RelativeActivity extends AppCompatActivity {
    Button btnColorize, btnLoadImage;
    ImageView ivImage;
    RelativeLayout relative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        btnColorize = findViewById(R.id.btn_Colorize);
        btnLoadImage = findViewById(R.id.btn_LoadImage);
        ivImage = findViewById(R.id.iv_Image);
        relative = findViewById(R.id.relative);

        btnColorize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relative.setBackgroundColor(Color.RED);
            }
        });

        btnLoadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivImage.setImageDrawable(getDrawable(R.drawable.ic_launcher_background));
            }
        });
    }
}