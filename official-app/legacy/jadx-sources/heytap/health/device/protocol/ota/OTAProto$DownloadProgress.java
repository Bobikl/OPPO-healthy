package heytap.health.device.protocol.ota;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.o6d;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class OTAProto$DownloadProgress extends GeneratedMessageLite<OTAProto$DownloadProgress, Builder> implements OTAProto$DownloadProgressOrBuilder {
    private static final OTAProto$DownloadProgress DEFAULT_INSTANCE;
    private static volatile Parser<OTAProto$DownloadProgress> PARSER = null;
    public static final int PERCENT_FIELD_NUMBER = 2;
    public static final int STATUSCODE_FIELD_NUMBER = 1;
    private int percent_;
    private int statusCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$DownloadProgress, Builder> implements OTAProto$DownloadProgressOrBuilder {
        public Builder clearPercent() {
            copyOnWrite();
            ((OTAProto$DownloadProgress) this.instance).clearPercent();
            return this;
        }

        public Builder clearStatusCode() {
            copyOnWrite();
            ((OTAProto$DownloadProgress) this.instance).clearStatusCode();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$DownloadProgressOrBuilder
        public int getPercent() {
            return ((OTAProto$DownloadProgress) this.instance).getPercent();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$DownloadProgressOrBuilder
        public int getStatusCode() {
            return ((OTAProto$DownloadProgress) this.instance).getStatusCode();
        }

        public Builder setPercent(int i) {
            copyOnWrite();
            ((OTAProto$DownloadProgress) this.instance).setPercent(i);
            return this;
        }

        public Builder setStatusCode(int i) {
            copyOnWrite();
            ((OTAProto$DownloadProgress) this.instance).setStatusCode(i);
            return this;
        }

        private Builder() {
            super(OTAProto$DownloadProgress.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$DownloadProgress oTAProto$DownloadProgress = new OTAProto$DownloadProgress();
        DEFAULT_INSTANCE = oTAProto$DownloadProgress;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$DownloadProgress.class, oTAProto$DownloadProgress);
    }

    private OTAProto$DownloadProgress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPercent() {
        this.percent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusCode() {
        this.statusCode_ = 0;
    }

    public static OTAProto$DownloadProgress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$DownloadProgress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$DownloadProgress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$DownloadProgress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPercent(int i) {
        this.percent_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusCode(int i) {
        this.statusCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = o6d.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OTAProto$DownloadProgress();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"statusCode_", "percent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$DownloadProgress> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$DownloadProgress.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$DownloadProgressOrBuilder
    public int getPercent() {
        return this.percent_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$DownloadProgressOrBuilder
    public int getStatusCode() {
        return this.statusCode_;
    }

    public static Builder newBuilder(OTAProto$DownloadProgress oTAProto$DownloadProgress) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$DownloadProgress);
    }

    public static OTAProto$DownloadProgress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$DownloadProgress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$DownloadProgress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$DownloadProgress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$DownloadProgress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$DownloadProgress parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$DownloadProgress parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$DownloadProgress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$DownloadProgress parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$DownloadProgress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$DownloadProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
