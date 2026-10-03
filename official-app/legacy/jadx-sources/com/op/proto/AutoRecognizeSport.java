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
public final class AutoRecognizeSport {

    /* JADX INFO: renamed from: com.op.proto.AutoRecognizeSport$1, reason: invalid class name */
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

    public static final class AutoRecognizeSportData extends GeneratedMessageLite<AutoRecognizeSportData, Builder> implements AutoRecognizeSportDataOrBuilder {
        public static final int CONTINUOUS_TIME_FIELD_NUMBER = 2;
        private static final AutoRecognizeSportData DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 1;
        private static volatile Parser<AutoRecognizeSportData> PARSER;
        private int continuousTime_;
        private int enable_;

        public static final class Builder extends GeneratedMessageLite.Builder<AutoRecognizeSportData, Builder> implements AutoRecognizeSportDataOrBuilder {
            public Builder clearContinuousTime() {
                copyOnWrite();
                ((AutoRecognizeSportData) this.instance).clearContinuousTime();
                return this;
            }

            public Builder clearEnable() {
                copyOnWrite();
                ((AutoRecognizeSportData) this.instance).clearEnable();
                return this;
            }

            @Override // com.op.proto.AutoRecognizeSport.AutoRecognizeSportDataOrBuilder
            public int getContinuousTime() {
                return ((AutoRecognizeSportData) this.instance).getContinuousTime();
            }

            @Override // com.op.proto.AutoRecognizeSport.AutoRecognizeSportDataOrBuilder
            public int getEnable() {
                return ((AutoRecognizeSportData) this.instance).getEnable();
            }

            public Builder setContinuousTime(int i) {
                copyOnWrite();
                ((AutoRecognizeSportData) this.instance).setContinuousTime(i);
                return this;
            }

            public Builder setEnable(int i) {
                copyOnWrite();
                ((AutoRecognizeSportData) this.instance).setEnable(i);
                return this;
            }

            private Builder() {
                super(AutoRecognizeSportData.DEFAULT_INSTANCE);
            }
        }

        static {
            AutoRecognizeSportData autoRecognizeSportData = new AutoRecognizeSportData();
            DEFAULT_INSTANCE = autoRecognizeSportData;
            GeneratedMessageLite.registerDefaultInstance(AutoRecognizeSportData.class, autoRecognizeSportData);
        }

        private AutoRecognizeSportData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContinuousTime() {
            this.continuousTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnable() {
            this.enable_ = 0;
        }

        public static AutoRecognizeSportData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AutoRecognizeSportData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoRecognizeSportData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AutoRecognizeSportData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContinuousTime(int i) {
            this.continuousTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnable(int i) {
            this.enable_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new AutoRecognizeSportData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"enable_", "continuousTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AutoRecognizeSportData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AutoRecognizeSportData.class) {
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

        @Override // com.op.proto.AutoRecognizeSport.AutoRecognizeSportDataOrBuilder
        public int getContinuousTime() {
            return this.continuousTime_;
        }

        @Override // com.op.proto.AutoRecognizeSport.AutoRecognizeSportDataOrBuilder
        public int getEnable() {
            return this.enable_;
        }

        public static Builder newBuilder(AutoRecognizeSportData autoRecognizeSportData) {
            return DEFAULT_INSTANCE.createBuilder(autoRecognizeSportData);
        }

        public static AutoRecognizeSportData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AutoRecognizeSportData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AutoRecognizeSportData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AutoRecognizeSportData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AutoRecognizeSportData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AutoRecognizeSportData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AutoRecognizeSportData parseFrom(InputStream inputStream) throws IOException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoRecognizeSportData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AutoRecognizeSportData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AutoRecognizeSportData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AutoRecognizeSportData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AutoRecognizeSportDataOrBuilder extends MessageLiteOrBuilder {
        int getContinuousTime();

        int getEnable();
    }

    private AutoRecognizeSport() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
