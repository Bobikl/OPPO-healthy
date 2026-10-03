package com.oplus.web.container.engine;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.e1a;
import com.oplus.web.container.engine.impl.CustomWebViewEngine;
import com.oplus.web.container.engine.impl.SystemWebViewEngine;

/* JADX INFO: loaded from: classes2.dex */
public class WebEngineHelper {

    public enum EngineType {
        SYSTEM,
        CUSTOM
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EngineType.values().length];
            a = iArr;
            try {
                iArr[EngineType.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EngineType.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static e1a a(Context context, EngineType engineType, LifecycleOwner lifecycleOwner) {
        if (a.a[engineType.ordinal()] != 1) {
            return new SystemWebViewEngine().k(context, lifecycleOwner);
        }
        try {
            return new CustomWebViewEngine().c(context, lifecycleOwner);
        } catch (Exception unused) {
            return new SystemWebViewEngine().k(context, lifecycleOwner);
        }
    }

    public static e1a b(Context context, EngineType engineType, LifecycleOwner lifecycleOwner, boolean z) {
        if (a.a[engineType.ordinal()] != 1) {
            return new SystemWebViewEngine(z).k(context, lifecycleOwner);
        }
        try {
            return new CustomWebViewEngine().c(context, lifecycleOwner);
        } catch (Exception unused) {
            return new SystemWebViewEngine(z).k(context, lifecycleOwner);
        }
    }
}
