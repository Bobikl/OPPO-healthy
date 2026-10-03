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

/* JADX INFO: loaded from: classes14.dex */
public final class EciesAeadHkdfParams extends GeneratedMessageLite<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
    private static final EciesAeadHkdfParams DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<EciesAeadHkdfParams> PARSER;
    private EciesAeadDemParams demParams_;
    private int ecPointFormat_;
    private EciesHkdfKemParams kemParams_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.EciesAeadHkdfParams$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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

    public static final class Builder extends GeneratedMessageLite.Builder<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearDemParams() {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).clearDemParams();
            return this;
        }

        public Builder clearEcPointFormat() {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).clearEcPointFormat();
            return this;
        }

        public Builder clearKemParams() {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).clearKemParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public EciesAeadDemParams getDemParams() {
            return ((EciesAeadHkdfParams) this.instance).getDemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public EcPointFormat getEcPointFormat() {
            return ((EciesAeadHkdfParams) this.instance).getEcPointFormat();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public int getEcPointFormatValue() {
            return ((EciesAeadHkdfParams) this.instance).getEcPointFormatValue();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public EciesHkdfKemParams getKemParams() {
            return ((EciesAeadHkdfParams) this.instance).getKemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public boolean hasDemParams() {
            return ((EciesAeadHkdfParams) this.instance).hasDemParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
        public boolean hasKemParams() {
            return ((EciesAeadHkdfParams) this.instance).hasKemParams();
        }

        public Builder mergeDemParams(EciesAeadDemParams eciesAeadDemParams) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).mergeDemParams(eciesAeadDemParams);
            return this;
        }

        public Builder mergeKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).mergeKemParams(eciesHkdfKemParams);
            return this;
        }

        public Builder setDemParams(EciesAeadDemParams eciesAeadDemParams) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setDemParams(eciesAeadDemParams);
            return this;
        }

        public Builder setEcPointFormat(EcPointFormat ecPointFormat) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setEcPointFormat(ecPointFormat);
            return this;
        }

        public Builder setEcPointFormatValue(int i) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setEcPointFormatValue(i);
            return this;
        }

        public Builder setKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setKemParams(eciesHkdfKemParams);
            return this;
        }

        private Builder() {
            super(EciesAeadHkdfParams.DEFAULT_INSTANCE);
        }

        public Builder setDemParams(EciesAeadDemParams.Builder builder) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setDemParams(builder.build());
            return this;
        }

        public Builder setKemParams(EciesHkdfKemParams.Builder builder) {
            copyOnWrite();
            ((EciesAeadHkdfParams) this.instance).setKemParams(builder.build());
            return this;
        }
    }

    static {
        EciesAeadHkdfParams eciesAeadHkdfParams = new EciesAeadHkdfParams();
        DEFAULT_INSTANCE = eciesAeadHkdfParams;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfParams.class, eciesAeadHkdfParams);
    }

    private EciesAeadHkdfParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDemParams() {
        this.demParams_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcPointFormat() {
        this.ecPointFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKemParams() {
        this.kemParams_ = null;
    }

    public static EciesAeadHkdfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDemParams(EciesAeadDemParams eciesAeadDemParams) {
        eciesAeadDemParams.getClass();
        EciesAeadDemParams eciesAeadDemParams2 = this.demParams_;
        if (eciesAeadDemParams2 == null || eciesAeadDemParams2 == EciesAeadDemParams.getDefaultInstance()) {
            this.demParams_ = eciesAeadDemParams;
        } else {
            this.demParams_ = EciesAeadDemParams.newBuilder(this.demParams_).mergeFrom(eciesAeadDemParams).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
        eciesHkdfKemParams.getClass();
        EciesHkdfKemParams eciesHkdfKemParams2 = this.kemParams_;
        if (eciesHkdfKemParams2 == null || eciesHkdfKemParams2 == EciesHkdfKemParams.getDefaultInstance()) {
            this.kemParams_ = eciesHkdfKemParams;
        } else {
            this.kemParams_ = EciesHkdfKemParams.newBuilder(this.kemParams_).mergeFrom(eciesHkdfKemParams).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EciesAeadHkdfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDemParams(EciesAeadDemParams eciesAeadDemParams) {
        eciesAeadDemParams.getClass();
        this.demParams_ = eciesAeadDemParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcPointFormat(EcPointFormat ecPointFormat) {
        this.ecPointFormat_ = ecPointFormat.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcPointFormatValue(int i) {
        this.ecPointFormat_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
        eciesHkdfKemParams.getClass();
        this.kemParams_ = eciesHkdfKemParams;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        AnonymousClass1 anonymousClass1 = null;
        switch (i) {
            case 1:
                return new EciesAeadHkdfParams();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"kemParams_", "demParams_", "ecPointFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesAeadHkdfParams> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EciesAeadHkdfParams.class) {
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

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public EciesAeadDemParams getDemParams() {
        EciesAeadDemParams eciesAeadDemParams = this.demParams_;
        return eciesAeadDemParams == null ? EciesAeadDemParams.getDefaultInstance() : eciesAeadDemParams;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public EcPointFormat getEcPointFormat() {
        EcPointFormat ecPointFormatForNumber = EcPointFormat.forNumber(this.ecPointFormat_);
        return ecPointFormatForNumber == null ? EcPointFormat.UNRECOGNIZED : ecPointFormatForNumber;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public int getEcPointFormatValue() {
        return this.ecPointFormat_;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public EciesHkdfKemParams getKemParams() {
        EciesHkdfKemParams eciesHkdfKemParams = this.kemParams_;
        return eciesHkdfKemParams == null ? EciesHkdfKemParams.getDefaultInstance() : eciesHkdfKemParams;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public boolean hasDemParams() {
        return this.demParams_ != null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfParamsOrBuilder
    public boolean hasKemParams() {
        return this.kemParams_ != null;
    }

    public static Builder newBuilder(EciesAeadHkdfParams eciesAeadHkdfParams) {
        return DEFAULT_INSTANCE.createBuilder(eciesAeadHkdfParams);
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EciesAeadHkdfParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream inputStream) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EciesAeadHkdfParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
