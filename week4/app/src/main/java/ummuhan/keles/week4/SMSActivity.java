package ummuhan.keles.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SMSActivity extends AppCompatActivity {
    EditText etPhone,etSMSText;
    Button btnSendSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsactivity);

        etPhone=findViewById(R.id.et_Phone);
        etSMSText=findViewById(R.id.et_SMSText);
        btnSendSMS=findViewById(R.id.btn_SendSMS);

        btnSendSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber=etPhone.getText().toString();
                String smsText=etSMSText.getText().toString();
                if(!TextUtils.isEmpty(phoneNumber)){
                    Intent sms=new Intent(Intent.ACTION_SENDTO);
                    sms.setData(Uri.parse("smsto:"+phoneNumber));
                    sms.putExtra("sms_body",smsText);
                    startActivity(sms);
                }
            }
        });
    }
}