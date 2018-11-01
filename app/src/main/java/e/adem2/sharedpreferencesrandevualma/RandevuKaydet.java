package e.adem2.sharedpreferencesrandevualma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RandevuKaydet extends AppCompatActivity {

    Button kaydet;
    EditText hastaEdit,randevuEdit;
    String hasta,randevu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randevu_kaydet);


        kaydet = findViewById(R.id.kaydet);
        hastaEdit = findViewById(R.id.hasta);
        randevuEdit = findViewById(R.id.randevu);

        final SessionManager sessionManager = new SessionManager(getApplicationContext());
        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               hasta =  hastaEdit.getText().toString();
               randevu =  randevuEdit.getText().toString();
               sessionManager.createHastaSession(hasta,randevu);

               Intent intent = new Intent(RandevuKaydet.this,MainActivity.class);
               startActivity(intent);
            }
        });

    }
}
