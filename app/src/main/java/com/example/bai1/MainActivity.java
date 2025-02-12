package com.example.bai1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextbankinh;
    AppCompatButton btnTinh,btnWeb;
    TextView tVchuvi,tVdientich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextbankinh = findViewById(R.id.bankinh);
        btnTinh = findViewById(R.id.btnTinh);
        btnWeb = findViewById(R.id.btnWeb);
        tVchuvi = findViewById(R.id.chuvi);
        tVdientich = findViewById(R.id.dientich);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhToan tinhToan = new TinhToan();
                tinhToan.setR(Double.parseDouble(editTextbankinh.getText().toString()));
                tVchuvi.setText(tinhToan.tinhChuVi()+"");
                tVdientich.setText(tinhToan.tinhDientich()+"");
            }
        });
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                startActivity(intent);
            }
        });
    }
}