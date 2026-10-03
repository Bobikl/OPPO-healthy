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
public final class RecommendProto$sleep_cell extends GeneratedMessageLite<RecommendProto$sleep_cell, Builder> implements RecommendProto$sleep_cellOrBuilder {
    private static final RecommendProto$sleep_cell DEFAULT_INSTANCE;
    private static volatile Parser<RecommendProto$sleep_cell> PARSER = null;
    public static final int SLEEP_DURATION_FIELD_NUMBER = 2;
    public static final int SLEEP_SCORE_FIELD_NUMBER = 1;
    private int sleepDuration_;
    private int sleepScore_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$sleep_cell, Builder> implements RecommendProto$sleep_cellOrBuilder {
        public Builder clearSleepDuration() {
            copyOnWrite();
            ((RecommendProto$sleep_cell) this.instance).clearSleepDuration();
            return this;
        }

        public Builder clearSleepScore() {
            copyOnWrite();
            ((RecommendProto$sleep_cell) this.instance).clearSleepScore();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sleep_cellOrBuilder
        public int getSleepDuration() {
            return ((RecommendProto$sleep_cell) this.instance).getSleepDuration();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sleep_cellOrBuilder
        public int getSleepScore() {
            return ((RecommendProto$sleep_cell) this.instance).getSleepScore();
        }

        public Builder setSleepDuration(int i) {
            copyOnWrite();
            ((RecommendProto$sleep_cell) this.instance).setSleepDuration(i);
            return this;
        }

        public Builder setSleepScore(int i) {
            copyOnWrite();
            ((RecommendProto$sleep_cell) this.instance).setSleepScore(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$sleep_cell.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$sleep_cell recommendProto$sleep_cell = new RecommendProto$sleep_cell();
        DEFAULT_INSTANCE = recommendProto$sleep_cell;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$sleep_cell.class, recommendProto$sleep_cell);
    }

    private RecommendProto$sleep_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepDuration() {
        this.sleepDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepScore() {
        this.sleepScore_ = 0;
    }

    public static RecommendProto$sleep_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$sleep_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sleep_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$sleep_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepDuration(int i) {
        this.sleepDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepScore(int i) {
        this.sleepScore_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$sleep_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"sleepScore_", "sleepDuration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$sleep_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$sleep_cell.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$sleep_cellOrBuilder
    public int getSleepDuration() {
        return this.sleepDuration_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sleep_cellOrBuilder
    public int getSleepScore() {
        return this.sleepScore_;
    }

    public static Builder newBuilder(RecommendProto$sleep_cell recommendProto$sleep_cell) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$sleep_cell);
    }

    public static RecommendProto$sleep_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sleep_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$sleep_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$sleep_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$sleep_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$sleep_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$sleep_cell parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sleep_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sleep_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$sleep_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sleep_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
