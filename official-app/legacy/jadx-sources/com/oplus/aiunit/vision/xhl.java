package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/xhl;", "", "", "a", "Ljava/lang/String;", "lastTriggerBandWidthDetectReason", "", "b", "Z", "isHubbleOpen", "Lcom/oplus/aiunit/vision/r7b;", "c", "Lcom/oplus/aiunit/vision/r7b;", "getLogger", "()Lcom/oplus/aiunit/vision/r7b;", "logger", "<init>", "(Lcom/oplus/aiunit/vision/r7b;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class xhl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "WeakNetLog";

    @NotNull
    public static final String WEAK_NET_BANDWIDTH_VALUE = "weak_net_bandwidth_value";

    @NotNull
    public static final String WEAK_NET_DELAY_VALUE = "weak_net_delay_value";

    @NotNull
    public static final String WEAK_NET_ISP = "weak_net_isp";

    @NotNull
    public static final String WEAK_NET_NETWORK_TYPE = "weak_net_network_type";

    @NotNull
    public static final String WEAK_NET_PROTOCOL = "weak_net_protocol";

    @NotNull
    public static final String WEAK_NET_REASON = "weak_net_reason";

    @NotNull
    public static final String WEAK_NET_SIGNAL_VALUE = "weak_net_signal_value";

    @NotNull
    public static final String WEAK_NET_TIME = "weak_net_time";

    @NotNull
    public static final String WEAK_NET_TIME_SLICE = "weak_net_time_slice";

    @NotNull
    public static final String WEAK_NET_TRIGGER_REASON_CONNECT = "connect_delay";

    @NotNull
    public static final String WEAK_NET_TRIGGER_REASON_DNS = "dns_delay";

    @NotNull
    public static final String WEAK_NET_TRIGGER_REASON_HEADER = "header_delay";

    @NotNull
    public static final String WEAK_NET_TRIGGER_REASON_TIMEOUT = "timeout";
    public static volatile xhl d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String lastTriggerBandWidthDetectReason;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isHubbleOpen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r7b logger;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.xhl$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/xhl$a;", "", "Lcom/oplus/aiunit/vision/r7b;", "logger", "Lcom/oplus/aiunit/vision/xhl;", "a", "INSTANCE", "Lcom/oplus/aiunit/vision/xhl;", "", "TAG", "Ljava/lang/String;", "WEAK_NET_BANDWIDTH_VALUE", "WEAK_NET_DELAY_VALUE", "WEAK_NET_ISP", "WEAK_NET_NETWORK_TYPE", "WEAK_NET_PROTOCOL", "WEAK_NET_REASON", "WEAK_NET_SIGNAL_VALUE", "WEAK_NET_TIME", "WEAK_NET_TIME_SLICE", "WEAK_NET_TRIGGER_REASON_CONNECT", "WEAK_NET_TRIGGER_REASON_DNS", "WEAK_NET_TRIGGER_REASON_HEADER", "WEAK_NET_TRIGGER_REASON_TIMEOUT", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final xhl a(@NotNull r7b logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            if (xhl.d == null) {
                synchronized (xhl.class) {
                    if (xhl.d == null) {
                        xhl.d = new xhl(logger);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return xhl.d;
        }
    }

    public xhl(@NotNull r7b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.lastTriggerBandWidthDetectReason = "";
        this.isHubbleOpen = true;
    }
}
