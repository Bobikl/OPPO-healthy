package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.health.watchface.business.legacy.main.WatchFaceOverViewActivity;

/* JADX INFO: loaded from: classes19.dex */
public class c3g extends s51 {
    @Override // com.oplus.aiunit.vision.s51
    public void a(Context context, ej5 ej5Var) {
        x0.d().b("/watch_face/main/WatchFaceOverViewActivity").withString("currentMac", ej5Var.b()).withInt(WatchFaceOverViewActivity.BUNDLE_SKIP_PAGE_TYPE, 3).navigation(context);
    }

    @Override // com.oplus.aiunit.vision.s51
    public void b(Context context, ej5 ej5Var) {
        x0.d().b("/watch_face/main/WatchFaceOverViewActivity").withString("currentMac", ej5Var.b()).navigation(context);
    }

    @Override // com.oplus.aiunit.vision.s51
    public void d(AppCompatActivity appCompatActivity, ej5 ej5Var) {
        b(appCompatActivity, ej5Var);
    }
}
