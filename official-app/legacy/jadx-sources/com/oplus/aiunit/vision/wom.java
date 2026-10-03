package com.oplus.aiunit.vision;

import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: loaded from: classes12.dex */
public class wom extends ContentObserver {
    public static final String d = "VMS_IDLG_SDK_Observer";
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lkm f18341c;

    public wom(lkm lkmVar, int i, String str) {
        super(null);
        this.f18341c = lkmVar;
        this.b = i;
        this.a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        lkm lkmVar = this.f18341c;
        if (lkmVar != null) {
            lkmVar.d(this.b, this.a);
        } else {
            Log.e(d, "mIdentifierIdClient is null");
        }
    }
}
