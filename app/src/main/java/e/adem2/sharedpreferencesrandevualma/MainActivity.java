package e.adem2.sharedpreferencesrandevualma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button kurumsal,randevuKaydet,hastaBilgileri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kurumsal = findViewById(R.id.kurumsal);
        randevuKaydet = findViewById(R.id.randevu);
        hastaBilgileri = findViewById(R.id.hasta_bilgileri);

        randevuKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecis = new Intent(MainActivity.this,RandevuKaydet.class);
                startActivity(gecis);
            }
        });

        kurumsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Kurumsal.class);
                startActivity(intent);
            }
        });

        hastaBilgileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(MainActivity.this,RandevuGoster.class);
                startActivity(intent2);
                finish();
            }
        });

    }
}
