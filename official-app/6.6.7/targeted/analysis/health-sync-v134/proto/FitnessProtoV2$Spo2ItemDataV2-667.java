package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$Spo2ItemDataV2 extends GeneratedMessageLite<FitnessProtoV2$Spo2ItemDataV2, Builder> implements FitnessProtoV2$Spo2ItemDataV2OrBuilder {
    private static final FitnessProtoV2$Spo2ItemDataV2 DEFAULT_INSTANCE;
    public static final int MINUTE_OFFSET_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$Spo2ItemDataV2> PARSER = null;
    public static final int SPO2_RD_FIELD_NUMBER = 3;
    public static final int TYPE_SECOND_OFFSET_FIELD_NUMBER = 2;
    private int minuteOffset_;
    private ByteString spo2Rd_;
    private ByteString typeSecondOffset_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$Spo2ItemDataV2, Builder> implements FitnessProtoV2$Spo2ItemDataV2OrBuilder {
        public Builder clearMinuteOffset() {
            copyOnWrite();
            ((FitnessProtoV2$Spo2ItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearMinuteOffset();
            return this;
        }

        public Builder clearSpo2Rd() {
            copyOnWrite();
            ((FitnessProtoV2$Spo2ItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSpo2Rd();
            return this;
        }

        public Builder clearTypeSecondOffset() {
            copyOnWrite();
            ((FitnessProtoV2$Spo2ItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearTypeSecondOffset();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2ItemDataV2OrBuilder
        public int getMinuteOffset() {
            return ((FitnessProtoV2$Spo2ItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getMinuteOffset();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2ItemDataV2OrBuilder
        public ByteString getSpo2Rd() {
            return ((FitnessProtoV2$Spo2ItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSpo2Rd();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2ItemDataV2OrBuilder
        public ByteString getTypeSecondOffset() {
            return ((FitnessProtoV2$Spo2ItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getTypeSecondOffset();
        }

        public Builder setMinuteOffset(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Spo2ItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setMinuteOffset(i);
            return this;
        }

        public Builder setSpo2Rd(ByteString byteString) {
            copyOnWrite();
            ((FitnessProtoV2$Spo2ItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSpo2Rd(byteString);
            return this;
        }

        public Builder setTypeSecondOffset(ByteString byteString) {
            copyOnWrite();
            ((FitnessProtoV2$Spo2ItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setTypeSecondOffset(byteString);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$Spo2ItemDataV2.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$Spo2ItemDataV2 fitnessProtoV2$Spo2ItemDataV2 = new FitnessProtoV2$Spo2ItemDataV2();
        DEFAULT_INSTANCE = fitnessProtoV2$Spo2ItemDataV2;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$Spo2ItemDataV2.class, fitnessProtoV2$Spo2ItemDataV2);
    }

    private FitnessProtoV2$Spo2ItemDataV2() {
        ByteString byteString = ByteString.EMPTY;
        this.typeSecondOffset_ = byteString;
        this.spo2Rd_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteOffset() {
        this.minuteOffset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2Rd() {
        this.spo2Rd_ = getDefaultInstance().getSpo2Rd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeSecondOffset() {
        this.typeSecondOffset_ = getDefaultInstance().getTypeSecondOffset();
    }

    public static FitnessProtoV2$Spo2ItemDataV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$Spo2ItemDataV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteOffset(int i) {
        this.minuteOffset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2Rd(ByteString byteString) {
        byteString.getClass();
        this.spo2Rd_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeSecondOffset(ByteString byteString) {
        byteString.getClass();
        this.typeSecondOffset_ = byteString;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ko7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$Spo2ItemDataV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\n", new Object[]{"minuteOffset_", "typeSecondOffset_", "spo2Rd_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$Spo2ItemDataV2.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2ItemDataV2OrBuilder
    public int getMinuteOffset() {
        return this.minuteOffset_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2ItemDataV2OrBuilder
    public ByteString getSpo2Rd() {
        return this.spo2Rd_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$Spo2ItemDataV2OrBuilder
    public ByteString getTypeSecondOffset() {
        return this.typeSecondOffset_;
    }

    public static Builder newBuilder(FitnessProtoV2$Spo2ItemDataV2 fitnessProtoV2$Spo2ItemDataV2) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$Spo2ItemDataV2);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$Spo2ItemDataV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$Spo2ItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}