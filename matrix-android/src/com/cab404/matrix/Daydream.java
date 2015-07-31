package com.cab404.matrix;

import android.annotation.TargetApi;
import android.os.Build;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidDaydream;

/**
 * Daydream
 * @author cab404
 */
public class Daydream extends AndroidDaydream {

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setInteractive(false);
        Settings.local_resolver = getFilesDir().getAbsolutePath() + "/";

        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        initialize(new Matrix(), cfg);

    }
}
