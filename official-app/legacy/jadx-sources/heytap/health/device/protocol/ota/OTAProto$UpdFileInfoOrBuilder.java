package heytap.health.device.protocol.ota;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$UpdFileInfoOrBuilder extends MessageLiteOrBuilder {
    String getCurVersion();

    ByteString getCurVersionBytes();

    int getDataUpdInterval();

    int getDataVerifyCnt();

    int getDataVerifyRetryCount();

    int getDataVerifyTimeout();

    int getFd();

    int getStatus();

    int getUpdOffset();

    String getUpdVersion();

    ByteString getUpdVersionBytes();

    int getVerifyMethod();
}
