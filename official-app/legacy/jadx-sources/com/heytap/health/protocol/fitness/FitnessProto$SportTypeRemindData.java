package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
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
public final class FitnessProto$SportTypeRemindData extends GeneratedMessageLite<FitnessProto$SportTypeRemindData, Builder> implements FitnessProto$SportTypeRemindDataOrBuilder {
    private static final FitnessProto$SportTypeRemindData DEFAULT_INSTANCE;
    public static final int INTERVALDATA_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProto$SportTypeRemindData> PARSER = null;
    public static final int SPORTNAME_FIELD_NUMBER = 1;
    public static final int SPORTTYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private FitnessProto$IntervalData intervalData_;
    private String sportName_ = "";
    private int sportType_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SportTypeRemindData, Builder> implements FitnessProto$SportTypeRemindDataOrBuilder {
        private Builder() {
            super(FitnessProto$SportTypeRemindData.DEFAULT_INSTANCE);
        }

        public Builder clearIntervalData() {
            copyOnWrite();
            ((FitnessProto$SportTypeRemindData) this.instance).clearIntervalData();
            return this;
        }

        public Builder clearSportName() {
            copyOnWrite();
            ((FitnessProto$SportTypeRemindData) this.instance).clearSportName();
            return this;
        }

        public Builder clearSportType() {
            copyOnWrite();
            ((FitnessProto$SportTypeRemindData) this.instance).clearSportType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
        public FitnessProto$IntervalData getIntervalData() {
            return ((FitnessProto$SportTypeRemindData) this.instance).getIntervalData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
        public String getSportName() {
            return ((FitnessProto$SportTypeRemindData) this.instance).getSportName();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
        public ByteString getSportNameBytes() {
            return ((FitnessProto$SportTypeRemindData) this.instance).getSportNameBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
        public int getSportType() {
            return ((FitnessProto$SportTypeRemindData) this.instance).getSportType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
        public boolean hasIntervalData() {
            return ((FitnessProto$SportTypeRemindData) this.instance).hasIntervalData();
        }

        public Builder mergeIntervalData(FitnessProto$IntervalData fitnessProto$IntervalData) {
            copyOnWrite();
            ((FitnessProto$SportTypeRemindData) this.instance).mergeIntervalData(fitnessProto$IntervalData);
            return this;
        }

        public Builder setIntervalData(FitnessProto$IntervalData.Builder builder) {
            copyOnWrite();
            ((FitnessProto$SportTypeRemindData) this.instance).setIntervalData(builder.build());
            return this;
        }

        public Builder setSportName(String str) {
            copyOnWrite();
            ((FitnessProto$SportTypeRemindData) this.instance).setSportName(str);
            return this;
        }

        public Builder setSportNameBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SportTypeRemindData) this.instance).setSportNameBytes(byteString);
            return this;
        }

        public Builder setSportType(int i) {
            copyOnWrite();
            ((FitnessProto$SportTypeRemindData) this.instance).setSportType(i);
            return this;
        }

        public Builder setIntervalData(FitnessProto$IntervalData fitnessProto$IntervalData) {
            copyOnWrite();
            ((FitnessProto$SportTypeRemindData) this.instance).setIntervalData(fitnessProto$IntervalData);
            return this;
        }
    }

    static {
        FitnessProto$SportTypeRemindData fitnessProto$SportTypeRemindData = new FitnessProto$SportTypeRemindData();
        DEFAULT_INSTANCE = fitnessProto$SportTypeRemindData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SportTypeRemindData.class, fitnessProto$SportTypeRemindData);
    }

    private FitnessProto$SportTypeRemindData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntervalData() {
        this.intervalData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportName() {
        this.sportName_ = getDefaultInstance().getSportName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportType() {
        this.sportType_ = 0;
    }

    public static FitnessProto$SportTypeRemindData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntervalData(FitnessProto$IntervalData fitnessProto$IntervalData) {
        fitnessProto$IntervalData.getClass();
        FitnessProto$IntervalData fitnessProto$IntervalData2 = this.intervalData_;
        if (fitnessProto$IntervalData2 != null && fitnessProto$IntervalData2 != FitnessProto$IntervalData.getDefaultInstance()) {
            fitnessProto$IntervalData = FitnessProto$IntervalData.newBuilder(this.intervalData_).mergeFrom(fitnessProto$IntervalData).buildPartial();
        }
        this.intervalData_ = fitnessProto$IntervalData;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SportTypeRemindData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$SportTypeRemindData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntervalData(FitnessProto$IntervalData fitnessProto$IntervalData) {
        fitnessProto$IntervalData.getClass();
        this.intervalData_ = fitnessProto$IntervalData;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportName(String str) {
        str.getClass();
        this.sportName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sportName_ = byteString.toStringUtf8();
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
                return new FitnessProto$SportTypeRemindData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003ဉ\u0000", new Object[]{"bitField0_", "sportName_", "sportType_", "intervalData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SportTypeRemindData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SportTypeRemindData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
    public FitnessProto$IntervalData getIntervalData() {
        FitnessProto$IntervalData fitnessProto$IntervalData = this.intervalData_;
        return fitnessProto$IntervalData == null ? FitnessProto$IntervalData.getDefaultInstance() : fitnessProto$IntervalData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
    public String getSportName() {
        return this.sportName_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
    public ByteString getSportNameBytes() {
        return ByteString.copyFromUtf8(this.sportName_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
    public int getSportType() {
        return this.sportType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportTypeRemindDataOrBuilder
    public boolean hasIntervalData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(FitnessProto$SportTypeRemindData fitnessProto$SportTypeRemindData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SportTypeRemindData);
    }

    public static FitnessProto$SportTypeRemindData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SportTypeRemindData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SportTypeRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
