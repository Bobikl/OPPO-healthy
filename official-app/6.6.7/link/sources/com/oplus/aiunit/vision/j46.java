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
import com.oplus.pay.opensdk.download.PaySdkDownloadManager;
import com.oplus.pay.opensdk.download.R$string;
import com.oplus.pay.opensdk.download.ui.DownloadStatusDialog;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.oplus.utrace.lib.ConstValuesKt;
import com.oplus.utrace.lib.NodeIDKt;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.io.File;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class j46 {
    public static final int STATE_DEFAULT = 0;
    public static final int STATE_ERROR = 3;
    public static final int STATE_NORMAL = 1;
    public static final int STATE_PAUSE = 2;

    @SuppressLint({"StaticFieldLeak"})
    public DownloadStatusDialog b;
    public int a = 0;

    @SuppressLint({"StaticFieldLeak"})
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = "";
    public boolean g = false;
    public boolean h = true;
    public int i = 1;

    public class a implements pid {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ s36 b;

        public a(Activity activity, s36 s36Var) {
            this.a = activity;
            this.b = s36Var;
        }

        @Override // com.oplus.aiunit.vision.pid
        public void leftBtnClicked() {
            f36.c(this.a, this.b, PaySdkDownloadManager.RESULT_CODE_DOWNLOAD_CANCEL);
            t36.b(this.a);
            j46.this.b.dismiss();
        }

        @Override // com.oplus.aiunit.vision.pid
        public void rightBtnClicked() {
            j46.this.n(this.a);
            j46 j46Var = j46.this;
            j46Var.i = j46Var.g ? 2 : 5;
            j46.this.o(BizResult.SUCCESS.getValue(), TransactionProcessStatusCodes.CODE_00_000_0014.getStatusCode(), "", -1);
        }
    }

    public class b implements vid {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Activity activity, Exception exc) {
            if (j46.this.g) {
                return;
            }
            j46.this.i(activity, 3);
            j46.this.i = 3;
            String message = exc.getMessage();
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_00012;
            mde.e(message, NodeIDKt.DEFAULT_SPAN_NAME, value, transactionProcessStatusCodes.getStatusCode(), BizResult.ERROR.getValue(), transactionProcessStatusCodes.getDesc() + j46.this.i + "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, String str2, int i) {
            j46.this.b.setPercent(str + "/" + str2);
            j46.this.b.setProgress(i);
        }

        @Override // com.oplus.aiunit.vision.vid
        public void a(final Exception exc) {
            pce.c("Exception=" + exc);
            final Activity activity = this.a;
            activity.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.l46
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.e(activity, exc);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.vid
        public void b(long j, Long l) {
            final int iLongValue = (int) (((j * 1.0f) / l.longValue()) * 100.0f);
            pce.c("progress=" + iLongValue);
            final String str = lu7.a(j, ConstValuesKt.MB, 2) + "M";
            final String str2 = lu7.a(l.longValue(), ConstValuesKt.MB, 2) + "M";
            this.a.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.k46
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.f(str, str2, iLongValue);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.vid
        public void g(File file) {
            j46.this.b.dismiss();
            pce.c("onDownloadSuccess");
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
            if (f36.b(this.a)) {
                vuk.b(this.a, file);
            } else {
                j46.this.f = file.getAbsolutePath();
            }
            j46.this.i = 4;
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0016;
            mde.e("", NodeIDKt.DEFAULT_SPAN_NAME, value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc() + j46.this.i + "");
        }
    }

    public class c implements uid {
        public final /* synthetic */ Activity a;

        public c(Activity activity) {
            this.a = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Activity activity) {
            j46.this.i(activity, 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Activity activity) {
            j46.this.i(activity, 1);
        }

        @Override // com.oplus.aiunit.vision.uid
        public void onFailed(Exception exc) {
            final Activity activity = this.a;
            activity.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.n46
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.c(activity);
                }
            });
            j46.this.i = 3;
            String message = exc.getMessage();
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_00011;
            mde.e(message, NodeIDKt.DEFAULT_SPAN_NAME, value, transactionProcessStatusCodes.getStatusCode(), BizResult.ERROR.getValue(), transactionProcessStatusCodes.getDesc() + j46.this.i + "");
        }

        @Override // com.oplus.aiunit.vision.uid
        public void onSuccess(String str) {
            pce.c("onSuccess::" + str);
            j46.this.c = str;
            final Activity activity = this.a;
            activity.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.m46
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.d(activity);
                }
            });
            j46.this.i = 1;
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0017;
            mde.e("", NodeIDKt.DEFAULT_SPAN_NAME, value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc() + j46.this.i + "");
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
            pce.c("BroadcastReceiver:" + action);
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (TextUtils.isEmpty(j46.this.f)) {
                    return;
                }
                vuk.b(context, new File(j46.this.f));
                j46.this.f = "";
                this.a.unregisterReceiver(this);
                return;
            }
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                j46.this.f = "";
                j46.this.b.dismiss();
                t36.b(this.a);
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
                this.b.setStateTextColor(-13224394);
                t36.f();
                return;
            }
            if (i != 3) {
                return;
            }
            this.b.setLeftBtnText(activity.getResources().getString(R$string.update_dialog_cancel));
            this.b.setRightBtnText(activity.getResources().getString(R$string.download_button_resume));
            this.b.setState(activity.getResources().getString(R$string.download_title_failed));
            this.b.setStateTextColor(-2138787);
            t36.b(activity);
            return;
        }
        this.b.setLeftBtnText(activity.getResources().getString(R$string.update_dialog_cancel));
        this.b.setRightBtnText(activity.getResources().getString(R$string.download_button_pause));
        this.b.setState(activity.getResources().getString(R$string.downloading_title));
        this.b.setStateTextColor(-13224394);
        pce.c("mRequestUrl:" + this.e);
        pce.c("mDownloadUrl:" + this.c);
        if (!TextUtils.isEmpty(this.c)) {
            l(activity);
            return;
        }
        String str = this.e;
        if (str != null) {
            j(activity, str);
        }
    }

    public final void j(Activity activity, String str) {
        x46.a(activity, str, this.d, new c(activity));
    }

    public void k(Activity activity, s36 s36Var) {
        this.d = s36Var.b;
        this.e = s36Var.a;
        DownloadStatusDialog downloadStatusDialog = new DownloadStatusDialog(activity);
        this.b = downloadStatusDialog;
        downloadStatusDialog.setBottomBtnClickedListener(new a(activity, s36Var));
        this.b.show();
        i(activity, 1);
        mde.d("", "", BizNode.START_PAY.getValue(), TransactionProcessStatusCodes.CODE_00_000_0015.getStatusCode(), BizResult.SUCCESS.getValue(), "", this.i + "");
    }

    public final void l(Activity activity) {
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        if (this.h) {
            t36.c(activity);
        }
        this.h = false;
        m(activity);
        t36.d(activity, this.c, f36.a(activity), new b(activity));
    }

    public final void m(Activity activity) {
        d dVar = new d(activity);
        IntentFilter intentFilter = new IntentFilter();
        xda.a(intentFilter, "android.intent.action.SCREEN_ON");
        xda.a(intentFilter, "android.intent.action.SCREEN_OFF");
        xda.a(intentFilter, "android.intent.action.USER_PRESENT");
        xda.a(intentFilter, "android.intent.action.CLOSE_SYSTEM_DIALOGS");
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
        mde.c(str3, i + "", BizNode.START_PAY.getValue(), str2, str, str3, this.i + "");
    }
}
