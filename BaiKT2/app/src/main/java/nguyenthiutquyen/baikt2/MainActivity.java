package nguyenthiutquyen.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton raA,raB,raC;
    Button btnTinh;
    TextView txtKq;
    EditText edNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raA = (RadioButton) findViewById(R.id.radio_a);
        raB = (RadioButton) findViewById(R.id.radio_b);
        raC = (RadioButton) findViewById(R.id.radio_c);
        btnTinh = (Button) findViewById(R.id.btnCal);
        txtKq = (TextView) findViewById(R.id.tvTip);
        edNhap = (EditText) findViewById(R.id.edTip);


        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tienNhap = edNhap.getText().toString();
                int tien = Integer.parseInt(tienNhap);

                if(raA.isChecked() ==false && raB.isChecked() == false && raC.isChecked() == false)
                {
                    Toast.makeText(MainActivity.this, "Choose a value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (raA.isChecked())
                    {
                        double Tip = tien-tien*0.13;
                        String chuoiTip = String.valueOf(Tip);
                        txtKq.setText("Your tip will be "+Tip);
                    }

                    if (raB.isChecked())
                    {
                        double Tip = tien-tien*0.15;
                        String chuoiTip = String.valueOf(Tip);
                        txtKq.setText("Your tip will be "+Tip);
                    }

                    if (raC.isChecked())
                    {
                        double Tip = tien-tien*0.18;
                        String chuoiTip = String.valueOf(Tip);
                        txtKq.setText("Your tip will be "+Tip);
                    }
                }
            }
        });
    }
}