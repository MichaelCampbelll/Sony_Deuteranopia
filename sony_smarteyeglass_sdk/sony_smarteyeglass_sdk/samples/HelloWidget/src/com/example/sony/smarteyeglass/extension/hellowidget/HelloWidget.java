/*
Copyright (c) 2011, Sony Mobile Communications Inc.
Copyright (c) 2014, Sony Corporation

 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this
 list of conditions and the following disclaimer.

 * Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution.

 * Neither the name of the Sony Mobile Communications Inc.
 nor the names of its contributors may be used to endorse or promote
 products derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.example.sony.smarteyeglass.extension.hellowidget;

import android.util.Log;

import com.sonyericsson.extras.liveware.extension.util.widget.BaseWidget;

/**
 * HelloWidget demonstrates how to implement a simple text widget.
 */
public final class HelloWidget extends BaseWidget {

    /** The widget WIDTH. */
    public static final int WIDTH = 380;

    /** The widget HEIGHT. */
    public static final int HEIGHT = 60;

    /**
     * Creates a widget extension.
     *
     * @param bundle .
     */
    public HelloWidget(final WidgetBundle bundle) {
        super(bundle);
    }

    @Override
    public void onStartRefresh() {
        Log.d(Constants.LOG_TAG, "startRefresh");
        // Send a UI when the widget is visible.
        showLayout(R.layout.layout_widget);
    }

    @Override
    public void onStopRefresh() {
        Log.d(Constants.LOG_TAG, "stopRefesh");
    }

    @Override
    public void onTouch(final int type, final int x, final int y) {
        Log.d(Constants.LOG_TAG, "onTouch() " + type);
    }

    @Override
    public int getWidth() {
        return WIDTH;
    }

    @Override
    public int getHeight() {
        return HEIGHT;
    }

    @Override
    public int getPreviewUri() {
        return 0;
    }

    @Override
    public int getName() {
        return R.string.app_name;
    }
}
