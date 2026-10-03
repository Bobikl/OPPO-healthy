package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.rsb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class MenstrualCycle$PredictCycleData extends GeneratedMessageLite<MenstrualCycle$PredictCycleData, Builder> implements MenstrualCycle$PredictCycleDataOrBuilder {
    public static final int CYCLEENDDATE_FIELD_NUMBER = 2;
    public static final int CYCLEFIRSTDATE_FIELD_NUMBER = 1;
    private static final MenstrualCycle$PredictCycleData DEFAULT_INSTANCE;
    public static final int OVULABEGINDATE_FIELD_NUMBER = 4;
    public static final int OVULADATE_FIELD_NUMBER = 3;
    public static final int OVULAENDDATE_FIELD_NUMBER = 5;
    private static volatile Parser<MenstrualCycle$PredictCycleData> PARSER;
    private int cycleEndDate_;
    private int cycleFirstDate_;
    private int ovulaBeginDate_;
    private int ovulaDate_;
    private int ovulaEndDate_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$PredictCycleData, Builder> implements MenstrualCycle$PredictCycleDataOrBuilder {
        public Builder clearCycleEndDate() {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).clearCycleEndDate();
            return this;
        }

        public Builder clearCycleFirstDate() {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).clearCycleFirstDate();
            return this;
        }

        public Builder clearOvulaBeginDate() {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).clearOvulaBeginDate();
            return this;
        }

        public Builder clearOvulaDate() {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).clearOvulaDate();
            return this;
        }

        public Builder clearOvulaEndDate() {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).clearOvulaEndDate();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
        public int getCycleEndDate() {
            return ((MenstrualCycle$PredictCycleData) this.instance).getCycleEndDate();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
        public int getCycleFirstDate() {
            return ((MenstrualCycle$PredictCycleData) this.instance).getCycleFirstDate();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
        public int getOvulaBeginDate() {
            return ((MenstrualCycle$PredictCycleData) this.instance).getOvulaBeginDate();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
        public int getOvulaDate() {
            return ((MenstrualCycle$PredictCycleData) this.instance).getOvulaDate();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
        public int getOvulaEndDate() {
            return ((MenstrualCycle$PredictCycleData) this.instance).getOvulaEndDate();
        }

        public Builder setCycleEndDate(int i) {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).setCycleEndDate(i);
            return this;
        }

        public Builder setCycleFirstDate(int i) {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).setCycleFirstDate(i);
            return this;
        }

        public Builder setOvulaBeginDate(int i) {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).setOvulaBeginDate(i);
            return this;
        }

        public Builder setOvulaDate(int i) {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).setOvulaDate(i);
            return this;
        }

        public Builder setOvulaEndDate(int i) {
            copyOnWrite();
            ((MenstrualCycle$PredictCycleData) this.instance).setOvulaEndDate(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$PredictCycleData.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$PredictCycleData menstrualCycle$PredictCycleData = new MenstrualCycle$PredictCycleData();
        DEFAULT_INSTANCE = menstrualCycle$PredictCycleData;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$PredictCycleData.class, menstrualCycle$PredictCycleData);
    }

    private MenstrualCycle$PredictCycleData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCycleEndDate() {
        this.cycleEndDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCycleFirstDate() {
        this.cycleFirstDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOvulaBeginDate() {
        this.ovulaBeginDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOvulaDate() {
        this.ovulaDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOvulaEndDate() {
        this.ovulaEndDate_ = 0;
    }

    public static MenstrualCycle$PredictCycleData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$PredictCycleData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$PredictCycleData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCycleEndDate(int i) {
        this.cycleEndDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCycleFirstDate(int i) {
        this.cycleFirstDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOvulaBeginDate(int i) {
        this.ovulaBeginDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOvulaDate(int i) {
        this.ovulaDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOvulaEndDate(int i) {
        this.ovulaEndDate_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$PredictCycleData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"cycleFirstDate_", "cycleEndDate_", "ovulaDate_", "ovulaBeginDate_", "ovulaEndDate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$PredictCycleData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$PredictCycleData.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
    public int getCycleEndDate() {
        return this.cycleEndDate_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
    public int getCycleFirstDate() {
        return this.cycleFirstDate_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
    public int getOvulaBeginDate() {
        return this.ovulaBeginDate_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
    public int getOvulaDate() {
        return this.ovulaDate_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PredictCycleDataOrBuilder
    public int getOvulaEndDate() {
        return this.ovulaEndDate_;
    }

    public static Builder newBuilder(MenstrualCycle$PredictCycleData menstrualCycle$PredictCycleData) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$PredictCycleData);
    }

    public static MenstrualCycle$PredictCycleData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$PredictCycleData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$PredictCycleData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
