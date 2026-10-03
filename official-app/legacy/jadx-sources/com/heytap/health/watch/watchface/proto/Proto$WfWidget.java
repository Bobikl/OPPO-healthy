package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$WfWidget extends GeneratedMessageLite<Proto$WfWidget, Builder> implements Proto$WfWidgetOrBuilder {
    private static final Proto$WfWidget DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Proto$WfWidget> PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 2;
    private int id_;
    private int providerId_;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WfWidget, Builder> implements Proto$WfWidgetOrBuilder {
        public Builder clearId() {
            copyOnWrite();
            ((Proto$WfWidget) this.instance).clearId();
            return this;
        }

        public Builder clearProviderId() {
            copyOnWrite();
            ((Proto$WfWidget) this.instance).clearProviderId();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfWidgetOrBuilder
        public int getId() {
            return ((Proto$WfWidget) this.instance).getId();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfWidgetOrBuilder
        public int getProviderId() {
            return ((Proto$WfWidget) this.instance).getProviderId();
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((Proto$WfWidget) this.instance).setId(i);
            return this;
        }

        public Builder setProviderId(int i) {
            copyOnWrite();
            ((Proto$WfWidget) this.instance).setProviderId(i);
            return this;
        }

        private Builder() {
            super(Proto$WfWidget.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$WfWidget proto$WfWidget = new Proto$WfWidget();
        DEFAULT_INSTANCE = proto$WfWidget;
        GeneratedMessageLite.registerDefaultInstance(Proto$WfWidget.class, proto$WfWidget);
    }

    private Proto$WfWidget() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.providerId_ = 0;
    }

    public static Proto$WfWidget getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WfWidget parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WfWidget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WfWidget parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WfWidget> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(int i) {
        this.providerId_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$WfWidget();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"id_", "providerId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WfWidget> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WfWidget.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfWidgetOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfWidgetOrBuilder
    public int getProviderId() {
        return this.providerId_;
    }

    public static Builder newBuilder(Proto$WfWidget proto$WfWidget) {
        return DEFAULT_INSTANCE.createBuilder(proto$WfWidget);
    }

    public static Proto$WfWidget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WfWidget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WfWidget parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WfWidget parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$WfWidget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WfWidget parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WfWidget parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WfWidget parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WfWidget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WfWidget parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WfWidget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WfWidget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
