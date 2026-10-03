package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.wallet.business.pay.ali.AlipayResult;
import com.oppo.lib.common.R$string;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public class wz {

    public class a implements Runnable {
        public WeakReference<Activity> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Activity f18449j;
        public final /* synthetic */ String k;

        public a(Activity activity, String str) {
            this.f18449j = activity;
            this.k = str;
            this.i = new WeakReference<>(activity);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.i.get() == null) {
                return;
            }
            AlipayResult alipayResult = new AlipayResult(new PayTask(this.i.get()).payV2(this.k, true));
            t6b.a("alipay result = " + alipayResult);
            if (alipayResult.getResultStatus().equalsIgnoreCase(UserGoalInfo.DEVICE_STEPS_GOAL_DEFAULT)) {
                return;
            }
            sr6.c().l(new b(alipayResult));
        }
    }

    public static class b {
        public final AlipayResult a;

        public b(AlipayResult alipayResult) {
            this.a = alipayResult;
        }

        public static void a(Context context, AlipayResult alipayResult, cbe cbeVar) {
            if (TextUtils.isEmpty(alipayResult.getResultStatus())) {
                cbeVar.failed(-1, context.getString(R$string.ali_pay_failed));
            }
            String statusMsg = TextUtils.isEmpty(alipayResult.getMemo()) ? alipayResult.getStatusMsg(context) : alipayResult.getMemo();
            String resultStatus = alipayResult.getResultStatus();
            resultStatus.hashCode();
            switch (resultStatus) {
                case "6000":
                    cbeVar.failed(-5, statusMsg);
                    break;
                case "6001":
                    cbeVar.cancel();
                    break;
                case "9000":
                    cbeVar.success();
                    break;
                default:
                    cbeVar.failed(-1, statusMsg);
                    break;
            }
        }
    }

    public static void a(Activity activity, String str) {
        sr0.i(new a(activity, str));
    }
}
