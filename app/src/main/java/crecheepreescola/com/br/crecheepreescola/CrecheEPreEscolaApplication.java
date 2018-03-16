package crecheepreescola.com.br.crecheepreescola;

import android.annotation.SuppressLint;
import android.app.Application;
import android.util.Log;

/**
 * Created by Dayvison_Not on 15/03/2018.
 */

public class CrecheEPreEscolaApplication extends Application {
    private static final String TAG = "CrecheEPreEscolaApplication";
    private static CrecheEPreEscolaApplication instance = null;
    public static CrecheEPreEscolaApplication getInstance(){
        return instance;//Singleton
    }
    @SuppressLint("LongLogTag")
    @Override
    public void onCreate(){
        super.onCreate();
        Log.d(TAG, "CrecheEPreEscolaApplication.onCreate()");
        //Salva a instâcia para termos acesso como Singleton
        instance = this;
    }

    @SuppressLint("LongLogTag")
    @Override
    public void onTerminate(){
        super.onTerminate();
        Log.d(TAG,"CrecheEPreEscolaApplication.onTerminate()");
    }

}
