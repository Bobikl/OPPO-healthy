package heytap.health.device.protocol.ota;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$RspUpdFileDataVerifyOrBuilder extends MessageLiteOrBuilder {
    int getFd();

    int getNextFileOffset();

    int getPercent();

    boolean getStatus();

    int getStatusType();

    int getVerifySeed();
}
