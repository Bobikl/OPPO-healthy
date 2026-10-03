package com.oplus.aiunit.vision;

import com.oplus.pantaconnect.sdk.DeviceType;
import com.oplus.pantaconnect.sdk.connectionservice.connection.ConnectionService;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/c4d;", "Lcom/oplus/aiunit/vision/x43;", "", "enable", "", ClickApiEntity.TIME, "", "a", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ConnectionService;", "b", "", "Ljava/lang/String;", "TAG", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ConnectionService;", "service", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class c4d implements x43 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "OS15CentralManager";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ConnectionService service;

    @Override // com.oplus.aiunit.vision.x43
    public void a(boolean enable, long time) {
        ConnectionService connectionServiceB = b();
        if (connectionServiceB != null) {
            connectionServiceB.enableDiscoverability(DeviceType.SMART_WATCH, enable, time);
            connectionServiceB.enableDiscoverability(DeviceType.BRACELET, enable, time);
            connectionServiceB.enableDiscoverability(DeviceType.APPLE_WATCH, enable, time);
        }
    }

    public final ConnectionService b() {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.service == null) {
                this.service = ConnectionService.INSTANCE.create();
            }
            objM5287constructorimpl = Result.m5287constructorimpl(this.service);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            ml4.c(this.TAG, "getCentralManager error:" + thM5290exceptionOrNullimpl.getMessage());
            objM5287constructorimpl = null;
        }
        return (ConnectionService) objM5287constructorimpl;
    }
}
