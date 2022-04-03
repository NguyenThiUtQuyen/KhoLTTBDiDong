package cntt61.q_57130380_listsong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<BaiHat> img_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.lvSong);
        listView.setAdapter(new CustomListAdapter(img_details,this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object obj = listView.getItemAtPosition(i);
                BaiHat baiHat = (BaiHat) obj;
                Toast.makeText(MainActivity.this, "Selected"+" "+baiHat, Toast.LENGTH_SHORT).show();
            }
        });
    }
    private List<BaiHat> getListData(){
        List<BaiHat> list = new ArrayList<>();
        BaiHat embe = new BaiHat("Em bé","amee.png","Amee");
        BaiHat mo = new BaiHat("Mơ","casi.png","Vũ Cát Tường");
        BaiHat uocgi = new BaiHat("Ước gì","tam.png","Mỹ Tâm");

        list.add(embe);
        list.add(mo);
        list.add(uocgi);

        return list;
    }
}