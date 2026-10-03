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
public final class FitnessProto$AutoRecognizeSportType extends GeneratedMessageLite<FitnessProto$AutoRecognizeSportType, Builder> implements FitnessProto$AutoRecognizeSportTypeOrBuilder {
    private static final FitnessProto$AutoRecognizeSportType DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$AutoRecognizeSportType> PARSER = null;
    public static final int SPORT_ENABLE_FIELD_NUMBER = 2;
    public static final int SPORT_RECORD_TYPE_FIELD_NUMBER = 3;
    public static final int SPORT_TYPE_FIELD_NUMBER = 1;
    private int sportEnable_;
    private int sportRecordType_;
    private int sportType_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$AutoRecognizeSportType, Builder> implements FitnessProto$AutoRecognizeSportTypeOrBuilder {
        public Builder clearSportEnable() {
            copyOnWrite();
            ((FitnessProto$AutoRecognizeSportType) this.instance).clearSportEnable();
            return this;
        }

        public Builder clearSportRecordType() {
            copyOnWrite();
            ((FitnessProto$AutoRecognizeSportType) this.instance).clearSportRecordType();
            return this;
        }

        public Builder clearSportType() {
            copyOnWrite();
            ((FitnessProto$AutoRecognizeSportType) this.instance).clearSportType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AutoRecognizeSportTypeOrBuilder
        public int getSportEnable() {
            return ((FitnessProto$AutoRecognizeSportType) this.instance).getSportEnable();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AutoRecognizeSportTypeOrBuilder
        public int getSportRecordType() {
            return ((FitnessProto$AutoRecognizeSportType) this.instance).getSportRecordType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$AutoRecognizeSportTypeOrBuilder
        public int getSportType() {
            return ((FitnessProto$AutoRecognizeSportType) this.instance).getSportType();
        }

        public Builder setSportEnable(int i) {
            copyOnWrite();
            ((FitnessProto$AutoRecognizeSportType) this.instance).setSportEnable(i);
            return this;
        }

        public Builder setSportRecordType(int i) {
            copyOnWrite();
            ((FitnessProto$AutoRecognizeSportType) this.instance).setSportRecordType(i);
            return this;
        }

        public Builder setSportType(int i) {
            copyOnWrite();
            ((FitnessProto$AutoRecognizeSportType) this.instance).setSportType(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$AutoRecognizeSportType.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$AutoRecognizeSportType fitnessProto$AutoRecognizeSportType = new FitnessProto$AutoRecognizeSportType();
        DEFAULT_INSTANCE = fitnessProto$AutoRecognizeSportType;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$AutoRecognizeSportType.class, fitnessProto$AutoRecognizeSportType);
    }

    private FitnessProto$AutoRecognizeSportType() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportEnable() {
        this.sportEnable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportRecordType() {
        this.sportRecordType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportType() {
        this.sportType_ = 0;
    }

    public static FitnessProto$AutoRecognizeSportType getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$AutoRecognizeSportType parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$AutoRecognizeSportType> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportEnable(int i) {
        this.sportEnable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportRecordType(int i) {
        this.sportRecordType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportType(int i) {
        this.sportType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$AutoRecognizeSportType();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"sportType_", "sportEnable_", "sportRecordType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$AutoRecognizeSportType> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$AutoRecognizeSportType.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AutoRecognizeSportTypeOrBuilder
    public int getSportEnable() {
        return this.sportEnable_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AutoRecognizeSportTypeOrBuilder
    public int getSportRecordType() {
        return this.sportRecordType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$AutoRecognizeSportTypeOrBuilder
    public int getSportType() {
        return this.sportType_;
    }

    public static Builder newBuilder(FitnessProto$AutoRecognizeSportType fitnessProto$AutoRecognizeSportType) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$AutoRecognizeSportType);
    }

    public static FitnessProto$AutoRecognizeSportType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$AutoRecognizeSportType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$AutoRecognizeSportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
