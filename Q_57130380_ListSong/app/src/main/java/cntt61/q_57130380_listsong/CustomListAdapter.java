package cntt61.q_57130380_listsong;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private List<BaiHat> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(List<BaiHat> listData, Context aContext) {
        this.listData = listData;
        this.context = aContext;
        layoutInflater = LayoutInflater.from(aContext);
    }


    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.imgBH = (ImageView) convertView.findViewById(R.id.imgCaSi);
            holder.txtBH = (TextView) convertView.findViewById(R.id.tvTenBH);
            holder.txtCS = (TextView) convertView.findViewById(R.id.tvTenCS);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        BaiHat baiHat = this.listData.get(position);

        holder.txtBH.setText(baiHat.getTenBaiHat());
        int imageId = this.getMipmapResIdByName(baiHat.getTenHinhAnh());

        holder.imgBH.setImageResource(imageId);

        holder.txtCS.setText("Tên ca sĩ: " + baiHat.getTenCaSi());

        return convertView;
    }
    public int getMipmapResIdByName(String resName)  {
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "drawable", context.getPackageName());
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView imgBH;
        TextView txtBH;
        TextView txtCS;
    }
}
