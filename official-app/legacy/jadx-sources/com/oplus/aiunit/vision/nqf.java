package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.heytap.trace.TraceLevel;
import io.protostuff.MapSchema;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/nqf;", "", "Lokhttp3/Request;", "request", "", b2n.f, "Lokhttp3/Request$Builder;", "", "a", "", "connectTimeMill", "b", "readTimeoutMill", b2n.g, "writeTimeoutMill", LogFieldKey.MESSAGE_KEY, "retryTimes", MapSchema.FIELD_NAME_KEY, "d", "j", "c", "", "ip", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_ENTRY, "code", "i", "Lcom/heytap/trace/TraceLevel;", "f", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class nqf {
    public static final nqf INSTANCE = new nqf();

    @JvmStatic
    public static final boolean g(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        if (eqfVarA != null) {
            return eqfVarA.getEnableCustomizeHeader();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NotNull Request.Builder request) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVar = (RequestAttachInfo) request.gtag(RequestAttachInfo.class);
        if (eqfVar == null) {
            eqfVar = new RequestAttachInfo(null, 1, 0 == true ? 1 : 0);
        }
        request.tag(RequestAttachInfo.class, eqfVar);
    }

    public final int b(@NotNull Request request, int connectTimeMill) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        int iA = j35.a(eqfVarA != null ? Integer.valueOf(eqfVarA.getConnectTimeoutMillKeep()) : null);
        return iA > 0 ? iA : connectTimeMill;
    }

    public final boolean c(@NotNull Request request) {
        xf8 xf8VarJ;
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        if (eqfVarA == null || (xf8VarJ = eqfVarA.getRetry_common()) == null) {
            return false;
        }
        return xf8VarJ.getIsRetryStatus();
    }

    public final int d(@NotNull Request request) {
        xf8 xf8VarJ;
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        return j35.a((eqfVarA == null || (xf8VarJ = eqfVarA.getRetry_common()) == null) ? null : Integer.valueOf(xf8VarJ.getRetryTime()));
    }

    @Nullable
    public final String e(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        if (eqfVarA != null) {
            return eqfVarA.getTargetIp();
        }
        return null;
    }

    @NotNull
    public final TraceLevel f(@NotNull Request request) {
        TraceLevel traceLevelK;
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        return (eqfVarA == null || (traceLevelK = eqfVarA.getTraceLevel()) == null) ? TraceLevel.DEFAULT : traceLevelK;
    }

    public final int h(@NotNull Request request, int readTimeoutMill) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        int iA = j35.a(eqfVarA != null ? Integer.valueOf(eqfVarA.getReadTimeoutMillKeep()) : null);
        return iA > 0 ? iA : readTimeoutMill;
    }

    public final void i(@NotNull Request request, int code) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        if (eqfVarA != null) {
            eqfVarA.m(code);
        }
    }

    public final void j(@NotNull Request request) {
        xf8 xf8VarJ;
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        if (eqfVarA == null || (xf8VarJ = eqfVarA.getRetry_common()) == null) {
            return;
        }
        xf8VarJ.c(true);
    }

    public final void k(@NotNull Request request, int retryTimes) {
        xf8 xf8VarJ;
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        if (eqfVarA == null || (xf8VarJ = eqfVarA.getRetry_common()) == null) {
            return;
        }
        xf8VarJ.d(retryTimes);
    }

    public final void l(@NotNull Request request, @Nullable String ip) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        if (eqfVarA != null) {
            eqfVarA.n(j35.c(ip));
        }
    }

    public final int m(@NotNull Request request, int writeTimeoutMill) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestAttachInfo eqfVarA = ly6.a(request);
        int iA = j35.a(eqfVarA != null ? Integer.valueOf(eqfVarA.getWriteTimeoutMillKeep()) : null);
        return iA > 0 ? iA : writeTimeoutMill;
    }
}
