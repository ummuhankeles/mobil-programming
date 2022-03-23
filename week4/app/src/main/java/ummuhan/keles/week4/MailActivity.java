package ummuhan.keles.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MailActivity extends AppCompatActivity {
    EditText etEmail,etSubject,etMailText;
    Button btnSendMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        etEmail=findViewById(R.id.et_Emails);
        etSubject=findViewById(R.id.et_Subject);
        etMailText=findViewById(R.id.et_MailText);
        btnSendMail=findViewById(R.id.btn_SendMail);
        btnSendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=etEmail.getText().toString();
                String subject=etSubject.getText().toString();
                String text=etMailText.getText().toString();
                if(!TextUtils.isEmpty(email)){
                    Intent mail=new Intent(Intent.ACTION_SEND);
                    mail.setType("message/rfc822");
                    mail.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
                    mail.putExtra(Intent.EXTRA_SUBJECT,subject);
                    mail.putExtra(Intent.EXTRA_TEXT,text);
                    startActivity(mail);
                }else
                    Toast.makeText(getApplicationContext(),"email adress is not entered",Toast.LENGTH_SHORT).show();
            }
        });

    }
}