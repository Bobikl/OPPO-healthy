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
public final class BindDeviceRequester {

    /* JADX INFO: renamed from: com.op.proto.BindDeviceRequester$1, reason: invalid class name */
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

    public static final class bind_req_t extends GeneratedMessageLite<bind_req_t, Builder> implements bind_req_tOrBuilder {
        private static final bind_req_t DEFAULT_INSTANCE;
        private static volatile Parser<bind_req_t> PARSER = null;
        public static final int RESERVED_FIELD_NUMBER = 1;
        private int reserved_;

        public static final class Builder extends GeneratedMessageLite.Builder<bind_req_t, Builder> implements bind_req_tOrBuilder {
            public Builder clearReserved() {
                copyOnWrite();
                ((bind_req_t) this.instance).clearReserved();
                return this;
            }

            @Override // com.op.proto.BindDeviceRequester.bind_req_tOrBuilder
            public int getReserved() {
                return ((bind_req_t) this.instance).getReserved();
            }

            public Builder setReserved(int i) {
                copyOnWrite();
                ((bind_req_t) this.instance).setReserved(i);
                return this;
            }

            private Builder() {
                super(bind_req_t.DEFAULT_INSTANCE);
            }
        }

        static {
            bind_req_t bind_req_tVar = new bind_req_t();
            DEFAULT_INSTANCE = bind_req_tVar;
            GeneratedMessageLite.registerDefaultInstance(bind_req_t.class, bind_req_tVar);
        }

        private bind_req_t() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReserved() {
            this.reserved_ = 0;
        }

        public static bind_req_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static bind_req_t parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (bind_req_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static bind_req_t parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<bind_req_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReserved(int i) {
            this.reserved_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new bind_req_t();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"reserved_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<bind_req_t> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (bind_req_t.class) {
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

        @Override // com.op.proto.BindDeviceRequester.bind_req_tOrBuilder
        public int getReserved() {
            return this.reserved_;
        }

        public static Builder newBuilder(bind_req_t bind_req_tVar) {
            return DEFAULT_INSTANCE.createBuilder(bind_req_tVar);
        }

        public static bind_req_t parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (bind_req_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static bind_req_t parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static bind_req_t parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static bind_req_t parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static bind_req_t parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static bind_req_t parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static bind_req_t parseFrom(InputStream inputStream) throws IOException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static bind_req_t parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static bind_req_t parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static bind_req_t parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (bind_req_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface bind_req_tOrBuilder extends MessageLiteOrBuilder {
        int getReserved();
    }

    private BindDeviceRequester() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
