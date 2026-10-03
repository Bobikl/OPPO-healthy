package com.lifesense.plugin.ble.device.ancs;

import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import com.lifesense.plugin.ble.data.LSAppCategory;

/* JADX INFO: loaded from: classes5.dex */
class q implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f8750c;

    public q(p pVar, Intent intent, Context context) {
        this.f8750c = pVar;
        this.a = intent;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Object[] objArr = (Object[]) this.a.getExtras().get("pdus");
            String messageBody = "";
            int length = objArr.length;
            long j2 = 0;
            String str = null;
            int i = 0;
            while (i < length) {
                SmsMessage smsMessageCreateFromPdu = SmsMessage.createFromPdu((byte[]) objArr[i]);
                String originatingAddress = smsMessageCreateFromPdu.getOriginatingAddress();
                long timestampMillis = smsMessageCreateFromPdu.getTimestampMillis();
                if (str == null) {
                    messageBody = smsMessageCreateFromPdu.getMessageBody();
                    str = originatingAddress;
                } else if (str.equals(originatingAddress)) {
                    messageBody = messageBody + smsMessageCreateFromPdu.getMessageBody();
                }
                i++;
                j2 = timestampMillis;
            }
            if (this.f8750c.d != null && this.f8750c.d.equals(messageBody) && this.f8750c.f8749e != null && this.f8750c.f8749e.equals(str) && this.f8750c.f == j2) {
                com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, true, "filter the same sms from >>" + str, "Sms");
                return;
            }
            this.f8750c.d = messageBody;
            this.f8750c.f8749e = str;
            this.f8750c.f = j2;
            int iA = c.a(this.b);
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, false, "SBR<< smsCount=" + iA + " ; sender=" + str, "Sms");
            if (n.isEnableSmsObserver) {
                return;
            }
            p.isEnableSmsReceiver = true;
            a aVar = new a(str, messageBody, LSAppCategory.Sms.getValue());
            aVar.c(iA);
            aVar.b(c.a(str, this.b));
            p.b.a(this, aVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, false, "failed to handle sms message,has exception...." + e2.getClass().getName(), null);
        }
    }
}
