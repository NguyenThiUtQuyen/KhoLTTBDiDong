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
        edUserName = (EditText) findViewById(R.id.edName);
        edPass = (EditText) findViewById(R.id.edPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int usersize = edUserName.getText().length();
                int passsize = edPass.getText().length();
                String username = edUserName.getText().toString().trim();
                String pass = edPass.getText().toString().trim();
                String u = new String("maicuongtho") ;
                String p = new String("cntt");
                if(usersize <= 0 || passsize <= 0)
                {
                    Toast.makeText(MainActivity.this, "Please enter Username and Password! ", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    if( username.equals(u) == true && pass.equals(p)==true)
                    {
                        Toast.makeText(MainActivity.this, "Username and Password is correct"+username+ "-"+pass, Toast.LENGTH_SHORT).show();
                    }
                    else
                    { Toast.makeText(MainActivity.this, "Username and Password is not correct"+username+ "-"+pass, Toast.LENGTH_SHORT).show();}
                }
            }
        });
    }

}