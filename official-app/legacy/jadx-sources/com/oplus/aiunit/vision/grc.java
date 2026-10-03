package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import androidx.core.os.BuildCompat;

/* JADX INFO: loaded from: classes18.dex */
public class grc {
    public PendingIntent a;
    public NfcAdapter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11868c = false;

    public void a(Activity activity) {
        if (this.f11868c && k6l.c().e()) {
            Intent intent = new Intent(activity, activity.getClass());
            intent.setFlags(536870912);
            this.a = PendingIntent.getActivity(activity, 0, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
            this.b = NfcAdapter.getDefaultAdapter(activity);
        }
    }

    public void b(boolean z) {
        this.f11868c = z;
    }

    public void c(Activity activity) {
        NfcAdapter nfcAdapter;
        if (this.f11868c && k6l.c().e() && (nfcAdapter = this.b) != null) {
            nfcAdapter.enableForegroundDispatch(activity, this.a, null, null);
        }
    }

    public void d(Activity activity) {
        NfcAdapter nfcAdapter;
        if (this.f11868c && k6l.c().e() && (nfcAdapter = this.b) != null) {
            nfcAdapter.disableForegroundDispatch(activity);
        }
    }
}
