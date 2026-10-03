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
public final class TextElement extends GeneratedMessageLite<TextElement, Builder> implements TextElementOrBuilder {
    public static final int COLOR_FIELD_NUMBER = 3;
    public static final int COUNTDOWNTARGET_FIELD_NUMBER = 4;
    private static final TextElement DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 1;
    private static volatile Parser<TextElement> PARSER = null;
    public static final int STARTTEXT_FIELD_NUMBER = 5;
    public static final int STEP_FIELD_NUMBER = 6;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int color_;
    private long countDownTarget_;
    private boolean startText_;
    private int step_;
    private String level_ = "";
    private String text_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<TextElement, Builder> implements TextElementOrBuilder {
        public Builder clearColor() {
            copyOnWrite();
            ((TextElement) this.instance).clearColor();
            return this;
        }

        public Builder clearCountDownTarget() {
            copyOnWrite();
            ((TextElement) this.instance).clearCountDownTarget();
            return this;
        }

        public Builder clearLevel() {
            copyOnWrite();
            ((TextElement) this.instance).clearLevel();
            return this;
        }

        public Builder clearStartText() {
            copyOnWrite();
            ((TextElement) this.instance).clearStartText();
            return this;
        }

        public Builder clearStep() {
            copyOnWrite();
            ((TextElement) this.instance).clearStep();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((TextElement) this.instance).clearText();
            return this;
        }

        @Override // com.heytap.health.watch.notification.TextElementOrBuilder
        public int getColor() {
            return ((TextElement) this.instance).getColor();
        }

        @Override // com.heytap.health.watch.notification.TextElementOrBuilder
        public long getCountDownTarget() {
            return ((TextElement) this.instance).getCountDownTarget();
        }

        @Override // com.heytap.health.watch.notification.TextElementOrBuilder
        public String getLevel() {
            return ((TextElement) this.instance).getLevel();
        }

        @Override // com.heytap.health.watch.notification.TextElementOrBuilder
        public ByteString getLevelBytes() {
            return ((TextElement) this.instance).getLevelBytes();
        }

        @Override // com.heytap.health.watch.notification.TextElementOrBuilder
        public boolean getStartText() {
            return ((TextElement) this.instance).getStartText();
        }

        @Override // com.heytap.health.watch.notification.TextElementOrBuilder
        public int getStep() {
            return ((TextElement) this.instance).getStep();
        }

        @Override // com.heytap.health.watch.notification.TextElementOrBuilder
        public String getText() {
            return ((TextElement) this.instance).getText();
        }

        @Override // com.heytap.health.watch.notification.TextElementOrBuilder
        public ByteString getTextBytes() {
            return ((TextElement) this.instance).getTextBytes();
        }

        public Builder setColor(int i) {
            copyOnWrite();
            ((TextElement) this.instance).setColor(i);
            return this;
        }

        public Builder setCountDownTarget(long j2) {
            copyOnWrite();
            ((TextElement) this.instance).setCountDownTarget(j2);
            return this;
        }

        public Builder setLevel(String str) {
            copyOnWrite();
            ((TextElement) this.instance).setLevel(str);
            return this;
        }

        public Builder setLevelBytes(ByteString byteString) {
            copyOnWrite();
            ((TextElement) this.instance).setLevelBytes(byteString);
            return this;
        }

        public Builder setStartText(boolean z) {
            copyOnWrite();
            ((TextElement) this.instance).setStartText(z);
            return this;
        }

        public Builder setStep(int i) {
            copyOnWrite();
            ((TextElement) this.instance).setStep(i);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((TextElement) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((TextElement) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(TextElement.DEFAULT_INSTANCE);
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
        TextElement textElement = new TextElement();
        DEFAULT_INSTANCE = textElement;
        GeneratedMessageLite.registerDefaultInstance(TextElement.class, textElement);
    }

    private TextElement() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountDownTarget() {
        this.countDownTarget_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = getDefaultInstance().getLevel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartText() {
        this.startText_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStep() {
        this.step_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static TextElement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TextElement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TextElement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextElement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TextElement> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(int i) {
        this.color_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownTarget(long j2) {
        this.countDownTarget_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(String str) {
        str.getClass();
        this.level_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.level_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartText(boolean z) {
        this.startText_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStep(int i) {
        this.step_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new TextElement();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0002\u0005\u0007\u0006\u000b", new Object[]{"level_", "text_", "color_", "countDownTarget_", "startText_", "step_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TextElement> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TextElement.class) {
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

    @Override // com.heytap.health.watch.notification.TextElementOrBuilder
    public int getColor() {
        return this.color_;
    }

    @Override // com.heytap.health.watch.notification.TextElementOrBuilder
    public long getCountDownTarget() {
        return this.countDownTarget_;
    }

    @Override // com.heytap.health.watch.notification.TextElementOrBuilder
    public String getLevel() {
        return this.level_;
    }

    @Override // com.heytap.health.watch.notification.TextElementOrBuilder
    public ByteString getLevelBytes() {
        return ByteString.copyFromUtf8(this.level_);
    }

    @Override // com.heytap.health.watch.notification.TextElementOrBuilder
    public boolean getStartText() {
        return this.startText_;
    }

    @Override // com.heytap.health.watch.notification.TextElementOrBuilder
    public int getStep() {
        return this.step_;
    }

    @Override // com.heytap.health.watch.notification.TextElementOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.heytap.health.watch.notification.TextElementOrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(TextElement textElement) {
        return DEFAULT_INSTANCE.createBuilder(textElement);
    }

    public static TextElement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextElement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextElement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TextElement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TextElement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TextElement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TextElement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TextElement parseFrom(InputStream inputStream) throws IOException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextElement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextElement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TextElement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
