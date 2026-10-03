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
public final class FitnessProto$SleepStateChangeNotify extends GeneratedMessageLite<FitnessProto$SleepStateChangeNotify, Builder> implements FitnessProto$SleepStateChangeNotifyOrBuilder {
    private static final FitnessProto$SleepStateChangeNotify DEFAULT_INSTANCE;
    public static final int ENDTIME_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$SleepStateChangeNotify> PARSER = null;
    public static final int STARTTIME_FIELD_NUMBER = 1;
    public static final int STATE_FIELD_NUMBER = 3;
    private int endTime_;
    private int startTime_;
    private int state_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepStateChangeNotify, Builder> implements FitnessProto$SleepStateChangeNotifyOrBuilder {
        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProto$SleepStateChangeNotify) this.instance).clearEndTime();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$SleepStateChangeNotify) this.instance).clearStartTime();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$SleepStateChangeNotify) this.instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStateChangeNotifyOrBuilder
        public int getEndTime() {
            return ((FitnessProto$SleepStateChangeNotify) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStateChangeNotifyOrBuilder
        public int getStartTime() {
            return ((FitnessProto$SleepStateChangeNotify) this.instance).getStartTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStateChangeNotifyOrBuilder
        public int getState() {
            return ((FitnessProto$SleepStateChangeNotify) this.instance).getState();
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStateChangeNotify) this.instance).setEndTime(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStateChangeNotify) this.instance).setStartTime(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$SleepStateChangeNotify) this.instance).setState(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepStateChangeNotify.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SleepStateChangeNotify fitnessProto$SleepStateChangeNotify = new FitnessProto$SleepStateChangeNotify();
        DEFAULT_INSTANCE = fitnessProto$SleepStateChangeNotify;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepStateChangeNotify.class, fitnessProto$SleepStateChangeNotify);
    }

    private FitnessProto$SleepStateChangeNotify() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static FitnessProto$SleepStateChangeNotify getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepStateChangeNotify parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepStateChangeNotify> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepStateChangeNotify();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"startTime_", "endTime_", "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SleepStateChangeNotify> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepStateChangeNotify.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStateChangeNotifyOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStateChangeNotifyOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepStateChangeNotifyOrBuilder
    public int getState() {
        return this.state_;
    }

    public static Builder newBuilder(FitnessProto$SleepStateChangeNotify fitnessProto$SleepStateChangeNotify) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepStateChangeNotify);
    }

    public static FitnessProto$SleepStateChangeNotify parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepStateChangeNotify parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepStateChangeNotify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
