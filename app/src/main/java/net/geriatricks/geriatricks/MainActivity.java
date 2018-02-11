package net.geriatricks.geriatricks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runTips(View view){
        Intent intent = new Intent(MainActivity.this, TipsText.class);
        startActivity(intent);
    }

    public void runTree(View view){
        Intent intent = new Intent(MainActivity.this, TreeText.class);
        startActivity(intent);
    }

    public void runSE(View view){
        Intent intent = new Intent(MainActivity.this, SEText.class);
        startActivity(intent);
    }

    public void runHeart(View view){
        Intent intent = new Intent(MainActivity.this, HeartText.class);
        startActivity(intent);
    }

    public void runPT (View view) {
            goToUrl ( "http://www.myathomept.com");
        }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }



    public void runHealth(View view){
        Intent intent = new Intent(MainActivity.this, HealthText.class);
        startActivity(intent);
    }
}
