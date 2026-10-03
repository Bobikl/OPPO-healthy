package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class Extra extends GeneratedMessageLite<Extra, Builder> implements ExtraOrBuilder {
    private static final Extra DEFAULT_INSTANCE;
    public static final int ICONPROCESS_FIELD_NUMBER = 3;
    private static volatile Parser<Extra> PARSER = null;
    public static final int PROCESS_FIELD_NUMBER = 2;
    public static final int TEMPLATE_FIELD_NUMBER = 1;
    private int dataCase_ = 0;
    private Object data_;
    private int template_;

    public static final class Builder extends GeneratedMessageLite.Builder<Extra, Builder> implements ExtraOrBuilder {
        public Builder clearData() {
            copyOnWrite();
            ((Extra) this.instance).clearData();
            return this;
        }

        public Builder clearIconProcess() {
            copyOnWrite();
            ((Extra) this.instance).clearIconProcess();
            return this;
        }

        public Builder clearProcess() {
            copyOnWrite();
            ((Extra) this.instance).clearProcess();
            return this;
        }

        public Builder clearTemplate() {
            copyOnWrite();
            ((Extra) this.instance).clearTemplate();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ExtraOrBuilder
        public DataCase getDataCase() {
            return ((Extra) this.instance).getDataCase();
        }

        @Override // com.heytap.health.watch.notification.ExtraOrBuilder
        public TemplateIconProcess getIconProcess() {
            return ((Extra) this.instance).getIconProcess();
        }

        @Override // com.heytap.health.watch.notification.ExtraOrBuilder
        public TemplateProcess getProcess() {
            return ((Extra) this.instance).getProcess();
        }

        @Override // com.heytap.health.watch.notification.ExtraOrBuilder
        public int getTemplate() {
            return ((Extra) this.instance).getTemplate();
        }

        @Override // com.heytap.health.watch.notification.ExtraOrBuilder
        public boolean hasIconProcess() {
            return ((Extra) this.instance).hasIconProcess();
        }

        @Override // com.heytap.health.watch.notification.ExtraOrBuilder
        public boolean hasProcess() {
            return ((Extra) this.instance).hasProcess();
        }

        public Builder mergeIconProcess(TemplateIconProcess templateIconProcess) {
            copyOnWrite();
            ((Extra) this.instance).mergeIconProcess(templateIconProcess);
            return this;
        }

        public Builder mergeProcess(TemplateProcess templateProcess) {
            copyOnWrite();
            ((Extra) this.instance).mergeProcess(templateProcess);
            return this;
        }

        public Builder setIconProcess(TemplateIconProcess templateIconProcess) {
            copyOnWrite();
            ((Extra) this.instance).setIconProcess(templateIconProcess);
            return this;
        }

        public Builder setProcess(TemplateProcess templateProcess) {
            copyOnWrite();
            ((Extra) this.instance).setProcess(templateProcess);
            return this;
        }

        public Builder setTemplate(int i) {
            copyOnWrite();
            ((Extra) this.instance).setTemplate(i);
            return this;
        }

        private Builder() {
            super(Extra.DEFAULT_INSTANCE);
        }

        public Builder setIconProcess(TemplateIconProcess.Builder builder) {
            copyOnWrite();
            ((Extra) this.instance).setIconProcess(builder.build());
            return this;
        }

        public Builder setProcess(TemplateProcess.Builder builder) {
            copyOnWrite();
            ((Extra) this.instance).setProcess(builder.build());
            return this;
        }
    }

    public enum DataCase {
        PROCESS(2),
        ICONPROCESS(3),
        DATA_NOT_SET(0);

        private final int value;

        DataCase(int i) {
            this.value = i;
        }

        public static DataCase forNumber(int i) {
            if (i == 0) {
                return DATA_NOT_SET;
            }
            if (i == 2) {
                return PROCESS;
            }
            if (i != 3) {
                return null;
            }
            return ICONPROCESS;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Extra extra = new Extra();
        DEFAULT_INSTANCE = extra;
        GeneratedMessageLite.registerDefaultInstance(Extra.class, extra);
    }

    private Extra() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconProcess() {
        if (this.dataCase_ == 3) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcess() {
        if (this.dataCase_ == 2) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemplate() {
        this.template_ = 0;
    }

    public static Extra getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIconProcess(TemplateIconProcess templateIconProcess) {
        templateIconProcess.getClass();
        if (this.dataCase_ != 3 || this.data_ == TemplateIconProcess.getDefaultInstance()) {
            this.data_ = templateIconProcess;
        } else {
            this.data_ = TemplateIconProcess.newBuilder((TemplateIconProcess) this.data_).mergeFrom(templateIconProcess).buildPartial();
        }
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProcess(TemplateProcess templateProcess) {
        templateProcess.getClass();
        if (this.dataCase_ != 2 || this.data_ == TemplateProcess.getDefaultInstance()) {
            this.data_ = templateProcess;
        } else {
            this.data_ = TemplateProcess.newBuilder((TemplateProcess) this.data_).mergeFrom(templateProcess).buildPartial();
        }
        this.dataCase_ = 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Extra parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Extra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Extra parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Extra> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconProcess(TemplateIconProcess templateIconProcess) {
        templateIconProcess.getClass();
        this.data_ = templateIconProcess;
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcess(TemplateProcess templateProcess) {
        templateProcess.getClass();
        this.data_ = templateProcess;
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemplate(int i) {
        this.template_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Extra();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002<\u0000\u0003<\u0000", new Object[]{"data_", "dataCase_", "template_", TemplateProcess.class, TemplateIconProcess.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Extra> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Extra.class) {
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

    @Override // com.heytap.health.watch.notification.ExtraOrBuilder
    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    @Override // com.heytap.health.watch.notification.ExtraOrBuilder
    public TemplateIconProcess getIconProcess() {
        return this.dataCase_ == 3 ? (TemplateIconProcess) this.data_ : TemplateIconProcess.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.ExtraOrBuilder
    public TemplateProcess getProcess() {
        return this.dataCase_ == 2 ? (TemplateProcess) this.data_ : TemplateProcess.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.ExtraOrBuilder
    public int getTemplate() {
        return this.template_;
    }

    @Override // com.heytap.health.watch.notification.ExtraOrBuilder
    public boolean hasIconProcess() {
        return this.dataCase_ == 3;
    }

    @Override // com.heytap.health.watch.notification.ExtraOrBuilder
    public boolean hasProcess() {
        return this.dataCase_ == 2;
    }

    public static Builder newBuilder(Extra extra) {
        return DEFAULT_INSTANCE.createBuilder(extra);
    }

    public static Extra parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Extra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Extra parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Extra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Extra parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Extra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Extra parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Extra parseFrom(InputStream inputStream) throws IOException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Extra parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Extra parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Extra parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Extra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
