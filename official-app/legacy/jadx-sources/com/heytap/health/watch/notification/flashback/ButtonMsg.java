package com.heytap.health.watch.notification.flashback;

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
public final class ButtonMsg extends GeneratedMessageLite<ButtonMsg, Builder> implements ButtonMsgOrBuilder {
    public static final int BUTTON_ID_FIELD_NUMBER = 1;
    public static final int BUTTON_TEXT_FIELD_NUMBER = 2;
    private static final ButtonMsg DEFAULT_INSTANCE;
    public static final int MSG_ID_FIELD_NUMBER = 3;
    private static volatile Parser<ButtonMsg> PARSER;
    private int buttonId_;
    private String buttonText_ = "";
    private long msgId_;

    public static final class Builder extends GeneratedMessageLite.Builder<ButtonMsg, Builder> implements ButtonMsgOrBuilder {
        public Builder clearButtonId() {
            copyOnWrite();
            ((ButtonMsg) this.instance).clearButtonId();
            return this;
        }

        public Builder clearButtonText() {
            copyOnWrite();
            ((ButtonMsg) this.instance).clearButtonText();
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((ButtonMsg) this.instance).clearMsgId();
            return this;
        }

        @Override // com.heytap.health.watch.notification.flashback.ButtonMsgOrBuilder
        public int getButtonId() {
            return ((ButtonMsg) this.instance).getButtonId();
        }

        @Override // com.heytap.health.watch.notification.flashback.ButtonMsgOrBuilder
        public String getButtonText() {
            return ((ButtonMsg) this.instance).getButtonText();
        }

        @Override // com.heytap.health.watch.notification.flashback.ButtonMsgOrBuilder
        public ByteString getButtonTextBytes() {
            return ((ButtonMsg) this.instance).getButtonTextBytes();
        }

        @Override // com.heytap.health.watch.notification.flashback.ButtonMsgOrBuilder
        public long getMsgId() {
            return ((ButtonMsg) this.instance).getMsgId();
        }

        public Builder setButtonId(int i) {
            copyOnWrite();
            ((ButtonMsg) this.instance).setButtonId(i);
            return this;
        }

        public Builder setButtonText(String str) {
            copyOnWrite();
            ((ButtonMsg) this.instance).setButtonText(str);
            return this;
        }

        public Builder setButtonTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ButtonMsg) this.instance).setButtonTextBytes(byteString);
            return this;
        }

        public Builder setMsgId(long j2) {
            copyOnWrite();
            ((ButtonMsg) this.instance).setMsgId(j2);
            return this;
        }

        private Builder() {
            super(ButtonMsg.DEFAULT_INSTANCE);
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
        ButtonMsg buttonMsg = new ButtonMsg();
        DEFAULT_INSTANCE = buttonMsg;
        GeneratedMessageLite.registerDefaultInstance(ButtonMsg.class, buttonMsg);
    }

    private ButtonMsg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonId() {
        this.buttonId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonText() {
        this.buttonText_ = getDefaultInstance().getButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgId() {
        this.msgId_ = 0L;
    }

    public static ButtonMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ButtonMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ButtonMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonMsg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ButtonMsg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonId(int i) {
        this.buttonId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonText(String str) {
        str.getClass();
        this.buttonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buttonText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgId(long j2) {
        this.msgId_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ButtonMsg();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0002", new Object[]{"buttonId_", "buttonText_", "msgId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ButtonMsg> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ButtonMsg.class) {
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

    @Override // com.heytap.health.watch.notification.flashback.ButtonMsgOrBuilder
    public int getButtonId() {
        return this.buttonId_;
    }

    @Override // com.heytap.health.watch.notification.flashback.ButtonMsgOrBuilder
    public String getButtonText() {
        return this.buttonText_;
    }

    @Override // com.heytap.health.watch.notification.flashback.ButtonMsgOrBuilder
    public ByteString getButtonTextBytes() {
        return ByteString.copyFromUtf8(this.buttonText_);
    }

    @Override // com.heytap.health.watch.notification.flashback.ButtonMsgOrBuilder
    public long getMsgId() {
        return this.msgId_;
    }

    public static Builder newBuilder(ButtonMsg buttonMsg) {
        return DEFAULT_INSTANCE.createBuilder(buttonMsg);
    }

    public static ButtonMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonMsg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ButtonMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ButtonMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ButtonMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ButtonMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ButtonMsg parseFrom(InputStream inputStream) throws IOException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ButtonMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ButtonMsg parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ButtonMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
