package com.oplus.aiunit.vision;

import com.heytap.accessory.bean.DiscoveryException;
import com.heytap.accessory.discovery.CentralManager;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/b4d;", "Lcom/oplus/aiunit/vision/x43;", "", "enable", "", ClickApiEntity.TIME, "", "a", "Lcom/heytap/accessory/discovery/CentralManager;", "b", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class b4d implements x43 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "OS14CentralManager";

    @Override // com.oplus.aiunit.vision.x43
    public void a(boolean enable, long time) throws DiscoveryException {
        CentralManager centralManagerB = b();
        if (centralManagerB != null) {
            centralManagerB.expEnableDiscoverability(1, enable, time);
            centralManagerB.expEnableDiscoverability(7, enable, time);
        }
    }

    public final CentralManager b() {
        Object objM5287constructorimpl;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            CentralManager centralManager = CentralManager.getInstance();
            if (!centralManager.init(b78.a())) {
                ml4.c(this.TAG, "getCentralManager init fail");
                centralManager = null;
            }
            objM5287constructorimpl = Result.m5287constructorimpl(centralManager);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            obj = objM5287constructorimpl;
        } else {
            ml4.c(this.TAG, "getCentralManager error:" + thM5290exceptionOrNullimpl.getMessage());
        }
        return (CentralManager) obj;
    }
}
