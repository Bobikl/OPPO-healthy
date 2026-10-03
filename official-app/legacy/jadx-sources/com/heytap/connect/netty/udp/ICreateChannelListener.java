package com.heytap.connect.netty.udp;

import io.netty.incubator.codec.quic.QuicChannel;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/connect/netty/udp/ICreateChannelListener;", "", "", "bindStart", "()V", "binded", "Lio/netty/incubator/codec/quic/QuicChannel;", "quicChannel", "created", "(Lio/netty/incubator/codec/quic/QuicChannel;)V", "", "success", "", "errorCode", "zeroRttResult", "(ZI)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface ICreateChannelListener {
    void bindStart();

    void binded();

    void created(@Nullable QuicChannel quicChannel);

    void zeroRttResult(boolean success, int errorCode);
}
