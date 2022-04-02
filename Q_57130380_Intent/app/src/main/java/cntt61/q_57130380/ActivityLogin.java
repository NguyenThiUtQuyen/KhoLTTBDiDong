package cntt61.q_57130380;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        String username = edUserName.getText().toString().trim();
        String pass = edPass.getText().toString().trim();
        String mail = edMail.getText().toString().trim();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (username.isEmpty() || pass.isEmpty() || mail.isEmpty()  ) {
            Toast.makeText(this, "Điền Username, Password, Email để đăng nhập", Toast.LENGTH_SHORT).show();
        }
        else {
            if(mail.matches(emailPattern)==false)
            {
                Toast.makeText(this, "Mail chưa đúng", Toast.LENGTH_SHORT).show();
            }
            else{
                Intent iTTDangNhap = new Intent(this,ActivityHome.class);
                Bundle bundle = new Bundle();
                bundle.putString("Name", username);
                bundle.putString("Pass", pass);
                bundle.putString("Mail", mail);

                iTTDangNhap.putExtra("UN", bundle);

                startActivity(iTTDangNhap);
                finish();
            }

        }

    }

}