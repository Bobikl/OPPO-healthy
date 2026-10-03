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
public final class FitnessProto$OsaResultWeek extends GeneratedMessageLite<FitnessProto$OsaResultWeek, Builder> implements FitnessProto$OsaResultWeekOrBuilder {
    private static final FitnessProto$OsaResultWeek DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$OsaResultWeek> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int level_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$OsaResultWeek, Builder> implements FitnessProto$OsaResultWeekOrBuilder {
        public Builder clearLevel() {
            copyOnWrite();
            ((FitnessProto$OsaResultWeek) this.instance).clearLevel();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$OsaResultWeek) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaResultWeekOrBuilder
        public int getLevel() {
            return ((FitnessProto$OsaResultWeek) this.instance).getLevel();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaResultWeekOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$OsaResultWeek) this.instance).getTimestamp();
        }

        public Builder setLevel(int i) {
            copyOnWrite();
            ((FitnessProto$OsaResultWeek) this.instance).setLevel(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$OsaResultWeek) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$OsaResultWeek.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$OsaResultWeek fitnessProto$OsaResultWeek = new FitnessProto$OsaResultWeek();
        DEFAULT_INSTANCE = fitnessProto$OsaResultWeek;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$OsaResultWeek.class, fitnessProto$OsaResultWeek);
    }

    private FitnessProto$OsaResultWeek() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static FitnessProto$OsaResultWeek getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$OsaResultWeek parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaResultWeek parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$OsaResultWeek> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(int i) {
        this.level_ = i;
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
                return new FitnessProto$OsaResultWeek();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0004", new Object[]{"timestamp_", "level_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$OsaResultWeek> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$OsaResultWeek.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaResultWeekOrBuilder
    public int getLevel() {
        return this.level_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaResultWeekOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProto$OsaResultWeek fitnessProto$OsaResultWeek) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$OsaResultWeek);
    }

    public static FitnessProto$OsaResultWeek parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaResultWeek parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$OsaResultWeek parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$OsaResultWeek parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$OsaResultWeek parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$OsaResultWeek parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$OsaResultWeek parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaResultWeek parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaResultWeek parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$OsaResultWeek parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaResultWeek) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
