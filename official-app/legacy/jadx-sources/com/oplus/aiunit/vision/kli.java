package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.heytap.health.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes17.dex */
public class kli {
    public static final String TAG = "StageContext";
    public WeakReference<Context> a;
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LifecycleOwner f13349c;
    public Bundle d = new Bundle();

    public kli(Context context, View view, LifecycleOwner lifecycleOwner) {
        this.a = new WeakReference<>(context);
        this.b = view;
        this.f13349c = lifecycleOwner;
    }

    public void a(LifecycleObserver lifecycleObserver) {
        kwa.c(this.f13349c.getLifecycle(), lifecycleObserver);
    }

    public Context b() {
        return this.a.get();
    }

    public LifecycleOwner c() {
        return this.f13349c;
    }

    public void d(LifecycleObserver lifecycleObserver) {
        this.f13349c.getLifecycle().removeObserver(lifecycleObserver);
    }

    public void e(boolean z) {
        View viewFindViewById = this.b.findViewById(R.id.loading);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 0 : 8);
        }
    }

    public View f(int i) {
        FrameLayout frameLayout = (FrameLayout) this.b.findViewById(R.id.layout_oobe);
        View viewFindViewById = this.b.findViewById(R.id.layout_background);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        frameLayout.removeAllViews();
        View viewInflate = View.inflate(b(), i, null);
        frameLayout.addView(viewInflate);
        return viewInflate;
    }
}
