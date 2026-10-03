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
public final class RecommendProto$dur_section extends GeneratedMessageLite<RecommendProto$dur_section, Builder> implements RecommendProto$dur_sectionOrBuilder {
    private static final RecommendProto$dur_section DEFAULT_INSTANCE;
    public static final int MAX_DURATION_FIELD_NUMBER = 2;
    public static final int MIN_DURATION_FIELD_NUMBER = 1;
    private static volatile Parser<RecommendProto$dur_section> PARSER;
    private int maxDuration_;
    private int minDuration_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$dur_section, Builder> implements RecommendProto$dur_sectionOrBuilder {
        public Builder clearMaxDuration() {
            copyOnWrite();
            ((RecommendProto$dur_section) this.instance).clearMaxDuration();
            return this;
        }

        public Builder clearMinDuration() {
            copyOnWrite();
            ((RecommendProto$dur_section) this.instance).clearMinDuration();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$dur_sectionOrBuilder
        public int getMaxDuration() {
            return ((RecommendProto$dur_section) this.instance).getMaxDuration();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$dur_sectionOrBuilder
        public int getMinDuration() {
            return ((RecommendProto$dur_section) this.instance).getMinDuration();
        }

        public Builder setMaxDuration(int i) {
            copyOnWrite();
            ((RecommendProto$dur_section) this.instance).setMaxDuration(i);
            return this;
        }

        public Builder setMinDuration(int i) {
            copyOnWrite();
            ((RecommendProto$dur_section) this.instance).setMinDuration(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$dur_section.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$dur_section recommendProto$dur_section = new RecommendProto$dur_section();
        DEFAULT_INSTANCE = recommendProto$dur_section;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$dur_section.class, recommendProto$dur_section);
    }

    private RecommendProto$dur_section() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDuration() {
        this.maxDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinDuration() {
        this.minDuration_ = 0;
    }

    public static RecommendProto$dur_section getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$dur_section parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$dur_section parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$dur_section> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDuration(int i) {
        this.maxDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinDuration(int i) {
        this.minDuration_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$dur_section();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"minDuration_", "maxDuration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$dur_section> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$dur_section.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$dur_sectionOrBuilder
    public int getMaxDuration() {
        return this.maxDuration_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$dur_sectionOrBuilder
    public int getMinDuration() {
        return this.minDuration_;
    }

    public static Builder newBuilder(RecommendProto$dur_section recommendProto$dur_section) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$dur_section);
    }

    public static RecommendProto$dur_section parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$dur_section parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$dur_section parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$dur_section parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$dur_section parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$dur_section parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$dur_section parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$dur_section parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$dur_section parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$dur_section parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$dur_section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
