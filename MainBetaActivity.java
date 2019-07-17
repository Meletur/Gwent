package com.meletur.gwent_beta;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

import com.meletur.gvintalpha_version10.R;

/**
 * Created by Мелетур on 07.06.2018.
 */

public class MainBetaActivity extends Activity{






    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_beta);
    }
}
