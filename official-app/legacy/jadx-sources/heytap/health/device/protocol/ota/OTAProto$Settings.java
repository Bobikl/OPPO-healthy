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
public final class OTAProto$Settings extends GeneratedMessageLite<OTAProto$Settings, Builder> implements OTAProto$SettingsOrBuilder {
    private static final OTAProto$Settings DEFAULT_INSTANCE;
    public static final int OTA_AUTO_UPDATE_FIELD_NUMBER = 1;
    private static volatile Parser<OTAProto$Settings> PARSER;
    private int otaAutoUpdate_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$Settings, Builder> implements OTAProto$SettingsOrBuilder {
        public Builder clearOtaAutoUpdate() {
            copyOnWrite();
            ((OTAProto$Settings) this.instance).clearOtaAutoUpdate();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$SettingsOrBuilder
        public int getOtaAutoUpdate() {
            return ((OTAProto$Settings) this.instance).getOtaAutoUpdate();
        }

        public Builder setOtaAutoUpdate(int i) {
            copyOnWrite();
            ((OTAProto$Settings) this.instance).setOtaAutoUpdate(i);
            return this;
        }

        private Builder() {
            super(OTAProto$Settings.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$Settings oTAProto$Settings = new OTAProto$Settings();
        DEFAULT_INSTANCE = oTAProto$Settings;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$Settings.class, oTAProto$Settings);
    }

    private OTAProto$Settings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtaAutoUpdate() {
        this.otaAutoUpdate_ = 0;
    }

    public static OTAProto$Settings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$Settings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$Settings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$Settings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$Settings> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtaAutoUpdate(int i) {
        this.otaAutoUpdate_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = o6d.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OTAProto$Settings();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"otaAutoUpdate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$Settings> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$Settings.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$SettingsOrBuilder
    public int getOtaAutoUpdate() {
        return this.otaAutoUpdate_;
    }

    public static Builder newBuilder(OTAProto$Settings oTAProto$Settings) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$Settings);
    }

    public static OTAProto$Settings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$Settings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$Settings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$Settings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$Settings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$Settings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$Settings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$Settings parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$Settings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$Settings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$Settings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
