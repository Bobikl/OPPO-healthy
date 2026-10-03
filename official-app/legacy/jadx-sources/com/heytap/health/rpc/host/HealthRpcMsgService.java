package com.heytap.health.rpc.host;

import android.os.Binder;
import com.heytap.health.rpc.AbsRpcMsgService;
import com.heytap.health.rpc.RpcMsg;
import com.oplus.aiunit.vision.a7b;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.ArrayIteratorKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\r"}, d2 = {"Lcom/heytap/health/rpc/host/HealthRpcMsgService;", "Lcom/heytap/health/rpc/AbsRpcMsgService;", "Lcom/heytap/health/rpc/RpcMsg;", "msg", "", "b", "", "callingUid", "", "a", "c", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public final class HealthRpcMsgService extends AbsRpcMsgService {
    @Override // com.heytap.health.rpc.AbsRpcMsgService
    public boolean a(int callingUid) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid == null) {
            a7b.b(com.heytap.health.rpc.c.TAG, "Calling packages is null");
            return false;
        }
        Iterator it = ArrayIteratorKt.iterator(packagesForUid);
        while (it.hasNext()) {
            String p = (String) it.next();
            a7b.f(com.heytap.health.rpc.c.TAG, "Calling package name=" + p);
            c.Companion companion = c.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(p, "p");
            if (companion.a(this, p)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.heytap.health.rpc.AbsRpcMsgService
    public void b(@NotNull RpcMsg msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int iC = c(Binder.getCallingUid());
        if (iC != 0) {
            d.INSTANCE.f(iC, msg);
        } else {
            a7b.b(com.heytap.health.rpc.c.TAG, "Unknown msg, appId not found");
        }
    }

    public final int c(int callingUid) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            if (!(packagesForUid.length == 0)) {
                return c.INSTANCE.c(packagesForUid);
            }
        }
        return 0;
    }
}
