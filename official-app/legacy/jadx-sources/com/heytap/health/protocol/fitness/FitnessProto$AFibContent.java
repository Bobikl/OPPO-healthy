package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$AFibContent extends GeneratedMessageLite<FitnessProto$AFibContent, Builder> implements FitnessProto$AFibContentOrBuilder {
    private static final FitnessProto$AFibContent DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$AFibContent> PARSER = null;
    public static final int RELIABILITY_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int reliability_;
    private int state_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$AFibContent, Builder> implements FitnessProto$AFibContentOrBuilder {
        public Builder clearReliability() {
            copyOnWrite();
            ((FitnessProto$AFibContent) this.instance).clearReliability();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$AFibContent) this.instance).clearState();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$AFibContent) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibContentOrBuilder
        public int getReliability() {
            return ((FitnessProto$AFibContent) this.instance).getReliability();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibContentOrBuilder
        public int getState() {
            return ((FitnessProto$AFibContent) this.instance).getState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibContentOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$AFibContent) this.instance).getTimestamp();
        }

        public Builder setReliability(int i) {
            copyOnWrite();
            ((FitnessProto$AFibContent) this.instance).setReliability(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$AFibContent) this.instance).setState(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$AFibContent) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$AFibContent.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$AFibContent fitnessProto$AFibContent = new FitnessProto$AFibContent();
        DEFAULT_INSTANCE = fitnessProto$AFibContent;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$AFibContent.class, fitnessProto$AFibContent);
    }

    private FitnessProto$AFibContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReliability() {
        this.reliability_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static FitnessProto$AFibContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$AFibContent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$AFibContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$AFibContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReliability(int i) {
        this.reliability_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$AFibContent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"timestamp_", "state_", "reliability_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$AFibContent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$AFibContent.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibContentOrBuilder
    public int getReliability() {
        return this.reliability_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibContentOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibContentOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProto$AFibContent fitnessProto$AFibContent) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$AFibContent);
    }

    public static FitnessProto$AFibContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$AFibContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$AFibContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$AFibContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$AFibContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$AFibContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$AFibContent parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$AFibContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$AFibContent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$AFibContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AFibContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
