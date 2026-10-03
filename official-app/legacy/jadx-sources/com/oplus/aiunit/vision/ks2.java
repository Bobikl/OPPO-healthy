package com.oplus.aiunit.vision;

import com.heytap.common.bean.NetworkType;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.okhttp.extension.request.OKHttpRequestHandler;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0007J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0016H\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/ks2;", "", "Lcom/oplus/aiunit/vision/wr2;", "call", "Lcom/oplus/aiunit/vision/ezj;", "f", "", "c", "(Lcom/oplus/aiunit/vision/wr2;)Ljava/lang/Integer;", "Lcom/oplus/aiunit/vision/us2;", "callStat", "", "i", "b", "Lcom/oplus/aiunit/vision/bs2;", "a", b2n.g, "Lcom/heytap/common/bean/NetworkType;", "type", MapSchema.FIELD_NAME_KEY, "dnsType", "j", "", "protocol", b2n.f, "", "rtt", LogFieldKey.LEVEL_KEY, "d", "(Lcom/oplus/aiunit/vision/wr2;)Ljava/lang/Long;", OKHttpRequestHandler.RSP_TARGET_IP, LogFieldKey.MESSAGE_KEY, MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class ks2 {
    public static final ks2 INSTANCE = new ks2();

    @JvmStatic
    @Nullable
    public static final bs2 a(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        if (call instanceof dcf) {
            return ((dcf) call).getAttachInfo();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final CallStat b(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        if (call instanceof dcf) {
            return ((dcf) call).getCallStat();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Integer c(@Nullable wr2 call) {
        if (call instanceof dcf) {
            return Integer.valueOf(((dcf) call).z());
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Long d(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        bs2 bs2VarA = a(call);
        if (bs2VarA == null) {
            return null;
        }
        Object objC = bs2VarA.c("QUIC_RTT");
        return (Long) (objC instanceof Long ? objC : null);
    }

    @JvmStatic
    @Nullable
    public static final String e(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        bs2 bs2VarA = a(call);
        if (bs2VarA == null) {
            return null;
        }
        Object objC = bs2VarA.c("TARGET_IP");
        return (String) (objC instanceof String ? objC : null);
    }

    @JvmStatic
    @Nullable
    public static final ezj f(@Nullable wr2 call) {
        if (call instanceof dcf) {
            return ((dcf) call).getTimeStat();
        }
        return null;
    }

    @JvmStatic
    public static final void g(@NotNull wr2 call, @NotNull String protocol) {
        CommonStat commonStat;
        CommonStat commonStat2;
        List<String> listG;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        CallStat callStatB = b(call);
        if (callStatB != null && (commonStat2 = callStatB.getCommonStat()) != null && (listG = commonStat2.g()) != null) {
            listG.add(protocol);
        }
        CallStat callStatB2 = b(call);
        if (callStatB2 == null || (commonStat = callStatB2.getCommonStat()) == null) {
            return;
        }
        commonStat.l(protocol);
    }

    @JvmStatic
    public static final void h(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        if (call instanceof dcf) {
            ((dcf) call).getAttachInfo().b();
        }
    }

    @JvmStatic
    public static final void i(@NotNull wr2 call, @NotNull CallStat callStat) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(callStat, "callStat");
        if (call instanceof dcf) {
            ((dcf) call).H(callStat);
        }
    }

    @JvmStatic
    public static final void j(@NotNull wr2 call, int dnsType) {
        Intrinsics.checkNotNullParameter(call, "call");
        bs2 bs2VarA = a(call);
        if (bs2VarA != null) {
            bs2VarA.a("DNS_TYPE", Integer.valueOf(dnsType));
        }
    }

    @JvmStatic
    public static final void k(@NotNull wr2 call, @Nullable NetworkType type) {
        bs2 bs2VarA;
        Intrinsics.checkNotNullParameter(call, "call");
        if (type == null || (bs2VarA = a(call)) == null) {
            return;
        }
        bs2VarA.a("NETWORK_TYPE", type);
    }

    @JvmStatic
    public static final void l(@NotNull wr2 call, long rtt) {
        Intrinsics.checkNotNullParameter(call, "call");
        bs2 bs2VarA = a(call);
        if (bs2VarA != null) {
            bs2VarA.a("QUIC_RTT", Long.valueOf(rtt));
        }
    }

    @JvmStatic
    public static final void m(@NotNull wr2 call, @NotNull String targetIp) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(targetIp, "targetIp");
        bs2 bs2VarA = a(call);
        if (bs2VarA != null) {
            bs2VarA.a("TARGET_IP", targetIp);
        }
    }
}
