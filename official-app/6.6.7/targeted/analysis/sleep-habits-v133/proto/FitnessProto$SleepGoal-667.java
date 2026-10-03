package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.pi7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProto$SleepGoal extends GeneratedMessageLite<FitnessProto$SleepGoal, Builder> implements FitnessProto$SleepGoalOrBuilder {
    private static final FitnessProto$SleepGoal DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$SleepGoal> PARSER = null;
    public static final int SLEEPGOALTIME_FIELD_NUMBER = 1;
    private int sleepGoalTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepGoal, Builder> implements FitnessProto$SleepGoalOrBuilder {
        public Builder clearSleepGoalTime() {
            copyOnWrite();
            ((FitnessProto$SleepGoal) ((GeneratedMessageLite.Builder) this).instance).clearSleepGoalTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepGoalOrBuilder
        public int getSleepGoalTime() {
            return ((FitnessProto$SleepGoal) ((GeneratedMessageLite.Builder) this).instance).getSleepGoalTime();
        }

        public Builder setSleepGoalTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepGoal) ((GeneratedMessageLite.Builder) this).instance).setSleepGoalTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepGoal.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SleepGoal fitnessProto$SleepGoal = new FitnessProto$SleepGoal();
        DEFAULT_INSTANCE = fitnessProto$SleepGoal;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepGoal.class, fitnessProto$SleepGoal);
    }

    private FitnessProto$SleepGoal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepGoalTime() {
        this.sleepGoalTime_ = 0;
    }

    public static FitnessProto$SleepGoal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepGoal parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepGoal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepGoal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepGoalTime(int i) {
        this.sleepGoalTime_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pi7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepGoal();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"sleepGoalTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepGoal.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepGoalOrBuilder
    public int getSleepGoalTime() {
        return this.sleepGoalTime_;
    }

    public static Builder newBuilder(FitnessProto$SleepGoal fitnessProto$SleepGoal) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepGoal);
    }

    public static FitnessProto$SleepGoal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepGoal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepGoal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SleepGoal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepGoal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepGoal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepGoal parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepGoal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepGoal parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepGoal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}