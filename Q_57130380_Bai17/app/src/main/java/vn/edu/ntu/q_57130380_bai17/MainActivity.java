package vn.edu.ntu.q_57130380_bai17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button nutNhap;
    EditText edTen;
    ListView lstTen;
    String ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstTen = (ListView) findViewById(R.id.lvTen);
        edTen = (EditText) findViewById(R.id.edNhapTen);
        nutNhap = (Button) findViewById(R.id.btnNhap);
        Resources res = getResources();
        String[] ten_list = res.getStringArray(R.array.ten_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1, ten_list);
        lstTen.setAdapter(adapter);
        nutNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ten = edTen.getText().toString().trim();
                adapter.notifyDataSetChanged();
            }

        });
    }
}