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
public final class FitnessProto$HeartRateZone extends GeneratedMessageLite<FitnessProto$HeartRateZone, Builder> implements FitnessProto$HeartRateZoneOrBuilder {
    private static final FitnessProto$HeartRateZone DEFAULT_INSTANCE;
    public static final int LOWER_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$HeartRateZone> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int UPPER_FIELD_NUMBER = 3;
    private int lower_;
    private int type_;
    private int upper_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$HeartRateZone, Builder> implements FitnessProto$HeartRateZoneOrBuilder {
        private Builder() {
            super(FitnessProto$HeartRateZone.DEFAULT_INSTANCE);
        }

        public Builder clearLower() {
            copyOnWrite();
            ((FitnessProto$HeartRateZone) this.instance).clearLower();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$HeartRateZone) this.instance).clearType();
            return this;
        }

        public Builder clearUpper() {
            copyOnWrite();
            ((FitnessProto$HeartRateZone) this.instance).clearUpper();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateZoneOrBuilder
        public int getLower() {
            return ((FitnessProto$HeartRateZone) this.instance).getLower();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateZoneOrBuilder
        public FitnessProto$HR_ZONES_TYPE getType() {
            return ((FitnessProto$HeartRateZone) this.instance).getType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateZoneOrBuilder
        public int getTypeValue() {
            return ((FitnessProto$HeartRateZone) this.instance).getTypeValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateZoneOrBuilder
        public int getUpper() {
            return ((FitnessProto$HeartRateZone) this.instance).getUpper();
        }

        public Builder setLower(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateZone) this.instance).setLower(i);
            return this;
        }

        public Builder setType(FitnessProto$HR_ZONES_TYPE fitnessProto$HR_ZONES_TYPE) {
            copyOnWrite();
            ((FitnessProto$HeartRateZone) this.instance).setType(fitnessProto$HR_ZONES_TYPE);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateZone) this.instance).setTypeValue(i);
            return this;
        }

        public Builder setUpper(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateZone) this.instance).setUpper(i);
            return this;
        }
    }

    static {
        FitnessProto$HeartRateZone fitnessProto$HeartRateZone = new FitnessProto$HeartRateZone();
        DEFAULT_INSTANCE = fitnessProto$HeartRateZone;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$HeartRateZone.class, fitnessProto$HeartRateZone);
    }

    private FitnessProto$HeartRateZone() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLower() {
        this.lower_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpper() {
        this.upper_ = 0;
    }

    public static FitnessProto$HeartRateZone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$HeartRateZone parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateZone parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$HeartRateZone> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLower(int i) {
        this.lower_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(FitnessProto$HR_ZONES_TYPE fitnessProto$HR_ZONES_TYPE) {
        this.type_ = fitnessProto$HR_ZONES_TYPE.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpper(int i) {
        this.upper_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$HeartRateZone();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\u000b", new Object[]{"type_", "lower_", "upper_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$HeartRateZone> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$HeartRateZone.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateZoneOrBuilder
    public int getLower() {
        return this.lower_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateZoneOrBuilder
    public FitnessProto$HR_ZONES_TYPE getType() {
        FitnessProto$HR_ZONES_TYPE fitnessProto$HR_ZONES_TYPEForNumber = FitnessProto$HR_ZONES_TYPE.forNumber(this.type_);
        return fitnessProto$HR_ZONES_TYPEForNumber == null ? FitnessProto$HR_ZONES_TYPE.UNRECOGNIZED : fitnessProto$HR_ZONES_TYPEForNumber;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateZoneOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateZoneOrBuilder
    public int getUpper() {
        return this.upper_;
    }

    public static Builder newBuilder(FitnessProto$HeartRateZone fitnessProto$HeartRateZone) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$HeartRateZone);
    }

    public static FitnessProto$HeartRateZone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateZone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateZone parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$HeartRateZone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateZone parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateZone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateZone parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$HeartRateZone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateZone parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$HeartRateZone parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
