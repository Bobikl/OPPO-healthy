package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class f36 {
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
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(ParserTag.TAG_ACTIVITY);
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

    public static void c(Activity activity, s36 s36Var, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            jSONObject.put(rde.PAY_SDK_ORDER, s36Var.d);
            jSONObject.put(rde.PAY_SDK_PREPAYTOKEN, s36Var.c);
            jSONObject.put("reportByPaySdk", "SDK");
            jSONObject.put("expandInfo", "");
            Intent intent = new Intent(t16.ACTION_NOTIFY_PAY_RESULT);
            intent.putExtra("response", jSONObject.toString());
            intent.setPackage(activity.getPackageName());
            activity.sendBroadcast(intent);
            String str = s36Var.c;
            String str2 = s36Var.d;
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0025;
            mde.j(i + "", str, str2, value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc());
        } catch (JSONException e) {
            pce.c("eventIdPayResultNotifyResult" + e.getMessage());
        }
    }
}
