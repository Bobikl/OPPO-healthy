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
public final class HeartRateMeasure {

    /* JADX INFO: renamed from: com.op.proto.HeartRateMeasure$1, reason: invalid class name */
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

    public static final class HeartRateMeasureData extends GeneratedMessageLite<HeartRateMeasureData, Builder> implements HeartRateMeasureDataOrBuilder {
        private static final HeartRateMeasureData DEFAULT_INSTANCE;
        public static final int INTERVAL_FIELD_NUMBER = 2;
        private static volatile Parser<HeartRateMeasureData> PARSER = null;
        public static final int SW_FIELD_NUMBER = 1;
        private int interval_;
        private int sw_;

        public static final class Builder extends GeneratedMessageLite.Builder<HeartRateMeasureData, Builder> implements HeartRateMeasureDataOrBuilder {
            public Builder clearInterval() {
                copyOnWrite();
                ((HeartRateMeasureData) ((GeneratedMessageLite.Builder) this).instance).clearInterval();
                return this;
            }

            public Builder clearSw() {
                copyOnWrite();
                ((HeartRateMeasureData) ((GeneratedMessageLite.Builder) this).instance).clearSw();
                return this;
            }

            @Override // com.op.proto.HeartRateMeasure.HeartRateMeasureDataOrBuilder
            public int getInterval() {
                return ((HeartRateMeasureData) ((GeneratedMessageLite.Builder) this).instance).getInterval();
            }

            @Override // com.op.proto.HeartRateMeasure.HeartRateMeasureDataOrBuilder
            public int getSw() {
                return ((HeartRateMeasureData) ((GeneratedMessageLite.Builder) this).instance).getSw();
            }

            public Builder setInterval(int i) {
                copyOnWrite();
                ((HeartRateMeasureData) ((GeneratedMessageLite.Builder) this).instance).setInterval(i);
                return this;
            }

            public Builder setSw(int i) {
                copyOnWrite();
                ((HeartRateMeasureData) ((GeneratedMessageLite.Builder) this).instance).setSw(i);
                return this;
            }

            private Builder() {
                super(HeartRateMeasureData.DEFAULT_INSTANCE);
            }
        }

        static {
            HeartRateMeasureData heartRateMeasureData = new HeartRateMeasureData();
            DEFAULT_INSTANCE = heartRateMeasureData;
            GeneratedMessageLite.registerDefaultInstance(HeartRateMeasureData.class, heartRateMeasureData);
        }

        private HeartRateMeasureData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInterval() {
            this.interval_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSw() {
            this.sw_ = 0;
        }

        public static HeartRateMeasureData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HeartRateMeasureData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateMeasureData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HeartRateMeasureData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterval(int i) {
            this.interval_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSw(int i) {
            this.sw_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new HeartRateMeasureData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"sw_", "interval_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HeartRateMeasureData.class) {
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

        @Override // com.op.proto.HeartRateMeasure.HeartRateMeasureDataOrBuilder
        public int getInterval() {
            return this.interval_;
        }

        @Override // com.op.proto.HeartRateMeasure.HeartRateMeasureDataOrBuilder
        public int getSw() {
            return this.sw_;
        }

        public static Builder newBuilder(HeartRateMeasureData heartRateMeasureData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(heartRateMeasureData);
        }

        public static HeartRateMeasureData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartRateMeasureData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeartRateMeasureData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeartRateMeasureData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeartRateMeasureData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartRateMeasureData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeartRateMeasureData parseFrom(InputStream inputStream) throws IOException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateMeasureData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartRateMeasureData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeartRateMeasureData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeartRateMeasureData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface HeartRateMeasureDataOrBuilder extends MessageLiteOrBuilder {
        int getInterval();

        int getSw();
    }

    private HeartRateMeasure() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}