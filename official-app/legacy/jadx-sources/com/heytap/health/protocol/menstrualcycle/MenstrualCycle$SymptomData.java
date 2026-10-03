package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.rsb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class MenstrualCycle$SymptomData extends GeneratedMessageLite<MenstrualCycle$SymptomData, Builder> implements MenstrualCycle$SymptomDataOrBuilder {
    public static final int CURSYNCTIME_FIELD_NUMBER = 2;
    private static final MenstrualCycle$SymptomData DEFAULT_INSTANCE;
    public static final int HASMORE_FIELD_NUMBER = 1;
    private static volatile Parser<MenstrualCycle$SymptomData> PARSER = null;
    public static final int SYMPTOM_FIELD_NUMBER = 3;
    private int curSyncTime_;
    private boolean hasMore_;
    private Internal.ProtobufList<MenstrualCycle$SymptomPerDay> symptom_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$SymptomData, Builder> implements MenstrualCycle$SymptomDataOrBuilder {
        public Builder addAllSymptom(Iterable<? extends MenstrualCycle$SymptomPerDay> iterable) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).addAllSymptom(iterable);
            return this;
        }

        public Builder addSymptom(MenstrualCycle$SymptomPerDay menstrualCycle$SymptomPerDay) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).addSymptom(menstrualCycle$SymptomPerDay);
            return this;
        }

        public Builder clearCurSyncTime() {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).clearCurSyncTime();
            return this;
        }

        public Builder clearHasMore() {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).clearHasMore();
            return this;
        }

        public Builder clearSymptom() {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).clearSymptom();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
        public int getCurSyncTime() {
            return ((MenstrualCycle$SymptomData) this.instance).getCurSyncTime();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
        public boolean getHasMore() {
            return ((MenstrualCycle$SymptomData) this.instance).getHasMore();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
        public MenstrualCycle$SymptomPerDay getSymptom(int i) {
            return ((MenstrualCycle$SymptomData) this.instance).getSymptom(i);
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
        public int getSymptomCount() {
            return ((MenstrualCycle$SymptomData) this.instance).getSymptomCount();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
        public List<MenstrualCycle$SymptomPerDay> getSymptomList() {
            return Collections.unmodifiableList(((MenstrualCycle$SymptomData) this.instance).getSymptomList());
        }

        public Builder removeSymptom(int i) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).removeSymptom(i);
            return this;
        }

        public Builder setCurSyncTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).setCurSyncTime(i);
            return this;
        }

        public Builder setHasMore(boolean z) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).setHasMore(z);
            return this;
        }

        public Builder setSymptom(int i, MenstrualCycle$SymptomPerDay menstrualCycle$SymptomPerDay) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).setSymptom(i, menstrualCycle$SymptomPerDay);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$SymptomData.DEFAULT_INSTANCE);
        }

        public Builder addSymptom(int i, MenstrualCycle$SymptomPerDay menstrualCycle$SymptomPerDay) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).addSymptom(i, menstrualCycle$SymptomPerDay);
            return this;
        }

        public Builder setSymptom(int i, MenstrualCycle$SymptomPerDay.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).setSymptom(i, builder.build());
            return this;
        }

        public Builder addSymptom(MenstrualCycle$SymptomPerDay.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).addSymptom(builder.build());
            return this;
        }

        public Builder addSymptom(int i, MenstrualCycle$SymptomPerDay.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$SymptomData) this.instance).addSymptom(i, builder.build());
            return this;
        }
    }

    static {
        MenstrualCycle$SymptomData menstrualCycle$SymptomData = new MenstrualCycle$SymptomData();
        DEFAULT_INSTANCE = menstrualCycle$SymptomData;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$SymptomData.class, menstrualCycle$SymptomData);
    }

    private MenstrualCycle$SymptomData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSymptom(Iterable<? extends MenstrualCycle$SymptomPerDay> iterable) {
        ensureSymptomIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.symptom_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSymptom(MenstrualCycle$SymptomPerDay menstrualCycle$SymptomPerDay) {
        menstrualCycle$SymptomPerDay.getClass();
        ensureSymptomIsMutable();
        this.symptom_.add(menstrualCycle$SymptomPerDay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurSyncTime() {
        this.curSyncTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasMore() {
        this.hasMore_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymptom() {
        this.symptom_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSymptomIsMutable() {
        Internal.ProtobufList<MenstrualCycle$SymptomPerDay> protobufList = this.symptom_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.symptom_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MenstrualCycle$SymptomData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$SymptomData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SymptomData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$SymptomData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSymptom(int i) {
        ensureSymptomIsMutable();
        this.symptom_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurSyncTime(int i) {
        this.curSyncTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMore(boolean z) {
        this.hasMore_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSymptom(int i, MenstrualCycle$SymptomPerDay menstrualCycle$SymptomPerDay) {
        menstrualCycle$SymptomPerDay.getClass();
        ensureSymptomIsMutable();
        this.symptom_.set(i, menstrualCycle$SymptomPerDay);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$SymptomData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0007\u0002\u000b\u0003\u001b", new Object[]{"hasMore_", "curSyncTime_", "symptom_", MenstrualCycle$SymptomPerDay.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$SymptomData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$SymptomData.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
    public int getCurSyncTime() {
        return this.curSyncTime_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
    public boolean getHasMore() {
        return this.hasMore_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
    public MenstrualCycle$SymptomPerDay getSymptom(int i) {
        return this.symptom_.get(i);
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
    public int getSymptomCount() {
        return this.symptom_.size();
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomDataOrBuilder
    public List<MenstrualCycle$SymptomPerDay> getSymptomList() {
        return this.symptom_;
    }

    public MenstrualCycle$SymptomPerDayOrBuilder getSymptomOrBuilder(int i) {
        return this.symptom_.get(i);
    }

    public List<? extends MenstrualCycle$SymptomPerDayOrBuilder> getSymptomOrBuilderList() {
        return this.symptom_;
    }

    public static Builder newBuilder(MenstrualCycle$SymptomData menstrualCycle$SymptomData) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$SymptomData);
    }

    public static MenstrualCycle$SymptomData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSymptom(int i, MenstrualCycle$SymptomPerDay menstrualCycle$SymptomPerDay) {
        menstrualCycle$SymptomPerDay.getClass();
        ensureSymptomIsMutable();
        this.symptom_.add(i, menstrualCycle$SymptomPerDay);
    }

    public static MenstrualCycle$SymptomData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$SymptomData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomData parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SymptomData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$SymptomData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
