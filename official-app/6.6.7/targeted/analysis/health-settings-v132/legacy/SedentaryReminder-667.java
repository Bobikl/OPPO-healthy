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
public final class SedentaryReminder {

    /* JADX INFO: renamed from: com.op.proto.SedentaryReminder$1, reason: invalid class name */
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

    public static final class SedentaryReminderData extends GeneratedMessageLite<SedentaryReminderData, Builder> implements SedentaryReminderDataOrBuilder {
        private static final SedentaryReminderData DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 1;
        public static final int END_TIME_FIELD_NUMBER = 3;
        public static final int EXCLUDE_MIDDAY_FIELD_NUMBER = 4;
        private static volatile Parser<SedentaryReminderData> PARSER = null;
        public static final int START_TIME_FIELD_NUMBER = 2;
        private int enable_;
        private int endTime_;
        private int excludeMidday_;
        private int startTime_;

        public static final class Builder extends GeneratedMessageLite.Builder<SedentaryReminderData, Builder> implements SedentaryReminderDataOrBuilder {
            public Builder clearEnable() {
                copyOnWrite();
                ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).clearEnable();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).clearEndTime();
                return this;
            }

            public Builder clearExcludeMidday() {
                copyOnWrite();
                ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).clearExcludeMidday();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).clearStartTime();
                return this;
            }

            @Override // com.op.proto.SedentaryReminder.SedentaryReminderDataOrBuilder
            public int getEnable() {
                return ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).getEnable();
            }

            @Override // com.op.proto.SedentaryReminder.SedentaryReminderDataOrBuilder
            public int getEndTime() {
                return ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).getEndTime();
            }

            @Override // com.op.proto.SedentaryReminder.SedentaryReminderDataOrBuilder
            public int getExcludeMidday() {
                return ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).getExcludeMidday();
            }

            @Override // com.op.proto.SedentaryReminder.SedentaryReminderDataOrBuilder
            public int getStartTime() {
                return ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).getStartTime();
            }

            public Builder setEnable(int i) {
                copyOnWrite();
                ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).setEnable(i);
                return this;
            }

            public Builder setEndTime(int i) {
                copyOnWrite();
                ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).setEndTime(i);
                return this;
            }

            public Builder setExcludeMidday(int i) {
                copyOnWrite();
                ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).setExcludeMidday(i);
                return this;
            }

            public Builder setStartTime(int i) {
                copyOnWrite();
                ((SedentaryReminderData) ((GeneratedMessageLite.Builder) this).instance).setStartTime(i);
                return this;
            }

            private Builder() {
                super(SedentaryReminderData.DEFAULT_INSTANCE);
            }
        }

        static {
            SedentaryReminderData sedentaryReminderData = new SedentaryReminderData();
            DEFAULT_INSTANCE = sedentaryReminderData;
            GeneratedMessageLite.registerDefaultInstance(SedentaryReminderData.class, sedentaryReminderData);
        }

        private SedentaryReminderData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnable() {
            this.enable_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExcludeMidday() {
            this.excludeMidday_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = 0;
        }

        public static SedentaryReminderData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SedentaryReminderData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SedentaryReminderData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SedentaryReminderData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SedentaryReminderData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnable(int i) {
            this.enable_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(int i) {
            this.endTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExcludeMidday(int i) {
            this.excludeMidday_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(int i) {
            this.startTime_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new SedentaryReminderData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"enable_", "startTime_", "endTime_", "excludeMidday_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SedentaryReminderData.class) {
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

        @Override // com.op.proto.SedentaryReminder.SedentaryReminderDataOrBuilder
        public int getEnable() {
            return this.enable_;
        }

        @Override // com.op.proto.SedentaryReminder.SedentaryReminderDataOrBuilder
        public int getEndTime() {
            return this.endTime_;
        }

        @Override // com.op.proto.SedentaryReminder.SedentaryReminderDataOrBuilder
        public int getExcludeMidday() {
            return this.excludeMidday_;
        }

        @Override // com.op.proto.SedentaryReminder.SedentaryReminderDataOrBuilder
        public int getStartTime() {
            return this.startTime_;
        }

        public static Builder newBuilder(SedentaryReminderData sedentaryReminderData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sedentaryReminderData);
        }

        public static SedentaryReminderData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SedentaryReminderData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SedentaryReminderData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SedentaryReminderData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SedentaryReminderData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SedentaryReminderData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SedentaryReminderData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SedentaryReminderData parseFrom(InputStream inputStream) throws IOException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SedentaryReminderData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SedentaryReminderData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SedentaryReminderData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SedentaryReminderData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SedentaryReminderDataOrBuilder extends MessageLiteOrBuilder {
        int getEnable();

        int getEndTime();

        int getExcludeMidday();

        int getStartTime();
    }

    private SedentaryReminder() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}