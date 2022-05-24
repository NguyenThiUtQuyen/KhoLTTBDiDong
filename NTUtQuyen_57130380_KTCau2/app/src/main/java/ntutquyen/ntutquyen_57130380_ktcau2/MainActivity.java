package ntutquyen.ntutquyen_57130380_ktcau2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listTho =  new ArrayList<String>();
        listTho.add("viet_nam_que_huong_ta");
        listTho.add("que_huong");
        listTho.add("duong_ve_que_me");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listTho);
        ListView lv= (ListView)findViewById(R.id.listView_Cac_bai_tho);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tenBaiTho = listTho.get(i);
                // Chuyển Activity
                Intent intentTho = new Intent(MainActivity.this, ShowThoActivity.class);
                // gói tên vào
                intentTho.putExtra("tenBaiTho",tenBaiTho);
                // Đẩy sang
                startActivity(intentTho);
            }
        });
    }
}