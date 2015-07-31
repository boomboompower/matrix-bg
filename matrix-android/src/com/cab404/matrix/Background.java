package com.cab404.matrix;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidLiveWallpaperService;

/**
 * @author cab404
 */
public class Background extends AndroidLiveWallpaperService {

    @Override
    public void onCreateApplication() {
        super.onCreateApplication();
        Settings.local_resolver = getFilesDir().getAbsolutePath() + "/";
        Matrix.isPreview = notifiedPreviewState;

        initialize(new Matrix());
    }



}
