package com.oplus.aiunit.vision;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.oplus.sau.common.R$string;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kfa {
    public static final int TYPE_ALREADY_DOWNLOAD = 2;
    public static final int TYPE_BUTTON_DOWNLOAD_EXIT = 9;
    public static final int TYPE_BUTTON_DOWNLOAD_LATER = 8;
    public static final int TYPE_BUTTON_INSTALL_EXIT = 7;
    public static final int TYPE_BUTTON_INSTALL_LATER = 6;
    public static final int TYPE_MOBILE_PROMPT = 1;
    public static final int TYPE_NO_PROMPT = 0;
    public Dialog a;
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13259c = "";
    public String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13260e = "";
    public Context f;
    public a g;

    public interface a {
        void onClick(int i);
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SensorsDataInstrumented
        public void onClick(DialogInterface dialogInterface, int i) {
            kfa.this.g.onClick(i);
            SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
        }
    }

    public kfa(Context context) {
        this.f = context;
        a();
    }

    public final void a() {
        b(nfa.A());
    }

    public abstract void b(int i);

    public void c() {
        Dialog dialog = this.a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public DialogInterface.OnClickListener d() {
        return new b();
    }

    public Dialog e() {
        return this.a;
    }

    public void f(int i) {
        if (this.a != null) {
            switch (i) {
                case 6:
                    g(this.f.getString(R$string.sau_dialog_install_later), this.f.getString(R$string.sau_dialog_install_now));
                    this.a.setCancelable(true);
                    break;
                case 7:
                    g(this.f.getString(R$string.sau_dialog_upgrade_exit), this.f.getString(R$string.sau_dialog_install_now));
                    this.a.setCancelable(false);
                    break;
                case 8:
                    g(this.f.getString(R$string.sau_dialog_upgrade_later), this.f.getString(R$string.sau_dialog_download_install));
                    this.a.setCancelable(true);
                    break;
                case 9:
                    g(this.f.getString(R$string.sau_dialog_upgrade_exit), this.f.getString(R$string.sau_dialog_download_install));
                    this.a.setCancelable(false);
                    break;
            }
        }
    }

    public abstract void g(String str, String str2);

    public void h(int i) {
        if (i == 1) {
            this.b = this.f.getString(R$string.sau_dialog_mobile_propmt);
        } else {
            if (i != 2) {
                return;
            }
            this.b = this.f.getString(R$string.sau_dialog_downloaded_prompt);
        }
    }

    public void i(String str) {
        this.f13259c = this.f.getString(R$string.sau_dialog_size) + str;
    }

    public void j(String str) {
        this.f13260e = this.f.getString(R$string.sau_dialog_description_head) + '\n' + str;
    }

    public void k(String str) {
        this.d = this.f.getString(R$string.sau_dialog_vername) + str;
    }

    public void l() {
        Dialog dialog = this.a;
        if (dialog != null) {
            dialog.show();
        }
    }

    public void setOnButtonClickListener(a aVar) {
        this.g = aVar;
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialog = this.a;
        if (dialog != null) {
            dialog.setOnCancelListener(onCancelListener);
        }
    }
}
