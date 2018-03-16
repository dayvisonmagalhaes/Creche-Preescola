package crecheepreescola.com.br.crecheepreescola.activity;


import android.support.v7.widget.Toolbar;

import crecheepreescola.com.br.crecheepreescola.R;

/**
 * Created by Dayvison_Not on 15/03/2018.
 */

public class BaseActivity extends livroandroid.lib.activity.BaseActivity {

   protected void setUpToolBar(){
       Toolbar toolbar = (Toolbar) findViewById(R.id.toobar);
       if (toolbar != null)
           setSupportActionBar(toolbar);
   }
}
