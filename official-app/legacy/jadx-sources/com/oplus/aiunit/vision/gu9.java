package com.oplus.aiunit.vision;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/gu9;", "Lcom/oplus/aiunit/vision/tu9;", "", "Ljava/net/InetAddress;", "inetAddresses", "a", "<init>", "()V", "com.heytap.nearx.ipswitcher"}, k = 1, mv = {1, 4, 0})
public final class gu9 implements tu9 {
    @Override // com.oplus.aiunit.vision.tu9
    @NotNull
    public List<InetAddress> a(@NotNull List<? extends InetAddress> inetAddresses) {
        Intrinsics.checkNotNullParameter(inetAddresses, "inetAddresses");
        ArrayList arrayList = new ArrayList();
        for (Object obj : inetAddresses) {
            InetAddress inetAddress = (InetAddress) obj;
            if ((inetAddress instanceof Inet4Address) && !((Inet4Address) inetAddress).isLoopbackAddress()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
