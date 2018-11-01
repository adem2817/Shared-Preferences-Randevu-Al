package e.adem2.sharedpreferencesrandevualma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(){

            public void run(){
                try{
                    sleep(2000);
                }catch (InterruptedException e){
                    Toast.makeText(SplashScreen.this, e+"", Toast.LENGTH_SHORT).show();
                }finally {
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }

        };
        thread.start();


    }
}
