package heytap.health.device.protocol.ota;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$RspUpdFileVerifyOrBuilder extends MessageLiteOrBuilder {
    int getFd();

    boolean getStatus();

    int getStatusType();

    int getVerifySeed();
}
