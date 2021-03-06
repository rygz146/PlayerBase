/*
 * Copyright 2017 jiajunhui<junhui_jia@163.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.kk.taurus.playerbase.inter;

import android.view.Surface;
import android.view.View;

import com.kk.taurus.playerbase.setting.AspectRatio;

/**
 * Created by Taurus on 2017/11/19.
 */

public interface IRender {

    String TAG = "IRender";

    void setRenderCallback(IRenderCallback renderCallback);

    void setVideoRotation(int degree);

    void onUpdateAspectRatio(AspectRatio aspectRatio);

    void onUpdateVideoSize(int videoWidth, int videoHeight);

    View getRenderView();


    interface IRenderCallback{
        void onSurfaceCreated(IRender render, Surface surface, int width, int height);
        void onSurfaceChanged(IRender render, Surface surface, int width, int height);
        void onSurfaceDestroy(IRender render,Surface surface);
        void onRenderViewAttachedToWindow(IRender render);
        void onRenderViewDetachedFromWindow(IRender render);
    }

}
