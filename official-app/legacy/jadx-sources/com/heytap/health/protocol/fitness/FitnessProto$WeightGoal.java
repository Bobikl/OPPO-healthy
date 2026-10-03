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
public final class FitnessProto$WeightGoal extends GeneratedMessageLite<FitnessProto$WeightGoal, Builder> implements FitnessProto$WeightGoalOrBuilder {
    private static final FitnessProto$WeightGoal DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$WeightGoal> PARSER = null;
    public static final int WEIGHT_FIELD_NUMBER = 1;
    private int weight_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$WeightGoal, Builder> implements FitnessProto$WeightGoalOrBuilder {
        public Builder clearWeight() {
            copyOnWrite();
            ((FitnessProto$WeightGoal) this.instance).clearWeight();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WeightGoalOrBuilder
        public int getWeight() {
            return ((FitnessProto$WeightGoal) this.instance).getWeight();
        }

        public Builder setWeight(int i) {
            copyOnWrite();
            ((FitnessProto$WeightGoal) this.instance).setWeight(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$WeightGoal.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$WeightGoal fitnessProto$WeightGoal = new FitnessProto$WeightGoal();
        DEFAULT_INSTANCE = fitnessProto$WeightGoal;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$WeightGoal.class, fitnessProto$WeightGoal);
    }

    private FitnessProto$WeightGoal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeight() {
        this.weight_ = 0;
    }

    public static FitnessProto$WeightGoal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$WeightGoal parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WeightGoal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$WeightGoal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(int i) {
        this.weight_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$WeightGoal();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"weight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$WeightGoal> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$WeightGoal.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WeightGoalOrBuilder
    public int getWeight() {
        return this.weight_;
    }

    public static Builder newBuilder(FitnessProto$WeightGoal fitnessProto$WeightGoal) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$WeightGoal);
    }

    public static FitnessProto$WeightGoal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WeightGoal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$WeightGoal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$WeightGoal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$WeightGoal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$WeightGoal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$WeightGoal parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WeightGoal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WeightGoal parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$WeightGoal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WeightGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
