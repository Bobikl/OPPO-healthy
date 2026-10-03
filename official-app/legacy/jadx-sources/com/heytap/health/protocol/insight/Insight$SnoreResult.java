package com.heytap.health.protocol.insight;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r9a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class Insight$SnoreResult extends GeneratedMessageLite<Insight$SnoreResult, Builder> implements Insight$SnoreResultOrBuilder {
    private static final Insight$SnoreResult DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private static volatile Parser<Insight$SnoreResult> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int level_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<Insight$SnoreResult, Builder> implements Insight$SnoreResultOrBuilder {
        public Builder clearLevel() {
            copyOnWrite();
            ((Insight$SnoreResult) this.instance).clearLevel();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((Insight$SnoreResult) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.insight.Insight$SnoreResultOrBuilder
        public int getLevel() {
            return ((Insight$SnoreResult) this.instance).getLevel();
        }

        @Override // com.heytap.health.protocol.insight.Insight$SnoreResultOrBuilder
        public int getTimestamp() {
            return ((Insight$SnoreResult) this.instance).getTimestamp();
        }

        public Builder setLevel(int i) {
            copyOnWrite();
            ((Insight$SnoreResult) this.instance).setLevel(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((Insight$SnoreResult) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(Insight$SnoreResult.DEFAULT_INSTANCE);
        }
    }

    static {
        Insight$SnoreResult insight$SnoreResult = new Insight$SnoreResult();
        DEFAULT_INSTANCE = insight$SnoreResult;
        GeneratedMessageLite.registerDefaultInstance(Insight$SnoreResult.class, insight$SnoreResult);
    }

    private Insight$SnoreResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static Insight$SnoreResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Insight$SnoreResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$SnoreResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Insight$SnoreResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(int i) {
        this.level_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r9a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Insight$SnoreResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0004", new Object[]{"timestamp_", "level_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Insight$SnoreResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Insight$SnoreResult.class) {
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

    @Override // com.heytap.health.protocol.insight.Insight$SnoreResultOrBuilder
    public int getLevel() {
        return this.level_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$SnoreResultOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(Insight$SnoreResult insight$SnoreResult) {
        return DEFAULT_INSTANCE.createBuilder(insight$SnoreResult);
    }

    public static Insight$SnoreResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$SnoreResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Insight$SnoreResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Insight$SnoreResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Insight$SnoreResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Insight$SnoreResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Insight$SnoreResult parseFrom(InputStream inputStream) throws IOException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$SnoreResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$SnoreResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Insight$SnoreResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$SnoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
