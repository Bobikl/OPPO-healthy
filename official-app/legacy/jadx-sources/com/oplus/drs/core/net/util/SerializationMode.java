package com.oplus.drs.core.net.util;

import android.content.Context;
import com.fasterxml.jackson.core.JsonFactory;
import com.oplus.aiunit.vision.t56;
import com.oplus.aiunit.vision.w56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.core.model.TrackType;
import com.oplus.drs.rom.sdk.comm.strategy.IpcFailoverManager;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class SerializationMode {

    public enum Mode {
        PROTOBUF("Protobuf"),
        JSON(JsonFactory.FORMAT_NAME_JSON);

        private final String name;

        Mode(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    public static boolean a() {
        try {
            Context contextB = w56.b();
            if (contextB == null) {
                z6b.k("SerializationMode", "DrsRuntime.context() is null, skip runtime failover check");
                return false;
            }
            TrackType trackType = TrackType.DCS;
            Object obj = TrackType.class.getField("OBUS").get(null);
            AtomicInteger atomicInteger = IpcFailoverManager.a;
            boolean z = true;
            Object objInvoke = IpcFailoverManager.class.getMethod("isForceStandaloneActive", Context.class, TrackType.class).invoke(null, contextB, obj);
            if (objInvoke == null || !((Boolean) objInvoke).booleanValue()) {
                z = false;
            }
            z6b.k("SerializationMode", "checkRuntimeFailoverMode: " + z);
            return z;
        } catch (Exception e2) {
            z6b.k("SerializationMode", "Failed to check runtime failover mode: " + e2.getMessage());
            return false;
        }
    }

    public static boolean b() {
        try {
            ChannelMode channelModeA = w56.a();
            boolean z = channelModeA == ChannelMode.STANDALONE;
            z6b.k("SerializationMode", "checkStaticStandaloneMode: " + z + " (channelMode=" + channelModeA + ")");
            return z;
        } catch (Exception e2) {
            z6b.u("SerializationMode", "Failed to check static standalone mode: " + e2.getMessage());
            return false;
        }
    }

    public static Mode c() {
        boolean zH = t56.h();
        boolean zD = d();
        Mode mode = (zH && zD) ? Mode.JSON : Mode.PROTOBUF;
        z6b.k("SerializationMode", "getCurrentMode: " + mode + " (forceJson=" + zH + ", isStandalone=" + zD + ")");
        return mode;
    }

    public static boolean d() {
        boolean zB = b();
        boolean zA = a();
        boolean z = zB || zA;
        z6b.k("SerializationMode", "isStandaloneMode: " + z + " (static=" + zB + ", runtimeFailover=" + zA + ")");
        return z;
    }
}
