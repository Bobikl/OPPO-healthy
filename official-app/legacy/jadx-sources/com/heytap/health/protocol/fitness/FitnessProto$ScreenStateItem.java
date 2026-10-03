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
public final class FitnessProto$ScreenStateItem extends GeneratedMessageLite<FitnessProto$ScreenStateItem, Builder> implements FitnessProto$ScreenStateItemOrBuilder {
    private static final FitnessProto$ScreenStateItem DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$ScreenStateItem> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int TIME_FIELD_NUMBER = 1;
    private int state_;
    private int time_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ScreenStateItem, Builder> implements FitnessProto$ScreenStateItemOrBuilder {
        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$ScreenStateItem) this.instance).clearState();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProto$ScreenStateItem) this.instance).clearTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScreenStateItemOrBuilder
        public int getState() {
            return ((FitnessProto$ScreenStateItem) this.instance).getState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScreenStateItemOrBuilder
        public int getTime() {
            return ((FitnessProto$ScreenStateItem) this.instance).getTime();
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$ScreenStateItem) this.instance).setState(i);
            return this;
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProto$ScreenStateItem) this.instance).setTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$ScreenStateItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$ScreenStateItem fitnessProto$ScreenStateItem = new FitnessProto$ScreenStateItem();
        DEFAULT_INSTANCE = fitnessProto$ScreenStateItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ScreenStateItem.class, fitnessProto$ScreenStateItem);
    }

    private FitnessProto$ScreenStateItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    public static FitnessProto$ScreenStateItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ScreenStateItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ScreenStateItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$ScreenStateItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ScreenStateItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"time_", "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$ScreenStateItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ScreenStateItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScreenStateItemOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScreenStateItemOrBuilder
    public int getTime() {
        return this.time_;
    }

    public static Builder newBuilder(FitnessProto$ScreenStateItem fitnessProto$ScreenStateItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$ScreenStateItem);
    }

    public static FitnessProto$ScreenStateItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScreenStateItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ScreenStateItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$ScreenStateItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ScreenStateItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ScreenStateItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$ScreenStateItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ScreenStateItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScreenStateItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ScreenStateItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScreenStateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
