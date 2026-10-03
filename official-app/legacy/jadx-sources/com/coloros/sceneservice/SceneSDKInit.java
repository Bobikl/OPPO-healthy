package com.coloros.sceneservice;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.coloros.sceneservice.i.e;
import com.coloros.sceneservice.j.c;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.SceneObjectFactory;
import com.coloros.sceneservice.sceneprovider.api.IClient;

/* JADX INFO: loaded from: classes13.dex */
public class SceneSDKInit {
    public static final String TAG = "SceneServiceInit";

    @SuppressLint({"StaticFieldLeak"})
    public static Context sContext = null;
    public static volatile boolean sIsSdkInit = false;

    public static boolean addClient(IClient iClient) {
        return c.getInstance().addClient(iClient);
    }

    public static void enableLogSwitch(boolean z) {
        f.a(z);
    }

    public static Context getContext() {
        return sContext;
    }

    public static void init(@NonNull Context context) {
        if (context == null) {
            f.d(TAG, "init: context is null");
            return;
        }
        sContext = context.getApplicationContext();
        e.getInstance().init(context);
        sIsSdkInit = true;
    }

    public static boolean isSdkInit() {
        return sIsSdkInit;
    }

    public static boolean removeClient(IClient iClient) {
        return c.getInstance().removeClient(iClient);
    }

    @Deprecated
    public static void setSceneObjectFactory(@NonNull SceneObjectFactory sceneObjectFactory) {
        SceneObjectFactory.setObjectFactory(sceneObjectFactory);
    }

    @Deprecated
    public static void init(@NonNull Context context, @NonNull SceneObjectFactory sceneObjectFactory) {
        init(context);
        if (sIsSdkInit) {
            SceneObjectFactory.setObjectFactory(sceneObjectFactory);
        }
    }
}
