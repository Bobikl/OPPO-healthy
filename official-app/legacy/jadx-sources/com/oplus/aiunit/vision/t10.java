package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.badlogic.gdx.Application;

/* JADX INFO: loaded from: classes13.dex */
public interface t10 extends Application {
    public static final int MINIMUM_SDK = 19;

    zsh<cwa> A();

    Window C();

    wg0<Runnable> G();

    void R(boolean z);

    wg0<Runnable> g();

    Context getContext();

    Handler getHandler();

    q20 getInput();

    WindowManager getWindowManager();
}
