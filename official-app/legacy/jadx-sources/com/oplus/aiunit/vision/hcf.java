package com.oplus.aiunit.vision;

import java.net.UnknownHostException;
import java.util.List;
import okhttp3.httpdns.IpInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/hcf;", "Lcom/oplus/aiunit/vision/zn9$a;", "Lcom/oplus/aiunit/vision/wx5;", "request", "", "b", "()Z", "source", "Lcom/oplus/aiunit/vision/yx5;", "a", "", "I", "calls", "", "Lcom/oplus/aiunit/vision/zn9;", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "interceptors", "c", "Lcom/oplus/aiunit/vision/wx5;", "domainUnit", "d", "getIndex", "()I", "index", "<init>", "(Ljava/util/List;Lcom/oplus/aiunit/vision/wx5;I)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class hcf implements zn9.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int calls;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<zn9> interceptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final DnsRequest domainUnit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int index;

    /* JADX WARN: Multi-variable type inference failed */
    public hcf(@NotNull List<? extends zn9> interceptors, @NotNull DnsRequest domainUnit, int i) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(domainUnit, "domainUnit");
        this.interceptors = interceptors;
        this.domainUnit = domainUnit;
        this.index = i;
    }

    @Override // com.oplus.aiunit.vision.zn9.a
    @NotNull
    public yx5 a(@NotNull DnsRequest source) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.index >= this.interceptors.size()) {
            throw new ArrayIndexOutOfBoundsException("index must smaller than interceptors size");
        }
        boolean z = true;
        this.calls++;
        hcf hcfVar = new hcf(this.interceptors, source, this.index + 1);
        zn9 zn9Var = this.interceptors.get(this.index);
        yx5 yx5VarA = zn9Var.a(hcfVar);
        if (this.index + 2 < this.interceptors.size() && hcfVar.calls != 1) {
            throw new IllegalStateException("network interceptor " + zn9Var + " must call proceed() exactly once");
        }
        if (yx5VarA.j()) {
            List<IpInfo> listI = yx5VarA.i();
            if (listI != null && !listI.isEmpty()) {
                z = false;
            }
            if (z) {
                throw new IllegalStateException("interceptor " + zn9Var + " returned a destination with no ip list");
            }
        }
        return yx5VarA;
    }

    public final boolean b() {
        return this.index == this.interceptors.size();
    }

    @Override // com.oplus.aiunit.vision.zn9.a
    @NotNull
    /* JADX INFO: renamed from: request, reason: from getter */
    public DnsRequest getDomainUnit() {
        return this.domainUnit;
    }
}
