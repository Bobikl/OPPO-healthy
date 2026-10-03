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
public final class FitnessProto$Spo2Content extends GeneratedMessageLite<FitnessProto$Spo2Content, Builder> implements FitnessProto$Spo2ContentOrBuilder {
    private static final FitnessProto$Spo2Content DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$Spo2Content> PARSER = null;
    public static final int SPO2_VALUE_HIGHEST_FIELD_NUMBER = 4;
    public static final int SPO2_VALUE_LOWEST_FIELD_NUMBER = 3;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private int endTime_;
    private int spo2ValueHighest_;
    private int spo2ValueLowest_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$Spo2Content, Builder> implements FitnessProto$Spo2ContentOrBuilder {
        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProto$Spo2Content) this.instance).clearEndTime();
            return this;
        }

        public Builder clearSpo2ValueHighest() {
            copyOnWrite();
            ((FitnessProto$Spo2Content) this.instance).clearSpo2ValueHighest();
            return this;
        }

        public Builder clearSpo2ValueLowest() {
            copyOnWrite();
            ((FitnessProto$Spo2Content) this.instance).clearSpo2ValueLowest();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$Spo2Content) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2ContentOrBuilder
        public int getEndTime() {
            return ((FitnessProto$Spo2Content) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2ContentOrBuilder
        public int getSpo2ValueHighest() {
            return ((FitnessProto$Spo2Content) this.instance).getSpo2ValueHighest();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2ContentOrBuilder
        public int getSpo2ValueLowest() {
            return ((FitnessProto$Spo2Content) this.instance).getSpo2ValueLowest();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2ContentOrBuilder
        public int getStartTime() {
            return ((FitnessProto$Spo2Content) this.instance).getStartTime();
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2Content) this.instance).setEndTime(i);
            return this;
        }

        public Builder setSpo2ValueHighest(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2Content) this.instance).setSpo2ValueHighest(i);
            return this;
        }

        public Builder setSpo2ValueLowest(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2Content) this.instance).setSpo2ValueLowest(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2Content) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$Spo2Content.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$Spo2Content fitnessProto$Spo2Content = new FitnessProto$Spo2Content();
        DEFAULT_INSTANCE = fitnessProto$Spo2Content;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$Spo2Content.class, fitnessProto$Spo2Content);
    }

    private FitnessProto$Spo2Content() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2ValueHighest() {
        this.spo2ValueHighest_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2ValueLowest() {
        this.spo2ValueLowest_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static FitnessProto$Spo2Content getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$Spo2Content parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$Spo2Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$Spo2Content> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2ValueHighest(int i) {
        this.spo2ValueHighest_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2ValueLowest(int i) {
        this.spo2ValueLowest_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$Spo2Content();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"startTime_", "endTime_", "spo2ValueLowest_", "spo2ValueHighest_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$Spo2Content> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$Spo2Content.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2ContentOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2ContentOrBuilder
    public int getSpo2ValueHighest() {
        return this.spo2ValueHighest_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2ContentOrBuilder
    public int getSpo2ValueLowest() {
        return this.spo2ValueLowest_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2ContentOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProto$Spo2Content fitnessProto$Spo2Content) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$Spo2Content);
    }

    public static FitnessProto$Spo2Content parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$Spo2Content parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$Spo2Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$Spo2Content parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$Spo2Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$Spo2Content parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$Spo2Content parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$Spo2Content parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$Spo2Content parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$Spo2Content parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
