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
public final class RecommendProto$sport_strength extends GeneratedMessageLite<RecommendProto$sport_strength, Builder> implements RecommendProto$sport_strengthOrBuilder {
    private static final RecommendProto$sport_strength DEFAULT_INSTANCE;
    public static final int MAX_HR_FIELD_NUMBER = 2;
    public static final int MIN_HR_FIELD_NUMBER = 1;
    private static volatile Parser<RecommendProto$sport_strength> PARSER;
    private int maxHr_;
    private int minHr_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$sport_strength, Builder> implements RecommendProto$sport_strengthOrBuilder {
        public Builder clearMaxHr() {
            copyOnWrite();
            ((RecommendProto$sport_strength) this.instance).clearMaxHr();
            return this;
        }

        public Builder clearMinHr() {
            copyOnWrite();
            ((RecommendProto$sport_strength) this.instance).clearMinHr();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_strengthOrBuilder
        public int getMaxHr() {
            return ((RecommendProto$sport_strength) this.instance).getMaxHr();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_strengthOrBuilder
        public int getMinHr() {
            return ((RecommendProto$sport_strength) this.instance).getMinHr();
        }

        public Builder setMaxHr(int i) {
            copyOnWrite();
            ((RecommendProto$sport_strength) this.instance).setMaxHr(i);
            return this;
        }

        public Builder setMinHr(int i) {
            copyOnWrite();
            ((RecommendProto$sport_strength) this.instance).setMinHr(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$sport_strength.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$sport_strength recommendProto$sport_strength = new RecommendProto$sport_strength();
        DEFAULT_INSTANCE = recommendProto$sport_strength;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$sport_strength.class, recommendProto$sport_strength);
    }

    private RecommendProto$sport_strength() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxHr() {
        this.maxHr_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinHr() {
        this.minHr_ = 0;
    }

    public static RecommendProto$sport_strength getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$sport_strength parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sport_strength parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$sport_strength> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxHr(int i) {
        this.maxHr_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinHr(int i) {
        this.minHr_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$sport_strength();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"minHr_", "maxHr_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$sport_strength> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$sport_strength.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_strengthOrBuilder
    public int getMaxHr() {
        return this.maxHr_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_strengthOrBuilder
    public int getMinHr() {
        return this.minHr_;
    }

    public static Builder newBuilder(RecommendProto$sport_strength recommendProto$sport_strength) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$sport_strength);
    }

    public static RecommendProto$sport_strength parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sport_strength parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$sport_strength parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$sport_strength parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$sport_strength parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$sport_strength parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$sport_strength parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sport_strength parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sport_strength parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$sport_strength parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sport_strength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
