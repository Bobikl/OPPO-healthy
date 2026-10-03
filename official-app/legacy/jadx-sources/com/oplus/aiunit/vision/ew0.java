package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes19.dex */
public class ew0 extends s51 {
    @Override // com.oplus.aiunit.vision.s51
    public void a(Context context, ej5 ej5Var) {
        x0.d().b("/bandfaceapi/BandOnlineActivity").withString("currentMac", ej5Var.b()).navigation(context);
    }

    @Override // com.oplus.aiunit.vision.s51
    public void b(Context context, ej5 ej5Var) {
        x0.d().b("/bandfaceapi/WatchFaceOverViewActivity").withString("currentMac", ej5Var.b()).withInt("WatchFaceManagerContract.CONNECT_STATUS", ej5Var.a()).navigation(context);
    }

    @Override // com.oplus.aiunit.vision.s51
    public void d(AppCompatActivity appCompatActivity, ej5 ej5Var) {
        b(appCompatActivity, ej5Var);
    }
}
