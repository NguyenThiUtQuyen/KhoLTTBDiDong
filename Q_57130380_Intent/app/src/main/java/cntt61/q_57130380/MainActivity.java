package cntt61.q_57130380;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button nutChuyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nutChuyen = (Button) findViewById(R.id.btnLogin);
        nutChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChuyenManHinh(view);
            }
        });
    }
    public void ChuyenManHinh(View view)
    {
        Intent iManHinhLogin = new Intent(this,ActivityLogin.class);
        startActivity(iManHinhLogin);
    }
}