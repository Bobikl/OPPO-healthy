package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.oxc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class NotificationSwitches$NotificationSwitchData extends GeneratedMessageLite<NotificationSwitches$NotificationSwitchData, Builder> implements NotificationSwitches$NotificationSwitchDataOrBuilder {
    private static final NotificationSwitches$NotificationSwitchData DEFAULT_INSTANCE;
    private static volatile Parser<NotificationSwitches$NotificationSwitchData> PARSER = null;
    public static final int SWITCHDATA_FIELD_NUMBER = 1;
    private int switchData_;

    public static final class Builder extends GeneratedMessageLite.Builder<NotificationSwitches$NotificationSwitchData, Builder> implements NotificationSwitches$NotificationSwitchDataOrBuilder {
        public Builder clearSwitchData() {
            copyOnWrite();
            ((NotificationSwitches$NotificationSwitchData) this.instance).clearSwitchData();
            return this;
        }

        @Override // com.heytap.health.watch.notification.NotificationSwitches$NotificationSwitchDataOrBuilder
        public int getSwitchData() {
            return ((NotificationSwitches$NotificationSwitchData) this.instance).getSwitchData();
        }

        public Builder setSwitchData(int i) {
            copyOnWrite();
            ((NotificationSwitches$NotificationSwitchData) this.instance).setSwitchData(i);
            return this;
        }

        private Builder() {
            super(NotificationSwitches$NotificationSwitchData.DEFAULT_INSTANCE);
        }
    }

    static {
        NotificationSwitches$NotificationSwitchData notificationSwitches$NotificationSwitchData = new NotificationSwitches$NotificationSwitchData();
        DEFAULT_INSTANCE = notificationSwitches$NotificationSwitchData;
        GeneratedMessageLite.registerDefaultInstance(NotificationSwitches$NotificationSwitchData.class, notificationSwitches$NotificationSwitchData);
    }

    private NotificationSwitches$NotificationSwitchData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchData() {
        this.switchData_ = 0;
    }

    public static NotificationSwitches$NotificationSwitchData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationSwitches$NotificationSwitchData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NotificationSwitches$NotificationSwitchData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchData(int i) {
        this.switchData_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = oxc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new NotificationSwitches$NotificationSwitchData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"switchData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NotificationSwitches$NotificationSwitchData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NotificationSwitches$NotificationSwitchData.class) {
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

    @Override // com.heytap.health.watch.notification.NotificationSwitches$NotificationSwitchDataOrBuilder
    public int getSwitchData() {
        return this.switchData_;
    }

    public static Builder newBuilder(NotificationSwitches$NotificationSwitchData notificationSwitches$NotificationSwitchData) {
        return DEFAULT_INSTANCE.createBuilder(notificationSwitches$NotificationSwitchData);
    }

    public static NotificationSwitches$NotificationSwitchData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(InputStream inputStream) throws IOException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NotificationSwitches$NotificationSwitchData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationSwitches$NotificationSwitchData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
