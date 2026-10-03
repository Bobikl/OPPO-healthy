package com.oplus.aiunit.vision;

import android.telephony.SmsManager;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class aie {
    public static void a(int i, String str, String str2, String str3) {
        a7b.f("TelHealth.PhoneSmsSendUtils", "sendSms subId = " + i);
        if (h4j.e() && i > 0) {
            SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(i);
            ArrayList<String> arrayListDivideMessage = smsManagerForSubscriptionId.divideMessage(str2);
            try {
                a7b.f("TelHealth.PhoneSmsSendUtils", "sendSms 2");
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                smsManagerForSubscriptionId.sendMultipartTextMessage(str, str3, arrayListDivideMessage, null, null);
                a7b.f("TelHealth.PhoneSmsSendUtils", "sendSms 3");
            } catch (Exception e2) {
                a7b.n("TelHealth.PhoneSmsSendUtils", "sendSms Exception", e2);
            }
        }
    }
}
