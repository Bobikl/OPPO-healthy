package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpDataProto extends GeneratedMessageLite<HttpDataProto, Builder> implements HttpDataProtoOrBuilder {
    public static final int BODY_FIELD_NUMBER = 2;
    private static final HttpDataProto DEFAULT_INSTANCE;
    public static final int HEAD_FIELD_NUMBER = 1;
    private static volatile Parser<HttpDataProto> PARSER;
    private ByteString body_;
    private ByteString head_;

    /* JADX INFO: renamed from: com.heytap.wearable.btnet.proto.HttpDataProto$1, reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.Builder<HttpDataProto, Builder> implements HttpDataProtoOrBuilder {
        public Builder clearBody() {
            copyOnWrite();
            ((HttpDataProto) this.instance).clearBody();
            return this;
        }

        public Builder clearHead() {
            copyOnWrite();
            ((HttpDataProto) this.instance).clearHead();
            return this;
        }

        @Override // com.heytap.wearable.btnet.proto.HttpDataProtoOrBuilder
        public ByteString getBody() {
            return ((HttpDataProto) this.instance).getBody();
        }

        @Override // com.heytap.wearable.btnet.proto.HttpDataProtoOrBuilder
        public ByteString getHead() {
            return ((HttpDataProto) this.instance).getHead();
        }

        public Builder setBody(ByteString byteString) {
            copyOnWrite();
            ((HttpDataProto) this.instance).setBody(byteString);
            return this;
        }

        public Builder setHead(ByteString byteString) {
            copyOnWrite();
            ((HttpDataProto) this.instance).setHead(byteString);
            return this;
        }

        private Builder() {
            super(HttpDataProto.DEFAULT_INSTANCE);
        }
    }

    static {
        HttpDataProto httpDataProto = new HttpDataProto();
        DEFAULT_INSTANCE = httpDataProto;
        GeneratedMessageLite.registerDefaultInstance(HttpDataProto.class, httpDataProto);
    }

    private HttpDataProto() {
        ByteString byteString = ByteString.EMPTY;
        this.head_ = byteString;
        this.body_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHead() {
        this.head_ = getDefaultInstance().getHead();
    }

    public static HttpDataProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpDataProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpDataProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpDataProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HttpDataProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(ByteString byteString) {
        byteString.getClass();
        this.body_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHead(ByteString byteString) {
        byteString.getClass();
        this.head_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new HttpDataProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"head_", "body_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HttpDataProto> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (HttpDataProto.class) {
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

    @Override // com.heytap.wearable.btnet.proto.HttpDataProtoOrBuilder
    public ByteString getBody() {
        return this.body_;
    }

    @Override // com.heytap.wearable.btnet.proto.HttpDataProtoOrBuilder
    public ByteString getHead() {
        return this.head_;
    }

    public static Builder newBuilder(HttpDataProto httpDataProto) {
        return DEFAULT_INSTANCE.createBuilder(httpDataProto);
    }

    public static HttpDataProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpDataProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpDataProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HttpDataProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HttpDataProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HttpDataProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpDataProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HttpDataProto parseFrom(InputStream inputStream) throws IOException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpDataProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpDataProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HttpDataProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpDataProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
