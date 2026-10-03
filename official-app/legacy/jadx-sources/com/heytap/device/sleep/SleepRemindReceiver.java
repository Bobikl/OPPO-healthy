package com.heytap.device.sleep;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.heytap.health.protocol.fitness.FitnessProto$RemindPopUp;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.tqg;

/* JADX INFO: loaded from: classes15.dex */
public class SleepRemindReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !tqg.SLEEP_REMINDER.equals(intent.getAction())) {
            return;
        }
        int intExtra = intent.getIntExtra("SLEEP_REMIND_TYPE", -1);
        int intExtra2 = intent.getIntExtra("SLEEP_REMIND_BED_TIME", -1);
        int intExtra3 = intent.getIntExtra("SLEEP_REMIND_WAKE_UP_TIME", -1);
        a7b.f("SleepRemindMgr", "SleepRemindReceiver onReceive, remindType=" + intExtra + ", bedTime=" + intExtra2 + ", wakeUpTime=" + intExtra3);
        if (intExtra == -1) {
            return;
        }
        SleepRemindManager.p().A(SleepRemindManager.p().n(FitnessProto$RemindPopUp.PopUpType.forNumber(intExtra), intExtra2, intExtra3), false);
        SleepRemindManager.k("Cancel after alarm received");
    }
}
