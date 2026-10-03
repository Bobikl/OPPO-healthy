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
public final class DMProto$SyncPhoneKeepAliveSettings extends GeneratedMessageLite<DMProto$SyncPhoneKeepAliveSettings, Builder> implements DMProto$SyncPhoneKeepAliveSettingsOrBuilder {
    private static final DMProto$SyncPhoneKeepAliveSettings DEFAULT_INSTANCE;
    public static final int KEEP_ALIVE_FIELD_NUMBER = 1;
    private static volatile Parser<DMProto$SyncPhoneKeepAliveSettings> PARSER = null;
    public static final int SETTINGS_FINISH_FIELD_NUMBER = 2;
    public static final int SETTINGS_ITEM_STATE_FIELD_NUMBER = 3;
    private int keepAlive_;
    private boolean settingsFinish_;
    private int settingsItemState_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$SyncPhoneKeepAliveSettings, Builder> implements DMProto$SyncPhoneKeepAliveSettingsOrBuilder {
        public Builder clearKeepAlive() {
            copyOnWrite();
            ((DMProto$SyncPhoneKeepAliveSettings) this.instance).clearKeepAlive();
            return this;
        }

        public Builder clearSettingsFinish() {
            copyOnWrite();
            ((DMProto$SyncPhoneKeepAliveSettings) this.instance).clearSettingsFinish();
            return this;
        }

        public Builder clearSettingsItemState() {
            copyOnWrite();
            ((DMProto$SyncPhoneKeepAliveSettings) this.instance).clearSettingsItemState();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$SyncPhoneKeepAliveSettingsOrBuilder
        public int getKeepAlive() {
            return ((DMProto$SyncPhoneKeepAliveSettings) this.instance).getKeepAlive();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$SyncPhoneKeepAliveSettingsOrBuilder
        public boolean getSettingsFinish() {
            return ((DMProto$SyncPhoneKeepAliveSettings) this.instance).getSettingsFinish();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$SyncPhoneKeepAliveSettingsOrBuilder
        public int getSettingsItemState() {
            return ((DMProto$SyncPhoneKeepAliveSettings) this.instance).getSettingsItemState();
        }

        public Builder setKeepAlive(int i) {
            copyOnWrite();
            ((DMProto$SyncPhoneKeepAliveSettings) this.instance).setKeepAlive(i);
            return this;
        }

        public Builder setSettingsFinish(boolean z) {
            copyOnWrite();
            ((DMProto$SyncPhoneKeepAliveSettings) this.instance).setSettingsFinish(z);
            return this;
        }

        public Builder setSettingsItemState(int i) {
            copyOnWrite();
            ((DMProto$SyncPhoneKeepAliveSettings) this.instance).setSettingsItemState(i);
            return this;
        }

        private Builder() {
            super(DMProto$SyncPhoneKeepAliveSettings.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$SyncPhoneKeepAliveSettings dMProto$SyncPhoneKeepAliveSettings = new DMProto$SyncPhoneKeepAliveSettings();
        DEFAULT_INSTANCE = dMProto$SyncPhoneKeepAliveSettings;
        GeneratedMessageLite.registerDefaultInstance(DMProto$SyncPhoneKeepAliveSettings.class, dMProto$SyncPhoneKeepAliveSettings);
    }

    private DMProto$SyncPhoneKeepAliveSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeepAlive() {
        this.keepAlive_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettingsFinish() {
        this.settingsFinish_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettingsItemState() {
        this.settingsItemState_ = 0;
    }

    public static DMProto$SyncPhoneKeepAliveSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$SyncPhoneKeepAliveSettings> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeepAlive(int i) {
        this.keepAlive_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingsFinish(boolean z) {
        this.settingsFinish_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingsItemState(int i) {
        this.settingsItemState_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$SyncPhoneKeepAliveSettings();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0004", new Object[]{"keepAlive_", "settingsFinish_", "settingsItemState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$SyncPhoneKeepAliveSettings> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$SyncPhoneKeepAliveSettings.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$SyncPhoneKeepAliveSettingsOrBuilder
    public int getKeepAlive() {
        return this.keepAlive_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$SyncPhoneKeepAliveSettingsOrBuilder
    public boolean getSettingsFinish() {
        return this.settingsFinish_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$SyncPhoneKeepAliveSettingsOrBuilder
    public int getSettingsItemState() {
        return this.settingsItemState_;
    }

    public static Builder newBuilder(DMProto$SyncPhoneKeepAliveSettings dMProto$SyncPhoneKeepAliveSettings) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$SyncPhoneKeepAliveSettings);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$SyncPhoneKeepAliveSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$SyncPhoneKeepAliveSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
