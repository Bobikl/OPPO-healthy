package com.heytap.health.watch.notification;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class ProcessInfo extends GeneratedMessageLite<ProcessInfo, Builder> implements ProcessInfoOrBuilder {
    public static final int ALLSTEPS_FIELD_NUMBER = 4;
    public static final int BGCOLOR_FIELD_NUMBER = 2;
    public static final int CURRENTSTEP_FIELD_NUMBER = 5;
    private static final ProcessInfo DEFAULT_INSTANCE;
    public static final int FORECOLOR_FIELD_NUMBER = 1;
    public static final int IMAGEKEY_FIELD_NUMBER = 6;
    public static final int NODENAME_FIELD_NUMBER = 7;
    private static volatile Parser<ProcessInfo> PARSER = null;
    public static final int PERCENT_FIELD_NUMBER = 3;
    private int allSteps_;
    private int bgColor_;
    private int currentStep_;
    private int foreColor_;
    private String imageKey_ = "";
    private Internal.ProtobufList<String> nodeName_ = GeneratedMessageLite.emptyProtobufList();
    private int percent_;

    public static final class Builder extends GeneratedMessageLite.Builder<ProcessInfo, Builder> implements ProcessInfoOrBuilder {
        public Builder addAllNodeName(Iterable<String> iterable) {
            copyOnWrite();
            ((ProcessInfo) this.instance).addAllNodeName(iterable);
            return this;
        }

        public Builder addNodeName(String str) {
            copyOnWrite();
            ((ProcessInfo) this.instance).addNodeName(str);
            return this;
        }

        public Builder addNodeNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ProcessInfo) this.instance).addNodeNameBytes(byteString);
            return this;
        }

        public Builder clearAllSteps() {
            copyOnWrite();
            ((ProcessInfo) this.instance).clearAllSteps();
            return this;
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((ProcessInfo) this.instance).clearBgColor();
            return this;
        }

        public Builder clearCurrentStep() {
            copyOnWrite();
            ((ProcessInfo) this.instance).clearCurrentStep();
            return this;
        }

        public Builder clearForeColor() {
            copyOnWrite();
            ((ProcessInfo) this.instance).clearForeColor();
            return this;
        }

        public Builder clearImageKey() {
            copyOnWrite();
            ((ProcessInfo) this.instance).clearImageKey();
            return this;
        }

        public Builder clearNodeName() {
            copyOnWrite();
            ((ProcessInfo) this.instance).clearNodeName();
            return this;
        }

        public Builder clearPercent() {
            copyOnWrite();
            ((ProcessInfo) this.instance).clearPercent();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public int getAllSteps() {
            return ((ProcessInfo) this.instance).getAllSteps();
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public int getBgColor() {
            return ((ProcessInfo) this.instance).getBgColor();
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public int getCurrentStep() {
            return ((ProcessInfo) this.instance).getCurrentStep();
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public int getForeColor() {
            return ((ProcessInfo) this.instance).getForeColor();
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public String getImageKey() {
            return ((ProcessInfo) this.instance).getImageKey();
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public ByteString getImageKeyBytes() {
            return ((ProcessInfo) this.instance).getImageKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public String getNodeName(int i) {
            return ((ProcessInfo) this.instance).getNodeName(i);
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public ByteString getNodeNameBytes(int i) {
            return ((ProcessInfo) this.instance).getNodeNameBytes(i);
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public int getNodeNameCount() {
            return ((ProcessInfo) this.instance).getNodeNameCount();
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public List<String> getNodeNameList() {
            return Collections.unmodifiableList(((ProcessInfo) this.instance).getNodeNameList());
        }

        @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
        public int getPercent() {
            return ((ProcessInfo) this.instance).getPercent();
        }

        public Builder setAllSteps(int i) {
            copyOnWrite();
            ((ProcessInfo) this.instance).setAllSteps(i);
            return this;
        }

        public Builder setBgColor(int i) {
            copyOnWrite();
            ((ProcessInfo) this.instance).setBgColor(i);
            return this;
        }

        public Builder setCurrentStep(int i) {
            copyOnWrite();
            ((ProcessInfo) this.instance).setCurrentStep(i);
            return this;
        }

        public Builder setForeColor(int i) {
            copyOnWrite();
            ((ProcessInfo) this.instance).setForeColor(i);
            return this;
        }

        public Builder setImageKey(String str) {
            copyOnWrite();
            ((ProcessInfo) this.instance).setImageKey(str);
            return this;
        }

        public Builder setImageKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((ProcessInfo) this.instance).setImageKeyBytes(byteString);
            return this;
        }

        public Builder setNodeName(int i, String str) {
            copyOnWrite();
            ((ProcessInfo) this.instance).setNodeName(i, str);
            return this;
        }

        public Builder setPercent(int i) {
            copyOnWrite();
            ((ProcessInfo) this.instance).setPercent(i);
            return this;
        }

        private Builder() {
            super(ProcessInfo.DEFAULT_INSTANCE);
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
        ProcessInfo processInfo = new ProcessInfo();
        DEFAULT_INSTANCE = processInfo;
        GeneratedMessageLite.registerDefaultInstance(ProcessInfo.class, processInfo);
    }

    private ProcessInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNodeName(Iterable<String> iterable) {
        ensureNodeNameIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.nodeName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodeName(String str) {
        str.getClass();
        ensureNodeNameIsMutable();
        this.nodeName_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodeNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureNodeNameIsMutable();
        this.nodeName_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllSteps() {
        this.allSteps_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgColor() {
        this.bgColor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentStep() {
        this.currentStep_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForeColor() {
        this.foreColor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageKey() {
        this.imageKey_ = getDefaultInstance().getImageKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeName() {
        this.nodeName_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPercent() {
        this.percent_ = 0;
    }

    private void ensureNodeNameIsMutable() {
        Internal.ProtobufList<String> protobufList = this.nodeName_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.nodeName_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ProcessInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ProcessInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ProcessInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProcessInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ProcessInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllSteps(int i) {
        this.allSteps_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColor(int i) {
        this.bgColor_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentStep(int i) {
        this.currentStep_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForeColor(int i) {
        this.foreColor_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageKey(String str) {
        str.getClass();
        this.imageKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeName(int i, String str) {
        str.getClass();
        ensureNodeNameIsMutable();
        this.nodeName_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPercent(int i) {
        this.percent_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ProcessInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006Ȉ\u0007Ț", new Object[]{"foreColor_", "bgColor_", "percent_", "allSteps_", "currentStep_", "imageKey_", "nodeName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ProcessInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ProcessInfo.class) {
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

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public int getAllSteps() {
        return this.allSteps_;
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public int getBgColor() {
        return this.bgColor_;
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public int getCurrentStep() {
        return this.currentStep_;
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public int getForeColor() {
        return this.foreColor_;
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public String getImageKey() {
        return this.imageKey_;
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public ByteString getImageKeyBytes() {
        return ByteString.copyFromUtf8(this.imageKey_);
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public String getNodeName(int i) {
        return this.nodeName_.get(i);
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public ByteString getNodeNameBytes(int i) {
        return ByteString.copyFromUtf8(this.nodeName_.get(i));
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public int getNodeNameCount() {
        return this.nodeName_.size();
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public List<String> getNodeNameList() {
        return this.nodeName_;
    }

    @Override // com.heytap.health.watch.notification.ProcessInfoOrBuilder
    public int getPercent() {
        return this.percent_;
    }

    public static Builder newBuilder(ProcessInfo processInfo) {
        return DEFAULT_INSTANCE.createBuilder(processInfo);
    }

    public static ProcessInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProcessInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProcessInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ProcessInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ProcessInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ProcessInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ProcessInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ProcessInfo parseFrom(InputStream inputStream) throws IOException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProcessInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProcessInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ProcessInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProcessInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
