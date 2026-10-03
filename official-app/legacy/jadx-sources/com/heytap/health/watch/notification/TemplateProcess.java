package com.heytap.health.watch.notification;

import com.google.protobuf.AbstractMessageLite;
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
public final class TemplateProcess extends GeneratedMessageLite<TemplateProcess, Builder> implements TemplateProcessOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 4;
    public static final int CURRENTPROCESS_FIELD_NUMBER = 2;
    private static final TemplateProcess DEFAULT_INSTANCE;
    private static volatile Parser<TemplateProcess> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TOTALPROCESS_FIELD_NUMBER = 1;
    private int currentProcess_;
    private int totalProcess_;
    private String title_ = "";
    private String content_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<TemplateProcess, Builder> implements TemplateProcessOrBuilder {
        public Builder clearContent() {
            copyOnWrite();
            ((TemplateProcess) this.instance).clearContent();
            return this;
        }

        public Builder clearCurrentProcess() {
            copyOnWrite();
            ((TemplateProcess) this.instance).clearCurrentProcess();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((TemplateProcess) this.instance).clearTitle();
            return this;
        }

        public Builder clearTotalProcess() {
            copyOnWrite();
            ((TemplateProcess) this.instance).clearTotalProcess();
            return this;
        }

        @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
        public String getContent() {
            return ((TemplateProcess) this.instance).getContent();
        }

        @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
        public ByteString getContentBytes() {
            return ((TemplateProcess) this.instance).getContentBytes();
        }

        @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
        public int getCurrentProcess() {
            return ((TemplateProcess) this.instance).getCurrentProcess();
        }

        @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
        public String getTitle() {
            return ((TemplateProcess) this.instance).getTitle();
        }

        @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
        public ByteString getTitleBytes() {
            return ((TemplateProcess) this.instance).getTitleBytes();
        }

        @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
        public int getTotalProcess() {
            return ((TemplateProcess) this.instance).getTotalProcess();
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((TemplateProcess) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((TemplateProcess) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setCurrentProcess(int i) {
            copyOnWrite();
            ((TemplateProcess) this.instance).setCurrentProcess(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((TemplateProcess) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((TemplateProcess) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTotalProcess(int i) {
            copyOnWrite();
            ((TemplateProcess) this.instance).setTotalProcess(i);
            return this;
        }

        private Builder() {
            super(TemplateProcess.DEFAULT_INSTANCE);
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
        TemplateProcess templateProcess = new TemplateProcess();
        DEFAULT_INSTANCE = templateProcess;
        GeneratedMessageLite.registerDefaultInstance(TemplateProcess.class, templateProcess);
    }

    private TemplateProcess() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentProcess() {
        this.currentProcess_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalProcess() {
        this.totalProcess_ = 0;
    }

    public static TemplateProcess getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TemplateProcess parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TemplateProcess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TemplateProcess parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TemplateProcess> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentProcess(int i) {
        this.currentProcess_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalProcess(int i) {
        this.totalProcess_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new TemplateProcess();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"totalProcess_", "currentProcess_", "title_", "content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TemplateProcess> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TemplateProcess.class) {
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

    @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
    public String getContent() {
        return this.content_;
    }

    @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
    public int getCurrentProcess() {
        return this.currentProcess_;
    }

    @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.heytap.health.watch.notification.TemplateProcessOrBuilder
    public int getTotalProcess() {
        return this.totalProcess_;
    }

    public static Builder newBuilder(TemplateProcess templateProcess) {
        return DEFAULT_INSTANCE.createBuilder(templateProcess);
    }

    public static TemplateProcess parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TemplateProcess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TemplateProcess parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TemplateProcess parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TemplateProcess parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TemplateProcess parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TemplateProcess parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TemplateProcess parseFrom(InputStream inputStream) throws IOException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TemplateProcess parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TemplateProcess parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TemplateProcess parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TemplateProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
