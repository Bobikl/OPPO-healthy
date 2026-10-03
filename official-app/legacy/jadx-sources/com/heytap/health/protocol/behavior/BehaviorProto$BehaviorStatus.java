package com.heytap.health.protocol.behavior;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.zc1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class BehaviorProto$BehaviorStatus extends GeneratedMessageLite<BehaviorProto$BehaviorStatus, Builder> implements BehaviorProto$BehaviorStatusOrBuilder {
    private static final BehaviorProto$BehaviorStatus DEFAULT_INSTANCE;
    private static volatile Parser<BehaviorProto$BehaviorStatus> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<BehaviorProto$BehaviorStatus, Builder> implements BehaviorProto$BehaviorStatusOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((BehaviorProto$BehaviorStatus) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.protocol.behavior.BehaviorProto$BehaviorStatusOrBuilder
        public int getStatus() {
            return ((BehaviorProto$BehaviorStatus) this.instance).getStatus();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((BehaviorProto$BehaviorStatus) this.instance).setStatus(i);
            return this;
        }

        private Builder() {
            super(BehaviorProto$BehaviorStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        BehaviorProto$BehaviorStatus behaviorProto$BehaviorStatus = new BehaviorProto$BehaviorStatus();
        DEFAULT_INSTANCE = behaviorProto$BehaviorStatus;
        GeneratedMessageLite.registerDefaultInstance(BehaviorProto$BehaviorStatus.class, behaviorProto$BehaviorStatus);
    }

    private BehaviorProto$BehaviorStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static BehaviorProto$BehaviorStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BehaviorProto$BehaviorStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BehaviorProto$BehaviorStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = zc1.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new BehaviorProto$BehaviorStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BehaviorProto$BehaviorStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BehaviorProto$BehaviorStatus.class) {
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

    @Override // com.heytap.health.protocol.behavior.BehaviorProto$BehaviorStatusOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(BehaviorProto$BehaviorStatus behaviorProto$BehaviorStatus) {
        return DEFAULT_INSTANCE.createBuilder(behaviorProto$BehaviorStatus);
    }

    public static BehaviorProto$BehaviorStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(InputStream inputStream) throws IOException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BehaviorProto$BehaviorStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BehaviorProto$BehaviorStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
