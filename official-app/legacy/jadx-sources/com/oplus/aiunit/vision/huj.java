package com.oplus.aiunit.vision;

import android.content.Context;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import com.heytap.webview.extension.protocol.ThemeConst;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class huj {
    public static final String KEY_BACKGROUNDMAXL = "DarkMode_BackgroundMaxL";
    public static final String KEY_DIALOGBGMAXL = "DarkMode_DialogBgMaxL";
    public static final String KEY_FOREGROUNDMINL = "DarkMode_ForegroundMinL";
    public final e1a a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12281c;

    public huj(e1a e1aVar, boolean z, boolean z2) {
        this.a = e1aVar;
        this.b = z;
        this.f12281c = z2;
        if (z) {
            if (z2) {
                e1aVar.setBackgroundColor(-16777216);
            } else {
                e1aVar.setBackgroundColor(-1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.a.e(ThemeConst.Function.JS_TEMPLATE_NOTIFY_DARK_LEVEL_MODE, null);
    }

    public Context b() {
        return this.a.getContext();
    }

    public final void d(e1a e1aVar, boolean z) {
        if (e1aVar == null) {
            return;
        }
        if (z) {
            if (this.b) {
                e1aVar.setBackgroundColor(-16777216);
            }
            e1aVar.e(ThemeConst.Function.JS_TEMPLATE_NOTIFY_NIGHT_MODE, null);
        } else {
            if (this.b) {
                e1aVar.setBackgroundColor(-1);
            }
            e1aVar.e(ThemeConst.Function.JS_TEMPLATE_NOTIFY_DAY_MODE, null);
        }
    }

    public void e() {
        e1a e1aVar = this.a;
        if (e1aVar == null || e1aVar.getContext() == null || !od8.e(this.a.getContext().getResources().getConfiguration())) {
            return;
        }
        mwj.j(new Runnable() { // from class: com.oplus.aiunit.vision.guj
            @Override // java.lang.Runnable
            public final void run() {
                this.i.c();
            }
        });
    }

    public void f(boolean z) {
        if (z != this.f12281c) {
            this.f12281c = z;
            d(this.a, z);
        }
    }

    @JavascriptInterface
    public String getDarkConfiguration() {
        e1a e1aVar = this.a;
        if (e1aVar == null || e1aVar.getContext() == null) {
            return "";
        }
        float f = Settings.Global.getFloat(this.a.getContext().getContentResolver(), "DarkMode_DialogBgMaxL", -1.0f);
        float f2 = Settings.Global.getFloat(this.a.getContext().getContentResolver(), "DarkMode_BackgroundMaxL", -1.0f);
        float f3 = Settings.Global.getFloat(this.a.getContext().getContentResolver(), "DarkMode_ForegroundMinL", -1.0f);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("darkModeBackground", f2);
            jSONObject.put("darkModeForeground", f3);
            jSONObject.put("dialogBackground", f);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public boolean isNight() {
        return this.f12281c;
    }
}
