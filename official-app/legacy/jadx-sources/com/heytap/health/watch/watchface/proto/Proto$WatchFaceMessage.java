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
public final class Proto$WatchFaceMessage extends GeneratedMessageLite<Proto$WatchFaceMessage, Builder> implements Proto$WatchFaceMessageOrBuilder {
    public static final int BODY_FIELD_NUMBER = 2;
    private static final Proto$WatchFaceMessage DEFAULT_INSTANCE;
    public static final int ENHANCE_BODY_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile Parser<Proto$WatchFaceMessage> PARSER;
    private int bitField0_;
    private Proto$MessageBody body_;
    private Proto$MessageEnhanceBody enhanceBody_;
    private Proto$MessageHeader header_;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WatchFaceMessage, Builder> implements Proto$WatchFaceMessageOrBuilder {
        public Builder clearBody() {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).clearBody();
            return this;
        }

        public Builder clearEnhanceBody() {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).clearEnhanceBody();
            return this;
        }

        public Builder clearHeader() {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).clearHeader();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
        public Proto$MessageBody getBody() {
            return ((Proto$WatchFaceMessage) this.instance).getBody();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
        public Proto$MessageEnhanceBody getEnhanceBody() {
            return ((Proto$WatchFaceMessage) this.instance).getEnhanceBody();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
        public Proto$MessageHeader getHeader() {
            return ((Proto$WatchFaceMessage) this.instance).getHeader();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
        public boolean hasBody() {
            return ((Proto$WatchFaceMessage) this.instance).hasBody();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
        public boolean hasEnhanceBody() {
            return ((Proto$WatchFaceMessage) this.instance).hasEnhanceBody();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
        public boolean hasHeader() {
            return ((Proto$WatchFaceMessage) this.instance).hasHeader();
        }

        public Builder mergeBody(Proto$MessageBody proto$MessageBody) {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).mergeBody(proto$MessageBody);
            return this;
        }

        public Builder mergeEnhanceBody(Proto$MessageEnhanceBody proto$MessageEnhanceBody) {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).mergeEnhanceBody(proto$MessageEnhanceBody);
            return this;
        }

        public Builder mergeHeader(Proto$MessageHeader proto$MessageHeader) {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).mergeHeader(proto$MessageHeader);
            return this;
        }

        public Builder setBody(Proto$MessageBody proto$MessageBody) {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).setBody(proto$MessageBody);
            return this;
        }

        public Builder setEnhanceBody(Proto$MessageEnhanceBody proto$MessageEnhanceBody) {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).setEnhanceBody(proto$MessageEnhanceBody);
            return this;
        }

        public Builder setHeader(Proto$MessageHeader proto$MessageHeader) {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).setHeader(proto$MessageHeader);
            return this;
        }

        private Builder() {
            super(Proto$WatchFaceMessage.DEFAULT_INSTANCE);
        }

        public Builder setBody(Proto$MessageBody.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).setBody(builder.build());
            return this;
        }

        public Builder setEnhanceBody(Proto$MessageEnhanceBody.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).setEnhanceBody(builder.build());
            return this;
        }

        public Builder setHeader(Proto$MessageHeader.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFaceMessage) this.instance).setHeader(builder.build());
            return this;
        }
    }

    static {
        Proto$WatchFaceMessage proto$WatchFaceMessage = new Proto$WatchFaceMessage();
        DEFAULT_INSTANCE = proto$WatchFaceMessage;
        GeneratedMessageLite.registerDefaultInstance(Proto$WatchFaceMessage.class, proto$WatchFaceMessage);
    }

    private Proto$WatchFaceMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnhanceBody() {
        this.enhanceBody_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeader() {
        this.header_ = null;
        this.bitField0_ &= -2;
    }

    public static Proto$WatchFaceMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBody(Proto$MessageBody proto$MessageBody) {
        proto$MessageBody.getClass();
        Proto$MessageBody proto$MessageBody2 = this.body_;
        if (proto$MessageBody2 == null || proto$MessageBody2 == Proto$MessageBody.getDefaultInstance()) {
            this.body_ = proto$MessageBody;
        } else {
            this.body_ = Proto$MessageBody.newBuilder(this.body_).mergeFrom(proto$MessageBody).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnhanceBody(Proto$MessageEnhanceBody proto$MessageEnhanceBody) {
        proto$MessageEnhanceBody.getClass();
        Proto$MessageEnhanceBody proto$MessageEnhanceBody2 = this.enhanceBody_;
        if (proto$MessageEnhanceBody2 == null || proto$MessageEnhanceBody2 == Proto$MessageEnhanceBody.getDefaultInstance()) {
            this.enhanceBody_ = proto$MessageEnhanceBody;
        } else {
            this.enhanceBody_ = Proto$MessageEnhanceBody.newBuilder(this.enhanceBody_).mergeFrom(proto$MessageEnhanceBody).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeader(Proto$MessageHeader proto$MessageHeader) {
        proto$MessageHeader.getClass();
        Proto$MessageHeader proto$MessageHeader2 = this.header_;
        if (proto$MessageHeader2 == null || proto$MessageHeader2 == Proto$MessageHeader.getDefaultInstance()) {
            this.header_ = proto$MessageHeader;
        } else {
            this.header_ = Proto$MessageHeader.newBuilder(this.header_).mergeFrom(proto$MessageHeader).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WatchFaceMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFaceMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WatchFaceMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(Proto$MessageBody proto$MessageBody) {
        proto$MessageBody.getClass();
        this.body_ = proto$MessageBody;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnhanceBody(Proto$MessageEnhanceBody proto$MessageEnhanceBody) {
        proto$MessageEnhanceBody.getClass();
        this.enhanceBody_ = proto$MessageEnhanceBody;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeader(Proto$MessageHeader proto$MessageHeader) {
        proto$MessageHeader.getClass();
        this.header_ = proto$MessageHeader;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$WatchFaceMessage();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "header_", "body_", "enhanceBody_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WatchFaceMessage> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WatchFaceMessage.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
    public Proto$MessageBody getBody() {
        Proto$MessageBody proto$MessageBody = this.body_;
        return proto$MessageBody == null ? Proto$MessageBody.getDefaultInstance() : proto$MessageBody;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
    public Proto$MessageEnhanceBody getEnhanceBody() {
        Proto$MessageEnhanceBody proto$MessageEnhanceBody = this.enhanceBody_;
        return proto$MessageEnhanceBody == null ? Proto$MessageEnhanceBody.getDefaultInstance() : proto$MessageEnhanceBody;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
    public Proto$MessageHeader getHeader() {
        Proto$MessageHeader proto$MessageHeader = this.header_;
        return proto$MessageHeader == null ? Proto$MessageHeader.getDefaultInstance() : proto$MessageHeader;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
    public boolean hasBody() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
    public boolean hasEnhanceBody() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessageOrBuilder
    public boolean hasHeader() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        return DEFAULT_INSTANCE.createBuilder(proto$WatchFaceMessage);
    }

    public static Proto$WatchFaceMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFaceMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WatchFaceMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$WatchFaceMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WatchFaceMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WatchFaceMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WatchFaceMessage parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFaceMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFaceMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WatchFaceMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFaceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
