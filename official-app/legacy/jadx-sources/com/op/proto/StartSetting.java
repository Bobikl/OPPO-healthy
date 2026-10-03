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
public final class StartSetting {

    /* JADX INFO: renamed from: com.op.proto.StartSetting$1, reason: invalid class name */
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

    public static final class StartSettingData extends GeneratedMessageLite<StartSettingData, Builder> implements StartSettingDataOrBuilder {
        private static final StartSettingData DEFAULT_INSTANCE;
        private static volatile Parser<StartSettingData> PARSER = null;
        public static final int START_SETTING_FIELD_NUMBER = 1;
        public static final int START_SETTING_RESULT_FIELD_NUMBER = 2;
        private int startSettingResult_;
        private int startSetting_;

        public static final class Builder extends GeneratedMessageLite.Builder<StartSettingData, Builder> implements StartSettingDataOrBuilder {
            public Builder clearStartSetting() {
                copyOnWrite();
                ((StartSettingData) this.instance).clearStartSetting();
                return this;
            }

            public Builder clearStartSettingResult() {
                copyOnWrite();
                ((StartSettingData) this.instance).clearStartSettingResult();
                return this;
            }

            @Override // com.op.proto.StartSetting.StartSettingDataOrBuilder
            public int getStartSetting() {
                return ((StartSettingData) this.instance).getStartSetting();
            }

            @Override // com.op.proto.StartSetting.StartSettingDataOrBuilder
            public int getStartSettingResult() {
                return ((StartSettingData) this.instance).getStartSettingResult();
            }

            public Builder setStartSetting(int i) {
                copyOnWrite();
                ((StartSettingData) this.instance).setStartSetting(i);
                return this;
            }

            public Builder setStartSettingResult(int i) {
                copyOnWrite();
                ((StartSettingData) this.instance).setStartSettingResult(i);
                return this;
            }

            private Builder() {
                super(StartSettingData.DEFAULT_INSTANCE);
            }
        }

        static {
            StartSettingData startSettingData = new StartSettingData();
            DEFAULT_INSTANCE = startSettingData;
            GeneratedMessageLite.registerDefaultInstance(StartSettingData.class, startSettingData);
        }

        private StartSettingData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartSetting() {
            this.startSetting_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartSettingResult() {
            this.startSettingResult_ = 0;
        }

        public static StartSettingData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartSettingData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StartSettingData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartSettingData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartSettingData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartSetting(int i) {
            this.startSetting_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartSettingResult(int i) {
            this.startSettingResult_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new StartSettingData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"startSetting_", "startSettingResult_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StartSettingData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (StartSettingData.class) {
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

        @Override // com.op.proto.StartSetting.StartSettingDataOrBuilder
        public int getStartSetting() {
            return this.startSetting_;
        }

        @Override // com.op.proto.StartSetting.StartSettingDataOrBuilder
        public int getStartSettingResult() {
            return this.startSettingResult_;
        }

        public static Builder newBuilder(StartSettingData startSettingData) {
            return DEFAULT_INSTANCE.createBuilder(startSettingData);
        }

        public static StartSettingData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartSettingData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartSettingData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StartSettingData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartSettingData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartSettingData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartSettingData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartSettingData parseFrom(InputStream inputStream) throws IOException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartSettingData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartSettingData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartSettingData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StartSettingData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface StartSettingDataOrBuilder extends MessageLiteOrBuilder {
        int getStartSetting();

        int getStartSettingResult();
    }

    private StartSetting() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
