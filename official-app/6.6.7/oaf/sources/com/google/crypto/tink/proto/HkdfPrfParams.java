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
public final class HkdfPrfParams extends GeneratedMessageLite<HkdfPrfParams, Builder> implements HkdfPrfParamsOrBuilder {
    private static final HkdfPrfParams DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile Parser<HkdfPrfParams> PARSER = null;
    public static final int SALT_FIELD_NUMBER = 2;
    private int hash_;
    private ByteString salt_ = ByteString.EMPTY;

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

    public static final class Builder extends GeneratedMessageLite.Builder<HkdfPrfParams, Builder> implements HkdfPrfParamsOrBuilder {
        public /* synthetic */ Builder(1 r1) {
            this();
        }

        public Builder clearHash() {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).clearHash();
            return this;
        }

        public Builder clearSalt() {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).clearSalt();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
        public HashType getHash() {
            return ((HkdfPrfParams) this.instance).getHash();
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
        public int getHashValue() {
            return ((HkdfPrfParams) this.instance).getHashValue();
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
        public ByteString getSalt() {
            return ((HkdfPrfParams) this.instance).getSalt();
        }

        public Builder setHash(HashType hashType) {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).setHash(hashType);
            return this;
        }

        public Builder setHashValue(int i) {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).setHashValue(i);
            return this;
        }

        public Builder setSalt(ByteString byteString) {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).setSalt(byteString);
            return this;
        }

        private Builder() {
            super(HkdfPrfParams.DEFAULT_INSTANCE);
        }
    }

    static {
        HkdfPrfParams hkdfPrfParams = new HkdfPrfParams();
        DEFAULT_INSTANCE = hkdfPrfParams;
        GeneratedMessageLite.registerDefaultInstance(HkdfPrfParams.class, hkdfPrfParams);
    }

    private HkdfPrfParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHash() {
        this.hash_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSalt() {
        this.salt_ = getDefaultInstance().getSalt();
    }

    public static HkdfPrfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HkdfPrfParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HkdfPrfParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HkdfPrfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHash(HashType hashType) {
        this.hash_ = hashType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashValue(int i) {
        this.hash_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSalt(ByteString byteString) {
        byteString.getClass();
        this.salt_ = byteString;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        1 r1 = null;
        switch (i) {
            case 1:
                return new HkdfPrfParams();
            case 2:
                return new Builder(r1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"hash_", "salt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HkdfPrfParams> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (HkdfPrfParams.class) {
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

    @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
    public HashType getHash() {
        HashType hashTypeForNumber = HashType.forNumber(this.hash_);
        return hashTypeForNumber == null ? HashType.UNRECOGNIZED : hashTypeForNumber;
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
    public int getHashValue() {
        return this.hash_;
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
    public ByteString getSalt() {
        return this.salt_;
    }

    public static Builder newBuilder(HkdfPrfParams hkdfPrfParams) {
        return DEFAULT_INSTANCE.createBuilder(hkdfPrfParams);
    }

    public static HkdfPrfParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HkdfPrfParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HkdfPrfParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HkdfPrfParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HkdfPrfParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HkdfPrfParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HkdfPrfParams parseFrom(InputStream inputStream) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HkdfPrfParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HkdfPrfParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HkdfPrfParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
