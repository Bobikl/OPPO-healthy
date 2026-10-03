package com.oplus.pay.opensdk.download;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.client.platform.opensdk.pay.PayTask;
import com.oplus.aiunit.vision.agb;
import com.oplus.aiunit.vision.h26;
import com.oplus.aiunit.vision.l36;
import com.oplus.aiunit.vision.nbe;
import com.oplus.aiunit.vision.u26;
import com.oplus.aiunit.vision.v06;
import com.oplus.aiunit.vision.ygd;
import com.oplus.aiunit.vision.zqk;
import com.oplus.pay.opensdk.download.PaySdkDownloadManager;
import com.oplus.pay.opensdk.download.ui.DownloadTipsDialog;
import com.oplus.pay.opensdk.download.ui.UpgradeDialog;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class PaySdkDownloadManager {
    public static final int RESULT_CODE_DOWNLOAD_CANCEL = 10044;
    static final int RESULT_CODE_UPDATE_CANCEL = 10043;
    final int RESULT_CODE_CANCEL_BU = PayTask.RESULT_CODE_CANCEL_BU;
    final int RESULT_CODE_IU_APP = PayTask.RESULT_CODE_IU_APP;

    public class a implements ygd {
        public final /* synthetic */ DownloadTipsDialog a;
        public final /* synthetic */ u26 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f20065c;
        public final /* synthetic */ boolean d;

        public a(DownloadTipsDialog downloadTipsDialog, u26 u26Var, Activity activity, boolean z) {
            this.a = downloadTipsDialog;
            this.b = u26Var;
            this.f20065c = activity;
            this.d = z;
        }

        @Override // com.oplus.aiunit.vision.ygd
        public void leftBtnClicked() {
            this.a.dimiss();
            h26.c(this.f20065c, this.b, 10044);
        }

        @Override // com.oplus.aiunit.vision.ygd
        public void rightBtnClicked() {
            this.a.dimiss();
            u26 u26Var = this.b;
            int i = u26Var.f;
            if (i == 0) {
                PaySdkDownloadManager.fileServerModel(this.f20065c, u26Var, this.d);
            } else {
                if (i != 1) {
                    return;
                }
                PaySdkDownloadManager.marketModel(this.f20065c, u26Var, this.d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fileServerModel(Activity activity, u26 u26Var, boolean z) {
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0019;
        nbe.g("fileServerModel", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc(), "", z ? "1" : "2", "1");
        if (zqk.d(activity)) {
            new l36().k(activity, u26Var);
        } else {
            Toast.makeText(activity.getApplicationContext(), activity.getResources().getString(R$string.download_toast_no_network), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showForcedUpdateDialog$0(Activity activity, u26 u26Var, int i) {
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0024;
        nbe.i("", "", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
        showDownloadHintDialog(activity, u26Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showOptionalUpdateDialog$1(Activity activity, u26 u26Var, int i) {
        showDownloadHintDialog(activity, u26Var);
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0021;
        nbe.a("", "", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void marketModel(Activity activity, u26 u26Var, boolean z) {
        String str = v06.O_MARKET_PKG_NAME;
        if (!zqk.c(activity, str) || zqk.a(activity, str) < 5000) {
            String str2 = v06.H_MARKET_PKG_NAME;
            if (!zqk.c(activity, str2) || zqk.a(activity, str2) < 5000) {
                fileServerModel(activity, u26Var, z);
                return;
            }
        }
        agb.a(activity, v06.N_PAY_PKG_NAME);
        agb.a(activity, v06.O_PAY_PKG_NAME);
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0020;
        nbe.g("marketModel", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc(), "", z ? "1" : "2", "2");
    }

    public static void showDownloadHintDialog(Activity activity, u26 u26Var) {
        DownloadTipsDialog downloadTipsDialog = new DownloadTipsDialog(activity);
        boolean zE = zqk.e(activity);
        if (zE) {
            downloadTipsDialog.setHint(activity.getResources().getString(R$string.download_title));
        } else {
            downloadTipsDialog.setHint(activity.getResources().getString(R$string.download_title_gprs));
        }
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0018;
        nbe.f("", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc(), "", zE ? "1" : "2");
        downloadTipsDialog.setLeftBtnText(activity.getResources().getString(R$string.update_dialog_cancel));
        downloadTipsDialog.setRightBtnText(activity.getResources().getString(R$string.update_dialog_download));
        downloadTipsDialog.setBottomBtnClickedListener(new a(downloadTipsDialog, u26Var, activity, zE));
        downloadTipsDialog.show();
    }

    public static void showForcedUpdateDialog(final Activity activity, final u26 u26Var, String str, String str2) {
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0023;
        nbe.h("", "", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
        String string = TextUtils.isEmpty(str) ? activity.getString(R$string.update_dialog_title) : str;
        if (TextUtils.isEmpty(str)) {
            str2 = activity.getString(R$string.update_dialog_download);
        }
        UpgradeDialog.createOneBtnDialog(activity, string, str2, new UpgradeDialog.b() { // from class: com.oplus.aiunit.vision.lbe
            @Override // com.oplus.pay.opensdk.download.ui.UpgradeDialog.b
            public final void onClick(int i) {
                PaySdkDownloadManager.lambda$showForcedUpdateDialog$0(activity, u26Var, i);
            }
        }).show();
    }

    public static void showOptionalUpdateDialog(final Activity activity, final u26 u26Var, String str, String str2, String str3) {
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0022;
        nbe.b("", "", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
        if (TextUtils.isEmpty(str)) {
            str = activity.getString(R$string.update_dialog_title);
        }
        String str4 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = activity.getString(R$string.update_dialog_download);
        }
        String str5 = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = activity.getString(R$string.update_dialog_cancel);
        }
        UpgradeDialog.createTwoBtnDialog(activity, str4, str5, str3, new UpgradeDialog.b() { // from class: com.oplus.aiunit.vision.jbe
            @Override // com.oplus.pay.opensdk.download.ui.UpgradeDialog.b
            public final void onClick(int i) {
                PaySdkDownloadManager.lambda$showOptionalUpdateDialog$1(activity, u26Var, i);
            }
        }, new UpgradeDialog.b() { // from class: com.oplus.aiunit.vision.kbe
            @Override // com.oplus.pay.opensdk.download.ui.UpgradeDialog.b
            public final void onClick(int i) {
                h26.c(activity, u26Var, 10043);
            }
        }).show();
    }
}
