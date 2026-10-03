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
public final class TemplateIconProcess extends GeneratedMessageLite<TemplateIconProcess, Builder> implements TemplateIconProcessOrBuilder {
    public static final int CURRENTPROCESS_FIELD_NUMBER = 2;
    private static final TemplateIconProcess DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 3;
    private static volatile Parser<TemplateIconProcess> PARSER = null;
    public static final int TOTALPROCESS_FIELD_NUMBER = 1;
    private int currentProcess_;
    private ByteString icon_ = ByteString.EMPTY;
    private int totalProcess_;

    public static final class Builder extends GeneratedMessageLite.Builder<TemplateIconProcess, Builder> implements TemplateIconProcessOrBuilder {
        public Builder clearCurrentProcess() {
            copyOnWrite();
            ((TemplateIconProcess) this.instance).clearCurrentProcess();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((TemplateIconProcess) this.instance).clearIcon();
            return this;
        }

        public Builder clearTotalProcess() {
            copyOnWrite();
            ((TemplateIconProcess) this.instance).clearTotalProcess();
            return this;
        }

        @Override // com.heytap.health.watch.notification.TemplateIconProcessOrBuilder
        public int getCurrentProcess() {
            return ((TemplateIconProcess) this.instance).getCurrentProcess();
        }

        @Override // com.heytap.health.watch.notification.TemplateIconProcessOrBuilder
        public ByteString getIcon() {
            return ((TemplateIconProcess) this.instance).getIcon();
        }

        @Override // com.heytap.health.watch.notification.TemplateIconProcessOrBuilder
        public int getTotalProcess() {
            return ((TemplateIconProcess) this.instance).getTotalProcess();
        }

        public Builder setCurrentProcess(int i) {
            copyOnWrite();
            ((TemplateIconProcess) this.instance).setCurrentProcess(i);
            return this;
        }

        public Builder setIcon(ByteString byteString) {
            copyOnWrite();
            ((TemplateIconProcess) this.instance).setIcon(byteString);
            return this;
        }

        public Builder setTotalProcess(int i) {
            copyOnWrite();
            ((TemplateIconProcess) this.instance).setTotalProcess(i);
            return this;
        }

        private Builder() {
            super(TemplateIconProcess.DEFAULT_INSTANCE);
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
        TemplateIconProcess templateIconProcess = new TemplateIconProcess();
        DEFAULT_INSTANCE = templateIconProcess;
        GeneratedMessageLite.registerDefaultInstance(TemplateIconProcess.class, templateIconProcess);
    }

    private TemplateIconProcess() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentProcess() {
        this.currentProcess_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalProcess() {
        this.totalProcess_ = 0;
    }

    public static TemplateIconProcess getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TemplateIconProcess parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TemplateIconProcess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TemplateIconProcess parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TemplateIconProcess> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentProcess(int i) {
        this.currentProcess_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(ByteString byteString) {
        byteString.getClass();
        this.icon_ = byteString;
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
                return new TemplateIconProcess();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\n", new Object[]{"totalProcess_", "currentProcess_", "icon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TemplateIconProcess> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TemplateIconProcess.class) {
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

    @Override // com.heytap.health.watch.notification.TemplateIconProcessOrBuilder
    public int getCurrentProcess() {
        return this.currentProcess_;
    }

    @Override // com.heytap.health.watch.notification.TemplateIconProcessOrBuilder
    public ByteString getIcon() {
        return this.icon_;
    }

    @Override // com.heytap.health.watch.notification.TemplateIconProcessOrBuilder
    public int getTotalProcess() {
        return this.totalProcess_;
    }

    public static Builder newBuilder(TemplateIconProcess templateIconProcess) {
        return DEFAULT_INSTANCE.createBuilder(templateIconProcess);
    }

    public static TemplateIconProcess parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TemplateIconProcess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TemplateIconProcess parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TemplateIconProcess parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TemplateIconProcess parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TemplateIconProcess parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TemplateIconProcess parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TemplateIconProcess parseFrom(InputStream inputStream) throws IOException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TemplateIconProcess parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TemplateIconProcess parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TemplateIconProcess parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TemplateIconProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
