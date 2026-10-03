package heytap.health.device.protocol.ota;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$RspUpdInfoOrBuilder extends MessageLiteOrBuilder {
    int getDeviceCmdTimeout();

    OTAProto$UpdFileInfo getFileInfos(int i);

    int getFileInfosCount();

    List<OTAProto$UpdFileInfo> getFileInfosList();

    int getFrameBufferSize();

    boolean getPermitted();

    String getPkgVersion();

    ByteString getPkgVersionBytes();

    int getProtoVersion();

    int getStatusType();
}
