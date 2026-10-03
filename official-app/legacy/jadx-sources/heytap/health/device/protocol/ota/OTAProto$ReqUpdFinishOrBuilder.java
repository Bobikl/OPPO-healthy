package heytap.health.device.protocol.ota;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$ReqUpdFinishOrBuilder extends MessageLiteOrBuilder {
    String getPkgVersion();

    ByteString getPkgVersionBytes();
}
