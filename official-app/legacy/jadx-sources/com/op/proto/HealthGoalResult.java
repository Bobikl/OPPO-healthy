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
public final class HealthGoalResult {

    /* JADX INFO: renamed from: com.op.proto.HealthGoalResult$1, reason: invalid class name */
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

    public static final class HealthGoalResultData extends GeneratedMessageLite<HealthGoalResultData, Builder> implements HealthGoalResultDataOrBuilder {
        private static final HealthGoalResultData DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        private static volatile Parser<HealthGoalResultData> PARSER;
        private int errorCode_;

        public static final class Builder extends GeneratedMessageLite.Builder<HealthGoalResultData, Builder> implements HealthGoalResultDataOrBuilder {
            public Builder clearErrorCode() {
                copyOnWrite();
                ((HealthGoalResultData) this.instance).clearErrorCode();
                return this;
            }

            @Override // com.op.proto.HealthGoalResult.HealthGoalResultDataOrBuilder
            public int getErrorCode() {
                return ((HealthGoalResultData) this.instance).getErrorCode();
            }

            public Builder setErrorCode(int i) {
                copyOnWrite();
                ((HealthGoalResultData) this.instance).setErrorCode(i);
                return this;
            }

            private Builder() {
                super(HealthGoalResultData.DEFAULT_INSTANCE);
            }
        }

        static {
            HealthGoalResultData healthGoalResultData = new HealthGoalResultData();
            DEFAULT_INSTANCE = healthGoalResultData;
            GeneratedMessageLite.registerDefaultInstance(HealthGoalResultData.class, healthGoalResultData);
        }

        private HealthGoalResultData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        public static HealthGoalResultData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HealthGoalResultData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HealthGoalResultData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthGoalResultData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HealthGoalResultData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.errorCode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new HealthGoalResultData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"errorCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HealthGoalResultData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HealthGoalResultData.class) {
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

        @Override // com.op.proto.HealthGoalResult.HealthGoalResultDataOrBuilder
        public int getErrorCode() {
            return this.errorCode_;
        }

        public static Builder newBuilder(HealthGoalResultData healthGoalResultData) {
            return DEFAULT_INSTANCE.createBuilder(healthGoalResultData);
        }

        public static HealthGoalResultData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HealthGoalResultData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HealthGoalResultData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HealthGoalResultData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HealthGoalResultData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HealthGoalResultData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HealthGoalResultData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HealthGoalResultData parseFrom(InputStream inputStream) throws IOException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthGoalResultData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HealthGoalResultData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HealthGoalResultData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HealthGoalResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface HealthGoalResultDataOrBuilder extends MessageLiteOrBuilder {
        int getErrorCode();
    }

    private HealthGoalResult() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
