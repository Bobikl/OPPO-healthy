package com.heytap.health.wallet.entrance.db;

import androidx.room.util.TableInfo;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.xn6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class EntranceCardProto$SectorInfo extends GeneratedMessageLite<EntranceCardProto$SectorInfo, Builder> implements EntranceCardProto$SectorInfoOrBuilder {
    public static final int BLOCKINFOS_FIELD_NUMBER = 3;
    private static final EntranceCardProto$SectorInfo DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int ISENCRYPT_FIELD_NUMBER = 2;
    private static volatile Parser<EntranceCardProto$SectorInfo> PARSER;
    private Internal.ProtobufList<String> blockInfos_ = GeneratedMessageLite.emptyProtobufList();
    private int index_;
    private boolean isEncrypt_;

    public static final class Builder extends GeneratedMessageLite.Builder<EntranceCardProto$SectorInfo, Builder> implements EntranceCardProto$SectorInfoOrBuilder {
        public Builder addAllBlockInfos(Iterable<String> iterable) {
            copyOnWrite();
            ((EntranceCardProto$SectorInfo) this.instance).addAllBlockInfos(iterable);
            return this;
        }

        public Builder addBlockInfos(String str) {
            copyOnWrite();
            ((EntranceCardProto$SectorInfo) this.instance).addBlockInfos(str);
            return this;
        }

        public Builder addBlockInfosBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceCardProto$SectorInfo) this.instance).addBlockInfosBytes(byteString);
            return this;
        }

        public Builder clearBlockInfos() {
            copyOnWrite();
            ((EntranceCardProto$SectorInfo) this.instance).clearBlockInfos();
            return this;
        }

        public Builder clearIndex() {
            copyOnWrite();
            ((EntranceCardProto$SectorInfo) this.instance).clearIndex();
            return this;
        }

        public Builder clearIsEncrypt() {
            copyOnWrite();
            ((EntranceCardProto$SectorInfo) this.instance).clearIsEncrypt();
            return this;
        }

        @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
        public String getBlockInfos(int i) {
            return ((EntranceCardProto$SectorInfo) this.instance).getBlockInfos(i);
        }

        @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
        public ByteString getBlockInfosBytes(int i) {
            return ((EntranceCardProto$SectorInfo) this.instance).getBlockInfosBytes(i);
        }

        @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
        public int getBlockInfosCount() {
            return ((EntranceCardProto$SectorInfo) this.instance).getBlockInfosCount();
        }

        @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
        public List<String> getBlockInfosList() {
            return Collections.unmodifiableList(((EntranceCardProto$SectorInfo) this.instance).getBlockInfosList());
        }

        @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
        public int getIndex() {
            return ((EntranceCardProto$SectorInfo) this.instance).getIndex();
        }

        @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
        public boolean getIsEncrypt() {
            return ((EntranceCardProto$SectorInfo) this.instance).getIsEncrypt();
        }

        public Builder setBlockInfos(int i, String str) {
            copyOnWrite();
            ((EntranceCardProto$SectorInfo) this.instance).setBlockInfos(i, str);
            return this;
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((EntranceCardProto$SectorInfo) this.instance).setIndex(i);
            return this;
        }

        public Builder setIsEncrypt(boolean z) {
            copyOnWrite();
            ((EntranceCardProto$SectorInfo) this.instance).setIsEncrypt(z);
            return this;
        }

        private Builder() {
            super(EntranceCardProto$SectorInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        EntranceCardProto$SectorInfo entranceCardProto$SectorInfo = new EntranceCardProto$SectorInfo();
        DEFAULT_INSTANCE = entranceCardProto$SectorInfo;
        GeneratedMessageLite.registerDefaultInstance(EntranceCardProto$SectorInfo.class, entranceCardProto$SectorInfo);
    }

    private EntranceCardProto$SectorInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBlockInfos(Iterable<String> iterable) {
        ensureBlockInfosIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.blockInfos_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBlockInfos(String str) {
        str.getClass();
        ensureBlockInfosIsMutable();
        this.blockInfos_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBlockInfosBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureBlockInfosIsMutable();
        this.blockInfos_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlockInfos() {
        this.blockInfos_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsEncrypt() {
        this.isEncrypt_ = false;
    }

    private void ensureBlockInfosIsMutable() {
        Internal.ProtobufList<String> protobufList = this.blockInfos_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.blockInfos_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static EntranceCardProto$SectorInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EntranceCardProto$SectorInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EntranceCardProto$SectorInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EntranceCardProto$SectorInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockInfos(int i, String str) {
        str.getClass();
        ensureBlockInfosIsMutable();
        this.blockInfos_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsEncrypt(boolean z) {
        this.isEncrypt_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = xn6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new EntranceCardProto$SectorInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0007\u0003Ț", new Object[]{TableInfo.Index.DEFAULT_PREFIX, "isEncrypt_", "blockInfos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EntranceCardProto$SectorInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EntranceCardProto$SectorInfo.class) {
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

    @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
    public String getBlockInfos(int i) {
        return this.blockInfos_.get(i);
    }

    @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
    public ByteString getBlockInfosBytes(int i) {
        return ByteString.copyFromUtf8(this.blockInfos_.get(i));
    }

    @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
    public int getBlockInfosCount() {
        return this.blockInfos_.size();
    }

    @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
    public List<String> getBlockInfosList() {
        return this.blockInfos_;
    }

    @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfoOrBuilder
    public boolean getIsEncrypt() {
        return this.isEncrypt_;
    }

    public static Builder newBuilder(EntranceCardProto$SectorInfo entranceCardProto$SectorInfo) {
        return DEFAULT_INSTANCE.createBuilder(entranceCardProto$SectorInfo);
    }

    public static EntranceCardProto$SectorInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EntranceCardProto$SectorInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EntranceCardProto$SectorInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EntranceCardProto$SectorInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EntranceCardProto$SectorInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EntranceCardProto$SectorInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EntranceCardProto$SectorInfo parseFrom(InputStream inputStream) throws IOException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EntranceCardProto$SectorInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EntranceCardProto$SectorInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EntranceCardProto$SectorInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EntranceCardProto$SectorInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
