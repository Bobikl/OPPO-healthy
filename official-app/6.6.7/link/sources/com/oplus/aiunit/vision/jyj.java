package com.oplus.aiunit.vision;

import android.content.Context;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class jyj {
    public static final String KEY_BACKGROUNDMAXL = "DarkMode_BackgroundMaxL";
    public static final String KEY_DIALOGBGMAXL = "DarkMode_DialogBgMaxL";
    public static final String KEY_FOREGROUNDMINL = "DarkMode_ForegroundMinL";
    public final l2a a;
    public final boolean b;
    public boolean c;

    public jyj(l2a l2aVar, boolean z, boolean z2) {
        this.a = l2aVar;
        this.b = z;
        this.c = z2;
        if (z) {
            if (z2) {
                l2aVar.setBackgroundColor(-16777216);
            } else {
                l2aVar.setBackgroundColor(-1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.a.e("javascript:if(window.refreshNightMode){window.refreshNightMode();}", null);
    }

    public Context b() {
        return this.a.getContext();
    }

    public final void d(l2a l2aVar, boolean z) {
        if (l2aVar == null) {
            return;
        }
        if (z) {
            if (this.b) {
                l2aVar.setBackgroundColor(-16777216);
            }
            l2aVar.e("javascript:if(window.applyNightMode){window.applyNightMode();}", null);
        } else {
            if (this.b) {
                l2aVar.setBackgroundColor(-1);
            }
            l2aVar.e("javascript:if(window.removeNightMode){window.removeNightMode();}", null);
        }
    }

    public void e() {
        l2a l2aVar = this.a;
        if (l2aVar == null || l2aVar.getContext() == null || !re8.e(this.a.getContext().getResources().getConfiguration())) {
            return;
        }
        o0k.j(new Runnable() { // from class: com.oplus.aiunit.vision.iyj
            @Override // java.lang.Runnable
            public final void run() {
                this.i.c();
            }
        });
    }

    public void f(boolean z) {
        if (z != this.c) {
            this.c = z;
            d(this.a, z);
        }
    }

    @JavascriptInterface
    public String getDarkConfiguration() {
        l2a l2aVar = this.a;
        if (l2aVar == null || l2aVar.getContext() == null) {
            return "";
        }
        float f = Settings.Global.getFloat(this.a.getContext().getContentResolver(), KEY_DIALOGBGMAXL, -1.0f);
        float f2 = Settings.Global.getFloat(this.a.getContext().getContentResolver(), KEY_BACKGROUNDMAXL, -1.0f);
        float f3 = Settings.Global.getFloat(this.a.getContext().getContentResolver(), KEY_FOREGROUNDMINL, -1.0f);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("darkModeBackground", f2);
            jSONObject.put("darkModeForeground", f3);
            jSONObject.put("dialogBackground", f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public boolean isNight() {
        return this.c;
    }
}
