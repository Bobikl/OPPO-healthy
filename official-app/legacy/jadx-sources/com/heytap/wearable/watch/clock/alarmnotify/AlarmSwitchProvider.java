package com.heytap.wearable.watch.clock.alarmnotify;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.vg3;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/ic/IAlarmSwitchProvider")
public class AlarmSwitchProvider implements IAlarmSwitchProvider {
    @Override // com.heytap.wearable.watch.clock.alarmnotify.IAlarmSwitchProvider
    public void T2(String str, boolean z) {
        if (h1(str)) {
            c().W(str + "key_alarm_notify_v2", z);
            return;
        }
        c().W(str + "key_alarm_notify", z);
    }

    public final v9g c() {
        return v9g.x("alarm_notify");
    }

    public final boolean h1(String str) {
        return vg3.a(str).w7();
    }

    @Override // com.heytap.wearable.watch.clock.alarmnotify.IAlarmSwitchProvider
    public boolean i4(String str) {
        if (h1(str)) {
            return c().r(str + "key_alarm_notify_v2", false);
        }
        return c().r(str + "key_alarm_notify", true);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        v9g.x("alarm_notify");
    }
}
