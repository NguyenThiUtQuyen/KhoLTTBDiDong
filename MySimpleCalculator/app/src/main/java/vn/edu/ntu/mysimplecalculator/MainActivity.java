package vn.edu.ntu.mysimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //khai bao san cac doi tuong
    EditText editSoA, editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }
    void TimWidget(){
        editSoA= (EditText)findViewById(R.id.edSoA);
        editSoB= (EditText)findViewById(R.id.edSoB);
        textViewKetQua= (TextView) findViewById(R.id.tvKetQua);
        nutCong= (Button)findViewById(R.id.btnCong);
        nutTru= (Button)findViewById(R.id.btnTru);
        nutNhan= (Button)findViewById(R.id.btnNhan);
        nutChia= (Button)findViewById(R.id.btnChia);
    }
    //Hàm Xử lý
    public void XuLyCong(View v){
        //Lay du lieu
        String sA= editSoA.getText().toString();
        String sB= editSoB.getText().toString();
        //Chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tinh tong
        int tong = a+b;
        //Chuyen sang kieu chuoi
        String chuoiTong = String.valueOf(tong);
        //In tong
        textViewKetQua.setText("Tong la:"+chuoiTong);
    }
    //Hàm Xử lý
    public void XuLyTru(View v){
        //Lay du lieu
        String sA= editSoA.getText().toString();
        String sB= editSoB.getText().toString();
        //Chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tinh tong
        int hieu = a-b;
        //Chuyen sang kieu chuoi
        String chuoiHieu = String.valueOf(hieu);
        //In tong
        textViewKetQua.setText("Tong la:"+chuoiHieu);
    }
    //Hàm Xử lý
    public void XuLyNhan(View v){
        //Lay du lieu
        String sA= editSoA.getText().toString();
        String sB= editSoB.getText().toString();
        //Chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tinh tong
        int tich = a*b;
        //Chuyen sang kieu chuoi
        String chuoiTich = String.valueOf(tich);
        //In tong
        textViewKetQua.setText("Tong la:"+chuoiTich);
    }
    //Hàm Xử lý
    public void XuLyChia(View v){
        //Lay du lieu
        String sA= editSoA.getText().toString();
        String sB= editSoB.getText().toString();
        //Chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tinh tong
        int thuong = a/b;
        //Chuyen sang kieu chuoi
        String chuoiThuong = String.valueOf(thuong);
        //In tong
        textViewKetQua.setText("Tong la:"+chuoiThuong);
    }

}