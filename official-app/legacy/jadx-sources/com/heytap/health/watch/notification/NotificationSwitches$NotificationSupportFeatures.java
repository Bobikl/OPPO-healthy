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
public final class NotificationSwitches$NotificationSupportFeatures extends GeneratedMessageLite<NotificationSwitches$NotificationSupportFeatures, Builder> implements NotificationSwitches$NotificationSupportFeaturesOrBuilder {
    private static final NotificationSwitches$NotificationSupportFeatures DEFAULT_INSTANCE;
    public static final int FEATURE_FIELD_NUMBER = 2;
    private static volatile Parser<NotificationSwitches$NotificationSupportFeatures> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int feature_;
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<NotificationSwitches$NotificationSupportFeatures, Builder> implements NotificationSwitches$NotificationSupportFeaturesOrBuilder {
        public Builder clearFeature() {
            copyOnWrite();
            ((NotificationSwitches$NotificationSupportFeatures) this.instance).clearFeature();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((NotificationSwitches$NotificationSupportFeatures) this.instance).clearVersion();
            return this;
        }

        @Override // com.heytap.health.watch.notification.NotificationSwitches$NotificationSupportFeaturesOrBuilder
        public int getFeature() {
            return ((NotificationSwitches$NotificationSupportFeatures) this.instance).getFeature();
        }

        @Override // com.heytap.health.watch.notification.NotificationSwitches$NotificationSupportFeaturesOrBuilder
        public int getVersion() {
            return ((NotificationSwitches$NotificationSupportFeatures) this.instance).getVersion();
        }

        public Builder setFeature(int i) {
            copyOnWrite();
            ((NotificationSwitches$NotificationSupportFeatures) this.instance).setFeature(i);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((NotificationSwitches$NotificationSupportFeatures) this.instance).setVersion(i);
            return this;
        }

        private Builder() {
            super(NotificationSwitches$NotificationSupportFeatures.DEFAULT_INSTANCE);
        }
    }

    static {
        NotificationSwitches$NotificationSupportFeatures notificationSwitches$NotificationSupportFeatures = new NotificationSwitches$NotificationSupportFeatures();
        DEFAULT_INSTANCE = notificationSwitches$NotificationSupportFeatures;
        GeneratedMessageLite.registerDefaultInstance(NotificationSwitches$NotificationSupportFeatures.class, notificationSwitches$NotificationSupportFeatures);
    }

    private NotificationSwitches$NotificationSupportFeatures() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeature() {
        this.feature_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static NotificationSwitches$NotificationSupportFeatures getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationSwitches$NotificationSupportFeatures parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NotificationSwitches$NotificationSupportFeatures> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeature(int i) {
        this.feature_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = oxc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new NotificationSwitches$NotificationSupportFeatures();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "feature_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NotificationSwitches$NotificationSupportFeatures> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NotificationSwitches$NotificationSupportFeatures.class) {
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

    @Override // com.heytap.health.watch.notification.NotificationSwitches$NotificationSupportFeaturesOrBuilder
    public int getFeature() {
        return this.feature_;
    }

    @Override // com.heytap.health.watch.notification.NotificationSwitches$NotificationSupportFeaturesOrBuilder
    public int getVersion() {
        return this.version_;
    }

    public static Builder newBuilder(NotificationSwitches$NotificationSupportFeatures notificationSwitches$NotificationSupportFeatures) {
        return DEFAULT_INSTANCE.createBuilder(notificationSwitches$NotificationSupportFeatures);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(InputStream inputStream) throws IOException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NotificationSwitches$NotificationSupportFeatures parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationSwitches$NotificationSupportFeatures) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
