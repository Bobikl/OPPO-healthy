package com.heytap.health.owconnect.diagnosis;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ht6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class Events$WConnectEvent extends GeneratedMessageLite<Events$WConnectEvent, Builder> implements Events$WConnectEventOrBuilder {
    public static final int BACKGROUND_FIELD_NUMBER = 7;
    public static final int CODE_FIELD_NUMBER = 4;
    public static final int CONNECT_FIELD_NUMBER = 2;
    private static final Events$WConnectEvent DEFAULT_INSTANCE;
    public static final int MAC_FIELD_NUMBER = 6;
    public static final int MESSAGE_FIELD_NUMBER = 5;
    private static volatile Parser<Events$WConnectEvent> PARSER = null;
    public static final int STEP_FIELD_NUMBER = 3;
    public static final int TIME_FIELD_NUMBER = 1;
    private boolean background_;
    private int code_;
    private boolean connect_;
    private int step_;
    private long time_;
    private String message_ = "";
    private String mac_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Events$WConnectEvent, Builder> implements Events$WConnectEventOrBuilder {
        public Builder clearBackground() {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).clearBackground();
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).clearCode();
            return this;
        }

        public Builder clearConnect() {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).clearConnect();
            return this;
        }

        public Builder clearMac() {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).clearMac();
            return this;
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).clearMessage();
            return this;
        }

        public Builder clearStep() {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).clearStep();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).clearTime();
            return this;
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public boolean getBackground() {
            return ((Events$WConnectEvent) this.instance).getBackground();
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public int getCode() {
            return ((Events$WConnectEvent) this.instance).getCode();
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public boolean getConnect() {
            return ((Events$WConnectEvent) this.instance).getConnect();
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public String getMac() {
            return ((Events$WConnectEvent) this.instance).getMac();
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public ByteString getMacBytes() {
            return ((Events$WConnectEvent) this.instance).getMacBytes();
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public String getMessage() {
            return ((Events$WConnectEvent) this.instance).getMessage();
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public ByteString getMessageBytes() {
            return ((Events$WConnectEvent) this.instance).getMessageBytes();
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public Events$OWStep getStep() {
            return ((Events$WConnectEvent) this.instance).getStep();
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public int getStepValue() {
            return ((Events$WConnectEvent) this.instance).getStepValue();
        }

        @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
        public long getTime() {
            return ((Events$WConnectEvent) this.instance).getTime();
        }

        public Builder setBackground(boolean z) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setBackground(z);
            return this;
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setCode(i);
            return this;
        }

        public Builder setConnect(boolean z) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setConnect(z);
            return this;
        }

        public Builder setMac(String str) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setMac(str);
            return this;
        }

        public Builder setMacBytes(ByteString byteString) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setMacBytes(byteString);
            return this;
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setMessageBytes(byteString);
            return this;
        }

        public Builder setStep(Events$OWStep events$OWStep) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setStep(events$OWStep);
            return this;
        }

        public Builder setStepValue(int i) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setStepValue(i);
            return this;
        }

        public Builder setTime(long j2) {
            copyOnWrite();
            ((Events$WConnectEvent) this.instance).setTime(j2);
            return this;
        }

        private Builder() {
            super(Events$WConnectEvent.DEFAULT_INSTANCE);
        }
    }

    static {
        Events$WConnectEvent events$WConnectEvent = new Events$WConnectEvent();
        DEFAULT_INSTANCE = events$WConnectEvent;
        GeneratedMessageLite.registerDefaultInstance(Events$WConnectEvent.class, events$WConnectEvent);
    }

    private Events$WConnectEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackground() {
        this.background_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnect() {
        this.connect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMac() {
        this.mac_ = getDefaultInstance().getMac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStep() {
        this.step_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0L;
    }

    public static Events$WConnectEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Events$WConnectEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Events$WConnectEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Events$WConnectEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackground(boolean z) {
        this.background_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnect(boolean z) {
        this.connect_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMac(String str) {
        str.getClass();
        this.mac_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMacBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mac_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStep(Events$OWStep events$OWStep) {
        this.step_ = events$OWStep.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStepValue(int i) {
        this.step_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j2) {
        this.time_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ht6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Events$WConnectEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0007\u0003\f\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0007", new Object[]{"time_", "connect_", "step_", "code_", "message_", "mac_", "background_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Events$WConnectEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Events$WConnectEvent.class) {
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

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public boolean getBackground() {
        return this.background_;
    }

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public boolean getConnect() {
        return this.connect_;
    }

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public String getMac() {
        return this.mac_;
    }

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public ByteString getMacBytes() {
        return ByteString.copyFromUtf8(this.mac_);
    }

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public Events$OWStep getStep() {
        Events$OWStep events$OWStepForNumber = Events$OWStep.forNumber(this.step_);
        return events$OWStepForNumber == null ? Events$OWStep.UNRECOGNIZED : events$OWStepForNumber;
    }

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public int getStepValue() {
        return this.step_;
    }

    @Override // com.heytap.health.owconnect.diagnosis.Events$WConnectEventOrBuilder
    public long getTime() {
        return this.time_;
    }

    public static Builder newBuilder(Events$WConnectEvent events$WConnectEvent) {
        return DEFAULT_INSTANCE.createBuilder(events$WConnectEvent);
    }

    public static Events$WConnectEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Events$WConnectEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Events$WConnectEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Events$WConnectEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Events$WConnectEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Events$WConnectEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Events$WConnectEvent parseFrom(InputStream inputStream) throws IOException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Events$WConnectEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Events$WConnectEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Events$WConnectEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Events$WConnectEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
