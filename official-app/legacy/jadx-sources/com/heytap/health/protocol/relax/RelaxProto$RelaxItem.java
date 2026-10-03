package com.heytap.health.protocol.relax;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.umf;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class RelaxProto$RelaxItem extends GeneratedMessageLite<RelaxProto$RelaxItem, Builder> implements RelaxProto$RelaxItemOrBuilder {
    private static final RelaxProto$RelaxItem DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int HEART_RATE_MAX_FIELD_NUMBER = 7;
    public static final int HEART_RATE_MIN_FIELD_NUMBER = 6;
    public static final int HEART_RATE_OFFSET_FIELD_NUMBER = 10;
    public static final int HEART_RATE_VALUES_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<RelaxProto$RelaxItem> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 4;
    public static final int STRESS_AVG_FIELD_NUMBER = 8;
    public static final int SUB_TYPE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int duration_;
    private int heartRateMax_;
    private int heartRateMin_;
    private int startTime_;
    private int stressAvg_;
    private int subType_;
    private int type_;
    private int heartRateOffsetMemoizedSerializedSize = -1;
    private String id_ = "";
    private ByteString heartRateValues_ = ByteString.EMPTY;
    private Internal.IntList heartRateOffset_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<RelaxProto$RelaxItem, Builder> implements RelaxProto$RelaxItemOrBuilder {
        public Builder addAllHeartRateOffset(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).addAllHeartRateOffset(iterable);
            return this;
        }

        public Builder addHeartRateOffset(int i) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).addHeartRateOffset(i);
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearDuration();
            return this;
        }

        public Builder clearHeartRateMax() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearHeartRateMax();
            return this;
        }

        public Builder clearHeartRateMin() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearHeartRateMin();
            return this;
        }

        public Builder clearHeartRateOffset() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearHeartRateOffset();
            return this;
        }

        public Builder clearHeartRateValues() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearHeartRateValues();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearId();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearStartTime();
            return this;
        }

        public Builder clearStressAvg() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearStressAvg();
            return this;
        }

        public Builder clearSubType() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearSubType();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public int getDuration() {
            return ((RelaxProto$RelaxItem) this.instance).getDuration();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public int getHeartRateMax() {
            return ((RelaxProto$RelaxItem) this.instance).getHeartRateMax();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public int getHeartRateMin() {
            return ((RelaxProto$RelaxItem) this.instance).getHeartRateMin();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public int getHeartRateOffset(int i) {
            return ((RelaxProto$RelaxItem) this.instance).getHeartRateOffset(i);
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public int getHeartRateOffsetCount() {
            return ((RelaxProto$RelaxItem) this.instance).getHeartRateOffsetCount();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public List<Integer> getHeartRateOffsetList() {
            return Collections.unmodifiableList(((RelaxProto$RelaxItem) this.instance).getHeartRateOffsetList());
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public ByteString getHeartRateValues() {
            return ((RelaxProto$RelaxItem) this.instance).getHeartRateValues();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public String getId() {
            return ((RelaxProto$RelaxItem) this.instance).getId();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public ByteString getIdBytes() {
            return ((RelaxProto$RelaxItem) this.instance).getIdBytes();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public int getStartTime() {
            return ((RelaxProto$RelaxItem) this.instance).getStartTime();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public int getStressAvg() {
            return ((RelaxProto$RelaxItem) this.instance).getStressAvg();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public int getSubType() {
            return ((RelaxProto$RelaxItem) this.instance).getSubType();
        }

        @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
        public int getType() {
            return ((RelaxProto$RelaxItem) this.instance).getType();
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setDuration(i);
            return this;
        }

        public Builder setHeartRateMax(int i) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setHeartRateMax(i);
            return this;
        }

        public Builder setHeartRateMin(int i) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setHeartRateMin(i);
            return this;
        }

        public Builder setHeartRateOffset(int i, int i2) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setHeartRateOffset(i, i2);
            return this;
        }

        public Builder setHeartRateValues(ByteString byteString) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setHeartRateValues(byteString);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setStartTime(i);
            return this;
        }

        public Builder setStressAvg(int i) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setStressAvg(i);
            return this;
        }

        public Builder setSubType(int i) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setSubType(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((RelaxProto$RelaxItem) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(RelaxProto$RelaxItem.DEFAULT_INSTANCE);
        }
    }

    static {
        RelaxProto$RelaxItem relaxProto$RelaxItem = new RelaxProto$RelaxItem();
        DEFAULT_INSTANCE = relaxProto$RelaxItem;
        GeneratedMessageLite.registerDefaultInstance(RelaxProto$RelaxItem.class, relaxProto$RelaxItem);
    }

    private RelaxProto$RelaxItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHeartRateOffset(Iterable<? extends Integer> iterable) {
        ensureHeartRateOffsetIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.heartRateOffset_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHeartRateOffset(int i) {
        ensureHeartRateOffsetIsMutable();
        this.heartRateOffset_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateMax() {
        this.heartRateMax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateMin() {
        this.heartRateMin_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateOffset() {
        this.heartRateOffset_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateValues() {
        this.heartRateValues_ = getDefaultInstance().getHeartRateValues();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStressAvg() {
        this.stressAvg_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubType() {
        this.subType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensureHeartRateOffsetIsMutable() {
        Internal.IntList intList = this.heartRateOffset_;
        if (intList.isModifiable()) {
            return;
        }
        this.heartRateOffset_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static RelaxProto$RelaxItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelaxProto$RelaxItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelaxProto$RelaxItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelaxProto$RelaxItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateMax(int i) {
        this.heartRateMax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateMin(int i) {
        this.heartRateMin_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateOffset(int i, int i2) {
        ensureHeartRateOffsetIsMutable();
        this.heartRateOffset_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateValues(ByteString byteString) {
        byteString.getClass();
        this.heartRateValues_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStressAvg(int i) {
        this.stressAvg_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubType(int i) {
        this.subType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = umf.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RelaxProto$RelaxItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\n\n'", new Object[]{"id_", "type_", "subType_", "startTime_", "duration_", "heartRateMin_", "heartRateMax_", "stressAvg_", "heartRateValues_", "heartRateOffset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelaxProto$RelaxItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RelaxProto$RelaxItem.class) {
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

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public int getHeartRateMax() {
        return this.heartRateMax_;
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public int getHeartRateMin() {
        return this.heartRateMin_;
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public int getHeartRateOffset(int i) {
        return this.heartRateOffset_.getInt(i);
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public int getHeartRateOffsetCount() {
        return this.heartRateOffset_.size();
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public List<Integer> getHeartRateOffsetList() {
        return this.heartRateOffset_;
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public ByteString getHeartRateValues() {
        return this.heartRateValues_;
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public int getStressAvg() {
        return this.stressAvg_;
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public int getSubType() {
        return this.subType_;
    }

    @Override // com.heytap.health.protocol.relax.RelaxProto$RelaxItemOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(RelaxProto$RelaxItem relaxProto$RelaxItem) {
        return DEFAULT_INSTANCE.createBuilder(relaxProto$RelaxItem);
    }

    public static RelaxProto$RelaxItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelaxProto$RelaxItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelaxProto$RelaxItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelaxProto$RelaxItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelaxProto$RelaxItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelaxProto$RelaxItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelaxProto$RelaxItem parseFrom(InputStream inputStream) throws IOException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelaxProto$RelaxItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelaxProto$RelaxItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelaxProto$RelaxItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelaxProto$RelaxItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
