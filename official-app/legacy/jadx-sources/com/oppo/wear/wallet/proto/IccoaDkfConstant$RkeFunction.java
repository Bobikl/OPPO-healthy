package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.j1a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class IccoaDkfConstant$RkeFunction extends GeneratedMessageLite<IccoaDkfConstant$RkeFunction, Builder> implements IccoaDkfConstant$RkeFunctionOrBuilder {
    private static final IccoaDkfConstant$RkeFunction DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int FUNCTIONID_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<IccoaDkfConstant$RkeFunction> PARSER = null;
    public static final int RKEACTIONS_FIELD_NUMBER = 4;
    private String name_ = "";
    private String description_ = "";
    private String functionId_ = "";
    private Internal.ProtobufList<IccoaDkfConstant$RkeAction> rkeActions_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$RkeFunction, Builder> implements IccoaDkfConstant$RkeFunctionOrBuilder {
        public Builder addAllRkeActions(Iterable<? extends IccoaDkfConstant$RkeAction> iterable) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).addAllRkeActions(iterable);
            return this;
        }

        public Builder addRkeActions(IccoaDkfConstant$RkeAction iccoaDkfConstant$RkeAction) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).addRkeActions(iccoaDkfConstant$RkeAction);
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).clearDescription();
            return this;
        }

        public Builder clearFunctionId() {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).clearFunctionId();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).clearName();
            return this;
        }

        public Builder clearRkeActions() {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).clearRkeActions();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
        public String getDescription() {
            return ((IccoaDkfConstant$RkeFunction) this.instance).getDescription();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
        public ByteString getDescriptionBytes() {
            return ((IccoaDkfConstant$RkeFunction) this.instance).getDescriptionBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
        public String getFunctionId() {
            return ((IccoaDkfConstant$RkeFunction) this.instance).getFunctionId();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
        public ByteString getFunctionIdBytes() {
            return ((IccoaDkfConstant$RkeFunction) this.instance).getFunctionIdBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
        public String getName() {
            return ((IccoaDkfConstant$RkeFunction) this.instance).getName();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
        public ByteString getNameBytes() {
            return ((IccoaDkfConstant$RkeFunction) this.instance).getNameBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
        public IccoaDkfConstant$RkeAction getRkeActions(int i) {
            return ((IccoaDkfConstant$RkeFunction) this.instance).getRkeActions(i);
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
        public int getRkeActionsCount() {
            return ((IccoaDkfConstant$RkeFunction) this.instance).getRkeActionsCount();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
        public List<IccoaDkfConstant$RkeAction> getRkeActionsList() {
            return Collections.unmodifiableList(((IccoaDkfConstant$RkeFunction) this.instance).getRkeActionsList());
        }

        public Builder removeRkeActions(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).removeRkeActions(i);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setFunctionId(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).setFunctionId(str);
            return this;
        }

        public Builder setFunctionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).setFunctionIdBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setRkeActions(int i, IccoaDkfConstant$RkeAction iccoaDkfConstant$RkeAction) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).setRkeActions(i, iccoaDkfConstant$RkeAction);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$RkeFunction.DEFAULT_INSTANCE);
        }

        public Builder addRkeActions(int i, IccoaDkfConstant$RkeAction iccoaDkfConstant$RkeAction) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).addRkeActions(i, iccoaDkfConstant$RkeAction);
            return this;
        }

        public Builder setRkeActions(int i, IccoaDkfConstant$RkeAction.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).setRkeActions(i, builder.build());
            return this;
        }

        public Builder addRkeActions(IccoaDkfConstant$RkeAction.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).addRkeActions(builder.build());
            return this;
        }

        public Builder addRkeActions(int i, IccoaDkfConstant$RkeAction.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeFunction) this.instance).addRkeActions(i, builder.build());
            return this;
        }
    }

    static {
        IccoaDkfConstant$RkeFunction iccoaDkfConstant$RkeFunction = new IccoaDkfConstant$RkeFunction();
        DEFAULT_INSTANCE = iccoaDkfConstant$RkeFunction;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$RkeFunction.class, iccoaDkfConstant$RkeFunction);
    }

    private IccoaDkfConstant$RkeFunction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRkeActions(Iterable<? extends IccoaDkfConstant$RkeAction> iterable) {
        ensureRkeActionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rkeActions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRkeActions(IccoaDkfConstant$RkeAction iccoaDkfConstant$RkeAction) {
        iccoaDkfConstant$RkeAction.getClass();
        ensureRkeActionsIsMutable();
        this.rkeActions_.add(iccoaDkfConstant$RkeAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionId() {
        this.functionId_ = getDefaultInstance().getFunctionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRkeActions() {
        this.rkeActions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRkeActionsIsMutable() {
        Internal.ProtobufList<IccoaDkfConstant$RkeAction> protobufList = this.rkeActions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rkeActions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static IccoaDkfConstant$RkeFunction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$RkeFunction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$RkeFunction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRkeActions(int i) {
        ensureRkeActionsIsMutable();
        this.rkeActions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionId(String str) {
        str.getClass();
        this.functionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.functionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRkeActions(int i, IccoaDkfConstant$RkeAction iccoaDkfConstant$RkeAction) {
        iccoaDkfConstant$RkeAction.getClass();
        ensureRkeActionsIsMutable();
        this.rkeActions_.set(i, iccoaDkfConstant$RkeAction);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$RkeFunction();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"name_", "description_", "functionId_", "rkeActions_", IccoaDkfConstant$RkeAction.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$RkeFunction> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$RkeFunction.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
    public String getFunctionId() {
        return this.functionId_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
    public ByteString getFunctionIdBytes() {
        return ByteString.copyFromUtf8(this.functionId_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
    public IccoaDkfConstant$RkeAction getRkeActions(int i) {
        return this.rkeActions_.get(i);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
    public int getRkeActionsCount() {
        return this.rkeActions_.size();
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeFunctionOrBuilder
    public List<IccoaDkfConstant$RkeAction> getRkeActionsList() {
        return this.rkeActions_;
    }

    public IccoaDkfConstant$RkeActionOrBuilder getRkeActionsOrBuilder(int i) {
        return this.rkeActions_.get(i);
    }

    public List<? extends IccoaDkfConstant$RkeActionOrBuilder> getRkeActionsOrBuilderList() {
        return this.rkeActions_;
    }

    public static Builder newBuilder(IccoaDkfConstant$RkeFunction iccoaDkfConstant$RkeFunction) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$RkeFunction);
    }

    public static IccoaDkfConstant$RkeFunction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRkeActions(int i, IccoaDkfConstant$RkeAction iccoaDkfConstant$RkeAction) {
        iccoaDkfConstant$RkeAction.getClass();
        ensureRkeActionsIsMutable();
        this.rkeActions_.add(i, iccoaDkfConstant$RkeAction);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$RkeFunction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$RkeFunction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
