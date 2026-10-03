package heytap.health.device.protocol.ota;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$ReqUpdFileVerifyOrBuilder extends MessageLiteOrBuilder {
    OTAProto$ReqUpdFileVerify.DataCase getDataCase();

    int getFd();

    int getFileCrc();

    ByteString getFileMd5();

    int getVerifySeed();

    boolean hasFileCrc();

    boolean hasFileMd5();
}
