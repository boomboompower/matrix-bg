package com.cab404.matrix;

import com.badlogic.gdx.backends.android.AndroidDaydream;

/**
 *
 * @author cab404
 */
public class Daydream extends AndroidDaydream {

    @Override
    public void onCreate() {
        super.onCreate();
        Settings.local_resolver = getFilesDir().getAbsolutePath() + "/";

        initialize(new Matrix(), false);

    }
}
