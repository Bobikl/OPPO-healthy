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
public final class OTAProto$OTAStatus extends GeneratedMessageLite<OTAProto$OTAStatus, Builder> implements OTAProto$OTAStatusOrBuilder {
    private static final OTAProto$OTAStatus DEFAULT_INSTANCE;
    public static final int OTA_STAGE_FIELD_NUMBER = 1;
    public static final int OTA_STAGE_PERCENT_FIELD_NUMBER = 2;
    private static volatile Parser<OTAProto$OTAStatus> PARSER;
    private int otaStagePercent_;
    private int otaStage_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$OTAStatus, Builder> implements OTAProto$OTAStatusOrBuilder {
        public Builder clearOtaStage() {
            copyOnWrite();
            ((OTAProto$OTAStatus) this.instance).clearOtaStage();
            return this;
        }

        public Builder clearOtaStagePercent() {
            copyOnWrite();
            ((OTAProto$OTAStatus) this.instance).clearOtaStagePercent();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$OTAStatusOrBuilder
        public int getOtaStage() {
            return ((OTAProto$OTAStatus) this.instance).getOtaStage();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$OTAStatusOrBuilder
        public int getOtaStagePercent() {
            return ((OTAProto$OTAStatus) this.instance).getOtaStagePercent();
        }

        public Builder setOtaStage(int i) {
            copyOnWrite();
            ((OTAProto$OTAStatus) this.instance).setOtaStage(i);
            return this;
        }

        public Builder setOtaStagePercent(int i) {
            copyOnWrite();
            ((OTAProto$OTAStatus) this.instance).setOtaStagePercent(i);
            return this;
        }

        private Builder() {
            super(OTAProto$OTAStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$OTAStatus oTAProto$OTAStatus = new OTAProto$OTAStatus();
        DEFAULT_INSTANCE = oTAProto$OTAStatus;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$OTAStatus.class, oTAProto$OTAStatus);
    }

    private OTAProto$OTAStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtaStage() {
        this.otaStage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtaStagePercent() {
        this.otaStagePercent_ = 0;
    }

    public static OTAProto$OTAStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$OTAStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$OTAStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$OTAStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtaStage(int i) {
        this.otaStage_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtaStagePercent(int i) {
        this.otaStagePercent_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = o6d.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OTAProto$OTAStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"otaStage_", "otaStagePercent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$OTAStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$OTAStatus.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$OTAStatusOrBuilder
    public int getOtaStage() {
        return this.otaStage_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$OTAStatusOrBuilder
    public int getOtaStagePercent() {
        return this.otaStagePercent_;
    }

    public static Builder newBuilder(OTAProto$OTAStatus oTAProto$OTAStatus) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$OTAStatus);
    }

    public static OTAProto$OTAStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$OTAStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$OTAStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$OTAStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$OTAStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$OTAStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$OTAStatus parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$OTAStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$OTAStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$OTAStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$OTAStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
