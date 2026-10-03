package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.pef;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendProto$hrv_cell extends GeneratedMessageLite<RecommendProto$hrv_cell, Builder> implements RecommendProto$hrv_cellOrBuilder {
    private static final RecommendProto$hrv_cell DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 3;
    public static final int LOW_FIELD_NUMBER = 2;
    private static volatile Parser<RecommendProto$hrv_cell> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int high_;
    private int low_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$hrv_cell, Builder> implements RecommendProto$hrv_cellOrBuilder {
        public Builder clearHigh() {
            copyOnWrite();
            ((RecommendProto$hrv_cell) this.instance).clearHigh();
            return this;
        }

        public Builder clearLow() {
            copyOnWrite();
            ((RecommendProto$hrv_cell) this.instance).clearLow();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((RecommendProto$hrv_cell) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$hrv_cellOrBuilder
        public int getHigh() {
            return ((RecommendProto$hrv_cell) this.instance).getHigh();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$hrv_cellOrBuilder
        public int getLow() {
            return ((RecommendProto$hrv_cell) this.instance).getLow();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$hrv_cellOrBuilder
        public int getValue() {
            return ((RecommendProto$hrv_cell) this.instance).getValue();
        }

        public Builder setHigh(int i) {
            copyOnWrite();
            ((RecommendProto$hrv_cell) this.instance).setHigh(i);
            return this;
        }

        public Builder setLow(int i) {
            copyOnWrite();
            ((RecommendProto$hrv_cell) this.instance).setLow(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((RecommendProto$hrv_cell) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$hrv_cell.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$hrv_cell recommendProto$hrv_cell = new RecommendProto$hrv_cell();
        DEFAULT_INSTANCE = recommendProto$hrv_cell;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$hrv_cell.class, recommendProto$hrv_cell);
    }

    private RecommendProto$hrv_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHigh() {
        this.high_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLow() {
        this.low_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static RecommendProto$hrv_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$hrv_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$hrv_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$hrv_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHigh(int i) {
        this.high_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLow(int i) {
        this.low_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$hrv_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"value_", "low_", "high_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$hrv_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$hrv_cell.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$hrv_cellOrBuilder
    public int getHigh() {
        return this.high_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$hrv_cellOrBuilder
    public int getLow() {
        return this.low_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$hrv_cellOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(RecommendProto$hrv_cell recommendProto$hrv_cell) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$hrv_cell);
    }

    public static RecommendProto$hrv_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$hrv_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$hrv_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$hrv_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$hrv_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$hrv_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$hrv_cell parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$hrv_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$hrv_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$hrv_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$hrv_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
