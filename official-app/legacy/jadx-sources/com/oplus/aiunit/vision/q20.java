package com.oplus.aiunit.vision;

import android.view.View;
import com.badlogic.gdx.Input;

/* JADX INFO: loaded from: classes13.dex */
public interface q20 extends Input, View.OnTouchListener, View.OnKeyListener, View.OnGenericMotionListener {
    void S1();

    void addGenericMotionListener(View.OnGenericMotionListener onGenericMotionListener);

    void addKeyListener(View.OnKeyListener onKeyListener);

    void h5();

    void m0(boolean z);

    void onPause();

    void onResume();

    void w4();
}
