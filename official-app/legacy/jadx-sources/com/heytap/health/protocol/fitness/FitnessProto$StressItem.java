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
public final class FitnessProto$StressItem extends GeneratedMessageLite<FitnessProto$StressItem, Builder> implements FitnessProto$StressItemOrBuilder {
    private static final FitnessProto$StressItem DEFAULT_INSTANCE;
    public static final int MINUTE_OFFSET_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$StressItem> PARSER = null;
    public static final int RELIABILITY_FIELD_NUMBER = 3;
    public static final int RMSSD_FIELD_NUMBER = 6;
    public static final int SDNN_FIELD_NUMBER = 5;
    public static final int STRESS_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int minuteOffset_;
    private int reliability_;
    private int rmssd_;
    private int sdnn_;
    private int stress_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$StressItem, Builder> implements FitnessProto$StressItemOrBuilder {
        public Builder clearMinuteOffset() {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).clearMinuteOffset();
            return this;
        }

        public Builder clearReliability() {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).clearReliability();
            return this;
        }

        public Builder clearRmssd() {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).clearRmssd();
            return this;
        }

        public Builder clearSdnn() {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).clearSdnn();
            return this;
        }

        public Builder clearStress() {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).clearStress();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
        public int getMinuteOffset() {
            return ((FitnessProto$StressItem) this.instance).getMinuteOffset();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
        public int getReliability() {
            return ((FitnessProto$StressItem) this.instance).getReliability();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
        public int getRmssd() {
            return ((FitnessProto$StressItem) this.instance).getRmssd();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
        public int getSdnn() {
            return ((FitnessProto$StressItem) this.instance).getSdnn();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
        public int getStress() {
            return ((FitnessProto$StressItem) this.instance).getStress();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
        public int getType() {
            return ((FitnessProto$StressItem) this.instance).getType();
        }

        public Builder setMinuteOffset(int i) {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).setMinuteOffset(i);
            return this;
        }

        public Builder setReliability(int i) {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).setReliability(i);
            return this;
        }

        public Builder setRmssd(int i) {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).setRmssd(i);
            return this;
        }

        public Builder setSdnn(int i) {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).setSdnn(i);
            return this;
        }

        public Builder setStress(int i) {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).setStress(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProto$StressItem) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$StressItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$StressItem fitnessProto$StressItem = new FitnessProto$StressItem();
        DEFAULT_INSTANCE = fitnessProto$StressItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$StressItem.class, fitnessProto$StressItem);
    }

    private FitnessProto$StressItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteOffset() {
        this.minuteOffset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReliability() {
        this.reliability_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRmssd() {
        this.rmssd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdnn() {
        this.sdnn_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStress() {
        this.stress_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FitnessProto$StressItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$StressItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$StressItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$StressItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteOffset(int i) {
        this.minuteOffset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReliability(int i) {
        this.reliability_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRmssd(int i) {
        this.rmssd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdnn(int i) {
        this.sdnn_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStress(int i) {
        this.stress_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$StressItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b", new Object[]{"minuteOffset_", "stress_", "reliability_", "type_", "sdnn_", "rmssd_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$StressItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$StressItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
    public int getMinuteOffset() {
        return this.minuteOffset_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
    public int getReliability() {
        return this.reliability_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
    public int getRmssd() {
        return this.rmssd_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
    public int getSdnn() {
        return this.sdnn_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
    public int getStress() {
        return this.stress_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressItemOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(FitnessProto$StressItem fitnessProto$StressItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$StressItem);
    }

    public static FitnessProto$StressItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$StressItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$StressItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$StressItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$StressItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$StressItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$StressItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$StressItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$StressItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$StressItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StressItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
