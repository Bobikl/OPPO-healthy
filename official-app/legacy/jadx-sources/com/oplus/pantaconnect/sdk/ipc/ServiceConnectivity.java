package com.oplus.pantaconnect.sdk.ipc;

import android.os.Bundle;
import com.heytap.health.settings.me.thirdpartbinding.wechat.a;
import com.oplus.pantaconnect.sdk.exception.IpcInterfaceNullPointException;
import com.oplus.pantaconnect.service.IOuterIpcCallback;
import com.oplus.pantaconnect.service.IOuterIpcInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\b\u0010\u0002\u001a\u00020\u0003H&J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\tH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivity;", "", "bind", "", "getIpcCallback", "Lcom/oplus/pantaconnect/service/IOuterIpcCallback;", "method", "", "resultReceiver", "Lkotlin/Function2;", "", "Landroid/os/Bundle;", "getIpcInterface", "Lcom/oplus/pantaconnect/service/IOuterIpcInterface;", "isConnected", a.key_unbind, "Companion", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ServiceConnectivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivity$Companion;", "", "()V", "instance", "Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivityImpl;", "getInstance", "()Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivityImpl;", "instance$delegate", "Lkotlin/Lazy;", "create", "Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivity;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: instance$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy<ServiceConnectivityImpl> instance = LazyKt__LazyJVMKt.lazy(new Function0<ServiceConnectivityImpl>() { // from class: com.oplus.pantaconnect.sdk.ipc.ServiceConnectivity$Companion$instance$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ServiceConnectivityImpl invoke() {
                return new ServiceConnectivityImpl();
            }
        });

        private Companion() {
        }

        private final ServiceConnectivityImpl getInstance() {
            return instance.getValue();
        }

        @NotNull
        public final ServiceConnectivity create() {
            return getInstance();
        }
    }

    boolean bind();

    @NotNull
    IOuterIpcCallback getIpcCallback(@NotNull String method, @NotNull Function2<? super byte[], ? super Bundle, Boolean> resultReceiver);

    @Nullable
    IOuterIpcInterface getIpcInterface() throws IpcInterfaceNullPointException;

    boolean isConnected();

    boolean unbind();
}
