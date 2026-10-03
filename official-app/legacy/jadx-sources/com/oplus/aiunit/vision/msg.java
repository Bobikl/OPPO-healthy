package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import com.heytap.usercenter.wrapper.SellModeWrapperHelper;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public class msg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final msg f14210c = new msg();
    public volatile boolean a;
    public volatile boolean b;

    public static msg a() {
        return f14210c;
    }

    public final boolean b() {
        try {
            Bundle bundle = b78.a().getPackageManager().getApplicationInfo("com.oppo.daydreamvideo", 128).metaData;
            if (bundle != null) {
                return bundle.getBoolean("UseAccountIdSdk");
            }
            return false;
        } catch (Exception e2) {
            a7b.f("SellModeUtils", "hasMetaData error. message=" + e2.getMessage());
            return false;
        }
    }

    public boolean c() {
        if (!m3k.h()) {
            a7b.f("SellModeUtils", "isSellMode not agree privacy");
            return false;
        }
        if (!this.b) {
            synchronized (msg.class) {
                if (!this.b) {
                    if (b()) {
                        this.a = true;
                    } else {
                        this.a = SellModeWrapperHelper.isSellMode(b78.a());
                    }
                    this.b = true;
                }
            }
        }
        return this.a;
    }

    public void d(Context context) {
        if (b()) {
            a7b.f("SellModeUtils", "registerSellMode old sell mode");
        } else {
            SellModeWrapperHelper.register(context);
        }
    }
}
