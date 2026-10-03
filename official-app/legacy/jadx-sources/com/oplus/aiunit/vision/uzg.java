package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/* JADX INFO: loaded from: classes17.dex */
public interface uzg {
    void a(Intent intent);

    default void b() {
        com.heytap.health.base.track.a.k().c(vik.TAG_POSTION1, 1);
    }

    View c(Activity activity);

    void d();

    k1h.a e(k1h.a aVar);

    default void onDestroy() {
    }
}
