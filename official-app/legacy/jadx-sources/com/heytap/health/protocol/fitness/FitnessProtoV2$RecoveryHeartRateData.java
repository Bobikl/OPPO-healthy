package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$RecoveryHeartRateData extends GeneratedMessageLite<FitnessProtoV2$RecoveryHeartRateData, Builder> implements FitnessProtoV2$RecoveryHeartRateDataOrBuilder {
    private static final FitnessProtoV2$RecoveryHeartRateData DEFAULT_INSTANCE;
    public static final int HEARTRATEVALUE_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProtoV2$RecoveryHeartRateData> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int timestampMemoizedSerializedSize = -1;
    private int heartRateValueMemoizedSerializedSize = -1;
    private Internal.LongList timestamp_ = GeneratedMessageLite.emptyLongList();
    private Internal.IntList heartRateValue_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$RecoveryHeartRateData, Builder> implements FitnessProtoV2$RecoveryHeartRateDataOrBuilder {
        public Builder addAllHeartRateValue(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$RecoveryHeartRateData) this.instance).addAllHeartRateValue(iterable);
            return this;
        }

        public Builder addAllTimestamp(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$RecoveryHeartRateData) this.instance).addAllTimestamp(iterable);
            return this;
        }

        public Builder addHeartRateValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$RecoveryHeartRateData) this.instance).addHeartRateValue(i);
            return this;
        }

        public Builder addTimestamp(long j2) {
            copyOnWrite();
            ((FitnessProtoV2$RecoveryHeartRateData) this.instance).addTimestamp(j2);
            return this;
        }

        public Builder clearHeartRateValue() {
            copyOnWrite();
            ((FitnessProtoV2$RecoveryHeartRateData) this.instance).clearHeartRateValue();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProtoV2$RecoveryHeartRateData) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
        public int getHeartRateValue(int i) {
            return ((FitnessProtoV2$RecoveryHeartRateData) this.instance).getHeartRateValue(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
        public int getHeartRateValueCount() {
            return ((FitnessProtoV2$RecoveryHeartRateData) this.instance).getHeartRateValueCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
        public List<Integer> getHeartRateValueList() {
            return Collections.unmodifiableList(((FitnessProtoV2$RecoveryHeartRateData) this.instance).getHeartRateValueList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
        public long getTimestamp(int i) {
            return ((FitnessProtoV2$RecoveryHeartRateData) this.instance).getTimestamp(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
        public int getTimestampCount() {
            return ((FitnessProtoV2$RecoveryHeartRateData) this.instance).getTimestampCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
        public List<Long> getTimestampList() {
            return Collections.unmodifiableList(((FitnessProtoV2$RecoveryHeartRateData) this.instance).getTimestampList());
        }

        public Builder setHeartRateValue(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$RecoveryHeartRateData) this.instance).setHeartRateValue(i, i2);
            return this;
        }

        public Builder setTimestamp(int i, long j2) {
            copyOnWrite();
            ((FitnessProtoV2$RecoveryHeartRateData) this.instance).setTimestamp(i, j2);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$RecoveryHeartRateData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$RecoveryHeartRateData fitnessProtoV2$RecoveryHeartRateData = new FitnessProtoV2$RecoveryHeartRateData();
        DEFAULT_INSTANCE = fitnessProtoV2$RecoveryHeartRateData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$RecoveryHeartRateData.class, fitnessProtoV2$RecoveryHeartRateData);
    }

    private FitnessProtoV2$RecoveryHeartRateData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHeartRateValue(Iterable<? extends Integer> iterable) {
        ensureHeartRateValueIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.heartRateValue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimestamp(Iterable<? extends Long> iterable) {
        ensureTimestampIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.timestamp_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHeartRateValue(int i) {
        ensureHeartRateValueIsMutable();
        this.heartRateValue_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimestamp(long j2) {
        ensureTimestampIsMutable();
        this.timestamp_.addLong(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateValue() {
        this.heartRateValue_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = GeneratedMessageLite.emptyLongList();
    }

    private void ensureHeartRateValueIsMutable() {
        Internal.IntList intList = this.heartRateValue_;
        if (intList.isModifiable()) {
            return;
        }
        this.heartRateValue_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureTimestampIsMutable() {
        Internal.LongList longList = this.timestamp_;
        if (longList.isModifiable()) {
            return;
        }
        this.timestamp_ = GeneratedMessageLite.mutableCopy(longList);
    }

    public static FitnessProtoV2$RecoveryHeartRateData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$RecoveryHeartRateData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateValue(int i, int i2) {
        ensureHeartRateValueIsMutable();
        this.heartRateValue_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i, long j2) {
        ensureTimestampIsMutable();
        this.timestamp_.setLong(i, j2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$RecoveryHeartRateData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001&\u0002+", new Object[]{"timestamp_", "heartRateValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$RecoveryHeartRateData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$RecoveryHeartRateData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
    public int getHeartRateValue(int i) {
        return this.heartRateValue_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
    public int getHeartRateValueCount() {
        return this.heartRateValue_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
    public List<Integer> getHeartRateValueList() {
        return this.heartRateValue_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
    public long getTimestamp(int i) {
        return this.timestamp_.getLong(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
    public int getTimestampCount() {
        return this.timestamp_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$RecoveryHeartRateDataOrBuilder
    public List<Long> getTimestampList() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProtoV2$RecoveryHeartRateData fitnessProtoV2$RecoveryHeartRateData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$RecoveryHeartRateData);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$RecoveryHeartRateData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$RecoveryHeartRateData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
