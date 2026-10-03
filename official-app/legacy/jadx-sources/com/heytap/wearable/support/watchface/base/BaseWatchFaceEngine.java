package com.heytap.wearable.support.watchface.base;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"HandlerLeak"})
public abstract class BaseWatchFaceEngine {

    public class FrontLayer extends View {
        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            System.currentTimeMillis();
            throw null;
        }
    }
}
