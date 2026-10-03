package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$WfEntity extends GeneratedMessageLite<Proto$WfEntity, Builder> implements Proto$WfEntityOrBuilder {
    public static final int BACKGROUND_INDEX_FIELD_NUMBER = 19;
    public static final int CAN_EDIT_FIELD_NUMBER = 21;
    private static final Proto$WfEntity DEFAULT_INSTANCE;
    public static final int IS_CURRENT_FIELD_NUMBER = 18;
    public static final int IS_HIDDEN_FIELD_NUMBER = 22;
    private static volatile Parser<Proto$WfEntity> PARSER = null;
    public static final int POSITION_INDEX_FIELD_NUMBER = 9;
    public static final int PREVIEW_RES_NAMES_FIELD_NUMBER = 17;
    public static final int STYLE_INDEX_FIELD_NUMBER = 16;
    public static final int STYLE_UNIQUE_FIELD_NUMBER = 20;
    public static final int WF_AUTHOR_FIELD_NUMBER = 7;
    public static final int WF_DESCRIPTION_EN_FIELD_NUMBER = 6;
    public static final int WF_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int WF_DESIGNER_FIELD_NUMBER = 8;
    public static final int WF_NAME_EN_FIELD_NUMBER = 4;
    public static final int WF_NAME_FIELD_NUMBER = 3;
    public static final int WF_PKG_NAME_FIELD_NUMBER = 23;
    public static final int WF_UNIQUE_FIELD_NUMBER = 1;
    public static final int WF_VERSION_FIELD_NUMBER = 2;
    private int backgroundIndex_;
    private boolean canEdit_;
    private boolean isCurrent_;
    private boolean isHidden_;
    private int positionIndex_;
    private int styleIndex_;
    private String wfUnique_ = "";
    private String wfVersion_ = "";
    private String wfName_ = "";
    private String wfNameEn_ = "";
    private String wfDescription_ = "";
    private String wfDescriptionEn_ = "";
    private String wfAuthor_ = "";
    private String wfDesigner_ = "";
    private Internal.ProtobufList<String> previewResNames_ = GeneratedMessageLite.emptyProtobufList();
    private String styleUnique_ = "";
    private String wfPkgName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WfEntity, Builder> implements Proto$WfEntityOrBuilder {
        public Builder addAllPreviewResNames(Iterable<String> iterable) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).addAllPreviewResNames(iterable);
            return this;
        }

        public Builder addPreviewResNames(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).addPreviewResNames(str);
            return this;
        }

        public Builder addPreviewResNamesBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).addPreviewResNamesBytes(byteString);
            return this;
        }

        public Builder clearBackgroundIndex() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearBackgroundIndex();
            return this;
        }

        public Builder clearCanEdit() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearCanEdit();
            return this;
        }

        public Builder clearIsCurrent() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearIsCurrent();
            return this;
        }

        public Builder clearIsHidden() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearIsHidden();
            return this;
        }

        public Builder clearPositionIndex() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearPositionIndex();
            return this;
        }

        public Builder clearPreviewResNames() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearPreviewResNames();
            return this;
        }

        public Builder clearStyleIndex() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearStyleIndex();
            return this;
        }

        public Builder clearStyleUnique() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearStyleUnique();
            return this;
        }

        public Builder clearWfAuthor() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearWfAuthor();
            return this;
        }

        public Builder clearWfDescription() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearWfDescription();
            return this;
        }

        public Builder clearWfDescriptionEn() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearWfDescriptionEn();
            return this;
        }

        public Builder clearWfDesigner() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearWfDesigner();
            return this;
        }

        public Builder clearWfName() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearWfName();
            return this;
        }

        public Builder clearWfNameEn() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearWfNameEn();
            return this;
        }

        public Builder clearWfPkgName() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearWfPkgName();
            return this;
        }

        public Builder clearWfUnique() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearWfUnique();
            return this;
        }

        public Builder clearWfVersion() {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).clearWfVersion();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public int getBackgroundIndex() {
            return ((Proto$WfEntity) this.instance).getBackgroundIndex();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public boolean getCanEdit() {
            return ((Proto$WfEntity) this.instance).getCanEdit();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public boolean getIsCurrent() {
            return ((Proto$WfEntity) this.instance).getIsCurrent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public boolean getIsHidden() {
            return ((Proto$WfEntity) this.instance).getIsHidden();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public int getPositionIndex() {
            return ((Proto$WfEntity) this.instance).getPositionIndex();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getPreviewResNames(int i) {
            return ((Proto$WfEntity) this.instance).getPreviewResNames(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getPreviewResNamesBytes(int i) {
            return ((Proto$WfEntity) this.instance).getPreviewResNamesBytes(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public int getPreviewResNamesCount() {
            return ((Proto$WfEntity) this.instance).getPreviewResNamesCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public List<String> getPreviewResNamesList() {
            return Collections.unmodifiableList(((Proto$WfEntity) this.instance).getPreviewResNamesList());
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public int getStyleIndex() {
            return ((Proto$WfEntity) this.instance).getStyleIndex();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getStyleUnique() {
            return ((Proto$WfEntity) this.instance).getStyleUnique();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getStyleUniqueBytes() {
            return ((Proto$WfEntity) this.instance).getStyleUniqueBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getWfAuthor() {
            return ((Proto$WfEntity) this.instance).getWfAuthor();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getWfAuthorBytes() {
            return ((Proto$WfEntity) this.instance).getWfAuthorBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getWfDescription() {
            return ((Proto$WfEntity) this.instance).getWfDescription();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getWfDescriptionBytes() {
            return ((Proto$WfEntity) this.instance).getWfDescriptionBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getWfDescriptionEn() {
            return ((Proto$WfEntity) this.instance).getWfDescriptionEn();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getWfDescriptionEnBytes() {
            return ((Proto$WfEntity) this.instance).getWfDescriptionEnBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getWfDesigner() {
            return ((Proto$WfEntity) this.instance).getWfDesigner();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getWfDesignerBytes() {
            return ((Proto$WfEntity) this.instance).getWfDesignerBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getWfName() {
            return ((Proto$WfEntity) this.instance).getWfName();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getWfNameBytes() {
            return ((Proto$WfEntity) this.instance).getWfNameBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getWfNameEn() {
            return ((Proto$WfEntity) this.instance).getWfNameEn();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getWfNameEnBytes() {
            return ((Proto$WfEntity) this.instance).getWfNameEnBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getWfPkgName() {
            return ((Proto$WfEntity) this.instance).getWfPkgName();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getWfPkgNameBytes() {
            return ((Proto$WfEntity) this.instance).getWfPkgNameBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getWfUnique() {
            return ((Proto$WfEntity) this.instance).getWfUnique();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getWfUniqueBytes() {
            return ((Proto$WfEntity) this.instance).getWfUniqueBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public String getWfVersion() {
            return ((Proto$WfEntity) this.instance).getWfVersion();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
        public ByteString getWfVersionBytes() {
            return ((Proto$WfEntity) this.instance).getWfVersionBytes();
        }

        public Builder setBackgroundIndex(int i) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setBackgroundIndex(i);
            return this;
        }

        public Builder setCanEdit(boolean z) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setCanEdit(z);
            return this;
        }

        public Builder setIsCurrent(boolean z) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setIsCurrent(z);
            return this;
        }

        public Builder setIsHidden(boolean z) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setIsHidden(z);
            return this;
        }

        public Builder setPositionIndex(int i) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setPositionIndex(i);
            return this;
        }

        public Builder setPreviewResNames(int i, String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setPreviewResNames(i, str);
            return this;
        }

        public Builder setStyleIndex(int i) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setStyleIndex(i);
            return this;
        }

        public Builder setStyleUnique(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setStyleUnique(str);
            return this;
        }

        public Builder setStyleUniqueBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setStyleUniqueBytes(byteString);
            return this;
        }

        public Builder setWfAuthor(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfAuthor(str);
            return this;
        }

        public Builder setWfAuthorBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfAuthorBytes(byteString);
            return this;
        }

        public Builder setWfDescription(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfDescription(str);
            return this;
        }

        public Builder setWfDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfDescriptionBytes(byteString);
            return this;
        }

        public Builder setWfDescriptionEn(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfDescriptionEn(str);
            return this;
        }

        public Builder setWfDescriptionEnBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfDescriptionEnBytes(byteString);
            return this;
        }

        public Builder setWfDesigner(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfDesigner(str);
            return this;
        }

        public Builder setWfDesignerBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfDesignerBytes(byteString);
            return this;
        }

        public Builder setWfName(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfName(str);
            return this;
        }

        public Builder setWfNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfNameBytes(byteString);
            return this;
        }

        public Builder setWfNameEn(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfNameEn(str);
            return this;
        }

        public Builder setWfNameEnBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfNameEnBytes(byteString);
            return this;
        }

        public Builder setWfPkgName(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfPkgName(str);
            return this;
        }

        public Builder setWfPkgNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfPkgNameBytes(byteString);
            return this;
        }

        public Builder setWfUnique(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfUnique(str);
            return this;
        }

        public Builder setWfUniqueBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfUniqueBytes(byteString);
            return this;
        }

        public Builder setWfVersion(String str) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfVersion(str);
            return this;
        }

        public Builder setWfVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEntity) this.instance).setWfVersionBytes(byteString);
            return this;
        }

        private Builder() {
            super(Proto$WfEntity.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$WfEntity proto$WfEntity = new Proto$WfEntity();
        DEFAULT_INSTANCE = proto$WfEntity;
        GeneratedMessageLite.registerDefaultInstance(Proto$WfEntity.class, proto$WfEntity);
    }

    private Proto$WfEntity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPreviewResNames(Iterable<String> iterable) {
        ensurePreviewResNamesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.previewResNames_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviewResNames(String str) {
        str.getClass();
        ensurePreviewResNamesIsMutable();
        this.previewResNames_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviewResNamesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensurePreviewResNamesIsMutable();
        this.previewResNames_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundIndex() {
        this.backgroundIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanEdit() {
        this.canEdit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurrent() {
        this.isCurrent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHidden() {
        this.isHidden_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositionIndex() {
        this.positionIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewResNames() {
        this.previewResNames_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleIndex() {
        this.styleIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleUnique() {
        this.styleUnique_ = getDefaultInstance().getStyleUnique();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfAuthor() {
        this.wfAuthor_ = getDefaultInstance().getWfAuthor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfDescription() {
        this.wfDescription_ = getDefaultInstance().getWfDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfDescriptionEn() {
        this.wfDescriptionEn_ = getDefaultInstance().getWfDescriptionEn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfDesigner() {
        this.wfDesigner_ = getDefaultInstance().getWfDesigner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfName() {
        this.wfName_ = getDefaultInstance().getWfName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfNameEn() {
        this.wfNameEn_ = getDefaultInstance().getWfNameEn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfPkgName() {
        this.wfPkgName_ = getDefaultInstance().getWfPkgName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfUnique() {
        this.wfUnique_ = getDefaultInstance().getWfUnique();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfVersion() {
        this.wfVersion_ = getDefaultInstance().getWfVersion();
    }

    private void ensurePreviewResNamesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.previewResNames_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.previewResNames_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Proto$WfEntity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WfEntity parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WfEntity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WfEntity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WfEntity> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundIndex(int i) {
        this.backgroundIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanEdit(boolean z) {
        this.canEdit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurrent(boolean z) {
        this.isCurrent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHidden(boolean z) {
        this.isHidden_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositionIndex(int i) {
        this.positionIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewResNames(int i, String str) {
        str.getClass();
        ensurePreviewResNamesIsMutable();
        this.previewResNames_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleIndex(int i) {
        this.styleIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleUnique(String str) {
        str.getClass();
        this.styleUnique_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleUniqueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.styleUnique_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfAuthor(String str) {
        str.getClass();
        this.wfAuthor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfAuthorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfAuthor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfDescription(String str) {
        str.getClass();
        this.wfDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfDescription_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfDescriptionEn(String str) {
        str.getClass();
        this.wfDescriptionEn_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfDescriptionEnBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfDescriptionEn_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfDesigner(String str) {
        str.getClass();
        this.wfDesigner_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfDesignerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfDesigner_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfName(String str) {
        str.getClass();
        this.wfName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfNameEn(String str) {
        str.getClass();
        this.wfNameEn_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfNameEnBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfNameEn_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfPkgName(String str) {
        str.getClass();
        this.wfPkgName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfPkgNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfPkgName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfUnique(String str) {
        str.getClass();
        this.wfUnique_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfUniqueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfUnique_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfVersion(String str) {
        str.getClass();
        this.wfVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfVersion_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (fze.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Proto$WfEntity();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0017\u0011\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t\u0004\u0010\u0004\u0011Ț\u0012\u0007\u0013\u0004\u0014Ȉ\u0015\u0007\u0016\u0007\u0017Ȉ", new Object[]{"wfUnique_", "wfVersion_", "wfName_", "wfNameEn_", "wfDescription_", "wfDescriptionEn_", "wfAuthor_", "wfDesigner_", "positionIndex_", "styleIndex_", "previewResNames_", "isCurrent_", "backgroundIndex_", "styleUnique_", "canEdit_", "isHidden_", "wfPkgName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WfEntity> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WfEntity.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public int getBackgroundIndex() {
        return this.backgroundIndex_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public boolean getCanEdit() {
        return this.canEdit_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public boolean getIsCurrent() {
        return this.isCurrent_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public boolean getIsHidden() {
        return this.isHidden_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public int getPositionIndex() {
        return this.positionIndex_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getPreviewResNames(int i) {
        return this.previewResNames_.get(i);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getPreviewResNamesBytes(int i) {
        return ByteString.copyFromUtf8(this.previewResNames_.get(i));
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public int getPreviewResNamesCount() {
        return this.previewResNames_.size();
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public List<String> getPreviewResNamesList() {
        return this.previewResNames_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public int getStyleIndex() {
        return this.styleIndex_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getStyleUnique() {
        return this.styleUnique_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getStyleUniqueBytes() {
        return ByteString.copyFromUtf8(this.styleUnique_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getWfAuthor() {
        return this.wfAuthor_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getWfAuthorBytes() {
        return ByteString.copyFromUtf8(this.wfAuthor_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getWfDescription() {
        return this.wfDescription_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getWfDescriptionBytes() {
        return ByteString.copyFromUtf8(this.wfDescription_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getWfDescriptionEn() {
        return this.wfDescriptionEn_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getWfDescriptionEnBytes() {
        return ByteString.copyFromUtf8(this.wfDescriptionEn_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getWfDesigner() {
        return this.wfDesigner_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getWfDesignerBytes() {
        return ByteString.copyFromUtf8(this.wfDesigner_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getWfName() {
        return this.wfName_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getWfNameBytes() {
        return ByteString.copyFromUtf8(this.wfName_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getWfNameEn() {
        return this.wfNameEn_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getWfNameEnBytes() {
        return ByteString.copyFromUtf8(this.wfNameEn_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getWfPkgName() {
        return this.wfPkgName_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getWfPkgNameBytes() {
        return ByteString.copyFromUtf8(this.wfPkgName_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getWfUnique() {
        return this.wfUnique_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getWfUniqueBytes() {
        return ByteString.copyFromUtf8(this.wfUnique_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public String getWfVersion() {
        return this.wfVersion_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEntityOrBuilder
    public ByteString getWfVersionBytes() {
        return ByteString.copyFromUtf8(this.wfVersion_);
    }

    public static Builder newBuilder(Proto$WfEntity proto$WfEntity) {
        return DEFAULT_INSTANCE.createBuilder(proto$WfEntity);
    }

    public static Proto$WfEntity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WfEntity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WfEntity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WfEntity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$WfEntity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WfEntity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WfEntity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WfEntity parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WfEntity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WfEntity parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WfEntity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WfEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
