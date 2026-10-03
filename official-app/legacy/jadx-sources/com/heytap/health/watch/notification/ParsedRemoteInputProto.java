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
public final class ParsedRemoteInputProto extends GeneratedMessageLite<ParsedRemoteInputProto, Builder> implements ParsedRemoteInputProtoOrBuilder {
    public static final int ALLOWFREEFORMINPUT_FIELD_NUMBER = 4;
    public static final int CHOICES_FIELD_NUMBER = 3;
    private static final ParsedRemoteInputProto DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile Parser<ParsedRemoteInputProto> PARSER = null;
    public static final int RESULTKEY_FIELD_NUMBER = 1;
    private boolean allowFreeFormInput_;
    private String resultKey_ = "";
    private String label_ = "";
    private Internal.ProtobufList<String> choices_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<ParsedRemoteInputProto, Builder> implements ParsedRemoteInputProtoOrBuilder {
        public Builder addAllChoices(Iterable<String> iterable) {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).addAllChoices(iterable);
            return this;
        }

        public Builder addChoices(String str) {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).addChoices(str);
            return this;
        }

        public Builder addChoicesBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).addChoicesBytes(byteString);
            return this;
        }

        public Builder clearAllowFreeFormInput() {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).clearAllowFreeFormInput();
            return this;
        }

        public Builder clearChoices() {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).clearChoices();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).clearLabel();
            return this;
        }

        public Builder clearResultKey() {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).clearResultKey();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
        public boolean getAllowFreeFormInput() {
            return ((ParsedRemoteInputProto) this.instance).getAllowFreeFormInput();
        }

        @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
        public String getChoices(int i) {
            return ((ParsedRemoteInputProto) this.instance).getChoices(i);
        }

        @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
        public ByteString getChoicesBytes(int i) {
            return ((ParsedRemoteInputProto) this.instance).getChoicesBytes(i);
        }

        @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
        public int getChoicesCount() {
            return ((ParsedRemoteInputProto) this.instance).getChoicesCount();
        }

        @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
        public List<String> getChoicesList() {
            return Collections.unmodifiableList(((ParsedRemoteInputProto) this.instance).getChoicesList());
        }

        @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
        public String getLabel() {
            return ((ParsedRemoteInputProto) this.instance).getLabel();
        }

        @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
        public ByteString getLabelBytes() {
            return ((ParsedRemoteInputProto) this.instance).getLabelBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
        public String getResultKey() {
            return ((ParsedRemoteInputProto) this.instance).getResultKey();
        }

        @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
        public ByteString getResultKeyBytes() {
            return ((ParsedRemoteInputProto) this.instance).getResultKeyBytes();
        }

        public Builder setAllowFreeFormInput(boolean z) {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).setAllowFreeFormInput(z);
            return this;
        }

        public Builder setChoices(int i, String str) {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).setChoices(i, str);
            return this;
        }

        public Builder setLabel(String str) {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).setLabel(str);
            return this;
        }

        public Builder setLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).setLabelBytes(byteString);
            return this;
        }

        public Builder setResultKey(String str) {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).setResultKey(str);
            return this;
        }

        public Builder setResultKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedRemoteInputProto) this.instance).setResultKeyBytes(byteString);
            return this;
        }

        private Builder() {
            super(ParsedRemoteInputProto.DEFAULT_INSTANCE);
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
        ParsedRemoteInputProto parsedRemoteInputProto = new ParsedRemoteInputProto();
        DEFAULT_INSTANCE = parsedRemoteInputProto;
        GeneratedMessageLite.registerDefaultInstance(ParsedRemoteInputProto.class, parsedRemoteInputProto);
    }

    private ParsedRemoteInputProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChoices(Iterable<String> iterable) {
        ensureChoicesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.choices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChoices(String str) {
        str.getClass();
        ensureChoicesIsMutable();
        this.choices_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChoicesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureChoicesIsMutable();
        this.choices_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowFreeFormInput() {
        this.allowFreeFormInput_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChoices() {
        this.choices_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultKey() {
        this.resultKey_ = getDefaultInstance().getResultKey();
    }

    private void ensureChoicesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.choices_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.choices_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ParsedRemoteInputProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ParsedRemoteInputProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParsedRemoteInputProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ParsedRemoteInputProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowFreeFormInput(boolean z) {
        this.allowFreeFormInput_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChoices(int i, String str) {
        str.getClass();
        ensureChoicesIsMutable();
        this.choices_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.label_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultKey(String str) {
        str.getClass();
        this.resultKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resultKey_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ParsedRemoteInputProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004\u0007", new Object[]{"resultKey_", "label_", "choices_", "allowFreeFormInput_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ParsedRemoteInputProto> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ParsedRemoteInputProto.class) {
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

    @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
    public boolean getAllowFreeFormInput() {
        return this.allowFreeFormInput_;
    }

    @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
    public String getChoices(int i) {
        return this.choices_.get(i);
    }

    @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
    public ByteString getChoicesBytes(int i) {
        return ByteString.copyFromUtf8(this.choices_.get(i));
    }

    @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
    public int getChoicesCount() {
        return this.choices_.size();
    }

    @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
    public List<String> getChoicesList() {
        return this.choices_;
    }

    @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
    public String getLabel() {
        return this.label_;
    }

    @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
    public ByteString getLabelBytes() {
        return ByteString.copyFromUtf8(this.label_);
    }

    @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
    public String getResultKey() {
        return this.resultKey_;
    }

    @Override // com.heytap.health.watch.notification.ParsedRemoteInputProtoOrBuilder
    public ByteString getResultKeyBytes() {
        return ByteString.copyFromUtf8(this.resultKey_);
    }

    public static Builder newBuilder(ParsedRemoteInputProto parsedRemoteInputProto) {
        return DEFAULT_INSTANCE.createBuilder(parsedRemoteInputProto);
    }

    public static ParsedRemoteInputProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ParsedRemoteInputProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ParsedRemoteInputProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ParsedRemoteInputProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ParsedRemoteInputProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ParsedRemoteInputProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ParsedRemoteInputProto parseFrom(InputStream inputStream) throws IOException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParsedRemoteInputProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ParsedRemoteInputProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ParsedRemoteInputProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ParsedRemoteInputProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
