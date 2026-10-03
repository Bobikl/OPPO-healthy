package com.heytap.connect;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.connect.api.IDevice;
import com.heytap.connect.api.listener.EventListenerImpl;
import com.heytap.connect.api.listener.IConnectStateListener;
import com.heytap.connect.api.listener.IMessageStateListener;
import com.heytap.connect.api.logger.Logger;
import com.heytap.connect.api.service.ServiceManager;
import com.heytap.connect.api.service.ServiceProvider;
import com.heytap.connect.config.CommonConfig;
import com.heytap.connect.config.NettyInitConfig;
import com.heytap.connect.config.TapConnectConfig;
import com.heytap.connect.config.UniqueIdTools;
import com.heytap.connect.config.connectid.IConnectId;
import com.heytap.connect.config.executor.IExecutor;
import com.heytap.connect.config.ip.IDns;
import com.heytap.connect.message.heartbeat.NewFixedHeartBeatStrategy;
import com.heytap.connect.netty.NettyInitManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 E2\u00020\u0001:\u0001EB\u000f\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\bC\u0010DJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00101\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010=\u001a\u0002098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/heytap/connect/TapConnectClient;", "", "", "initConnectLogic", "()V", "Lcom/heytap/connect/config/TapConnectConfig;", "config", "Lcom/heytap/connect/api/listener/IConnectStateListener;", "connectListener", "Lcom/heytap/connect/api/listener/IMessageStateListener;", "messageListener", "init", "(Lcom/heytap/connect/config/TapConnectConfig;Lcom/heytap/connect/api/listener/IConnectStateListener;Lcom/heytap/connect/api/listener/IMessageStateListener;)V", "preInit", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)Lkotlin/Unit;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "impl", "regComponent", "(Ljava/lang/Class;Ljava/lang/Object;)V", "default", "getComponent", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", "", "cmd", "handleHttpDnsCmd", "(Ljava/lang/String;)V", "Lcom/heytap/connect/TapConnection;", "newConnect", "()Lcom/heytap/connect/TapConnection;", "release", "Lcom/heytap/connect/api/listener/IConnectStateListener;", "Lcom/heytap/connect/message/heartbeat/NewFixedHeartBeatStrategy;", "quicHeartBeatStrategy", "Lcom/heytap/connect/message/heartbeat/NewFixedHeartBeatStrategy;", "tcpHeartBeatStrategy", "Lcom/heytap/connect/api/listener/IMessageStateListener;", "Lcom/heytap/connect/api/listener/EventListenerImpl;", "eventListener", "Lcom/heytap/connect/api/listener/EventListenerImpl;", "Lcom/heytap/connect/config/connectid/IConnectId;", "connectLogic$delegate", "Lkotlin/Lazy;", "getConnectLogic", "()Lcom/heytap/connect/config/connectid/IConnectId;", "connectLogic", "Lcom/heytap/connect/api/service/ServiceManager;", "runtimeComponents", "Lcom/heytap/connect/api/service/ServiceManager;", "Lcom/heytap/connect/config/TapConnectConfig;", "Lcom/heytap/connect/netty/NettyInitManager;", "nettyInitManager", "Lcom/heytap/connect/netty/NettyInitManager;", "Lcom/heytap/connect/api/IDevice;", "iDevice$delegate", "getIDevice", "()Lcom/heytap/connect/api/IDevice;", "iDevice", "tapConnection", "Lcom/heytap/connect/TapConnection;", "Lcom/heytap/connect/config/executor/IExecutor;", "executor", "Lcom/heytap/connect/config/executor/IExecutor;", "<init>", "(Lcom/heytap/connect/api/service/ServiceManager;)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class TapConnectClient {

    @NotNull
    private static final String TAG = "TapConnectClient";

    @Nullable
    private TapConnectConfig config;

    @Nullable
    private IConnectStateListener connectListener;

    /* JADX INFO: renamed from: connectLogic$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy connectLogic;

    @Nullable
    private EventListenerImpl eventListener;

    @Nullable
    private IExecutor executor;

    /* JADX INFO: renamed from: iDevice$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iDevice;

    @Nullable
    private IMessageStateListener messageListener;

    @Nullable
    private NettyInitManager nettyInitManager;

    @Nullable
    private NewFixedHeartBeatStrategy quicHeartBeatStrategy;

    @NotNull
    private final ServiceManager runtimeComponents;

    @Nullable
    private TapConnection tapConnection;

    @Nullable
    private NewFixedHeartBeatStrategy tcpHeartBeatStrategy;

    public TapConnectClient(@NotNull ServiceManager runtimeComponents) {
        Intrinsics.checkNotNullParameter(runtimeComponents, "runtimeComponents");
        this.runtimeComponents = runtimeComponents;
        this.connectLogic = LazyKt__LazyJVMKt.lazy(new Function0<IConnectId>() { // from class: com.heytap.connect.TapConnectClient$connectLogic$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final IConnectId invoke() {
                IConnectId iConnectId = (IConnectId) ServiceProvider.DefaultImpls.getService$default(this.this$0.runtimeComponents, IConnectId.class, null, 2, null);
                Intrinsics.checkNotNull(iConnectId);
                return iConnectId;
            }
        });
        this.iDevice = LazyKt__LazyJVMKt.lazy(new Function0<IDevice>() { // from class: com.heytap.connect.TapConnectClient$iDevice$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final IDevice invoke() {
                IDevice iDevice = (IDevice) ServiceProvider.DefaultImpls.getService$default(this.this$0.runtimeComponents, IDevice.class, null, 2, null);
                Intrinsics.checkNotNull(iDevice);
                return iDevice;
            }
        });
    }

    public static /* synthetic */ Object getComponent$default(TapConnectClient tapConnectClient, Class cls, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return tapConnectClient.getComponent(cls, obj);
    }

    private final IConnectId getConnectLogic() {
        return (IConnectId) this.connectLogic.getValue();
    }

    private final IDevice getIDevice() {
        return (IDevice) this.iDevice.getValue();
    }

    public static /* synthetic */ void handleHttpDnsCmd$default(TapConnectClient tapConnectClient, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        tapConnectClient.handleHttpDnsCmd(str);
    }

    private final void initConnectLogic() {
        getConnectLogic().onAttach(this, this.config);
    }

    @Nullable
    public final Unit execute(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IExecutor iExecutor = this.executor;
        if (iExecutor == null) {
            return null;
        }
        iExecutor.executeTask(runnable);
        return Unit.INSTANCE;
    }

    @Nullable
    public final <T> T getComponent(@NotNull Class<T> clazz, @Nullable T t) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) this.runtimeComponents.getService(clazz, t);
    }

    @JvmOverloads
    public final void handleHttpDnsCmd() {
        handleHttpDnsCmd$default(this, null, 1, null);
    }

    public final void init(@NotNull TapConnectConfig config, @Nullable IConnectStateListener connectListener, @Nullable IMessageStateListener messageListener) {
        Intrinsics.checkNotNullParameter(config, "config");
        preInit(config, connectListener, messageListener);
        initConnectLogic();
    }

    @NotNull
    public final synchronized TapConnection newConnect() {
        TapConnection tapConnection;
        Logger.d$default(Logger.INSTANCE, TAG, Intrinsics.stringPlus("newConnect,tapConnection is ", this.tapConnection), null, null, 12, null);
        if (this.tapConnection == null) {
            TapConnectConfig tapConnectConfig = this.config;
            IExecutor iExecutor = this.executor;
            NettyInitManager nettyInitManager = this.nettyInitManager;
            IDns tcpDns = nettyInitManager == null ? null : nettyInitManager.getTcpDns();
            NettyInitManager nettyInitManager2 = this.nettyInitManager;
            this.tapConnection = new TapConnection(this, tapConnectConfig, iExecutor, tcpDns, nettyInitManager2 == null ? null : nettyInitManager2.getQuicDns(), getIDevice(), this.tcpHeartBeatStrategy, this.quicHeartBeatStrategy, this.eventListener);
        }
        NettyInitManager nettyInitManager3 = this.nettyInitManager;
        if (nettyInitManager3 != null) {
            TapConnection tapConnection2 = this.tapConnection;
            Intrinsics.checkNotNull(tapConnection2);
            nettyInitManager3.checkInitAndConnect(tapConnection2);
        }
        tapConnection = this.tapConnection;
        Intrinsics.checkNotNull(tapConnection);
        return tapConnection;
    }

    public final void preInit(@NotNull TapConnectConfig config, @Nullable IConnectStateListener connectListener, @Nullable IMessageStateListener messageListener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Logger.i$default(Logger.INSTANCE, TAG, Intrinsics.stringPlus("preInit TapConnectClient, this = ", this), null, null, 12, null);
        UniqueIdTools.INSTANCE.initUniqueIdByConfig(config);
        this.config = config;
        this.connectListener = connectListener;
        this.messageListener = messageListener;
        this.executor = (IExecutor) ServiceProvider.DefaultImpls.getService$default(this.runtimeComponents, IExecutor.class, null, 2, null);
        CommonConfig tcpConfig = config.getTcpConfig();
        this.tcpHeartBeatStrategy = new NewFixedHeartBeatStrategy(tcpConfig == null ? 30000L : tcpConfig.getHeartBeatTime(), 0);
        CommonConfig quicConfig = config.getQuicConfig();
        this.quicHeartBeatStrategy = new NewFixedHeartBeatStrategy(quicConfig != null ? quicConfig.getHeartBeatTime() : 30000L, 1);
        IExecutor iExecutor = this.executor;
        CommonConfig tcpConfig2 = config.getTcpConfig();
        IDns dns = tcpConfig2 == null ? null : tcpConfig2.getDns();
        CommonConfig quicConfig2 = config.getQuicConfig();
        EventListenerImpl eventListenerImpl = new EventListenerImpl(iExecutor, dns, quicConfig2 == null ? null : quicConfig2.getDns(), this.tcpHeartBeatStrategy, this.quicHeartBeatStrategy);
        eventListenerImpl.addConnectStateListener(connectListener);
        eventListenerImpl.addMessageStateListener(messageListener);
        this.eventListener = eventListenerImpl;
        if (this.nettyInitManager == null) {
            NettyInitConfig nettyInitConfig = new NettyInitConfig();
            CommonConfig tcpConfig3 = config.getTcpConfig();
            if (tcpConfig3 != null) {
                nettyInitConfig.setConnectTimeOut(tcpConfig3.getConnectTimeOut());
            }
            CommonConfig tcpConfig4 = config.getTcpConfig();
            if (tcpConfig4 != null) {
                nettyInitConfig.setMaxBytesInMessage(tcpConfig4.getMaxBytesInMessage());
            }
            EventListenerImpl eventListenerImpl2 = this.eventListener;
            IExecutor iExecutor2 = this.executor;
            CommonConfig tcpConfig5 = config.getTcpConfig();
            IDns dns2 = tcpConfig5 == null ? null : tcpConfig5.getDns();
            CommonConfig quicConfig3 = config.getQuicConfig();
            NettyInitManager nettyInitManager = new NettyInitManager(eventListenerImpl2, iExecutor2, nettyInitConfig, dns2, quicConfig3 != null ? quicConfig3.getDns() : null);
            this.nettyInitManager = nettyInitManager;
            nettyInitManager.init();
        }
    }

    public final <T> void regComponent(@NotNull Class<T> clazz, T impl) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.runtimeComponents.registerService(clazz, impl);
    }

    public final void release() {
        this.nettyInitManager = null;
        this.tapConnection = null;
    }

    @JvmOverloads
    public final void handleHttpDnsCmd(@Nullable String cmd) {
        NettyInitManager nettyInitManager = this.nettyInitManager;
        if (nettyInitManager == null) {
            return;
        }
        nettyInitManager.handleHttpDnsCmd(cmd);
    }
}
