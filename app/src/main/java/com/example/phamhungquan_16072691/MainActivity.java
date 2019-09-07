package com.example.phamhungquan_16072691;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText tk, mk;
        TextView tk1, mk1;
        Button dn, thoat;
        CheckBox luu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tk = (EditText) findViewById(R.id.edt_tk);
        mk = (EditText) findViewById(R.id.edt_mk);
        luu = (CheckBox) findViewById(R.id.cb_luu);
        dn = (Button) findViewById(R.id.btn_dn);
        thoat = (Button) findViewById(R.id.btn_thoat);

        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(luu.isChecked()){
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu!", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn khong được lưu!", Toast.LENGTH_LONG).show();
            }
        });



    }
}
