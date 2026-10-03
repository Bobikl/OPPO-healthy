package com.heytap.connect.api.listener;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0016\u0010\t\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006\"\u0016\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0016\u0010\u000b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006\"\u0016\u0010\f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0016\u0010\r\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006\"\u0016\u0010\u000e\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u000f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006\"\u0016\u0010\u0010\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006\"\u0016\u0010\u0011\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006\"\u0016\u0010\u0012\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"", "state", "", "stateValue", "(I)Ljava/lang/String;", "STATE_CONNECT_0RTT_RESULT_FAILURE", "I", "STATE_CONNECT_NETTY_INIT_FINISH", "STATE_CONNECT_HANDSHAKE_ACK", "STATE_CONNECT_BIND_START", "STATE_CONNECT_BIND_FINISH", "STATE_CONNECT_CHANNEL_ACTIVE", "STATE_CONNECT_IP_ACQUIRED", "STATE_CONNECT_INIT", "STATE_CONNECT_IP_LOOKUP", "STATE_CONNECT_0RTT_RESULT_SUCCESS", "STATE_CONNECT_GET_CHANNEL", "STATE_CONNECT_CHANNEL_ACTIVE_0RTT", "STATE_CONNECT_HANDSHAKING", "connect_release"}, k = 2, mv = {1, 5, 1})
public final class IConnectStateListenerKt {
    public static final int STATE_CONNECT_0RTT_RESULT_FAILURE = 10;
    public static final int STATE_CONNECT_0RTT_RESULT_SUCCESS = 9;
    public static final int STATE_CONNECT_BIND_FINISH = 5;
    public static final int STATE_CONNECT_BIND_START = 4;
    public static final int STATE_CONNECT_CHANNEL_ACTIVE = 7;
    public static final int STATE_CONNECT_CHANNEL_ACTIVE_0RTT = 8;
    public static final int STATE_CONNECT_GET_CHANNEL = 3;
    public static final int STATE_CONNECT_HANDSHAKE_ACK = 12;
    public static final int STATE_CONNECT_HANDSHAKING = 11;
    public static final int STATE_CONNECT_INIT = 0;
    public static final int STATE_CONNECT_IP_ACQUIRED = 6;
    public static final int STATE_CONNECT_IP_LOOKUP = 1;
    public static final int STATE_CONNECT_NETTY_INIT_FINISH = 2;

    @NotNull
    public static final String stateValue(int i) {
        switch (i) {
            case 0:
                return "连接初始化";
            case 1:
                return "dns解析成功";
            case 2:
                return "netty初始化完成";
            case 3:
                return "尝试创建Channel";
            case 4:
                return "bind开始";
            case 5:
                return "bind完成";
            case 6:
                return "和目标IP建连成功";
            case 7:
                return "Channel通道激活";
            case 8:
                return "QUIC 0RTT Channel通道激活";
            case 9:
                return "QUIC 0RTT 成功";
            case 10:
                return "QUIC 0RTT 异常";
            case 11:
                return "发送握手消息";
            case 12:
                return "收到握手回复";
            default:
                return "未识别状态";
        }
    }
}
