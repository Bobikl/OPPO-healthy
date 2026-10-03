package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.health.ui.R$string;

/* JADX INFO: loaded from: classes19.dex */
public abstract class s51 {
    public static final String TAG = "BaseJumpPage";

    public abstract void a(Context context, ej5 ej5Var);

    public abstract void b(Context context, ej5 ej5Var);

    public void c(AppCompatActivity appCompatActivity, int i, ej5 ej5Var) {
        y0k.i(appCompatActivity.getString(R$string.watch_face_wrong_device_type));
        ltl.i(TAG, "device is not support this function.");
    }

    public abstract void d(AppCompatActivity appCompatActivity, ej5 ej5Var);
}
