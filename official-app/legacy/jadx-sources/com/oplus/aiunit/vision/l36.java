package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import com.client.platform.opensdk.pay.download.resource.Colors;
import com.oplus.pay.opensdk.download.R$string;
import com.oplus.pay.opensdk.download.ui.DownloadStatusDialog;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class l36 {
    public static final int STATE_DEFAULT = 0;
    public static final int STATE_ERROR = 3;
    public static final int STATE_NORMAL = 1;
    public static final int STATE_PAUSE = 2;

    @SuppressLint({"StaticFieldLeak"})
    public DownloadStatusDialog b;
    public int a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public String f13506c = null;
    public String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13507e = null;
    public String f = "";
    public boolean g = false;
    public boolean h = true;
    public int i = 1;

    public class a implements ygd {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ u26 b;

        public a(Activity activity, u26 u26Var) {
            this.a = activity;
            this.b = u26Var;
        }

        @Override // com.oplus.aiunit.vision.ygd
        public void leftBtnClicked() {
            h26.c(this.a, this.b, 10044);
            v26.b(this.a);
            l36.this.b.dismiss();
        }

        @Override // com.oplus.aiunit.vision.ygd
        public void rightBtnClicked() {
            l36.this.n(this.a);
            l36 l36Var = l36.this;
            l36Var.i = l36Var.g ? 2 : 5;
            l36.this.o(BizResult.SUCCESS.getValue(), TransactionProcessStatusCodes.CODE_00_000_0014.getStatusCode(), "", -1);
        }
    }

    public class b implements dhd {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Activity activity, Exception exc) {
            if (l36.this.g) {
                return;
            }
            l36.this.i(activity, 3);
            l36.this.i = 3;
            String message = exc.getMessage();
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_00012;
            nbe.e(message, "-1", value, transactionProcessStatusCodes.getStatusCode(), BizResult.ERROR.getValue(), transactionProcessStatusCodes.getDesc() + l36.this.i + "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, String str2, int i) {
            l36.this.b.setPercent(str + "/" + str2);
            l36.this.b.setProgress(i);
        }

        @Override // com.oplus.aiunit.vision.dhd
        public void a(final Exception exc) {
            qae.c("Exception=" + exc);
            final Activity activity = this.a;
            activity.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.n36
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.e(activity, exc);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.dhd
        public void b(long j2, Long l2) {
            final int iLongValue = (int) (((j2 * 1.0f) / l2.longValue()) * 100.0f);
            qae.c("progress=" + iLongValue);
            final String str = jt7.a(j2, 1048576L, 2) + "M";
            final String str2 = jt7.a(l2.longValue(), 1048576L, 2) + "M";
            this.a.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.m36
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.f(str, str2, iLongValue);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.dhd
        public void g(File file) {
            l36.this.b.dismiss();
            qae.c("onDownloadSuccess");
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
            if (h26.b(this.a)) {
                zqk.b(this.a, file);
            } else {
                l36.this.f = file.getAbsolutePath();
            }
            l36.this.i = 4;
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0016;
            nbe.e("", "-1", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc() + l36.this.i + "");
        }
    }

    public class c implements chd {
        public final /* synthetic */ Activity a;

        public c(Activity activity) {
            this.a = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Activity activity) {
            l36.this.i(activity, 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Activity activity) {
            l36.this.i(activity, 1);
        }

        @Override // com.oplus.aiunit.vision.chd
        public void onFailed(Exception exc) {
            final Activity activity = this.a;
            activity.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.p36
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.c(activity);
                }
            });
            l36.this.i = 3;
            String message = exc.getMessage();
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_00011;
            nbe.e(message, "-1", value, transactionProcessStatusCodes.getStatusCode(), BizResult.ERROR.getValue(), transactionProcessStatusCodes.getDesc() + l36.this.i + "");
        }

        @Override // com.oplus.aiunit.vision.chd
        public void onSuccess(String str) {
            qae.c("onSuccess::" + str);
            l36.this.f13506c = str;
            final Activity activity = this.a;
            activity.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.o36
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.d(activity);
                }
            });
            l36.this.i = 1;
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0017;
            nbe.e("", "-1", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc() + l36.this.i + "");
        }
    }

    public class d extends BroadcastReceiver {
        public final /* synthetic */ Activity a;

        public d(Activity activity) {
            this.a = activity;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            String action = intent.getAction();
            qae.c("BroadcastReceiver:" + action);
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (TextUtils.isEmpty(l36.this.f)) {
                    return;
                }
                zqk.b(context, new File(l36.this.f));
                l36.this.f = "";
                this.a.unregisterReceiver(this);
                return;
            }
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                l36.this.f = "";
                l36.this.b.dismiss();
                v26.b(this.a);
            }
        }
    }

    public void i(Activity activity, int i) {
        this.a = i;
        if (i != 1) {
            if (i == 2) {
                this.b.setLeftBtnText(activity.getResources().getString(R$string.update_dialog_cancel));
                this.b.setRightBtnText(activity.getResources().getString(R$string.download_button_resume));
                this.b.setState(activity.getResources().getString(R$string.download_title_paused));
                this.b.setStateTextColor(Colors.new_main_color);
                v26.f();
                return;
            }
            if (i != 3) {
                return;
            }
            this.b.setLeftBtnText(activity.getResources().getString(R$string.update_dialog_cancel));
            this.b.setRightBtnText(activity.getResources().getString(R$string.download_button_resume));
            this.b.setState(activity.getResources().getString(R$string.download_title_failed));
            this.b.setStateTextColor(Colors.error);
            v26.b(activity);
            return;
        }
        this.b.setLeftBtnText(activity.getResources().getString(R$string.update_dialog_cancel));
        this.b.setRightBtnText(activity.getResources().getString(R$string.download_button_pause));
        this.b.setState(activity.getResources().getString(R$string.downloading_title));
        this.b.setStateTextColor(Colors.new_main_color);
        qae.c("mRequestUrl:" + this.f13507e);
        qae.c("mDownloadUrl:" + this.f13506c);
        if (!TextUtils.isEmpty(this.f13506c)) {
            l(activity);
            return;
        }
        String str = this.f13507e;
        if (str != null) {
            j(activity, str);
        }
    }

    public final void j(Activity activity, String str) {
        z36.a(activity, str, this.d, new c(activity));
    }

    public void k(Activity activity, u26 u26Var) {
        this.d = u26Var.b;
        this.f13507e = u26Var.a;
        DownloadStatusDialog downloadStatusDialog = new DownloadStatusDialog(activity);
        this.b = downloadStatusDialog;
        downloadStatusDialog.setBottomBtnClickedListener(new a(activity, u26Var));
        this.b.show();
        i(activity, 1);
        nbe.d("", "", BizNode.START_PAY.getValue(), TransactionProcessStatusCodes.CODE_00_000_0015.getStatusCode(), BizResult.SUCCESS.getValue(), "", this.i + "");
    }

    public final void l(Activity activity) {
        if (TextUtils.isEmpty(this.f13506c)) {
            return;
        }
        if (this.h) {
            v26.c(activity);
        }
        this.h = false;
        m(activity);
        v26.d(activity, this.f13506c, h26.a(activity), new b(activity));
    }

    public final void m(Activity activity) {
        d dVar = new d(activity);
        IntentFilter intentFilter = new IntentFilter();
        pca.a(intentFilter, "android.intent.action.SCREEN_ON");
        pca.a(intentFilter, "android.intent.action.SCREEN_OFF");
        pca.a(intentFilter, "android.intent.action.USER_PRESENT");
        pca.a(intentFilter, "android.intent.action.CLOSE_SYSTEM_DIALOGS");
        if (activity.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            activity.registerReceiver(dVar, intentFilter, 2);
        } else {
            activity.registerReceiver(dVar, intentFilter);
        }
    }

    public void n(Activity activity) {
        this.g = !this.g;
        int i = this.a;
        if (i == 1) {
            i(activity, 2);
        } else if (i == 2 || i == 3) {
            i(activity, 1);
        }
    }

    public final void o(String str, String str2, String str3, int i) {
        nbe.c(str3, i + "", BizNode.START_PAY.getValue(), str2, str, str3, this.i + "");
    }
}
