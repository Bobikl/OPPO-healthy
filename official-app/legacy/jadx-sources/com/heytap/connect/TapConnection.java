package com.heytap.connect;

import com.heytap.connect.TapConnection;
import com.heytap.connect.api.IConnection;
import com.heytap.connect.api.IDevice;
import com.heytap.connect.api.listener.IConnectStateListener;
import com.heytap.connect.api.listener.IEventListener;
import com.heytap.connect.api.listener.NetworkChangedReceiver;
import com.heytap.connect.api.logger.Logger;
import com.heytap.connect.api.message.IMessageSender;
import com.heytap.connect.api.message.IMsgDispatcher;
import com.heytap.connect.api.message.MessageCipher;
import com.heytap.connect.api.message.MessageSerializer;
import com.heytap.connect.config.CommonConfig;
import com.heytap.connect.config.TapConnectConfig;
import com.heytap.connect.config.executor.IExecutor;
import com.heytap.connect.config.ip.IDns;
import com.heytap.connect.config.ip.IpInfo;
import com.heytap.connect.message.Message;
import com.heytap.connect.message.MessageCreator;
import com.heytap.connect.message.MessageID;
import com.heytap.connect.message.heartbeat.NewFixedHeartBeatStrategy;
import com.heytap.connect.netty.NettyConnector;
import com.heytap.connect.netty.tcp.TCPChannelInitializer;
import com.heytap.connect.netty.tcp.TCPConnector;
import com.heytap.connect.netty.udp.QUICConnectHelper;
import com.heytap.connect.netty.udp.QUICConnector;
import com.oplus.aiunit.vision.j5c;
import com.oplus.aiunit.vision.q5c;
import com.oplus.aiunit.vision.v5c;
import io.netty.channel.Channel;
import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0093\u0001Ba\b\u0000\u0012\u0006\u0010U\u001a\u00020T\u0012\b\u0010X\u001a\u0004\u0018\u00010W\u0012\b\u0010]\u001a\u0004\u0018\u00010\\\u0012\b\u0010b\u001a\u0004\u0018\u00010a\u0012\b\u0010d\u001a\u0004\u0018\u00010a\u0012\u0006\u0010f\u001a\u00020e\u0012\b\u0010k\u001a\u0004\u0018\u00010j\u0012\b\u0010m\u001a\u0004\u0018\u00010j\u0012\b\u0010o\u001a\u0004\u0018\u00010n¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ-\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\"H\u0016¢\u0006\u0004\b#\u0010$J'\u0010&\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010%\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010\u0007J\u000f\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u0010\u0007J)\u00102\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u00103J-\u00108\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00012\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206\u0018\u000104H\u0016¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000fH\u0016¢\u0006\u0004\b<\u00103J!\u0010?\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00012\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0001H\u0016¢\u0006\u0004\bA\u0010BJ)\u0010C\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\bC\u00103J\u0017\u0010E\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010\u0012J-\u0010F\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00012\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206\u0018\u000104H\u0016¢\u0006\u0004\bF\u00109J'\u0010G\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000fH\u0016¢\u0006\u0004\bG\u00103J!\u0010H\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00012\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bH\u0010@J\u0017\u0010I\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0001H\u0016¢\u0006\u0004\bI\u0010BJ5\u0010J\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00012\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206\u0018\u000104H\u0016¢\u0006\u0004\bJ\u0010KJ)\u0010M\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u0010L\u001a\u00020\u0015H\u0016¢\u0006\u0004\bM\u0010NJ\u001d\u0010O\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0005H\u0016¢\u0006\u0004\bQ\u0010\u0007J\u0017\u0010S\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\u000fH\u0016¢\u0006\u0004\bS\u0010\u0012R\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010X\u001a\u0004\u0018\u00010W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010]\u001a\u0004\u0018\u00010\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0016\u0010b\u001a\u0004\u0018\u00010a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u0004\u0018\u00010a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010cR\u0017\u0010f\u001a\u00020e8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010k\u001a\u0004\u0018\u00010j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u0004\u0018\u00010j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR\u0019\u0010o\u001a\u0004\u0018\u00010n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\u001b\u0010|\u001a\u00020w8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R(\u0010~\u001a\u0004\u0018\u00010}8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R,\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/heytap/connect/TapConnection;", "Lcom/heytap/connect/api/IConnection;", "Lcom/heytap/connect/api/message/IMessageSender;", "Lcom/heytap/connect/api/listener/IConnectStateListener;", "Lcom/heytap/connect/api/listener/NetworkChangedReceiver$NetworkStatusChangedListener;", "", "resetCurrentConnectorByTCP", "()V", "resetCurrentConnectorByQUIC", "Lcom/oplus/aiunit/vision/q5c;", "message", "", "connectType", "dispatchMessage", "(Lcom/oplus/aiunit/vision/q5c;I)V", "", "cmd", "handleHttpDnsCmd", "(Ljava/lang/String;)V", "getIpAddress", "(I)Ljava/lang/String;", "", "isActive", "()Z", "Lio/netty/channel/Channel;", "channel$connect_release", "()Lio/netty/channel/Channel;", "channel", "tcpChannel$connect_release", "tcpChannel", "quicChannel$connect_release", "quicChannel", "messageId", "singleQueue", "Lkotlin/Function0;", "sendMessage", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)Ljava/lang/String;", "isSync", "sendMQTTQUICMessage", "(Ljava/lang/String;ZLcom/oplus/aiunit/vision/q5c;)V", "sendMQTTTCPMessage", "(Ljava/lang/String;Lcom/oplus/aiunit/vision/q5c;)V", "Lcom/heytap/connect/netty/tcp/TCPChannelInitializer;", "tcpChannelInitializer", "connectTCP", "(Lcom/heytap/connect/netty/tcp/TCPChannelInitializer;)V", "connectQUIC", "close", "connection", "state", "onTCPConnecting", "(Lcom/heytap/connect/api/IConnection;ILjava/lang/String;)V", "Lcom/heytap/connect/api/message/IMsgDispatcher;", "", "Lcom/heytap/connect/message/Message;", "dispatcher", "onTCPConnected", "(Lcom/heytap/connect/api/IConnection;Lcom/heytap/connect/api/message/IMsgDispatcher;)V", "reasonCode", "errMessage", "onTCPConnectFailed", "", "cause", "onTCPDisconnected", "(Lcom/heytap/connect/api/IConnection;Ljava/lang/Throwable;)V", "onTCPConnectClosed", "(Lcom/heytap/connect/api/IConnection;)V", "onQUICConnecting", "networkTyp", "onQUICConnectChange", "onQUICConnected", "onQUICConnectFailed", "onQUICDisconnected", "onQUICConnectClosed", "onConnected", "(ILcom/heytap/connect/api/IConnection;Lcom/heytap/connect/api/message/IMsgDispatcher;)V", "isSuccess", "onHeartBeatResult", "(ILcom/heytap/connect/api/IConnection;Z)V", "handleMessage", "(Lcom/oplus/aiunit/vision/q5c;I)Z", "onNetWorkDisconnected", "networkType", "onNetWorkConnected", "Lcom/heytap/connect/TapConnectClient;", "instance", "Lcom/heytap/connect/TapConnectClient;", "Lcom/heytap/connect/config/TapConnectConfig;", "config", "Lcom/heytap/connect/config/TapConnectConfig;", "getConfig$connect_release", "()Lcom/heytap/connect/config/TapConnectConfig;", "Lcom/heytap/connect/config/executor/IExecutor;", "executor", "Lcom/heytap/connect/config/executor/IExecutor;", "getExecutor$connect_release", "()Lcom/heytap/connect/config/executor/IExecutor;", "Lcom/heytap/connect/config/ip/IDns;", "tcpDns", "Lcom/heytap/connect/config/ip/IDns;", "quicDns", "Lcom/heytap/connect/api/IDevice;", "iDevice", "Lcom/heytap/connect/api/IDevice;", "getIDevice", "()Lcom/heytap/connect/api/IDevice;", "Lcom/heytap/connect/message/heartbeat/NewFixedHeartBeatStrategy;", "tcpHeartBeatStrategy", "Lcom/heytap/connect/message/heartbeat/NewFixedHeartBeatStrategy;", "quicHeartBeatStrategy", "Lcom/heytap/connect/api/listener/IEventListener;", "eventListener", "Lcom/heytap/connect/api/listener/IEventListener;", "getEventListener", "()Lcom/heytap/connect/api/listener/IEventListener;", "Lcom/heytap/connect/TapMessageDispatcher;", "tcpMessageDispatcher", "Lcom/heytap/connect/TapMessageDispatcher;", "quicMessageDispatcher", "Lcom/heytap/connect/api/message/MessageSerializer;", "serializer$delegate", "Lkotlin/Lazy;", "getSerializer$connect_release", "()Lcom/heytap/connect/api/message/MessageSerializer;", "serializer", "Lcom/heytap/connect/netty/tcp/TCPConnector;", "tcpConnector", "Lcom/heytap/connect/netty/tcp/TCPConnector;", "getTcpConnector$connect_release", "()Lcom/heytap/connect/netty/tcp/TCPConnector;", "setTcpConnector$connect_release", "(Lcom/heytap/connect/netty/tcp/TCPConnector;)V", "Lcom/heytap/connect/netty/udp/QUICConnector;", "quicConnector", "Lcom/heytap/connect/netty/udp/QUICConnector;", "getQuicConnector", "()Lcom/heytap/connect/netty/udp/QUICConnector;", "setQuicConnector", "(Lcom/heytap/connect/netty/udp/QUICConnector;)V", "Lcom/heytap/connect/netty/NettyConnector;", "currentConnector", "Lcom/heytap/connect/netty/NettyConnector;", "Lcom/heytap/connect/api/listener/NetworkChangedReceiver;", "networkChangedReceiver", "Lcom/heytap/connect/api/listener/NetworkChangedReceiver;", "<init>", "(Lcom/heytap/connect/TapConnectClient;Lcom/heytap/connect/config/TapConnectConfig;Lcom/heytap/connect/config/executor/IExecutor;Lcom/heytap/connect/config/ip/IDns;Lcom/heytap/connect/config/ip/IDns;Lcom/heytap/connect/api/IDevice;Lcom/heytap/connect/message/heartbeat/NewFixedHeartBeatStrategy;Lcom/heytap/connect/message/heartbeat/NewFixedHeartBeatStrategy;Lcom/heytap/connect/api/listener/IEventListener;)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class TapConnection implements IConnection, IMessageSender, IConnectStateListener, NetworkChangedReceiver.NetworkStatusChangedListener {

    @NotNull
    public static final String TAG = "TapConnection";

    @Nullable
    private final TapConnectConfig config;

    @Nullable
    private NettyConnector currentConnector;

    @Nullable
    private final IEventListener eventListener;

    @Nullable
    private final IExecutor executor;

    @NotNull
    private final IDevice iDevice;

    @NotNull
    private final TapConnectClient instance;

    @NotNull
    private NetworkChangedReceiver networkChangedReceiver;

    @Nullable
    private QUICConnector quicConnector;

    @Nullable
    private final IDns quicDns;

    @Nullable
    private final NewFixedHeartBeatStrategy quicHeartBeatStrategy;

    @Nullable
    private TapMessageDispatcher quicMessageDispatcher;

    /* JADX INFO: renamed from: serializer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serializer;

    @Nullable
    private TCPConnector tcpConnector;

    @Nullable
    private final IDns tcpDns;

    @Nullable
    private final NewFixedHeartBeatStrategy tcpHeartBeatStrategy;

    @Nullable
    private TapMessageDispatcher tcpMessageDispatcher;

    public TapConnection(@NotNull TapConnectClient instance, @Nullable TapConnectConfig tapConnectConfig, @Nullable IExecutor iExecutor, @Nullable IDns iDns, @Nullable IDns iDns2, @NotNull IDevice iDevice, @Nullable NewFixedHeartBeatStrategy newFixedHeartBeatStrategy, @Nullable NewFixedHeartBeatStrategy newFixedHeartBeatStrategy2, @Nullable IEventListener iEventListener) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(iDevice, "iDevice");
        this.instance = instance;
        this.config = tapConnectConfig;
        this.executor = iExecutor;
        this.tcpDns = iDns;
        this.quicDns = iDns2;
        this.iDevice = iDevice;
        this.tcpHeartBeatStrategy = newFixedHeartBeatStrategy;
        this.quicHeartBeatStrategy = newFixedHeartBeatStrategy2;
        this.eventListener = iEventListener;
        Logger logger = Logger.INSTANCE;
        Logger.d$default(logger, TAG, "TapConnection start init...", null, null, 12, null);
        if (tapConnectConfig != null && tapConnectConfig.getTcpConfig() != null) {
            this.tcpMessageDispatcher = new TapMessageDispatcher(this, getConfig(), 0);
        }
        Logger.d$default(logger, TAG, "TapConnection tcp init end...", null, null, 12, null);
        if (tapConnectConfig != null && tapConnectConfig.getQuicConfig() != null) {
            this.quicMessageDispatcher = new TapMessageDispatcher(this, getConfig(), 1);
        }
        Logger.d$default(logger, TAG, "TapConnection quic init end...", null, null, 12, null);
        this.serializer = LazyKt__LazyJVMKt.lazy(new Function0<TapConnection$serializer$2.AnonymousClass1>() { // from class: com.heytap.connect.TapConnection$serializer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.heytap.connect.TapConnection$serializer$2$1] */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final AnonymousClass1 invoke() {
                final MessageCipher messageCipher = (MessageCipher) this.this$0.instance.getComponent(MessageCipher.class, MessageCipher.INSTANCE.getDEFAULT());
                Intrinsics.checkNotNull(messageCipher);
                final MessageSerializer messageSerializer = (MessageSerializer) TapConnectClient.getComponent$default(this.this$0.instance, MessageSerializer.class, null, 2, null);
                Intrinsics.checkNotNull(messageSerializer);
                final TapConnection tapConnection = this.this$0;
                return new MessageSerializer() { // from class: com.heytap.connect.TapConnection$serializer$2.1
                    @Override // com.heytap.connect.api.message.IMessageSerializer
                    @NotNull
                    public Object decode(@NotNull byte[] body) {
                        CommonConfig quicConfig;
                        Intrinsics.checkNotNullParameter(body, "body");
                        if (tapConnection.currentConnector instanceof QUICConnector) {
                            TapConnectConfig config = tapConnection.getConfig();
                            if (Intrinsics.areEqual((config == null || (quicConfig = config.getQuicConfig()) == null) ? null : Boolean.valueOf(quicConfig.isSign()), Boolean.FALSE)) {
                                return messageSerializer.decode(body);
                            }
                        }
                        return messageSerializer.decode(messageCipher.decrypt(body));
                    }

                    @Override // com.heytap.connect.api.message.IMessageSerializer
                    @NotNull
                    public byte[] encode(@NotNull Object body) {
                        CommonConfig quicConfig;
                        Intrinsics.checkNotNullParameter(body, "body");
                        if (tapConnection.currentConnector instanceof QUICConnector) {
                            TapConnectConfig config = tapConnection.getConfig();
                            if (Intrinsics.areEqual((config == null || (quicConfig = config.getQuicConfig()) == null) ? null : Boolean.valueOf(quicConfig.isSign()), Boolean.FALSE)) {
                                return messageSerializer.encode(body);
                            }
                        }
                        return (byte[]) messageCipher.encrypt(messageSerializer.encode(body));
                    }
                };
            }
        });
        this.networkChangedReceiver = new NetworkChangedReceiver();
    }

    private final void dispatchMessage(q5c message, int connectType) {
        TapMessageDispatcher tapMessageDispatcher;
        try {
            if (connectType == 0) {
                tapMessageDispatcher = this.tcpMessageDispatcher;
                if (tapMessageDispatcher == null) {
                    return;
                }
            } else {
                if (connectType != 1) {
                    return;
                }
                tapMessageDispatcher = this.quicMessageDispatcher;
                if (tapMessageDispatcher == null) {
                    return;
                }
            }
            tapMessageDispatcher.onReceivedMessage(message);
        } catch (Exception e2) {
            Logger.w$default(Logger.INSTANCE, TAG, "onMessageHandleFailed, message = " + message + StringUtil.SPACE, e2, null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleMessage$lambda-10, reason: not valid java name */
    public static final void m4573handleMessage$lambda10(TapConnection this$0, q5c message, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        this$0.dispatchMessage(message, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleMessage$lambda-11, reason: not valid java name */
    public static final void m4574handleMessage$lambda11(TapConnection this$0, q5c message, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        this$0.dispatchMessage(message, i);
    }

    private final void resetCurrentConnectorByQUIC() {
        this.networkChangedReceiver.unRegisterListener(this);
        QUICConnector qUICConnector = this.quicConnector;
        if (qUICConnector != null) {
            qUICConnector.setConnecting(false);
        }
        NettyConnector nettyConnector = this.currentConnector;
        if (nettyConnector instanceof QUICConnector) {
            if (nettyConnector == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.connect.netty.udp.QUICConnector");
            }
            ((QUICConnector) nettyConnector).setConnecting(false);
            this.currentConnector = null;
        }
    }

    private final void resetCurrentConnectorByTCP() {
        TCPConnector tCPConnector = this.tcpConnector;
        if (tCPConnector != null) {
            tCPConnector.setReconnecting(false);
        }
        NettyConnector nettyConnector = this.currentConnector;
        if (nettyConnector instanceof TCPConnector) {
            if (nettyConnector == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.connect.netty.tcp.TCPConnector");
            }
            ((TCPConnector) nettyConnector).setReconnecting(false);
            this.currentConnector = null;
        }
    }

    public static /* synthetic */ void sendMQTTQUICMessage$default(TapConnection tapConnection, String str, boolean z, q5c q5cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        tapConnection.sendMQTTQUICMessage(str, z, q5cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMQTTQUICMessage$lambda-6, reason: not valid java name */
    public static final void m4575sendMQTTQUICMessage$lambda6(TapConnection this$0, String messageId, q5c message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(messageId, "$messageId");
        Intrinsics.checkNotNullParameter(message, "$message");
        QUICConnector quicConnector = this$0.getQuicConnector();
        if (quicConnector == null) {
            return;
        }
        quicConnector.sendMessage(messageId, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMQTTTCPMessage$lambda-7, reason: not valid java name */
    public static final void m4576sendMQTTTCPMessage$lambda7(TapConnection this$0, String messageId, q5c message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(messageId, "$messageId");
        Intrinsics.checkNotNullParameter(message, "$message");
        TCPConnector tcpConnector = this$0.getTcpConnector();
        if (tcpConnector == null) {
            return;
        }
        tcpConnector.sendMessage(messageId, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-3, reason: not valid java name */
    public static final void m4577sendMessage$lambda3(Function0 message, TapConnection this$0, String messageId) {
        Intrinsics.checkNotNullParameter(message, "$message");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(messageId, "$messageId");
        q5c q5cVar = (q5c) message.invoke();
        NettyConnector nettyConnector = this$0.currentConnector;
        if (nettyConnector == null) {
            return;
        }
        nettyConnector.sendMessage(messageId, q5cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-5, reason: not valid java name */
    public static final void m4578sendMessage$lambda5(Function0 message, TapConnection this$0, String messageId) {
        Intrinsics.checkNotNullParameter(message, "$message");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(messageId, "$messageId");
        q5c q5cVar = (q5c) message.invoke();
        NettyConnector nettyConnector = this$0.currentConnector;
        if (nettyConnector == null) {
            return;
        }
        nettyConnector.sendMessage(messageId, q5cVar);
    }

    @Nullable
    public final Channel channel$connect_release() {
        NettyConnector nettyConnector = this.currentConnector;
        if (nettyConnector == null) {
            return null;
        }
        return nettyConnector.getNettyChannel();
    }

    @Override // com.heytap.connect.api.IConnection
    public void close() {
        this.currentConnector = null;
        this.networkChangedReceiver.unRegisterListener(this);
        TCPConnector tCPConnector = this.tcpConnector;
        if (tCPConnector != null) {
            tCPConnector.close();
        }
        this.tcpConnector = null;
        QUICConnector qUICConnector = this.quicConnector;
        if (qUICConnector != null) {
            qUICConnector.close();
        }
        this.quicConnector = null;
        NewFixedHeartBeatStrategy newFixedHeartBeatStrategy = this.tcpHeartBeatStrategy;
        if (newFixedHeartBeatStrategy != null) {
            newFixedHeartBeatStrategy.onHeartbeatCancel();
        }
        NewFixedHeartBeatStrategy newFixedHeartBeatStrategy2 = this.quicHeartBeatStrategy;
        if (newFixedHeartBeatStrategy2 != null) {
            newFixedHeartBeatStrategy2.onHeartbeatCancel();
        }
        this.instance.release();
    }

    @Override // com.heytap.connect.api.IConnection
    public void connectQUIC() {
        QUICConnector qUICConnector;
        Logger logger = Logger.INSTANCE;
        Logger.d$default(logger, TAG, Intrinsics.stringPlus("connectQUIC, quicConnector is ", this.quicConnector), null, null, 12, null);
        if (this.quicConnector == null) {
            synchronized (QUICConnector.class) {
                if (getQuicConnector() == null) {
                    setQuicConnector(new QUICConnector(this, getConfig(), this.quicDns));
                }
            }
        }
        Logger.d$default(logger, TAG, Intrinsics.stringPlus("after, quicConnector is ", this.quicConnector), null, null, 12, null);
        QUICConnector qUICConnector2 = this.quicConnector;
        if (!Intrinsics.areEqual(qUICConnector2 == null ? null : Boolean.valueOf(qUICConnector2.isActive()), Boolean.FALSE) || (qUICConnector = this.quicConnector) == null) {
            return;
        }
        qUICConnector.connect();
    }

    @Override // com.heytap.connect.api.IConnection
    public void connectTCP(@Nullable TCPChannelInitializer tcpChannelInitializer) {
        TCPConnector tCPConnector;
        Logger logger = Logger.INSTANCE;
        Logger.d$default(logger, TAG, Intrinsics.stringPlus("connectTCP, tcpConnector is ", this.tcpConnector), null, null, 12, null);
        if (this.tcpConnector == null) {
            synchronized (TCPConnector.class) {
                if (getTcpConnector() == null) {
                    setTcpConnector$connect_release(new TCPConnector(this, getConfig(), this.tcpDns, getIDevice(), tcpChannelInitializer));
                }
            }
        }
        Logger.d$default(logger, TAG, Intrinsics.stringPlus("after, tcpConnector is ", this.tcpConnector), null, null, 12, null);
        TCPConnector tCPConnector2 = this.tcpConnector;
        if (!Intrinsics.areEqual(tCPConnector2 == null ? null : Boolean.valueOf(tCPConnector2.isActive()), Boolean.FALSE) || (tCPConnector = this.tcpConnector) == null) {
            return;
        }
        tCPConnector.connect();
    }

    @Nullable
    /* JADX INFO: renamed from: getConfig$connect_release, reason: from getter */
    public final TapConnectConfig getConfig() {
        return this.config;
    }

    @Nullable
    public final IEventListener getEventListener() {
        return this.eventListener;
    }

    @Nullable
    /* JADX INFO: renamed from: getExecutor$connect_release, reason: from getter */
    public final IExecutor getExecutor() {
        return this.executor;
    }

    @NotNull
    public final IDevice getIDevice() {
        return this.iDevice;
    }

    @Override // com.heytap.connect.api.IConnection
    @Nullable
    public String getIpAddress(int connectType) {
        IpInfo ipInfoCurrentIp;
        IDns iDns;
        IpInfo ipInfoCurrentIp2;
        if (connectType != 0) {
            if (connectType != 1 || (iDns = this.quicDns) == null || (ipInfoCurrentIp2 = iDns.currentIp()) == null) {
                return null;
            }
            return ipInfoCurrentIp2.toSimpleString();
        }
        IDns iDns2 = this.tcpDns;
        if (iDns2 == null || (ipInfoCurrentIp = iDns2.currentIp()) == null) {
            return null;
        }
        return ipInfoCurrentIp.toSimpleString();
    }

    @Nullable
    public final QUICConnector getQuicConnector() {
        return this.quicConnector;
    }

    @NotNull
    public final MessageSerializer getSerializer$connect_release() {
        return (MessageSerializer) this.serializer.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getTcpConnector$connect_release, reason: from getter */
    public final TCPConnector getTcpConnector() {
        return this.tcpConnector;
    }

    @Override // com.heytap.connect.api.IConnection
    public void handleHttpDnsCmd(@NotNull String cmd) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        this.instance.handleHttpDnsCmd(cmd);
    }

    public final boolean handleMessage(@NotNull final q5c message, final int connectType) {
        Intrinsics.checkNotNullParameter(message, "message");
        if ((message instanceof v5c) || (message instanceof j5c)) {
            IExecutor iExecutor = this.executor;
            if (iExecutor != null) {
                iExecutor.executeReceiveMessageTask(new Runnable() { // from class: com.oplus.aiunit.vision.wnj
                    @Override // java.lang.Runnable
                    public final void run() {
                        TapConnection.m4573handleMessage$lambda10(this.i, message, connectType);
                    }
                });
            }
            return true;
        }
        IExecutor iExecutor2 = this.executor;
        if (iExecutor2 != null) {
            iExecutor2.executeTask(new Runnable() { // from class: com.oplus.aiunit.vision.vnj
                @Override // java.lang.Runnable
                public final void run() {
                    TapConnection.m4574handleMessage$lambda11(this.i, message, connectType);
                }
            });
        }
        return true;
    }

    @Override // com.heytap.connect.api.IConnection
    public boolean isActive() {
        NettyConnector nettyConnector = this.currentConnector;
        return Intrinsics.areEqual(nettyConnector == null ? null : Boolean.valueOf(nettyConnector.isActive()), Boolean.TRUE);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onConnected(int connectType, @NotNull IConnection connection, @Nullable IMsgDispatcher<Short, Message> dispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onConnected(connectType, connection, dispatcher);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onHeartBeatResult(int connectType, @Nullable IConnection connection, boolean isSuccess) {
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onHeartBeatResult(connectType, connection, isSuccess);
    }

    @Override // com.heytap.connect.api.listener.NetworkChangedReceiver.NetworkStatusChangedListener
    public void onNetWorkConnected(@NotNull String networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Logger.w$default(Logger.INSTANCE, TAG, "onNetWorkConnected... send ping message.", null, null, 12, null);
        IEventListener iEventListener = this.eventListener;
        if (iEventListener != null) {
            iEventListener.onQUICConnectChange(networkType);
        }
        sendMQTTQUICMessage$default(this, MessageID.INSTANCE.newMessageId$connect_release(), false, MessageCreator.INSTANCE.getPingReqMessage(), 2, null);
    }

    @Override // com.heytap.connect.api.listener.NetworkChangedReceiver.NetworkStatusChangedListener
    public void onNetWorkDisconnected() {
        Logger.w$default(Logger.INSTANCE, TAG, "onNetWorkDisconnected... ", null, null, 12, null);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onQUICConnectChange(@NotNull String networkTyp) {
        Intrinsics.checkNotNullParameter(networkTyp, "networkTyp");
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onQUICConnectChange(networkTyp);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onQUICConnectClosed(@NotNull IConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        resetCurrentConnectorByQUIC();
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onQUICConnectClosed(this);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onQUICConnectFailed(@NotNull IConnection connection, int reasonCode, @NotNull String errMessage) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(errMessage, "errMessage");
        resetCurrentConnectorByQUIC();
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onQUICConnectFailed(this, reasonCode, errMessage);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onQUICConnected(@NotNull IConnection connection, @Nullable IMsgDispatcher<Short, Message> dispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Logger.d$default(Logger.INSTANCE, TAG, Intrinsics.stringPlus("onQUICConnected, currentConnector is ", this.currentConnector), null, null, 12, null);
        if (this.currentConnector != null) {
            IEventListener iEventListener = this.eventListener;
            if (iEventListener != null) {
                TapMessageDispatcher tapMessageDispatcher = this.quicMessageDispatcher;
                iEventListener.onQUICConnected(this, tapMessageDispatcher != null ? tapMessageDispatcher.getCommonMessageDispatcher() : null);
            }
            this.networkChangedReceiver.registerListener(this);
            return;
        }
        this.currentConnector = this.quicConnector;
        this.networkChangedReceiver.registerListener(this);
        IEventListener iEventListener2 = this.eventListener;
        if (iEventListener2 != null) {
            TapMessageDispatcher tapMessageDispatcher2 = this.quicMessageDispatcher;
            iEventListener2.onQUICConnected(this, tapMessageDispatcher2 == null ? null : tapMessageDispatcher2.getCommonMessageDispatcher());
        }
        TapMessageDispatcher tapMessageDispatcher3 = this.quicMessageDispatcher;
        onConnected(1, this, tapMessageDispatcher3 != null ? tapMessageDispatcher3.getCommonMessageDispatcher() : null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onQUICConnecting(@Nullable IConnection connection, int state, @NotNull String message) {
        IEventListener iEventListener;
        Intrinsics.checkNotNullParameter(message, "message");
        if (state != 7) {
            iEventListener = this.eventListener;
            if (iEventListener == null) {
                return;
            }
        } else {
            QUICConnectHelper qUICConnectHelperInstance = QUICConnectHelper.INSTANCE.instance();
            if (Intrinsics.areEqual(qUICConnectHelperInstance == null ? null : Boolean.valueOf(qUICConnectHelperInstance.isZeroRTT()), Boolean.TRUE)) {
                iEventListener = this.eventListener;
                if (iEventListener == null) {
                    return;
                } else {
                    state = 8;
                }
            } else {
                iEventListener = this.eventListener;
                if (iEventListener == null) {
                    return;
                }
            }
        }
        iEventListener.onQUICConnecting(this, state, message);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onQUICDisconnected(@NotNull IConnection connection, @Nullable Throwable cause) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        resetCurrentConnectorByQUIC();
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onQUICDisconnected(this, cause);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onTCPConnectClosed(@NotNull IConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        resetCurrentConnectorByTCP();
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onTCPConnectClosed(this);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onTCPConnectFailed(@NotNull IConnection connection, int reasonCode, @NotNull String errMessage) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(errMessage, "errMessage");
        resetCurrentConnectorByTCP();
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onTCPConnectFailed(this, reasonCode, errMessage);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onTCPConnected(@NotNull IConnection connection, @Nullable IMsgDispatcher<Short, Message> dispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Logger.d$default(Logger.INSTANCE, TAG, Intrinsics.stringPlus("onTCPConnected, currentConnector is ", this.currentConnector), null, null, 12, null);
        if (this.currentConnector != null) {
            IEventListener iEventListener = this.eventListener;
            if (iEventListener == null) {
                return;
            }
            TapMessageDispatcher tapMessageDispatcher = this.tcpMessageDispatcher;
            iEventListener.onTCPConnected(this, tapMessageDispatcher != null ? tapMessageDispatcher.getCommonMessageDispatcher() : null);
            return;
        }
        this.currentConnector = this.tcpConnector;
        IEventListener iEventListener2 = this.eventListener;
        if (iEventListener2 != null) {
            TapMessageDispatcher tapMessageDispatcher2 = this.tcpMessageDispatcher;
            iEventListener2.onTCPConnected(this, tapMessageDispatcher2 == null ? null : tapMessageDispatcher2.getCommonMessageDispatcher());
        }
        TapMessageDispatcher tapMessageDispatcher3 = this.tcpMessageDispatcher;
        onConnected(0, this, tapMessageDispatcher3 != null ? tapMessageDispatcher3.getCommonMessageDispatcher() : null);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onTCPConnecting(@Nullable IConnection connection, int state, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onTCPConnecting(this, state, message);
    }

    @Override // com.heytap.connect.api.listener.IConnectStateListener
    public void onTCPDisconnected(@NotNull IConnection connection, @Nullable Throwable cause) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        resetCurrentConnectorByTCP();
        IEventListener iEventListener = this.eventListener;
        if (iEventListener == null) {
            return;
        }
        iEventListener.onTCPDisconnected(this, cause);
    }

    @Nullable
    public final Channel quicChannel$connect_release() {
        QUICConnector qUICConnector = this.quicConnector;
        if (qUICConnector == null) {
            return null;
        }
        return qUICConnector.getNettyChannel();
    }

    public final void sendMQTTQUICMessage(@NotNull final String messageId, boolean isSync, @NotNull final q5c message) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(message, "message");
        if (isSync) {
            QUICConnector qUICConnector = this.quicConnector;
            if (qUICConnector == null) {
                return;
            }
            qUICConnector.sendMessage(messageId, message);
            return;
        }
        IExecutor iExecutor = this.executor;
        if (iExecutor == null) {
            return;
        }
        iExecutor.executeTask(new Runnable() { // from class: com.oplus.aiunit.vision.unj
            @Override // java.lang.Runnable
            public final void run() {
                TapConnection.m4575sendMQTTQUICMessage$lambda6(this.i, messageId, message);
            }
        });
    }

    public final void sendMQTTTCPMessage(@NotNull final String messageId, @NotNull final q5c message) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(message, "message");
        IExecutor iExecutor = this.executor;
        if (iExecutor == null) {
            return;
        }
        iExecutor.executeTask(new Runnable() { // from class: com.oplus.aiunit.vision.znj
            @Override // java.lang.Runnable
            public final void run() {
                TapConnection.m4576sendMQTTTCPMessage$lambda7(this.i, messageId, message);
            }
        });
    }

    @Override // com.heytap.connect.api.message.IMessageSender
    @NotNull
    public String sendMessage(@NotNull final String messageId, boolean singleQueue, @NotNull final Function0<? extends q5c> message) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(message, "message");
        if (singleQueue) {
            IExecutor iExecutor = this.executor;
            if (iExecutor != null) {
                iExecutor.executeWorkTask(new Runnable() { // from class: com.oplus.aiunit.vision.xnj
                    @Override // java.lang.Runnable
                    public final void run() {
                        TapConnection.m4577sendMessage$lambda3(message, this, messageId);
                    }
                });
            }
        } else {
            IExecutor iExecutor2 = this.executor;
            if (iExecutor2 != null) {
                iExecutor2.executeTask(new Runnable() { // from class: com.oplus.aiunit.vision.ynj
                    @Override // java.lang.Runnable
                    public final void run() {
                        TapConnection.m4578sendMessage$lambda5(message, this, messageId);
                    }
                });
            }
        }
        return messageId;
    }

    public final void setQuicConnector(@Nullable QUICConnector qUICConnector) {
        this.quicConnector = qUICConnector;
    }

    public final void setTcpConnector$connect_release(@Nullable TCPConnector tCPConnector) {
        this.tcpConnector = tCPConnector;
    }

    @Nullable
    public final Channel tcpChannel$connect_release() {
        TCPConnector tCPConnector = this.tcpConnector;
        if (tCPConnector == null) {
            return null;
        }
        return tCPConnector.getNettyChannel();
    }
}
