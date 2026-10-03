package com.heytap.health.network.wiget;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.R$style;

/* JADX INFO: loaded from: classes17.dex */
public class CustomProgressDialog extends Dialog {
    public CustomProgressDialog(Context context, String str) {
        this(context, R$style.lib_base_NetworkCustomProgressDialog, str);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
    }

    public CustomProgressDialog(Context context, int i, String str) {
        super(context, i);
        setContentView(R$layout.lib_base_network_dialog_progress_loading);
        getWindow().getAttributes().gravity = 17;
        TextView textView = (TextView) findViewById(R$id.network_progress_text);
        if (textView != null) {
            textView.setText(str);
        }
    }
}
