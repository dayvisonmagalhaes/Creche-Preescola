package crecheepreescola.com.br.crecheepreescola.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import crecheepreescola.com.br.crecheepreescola.R;

public class MainActivity extends android.support.v4.app.FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();


    }
}
