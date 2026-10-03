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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes4.dex */
public final class HeartRateWarn {

    /* JADX INFO: renamed from: com.op.proto.HeartRateWarn$1, reason: invalid class name */
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

    public static final class HeartRateWarnData extends GeneratedMessageLite<HeartRateWarnData, Builder> implements HeartRateWarnDataOrBuilder {
        private static final HeartRateWarnData DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 1;
        public static final int HEART_RATE_FIELD_NUMBER = 2;
        private static volatile Parser<HeartRateWarnData> PARSER;
        private int enable_;
        private int heartRate_;

        public static final class Builder extends GeneratedMessageLite.Builder<HeartRateWarnData, Builder> implements HeartRateWarnDataOrBuilder {
            public Builder clearEnable() {
                copyOnWrite();
                ((HeartRateWarnData) ((GeneratedMessageLite.Builder) this).instance).clearEnable();
                return this;
            }

            public Builder clearHeartRate() {
                copyOnWrite();
                ((HeartRateWarnData) ((GeneratedMessageLite.Builder) this).instance).clearHeartRate();
                return this;
            }

            @Override // com.op.proto.HeartRateWarn.HeartRateWarnDataOrBuilder
            public int getEnable() {
                return ((HeartRateWarnData) ((GeneratedMessageLite.Builder) this).instance).getEnable();
            }

            @Override // com.op.proto.HeartRateWarn.HeartRateWarnDataOrBuilder
            public int getHeartRate() {
                return ((HeartRateWarnData) ((GeneratedMessageLite.Builder) this).instance).getHeartRate();
            }

            public Builder setEnable(int i) {
                copyOnWrite();
                ((HeartRateWarnData) ((GeneratedMessageLite.Builder) this).instance).setEnable(i);
                return this;
            }

            public Builder setHeartRate(int i) {
                copyOnWrite();
                ((HeartRateWarnData) ((GeneratedMessageLite.Builder) this).instance).setHeartRate(i);
                return this;
            }

            private Builder() {
                super(HeartRateWarnData.DEFAULT_INSTANCE);
            }
        }

        static {
            HeartRateWarnData heartRateWarnData = new HeartRateWarnData();
            DEFAULT_INSTANCE = heartRateWarnData;
            GeneratedMessageLite.registerDefaultInstance(HeartRateWarnData.class, heartRateWarnData);
        }

        private HeartRateWarnData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnable() {
            this.enable_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartRate() {
            this.heartRate_ = 0;
        }

        public static HeartRateWarnData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HeartRateWarnData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeartRateWarnData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateWarnData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HeartRateWarnData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnable(int i) {
            this.enable_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartRate(int i) {
            this.heartRate_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new HeartRateWarnData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"enable_", "heartRate_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HeartRateWarnData.class) {
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

        @Override // com.op.proto.HeartRateWarn.HeartRateWarnDataOrBuilder
        public int getEnable() {
            return this.enable_;
        }

        @Override // com.op.proto.HeartRateWarn.HeartRateWarnDataOrBuilder
        public int getHeartRate() {
            return this.heartRate_;
        }

        public static Builder newBuilder(HeartRateWarnData heartRateWarnData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(heartRateWarnData);
        }

        public static HeartRateWarnData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeartRateWarnData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartRateWarnData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeartRateWarnData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeartRateWarnData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeartRateWarnData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartRateWarnData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeartRateWarnData parseFrom(InputStream inputStream) throws IOException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateWarnData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartRateWarnData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeartRateWarnData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface HeartRateWarnDataOrBuilder extends MessageLiteOrBuilder {
        int getEnable();

        int getHeartRate();
    }

    private HeartRateWarn() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}