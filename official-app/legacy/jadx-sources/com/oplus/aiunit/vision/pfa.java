package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.appcompat.app.AppCompatDialog;
import com.oplus.sau.common.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pfa {
    public Context a;
    public AppCompatDialog b;

    public pfa(Context context) {
        this.a = context;
        a(nfa.A(), context.getResources().getString(R$string.sau_dialog_upgrade_running));
    }

    public abstract void a(int i, String str);

    public abstract void b();
}
