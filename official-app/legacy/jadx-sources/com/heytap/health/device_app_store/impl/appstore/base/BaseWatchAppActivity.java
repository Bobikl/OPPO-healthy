package com.heytap.health.device_app_store.impl.appstore.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.heytap.health.base.base.BaseActivity;
import com.oplus.aiunit.vision.jm9;
import com.oplus.aiunit.vision.v91;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseWatchAppActivity<V extends jm9, P extends v91<V>> extends BaseActivity implements jm9 {
    public final String m = getClass().getSimpleName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Activity f3992n;
    public P o;

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public abstract int l7();

    public void m7(Intent intent) {
        P p = this.o;
        if (p != null) {
            p.e(intent);
        }
    }

    public void n7(Bundle bundle) {
        P p = this.o;
        if (p != null) {
            p.f(bundle);
        }
    }

    public abstract P o7();

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3992n = this;
        setContentView(l7());
        P p = (P) o7();
        this.o = p;
        if (p != null) {
            p.a(this);
        }
        m7(getIntent());
        p7(bundle);
        n7(bundle);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        P p = this.o;
        if (p != null) {
            p.b();
        }
    }

    public abstract void p7(Bundle bundle);
}
