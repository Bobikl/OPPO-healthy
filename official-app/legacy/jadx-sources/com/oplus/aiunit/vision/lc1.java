package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeLowBatteryAppClose;

/* JADX INFO: loaded from: classes18.dex */
public class lc1 {
    public boolean a;

    public lc1() {
    }

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return new lc1(this.a);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof lc1) {
            return this.a == ((lc1) obj).a;
        }
        return super.equals(obj);
    }

    public String toString() {
        return "BatteryProtect{enable=" + this.a + '}';
    }

    public lc1(SchoolModeProto$SchoolModeLowBatteryAppClose schoolModeProto$SchoolModeLowBatteryAppClose) {
        this.a = schoolModeProto$SchoolModeLowBatteryAppClose.getEnable() == 1;
    }

    public lc1(boolean z) {
        this.a = z;
    }
}
