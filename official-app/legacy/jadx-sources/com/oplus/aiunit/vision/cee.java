package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.core.monitor.IMonitor;
import com.oplus.drs.core.upload.upload.ChannelType;

/* JADX INFO: loaded from: classes6.dex */
public final class cee {
    @NonNull
    public j38 a(@NonNull ChannelType channelType) {
        if (!e()) {
            return j38.e();
        }
        boolean z = channelType == ChannelType.REALTIME;
        IMonitor.RestrictionLevel restrictionLevelD = d(z);
        if (restrictionLevelD == IMonitor.RestrictionLevel.LOW) {
            return j38.e();
        }
        return j38.a("Performance", "restrictionLevel=" + restrictionLevelD + ", skipBattery=" + z + ", details=" + c());
    }

    @NonNull
    public j38 b(boolean z) {
        IMonitor.RestrictionLevel restrictionLevelD;
        if (e() && (restrictionLevelD = d(z)) != IMonitor.RestrictionLevel.LOW) {
            return j38.a("Performance", "restrictionLevel=" + restrictionLevelD + ", skipBattery=" + z + ", details=" + c());
        }
        return j38.e();
    }

    @NonNull
    public String c() {
        com.oplus.drs.core.monitor.b bVar = t56.deviceMonitor;
        return bVar != null ? bVar.c() : "unknown";
    }

    @NonNull
    public IMonitor.RestrictionLevel d(boolean z) {
        com.oplus.drs.core.monitor.b bVar = t56.deviceMonitor;
        if (bVar == null) {
            return IMonitor.RestrictionLevel.LOW;
        }
        return z ? bVar.a() : bVar.b();
    }

    public boolean e() {
        return w56.a() != ChannelMode.STANDALONE;
    }

    @NonNull
    public String f() {
        if (!e()) {
            return "PerformanceGate{skipped(STANDALONE)}";
        }
        return "PerformanceGate{level=" + d(false) + ", levelSkipBattery=" + d(true) + ", details=" + c() + "}";
    }
}
