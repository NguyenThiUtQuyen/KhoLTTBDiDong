package vn.edu.ntu.mylyric;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShowLyricActivity extends AppCompatActivity {
    EditText edLyric;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lyric);
        edLyric = (EditText) findViewById(R.id.editTextLyric);
        //
        Intent BH = getIntent();
        // Lấy ra tên BH   , ==> ten file là:  tenBH.txt

        String tenBai = BH.getStringExtra("tenBH");
        String tenFile = tenBai+".txt";
        Toast.makeText(this, ""+tenFile, Toast.LENGTH_SHORT).show();

        InputStream inputStream = null;
        try {
            inputStream = openFileInput(tenFile);
            edLyric.setText( readData(inputStream));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    String readData(InputStream inpStr){
        InputStreamReader inpRdr = new InputStreamReader(inpStr);
        BufferedReader buffRdr = new BufferedReader(inpRdr);
        String dongVanBan;
        StringBuilder boTaoChuoi = new StringBuilder();
        try {
                while ((dongVanBan=buffRdr.readLine())!=null){
                    boTaoChuoi.append("\n").append(dongVanBan);
                }

                inpStr.close();//Đóng luồng nhập

        } catch (IOException ex){
            Log.e("Error",ex.getMessage());
        }
        return  boTaoChuoi.toString();
    }
}