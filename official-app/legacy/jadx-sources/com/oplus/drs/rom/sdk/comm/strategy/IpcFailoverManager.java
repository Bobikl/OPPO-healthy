package com.oplus.drs.rom.sdk.comm.strategy;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.ku9;
import com.oplus.aiunit.vision.s56;
import com.oplus.drs.core.model.TrackType;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public final class IpcFailoverManager {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TrackType.values().length];
            a = iArr;
            try {
                iArr[TrackType.DCS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TrackType.OBUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static boolean a(@NonNull Context context) {
        return s56.i();
    }

    public static boolean b(@NonNull Context context, @Nullable TrackType trackType, @Nullable String str) {
        if (trackType == null) {
            return false;
        }
        TrackType trackType2 = TrackType.DCS;
        int iIncrementAndGet = trackType == trackType2 ? b.incrementAndGet() : a.incrementAndGet();
        TrackLogger.o("IpcFailoverManager", "IPC failed, trackType=%s, consecutiveFails=%s, reason=%s", trackType, Integer.valueOf(iIncrementAndGet), str);
        if (iIncrementAndGet < 3) {
            return false;
        }
        if (trackType == trackType2) {
            b.set(0);
            s56.c(context);
            TrackLogger.e("IpcFailoverManager", "Failover triggered for DCS (force old channel for 1 day)", new Object[0]);
            return true;
        }
        a.set(0);
        s56.d(context);
        try {
            ku9.f().k(context.getApplicationContext(), trackType);
        } catch (Throwable th) {
            TrackLogger.d("IpcFailoverManager", "initOrReinit IPCClient failed during OBUS failover", th, new Object[0]);
        }
        TrackLogger.e("IpcFailoverManager", "Failover triggered for OBUS (force standalone for 1 day)", new Object[0]);
        return true;
    }

    public static void c(@Nullable TrackType trackType) {
        if (trackType == null) {
            return;
        }
        if (a.a[trackType.ordinal()] != 1) {
            a.set(0);
        } else {
            b.set(0);
        }
    }

    public static boolean isForceStandaloneActive(@NonNull Context context, @Nullable TrackType trackType) {
        if (trackType != TrackType.OBUS) {
            return false;
        }
        return s56.j();
    }
}
