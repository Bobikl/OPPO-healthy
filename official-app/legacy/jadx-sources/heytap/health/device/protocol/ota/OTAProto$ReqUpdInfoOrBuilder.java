package heytap.health.device.protocol.ota;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$ReqUpdInfoOrBuilder extends MessageLiteOrBuilder {
    int getCmdTimeout();

    String getHwID();

    ByteString getHwIDBytes();

    boolean getIsAuto();

    String getModel();

    ByteString getModelBytes();

    String getPkgVersion();

    ByteString getPkgVersionBytes();
}
