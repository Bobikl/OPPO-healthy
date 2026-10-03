package heytap.health.device.protocol.ota;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$RspUpdNegotiateOrBuilder extends MessageLiteOrBuilder {
    int getFd();

    int getFileVerifyRetryCount();

    int getFileVerifyTimeout();

    int getStatus();

    int getStatusType();
}
