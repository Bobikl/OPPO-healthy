package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.appcompat.app.AppCompatDialog;
import com.oplus.sau.common.R$string;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class xga {
    public Context a;
    public AppCompatDialog b;

    public xga(Context context) {
        this.a = context;
        a(vga.A(), context.getResources().getString(R$string.sau_dialog_upgrade_running));
    }

    public abstract void a(int i, String str);

    public abstract void b();
}
