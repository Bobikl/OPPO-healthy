package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$PasswordSetting extends GeneratedMessageLite<DMProto$PasswordSetting, Builder> implements DMProto$PasswordSettingOrBuilder {
    private static final DMProto$PasswordSetting DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$PasswordSetting> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private boolean status_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$PasswordSetting, Builder> implements DMProto$PasswordSettingOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((DMProto$PasswordSetting) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$PasswordSettingOrBuilder
        public boolean getStatus() {
            return ((DMProto$PasswordSetting) this.instance).getStatus();
        }

        public Builder setStatus(boolean z) {
            copyOnWrite();
            ((DMProto$PasswordSetting) this.instance).setStatus(z);
            return this;
        }

        private Builder() {
            super(DMProto$PasswordSetting.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$PasswordSetting dMProto$PasswordSetting = new DMProto$PasswordSetting();
        DEFAULT_INSTANCE = dMProto$PasswordSetting;
        GeneratedMessageLite.registerDefaultInstance(DMProto$PasswordSetting.class, dMProto$PasswordSetting);
    }

    private DMProto$PasswordSetting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = false;
    }

    public static DMProto$PasswordSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$PasswordSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$PasswordSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$PasswordSetting> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(boolean z) {
        this.status_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$PasswordSetting();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$PasswordSetting> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$PasswordSetting.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$PasswordSettingOrBuilder
    public boolean getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(DMProto$PasswordSetting dMProto$PasswordSetting) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$PasswordSetting);
    }

    public static DMProto$PasswordSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$PasswordSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$PasswordSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$PasswordSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$PasswordSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$PasswordSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$PasswordSetting parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$PasswordSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$PasswordSetting parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$PasswordSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$PasswordSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
