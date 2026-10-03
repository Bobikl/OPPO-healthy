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
public final class OximetryState {

    /* JADX INFO: renamed from: com.op.proto.OximetryState$1, reason: invalid class name */
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

    public static final class SleepSetting_t extends GeneratedMessageLite<SleepSetting_t, Builder> implements SleepSetting_tOrBuilder {
        private static final SleepSetting_t DEFAULT_INSTANCE;
        private static volatile Parser<SleepSetting_t> PARSER = null;
        public static final int SPO2DETECTINSLEEP_FIELD_NUMBER = 1;
        public static final int SPO2DETECTINSLEEP_TYPE_FIELD_NUMBER = 2;
        private int spo2DetectInSleepType_;
        private int spo2DetectInSleep_;

        public static final class Builder extends GeneratedMessageLite.Builder<SleepSetting_t, Builder> implements SleepSetting_tOrBuilder {
            public Builder clearSpo2DetectInSleep() {
                copyOnWrite();
                ((SleepSetting_t) ((GeneratedMessageLite.Builder) this).instance).clearSpo2DetectInSleep();
                return this;
            }

            public Builder clearSpo2DetectInSleepType() {
                copyOnWrite();
                ((SleepSetting_t) ((GeneratedMessageLite.Builder) this).instance).clearSpo2DetectInSleepType();
                return this;
            }

            @Override // com.op.proto.OximetryState.SleepSetting_tOrBuilder
            public int getSpo2DetectInSleep() {
                return ((SleepSetting_t) ((GeneratedMessageLite.Builder) this).instance).getSpo2DetectInSleep();
            }

            @Override // com.op.proto.OximetryState.SleepSetting_tOrBuilder
            public int getSpo2DetectInSleepType() {
                return ((SleepSetting_t) ((GeneratedMessageLite.Builder) this).instance).getSpo2DetectInSleepType();
            }

            public Builder setSpo2DetectInSleep(int i) {
                copyOnWrite();
                ((SleepSetting_t) ((GeneratedMessageLite.Builder) this).instance).setSpo2DetectInSleep(i);
                return this;
            }

            public Builder setSpo2DetectInSleepType(int i) {
                copyOnWrite();
                ((SleepSetting_t) ((GeneratedMessageLite.Builder) this).instance).setSpo2DetectInSleepType(i);
                return this;
            }

            private Builder() {
                super(SleepSetting_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SleepSetting_t sleepSetting_t = new SleepSetting_t();
            DEFAULT_INSTANCE = sleepSetting_t;
            GeneratedMessageLite.registerDefaultInstance(SleepSetting_t.class, sleepSetting_t);
        }

        private SleepSetting_t() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpo2DetectInSleep() {
            this.spo2DetectInSleep_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpo2DetectInSleepType() {
            this.spo2DetectInSleepType_ = 0;
        }

        public static SleepSetting_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SleepSetting_t parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SleepSetting_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SleepSetting_t parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SleepSetting_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2DetectInSleep(int i) {
            this.spo2DetectInSleep_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2DetectInSleepType(int i) {
            this.spo2DetectInSleepType_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new SleepSetting_t();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"spo2DetectInSleep_", "spo2DetectInSleepType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SleepSetting_t.class) {
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

        @Override // com.op.proto.OximetryState.SleepSetting_tOrBuilder
        public int getSpo2DetectInSleep() {
            return this.spo2DetectInSleep_;
        }

        @Override // com.op.proto.OximetryState.SleepSetting_tOrBuilder
        public int getSpo2DetectInSleepType() {
            return this.spo2DetectInSleepType_;
        }

        public static Builder newBuilder(SleepSetting_t sleepSetting_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sleepSetting_t);
        }

        public static SleepSetting_t parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SleepSetting_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SleepSetting_t parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SleepSetting_t parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SleepSetting_t parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SleepSetting_t parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SleepSetting_t parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SleepSetting_t parseFrom(InputStream inputStream) throws IOException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SleepSetting_t parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SleepSetting_t parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SleepSetting_t parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SleepSetting_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SleepSetting_tOrBuilder extends MessageLiteOrBuilder {
        int getSpo2DetectInSleep();

        int getSpo2DetectInSleepType();
    }

    private OximetryState() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}