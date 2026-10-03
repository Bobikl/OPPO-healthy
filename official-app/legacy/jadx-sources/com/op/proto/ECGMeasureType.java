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
public final class ECGMeasureType {

    /* JADX INFO: renamed from: com.op.proto.ECGMeasureType$1, reason: invalid class name */
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

    public static final class ecg_measure_type_request_set_t extends GeneratedMessageLite<ecg_measure_type_request_set_t, Builder> implements ecg_measure_type_request_set_tOrBuilder {
        public static final int CAPSENSORTYPE_FIELD_NUMBER = 2;
        private static final ecg_measure_type_request_set_t DEFAULT_INSTANCE;
        public static final int LOWEST_VALUE_FIELD_NUMBER = 4;
        public static final int MAXIMUM_VALUE_FIELD_NUMBER = 3;
        public static final int MEASURETYPE_FIELD_NUMBER = 1;
        private static volatile Parser<ecg_measure_type_request_set_t> PARSER;
        private int capSensorType_;
        private int lowestValue_;
        private int maximumValue_;
        private int measureType_;

        public static final class Builder extends GeneratedMessageLite.Builder<ecg_measure_type_request_set_t, Builder> implements ecg_measure_type_request_set_tOrBuilder {
            public Builder clearCapSensorType() {
                copyOnWrite();
                ((ecg_measure_type_request_set_t) this.instance).clearCapSensorType();
                return this;
            }

            public Builder clearLowestValue() {
                copyOnWrite();
                ((ecg_measure_type_request_set_t) this.instance).clearLowestValue();
                return this;
            }

            public Builder clearMaximumValue() {
                copyOnWrite();
                ((ecg_measure_type_request_set_t) this.instance).clearMaximumValue();
                return this;
            }

            public Builder clearMeasureType() {
                copyOnWrite();
                ((ecg_measure_type_request_set_t) this.instance).clearMeasureType();
                return this;
            }

            @Override // com.op.proto.ECGMeasureType.ecg_measure_type_request_set_tOrBuilder
            public int getCapSensorType() {
                return ((ecg_measure_type_request_set_t) this.instance).getCapSensorType();
            }

            @Override // com.op.proto.ECGMeasureType.ecg_measure_type_request_set_tOrBuilder
            public int getLowestValue() {
                return ((ecg_measure_type_request_set_t) this.instance).getLowestValue();
            }

            @Override // com.op.proto.ECGMeasureType.ecg_measure_type_request_set_tOrBuilder
            public int getMaximumValue() {
                return ((ecg_measure_type_request_set_t) this.instance).getMaximumValue();
            }

            @Override // com.op.proto.ECGMeasureType.ecg_measure_type_request_set_tOrBuilder
            public int getMeasureType() {
                return ((ecg_measure_type_request_set_t) this.instance).getMeasureType();
            }

            public Builder setCapSensorType(int i) {
                copyOnWrite();
                ((ecg_measure_type_request_set_t) this.instance).setCapSensorType(i);
                return this;
            }

            public Builder setLowestValue(int i) {
                copyOnWrite();
                ((ecg_measure_type_request_set_t) this.instance).setLowestValue(i);
                return this;
            }

            public Builder setMaximumValue(int i) {
                copyOnWrite();
                ((ecg_measure_type_request_set_t) this.instance).setMaximumValue(i);
                return this;
            }

            public Builder setMeasureType(int i) {
                copyOnWrite();
                ((ecg_measure_type_request_set_t) this.instance).setMeasureType(i);
                return this;
            }

            private Builder() {
                super(ecg_measure_type_request_set_t.DEFAULT_INSTANCE);
            }
        }

        static {
            ecg_measure_type_request_set_t ecg_measure_type_request_set_tVar = new ecg_measure_type_request_set_t();
            DEFAULT_INSTANCE = ecg_measure_type_request_set_tVar;
            GeneratedMessageLite.registerDefaultInstance(ecg_measure_type_request_set_t.class, ecg_measure_type_request_set_tVar);
        }

        private ecg_measure_type_request_set_t() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCapSensorType() {
            this.capSensorType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowestValue() {
            this.lowestValue_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumValue() {
            this.maximumValue_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeasureType() {
            this.measureType_ = 0;
        }

        public static ecg_measure_type_request_set_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ecg_measure_type_request_set_t parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ecg_measure_type_request_set_t parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ecg_measure_type_request_set_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCapSensorType(int i) {
            this.capSensorType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowestValue(int i) {
            this.lowestValue_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumValue(int i) {
            this.maximumValue_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeasureType(int i) {
            this.measureType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ecg_measure_type_request_set_t();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"measureType_", "capSensorType_", "maximumValue_", "lowestValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ecg_measure_type_request_set_t> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ecg_measure_type_request_set_t.class) {
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

        @Override // com.op.proto.ECGMeasureType.ecg_measure_type_request_set_tOrBuilder
        public int getCapSensorType() {
            return this.capSensorType_;
        }

        @Override // com.op.proto.ECGMeasureType.ecg_measure_type_request_set_tOrBuilder
        public int getLowestValue() {
            return this.lowestValue_;
        }

        @Override // com.op.proto.ECGMeasureType.ecg_measure_type_request_set_tOrBuilder
        public int getMaximumValue() {
            return this.maximumValue_;
        }

        @Override // com.op.proto.ECGMeasureType.ecg_measure_type_request_set_tOrBuilder
        public int getMeasureType() {
            return this.measureType_;
        }

        public static Builder newBuilder(ecg_measure_type_request_set_t ecg_measure_type_request_set_tVar) {
            return DEFAULT_INSTANCE.createBuilder(ecg_measure_type_request_set_tVar);
        }

        public static ecg_measure_type_request_set_t parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ecg_measure_type_request_set_t parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ecg_measure_type_request_set_t parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ecg_measure_type_request_set_t parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ecg_measure_type_request_set_t parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ecg_measure_type_request_set_t parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ecg_measure_type_request_set_t parseFrom(InputStream inputStream) throws IOException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ecg_measure_type_request_set_t parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ecg_measure_type_request_set_t parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ecg_measure_type_request_set_t parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ecg_measure_type_request_set_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ecg_measure_type_request_set_tOrBuilder extends MessageLiteOrBuilder {
        int getCapSensorType();

        int getLowestValue();

        int getMaximumValue();

        int getMeasureType();
    }

    private ECGMeasureType() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
