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
public final class HealthVersionInfo {

    /* JADX INFO: renamed from: com.op.proto.HealthVersionInfo$1, reason: invalid class name */
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

    public static final class HealthVersionCode extends GeneratedMessageLite<HealthVersionCode, Builder> implements HealthVersionCodeOrBuilder {
        private static final HealthVersionCode DEFAULT_INSTANCE;
        private static volatile Parser<HealthVersionCode> PARSER = null;
        public static final int PHONE_OS_TYPE_FIELD_NUMBER = 2;
        public static final int VERSION_CODE_FIELD_NUMBER = 1;
        private int phoneOsType_;
        private int versionCode_;

        public static final class Builder extends GeneratedMessageLite.Builder<HealthVersionCode, Builder> implements HealthVersionCodeOrBuilder {
            public Builder clearPhoneOsType() {
                copyOnWrite();
                ((HealthVersionCode) this.instance).clearPhoneOsType();
                return this;
            }

            public Builder clearVersionCode() {
                copyOnWrite();
                ((HealthVersionCode) this.instance).clearVersionCode();
                return this;
            }

            @Override // com.op.proto.HealthVersionInfo.HealthVersionCodeOrBuilder
            public int getPhoneOsType() {
                return ((HealthVersionCode) this.instance).getPhoneOsType();
            }

            @Override // com.op.proto.HealthVersionInfo.HealthVersionCodeOrBuilder
            public int getVersionCode() {
                return ((HealthVersionCode) this.instance).getVersionCode();
            }

            public Builder setPhoneOsType(int i) {
                copyOnWrite();
                ((HealthVersionCode) this.instance).setPhoneOsType(i);
                return this;
            }

            public Builder setVersionCode(int i) {
                copyOnWrite();
                ((HealthVersionCode) this.instance).setVersionCode(i);
                return this;
            }

            private Builder() {
                super(HealthVersionCode.DEFAULT_INSTANCE);
            }
        }

        static {
            HealthVersionCode healthVersionCode = new HealthVersionCode();
            DEFAULT_INSTANCE = healthVersionCode;
            GeneratedMessageLite.registerDefaultInstance(HealthVersionCode.class, healthVersionCode);
        }

        private HealthVersionCode() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneOsType() {
            this.phoneOsType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersionCode() {
            this.versionCode_ = 0;
        }

        public static HealthVersionCode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HealthVersionCode parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HealthVersionCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthVersionCode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HealthVersionCode> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneOsType(int i) {
            this.phoneOsType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionCode(int i) {
            this.versionCode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new HealthVersionCode();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"versionCode_", "phoneOsType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HealthVersionCode> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HealthVersionCode.class) {
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

        @Override // com.op.proto.HealthVersionInfo.HealthVersionCodeOrBuilder
        public int getPhoneOsType() {
            return this.phoneOsType_;
        }

        @Override // com.op.proto.HealthVersionInfo.HealthVersionCodeOrBuilder
        public int getVersionCode() {
            return this.versionCode_;
        }

        public static Builder newBuilder(HealthVersionCode healthVersionCode) {
            return DEFAULT_INSTANCE.createBuilder(healthVersionCode);
        }

        public static HealthVersionCode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HealthVersionCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HealthVersionCode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HealthVersionCode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HealthVersionCode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HealthVersionCode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HealthVersionCode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HealthVersionCode parseFrom(InputStream inputStream) throws IOException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthVersionCode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HealthVersionCode parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HealthVersionCode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HealthVersionCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface HealthVersionCodeOrBuilder extends MessageLiteOrBuilder {
        int getPhoneOsType();

        int getVersionCode();
    }

    public static final class HealthVersionCodeRespose extends GeneratedMessageLite<HealthVersionCodeRespose, Builder> implements HealthVersionCodeResposeOrBuilder {
        private static final HealthVersionCodeRespose DEFAULT_INSTANCE;
        private static volatile Parser<HealthVersionCodeRespose> PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 1;
        private int result_;

        public static final class Builder extends GeneratedMessageLite.Builder<HealthVersionCodeRespose, Builder> implements HealthVersionCodeResposeOrBuilder {
            public Builder clearResult() {
                copyOnWrite();
                ((HealthVersionCodeRespose) this.instance).clearResult();
                return this;
            }

            @Override // com.op.proto.HealthVersionInfo.HealthVersionCodeResposeOrBuilder
            public int getResult() {
                return ((HealthVersionCodeRespose) this.instance).getResult();
            }

            public Builder setResult(int i) {
                copyOnWrite();
                ((HealthVersionCodeRespose) this.instance).setResult(i);
                return this;
            }

            private Builder() {
                super(HealthVersionCodeRespose.DEFAULT_INSTANCE);
            }
        }

        static {
            HealthVersionCodeRespose healthVersionCodeRespose = new HealthVersionCodeRespose();
            DEFAULT_INSTANCE = healthVersionCodeRespose;
            GeneratedMessageLite.registerDefaultInstance(HealthVersionCodeRespose.class, healthVersionCodeRespose);
        }

        private HealthVersionCodeRespose() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResult() {
            this.result_ = 0;
        }

        public static HealthVersionCodeRespose getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HealthVersionCodeRespose parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthVersionCodeRespose parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HealthVersionCodeRespose> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(int i) {
            this.result_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new HealthVersionCodeRespose();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"result_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HealthVersionCodeRespose> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HealthVersionCodeRespose.class) {
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

        @Override // com.op.proto.HealthVersionInfo.HealthVersionCodeResposeOrBuilder
        public int getResult() {
            return this.result_;
        }

        public static Builder newBuilder(HealthVersionCodeRespose healthVersionCodeRespose) {
            return DEFAULT_INSTANCE.createBuilder(healthVersionCodeRespose);
        }

        public static HealthVersionCodeRespose parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HealthVersionCodeRespose parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HealthVersionCodeRespose parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HealthVersionCodeRespose parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HealthVersionCodeRespose parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HealthVersionCodeRespose parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HealthVersionCodeRespose parseFrom(InputStream inputStream) throws IOException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthVersionCodeRespose parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HealthVersionCodeRespose parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HealthVersionCodeRespose parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HealthVersionCodeRespose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface HealthVersionCodeResposeOrBuilder extends MessageLiteOrBuilder {
        int getResult();
    }

    private HealthVersionInfo() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
