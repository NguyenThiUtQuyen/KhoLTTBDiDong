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

    ListView lvBaiHat;
    ArrayList<BaiHat> mangBaiHat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBaiHat = (ListView) findViewById(R.id.lvSong);
        mangBaiHat = new ArrayList<BaiHat>();

        mangBaiHat.add(new BaiHat("Em bé","amee.png",R.drawable.amee));
        mangBaiHat.add(new BaiHat("Mơ","Vũ Cát Tường",R.drawable.casi));
        mangBaiHat.add(new BaiHat("Ước gì","Mỹ Tâm",R.drawable.tam));

        CustomListAdapter bHAdapter = new CustomListAdapter(
                MainActivity.this,
                R.layout.list_item_layout,
                mangBaiHat
        );

        lvBaiHat.setAdapter(bHAdapter);
        /*List<BaiHat> img_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.lvSong);
        listView.setAdapter(new CustomListAdapter(img_details,this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object obj = listView.getItemAtPosition(i);
                BaiHat baiHat = (BaiHat) obj;
                Toast.makeText(MainActivity.this, "Selected"+" "+baiHat, Toast.LENGTH_SHORT).show();
            }
        });*/
    }
    /*private List<BaiHat> getListData(){
        List<BaiHat> list = new ArrayList<>();
        BaiHat embe = new BaiHat("Em bé","amee.png","Amee");
        BaiHat mo = new BaiHat("Mơ","casi.png","Vũ Cát Tường");
        BaiHat uocgi = new BaiHat("Ước gì","tam.png","Mỹ Tâm");

        list.add(embe);
        list.add(mo);
        list.add(uocgi);

        return list;
    }*/
}