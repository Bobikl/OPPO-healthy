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
public final class NotificationSwitches$NotificationResponse extends GeneratedMessageLite<NotificationSwitches$NotificationResponse, Builder> implements NotificationSwitches$NotificationResponseOrBuilder {
    private static final NotificationSwitches$NotificationResponse DEFAULT_INSTANCE;
    private static volatile Parser<NotificationSwitches$NotificationResponse> PARSER = null;
    public static final int RESPONSEOK_FIELD_NUMBER = 1;
    private boolean responseOk_;

    public static final class Builder extends GeneratedMessageLite.Builder<NotificationSwitches$NotificationResponse, Builder> implements NotificationSwitches$NotificationResponseOrBuilder {
        public Builder clearResponseOk() {
            copyOnWrite();
            ((NotificationSwitches$NotificationResponse) this.instance).clearResponseOk();
            return this;
        }

        @Override // com.heytap.health.watch.notification.NotificationSwitches$NotificationResponseOrBuilder
        public boolean getResponseOk() {
            return ((NotificationSwitches$NotificationResponse) this.instance).getResponseOk();
        }

        public Builder setResponseOk(boolean z) {
            copyOnWrite();
            ((NotificationSwitches$NotificationResponse) this.instance).setResponseOk(z);
            return this;
        }

        private Builder() {
            super(NotificationSwitches$NotificationResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        NotificationSwitches$NotificationResponse notificationSwitches$NotificationResponse = new NotificationSwitches$NotificationResponse();
        DEFAULT_INSTANCE = notificationSwitches$NotificationResponse;
        GeneratedMessageLite.registerDefaultInstance(NotificationSwitches$NotificationResponse.class, notificationSwitches$NotificationResponse);
    }

    private NotificationSwitches$NotificationResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseOk() {
        this.responseOk_ = false;
    }

    public static NotificationSwitches$NotificationResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationSwitches$NotificationResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NotificationSwitches$NotificationResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseOk(boolean z) {
        this.responseOk_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = oxc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new NotificationSwitches$NotificationResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"responseOk_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NotificationSwitches$NotificationResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NotificationSwitches$NotificationResponse.class) {
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

    @Override // com.heytap.health.watch.notification.NotificationSwitches$NotificationResponseOrBuilder
    public boolean getResponseOk() {
        return this.responseOk_;
    }

    public static Builder newBuilder(NotificationSwitches$NotificationResponse notificationSwitches$NotificationResponse) {
        return DEFAULT_INSTANCE.createBuilder(notificationSwitches$NotificationResponse);
    }

    public static NotificationSwitches$NotificationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(InputStream inputStream) throws IOException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NotificationSwitches$NotificationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationSwitches$NotificationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
