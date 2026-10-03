package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.zhl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class WearEngineProto$WEMessageBody extends GeneratedMessageLite<WearEngineProto$WEMessageBody, Builder> implements WearEngineProto$WEMessageBodyOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final WearEngineProto$WEMessageBody DEFAULT_INSTANCE;
    private static volatile Parser<WearEngineProto$WEMessageBody> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    private String path_ = "";
    private ByteString data_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<WearEngineProto$WEMessageBody, Builder> implements WearEngineProto$WEMessageBodyOrBuilder {
        public Builder clearData() {
            copyOnWrite();
            ((WearEngineProto$WEMessageBody) this.instance).clearData();
            return this;
        }

        public Builder clearPath() {
            copyOnWrite();
            ((WearEngineProto$WEMessageBody) this.instance).clearPath();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageBodyOrBuilder
        public ByteString getData() {
            return ((WearEngineProto$WEMessageBody) this.instance).getData();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageBodyOrBuilder
        public String getPath() {
            return ((WearEngineProto$WEMessageBody) this.instance).getPath();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageBodyOrBuilder
        public ByteString getPathBytes() {
            return ((WearEngineProto$WEMessageBody) this.instance).getPathBytes();
        }

        public Builder setData(ByteString byteString) {
            copyOnWrite();
            ((WearEngineProto$WEMessageBody) this.instance).setData(byteString);
            return this;
        }

        public Builder setPath(String str) {
            copyOnWrite();
            ((WearEngineProto$WEMessageBody) this.instance).setPath(str);
            return this;
        }

        public Builder setPathBytes(ByteString byteString) {
            copyOnWrite();
            ((WearEngineProto$WEMessageBody) this.instance).setPathBytes(byteString);
            return this;
        }

        private Builder() {
            super(WearEngineProto$WEMessageBody.DEFAULT_INSTANCE);
        }
    }

    static {
        WearEngineProto$WEMessageBody wearEngineProto$WEMessageBody = new WearEngineProto$WEMessageBody();
        DEFAULT_INSTANCE = wearEngineProto$WEMessageBody;
        GeneratedMessageLite.registerDefaultInstance(WearEngineProto$WEMessageBody.class, wearEngineProto$WEMessageBody);
    }

    private WearEngineProto$WEMessageBody() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    public static WearEngineProto$WEMessageBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WearEngineProto$WEMessageBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WearEngineProto$WEMessageBody parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WearEngineProto$WEMessageBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(ByteString byteString) {
        byteString.getClass();
        this.data_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.path_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = zhl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WearEngineProto$WEMessageBody();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"path_", "data_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WearEngineProto$WEMessageBody> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WearEngineProto$WEMessageBody.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageBodyOrBuilder
    public ByteString getData() {
        return this.data_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageBodyOrBuilder
    public String getPath() {
        return this.path_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageBodyOrBuilder
    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8(this.path_);
    }

    public static Builder newBuilder(WearEngineProto$WEMessageBody wearEngineProto$WEMessageBody) {
        return DEFAULT_INSTANCE.createBuilder(wearEngineProto$WEMessageBody);
    }

    public static WearEngineProto$WEMessageBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WearEngineProto$WEMessageBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WearEngineProto$WEMessageBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageBody parseFrom(InputStream inputStream) throws IOException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WearEngineProto$WEMessageBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageBody parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WearEngineProto$WEMessageBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEMessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
