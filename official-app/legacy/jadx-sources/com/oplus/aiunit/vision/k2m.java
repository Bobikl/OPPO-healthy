package com.oplus.aiunit.vision;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.httpdns.IpInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/k2m;", "Lcom/oplus/aiunit/vision/zn9;", "Lcom/oplus/aiunit/vision/zn9$a;", "chain", "Lcom/oplus/aiunit/vision/yx5;", "a", "Lcom/oplus/aiunit/vision/r7b;", "Lcom/oplus/aiunit/vision/r7b;", "logger", "<init>", "(Lcom/oplus/aiunit/vision/r7b;)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class k2m implements zn9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final r7b logger;

    public k2m(@Nullable r7b r7bVar) {
        this.logger = r7bVar;
    }

    @Override // com.oplus.aiunit.vision.zn9
    @NotNull
    public yx5 a(@NotNull zn9.a chain) throws UnknownHostException {
        List<IpInfo> arrayList;
        Intrinsics.checkNotNullParameter(chain, "chain");
        yx5 yx5VarA = chain.a(chain.getDomainUnit());
        List<IpInfo> listI = yx5VarA.i();
        if (!(listI == null || listI.isEmpty())) {
            r7b r7bVar = this.logger;
            if (r7bVar != null) {
                r7b.b(r7bVar, "WrapperInterceptor", "result ip list is " + yx5VarA.i(), null, null, 12, null);
            }
            return yx5VarA;
        }
        r7b r7bVar2 = this.logger;
        if (r7bVar2 != null) {
            r7b.b(r7bVar2, "WrapperInterceptor", "no available ip list, use default dns result", null, null, 12, null);
        }
        yx5.a aVarF = yx5VarA.k().d(103).f("has no available ipList , use default dns result");
        yx5 dnsResult = yx5VarA.getDnsResult();
        if (dnsResult == null || (arrayList = dnsResult.i()) == null) {
            arrayList = new ArrayList<>();
        }
        return aVarF.e(arrayList).a();
    }
}
