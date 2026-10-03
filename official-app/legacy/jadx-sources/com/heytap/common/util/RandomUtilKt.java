package com.heytap.common.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import okhttp3.httpdns.IpInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u001a@\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002\u001a \u0010\f\u001a\u00020\u0005*\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002¨\u0006\r"}, d2 = {"", "Lokhttp3/httpdns/IpInfo;", "ipList", "Lkotlin/Function1;", "", "", "extra", "", "c", "index", "totalWeight", "b", "a", "com.heytap.nearx.common"}, k = 2, mv = {1, 4, 0})
public final class RandomUtilKt {
    public static final int a(IpInfo ipInfo, Function1<? super String, Integer> function1) {
        return Math.max(0, ipInfo.getWeight() + function1.invoke(ipInfo.getIp()).intValue());
    }

    public static final List<IpInfo> b(List<IpInfo> list, int i, int i2, Function1<? super String, Integer> function1) {
        int size = list.size();
        if (i >= size) {
            return list;
        }
        int iNextInt = new Random().nextInt(Math.max(1, i2)) + 1;
        int iA = 0;
        for (int i3 = i; i3 < size; i3++) {
            IpInfo ipInfo = list.get(i3);
            iA += a(ipInfo, function1);
            if (iA >= iNextInt) {
                list.remove(i3);
                list.add(i, ipInfo);
                return b(list, i + 1, i2 - a(ipInfo, function1), function1);
            }
        }
        return list;
    }

    @NotNull
    public static final List<IpInfo> c(@NotNull List<IpInfo> ipList, @NotNull Function1<? super String, Integer> extra) {
        Intrinsics.checkNotNullParameter(ipList, "ipList");
        Intrinsics.checkNotNullParameter(extra, "extra");
        if (ipList.isEmpty()) {
            return new ArrayList();
        }
        if (ipList.size() == 1) {
            return ipList;
        }
        Iterator<T> it = ipList.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += a((IpInfo) it.next(), extra);
        }
        return b(ipList, 0, iA, extra);
    }

    public static /* synthetic */ List d(List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<String, Integer>() { // from class: com.heytap.common.util.RandomUtilKt$randomWeight$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return 0;
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(String str) {
                    return Integer.valueOf(invoke2(str));
                }
            };
        }
        return c(list, function1);
    }
}
