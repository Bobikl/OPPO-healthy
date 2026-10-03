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
public final class FitnessProto$ScienceInfoDetail extends GeneratedMessageLite<FitnessProto$ScienceInfoDetail, Builder> implements FitnessProto$ScienceInfoDetailOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final FitnessProto$ScienceInfoDetail DEFAULT_INSTANCE;
    public static final int MODIFIEDTIMESTAMP_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProto$ScienceInfoDetail> PARSER = null;
    public static final int SERIALNO_FIELD_NUMBER = 1;
    private String content_ = "";
    private int modifiedTimestamp_;
    private int serialNo_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ScienceInfoDetail, Builder> implements FitnessProto$ScienceInfoDetailOrBuilder {
        private Builder() {
            super(FitnessProto$ScienceInfoDetail.DEFAULT_INSTANCE);
        }

        public Builder clearContent() {
            copyOnWrite();
            ((FitnessProto$ScienceInfoDetail) this.instance).clearContent();
            return this;
        }

        public Builder clearModifiedTimestamp() {
            copyOnWrite();
            ((FitnessProto$ScienceInfoDetail) this.instance).clearModifiedTimestamp();
            return this;
        }

        public Builder clearSerialNo() {
            copyOnWrite();
            ((FitnessProto$ScienceInfoDetail) this.instance).clearSerialNo();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoDetailOrBuilder
        public String getContent() {
            return ((FitnessProto$ScienceInfoDetail) this.instance).getContent();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoDetailOrBuilder
        public ByteString getContentBytes() {
            return ((FitnessProto$ScienceInfoDetail) this.instance).getContentBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoDetailOrBuilder
        public int getModifiedTimestamp() {
            return ((FitnessProto$ScienceInfoDetail) this.instance).getModifiedTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoDetailOrBuilder
        public int getSerialNo() {
            return ((FitnessProto$ScienceInfoDetail) this.instance).getSerialNo();
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoDetail) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoDetail) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setModifiedTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoDetail) this.instance).setModifiedTimestamp(i);
            return this;
        }

        public Builder setSerialNo(int i) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoDetail) this.instance).setSerialNo(i);
            return this;
        }
    }

    static {
        FitnessProto$ScienceInfoDetail fitnessProto$ScienceInfoDetail = new FitnessProto$ScienceInfoDetail();
        DEFAULT_INSTANCE = fitnessProto$ScienceInfoDetail;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ScienceInfoDetail.class, fitnessProto$ScienceInfoDetail);
    }

    private FitnessProto$ScienceInfoDetail() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifiedTimestamp() {
        this.modifiedTimestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSerialNo() {
        this.serialNo_ = 0;
    }

    public static FitnessProto$ScienceInfoDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ScienceInfoDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$ScienceInfoDetail> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifiedTimestamp(int i) {
        this.modifiedTimestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSerialNo(int i) {
        this.serialNo_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ScienceInfoDetail();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003\u000b", new Object[]{"serialNo_", "content_", "modifiedTimestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$ScienceInfoDetail> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ScienceInfoDetail.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoDetailOrBuilder
    public String getContent() {
        return this.content_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoDetailOrBuilder
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoDetailOrBuilder
    public int getModifiedTimestamp() {
        return this.modifiedTimestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoDetailOrBuilder
    public int getSerialNo() {
        return this.serialNo_;
    }

    public static Builder newBuilder(FitnessProto$ScienceInfoDetail fitnessProto$ScienceInfoDetail) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$ScienceInfoDetail);
    }

    public static FitnessProto$ScienceInfoDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ScienceInfoDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
