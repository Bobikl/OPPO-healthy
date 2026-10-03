package com.oplus.aiunit.vision;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/hu9;", "Lcom/oplus/aiunit/vision/tu9;", "", "Ljava/net/InetAddress;", "inetAddresses", "a", "<init>", "()V", "com.heytap.nearx.ipswitcher"}, k = 1, mv = {1, 4, 0})
public final class hu9 implements tu9 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "o1", "o2", "", "a", "(Ljava/net/InetAddress;Ljava/net/InetAddress;)I"}, k = 3, mv = {1, 4, 0})
    public static final class a<T> implements Comparator<InetAddress> {
        public static final a INSTANCE = new a();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(InetAddress inetAddress, InetAddress inetAddress2) {
            boolean z = false;
            boolean z2 = (inetAddress instanceof Inet6Address) && !((Inet6Address) inetAddress).isLoopbackAddress();
            if ((inetAddress2 instanceof Inet6Address) && !((Inet6Address) inetAddress2).isLoopbackAddress()) {
                z = true;
            }
            return (!z || z2) ? -1 : 1;
        }
    }

    @Override // com.oplus.aiunit.vision.tu9
    @NotNull
    public List<InetAddress> a(@NotNull List<? extends InetAddress> inetAddresses) {
        Intrinsics.checkNotNullParameter(inetAddresses, "inetAddresses");
        return CollectionsKt___CollectionsKt.sortedWith(inetAddresses, a.INSTANCE);
    }
}
