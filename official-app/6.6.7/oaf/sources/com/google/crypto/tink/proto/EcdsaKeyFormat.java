package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class EcdsaKeyFormat extends GeneratedMessageLite<EcdsaKeyFormat, Builder> implements EcdsaKeyFormatOrBuilder {
    private static final EcdsaKeyFormat DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<EcdsaKeyFormat> PARSER;
    private EcdsaParams params_;

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EcdsaKeyFormat, Builder> implements EcdsaKeyFormatOrBuilder {
        public /* synthetic */ Builder(1 r1) {
            this();
        }

        public Builder clearParams() {
            copyOnWrite();
            ((EcdsaKeyFormat) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaKeyFormatOrBuilder
        public EcdsaParams getParams() {
            return ((EcdsaKeyFormat) this.instance).getParams();
        }

        @Override // com.google.crypto.tink.proto.EcdsaKeyFormatOrBuilder
        public boolean hasParams() {
            return ((EcdsaKeyFormat) this.instance).hasParams();
        }

        public Builder mergeParams(EcdsaParams ecdsaParams) {
            copyOnWrite();
            ((EcdsaKeyFormat) this.instance).mergeParams(ecdsaParams);
            return this;
        }

        public Builder setParams(EcdsaParams ecdsaParams) {
            copyOnWrite();
            ((EcdsaKeyFormat) this.instance).setParams(ecdsaParams);
            return this;
        }

        private Builder() {
            super(EcdsaKeyFormat.DEFAULT_INSTANCE);
        }

        public Builder setParams(EcdsaParams.Builder builder) {
            copyOnWrite();
            ((EcdsaKeyFormat) this.instance).setParams(builder.build());
            return this;
        }
    }

    static {
        EcdsaKeyFormat ecdsaKeyFormat = new EcdsaKeyFormat();
        DEFAULT_INSTANCE = ecdsaKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(EcdsaKeyFormat.class, ecdsaKeyFormat);
    }

    private EcdsaKeyFormat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    public static EcdsaKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(EcdsaParams ecdsaParams) {
        ecdsaParams.getClass();
        EcdsaParams ecdsaParams2 = this.params_;
        if (ecdsaParams2 == null || ecdsaParams2 == EcdsaParams.getDefaultInstance()) {
            this.params_ = ecdsaParams;
        } else {
            this.params_ = EcdsaParams.newBuilder(this.params_).mergeFrom(ecdsaParams).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EcdsaKeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaKeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EcdsaKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(EcdsaParams ecdsaParams) {
        ecdsaParams.getClass();
        this.params_ = ecdsaParams;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        1 r1 = null;
        switch (i) {
            case 1:
                return new EcdsaKeyFormat();
            case 2:
                return new Builder(r1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EcdsaKeyFormat> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EcdsaKeyFormat.class) {
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

    @Override // com.google.crypto.tink.proto.EcdsaKeyFormatOrBuilder
    public EcdsaParams getParams() {
        EcdsaParams ecdsaParams = this.params_;
        return ecdsaParams == null ? EcdsaParams.getDefaultInstance() : ecdsaParams;
    }

    @Override // com.google.crypto.tink.proto.EcdsaKeyFormatOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    public static Builder newBuilder(EcdsaKeyFormat ecdsaKeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(ecdsaKeyFormat);
    }

    public static EcdsaKeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaKeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EcdsaKeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EcdsaKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EcdsaKeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EcdsaKeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EcdsaKeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaKeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaKeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EcdsaKeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
