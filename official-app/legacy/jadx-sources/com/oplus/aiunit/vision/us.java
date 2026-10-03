package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.wearable.watch.clock.alarmnotify.IAlarmSwitchProvider;

/* JADX INFO: loaded from: classes3.dex */
public class us implements m71 {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IAlarmSwitchProvider f17583j;

    /* JADX WARN: Multi-variable type inference failed */
    public us(ts tsVar, Intent intent) {
        try {
            if ("from_operation_true".equals(intent.getStringExtra("from_operation"))) {
                this.i = intent.getStringExtra("currentMac");
            } else {
                this.i = intent.getStringExtra("bundle_setting_mac");
            }
            if (TextUtils.isEmpty(this.i)) {
                ((Activity) tsVar).finish();
            }
            this.f17583j = (IAlarmSwitchProvider) x0.d().b("/ic/IAlarmSwitchProvider").navigation();
        } catch (Exception e2) {
            a7b.b("AlarmNotifyPresenter", "e:" + e2.getMessage());
        }
    }

    public boolean i() {
        return this.f17583j.i4(this.i);
    }

    public void l(boolean z) {
        this.f17583j.T2(this.i, z);
    }
}
