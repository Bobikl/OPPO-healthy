package com.oplus.pantaconnect.sdk.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.heytap.health.settings.me.thirdpartbinding.wechat.a;
import com.oplus.pantaconnect.sdk.PlatformInitialization;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.pantaconnect.sdk.logger.SdkLogger;
import com.oplus.pantaconnect.service.IOuterIpcCallback;
import com.oplus.pantaconnect.service.IOuterIpcInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002$%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J*\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u001cH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivityImpl;", "Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivity;", "()V", ServiceNodeBundleKeys.CONNECT_STATE, "Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivityImpl$ConnectState;", "connection", "com/oplus/pantaconnect/sdk/ipc/ServiceConnectivityImpl$connection$1", "Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivityImpl$connection$1;", "context", "Landroid/content/Context;", "deathRecipient", "Lcom/oplus/pantaconnect/sdk/ipc/ServerDeathRecipient;", "lastBindServiceTime", "", "lock", "Ljava/lang/Object;", "logger", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "outerIpcInterface", "Lcom/oplus/pantaconnect/service/IOuterIpcInterface;", "serviceBound", "", "bind", "getIpcCallback", "Lcom/oplus/pantaconnect/service/IOuterIpcCallback;", "method", "", "resultReceiver", "Lkotlin/Function2;", "", "Landroid/os/Bundle;", "getIpcInterface", "getIpcInterfaceInternal", "isConnected", "isConnecting", a.key_unbind, "ConnectState", "OuterIpcCallback", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ServiceConnectivityImpl implements ServiceConnectivity {
    private long lastBindServiceTime;

    @Nullable
    private volatile IOuterIpcInterface outerIpcInterface;
    private volatile boolean serviceBound;

    @NotNull
    private final SdkLogger logger = SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "ServiceConnectivityImpl", null, 2, null);

    @NotNull
    private final Context context = PlatformInitialization.INSTANCE.getContext();

    @NotNull
    private volatile ConnectState connectState = ConnectState.DISCONNECTED;

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final ServerDeathRecipient deathRecipient = ServerDeathRecipient.INSTANCE;

    @NotNull
    private final ServiceConnectivityImpl$connection$1 connection = new ServiceConnection() { // from class: com.oplus.pantaconnect.sdk.ipc.ServiceConnectivityImpl$connection$1
        /* JADX WARN: Code duplicated, block: B:12:0x004b A[Catch: RemoteException -> 0x0047, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x0047, blocks: (B:8:0x003a, B:12:0x004b), top: B:25:0x003a }] */
        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            SdkLogger sdkLogger = this.this$0.logger;
            StringBuilder sb = new StringBuilder("onServiceConnected, ");
            Unit unit = null;
            sb.append(name != null ? name.getClassName() : null);
            sdkLogger.info(sb.toString());
            this.this$0.serviceBound = true;
            this.this$0.logger.printPTCSdkInfo();
            this.this$0.outerIpcInterface = IOuterIpcInterface.Stub.asInterface(service);
            if (service != null) {
                try {
                    service.linkToDeath(this.this$0.deathRecipient, 0);
                    unit = Unit.INSTANCE;
                    if (unit == null) {
                        this.this$0.logger.error("link to death failed");
                    }
                } catch (RemoteException e2) {
                    this.this$0.logger.error("link to server death exception, message: " + e2.getMessage());
                }
            } else if (unit == null) {
                this.this$0.logger.error("link to death failed");
            }
            Object obj = this.this$0.lock;
            ServiceConnectivityImpl serviceConnectivityImpl = this.this$0;
            synchronized (obj) {
                serviceConnectivityImpl.connectState = ServiceConnectivityImpl.ConnectState.CONNECTED;
                serviceConnectivityImpl.lock.notifyAll();
                Unit unit2 = Unit.INSTANCE;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
            SdkLogger sdkLogger = this.this$0.logger;
            StringBuilder sb = new StringBuilder("onServiceDisconnected!, ");
            sb.append(name != null ? name.getClassName() : null);
            sdkLogger.info(sb.toString());
            this.this$0.serviceBound = false;
            PlatformInitialization.INSTANCE.clearFrameworkVersionName$core_release();
            this.this$0.outerIpcInterface = null;
            Object obj = this.this$0.lock;
            ServiceConnectivityImpl serviceConnectivityImpl = this.this$0;
            synchronized (obj) {
                serviceConnectivityImpl.connectState = ServiceConnectivityImpl.ConnectState.DISCONNECTED;
                serviceConnectivityImpl.lock.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            this.this$0.deathRecipient.handleServiceDisconnected();
        }
    };

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivityImpl$ConnectState;", "", "(Ljava/lang/String;I)V", "CONNECTED", LanConstants.STATE_DISCONNECTED, "CONNECTING", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum ConnectState {
        CONNECTED,
        DISCONNECTED,
        CONNECTING;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<ConnectState> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ&\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/oplus/pantaconnect/sdk/ipc/ServiceConnectivityImpl$OuterIpcCallback;", "Lcom/oplus/pantaconnect/service/IOuterIpcCallback$Stub;", "filterMethod", "", "receiver", "Lkotlin/Function2;", "", "Landroid/os/Bundle;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "callback", "method", "data", "bundle", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OuterIpcCallback extends IOuterIpcCallback.Stub {

        @NotNull
        private final String filterMethod;

        @NotNull
        private final Function2<byte[], Bundle, Boolean> receiver;

        /* JADX WARN: Multi-variable type inference failed */
        public OuterIpcCallback(@NotNull String str, @NotNull Function2<? super byte[], ? super Bundle, Boolean> function2) {
            this.filterMethod = str;
            this.receiver = function2;
        }

        @Override // com.oplus.pantaconnect.service.IOuterIpcCallback
        public boolean callback(@Nullable String method, @Nullable byte[] data, @Nullable Bundle bundle) {
            if (!Intrinsics.areEqual(method, this.filterMethod)) {
                return false;
            }
            Function2<byte[], Bundle, Boolean> function2 = this.receiver;
            if (data == null) {
                data = new byte[0];
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            return function2.invoke(data, bundle).booleanValue();
        }
    }

    private final IOuterIpcInterface getIpcInterfaceInternal() {
        if (this.outerIpcInterface != null) {
            return this.outerIpcInterface;
        }
        this.logger.info("getIpcInterfaceInternal, connectState -> " + this.connectState + '.');
        bind();
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            this.logger.warning("can not bind and wait in main thread!");
            return this.outerIpcInterface;
        }
        synchronized (this.lock) {
            int i = 0;
            while (!isConnected() && i <= 2) {
                this.lock.wait(2000L);
                this.logger.debug("wait finished, connectState=" + this.connectState + ", retryTimes=" + i);
                if (!isConnected()) {
                    i++;
                    this.connectState = ConnectState.DISCONNECTED;
                    bind();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return this.outerIpcInterface;
    }

    private final boolean isConnecting() {
        return this.connectState == ConnectState.CONNECTING;
    }

    @Override // com.oplus.pantaconnect.sdk.ipc.ServiceConnectivity
    public boolean bind() {
        this.logger.debug("bind service if need");
        if (isConnected()) {
            this.logger.info("current service is running.");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConnectState connectState = this.connectState;
        ConnectState connectState2 = ConnectState.CONNECTING;
        if (connectState == connectState2 && Math.abs(jCurrentTimeMillis - this.lastBindServiceTime) < 2000) {
            this.logger.info("current service is binding, time interval in 2s");
            return false;
        }
        synchronized (this.lock) {
            if (!isConnected() && !isConnecting()) {
                this.logger.debug("bind service in locked");
                this.lastBindServiceTime = System.currentTimeMillis();
                this.connectState = connectState2;
                Context context = this.context;
                Intent intent = new Intent();
                intent.setClassName("com.heytap.accessory", "com.oplus.pantaconnect.service.CoreService");
                if (!context.bindService(intent, this.connection, 33)) {
                    this.logger.warning("bind ptc failed.");
                }
                Unit unit = Unit.INSTANCE;
                return true;
            }
            this.logger.info("current service is running or binding, connectState: " + this.connectState);
            return false;
        }
    }

    @Override // com.oplus.pantaconnect.sdk.ipc.ServiceConnectivity
    @NotNull
    public IOuterIpcCallback getIpcCallback(@NotNull String method, @NotNull Function2<? super byte[], ? super Bundle, Boolean> resultReceiver) {
        return new OuterIpcCallback(method, resultReceiver);
    }

    @Override // com.oplus.pantaconnect.sdk.ipc.ServiceConnectivity
    @Nullable
    public IOuterIpcInterface getIpcInterface() {
        return getIpcInterfaceInternal();
    }

    @Override // com.oplus.pantaconnect.sdk.ipc.ServiceConnectivity
    public boolean isConnected() {
        return this.connectState == ConnectState.CONNECTED;
    }

    @Override // com.oplus.pantaconnect.sdk.ipc.ServiceConnectivity
    public synchronized boolean unbind() {
        if (!this.serviceBound) {
            this.logger.warning("unbindService: service has unbound");
            return false;
        }
        this.logger.info("unbindService");
        this.serviceBound = false;
        this.outerIpcInterface = null;
        try {
            this.context.unbindService(this.connection);
        } catch (Exception e2) {
            this.logger.error("link to server death exception, message: " + e2.getMessage());
        }
        return true;
    }
}
