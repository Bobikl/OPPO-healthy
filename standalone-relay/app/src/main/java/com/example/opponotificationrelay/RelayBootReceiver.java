package com.example.opponotificationrelay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class RelayBootReceiver extends BroadcastReceiver {
    @Override public void onReceive(Context context, Intent intent) {
        if(intent==null || !(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction()) || Intent.ACTION_MY_PACKAGE_REPLACED.equals(intent.getAction()))) return;
        FileLogger.init(context);
        ListenerRecovery.restoreInterruptedRepair(context);
        BackgroundStart.restore(context,intent.getAction());
    }
}
