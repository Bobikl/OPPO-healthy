package com.oplus.aiunit.vision;

import android.app.UiModeManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.wallet.BaseActivity;
import com.oppo.lib.common.R$string;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class k7l {

    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f13187j;

        public a(boolean z, Context context) {
            this.i = z;
            this.f13187j = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.i) {
                ((BaseActivity) this.f13187j).finish();
            }
        }
    }

    public static boolean a() {
        if (gl4.managerApi.isConnected(j7l.t())) {
            return true;
        }
        Context context = qz0.mContext;
        z0k.f(context).s(context, R$string.wallet_disconnect_error);
        return false;
    }

    public static String b() {
        return d7l.a(gl4.managerApi.getCurrActiveMac()).c3();
    }

    public static String c() {
        return d7l.a(gl4.managerApi.getCurrActiveMac()).j8();
    }

    public static String d(String str) {
        Context context = qz0.mContext;
        String strH = z9g.h(context, str);
        if (e1j.l(strH)) {
            strH = j7l.s(str);
        } else {
            z9g.k(context, str);
            j7l.I(str, strH.toUpperCase());
        }
        if (!e1j.l(strH)) {
            t6b.b("getCplc", "cplc had stored before s: " + strH);
            z9g.p(context, j7l.KEY_CPLC, strH);
        }
        return strH;
    }

    public static boolean e(Context context) {
        if (qe0.E()) {
            return iba.b(b78.a(), com.alipay.sdk.m.u.a.b);
        }
        return new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startApp")).resolveActivity(context.getPackageManager()) != null;
    }

    public static boolean f() {
        UiModeManager uiModeManager = (UiModeManager) b78.a().getSystemService("uimode");
        if (uiModeManager != null) {
            return uiModeManager.getNightMode() == 2;
        }
        t6b.a("UiModeManager is null");
        return false;
    }

    public static boolean g(String str, String str2) {
        return Pattern.compile(str2).matcher(str).find();
    }

    public static boolean h() {
        return iba.b(b78.a(), "com.tencent.mm");
    }

    public static void i(String str) {
        x0.d().b("/main/ToolbarScreenWeb").withString("webUrl", str).navigation();
    }

    public static void j(Context context, boolean z) {
        new HealthAlertDialogBuilder(context).setTitle(R$string.wallet_watch_nfc_error_title).setMessage(R$string.wallet_watch_nfc_error_des).setPositiveButton(R$string.sure, new a(z, context)).setCancelable(!z).show();
    }
}
