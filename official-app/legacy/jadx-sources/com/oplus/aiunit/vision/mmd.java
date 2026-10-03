package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class mmd {
    public static final String OPERATION_PREFIX = "healthap";
    public final List<dx9> a;
    public lp b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n72 f14128c;
    public wba d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i35 f14129e;
    public k36 f;
    public mv8 g;
    public kpl h;

    public static final class a {
        public static final mmd a = new mmd();
    }

    public static mmd c() {
        return a.a;
    }

    public void a(Uri uri, String str) {
        if (this.a.isEmpty()) {
            a7b.b("OperationProxyFactory", "please register interceptor first");
            return;
        }
        int i = 0;
        while (i < this.a.size()) {
            int i2 = i + 1;
            if (i2 < this.a.size()) {
                this.a.get(i).b(this.a.get(i2));
            }
            i = i2;
        }
        this.a.get(0).e(uri, str, null);
    }

    public void b(Uri uri, String str, Intent intent) {
        if (this.a.isEmpty()) {
            a7b.b("OperationProxyFactory", "please register interceptor first");
            return;
        }
        int i = 0;
        while (i < this.a.size()) {
            int i2 = i + 1;
            if (i2 < this.a.size()) {
                this.a.get(i).b(this.a.get(i2));
            }
            i = i2;
        }
        this.a.get(0).e(uri, str, intent);
    }

    public void d(Activity activity, Uri uri, String str, int i, boolean z) {
        if (this.a.isEmpty()) {
            a7b.b("OperationProxyFactory", "please register interceptor first");
            return;
        }
        int i2 = 0;
        while (i2 < this.a.size()) {
            int i3 = i2 + 1;
            if (i3 < this.a.size()) {
                this.a.get(i2).b(this.a.get(i3));
            }
            i2 = i3;
        }
        this.a.get(0).c(activity, uri, str, i, z);
    }

    public void e(Activity activity, Uri uri, String str, View view) {
        if (this.a.isEmpty()) {
            a7b.b("OperationProxyFactory", "please register interceptor first");
            return;
        }
        int i = 0;
        while (i < this.a.size()) {
            int i2 = i + 1;
            if (i2 < this.a.size()) {
                this.a.get(i).b(this.a.get(i2));
            }
            i = i2;
        }
        this.a.get(0).a(activity, uri, str, ActivityTransitionUtil.d(activity, view), ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME + view.getId());
    }

    public mmd() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new lp();
        this.f14128c = new n72();
        this.d = new wba();
        this.f14129e = new i35();
        this.f = new k36();
        this.g = new mv8();
        this.h = new kpl();
        arrayList.add(this.b);
        arrayList.add(this.f14128c);
        arrayList.add(this.d);
        arrayList.add(this.f14129e);
        arrayList.add(this.f);
        arrayList.add(this.g);
        arrayList.add(this.h);
    }
}
