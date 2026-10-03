package io.netty.incubator.codec.quic.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u0004\u0018\u00010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0006*\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a\f\u0010\u0000\u001a\u00020\b*\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"default", "", "(Ljava/lang/Boolean;)Z", "", "", "(Ljava/lang/Integer;)I", "", "(Ljava/lang/Long;)J", "", "netty-quic_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DefValueUtilKt {
    @NotNull
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final String m5280default(@Nullable String str) {
        return str == null ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final byte[] m5282default(@Nullable byte[] bArr) {
        return bArr == null ? new byte[0] : bArr;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final int m5278default(@Nullable Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final long m5279default(@Nullable Long l2) {
        if (l2 == null) {
            return 0L;
        }
        return l2.longValue();
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final boolean m5281default(@Nullable Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
