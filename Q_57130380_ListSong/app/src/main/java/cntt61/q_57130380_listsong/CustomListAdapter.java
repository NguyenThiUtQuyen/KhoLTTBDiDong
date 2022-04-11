package cntt61.q_57130380_listsong;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<BaiHat> arrayBaihat;

    public CustomListAdapter(Context context, int layout, List<BaiHat> baiHatList)
    {
        myContext = context;
        myLayout = layout;
        arrayBaihat = baiHatList;
    }


    @Override
    public int getCount() {
        return arrayBaihat.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(myLayout, null);

        //Anh xa va gán giá trị
        TextView txtTenBH = (TextView) view.findViewById(R.id.tvTenBH);
        txtTenBH.setText(arrayBaihat.get(i).tenBaiHat);

        TextView txtTenCS = (TextView) view.findViewById(R.id.tvTenCS);
        txtTenCS.setText(arrayBaihat.get(i).tenCaSi);

        ImageView imgHinh = (ImageView) view.findViewById(R.id.imgCaSi);
        imgHinh.setImageResource(arrayBaihat.get(i).tenHinhAnh);
        return view;
    }
}
