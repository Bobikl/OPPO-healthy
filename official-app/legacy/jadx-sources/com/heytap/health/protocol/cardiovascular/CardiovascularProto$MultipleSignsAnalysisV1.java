package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.z23;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CardiovascularProto$MultipleSignsAnalysisV1 extends GeneratedMessageLite<CardiovascularProto$MultipleSignsAnalysisV1, Builder> implements CardiovascularProto$MultipleSignsAnalysisV1OrBuilder {
    public static final int CODE_FIELD_NUMBER = 5;
    private static final CardiovascularProto$MultipleSignsAnalysisV1 DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 4;
    private static volatile Parser<CardiovascularProto$MultipleSignsAnalysisV1> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int status_;
    private int timestamp_;
    private int type_;
    private Internal.ProtobufList<CardiovascularProto$SignsDataV1> details_ = GeneratedMessageLite.emptyProtobufList();
    private String code_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$MultipleSignsAnalysisV1, Builder> implements CardiovascularProto$MultipleSignsAnalysisV1OrBuilder {
        public Builder addAllDetails(Iterable<? extends CardiovascularProto$SignsDataV1> iterable) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).addAllDetails(iterable);
            return this;
        }

        public Builder addDetails(CardiovascularProto$SignsDataV1 cardiovascularProto$SignsDataV1) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).addDetails(cardiovascularProto$SignsDataV1);
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).clearCode();
            return this;
        }

        public Builder clearDetails() {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).clearDetails();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).clearStatus();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
        public String getCode() {
            return ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).getCode();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
        public ByteString getCodeBytes() {
            return ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).getCodeBytes();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
        public CardiovascularProto$SignsDataV1 getDetails(int i) {
            return ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).getDetails(i);
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
        public int getDetailsCount() {
            return ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).getDetailsCount();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
        public List<CardiovascularProto$SignsDataV1> getDetailsList() {
            return Collections.unmodifiableList(((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).getDetailsList());
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
        public int getStatus() {
            return ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).getStatus();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
        public int getTimestamp() {
            return ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
        public int getType() {
            return ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).getType();
        }

        public Builder removeDetails(int i) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).removeDetails(i);
            return this;
        }

        public Builder setCode(String str) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).setCode(str);
            return this;
        }

        public Builder setCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).setCodeBytes(byteString);
            return this;
        }

        public Builder setDetails(int i, CardiovascularProto$SignsDataV1 cardiovascularProto$SignsDataV1) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).setDetails(i, cardiovascularProto$SignsDataV1);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).setStatus(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$MultipleSignsAnalysisV1.DEFAULT_INSTANCE);
        }

        public Builder addDetails(int i, CardiovascularProto$SignsDataV1 cardiovascularProto$SignsDataV1) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).addDetails(i, cardiovascularProto$SignsDataV1);
            return this;
        }

        public Builder setDetails(int i, CardiovascularProto$SignsDataV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).setDetails(i, builder.build());
            return this;
        }

        public Builder addDetails(CardiovascularProto$SignsDataV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).addDetails(builder.build());
            return this;
        }

        public Builder addDetails(int i, CardiovascularProto$SignsDataV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$MultipleSignsAnalysisV1) this.instance).addDetails(i, builder.build());
            return this;
        }
    }

    static {
        CardiovascularProto$MultipleSignsAnalysisV1 cardiovascularProto$MultipleSignsAnalysisV1 = new CardiovascularProto$MultipleSignsAnalysisV1();
        DEFAULT_INSTANCE = cardiovascularProto$MultipleSignsAnalysisV1;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$MultipleSignsAnalysisV1.class, cardiovascularProto$MultipleSignsAnalysisV1);
    }

    private CardiovascularProto$MultipleSignsAnalysisV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetails(Iterable<? extends CardiovascularProto$SignsDataV1> iterable) {
        ensureDetailsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.details_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(CardiovascularProto$SignsDataV1 cardiovascularProto$SignsDataV1) {
        cardiovascularProto$SignsDataV1.getClass();
        ensureDetailsIsMutable();
        this.details_.add(cardiovascularProto$SignsDataV1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = getDefaultInstance().getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensureDetailsIsMutable() {
        Internal.ProtobufList<CardiovascularProto$SignsDataV1> protobufList = this.details_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.details_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$MultipleSignsAnalysisV1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetails(int i) {
        ensureDetailsIsMutable();
        this.details_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(String str) {
        str.getClass();
        this.code_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.code_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetails(int i, CardiovascularProto$SignsDataV1 cardiovascularProto$SignsDataV1) {
        cardiovascularProto$SignsDataV1.getClass();
        ensureDetailsIsMutable();
        this.details_.set(i, cardiovascularProto$SignsDataV1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$MultipleSignsAnalysisV1();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u001b\u0005Ȉ", new Object[]{"timestamp_", "type_", "status_", "details_", CardiovascularProto$SignsDataV1.class, "code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$MultipleSignsAnalysisV1> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$MultipleSignsAnalysisV1.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
    public String getCode() {
        return this.code_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
    public ByteString getCodeBytes() {
        return ByteString.copyFromUtf8(this.code_);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
    public CardiovascularProto$SignsDataV1 getDetails(int i) {
        return this.details_.get(i);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
    public int getDetailsCount() {
        return this.details_.size();
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
    public List<CardiovascularProto$SignsDataV1> getDetailsList() {
        return this.details_;
    }

    public CardiovascularProto$SignsDataV1OrBuilder getDetailsOrBuilder(int i) {
        return this.details_.get(i);
    }

    public List<? extends CardiovascularProto$SignsDataV1OrBuilder> getDetailsOrBuilderList() {
        return this.details_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$MultipleSignsAnalysisV1OrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(CardiovascularProto$MultipleSignsAnalysisV1 cardiovascularProto$MultipleSignsAnalysisV1) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$MultipleSignsAnalysisV1);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(int i, CardiovascularProto$SignsDataV1 cardiovascularProto$SignsDataV1) {
        cardiovascularProto$SignsDataV1.getClass();
        ensureDetailsIsMutable();
        this.details_.add(i, cardiovascularProto$SignsDataV1);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$MultipleSignsAnalysisV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$MultipleSignsAnalysisV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
