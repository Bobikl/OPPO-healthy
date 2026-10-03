package com.oplus.pay.opensdk.download;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.erl;
import com.oplus.aiunit.vision.f36;
import com.oplus.aiunit.vision.j46;
import com.oplus.aiunit.vision.mde;
import com.oplus.aiunit.vision.phb;
import com.oplus.aiunit.vision.pid;
import com.oplus.aiunit.vision.s36;
import com.oplus.aiunit.vision.t16;
import com.oplus.aiunit.vision.vuk;
import com.oplus.pay.opensdk.download.PaySdkDownloadManager;
import com.oplus.pay.opensdk.download.ui.DownloadTipsDialog;
import com.oplus.pay.opensdk.download.ui.UpgradeDialog;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class PaySdkDownloadManager {
    public static final int RESULT_CODE_DOWNLOAD_CANCEL = 10044;
    static final int RESULT_CODE_UPDATE_CANCEL = 10043;
    final int RESULT_CODE_CANCEL_BU = 10041;
    final int RESULT_CODE_IU_APP = 10040;

    public class a implements pid {
        public final /* synthetic */ DownloadTipsDialog a;
        public final /* synthetic */ s36 b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ boolean d;

        public a(DownloadTipsDialog downloadTipsDialog, s36 s36Var, Activity activity, boolean z) {
            this.a = downloadTipsDialog;
            this.b = s36Var;
            this.c = activity;
            this.d = z;
        }

        @Override // com.oplus.aiunit.vision.pid
        public void leftBtnClicked() {
            this.a.dimiss();
            f36.c(this.c, this.b, PaySdkDownloadManager.RESULT_CODE_DOWNLOAD_CANCEL);
        }

        @Override // com.oplus.aiunit.vision.pid
        public void rightBtnClicked() {
            this.a.dimiss();
            s36 s36Var = this.b;
            int i = s36Var.f;
            if (i == 0) {
                PaySdkDownloadManager.fileServerModel(this.c, s36Var, this.d);
            } else {
                if (i != 1) {
                    return;
                }
                PaySdkDownloadManager.marketModel(this.c, s36Var, this.d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fileServerModel(Activity activity, s36 s36Var, boolean z) {
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0019;
        mde.g("fileServerModel", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc(), "", z ? erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE : "2", erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE);
        if (vuk.d(activity)) {
            new j46().k(activity, s36Var);
        } else {
            Toast.makeText(activity.getApplicationContext(), activity.getResources().getString(R$string.download_toast_no_network), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showForcedUpdateDialog$0(Activity activity, s36 s36Var, int i) {
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0024;
        mde.i("", "", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
        showDownloadHintDialog(activity, s36Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showOptionalUpdateDialog$1(Activity activity, s36 s36Var, int i) {
        showDownloadHintDialog(activity, s36Var);
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0021;
        mde.a("", "", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void marketModel(Activity activity, s36 s36Var, boolean z) {
        String str = t16.O_MARKET_PKG_NAME;
        if (!vuk.c(activity, str) || vuk.a(activity, str) < 5000) {
            String str2 = t16.H_MARKET_PKG_NAME;
            if (!vuk.c(activity, str2) || vuk.a(activity, str2) < 5000) {
                fileServerModel(activity, s36Var, z);
                return;
            }
        }
        phb.a(activity, t16.N_PAY_PKG_NAME);
        phb.a(activity, t16.O_PAY_PKG_NAME);
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0020;
        mde.g("marketModel", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc(), "", z ? erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE : "2", "2");
    }

    public static void showDownloadHintDialog(Activity activity, s36 s36Var) {
        DownloadTipsDialog downloadTipsDialog = new DownloadTipsDialog(activity);
        boolean zE = vuk.e(activity);
        if (zE) {
            downloadTipsDialog.setHint(activity.getResources().getString(R$string.download_title));
        } else {
            downloadTipsDialog.setHint(activity.getResources().getString(R$string.download_title_gprs));
        }
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0018;
        mde.f("", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc(), "", zE ? erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE : "2");
        downloadTipsDialog.setLeftBtnText(activity.getResources().getString(R$string.update_dialog_cancel));
        downloadTipsDialog.setRightBtnText(activity.getResources().getString(R$string.update_dialog_download));
        downloadTipsDialog.setBottomBtnClickedListener(new a(downloadTipsDialog, s36Var, activity, zE));
        downloadTipsDialog.show();
    }

    public static void showForcedUpdateDialog(final Activity activity, final s36 s36Var, String str, String str2) {
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0023;
        mde.h("", "", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
        String string = TextUtils.isEmpty(str) ? activity.getString(R$string.update_dialog_title) : str;
        if (TextUtils.isEmpty(str)) {
            str2 = activity.getString(R$string.update_dialog_download);
        }
        UpgradeDialog.createOneBtnDialog(activity, string, str2, new UpgradeDialog.b() { // from class: com.oplus.aiunit.vision.kde
            @Override // com.oplus.pay.opensdk.download.ui.UpgradeDialog.b
            public final void onClick(int i) {
                PaySdkDownloadManager.lambda$showForcedUpdateDialog$0(activity, s36Var, i);
            }
        }).show();
    }

    public static void showOptionalUpdateDialog(final Activity activity, final s36 s36Var, String str, String str2, String str3) {
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0022;
        mde.b("", "", value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
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
        UpgradeDialog.createTwoBtnDialog(activity, str4, str5, str3, new UpgradeDialog.b() { // from class: com.oplus.aiunit.vision.ide
            @Override // com.oplus.pay.opensdk.download.ui.UpgradeDialog.b
            public final void onClick(int i) {
                PaySdkDownloadManager.lambda$showOptionalUpdateDialog$1(activity, s36Var, i);
            }
        }, new UpgradeDialog.b() { // from class: com.oplus.aiunit.vision.jde
            @Override // com.oplus.pay.opensdk.download.ui.UpgradeDialog.b
            public final void onClick(int i) {
                f36.c(activity, s36Var, PaySdkDownloadManager.RESULT_CODE_UPDATE_CANCEL);
            }
        }).show();
    }
}
