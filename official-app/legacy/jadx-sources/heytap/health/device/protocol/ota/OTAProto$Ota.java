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
public final class OTAProto$Ota extends GeneratedMessageLite<OTAProto$Ota, Builder> implements OTAProto$OtaOrBuilder {
    private static final OTAProto$Ota DEFAULT_INSTANCE;
    public static final int DEVICE_STATUS_FIELD_NUMBER = 1;
    private static volatile Parser<OTAProto$Ota> PARSER;
    private int deviceStatus_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$Ota, Builder> implements OTAProto$OtaOrBuilder {
        public Builder clearDeviceStatus() {
            copyOnWrite();
            ((OTAProto$Ota) this.instance).clearDeviceStatus();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$OtaOrBuilder
        public int getDeviceStatus() {
            return ((OTAProto$Ota) this.instance).getDeviceStatus();
        }

        public Builder setDeviceStatus(int i) {
            copyOnWrite();
            ((OTAProto$Ota) this.instance).setDeviceStatus(i);
            return this;
        }

        private Builder() {
            super(OTAProto$Ota.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$Ota oTAProto$Ota = new OTAProto$Ota();
        DEFAULT_INSTANCE = oTAProto$Ota;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$Ota.class, oTAProto$Ota);
    }

    private OTAProto$Ota() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceStatus() {
        this.deviceStatus_ = 0;
    }

    public static OTAProto$Ota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$Ota parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$Ota) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$Ota parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$Ota> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceStatus(int i) {
        this.deviceStatus_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = o6d.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OTAProto$Ota();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"deviceStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$Ota> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$Ota.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$OtaOrBuilder
    public int getDeviceStatus() {
        return this.deviceStatus_;
    }

    public static Builder newBuilder(OTAProto$Ota oTAProto$Ota) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$Ota);
    }

    public static OTAProto$Ota parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$Ota) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$Ota parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$Ota parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$Ota parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$Ota parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$Ota parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$Ota parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$Ota parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$Ota parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$Ota parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$Ota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
