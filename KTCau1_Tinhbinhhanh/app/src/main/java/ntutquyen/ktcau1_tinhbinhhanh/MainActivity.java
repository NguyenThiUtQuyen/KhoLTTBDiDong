package ntutquyen.ktcau1_tinhbinhhanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edCanhDay, edCanhB, edCao;
    Button btnTinhCV, btnTinhDT;
    TextView tvKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();

    }

    void TimWidget(){
        edCanhDay= (EditText)findViewById(R.id.edCanhA);
        edCanhB= (EditText)findViewById(R.id.edCanhB);
        edCao= (EditText)findViewById(R.id.edCao);
        tvKQ= (TextView) findViewById(R.id.tvKetQua);
        btnTinhCV= (Button)findViewById(R.id.btnTinhCV);
        btnTinhDT= (Button)findViewById(R.id.btnTinhDT);
    }

    public void TinhDienTich(View v)
    {
        //Lay du lieu
        String a= edCanhDay.getText().toString();
        String h= edCao.getText().toString();
        //Chuyen sang kieu so
        Float day = Float.parseFloat(a);
        Float cao = Float.parseFloat(h);
        //Tinh tong
        Float DT = day*cao;
        //Chuyen sang kieu chuoi
        String chuoiDT = String.valueOf(DT);
        //In tong
        tvKQ.setText("Diện tích hình bình hành là:"+chuoiDT);
    }

    public void TinhChuVi(View v)
    {
        //Lay du lieu
        String a= edCanhDay.getText().toString();
        String b= edCanhB.getText().toString();
        //Chuyen sang kieu so
        Float day = Float.parseFloat(a);
        Float canhB = Float.parseFloat(b);
        //Tinh tong
        Float CV = (day+canhB)*2;
        //Chuyen sang kieu chuoi
        String chuoiCV = String.valueOf(CV);
        //In tong
        tvKQ.setText("Chu vi hình bình hành là:"+chuoiCV);
    }
}