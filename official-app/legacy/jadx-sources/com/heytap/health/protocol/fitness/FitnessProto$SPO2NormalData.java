package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$SPO2NormalData extends GeneratedMessageLite<FitnessProto$SPO2NormalData, Builder> implements FitnessProto$SPO2NormalDataOrBuilder {
    private static final FitnessProto$SPO2NormalData DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$SPO2NormalData> PARSER = null;
    public static final int RELIABILITY_FIELD_NUMBER = 3;
    public static final int SECOND_OFFSET_FIELD_NUMBER = 1;
    public static final int SPO2_FIELD_NUMBER = 2;
    private ByteString reliability_;
    private int secondOffsetMemoizedSerializedSize = -1;
    private Internal.IntList secondOffset_ = GeneratedMessageLite.emptyIntList();
    private ByteString spo2_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SPO2NormalData, Builder> implements FitnessProto$SPO2NormalDataOrBuilder {
        public Builder addAllSecondOffset(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProto$SPO2NormalData) this.instance).addAllSecondOffset(iterable);
            return this;
        }

        public Builder addSecondOffset(int i) {
            copyOnWrite();
            ((FitnessProto$SPO2NormalData) this.instance).addSecondOffset(i);
            return this;
        }

        public Builder clearReliability() {
            copyOnWrite();
            ((FitnessProto$SPO2NormalData) this.instance).clearReliability();
            return this;
        }

        public Builder clearSecondOffset() {
            copyOnWrite();
            ((FitnessProto$SPO2NormalData) this.instance).clearSecondOffset();
            return this;
        }

        public Builder clearSpo2() {
            copyOnWrite();
            ((FitnessProto$SPO2NormalData) this.instance).clearSpo2();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
        public ByteString getReliability() {
            return ((FitnessProto$SPO2NormalData) this.instance).getReliability();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
        public int getSecondOffset(int i) {
            return ((FitnessProto$SPO2NormalData) this.instance).getSecondOffset(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
        public int getSecondOffsetCount() {
            return ((FitnessProto$SPO2NormalData) this.instance).getSecondOffsetCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
        public List<Integer> getSecondOffsetList() {
            return Collections.unmodifiableList(((FitnessProto$SPO2NormalData) this.instance).getSecondOffsetList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
        public ByteString getSpo2() {
            return ((FitnessProto$SPO2NormalData) this.instance).getSpo2();
        }

        public Builder setReliability(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SPO2NormalData) this.instance).setReliability(byteString);
            return this;
        }

        public Builder setSecondOffset(int i, int i2) {
            copyOnWrite();
            ((FitnessProto$SPO2NormalData) this.instance).setSecondOffset(i, i2);
            return this;
        }

        public Builder setSpo2(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SPO2NormalData) this.instance).setSpo2(byteString);
            return this;
        }

        private Builder() {
            super(FitnessProto$SPO2NormalData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SPO2NormalData fitnessProto$SPO2NormalData = new FitnessProto$SPO2NormalData();
        DEFAULT_INSTANCE = fitnessProto$SPO2NormalData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SPO2NormalData.class, fitnessProto$SPO2NormalData);
    }

    private FitnessProto$SPO2NormalData() {
        ByteString byteString = ByteString.EMPTY;
        this.spo2_ = byteString;
        this.reliability_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSecondOffset(Iterable<? extends Integer> iterable) {
        ensureSecondOffsetIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.secondOffset_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSecondOffset(int i) {
        ensureSecondOffsetIsMutable();
        this.secondOffset_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReliability() {
        this.reliability_ = getDefaultInstance().getReliability();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondOffset() {
        this.secondOffset_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2() {
        this.spo2_ = getDefaultInstance().getSpo2();
    }

    private void ensureSecondOffsetIsMutable() {
        Internal.IntList intList = this.secondOffset_;
        if (intList.isModifiable()) {
            return;
        }
        this.secondOffset_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static FitnessProto$SPO2NormalData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SPO2NormalData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SPO2NormalData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SPO2NormalData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReliability(ByteString byteString) {
        byteString.getClass();
        this.reliability_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondOffset(int i, int i2) {
        ensureSecondOffsetIsMutable();
        this.secondOffset_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2(ByteString byteString) {
        byteString.getClass();
        this.spo2_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SPO2NormalData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001+\u0002\n\u0003\n", new Object[]{"secondOffset_", "spo2_", "reliability_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SPO2NormalData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SPO2NormalData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
    public ByteString getReliability() {
        return this.reliability_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
    public int getSecondOffset(int i) {
        return this.secondOffset_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
    public int getSecondOffsetCount() {
        return this.secondOffset_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
    public List<Integer> getSecondOffsetList() {
        return this.secondOffset_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SPO2NormalDataOrBuilder
    public ByteString getSpo2() {
        return this.spo2_;
    }

    public static Builder newBuilder(FitnessProto$SPO2NormalData fitnessProto$SPO2NormalData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SPO2NormalData);
    }

    public static FitnessProto$SPO2NormalData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SPO2NormalData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SPO2NormalData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SPO2NormalData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SPO2NormalData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SPO2NormalData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SPO2NormalData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SPO2NormalData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SPO2NormalData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SPO2NormalData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SPO2NormalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
