package heytap.health.device.protocol.ota;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$ReqUpdNegotiateOrBuilder extends MessageLiteOrBuilder {
    int getFd();

    int getUpdOffset();

    int getUpdTotalSize();

    String getUpdVersion();

    ByteString getUpdVersionBytes();
}
