package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.p5j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class SwipeSetting$SwipeSetStatus extends GeneratedMessageLite<SwipeSetting$SwipeSetStatus, Builder> implements SwipeSetting$SwipeSetStatusOrBuilder {
    private static final SwipeSetting$SwipeSetStatus DEFAULT_INSTANCE;
    private static volatile Parser<SwipeSetting$SwipeSetStatus> PARSER = null;
    public static final int SETSUC_FIELD_NUMBER = 1;
    private boolean setSuc_;

    public static final class Builder extends GeneratedMessageLite.Builder<SwipeSetting$SwipeSetStatus, Builder> implements SwipeSetting$SwipeSetStatusOrBuilder {
        public Builder clearSetSuc() {
            copyOnWrite();
            ((SwipeSetting$SwipeSetStatus) this.instance).clearSetSuc();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeSetStatusOrBuilder
        public boolean getSetSuc() {
            return ((SwipeSetting$SwipeSetStatus) this.instance).getSetSuc();
        }

        public Builder setSetSuc(boolean z) {
            copyOnWrite();
            ((SwipeSetting$SwipeSetStatus) this.instance).setSetSuc(z);
            return this;
        }

        private Builder() {
            super(SwipeSetting$SwipeSetStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        SwipeSetting$SwipeSetStatus swipeSetting$SwipeSetStatus = new SwipeSetting$SwipeSetStatus();
        DEFAULT_INSTANCE = swipeSetting$SwipeSetStatus;
        GeneratedMessageLite.registerDefaultInstance(SwipeSetting$SwipeSetStatus.class, swipeSetting$SwipeSetStatus);
    }

    private SwipeSetting$SwipeSetStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetSuc() {
        this.setSuc_ = false;
    }

    public static SwipeSetting$SwipeSetStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SwipeSetting$SwipeSetStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SwipeSetting$SwipeSetStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetSuc(boolean z) {
        this.setSuc_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = p5j.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SwipeSetting$SwipeSetStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"setSuc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SwipeSetting$SwipeSetStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SwipeSetting$SwipeSetStatus.class) {
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

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeSetStatusOrBuilder
    public boolean getSetSuc() {
        return this.setSuc_;
    }

    public static Builder newBuilder(SwipeSetting$SwipeSetStatus swipeSetting$SwipeSetStatus) {
        return DEFAULT_INSTANCE.createBuilder(swipeSetting$SwipeSetStatus);
    }

    public static SwipeSetting$SwipeSetStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(InputStream inputStream) throws IOException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SwipeSetting$SwipeSetStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$SwipeSetStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
