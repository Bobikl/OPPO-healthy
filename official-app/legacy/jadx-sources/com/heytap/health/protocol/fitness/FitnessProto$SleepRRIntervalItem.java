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
public final class FitnessProto$SleepRRIntervalItem extends GeneratedMessageLite<FitnessProto$SleepRRIntervalItem, Builder> implements FitnessProto$SleepRRIntervalItemOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final FitnessProto$SleepRRIntervalItem DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$SleepRRIntervalItem> PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 1;
    private ByteString data_ = ByteString.EMPTY;
    private int timeStamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepRRIntervalItem, Builder> implements FitnessProto$SleepRRIntervalItemOrBuilder {
        private Builder() {
            super(FitnessProto$SleepRRIntervalItem.DEFAULT_INSTANCE);
        }

        public Builder clearData() {
            copyOnWrite();
            ((FitnessProto$SleepRRIntervalItem) this.instance).clearData();
            return this;
        }

        public Builder clearTimeStamp() {
            copyOnWrite();
            ((FitnessProto$SleepRRIntervalItem) this.instance).clearTimeStamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepRRIntervalItemOrBuilder
        public ByteString getData() {
            return ((FitnessProto$SleepRRIntervalItem) this.instance).getData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepRRIntervalItemOrBuilder
        public int getTimeStamp() {
            return ((FitnessProto$SleepRRIntervalItem) this.instance).getTimeStamp();
        }

        public Builder setData(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SleepRRIntervalItem) this.instance).setData(byteString);
            return this;
        }

        public Builder setTimeStamp(int i) {
            copyOnWrite();
            ((FitnessProto$SleepRRIntervalItem) this.instance).setTimeStamp(i);
            return this;
        }
    }

    static {
        FitnessProto$SleepRRIntervalItem fitnessProto$SleepRRIntervalItem = new FitnessProto$SleepRRIntervalItem();
        DEFAULT_INSTANCE = fitnessProto$SleepRRIntervalItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepRRIntervalItem.class, fitnessProto$SleepRRIntervalItem);
    }

    private FitnessProto$SleepRRIntervalItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0;
    }

    public static FitnessProto$SleepRRIntervalItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepRRIntervalItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$SleepRRIntervalItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(ByteString byteString) {
        byteString.getClass();
        this.data_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(int i) {
        this.timeStamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepRRIntervalItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"timeStamp_", "data_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SleepRRIntervalItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepRRIntervalItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepRRIntervalItemOrBuilder
    public ByteString getData() {
        return this.data_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepRRIntervalItemOrBuilder
    public int getTimeStamp() {
        return this.timeStamp_;
    }

    public static Builder newBuilder(FitnessProto$SleepRRIntervalItem fitnessProto$SleepRRIntervalItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepRRIntervalItem);
    }

    public static FitnessProto$SleepRRIntervalItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepRRIntervalItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepRRIntervalItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
