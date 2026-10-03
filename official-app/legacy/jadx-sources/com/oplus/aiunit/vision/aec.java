package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.nfc.NfcManager;
import android.text.TextUtils;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.wallet.BaseActivity;
import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.health.wallet.model.WatchImageInfo;
import com.heytap.sports.move.treadmill.ui.treadmill.SportDeviceConnectionActivity;
import com.oppo.lib.common.R$string;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class aec {
    public static volatile WatchImageInfo a = null;
    public static volatile boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f9317c = false;

    public class a extends jrc {
        public final /* synthetic */ StringBuilder h;
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f9318j;

        public a(StringBuilder sb, String str, CountDownLatch countDownLatch) {
            this.h = sb;
            this.i = str;
            this.f9318j = countDownLatch;
        }

        @Override // com.oplus.aiunit.vision.jrc
        public void l(String str) {
            t6b.b("NFCUtils", "NfcGetCplcTask post cplc:" + str);
            this.h.append(str);
            j7l.I(this.i, this.h.toString());
            z9g.p(qz0.mContext, j7l.KEY_CPLC, this.h.toString());
            this.f9318j.countDown();
        }
    }

    public class b extends jrc {
        public final /* synthetic */ StringBuilder h;
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f9319j;

        public b(StringBuilder sb, String str, CountDownLatch countDownLatch) {
            this.h = sb;
            this.i = str;
            this.f9319j = countDownLatch;
        }

        @Override // com.oplus.aiunit.vision.jrc
        public void l(String str) {
            t6b.b("NFCUtils", "NfcGetCplcTask post cplc:" + str);
            this.h.append(str);
            j7l.I(this.i, this.h.toString());
            z9g.p(qz0.mContext, j7l.KEY_CPLC, this.h.toString());
            this.f9319j.countDown();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public final /* synthetic */ BaseActivity i;

        public d(BaseActivity baseActivity) {
            this.i = baseActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.i.A();
            aec.z(this.i);
            dialogInterface.dismiss();
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ BaseActivity i;

        public e(BaseActivity baseActivity) {
            this.i = baseActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.i.m7();
            this.i.o7(true);
            if (aec.e(this.i)) {
                z0k.f(this.i).o(R$string.nfc_card_support_change_default_suc);
            } else {
                z0k.f(this.i).o(R$string.nfc_card_support_change_default_fail_retry);
                aec.y(this.i);
            }
        }
    }

    public static void c(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + str));
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            }
        } catch (Exception e2) {
            t6b.d("NFCUtils", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }

    public static boolean d(Context context) {
        return true;
    }

    public static boolean e(Context context) {
        NfcManager nfcManager = (NfcManager) context.getSystemService(SportDeviceConnectionActivity.BUNDLE_NFC);
        return (nfcManager == null || nfcManager.getDefaultAdapter() == null || !nfcManager.getDefaultAdapter().isEnabled()) ? false : true;
    }

    public static boolean f(Context context) {
        return e(context);
    }

    public static boolean g(Context context) {
        return qe0.E() ? context.getPackageManager().hasSystemFeature("android.hardware.nfc") : j7l.D();
    }

    public static String h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        t6b.a("oma cost time--> get default aid");
        ydc.n().H();
        TaskResult taskResultD = f70.d();
        t6b.a("oma cost time--> get default aid : " + (System.currentTimeMillis() - jCurrentTimeMillis));
        if (taskResultD.getResultCode() == 9000) {
            return s(taskResultD.getContent().getCommands());
        }
        return null;
    }

    public static synchronized String i() {
        StringBuilder sb = new StringBuilder();
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        if (TextUtils.isEmpty(currentConnectId)) {
            t6b.b("NFCUtils", "device mac null!");
        } else {
            if (!currentConnectId.equalsIgnoreCase(j7l.t())) {
                j7l.J(currentConnectId);
            }
            String strD = k7l.d(currentConnectId);
            if (e1j.n(strD)) {
                sb.append(strD);
                return sb.toString();
            }
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                new a(sb, currentConnectId, countDownLatch).h();
                countDownLatch.await(7L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                t6b.d("NFCUtils", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        }
        return sb.toString();
    }

    public static synchronized String j(String str) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            t6b.b("NFCUtils", "device mac null!");
            return sb.toString();
        }
        String strD = k7l.d(str);
        if (e1j.n(strD)) {
            sb.append(strD);
            return sb.toString();
        }
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new b(sb, str, countDownLatch).h();
            countDownLatch.await(8600L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            t6b.d("NFCUtils", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
        return sb.toString();
    }

    public static void k(BaseActivity baseActivity) {
        if (baseActivity.isFinishing()) {
            return;
        }
        new HealthAlertDialogBuilder(baseActivity).setTitle(R$string.nfc_open_tips_title).setMessage(R$string.nfc_open_tips).setPositiveButton(R$string.nfc_card_support_setdefault_pos_text, new d(baseActivity)).setNegativeButton(R$string.cancel, new c()).show();
    }

    public static boolean l() {
        return f9317c;
    }

    public static String m() {
        return j7l.C();
    }

    public static WatchImageInfo n() {
        return a;
    }

    public static synchronized String o() {
        String strH;
        strH = z9g.h(qz0.mContext, j7l.KEY_CPLC);
        return strH == null ? "" : strH.toUpperCase();
    }

    public static boolean p(String str) {
        return str != null && str.equalsIgnoreCase(j7l.u());
    }

    public static boolean q() {
        return b;
    }

    public static /* synthetic */ void r(int i, String str) {
        ydc.n().v(i, str);
    }

    public static String s(List<Command> list) {
        if (drk.e(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Command> it = list.iterator();
        while (it.hasNext()) {
            String result = it.next().getResult();
            sb.append(result.substring(0, result.length() - 4));
        }
        String string = sb.toString();
        t6b.b("NFCUtils", "parserDefaultAid final result -> " + string);
        return f70.g(string);
    }

    public static void t(final int i, final String str) {
        t6b.b("NFCUtils", "sendOpEvent, event: " + i + "  aid: " + str);
        new qv8(new Runnable() { // from class: com.oplus.aiunit.vision.zdc
            @Override // java.lang.Runnable
            public final void run() {
                aec.r(i, str);
            }
        }).start();
    }

    public static void u(boolean z) {
        b = z;
    }

    public static void v(boolean z) {
        f9317c = z;
    }

    public static void w(String str) {
        j7l.P(str);
    }

    public static void x(WatchImageInfo watchImageInfo) {
        a = watchImageInfo;
    }

    public static void y(Context context) {
        Intent intent = new Intent("android.settings.NFC_SETTINGS");
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static void z(BaseActivity baseActivity) {
        sr0.f(new e(baseActivity), 2000L);
    }
}
