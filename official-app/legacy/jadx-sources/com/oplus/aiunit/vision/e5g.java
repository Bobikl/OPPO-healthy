package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.oplus.sauaar.R$string;
import com.oplus.sauaar.R$style;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes2.dex */
public class e5g extends kfa {
    public AlertDialog h;
    public COUIAlertDialogBuilder i;

    public e5g(Context context) {
        super(context);
    }

    @Override // com.oplus.aiunit.vision.kfa
    public void b(int i) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f, R$style.Theme_COUI_Main);
        sm2.i().b(contextThemeWrapper);
        if (i == 0) {
            this.i = new COUIAlertDialogBuilder(contextThemeWrapper);
        } else {
            this.i = new COUIAlertDialogBuilder(contextThemeWrapper, i);
        }
        AlertDialog alertDialogCreate = this.i.setTitle(R$string.sau_dialog_new_version).create();
        this.h = alertDialogCreate;
        this.a = alertDialogCreate;
    }

    @Override // com.oplus.aiunit.vision.kfa
    public void g(String str, String str2) {
        AlertDialog alertDialog = this.h;
        if (alertDialog != null) {
            alertDialog.setButton(-2, str, d());
            this.h.setButton(-1, str2, d());
        }
    }

    @Override // com.oplus.aiunit.vision.kfa
    public void l() {
        COUIAlertDialogBuilder cOUIAlertDialogBuilder;
        if (this.h == null || (cOUIAlertDialogBuilder = this.i) == null) {
            return;
        }
        cOUIAlertDialogBuilder.setMessage(m());
        this.h.setMessage(m());
        this.h.show();
        TextView textView = (TextView) this.h.findViewById(R.id.message);
        if (textView != null) {
            textView.setFallbackLineSpacing(false);
        }
        this.i.updateViewAfterShown();
    }

    public final String m() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(this.b);
            sb.append(Weather.SEPARATOR);
        }
        sb.append(this.d);
        sb.append(Weather.SEPARATOR);
        sb.append(this.f13259c);
        sb.append(Weather.SEPARATOR);
        sb.append(Weather.SEPARATOR);
        sb.append(this.f13260e);
        return sb.toString();
    }
}
