package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b+\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bB\u0010CR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010!\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0003\u0010\u0017R\u001a\u0010\"\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0010\u0010\u0017R\u001a\u0010$\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001a\u0010'\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u0017R\u001a\u0010*\u001a\u00020\u00198\u0006X\u0086D¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u001a\u0010+\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b%\u0010\u0006R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b(\u0010\u0006R\u001a\u00100\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b/\u0010\u0017R\u001a\u00102\u001a\u00020\u00198\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u001a\u00104\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b3\u0010\u0015\u001a\u0004\b3\u0010\u0017R\u001a\u00106\u001a\u00020\u00198\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u001a\u00107\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u00108\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\n\u0010\u0017R\u001a\u0010:\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010\u0015\u001a\u0004\b9\u0010\u0017R\u001a\u0010<\u001a\u00020\u00198\u0006X\u0086D¢\u0006\f\n\u0004\b;\u0010\u001b\u001a\u0004\b;\u0010\u001dR\u001a\u0010=\u001a\u00020\u00198\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b.\u0010\u001dR\u001a\u0010>\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b5\u0010\u0017R\u001a\u0010?\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b9\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010A\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b@\u0010\u0015\u001a\u0004\b\r\u0010\u0017¨\u0006D"}, d2 = {"Lcom/oplus/aiunit/vision/m04;", "", "", "a", "Z", "getDEFAULT_CTA_ENABLE", "()Z", "setDEFAULT_CTA_ENABLE", "(Z)V", "DEFAULT_CTA_ENABLE", "b", "j", "ENABLE_FLUSH", "c", b2n.g, "BALANCE_SWITCH", "d", "i", "DISABLE_NET_CONNECT_FLUSH", "", MapSchema.FIELD_NAME_ENTRY, "J", "w", "()J", "UPLOAD_INTERVAL_TIME", "", "f", "I", "t", "()I", "UPLOAD_INTERVAL_COUNT", b2n.f, "BALANCE_INTERVAL_TIME", "BALANCE_FLUSH_INTERVAL_TIME", "BALANCE_HEADER_SWITCH", LogFieldKey.PROCESS_NAME_KEY, "UPLOAD_HASH_TIME_FROM", MapSchema.FIELD_NAME_KEY, "s", "UPLOAD_HASH_TIME_UNTIL", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "HASH_UPLOAD_INTERVAL_COUNT", "ENABLE_HLOG", "n", "ENABLE_UPLOAD_TRACK", "o", "x", "UPLOAD_INTERVAL_TIME_MAX", "u", "UPLOAD_INTERVAL_COUNT_MAX", "q", "UPLOAD_HASH_TIME_MAX", "r", "HASH_UPLOAD_INTERVAL_COUNT_MAX", "BALANCE_INTERVAL_TIME_MAX", "BALANCE_FLUSH_INTERVAL_TIME_MAX", "y", "UPLOAD_INTERVAL_TIME_MIN", "v", "UPLOAD_INTERVAL_COUNT_MIN", "HASH_UPLOAD_INTERVAL_COUNT_MIN", "UPLOAD_HASH_TIME_MIN", "BALANCE_INTERVAL_TIME_MIN", "z", "BALANCE_FLUSH_INTERVAL_TIME_MIN", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class m04 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final boolean DISABLE_NET_CONNECT_FLUSH = false;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final boolean ENABLE_HLOG = false;

    @NotNull
    public static final m04 INSTANCE = new m04();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean DEFAULT_CTA_ENABLE = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final boolean ENABLE_FLUSH = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final boolean BALANCE_SWITCH = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final long UPLOAD_INTERVAL_TIME = 15000;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final int UPLOAD_INTERVAL_COUNT = 100;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final long BALANCE_INTERVAL_TIME = 3600000;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final long BALANCE_FLUSH_INTERVAL_TIME = 3600000;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final long BALANCE_HEADER_SWITCH = 4294901760L;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final long UPLOAD_HASH_TIME_FROM = 15000;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final long UPLOAD_HASH_TIME_UNTIL = 3600000;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final int HASH_UPLOAD_INTERVAL_COUNT = 300;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final boolean ENABLE_UPLOAD_TRACK = true;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static final long UPLOAD_INTERVAL_TIME_MAX = 300000;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final int UPLOAD_INTERVAL_COUNT_MAX = 100;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static final long UPLOAD_HASH_TIME_MAX = 21600000;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final int HASH_UPLOAD_INTERVAL_COUNT_MAX = 500;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public static final long BALANCE_INTERVAL_TIME_MAX = 86400000;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public static final long BALANCE_FLUSH_INTERVAL_TIME_MAX = 604800000;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public static final long UPLOAD_INTERVAL_TIME_MIN = 5000;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public static final int UPLOAD_INTERVAL_COUNT_MIN = 30;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public static final int HASH_UPLOAD_INTERVAL_COUNT_MIN = 100;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public static final long UPLOAD_HASH_TIME_MIN = 15000;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public static final long BALANCE_INTERVAL_TIME_MIN = 15000;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final long BALANCE_FLUSH_INTERVAL_TIME_MIN = 15000;

    public final long a() {
        return BALANCE_FLUSH_INTERVAL_TIME;
    }

    public final long b() {
        return BALANCE_FLUSH_INTERVAL_TIME_MAX;
    }

    public final long c() {
        return BALANCE_FLUSH_INTERVAL_TIME_MIN;
    }

    public final long d() {
        return BALANCE_HEADER_SWITCH;
    }

    public final long e() {
        return BALANCE_INTERVAL_TIME;
    }

    public final long f() {
        return BALANCE_INTERVAL_TIME_MAX;
    }

    public final long g() {
        return BALANCE_INTERVAL_TIME_MIN;
    }

    public final boolean h() {
        return BALANCE_SWITCH;
    }

    public final boolean i() {
        return DISABLE_NET_CONNECT_FLUSH;
    }

    public final boolean j() {
        return ENABLE_FLUSH;
    }

    public final boolean k() {
        return ENABLE_HLOG;
    }

    public final boolean l() {
        return ENABLE_UPLOAD_TRACK;
    }

    public final int m() {
        return HASH_UPLOAD_INTERVAL_COUNT;
    }

    public final int n() {
        return HASH_UPLOAD_INTERVAL_COUNT_MAX;
    }

    public final int o() {
        return HASH_UPLOAD_INTERVAL_COUNT_MIN;
    }

    public final long p() {
        return UPLOAD_HASH_TIME_FROM;
    }

    public final long q() {
        return UPLOAD_HASH_TIME_MAX;
    }

    public final long r() {
        return UPLOAD_HASH_TIME_MIN;
    }

    public final long s() {
        return UPLOAD_HASH_TIME_UNTIL;
    }

    public final int t() {
        return UPLOAD_INTERVAL_COUNT;
    }

    public final int u() {
        return UPLOAD_INTERVAL_COUNT_MAX;
    }

    public final int v() {
        return UPLOAD_INTERVAL_COUNT_MIN;
    }

    public final long w() {
        return UPLOAD_INTERVAL_TIME;
    }

    public final long x() {
        return UPLOAD_INTERVAL_TIME_MAX;
    }

    public final long y() {
        return UPLOAD_INTERVAL_TIME_MIN;
    }
}
