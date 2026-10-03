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
public final class FitnessProto$AFibItem extends GeneratedMessageLite<FitnessProto$AFibItem, Builder> implements FitnessProto$AFibItemOrBuilder {
    private static final FitnessProto$AFibItem DEFAULT_INSTANCE;
    public static final int OFFSET_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$AFibItem> PARSER = null;
    public static final int RELIABILITY_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int WARN_FLAG_FIELD_NUMBER = 4;
    private int offset_;
    private int reliability_;
    private int state_;
    private int warnFlag_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$AFibItem, Builder> implements FitnessProto$AFibItemOrBuilder {
        public Builder clearOffset() {
            copyOnWrite();
            ((FitnessProto$AFibItem) this.instance).clearOffset();
            return this;
        }

        public Builder clearReliability() {
            copyOnWrite();
            ((FitnessProto$AFibItem) this.instance).clearReliability();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$AFibItem) this.instance).clearState();
            return this;
        }

        public Builder clearWarnFlag() {
            copyOnWrite();
            ((FitnessProto$AFibItem) this.instance).clearWarnFlag();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibItemOrBuilder
        public int getOffset() {
            return ((FitnessProto$AFibItem) this.instance).getOffset();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibItemOrBuilder
        public int getReliability() {
            return ((FitnessProto$AFibItem) this.instance).getReliability();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibItemOrBuilder
        public int getState() {
            return ((FitnessProto$AFibItem) this.instance).getState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibItemOrBuilder
        public int getWarnFlag() {
            return ((FitnessProto$AFibItem) this.instance).getWarnFlag();
        }

        public Builder setOffset(int i) {
            copyOnWrite();
            ((FitnessProto$AFibItem) this.instance).setOffset(i);
            return this;
        }

        public Builder setReliability(int i) {
            copyOnWrite();
            ((FitnessProto$AFibItem) this.instance).setReliability(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$AFibItem) this.instance).setState(i);
            return this;
        }

        public Builder setWarnFlag(int i) {
            copyOnWrite();
            ((FitnessProto$AFibItem) this.instance).setWarnFlag(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$AFibItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$AFibItem fitnessProto$AFibItem = new FitnessProto$AFibItem();
        DEFAULT_INSTANCE = fitnessProto$AFibItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$AFibItem.class, fitnessProto$AFibItem);
    }

    private FitnessProto$AFibItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffset() {
        this.offset_ = 0;
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
    public void clearWarnFlag() {
        this.warnFlag_ = 0;
    }

    public static FitnessProto$AFibItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$AFibItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$AFibItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$AFibItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffset(int i) {
        this.offset_ = i;
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
    public void setWarnFlag(int i) {
        this.warnFlag_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$AFibItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"offset_", "state_", "reliability_", "warnFlag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$AFibItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$AFibItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibItemOrBuilder
    public int getOffset() {
        return this.offset_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibItemOrBuilder
    public int getReliability() {
        return this.reliability_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibItemOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AFibItemOrBuilder
    public int getWarnFlag() {
        return this.warnFlag_;
    }

    public static Builder newBuilder(FitnessProto$AFibItem fitnessProto$AFibItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$AFibItem);
    }

    public static FitnessProto$AFibItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$AFibItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$AFibItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$AFibItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$AFibItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$AFibItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$AFibItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$AFibItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$AFibItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$AFibItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AFibItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
