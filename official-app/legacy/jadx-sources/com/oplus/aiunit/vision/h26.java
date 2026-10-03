package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class h26 {
    public static String a(Context context) {
        String string = context.getFilesDir().toString();
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        String str = File.separator;
        sb.append(str);
        sb.append("app");
        String string2 = sb.toString();
        File file = new File(string2);
        file.delete();
        if (!file.exists()) {
            file.mkdirs();
        }
        return string2 + str + "temp.apk";
    }

    public static boolean b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        String packageName = context.getApplicationContext().getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static void c(Activity activity, u26 u26Var, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("order", u26Var.d);
            jSONObject.put(sbe.PAY_SDK_PREPAYTOKEN, u26Var.f17267c);
            jSONObject.put("reportByPaySdk", LinkInfo.CALL_TYPE_SDK);
            jSONObject.put("expandInfo", "");
            Intent intent = new Intent(v06.ACTION_NOTIFY_PAY_RESULT);
            intent.putExtra(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, jSONObject.toString());
            intent.setPackage(activity.getPackageName());
            activity.sendBroadcast(intent);
            String str = u26Var.f17267c;
            String str2 = u26Var.d;
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0025;
            nbe.j(i + "", str, str2, value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
        } catch (JSONException e2) {
            qae.c("eventIdPayResultNotifyResult" + e2.getMessage());
        }
    }
}
