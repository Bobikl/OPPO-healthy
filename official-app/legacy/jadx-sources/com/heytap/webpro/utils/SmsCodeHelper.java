package com.heytap.webpro.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.q7b;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public final class SmsCodeHelper {
    public static final String INTENT_ACTIVITY_RECEIVE_SMS = "android.provider.Telephony.SMS_RECEIVED";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile SmsCodeHelper f8557e;
    public Context a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f8558c;
    public SparseArray<SmsReceiverParam> d;

    @Keep
    public static class SmsReceiverParam {
        public int codeLength;
        public a listener;
        public int registerTag;

        public SmsReceiverParam(int i, int i2, a aVar) {
            this.registerTag = i;
            this.codeLength = i2;
            this.listener = aVar;
        }
    }

    public interface a {
        void a(int i, String str);
    }

    public static class b extends BroadcastReceiver {
        public final SoftReference<SmsCodeHelper> a;

        public b(SmsCodeHelper smsCodeHelper) {
            this.a = new SoftReference<>(smsCodeHelper);
        }

        public static String b(String str, int i) {
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

        public final String a(String str, int i) {
            try {
                return b(str, i);
            } catch (Exception unused) {
                return "";
            }
        }

        public final String c(Intent intent) {
            Bundle extras;
            if (intent == null) {
                q7b.d("DeviceStatusManager", "intent is null return ");
                return null;
            }
            try {
                extras = intent.getExtras();
            } catch (Exception e2) {
                q7b.g("DeviceStatusManager", e2);
                extras = null;
            }
            if (extras == null) {
                q7b.d("DeviceStatusManager", "bundle is null return ");
                return null;
            }
            Object[] objArr = (Object[]) extras.get("pdus");
            if (objArr == null) {
                q7b.d("DeviceStatusManager", "pdus is null return ");
                return null;
            }
            SmsMessage[] smsMessageArr = new SmsMessage[objArr.length];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < objArr.length; i++) {
                SmsMessage smsMessageCreateFromPdu = SmsMessage.createFromPdu((byte[]) objArr[i]);
                smsMessageArr[i] = smsMessageCreateFromPdu;
                if (smsMessageCreateFromPdu != null && !TextUtils.isEmpty(smsMessageCreateFromPdu.getDisplayMessageBody())) {
                    sb.append(smsMessageArr[i].getDisplayMessageBody());
                }
            }
            return sb.toString();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i;
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            q7b.d("DeviceStatusManager", "onReceive ");
            String strC = "android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction()) ? c(intent) : null;
            SmsCodeHelper smsCodeHelper = this.a.get();
            if (smsCodeHelper == null || TextUtils.isEmpty(strC)) {
                return;
            }
            for (int i2 = 0; i2 < smsCodeHelper.d.size(); i2++) {
                SmsReceiverParam smsReceiverParam = (SmsReceiverParam) smsCodeHelper.d.valueAt(i2);
                if (smsReceiverParam != null && (i = smsReceiverParam.codeLength) > 0) {
                    smsReceiverParam.listener.a(smsReceiverParam.registerTag, a(strC, i));
                }
            }
        }
    }

    public SmsCodeHelper(Context context) {
        if (this.f8558c) {
            return;
        }
        this.a = context.getApplicationContext();
        this.d = new SparseArray<>();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
        b bVar = new b(this);
        this.b = bVar;
        context.registerReceiver(bVar, intentFilter);
        this.f8558c = true;
    }

    public static void b() {
        f8557e = null;
    }

    public static SmsCodeHelper d(Context context) {
        if (f8557e == null) {
            synchronized (SmsCodeHelper.class) {
                if (f8557e == null) {
                    f8557e = new SmsCodeHelper(context.getApplicationContext());
                }
            }
        }
        return f8557e;
    }

    public void c() {
        b bVar;
        Context context = this.a;
        if (context != null && (bVar = this.b) != null) {
            context.unregisterReceiver(bVar);
            this.b = null;
            this.a = null;
        }
        this.f8558c = false;
        b();
    }

    public void e(int i, int i2, a aVar) {
        if (aVar == null || i2 <= 0) {
            return;
        }
        this.d.append(i, new SmsReceiverParam(i, i2, aVar));
    }

    public void f(int i) {
        this.d.delete(i);
    }
}
