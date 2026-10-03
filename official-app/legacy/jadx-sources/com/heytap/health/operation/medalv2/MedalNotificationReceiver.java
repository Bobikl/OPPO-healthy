package com.heytap.health.operation.medalv2;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.os.BuildCompat;
import com.heytap.health.base.R$array;
import com.heytap.health.operation.R$string;
import com.heytap.health.operation.notification.ui.NotifyDispatcherActivity;
import com.heytap.health.operations.NotifyReportReceiver;
import com.heytap.health.operations.bean.NotificationItemData;
import com.heytap.health.operations.bean.NotifyType;
import com.heytap.health.operations.router.providers.INotifyService;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.x0;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes17.dex */
public class MedalNotificationReceiver extends BroadcastReceiver {
    public static final String ACTION = "com.heytap.health.operation.action_medal_notification_receiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (ACTION.equals(intent.getAction())) {
            a7b.f("MedalNotificationReceiver", "[onReceive] --> keep alive received, start check");
            try {
                String stringExtra = intent.getStringExtra("typeCode");
                String stringExtra2 = intent.getStringExtra("code");
                a7b.f("MedalNotificationReceiver", "intent typeCode is " + stringExtra + ",code is " + stringExtra2);
                Intent intent2 = new Intent(b78.a(), (Class<?>) NotifyDispatcherActivity.class);
                intent2.putExtra(NotifyReportReceiver.EXTRA_INTENT_CLASS, MedalListDetailActivity.class.getName());
                intent2.putExtra("visitFrom", 1003);
                intent2.putExtra("typeCode", stringExtra);
                intent2.putExtra("code", stringExtra2);
                int i = BuildCompat.isAtLeastS() ? 167772160 : 134217728;
                String[] stringArray = context.getResources().getStringArray(R$array.lib_base_month);
                int value = LocalDate.now().getMonth().getValue() - 1;
                String string = context.getString(R$string.operation_medal_notify_title, stringArray[value]);
                String string2 = context.getString(R$string.operation_medal_notify_content, stringArray[value]);
                intent2.putExtra(NotifyReportReceiver.EXTRA_PUSH_TITLE, string);
                ((INotifyService) x0.d().h(INotifyService.class)).sa(new NotificationItemData(NotifyType.NOTIFY_MEDAL, string, string2, PendingIntent.getActivity(b78.a(), 10013, intent2, i)));
            } catch (Exception e2) {
                a7b.b("MedalNotificationReceiver", "Error is " + e2.toString());
            }
        }
    }
}
