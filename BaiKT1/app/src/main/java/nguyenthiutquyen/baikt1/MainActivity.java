package nguyenthiutquyen.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edUserName, edPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DangNhap(View view)
    {

        edUserName = (EditText) findViewById(R.id.edName);
        edPass = (EditText) findViewById(R.id.edPass);
        String username = edUserName.getText().toString().trim();
        String pass = edPass.getText().toString().trim();
        if (username.isEmpty() || pass.isEmpty() ) {
            Toast.makeText(this, "Điền Username, Password, Email để đăng nhập", Toast.LENGTH_SHORT).show();
        }
        else {
            if(username == "maicuongtho" && pass == "Cntt60ntu") {
                Toast.makeText(this, "Username and Password is correct", Toast.LENGTH_SHORT).show();
            }
            else Toast.makeText(this, "Username and Password is not correct", Toast.LENGTH_SHORT).show();
        }

    }
}