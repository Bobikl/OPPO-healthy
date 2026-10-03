package com.oplus.smartsdk;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class PluginContext extends ContextThemeWrapper {
    private Context mHostContext;

    @RequiresApi(api = 23)
    public PluginContext(Context context, Resources.Theme theme, Context context2) {
        super(context, theme);
        this.mHostContext = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        Context context = this.mHostContext;
        return context != null ? context.getApplicationContext() : super.getApplicationContext();
    }
}
