package com.oplus.aiunit.vision;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.net.InetAddress;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00062\u00020\u0001:\u0002\u0005\u0007J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/tu9;", "", "", "Ljava/net/InetAddress;", "inetAddresses", "a", "Companion", "b", "com.heytap.nearx.ipswitcher"}, k = 1, mv = {1, 4, 0})
public interface tu9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String DEFAULT = "default";

    @NotNull
    public static final String IPV4_FIRST = "ipv4_first";

    @NotNull
    public static final String IPV4_ONLY = "ipv4_only";

    @NotNull
    public static final String IPV6_FIRST = "ipv6_first";

    @NotNull
    public static final String IPV6_ONLY = "ipv6_only";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.tu9$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/tu9$a;", "", "", "IPV6_FIRST", "Ljava/lang/String;", "IPV4_FIRST", "IPV6_ONLY", "IPV4_ONLY", "DEFAULT", "<init>", "()V", "com.heytap.nearx.ipswitcher"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        @NotNull
        public static final String DEFAULT = "default";

        @NotNull
        public static final String IPV4_FIRST = "ipv4_first";

        @NotNull
        public static final String IPV4_ONLY = "ipv4_only";

        @NotNull
        public static final String IPV6_FIRST = "ipv6_first";

        @NotNull
        public static final String IPV6_ONLY = "ipv6_only";
        public static final /* synthetic */ Companion a = new Companion();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/tu9$b;", "", "", Fields.SP_STRATEGY_FIELD, "Lcom/oplus/aiunit/vision/tu9;", "a", "<init>", "()V", "com.heytap.nearx.ipswitcher"}, k = 1, mv = {1, 4, 0})
    public static final class b {
        public static final b INSTANCE = new b();

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final tu9 a(@NotNull String strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            switch (strategy.hashCode()) {
                case -1034528168:
                    if (strategy.equals("ipv6_first")) {
                        return new hu9();
                    }
                    break;
                case 48189894:
                    if (strategy.equals("ipv4_only")) {
                        return new gu9();
                    }
                    break;
                case 105448196:
                    if (strategy.equals("ipv6_only")) {
                        return new iu9();
                    }
                    break;
                case 1485431766:
                    if (strategy.equals("ipv4_first")) {
                        return new fu9();
                    }
                    break;
            }
            return new a65();
        }
    }

    @NotNull
    List<InetAddress> a(@NotNull List<? extends InetAddress> inetAddresses);
}
