package heytap.health.device.protocol.ota;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$ReqUpdFileDataVerifyOrBuilder extends MessageLiteOrBuilder {
    int getFd();

    int getVerifyCrc();

    int getVerifyOffset();

    int getVerifySeed();

    int getVerifySize();
}
