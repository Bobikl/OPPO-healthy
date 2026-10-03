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
public final class QuiteHeartRateWarn {

    /* JADX INFO: renamed from: com.op.proto.QuiteHeartRateWarn$1, reason: invalid class name */
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

    public static final class QuiteHeartRateWarnData extends GeneratedMessageLite<QuiteHeartRateWarnData, Builder> implements QuiteHeartRateWarnDataOrBuilder {
        private static final QuiteHeartRateWarnData DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 3;
        public static final int HIGH_FIELD_NUMBER = 1;
        public static final int LOW_FIELD_NUMBER = 2;
        private static volatile Parser<QuiteHeartRateWarnData> PARSER = null;
        public static final int SWITCH_FIELD_NUMBER = 4;
        private int duration_;
        private int high_;
        private int low_;
        private int switch_;

        public static final class Builder extends GeneratedMessageLite.Builder<QuiteHeartRateWarnData, Builder> implements QuiteHeartRateWarnDataOrBuilder {
            public Builder clearDuration() {
                copyOnWrite();
                ((QuiteHeartRateWarnData) this.instance).clearDuration();
                return this;
            }

            public Builder clearHigh() {
                copyOnWrite();
                ((QuiteHeartRateWarnData) this.instance).clearHigh();
                return this;
            }

            public Builder clearLow() {
                copyOnWrite();
                ((QuiteHeartRateWarnData) this.instance).clearLow();
                return this;
            }

            public Builder clearSwitch() {
                copyOnWrite();
                ((QuiteHeartRateWarnData) this.instance).clearSwitch();
                return this;
            }

            @Override // com.op.proto.QuiteHeartRateWarn.QuiteHeartRateWarnDataOrBuilder
            public int getDuration() {
                return ((QuiteHeartRateWarnData) this.instance).getDuration();
            }

            @Override // com.op.proto.QuiteHeartRateWarn.QuiteHeartRateWarnDataOrBuilder
            public int getHigh() {
                return ((QuiteHeartRateWarnData) this.instance).getHigh();
            }

            @Override // com.op.proto.QuiteHeartRateWarn.QuiteHeartRateWarnDataOrBuilder
            public int getLow() {
                return ((QuiteHeartRateWarnData) this.instance).getLow();
            }

            @Override // com.op.proto.QuiteHeartRateWarn.QuiteHeartRateWarnDataOrBuilder
            public int getSwitch() {
                return ((QuiteHeartRateWarnData) this.instance).getSwitch();
            }

            public Builder setDuration(int i) {
                copyOnWrite();
                ((QuiteHeartRateWarnData) this.instance).setDuration(i);
                return this;
            }

            public Builder setHigh(int i) {
                copyOnWrite();
                ((QuiteHeartRateWarnData) this.instance).setHigh(i);
                return this;
            }

            public Builder setLow(int i) {
                copyOnWrite();
                ((QuiteHeartRateWarnData) this.instance).setLow(i);
                return this;
            }

            public Builder setSwitch(int i) {
                copyOnWrite();
                ((QuiteHeartRateWarnData) this.instance).setSwitch(i);
                return this;
            }

            private Builder() {
                super(QuiteHeartRateWarnData.DEFAULT_INSTANCE);
            }
        }

        static {
            QuiteHeartRateWarnData quiteHeartRateWarnData = new QuiteHeartRateWarnData();
            DEFAULT_INSTANCE = quiteHeartRateWarnData;
            GeneratedMessageLite.registerDefaultInstance(QuiteHeartRateWarnData.class, quiteHeartRateWarnData);
        }

        private QuiteHeartRateWarnData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHigh() {
            this.high_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLow() {
            this.low_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwitch() {
            this.switch_ = 0;
        }

        public static QuiteHeartRateWarnData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static QuiteHeartRateWarnData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuiteHeartRateWarnData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<QuiteHeartRateWarnData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(int i) {
            this.duration_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHigh(int i) {
            this.high_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLow(int i) {
            this.low_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwitch(int i) {
            this.switch_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new QuiteHeartRateWarnData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"high_", "low_", "duration_", "switch_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<QuiteHeartRateWarnData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (QuiteHeartRateWarnData.class) {
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

        @Override // com.op.proto.QuiteHeartRateWarn.QuiteHeartRateWarnDataOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.op.proto.QuiteHeartRateWarn.QuiteHeartRateWarnDataOrBuilder
        public int getHigh() {
            return this.high_;
        }

        @Override // com.op.proto.QuiteHeartRateWarn.QuiteHeartRateWarnDataOrBuilder
        public int getLow() {
            return this.low_;
        }

        @Override // com.op.proto.QuiteHeartRateWarn.QuiteHeartRateWarnDataOrBuilder
        public int getSwitch() {
            return this.switch_;
        }

        public static Builder newBuilder(QuiteHeartRateWarnData quiteHeartRateWarnData) {
            return DEFAULT_INSTANCE.createBuilder(quiteHeartRateWarnData);
        }

        public static QuiteHeartRateWarnData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QuiteHeartRateWarnData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static QuiteHeartRateWarnData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static QuiteHeartRateWarnData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static QuiteHeartRateWarnData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QuiteHeartRateWarnData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static QuiteHeartRateWarnData parseFrom(InputStream inputStream) throws IOException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QuiteHeartRateWarnData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QuiteHeartRateWarnData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static QuiteHeartRateWarnData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QuiteHeartRateWarnData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface QuiteHeartRateWarnDataOrBuilder extends MessageLiteOrBuilder {
        int getDuration();

        int getHigh();

        int getLow();

        int getSwitch();
    }

    private QuiteHeartRateWarn() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
