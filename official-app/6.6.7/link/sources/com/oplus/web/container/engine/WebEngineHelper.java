package com.oplus.web.container.engine;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.l2a;
import com.oplus.web.container.engine.impl.CustomWebViewEngine;
import com.oplus.web.container.engine.impl.SystemWebViewEngine;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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

    public static l2a a(Context context, EngineType engineType, LifecycleOwner lifecycleOwner) {
        if (a.a[engineType.ordinal()] != 1) {
            return new SystemWebViewEngine().k(context, lifecycleOwner);
        }
        try {
            return new CustomWebViewEngine().c(context, lifecycleOwner);
        } catch (Exception unused) {
            return new SystemWebViewEngine().k(context, lifecycleOwner);
        }
    }

    public static l2a b(Context context, EngineType engineType, LifecycleOwner lifecycleOwner, boolean z) {
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
