package cntt61.q_57130380;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityHome extends AppCompatActivity {
    TextView txtUN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Lấy intent của Activity này
        Intent intent = getIntent();
        // lấy thùng chứa Bundle với tên giao dịch là "GoiTin"
        Bundle bundle = intent.getBundleExtra("UN");
        String usernameNhan = bundle.getString("Name");

        txtUN = (TextView) findViewById(R.id.tvName);

        txtUN.setText(usernameNhan);
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode==8000){
            if (resultCode == RESULT_OK) {
                String usernameNhan = data.getStringExtra("UN");

                txtUN = (TextView) findViewById(R.id.tvName);

                txtUN.setText(usernameNhan);
            } else Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_SHORT).show();
        }
        else
            super.onActivityResult(requestCode, resultCode, data);
    }*/
}