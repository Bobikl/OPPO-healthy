package com.op.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class BindDeviceResponse {

    /* JADX INFO: renamed from: com.op.proto.BindDeviceResponse$1, reason: invalid class name */
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

    public static final class bind_rsp_t extends GeneratedMessageLite<bind_rsp_t, Builder> implements bind_rsp_tOrBuilder {
        public static final int BIND_RESULT_FIELD_NUMBER = 1;
        private static final bind_rsp_t DEFAULT_INSTANCE;
        private static volatile Parser<bind_rsp_t> PARSER;
        private int bindResult_;

        public static final class Builder extends GeneratedMessageLite.Builder<bind_rsp_t, Builder> implements bind_rsp_tOrBuilder {
            public Builder clearBindResult() {
                copyOnWrite();
                ((bind_rsp_t) this.instance).clearBindResult();
                return this;
            }

            @Override // com.op.proto.BindDeviceResponse.bind_rsp_tOrBuilder
            public int getBindResult() {
                return ((bind_rsp_t) this.instance).getBindResult();
            }

            public Builder setBindResult(int i) {
                copyOnWrite();
                ((bind_rsp_t) this.instance).setBindResult(i);
                return this;
            }

            private Builder() {
                super(bind_rsp_t.DEFAULT_INSTANCE);
            }
        }

        static {
            bind_rsp_t bind_rsp_tVar = new bind_rsp_t();
            DEFAULT_INSTANCE = bind_rsp_tVar;
            GeneratedMessageLite.registerDefaultInstance(bind_rsp_t.class, bind_rsp_tVar);
        }

        private bind_rsp_t() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBindResult() {
            this.bindResult_ = 0;
        }

        public static bind_rsp_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static bind_rsp_t parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (bind_rsp_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static bind_rsp_t parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<bind_rsp_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBindResult(int i) {
            this.bindResult_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new bind_rsp_t();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"bindResult_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<bind_rsp_t> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (bind_rsp_t.class) {
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

        @Override // com.op.proto.BindDeviceResponse.bind_rsp_tOrBuilder
        public int getBindResult() {
            return this.bindResult_;
        }

        public static Builder newBuilder(bind_rsp_t bind_rsp_tVar) {
            return DEFAULT_INSTANCE.createBuilder(bind_rsp_tVar);
        }

        public static bind_rsp_t parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (bind_rsp_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static bind_rsp_t parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static bind_rsp_t parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static bind_rsp_t parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static bind_rsp_t parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static bind_rsp_t parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static bind_rsp_t parseFrom(InputStream inputStream) throws IOException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static bind_rsp_t parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static bind_rsp_t parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static bind_rsp_t parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (bind_rsp_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface bind_rsp_tOrBuilder extends MessageLiteOrBuilder {
        int getBindResult();
    }

    private BindDeviceResponse() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
