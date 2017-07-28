// Copyright (c) 2013 Intel Corporation. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package ar.com.mediatel.totemviewer;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.xwalk.app.XWalkRuntimeActivityBase;

public class TotemviewerActivity extends XWalkRuntimeActivityBase {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void didTryLoadRuntimeView(View runtimeView) {
        if (runtimeView != null) {
            getRuntimeView().loadAppFromManifest("app://ar.com.mediatel.totemviewer/manifest.json");
        } else {
            TextView msgText = new TextView(this);
            msgText.setText("Crosswalk failed to initialize.");
            msgText.setTextSize(36);
            msgText.setTextColor(Color.BLACK);
            setContentView(msgText);
        }
    }
}
