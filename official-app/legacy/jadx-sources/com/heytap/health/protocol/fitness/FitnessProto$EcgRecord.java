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
public final class FitnessProto$EcgRecord extends GeneratedMessageLite<FitnessProto$EcgRecord, Builder> implements FitnessProto$EcgRecordOrBuilder {
    public static final int AVG_HEART_RATE_FIELD_NUMBER = 6;
    private static final FitnessProto$EcgRecord DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int ECG_FIELD_NUMBER = 7;
    public static final int ECG_ID_FIELD_NUMBER = 1;
    public static final int FREQUENCY_FIELD_NUMBER = 5;
    private static volatile Parser<FitnessProto$EcgRecord> PARSER = null;
    public static final int TIME_BEGIN_FIELD_NUMBER = 2;
    public static final int TIME_END_FIELD_NUMBER = 3;
    private int avgHeartRate_;
    private int duration_;
    private int frequency_;
    private int timeBegin_;
    private int timeEnd_;
    private int ecgMemoizedSerializedSize = -1;
    private String ecgId_ = "";
    private Internal.IntList ecg_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$EcgRecord, Builder> implements FitnessProto$EcgRecordOrBuilder {
        public Builder addAllEcg(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).addAllEcg(iterable);
            return this;
        }

        public Builder addEcg(int i) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).addEcg(i);
            return this;
        }

        public Builder clearAvgHeartRate() {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).clearAvgHeartRate();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).clearDuration();
            return this;
        }

        public Builder clearEcg() {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).clearEcg();
            return this;
        }

        public Builder clearEcgId() {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).clearEcgId();
            return this;
        }

        public Builder clearFrequency() {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).clearFrequency();
            return this;
        }

        public Builder clearTimeBegin() {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).clearTimeBegin();
            return this;
        }

        public Builder clearTimeEnd() {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).clearTimeEnd();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public int getAvgHeartRate() {
            return ((FitnessProto$EcgRecord) this.instance).getAvgHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public int getDuration() {
            return ((FitnessProto$EcgRecord) this.instance).getDuration();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public int getEcg(int i) {
            return ((FitnessProto$EcgRecord) this.instance).getEcg(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public int getEcgCount() {
            return ((FitnessProto$EcgRecord) this.instance).getEcgCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public String getEcgId() {
            return ((FitnessProto$EcgRecord) this.instance).getEcgId();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public ByteString getEcgIdBytes() {
            return ((FitnessProto$EcgRecord) this.instance).getEcgIdBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public List<Integer> getEcgList() {
            return Collections.unmodifiableList(((FitnessProto$EcgRecord) this.instance).getEcgList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public int getFrequency() {
            return ((FitnessProto$EcgRecord) this.instance).getFrequency();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public int getTimeBegin() {
            return ((FitnessProto$EcgRecord) this.instance).getTimeBegin();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
        public int getTimeEnd() {
            return ((FitnessProto$EcgRecord) this.instance).getTimeEnd();
        }

        public Builder setAvgHeartRate(int i) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).setAvgHeartRate(i);
            return this;
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).setDuration(i);
            return this;
        }

        public Builder setEcg(int i, int i2) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).setEcg(i, i2);
            return this;
        }

        public Builder setEcgId(String str) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).setEcgId(str);
            return this;
        }

        public Builder setEcgIdBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).setEcgIdBytes(byteString);
            return this;
        }

        public Builder setFrequency(int i) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).setFrequency(i);
            return this;
        }

        public Builder setTimeBegin(int i) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).setTimeBegin(i);
            return this;
        }

        public Builder setTimeEnd(int i) {
            copyOnWrite();
            ((FitnessProto$EcgRecord) this.instance).setTimeEnd(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$EcgRecord.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$EcgRecord fitnessProto$EcgRecord = new FitnessProto$EcgRecord();
        DEFAULT_INSTANCE = fitnessProto$EcgRecord;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$EcgRecord.class, fitnessProto$EcgRecord);
    }

    private FitnessProto$EcgRecord() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEcg(Iterable<? extends Integer> iterable) {
        ensureEcgIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.ecg_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEcg(int i) {
        ensureEcgIsMutable();
        this.ecg_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgHeartRate() {
        this.avgHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcg() {
        this.ecg_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcgId() {
        this.ecgId_ = getDefaultInstance().getEcgId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrequency() {
        this.frequency_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeBegin() {
        this.timeBegin_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeEnd() {
        this.timeEnd_ = 0;
    }

    private void ensureEcgIsMutable() {
        Internal.IntList intList = this.ecg_;
        if (intList.isModifiable()) {
            return;
        }
        this.ecg_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static FitnessProto$EcgRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$EcgRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$EcgRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$EcgRecord> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgHeartRate(int i) {
        this.avgHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcg(int i, int i2) {
        ensureEcgIsMutable();
        this.ecg_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcgId(String str) {
        str.getClass();
        this.ecgId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcgIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ecgId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrequency(int i) {
        this.frequency_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeBegin(int i) {
        this.timeBegin_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeEnd(int i) {
        this.timeEnd_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$EcgRecord();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007+", new Object[]{"ecgId_", "timeBegin_", "timeEnd_", "duration_", "frequency_", "avgHeartRate_", "ecg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$EcgRecord> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$EcgRecord.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public int getAvgHeartRate() {
        return this.avgHeartRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public int getEcg(int i) {
        return this.ecg_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public int getEcgCount() {
        return this.ecg_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public String getEcgId() {
        return this.ecgId_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public ByteString getEcgIdBytes() {
        return ByteString.copyFromUtf8(this.ecgId_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public List<Integer> getEcgList() {
        return this.ecg_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public int getFrequency() {
        return this.frequency_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public int getTimeBegin() {
        return this.timeBegin_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgRecordOrBuilder
    public int getTimeEnd() {
        return this.timeEnd_;
    }

    public static Builder newBuilder(FitnessProto$EcgRecord fitnessProto$EcgRecord) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$EcgRecord);
    }

    public static FitnessProto$EcgRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$EcgRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$EcgRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$EcgRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$EcgRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$EcgRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$EcgRecord parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$EcgRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$EcgRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$EcgRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$EcgRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
