package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.j1a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class IccoaDkfConstant$State extends GeneratedMessageLite<IccoaDkfConstant$State, Builder> implements IccoaDkfConstant$StateOrBuilder {
    public static final int ADDITIONALINFO_FIELD_NUMBER = 3;
    public static final int CODE_FIELD_NUMBER = 1;
    private static final IccoaDkfConstant$State DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<IccoaDkfConstant$State> PARSER;
    private int code_;
    private String errorMessage_ = "";
    private String additionalInfo_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$State, Builder> implements IccoaDkfConstant$StateOrBuilder {
        public Builder clearAdditionalInfo() {
            copyOnWrite();
            ((IccoaDkfConstant$State) this.instance).clearAdditionalInfo();
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((IccoaDkfConstant$State) this.instance).clearCode();
            return this;
        }

        public Builder clearErrorMessage() {
            copyOnWrite();
            ((IccoaDkfConstant$State) this.instance).clearErrorMessage();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
        public String getAdditionalInfo() {
            return ((IccoaDkfConstant$State) this.instance).getAdditionalInfo();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
        public ByteString getAdditionalInfoBytes() {
            return ((IccoaDkfConstant$State) this.instance).getAdditionalInfoBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
        public IccoaDkfConstant$ICCOAErrorCode getCode() {
            return ((IccoaDkfConstant$State) this.instance).getCode();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
        public int getCodeValue() {
            return ((IccoaDkfConstant$State) this.instance).getCodeValue();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
        public String getErrorMessage() {
            return ((IccoaDkfConstant$State) this.instance).getErrorMessage();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
        public ByteString getErrorMessageBytes() {
            return ((IccoaDkfConstant$State) this.instance).getErrorMessageBytes();
        }

        public Builder setAdditionalInfo(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$State) this.instance).setAdditionalInfo(str);
            return this;
        }

        public Builder setAdditionalInfoBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$State) this.instance).setAdditionalInfoBytes(byteString);
            return this;
        }

        public Builder setCode(IccoaDkfConstant$ICCOAErrorCode iccoaDkfConstant$ICCOAErrorCode) {
            copyOnWrite();
            ((IccoaDkfConstant$State) this.instance).setCode(iccoaDkfConstant$ICCOAErrorCode);
            return this;
        }

        public Builder setCodeValue(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$State) this.instance).setCodeValue(i);
            return this;
        }

        public Builder setErrorMessage(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$State) this.instance).setErrorMessage(str);
            return this;
        }

        public Builder setErrorMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$State) this.instance).setErrorMessageBytes(byteString);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$State.DEFAULT_INSTANCE);
        }
    }

    static {
        IccoaDkfConstant$State iccoaDkfConstant$State = new IccoaDkfConstant$State();
        DEFAULT_INSTANCE = iccoaDkfConstant$State;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$State.class, iccoaDkfConstant$State);
    }

    private IccoaDkfConstant$State() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalInfo() {
        this.additionalInfo_ = getDefaultInstance().getAdditionalInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMessage() {
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    public static IccoaDkfConstant$State getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$State parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$State parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$State> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalInfo(String str) {
        str.getClass();
        this.additionalInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalInfoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.additionalInfo_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(IccoaDkfConstant$ICCOAErrorCode iccoaDkfConstant$ICCOAErrorCode) {
        this.code_ = iccoaDkfConstant$ICCOAErrorCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeValue(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessage(String str) {
        str.getClass();
        this.errorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.errorMessage_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$State();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"code_", "errorMessage_", "additionalInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$State> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$State.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
    public String getAdditionalInfo() {
        return this.additionalInfo_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
    public ByteString getAdditionalInfoBytes() {
        return ByteString.copyFromUtf8(this.additionalInfo_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
    public IccoaDkfConstant$ICCOAErrorCode getCode() {
        IccoaDkfConstant$ICCOAErrorCode iccoaDkfConstant$ICCOAErrorCodeForNumber = IccoaDkfConstant$ICCOAErrorCode.forNumber(this.code_);
        return iccoaDkfConstant$ICCOAErrorCodeForNumber == null ? IccoaDkfConstant$ICCOAErrorCode.UNRECOGNIZED : iccoaDkfConstant$ICCOAErrorCodeForNumber;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
    public int getCodeValue() {
        return this.code_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
    public String getErrorMessage() {
        return this.errorMessage_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$StateOrBuilder
    public ByteString getErrorMessageBytes() {
        return ByteString.copyFromUtf8(this.errorMessage_);
    }

    public static Builder newBuilder(IccoaDkfConstant$State iccoaDkfConstant$State) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$State);
    }

    public static IccoaDkfConstant$State parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$State parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$State parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$State parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$State parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$State parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$State parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$State parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$State parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$State parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$State) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
