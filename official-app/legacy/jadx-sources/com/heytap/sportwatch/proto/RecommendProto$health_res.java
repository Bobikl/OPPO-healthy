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
public final class RecommendProto$health_res extends GeneratedMessageLite<RecommendProto$health_res, Builder> implements RecommendProto$health_resOrBuilder {
    private static final RecommendProto$health_res DEFAULT_INSTANCE;
    private static volatile Parser<RecommendProto$health_res> PARSER = null;
    public static final int RES_CODE_FIELD_NUMBER = 1;
    private int resCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$health_res, Builder> implements RecommendProto$health_resOrBuilder {
        public Builder clearResCode() {
            copyOnWrite();
            ((RecommendProto$health_res) this.instance).clearResCode();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_resOrBuilder
        public int getResCode() {
            return ((RecommendProto$health_res) this.instance).getResCode();
        }

        public Builder setResCode(int i) {
            copyOnWrite();
            ((RecommendProto$health_res) this.instance).setResCode(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$health_res.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$health_res recommendProto$health_res = new RecommendProto$health_res();
        DEFAULT_INSTANCE = recommendProto$health_res;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$health_res.class, recommendProto$health_res);
    }

    private RecommendProto$health_res() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResCode() {
        this.resCode_ = 0;
    }

    public static RecommendProto$health_res getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$health_res parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$health_res parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$health_res> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResCode(int i) {
        this.resCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$health_res();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"resCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$health_res> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$health_res.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_resOrBuilder
    public int getResCode() {
        return this.resCode_;
    }

    public static Builder newBuilder(RecommendProto$health_res recommendProto$health_res) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$health_res);
    }

    public static RecommendProto$health_res parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$health_res parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$health_res parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$health_res parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$health_res parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$health_res parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$health_res parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$health_res parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$health_res parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$health_res parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$health_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
