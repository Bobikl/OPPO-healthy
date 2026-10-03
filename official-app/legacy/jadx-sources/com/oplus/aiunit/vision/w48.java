package com.oplus.aiunit.vision;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.heytap.health.base.R$string;
import com.heytap.health.webservice.R$id;
import com.heytap.health.webservice.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public class w48 implements pp6 {
    public static /* synthetic */ void c(z62 z62Var, View view) {
        if (z62Var != null) {
            z62Var.F();
        }
    }

    @Override // com.oplus.aiunit.vision.pp6
    public View a(final z62 z62Var, int i, String str) {
        View viewInflate = View.inflate(z62Var.t().getContext() instanceof Activity ? z62Var.t().getContext() : z62Var.s().i(), R$layout.lib_core_browser_generic_error, null);
        Object drawable = ((ImageView) viewInflate.findViewById(R$id.iv_error)).getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        Button button = (Button) viewInflate.findViewById(R$id.btn_refresh);
        button.setVisibility(0);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.v48
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w48.c(z62Var, view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_error);
        if (i == -2 || i == -6) {
            textView.setText(R$string.lib_base_webview_network_connect_failed);
        } else if (i == -3 || i == -4 || i == -5 || i == -7 || i == -9 || i == -10 || i == -11 || i == -13 || i == -14 || i == -15 || i == -16) {
            textView.setText(R$string.lib_base_webview_generic_error);
        } else if (i == -8) {
            textView.setText(R$string.lib_base_webview_time_out);
        } else if (i == -12) {
            textView.setText(R$string.lib_base_webview_bad_url);
        } else if (i == -100) {
            textView.setText(R$string.lib_base_webview_generic_error);
        }
        return viewInflate;
    }
}
