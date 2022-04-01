package cntt61.q_57130380;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity {
    EditText edUserName, edPass, edMail;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnXacNhan = (Button) findViewById(R.id.btnXacNhan);
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DangNhap(view);
            }
        });
    }

    public void DangNhap(View view)
    {
        edUserName = (EditText) findViewById(R.id.edName);
        edPass = (EditText) findViewById(R.id.edPass);
        edMail = (EditText) findViewById(R.id.edEmail);
        String username = edUserName.getText().toString();
        String pass = edPass.getText().toString();
        String mail = edMail.getText().toString();

        Intent iTTDangNhap = new Intent(this,ActivityHome.class);
        Bundle bundle = new Bundle();
        bundle.putString("Name", username);

        iTTDangNhap.putExtra("UN", bundle);

        startActivity(iTTDangNhap);
        finish();
    }

}