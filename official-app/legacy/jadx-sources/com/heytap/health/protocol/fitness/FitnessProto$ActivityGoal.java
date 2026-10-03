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
public final class FitnessProto$ActivityGoal extends GeneratedMessageLite<FitnessProto$ActivityGoal, Builder> implements FitnessProto$ActivityGoalOrBuilder {
    public static final int ACTIVITY_GOAL_FIELD_NUMBER = 1;
    private static final FitnessProto$ActivityGoal DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$ActivityGoal> PARSER;
    private int activityGoal_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ActivityGoal, Builder> implements FitnessProto$ActivityGoalOrBuilder {
        public Builder clearActivityGoal() {
            copyOnWrite();
            ((FitnessProto$ActivityGoal) this.instance).clearActivityGoal();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityGoalOrBuilder
        public int getActivityGoal() {
            return ((FitnessProto$ActivityGoal) this.instance).getActivityGoal();
        }

        public Builder setActivityGoal(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityGoal) this.instance).setActivityGoal(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$ActivityGoal.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$ActivityGoal fitnessProto$ActivityGoal = new FitnessProto$ActivityGoal();
        DEFAULT_INSTANCE = fitnessProto$ActivityGoal;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ActivityGoal.class, fitnessProto$ActivityGoal);
    }

    private FitnessProto$ActivityGoal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityGoal() {
        this.activityGoal_ = 0;
    }

    public static FitnessProto$ActivityGoal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ActivityGoal parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ActivityGoal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$ActivityGoal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityGoal(int i) {
        this.activityGoal_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ActivityGoal();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"activityGoal_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$ActivityGoal> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ActivityGoal.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityGoalOrBuilder
    public int getActivityGoal() {
        return this.activityGoal_;
    }

    public static Builder newBuilder(FitnessProto$ActivityGoal fitnessProto$ActivityGoal) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$ActivityGoal);
    }

    public static FitnessProto$ActivityGoal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ActivityGoal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ActivityGoal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$ActivityGoal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ActivityGoal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ActivityGoal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$ActivityGoal parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ActivityGoal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ActivityGoal parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ActivityGoal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ActivityGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
