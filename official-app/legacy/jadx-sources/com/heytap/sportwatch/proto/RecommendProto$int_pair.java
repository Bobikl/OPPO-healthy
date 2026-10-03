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
public final class RecommendProto$int_pair extends GeneratedMessageLite<RecommendProto$int_pair, Builder> implements RecommendProto$int_pairOrBuilder {
    private static final RecommendProto$int_pair DEFAULT_INSTANCE;
    public static final int FIRST_FIELD_NUMBER = 1;
    private static volatile Parser<RecommendProto$int_pair> PARSER = null;
    public static final int SECOND_FIELD_NUMBER = 2;
    private int first_;
    private int second_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$int_pair, Builder> implements RecommendProto$int_pairOrBuilder {
        public Builder clearFirst() {
            copyOnWrite();
            ((RecommendProto$int_pair) this.instance).clearFirst();
            return this;
        }

        public Builder clearSecond() {
            copyOnWrite();
            ((RecommendProto$int_pair) this.instance).clearSecond();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$int_pairOrBuilder
        public int getFirst() {
            return ((RecommendProto$int_pair) this.instance).getFirst();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$int_pairOrBuilder
        public int getSecond() {
            return ((RecommendProto$int_pair) this.instance).getSecond();
        }

        public Builder setFirst(int i) {
            copyOnWrite();
            ((RecommendProto$int_pair) this.instance).setFirst(i);
            return this;
        }

        public Builder setSecond(int i) {
            copyOnWrite();
            ((RecommendProto$int_pair) this.instance).setSecond(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$int_pair.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$int_pair recommendProto$int_pair = new RecommendProto$int_pair();
        DEFAULT_INSTANCE = recommendProto$int_pair;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$int_pair.class, recommendProto$int_pair);
    }

    private RecommendProto$int_pair() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirst() {
        this.first_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecond() {
        this.second_ = 0;
    }

    public static RecommendProto$int_pair getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$int_pair parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$int_pair parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$int_pair> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirst(int i) {
        this.first_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecond(int i) {
        this.second_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$int_pair();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"first_", "second_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$int_pair> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$int_pair.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$int_pairOrBuilder
    public int getFirst() {
        return this.first_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$int_pairOrBuilder
    public int getSecond() {
        return this.second_;
    }

    public static Builder newBuilder(RecommendProto$int_pair recommendProto$int_pair) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$int_pair);
    }

    public static RecommendProto$int_pair parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$int_pair parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$int_pair parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$int_pair parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$int_pair parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$int_pair parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$int_pair parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$int_pair parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$int_pair parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$int_pair parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$int_pair) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
