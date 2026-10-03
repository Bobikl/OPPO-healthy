package org.oconscrypt.metrics;

/* JADX INFO: loaded from: classes11.dex */
public final class ConscryptStatsLog {
    public static final int TLS_HANDSHAKE_REPORTED = 317;

    private ConscryptStatsLog() {
    }

    public static void write(int i, boolean z, int i2, int i3, int i4, Source source) {
        ReflexiveStatsLog.write(ReflexiveStatsEvent.buildEvent(i, z, i2, i3, i4, source.ordinal()));
    }
}
