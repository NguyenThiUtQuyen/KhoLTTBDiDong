package cntt61.quyen_57130380_bai16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listViewTen;
    TextView textViewTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewHienThi;
        textViewHienThi = (TextView) findViewById(R.id.tvHienThi);
        Resources res = getResources();
        String[] ten_list = res.getStringArray(R.array.ten_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1, ten_list);
        listViewTen = (ListView) findViewById(R.id.listTen);
        listViewTen.setAdapter(adapter);
        listViewTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String val = (String) listViewTen.getItemAtPosition(i);
                textViewHienThi.setText("position: "+i+" value: "+val);
            }
        });
    }

}