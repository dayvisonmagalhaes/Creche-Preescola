package crecheepreescola.com.br.crecheepreescola.activity;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import crecheepreescola.com.br.crecheepreescola.R;
import crecheepreescola.com.br.crecheepreescola.fragment.TurmasFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolBar();

        //replaceFragment(new TurmasFragment());



    }

    //private void replaceFragment (Fragment frag){
     //   getSupportFragmentManager().beginTransaction().replace(R.id.listViewContainer,frag, "TAG").commit();
    //}
}
