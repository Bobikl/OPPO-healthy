package heytap.health.device.protocol.ota;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes10.dex */
public interface OTAProto$QueryResultOrBuilder extends MessageLiteOrBuilder {
    String getNewVersion();

    ByteString getNewVersionBytes();

    int getResultCode();

    String getSize();

    ByteString getSizeBytes();

    String getSummary();

    ByteString getSummaryBytes();

    String getUrl();

    ByteString getUrlBytes();
}
