package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l8l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchAppProto$AppCommandMsg extends GeneratedMessageLite<WatchAppProto$AppCommandMsg, Builder> implements WatchAppProto$AppCommandMsgOrBuilder {
    public static final int BODY_FIELD_NUMBER = 2;
    private static final WatchAppProto$AppCommandMsg DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile Parser<WatchAppProto$AppCommandMsg> PARSER;
    private int bitField0_;
    private WatchAppProto$MsgBody body_;
    private WatchAppProto$MsgHeader header_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$AppCommandMsg, Builder> implements WatchAppProto$AppCommandMsgOrBuilder {
        public Builder clearBody() {
            copyOnWrite();
            ((WatchAppProto$AppCommandMsg) this.instance).clearBody();
            return this;
        }

        public Builder clearHeader() {
            copyOnWrite();
            ((WatchAppProto$AppCommandMsg) this.instance).clearHeader();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsgOrBuilder
        public WatchAppProto$MsgBody getBody() {
            return ((WatchAppProto$AppCommandMsg) this.instance).getBody();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsgOrBuilder
        public WatchAppProto$MsgHeader getHeader() {
            return ((WatchAppProto$AppCommandMsg) this.instance).getHeader();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsgOrBuilder
        public boolean hasBody() {
            return ((WatchAppProto$AppCommandMsg) this.instance).hasBody();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsgOrBuilder
        public boolean hasHeader() {
            return ((WatchAppProto$AppCommandMsg) this.instance).hasHeader();
        }

        public Builder mergeBody(WatchAppProto$MsgBody watchAppProto$MsgBody) {
            copyOnWrite();
            ((WatchAppProto$AppCommandMsg) this.instance).mergeBody(watchAppProto$MsgBody);
            return this;
        }

        public Builder mergeHeader(WatchAppProto$MsgHeader watchAppProto$MsgHeader) {
            copyOnWrite();
            ((WatchAppProto$AppCommandMsg) this.instance).mergeHeader(watchAppProto$MsgHeader);
            return this;
        }

        public Builder setBody(WatchAppProto$MsgBody watchAppProto$MsgBody) {
            copyOnWrite();
            ((WatchAppProto$AppCommandMsg) this.instance).setBody(watchAppProto$MsgBody);
            return this;
        }

        public Builder setHeader(WatchAppProto$MsgHeader watchAppProto$MsgHeader) {
            copyOnWrite();
            ((WatchAppProto$AppCommandMsg) this.instance).setHeader(watchAppProto$MsgHeader);
            return this;
        }

        private Builder() {
            super(WatchAppProto$AppCommandMsg.DEFAULT_INSTANCE);
        }

        public Builder setBody(WatchAppProto$MsgBody.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$AppCommandMsg) this.instance).setBody(builder.build());
            return this;
        }

        public Builder setHeader(WatchAppProto$MsgHeader.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$AppCommandMsg) this.instance).setHeader(builder.build());
            return this;
        }
    }

    static {
        WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg = new WatchAppProto$AppCommandMsg();
        DEFAULT_INSTANCE = watchAppProto$AppCommandMsg;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$AppCommandMsg.class, watchAppProto$AppCommandMsg);
    }

    private WatchAppProto$AppCommandMsg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeader() {
        this.header_ = null;
        this.bitField0_ &= -2;
    }

    public static WatchAppProto$AppCommandMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBody(WatchAppProto$MsgBody watchAppProto$MsgBody) {
        watchAppProto$MsgBody.getClass();
        WatchAppProto$MsgBody watchAppProto$MsgBody2 = this.body_;
        if (watchAppProto$MsgBody2 == null || watchAppProto$MsgBody2 == WatchAppProto$MsgBody.getDefaultInstance()) {
            this.body_ = watchAppProto$MsgBody;
        } else {
            this.body_ = WatchAppProto$MsgBody.newBuilder(this.body_).mergeFrom(watchAppProto$MsgBody).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeader(WatchAppProto$MsgHeader watchAppProto$MsgHeader) {
        watchAppProto$MsgHeader.getClass();
        WatchAppProto$MsgHeader watchAppProto$MsgHeader2 = this.header_;
        if (watchAppProto$MsgHeader2 == null || watchAppProto$MsgHeader2 == WatchAppProto$MsgHeader.getDefaultInstance()) {
            this.header_ = watchAppProto$MsgHeader;
        } else {
            this.header_ = WatchAppProto$MsgHeader.newBuilder(this.header_).mergeFrom(watchAppProto$MsgHeader).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$AppCommandMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$AppCommandMsg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(WatchAppProto$MsgBody watchAppProto$MsgBody) {
        watchAppProto$MsgBody.getClass();
        this.body_ = watchAppProto$MsgBody;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeader(WatchAppProto$MsgHeader watchAppProto$MsgHeader) {
        watchAppProto$MsgHeader.getClass();
        this.header_ = watchAppProto$MsgHeader;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$AppCommandMsg();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "header_", "body_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$AppCommandMsg> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$AppCommandMsg.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsgOrBuilder
    public WatchAppProto$MsgBody getBody() {
        WatchAppProto$MsgBody watchAppProto$MsgBody = this.body_;
        return watchAppProto$MsgBody == null ? WatchAppProto$MsgBody.getDefaultInstance() : watchAppProto$MsgBody;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsgOrBuilder
    public WatchAppProto$MsgHeader getHeader() {
        WatchAppProto$MsgHeader watchAppProto$MsgHeader = this.header_;
        return watchAppProto$MsgHeader == null ? WatchAppProto$MsgHeader.getDefaultInstance() : watchAppProto$MsgHeader;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsgOrBuilder
    public boolean hasBody() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsgOrBuilder
    public boolean hasHeader() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$AppCommandMsg);
    }

    public static WatchAppProto$AppCommandMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$AppCommandMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppCommandMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
