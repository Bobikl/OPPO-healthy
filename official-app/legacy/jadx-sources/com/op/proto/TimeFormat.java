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
public final class TimeFormat {

    /* JADX INFO: renamed from: com.op.proto.TimeFormat$1, reason: invalid class name */
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

    public static final class date_time_display_t extends GeneratedMessageLite<date_time_display_t, Builder> implements date_time_display_tOrBuilder {
        public static final int DATE_DISPLAY_TYPE_FIELD_NUMBER = 2;
        private static final date_time_display_t DEFAULT_INSTANCE;
        private static volatile Parser<date_time_display_t> PARSER = null;
        public static final int TIME_DISPLAY_TYPE_FIELD_NUMBER = 1;
        private int dateDisplayType_;
        private int timeDisplayType_;

        public static final class Builder extends GeneratedMessageLite.Builder<date_time_display_t, Builder> implements date_time_display_tOrBuilder {
            public Builder clearDateDisplayType() {
                copyOnWrite();
                ((date_time_display_t) this.instance).clearDateDisplayType();
                return this;
            }

            public Builder clearTimeDisplayType() {
                copyOnWrite();
                ((date_time_display_t) this.instance).clearTimeDisplayType();
                return this;
            }

            @Override // com.op.proto.TimeFormat.date_time_display_tOrBuilder
            public int getDateDisplayType() {
                return ((date_time_display_t) this.instance).getDateDisplayType();
            }

            @Override // com.op.proto.TimeFormat.date_time_display_tOrBuilder
            public int getTimeDisplayType() {
                return ((date_time_display_t) this.instance).getTimeDisplayType();
            }

            public Builder setDateDisplayType(int i) {
                copyOnWrite();
                ((date_time_display_t) this.instance).setDateDisplayType(i);
                return this;
            }

            public Builder setTimeDisplayType(int i) {
                copyOnWrite();
                ((date_time_display_t) this.instance).setTimeDisplayType(i);
                return this;
            }

            private Builder() {
                super(date_time_display_t.DEFAULT_INSTANCE);
            }
        }

        static {
            date_time_display_t date_time_display_tVar = new date_time_display_t();
            DEFAULT_INSTANCE = date_time_display_tVar;
            GeneratedMessageLite.registerDefaultInstance(date_time_display_t.class, date_time_display_tVar);
        }

        private date_time_display_t() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDateDisplayType() {
            this.dateDisplayType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeDisplayType() {
            this.timeDisplayType_ = 0;
        }

        public static date_time_display_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static date_time_display_t parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (date_time_display_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static date_time_display_t parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<date_time_display_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDateDisplayType(int i) {
            this.dateDisplayType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeDisplayType(int i) {
            this.timeDisplayType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new date_time_display_t();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"timeDisplayType_", "dateDisplayType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<date_time_display_t> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (date_time_display_t.class) {
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

        @Override // com.op.proto.TimeFormat.date_time_display_tOrBuilder
        public int getDateDisplayType() {
            return this.dateDisplayType_;
        }

        @Override // com.op.proto.TimeFormat.date_time_display_tOrBuilder
        public int getTimeDisplayType() {
            return this.timeDisplayType_;
        }

        public static Builder newBuilder(date_time_display_t date_time_display_tVar) {
            return DEFAULT_INSTANCE.createBuilder(date_time_display_tVar);
        }

        public static date_time_display_t parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (date_time_display_t) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static date_time_display_t parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static date_time_display_t parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static date_time_display_t parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static date_time_display_t parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static date_time_display_t parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static date_time_display_t parseFrom(InputStream inputStream) throws IOException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static date_time_display_t parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static date_time_display_t parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static date_time_display_t parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (date_time_display_t) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface date_time_display_tOrBuilder extends MessageLiteOrBuilder {
        int getDateDisplayType();

        int getTimeDisplayType();
    }

    private TimeFormat() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
