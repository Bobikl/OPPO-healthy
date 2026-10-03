package com.oplus.wearable.linkservice.transport.consult.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class GetMac extends GeneratedMessageLite<GetMac, Builder> implements GetMacOrBuilder {
    private static final GetMac DEFAULT_INSTANCE;
    public static final int MAC_FIELD_NUMBER = 1;
    private static volatile Parser<GetMac> PARSER;
    private String mac_ = "";

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

    public static final class Builder extends GeneratedMessageLite.Builder<GetMac, Builder> implements GetMacOrBuilder {
        public Builder clearMac() {
            copyOnWrite();
            ((GetMac) ((GeneratedMessageLite.Builder) this).instance).clearMac();
            return this;
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.GetMacOrBuilder
        public String getMac() {
            return ((GetMac) ((GeneratedMessageLite.Builder) this).instance).getMac();
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.GetMacOrBuilder
        public ByteString getMacBytes() {
            return ((GetMac) ((GeneratedMessageLite.Builder) this).instance).getMacBytes();
        }

        public Builder setMac(String str) {
            copyOnWrite();
            ((GetMac) ((GeneratedMessageLite.Builder) this).instance).setMac(str);
            return this;
        }

        public Builder setMacBytes(ByteString byteString) {
            copyOnWrite();
            ((GetMac) ((GeneratedMessageLite.Builder) this).instance).setMacBytes(byteString);
            return this;
        }

        private Builder() {
            super(GetMac.DEFAULT_INSTANCE);
        }
    }

    static {
        GetMac getMac = new GetMac();
        DEFAULT_INSTANCE = getMac;
        GeneratedMessageLite.registerDefaultInstance(GetMac.class, getMac);
    }

    private GetMac() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMac() {
        this.mac_ = getDefaultInstance().getMac();
    }

    public static GetMac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetMac parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetMac) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMac parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GetMac> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMac(String str) {
        str.getClass();
        this.mac_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMacBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mac_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GetMac();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"mac_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GetMac.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.GetMacOrBuilder
    public String getMac() {
        return this.mac_;
    }

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.GetMacOrBuilder
    public ByteString getMacBytes() {
        return ByteString.copyFromUtf8(this.mac_);
    }

    public static Builder newBuilder(GetMac getMac) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getMac);
    }

    public static GetMac parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetMac) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetMac parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GetMac parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GetMac parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GetMac parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetMac parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GetMac parseFrom(InputStream inputStream) throws IOException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMac parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetMac parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GetMac parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetMac) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
