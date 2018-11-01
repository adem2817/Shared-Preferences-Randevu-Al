package e.adem2.sharedpreferencesrandevualma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;

public class RandevuGoster extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randevu_goster);
        SessionManager sessionManager = new SessionManager(getApplicationContext());

        try {

            if (sessionManager != null) {
                HashMap<String, String> randevular = sessionManager.getHastaRandevu();
                for (String hastalar : randevular.keySet()) {
                    for (String randevu : randevular.values()) {
                        Toast.makeText(this, "HASTA: " + hastalar + " RANDEVU  "+randevu, Toast.LENGTH_SHORT).show();
                    }
                }
            }

        } catch (Exception e) {
        }

    }
}
