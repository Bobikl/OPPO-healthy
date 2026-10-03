package com.platform.usercenter.basic.provider;

import android.telephony.SmsMessage;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class SMSCodeProvider {
    public static String getSMSCode(SmsMessage smsMessage, int i) {
        try {
            return paramSMS(smsMessage, i);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String paramSMS(String str, int i) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("[^0-9]")) {
            if (!TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str2) && i == str2.trim().length()) {
                return str2;
            }
        }
        return null;
    }

    public static String getSMSCode(String str, int i) {
        try {
            return paramSMS(str, i);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String paramSMS(SmsMessage smsMessage, int i) throws Exception {
        return smsMessage == null ? "" : paramSMS(smsMessage.getDisplayMessageBody(), i);
    }
}
