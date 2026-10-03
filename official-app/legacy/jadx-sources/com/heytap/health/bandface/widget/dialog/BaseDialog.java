package com.heytap.health.bandface.widget.dialog;

import android.R;
import android.app.Dialog;
import android.content.Context;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseDialog extends Dialog {
    public BaseDialog(Context context) {
        super(context);
        setContentView(a());
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        b();
    }

    public abstract int a();

    public abstract void b();
}
