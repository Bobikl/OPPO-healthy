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
public final class IccoaDkfConstant$VehicleProfile extends GeneratedMessageLite<IccoaDkfConstant$VehicleProfile, Builder> implements IccoaDkfConstant$VehicleProfileOrBuilder {
    public static final int CARDIMGRESID_FIELD_NUMBER = 6;
    private static final IccoaDkfConstant$VehicleProfile DEFAULT_INSTANCE;
    public static final int KEYACCESSPROFILES_FIELD_NUMBER = 3;
    private static volatile Parser<IccoaDkfConstant$VehicleProfile> PARSER = null;
    public static final int PASSIVEENTRIES_FIELD_NUMBER = 5;
    public static final int RKEFUNCTIONS_FIELD_NUMBER = 2;
    public static final int SHARELIMIT_FIELD_NUMBER = 4;
    public static final int VEHICLEMODEL_FIELD_NUMBER = 1;
    private int shareLimit_;
    private String vehicleModel_ = "";
    private Internal.ProtobufList<IccoaDkfConstant$RkeFunction> rkeFunctions_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<IccoaDkfConstant$KeyAccessProfile> keyAccessProfiles_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<IccoaDkfConstant$PassiveEntry> passiveEntries_ = GeneratedMessageLite.emptyProtobufList();
    private String cardImgResId_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$VehicleProfile, Builder> implements IccoaDkfConstant$VehicleProfileOrBuilder {
        public Builder addAllKeyAccessProfiles(Iterable<? extends IccoaDkfConstant$KeyAccessProfile> iterable) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addAllKeyAccessProfiles(iterable);
            return this;
        }

        public Builder addAllPassiveEntries(Iterable<? extends IccoaDkfConstant$PassiveEntry> iterable) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addAllPassiveEntries(iterable);
            return this;
        }

        public Builder addAllRkeFunctions(Iterable<? extends IccoaDkfConstant$RkeFunction> iterable) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addAllRkeFunctions(iterable);
            return this;
        }

        public Builder addKeyAccessProfiles(IccoaDkfConstant$KeyAccessProfile iccoaDkfConstant$KeyAccessProfile) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addKeyAccessProfiles(iccoaDkfConstant$KeyAccessProfile);
            return this;
        }

        public Builder addPassiveEntries(IccoaDkfConstant$PassiveEntry iccoaDkfConstant$PassiveEntry) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addPassiveEntries(iccoaDkfConstant$PassiveEntry);
            return this;
        }

        public Builder addRkeFunctions(IccoaDkfConstant$RkeFunction iccoaDkfConstant$RkeFunction) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addRkeFunctions(iccoaDkfConstant$RkeFunction);
            return this;
        }

        public Builder clearCardImgResId() {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).clearCardImgResId();
            return this;
        }

        public Builder clearKeyAccessProfiles() {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).clearKeyAccessProfiles();
            return this;
        }

        public Builder clearPassiveEntries() {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).clearPassiveEntries();
            return this;
        }

        public Builder clearRkeFunctions() {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).clearRkeFunctions();
            return this;
        }

        public Builder clearShareLimit() {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).clearShareLimit();
            return this;
        }

        public Builder clearVehicleModel() {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).clearVehicleModel();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public String getCardImgResId() {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getCardImgResId();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public ByteString getCardImgResIdBytes() {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getCardImgResIdBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public IccoaDkfConstant$KeyAccessProfile getKeyAccessProfiles(int i) {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getKeyAccessProfiles(i);
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public int getKeyAccessProfilesCount() {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getKeyAccessProfilesCount();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public List<IccoaDkfConstant$KeyAccessProfile> getKeyAccessProfilesList() {
            return Collections.unmodifiableList(((IccoaDkfConstant$VehicleProfile) this.instance).getKeyAccessProfilesList());
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public IccoaDkfConstant$PassiveEntry getPassiveEntries(int i) {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getPassiveEntries(i);
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public int getPassiveEntriesCount() {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getPassiveEntriesCount();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public List<IccoaDkfConstant$PassiveEntry> getPassiveEntriesList() {
            return Collections.unmodifiableList(((IccoaDkfConstant$VehicleProfile) this.instance).getPassiveEntriesList());
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public IccoaDkfConstant$RkeFunction getRkeFunctions(int i) {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getRkeFunctions(i);
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public int getRkeFunctionsCount() {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getRkeFunctionsCount();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public List<IccoaDkfConstant$RkeFunction> getRkeFunctionsList() {
            return Collections.unmodifiableList(((IccoaDkfConstant$VehicleProfile) this.instance).getRkeFunctionsList());
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public int getShareLimit() {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getShareLimit();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public String getVehicleModel() {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getVehicleModel();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
        public ByteString getVehicleModelBytes() {
            return ((IccoaDkfConstant$VehicleProfile) this.instance).getVehicleModelBytes();
        }

        public Builder removeKeyAccessProfiles(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).removeKeyAccessProfiles(i);
            return this;
        }

        public Builder removePassiveEntries(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).removePassiveEntries(i);
            return this;
        }

        public Builder removeRkeFunctions(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).removeRkeFunctions(i);
            return this;
        }

        public Builder setCardImgResId(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setCardImgResId(str);
            return this;
        }

        public Builder setCardImgResIdBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setCardImgResIdBytes(byteString);
            return this;
        }

        public Builder setKeyAccessProfiles(int i, IccoaDkfConstant$KeyAccessProfile iccoaDkfConstant$KeyAccessProfile) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setKeyAccessProfiles(i, iccoaDkfConstant$KeyAccessProfile);
            return this;
        }

        public Builder setPassiveEntries(int i, IccoaDkfConstant$PassiveEntry iccoaDkfConstant$PassiveEntry) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setPassiveEntries(i, iccoaDkfConstant$PassiveEntry);
            return this;
        }

        public Builder setRkeFunctions(int i, IccoaDkfConstant$RkeFunction iccoaDkfConstant$RkeFunction) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setRkeFunctions(i, iccoaDkfConstant$RkeFunction);
            return this;
        }

        public Builder setShareLimit(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setShareLimit(i);
            return this;
        }

        public Builder setVehicleModel(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setVehicleModel(str);
            return this;
        }

        public Builder setVehicleModelBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setVehicleModelBytes(byteString);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$VehicleProfile.DEFAULT_INSTANCE);
        }

        public Builder addKeyAccessProfiles(int i, IccoaDkfConstant$KeyAccessProfile iccoaDkfConstant$KeyAccessProfile) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addKeyAccessProfiles(i, iccoaDkfConstant$KeyAccessProfile);
            return this;
        }

        public Builder addPassiveEntries(int i, IccoaDkfConstant$PassiveEntry iccoaDkfConstant$PassiveEntry) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addPassiveEntries(i, iccoaDkfConstant$PassiveEntry);
            return this;
        }

        public Builder addRkeFunctions(int i, IccoaDkfConstant$RkeFunction iccoaDkfConstant$RkeFunction) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addRkeFunctions(i, iccoaDkfConstant$RkeFunction);
            return this;
        }

        public Builder setKeyAccessProfiles(int i, IccoaDkfConstant$KeyAccessProfile.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setKeyAccessProfiles(i, builder.build());
            return this;
        }

        public Builder setPassiveEntries(int i, IccoaDkfConstant$PassiveEntry.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setPassiveEntries(i, builder.build());
            return this;
        }

        public Builder setRkeFunctions(int i, IccoaDkfConstant$RkeFunction.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).setRkeFunctions(i, builder.build());
            return this;
        }

        public Builder addKeyAccessProfiles(IccoaDkfConstant$KeyAccessProfile.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addKeyAccessProfiles(builder.build());
            return this;
        }

        public Builder addPassiveEntries(IccoaDkfConstant$PassiveEntry.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addPassiveEntries(builder.build());
            return this;
        }

        public Builder addRkeFunctions(IccoaDkfConstant$RkeFunction.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addRkeFunctions(builder.build());
            return this;
        }

        public Builder addKeyAccessProfiles(int i, IccoaDkfConstant$KeyAccessProfile.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addKeyAccessProfiles(i, builder.build());
            return this;
        }

        public Builder addPassiveEntries(int i, IccoaDkfConstant$PassiveEntry.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addPassiveEntries(i, builder.build());
            return this;
        }

        public Builder addRkeFunctions(int i, IccoaDkfConstant$RkeFunction.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$VehicleProfile) this.instance).addRkeFunctions(i, builder.build());
            return this;
        }
    }

    static {
        IccoaDkfConstant$VehicleProfile iccoaDkfConstant$VehicleProfile = new IccoaDkfConstant$VehicleProfile();
        DEFAULT_INSTANCE = iccoaDkfConstant$VehicleProfile;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$VehicleProfile.class, iccoaDkfConstant$VehicleProfile);
    }

    private IccoaDkfConstant$VehicleProfile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKeyAccessProfiles(Iterable<? extends IccoaDkfConstant$KeyAccessProfile> iterable) {
        ensureKeyAccessProfilesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.keyAccessProfiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPassiveEntries(Iterable<? extends IccoaDkfConstant$PassiveEntry> iterable) {
        ensurePassiveEntriesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.passiveEntries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRkeFunctions(Iterable<? extends IccoaDkfConstant$RkeFunction> iterable) {
        ensureRkeFunctionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rkeFunctions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyAccessProfiles(IccoaDkfConstant$KeyAccessProfile iccoaDkfConstant$KeyAccessProfile) {
        iccoaDkfConstant$KeyAccessProfile.getClass();
        ensureKeyAccessProfilesIsMutable();
        this.keyAccessProfiles_.add(iccoaDkfConstant$KeyAccessProfile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPassiveEntries(IccoaDkfConstant$PassiveEntry iccoaDkfConstant$PassiveEntry) {
        iccoaDkfConstant$PassiveEntry.getClass();
        ensurePassiveEntriesIsMutable();
        this.passiveEntries_.add(iccoaDkfConstant$PassiveEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRkeFunctions(IccoaDkfConstant$RkeFunction iccoaDkfConstant$RkeFunction) {
        iccoaDkfConstant$RkeFunction.getClass();
        ensureRkeFunctionsIsMutable();
        this.rkeFunctions_.add(iccoaDkfConstant$RkeFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardImgResId() {
        this.cardImgResId_ = getDefaultInstance().getCardImgResId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyAccessProfiles() {
        this.keyAccessProfiles_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassiveEntries() {
        this.passiveEntries_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRkeFunctions() {
        this.rkeFunctions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareLimit() {
        this.shareLimit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleModel() {
        this.vehicleModel_ = getDefaultInstance().getVehicleModel();
    }

    private void ensureKeyAccessProfilesIsMutable() {
        Internal.ProtobufList<IccoaDkfConstant$KeyAccessProfile> protobufList = this.keyAccessProfiles_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.keyAccessProfiles_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePassiveEntriesIsMutable() {
        Internal.ProtobufList<IccoaDkfConstant$PassiveEntry> protobufList = this.passiveEntries_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.passiveEntries_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRkeFunctionsIsMutable() {
        Internal.ProtobufList<IccoaDkfConstant$RkeFunction> protobufList = this.rkeFunctions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rkeFunctions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static IccoaDkfConstant$VehicleProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$VehicleProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$VehicleProfile> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKeyAccessProfiles(int i) {
        ensureKeyAccessProfilesIsMutable();
        this.keyAccessProfiles_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePassiveEntries(int i) {
        ensurePassiveEntriesIsMutable();
        this.passiveEntries_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRkeFunctions(int i) {
        ensureRkeFunctionsIsMutable();
        this.rkeFunctions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardImgResId(String str) {
        str.getClass();
        this.cardImgResId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardImgResIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cardImgResId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyAccessProfiles(int i, IccoaDkfConstant$KeyAccessProfile iccoaDkfConstant$KeyAccessProfile) {
        iccoaDkfConstant$KeyAccessProfile.getClass();
        ensureKeyAccessProfilesIsMutable();
        this.keyAccessProfiles_.set(i, iccoaDkfConstant$KeyAccessProfile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassiveEntries(int i, IccoaDkfConstant$PassiveEntry iccoaDkfConstant$PassiveEntry) {
        iccoaDkfConstant$PassiveEntry.getClass();
        ensurePassiveEntriesIsMutable();
        this.passiveEntries_.set(i, iccoaDkfConstant$PassiveEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRkeFunctions(int i, IccoaDkfConstant$RkeFunction iccoaDkfConstant$RkeFunction) {
        iccoaDkfConstant$RkeFunction.getClass();
        ensureRkeFunctionsIsMutable();
        this.rkeFunctions_.set(i, iccoaDkfConstant$RkeFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareLimit(int i) {
        this.shareLimit_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleModel(String str) {
        str.getClass();
        this.vehicleModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vehicleModel_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$VehicleProfile();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\u0004\u0005\u001b\u0006Ȉ", new Object[]{"vehicleModel_", "rkeFunctions_", IccoaDkfConstant$RkeFunction.class, "keyAccessProfiles_", IccoaDkfConstant$KeyAccessProfile.class, "shareLimit_", "passiveEntries_", IccoaDkfConstant$PassiveEntry.class, "cardImgResId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$VehicleProfile> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$VehicleProfile.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public String getCardImgResId() {
        return this.cardImgResId_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public ByteString getCardImgResIdBytes() {
        return ByteString.copyFromUtf8(this.cardImgResId_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public IccoaDkfConstant$KeyAccessProfile getKeyAccessProfiles(int i) {
        return this.keyAccessProfiles_.get(i);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public int getKeyAccessProfilesCount() {
        return this.keyAccessProfiles_.size();
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public List<IccoaDkfConstant$KeyAccessProfile> getKeyAccessProfilesList() {
        return this.keyAccessProfiles_;
    }

    public IccoaDkfConstant$KeyAccessProfileOrBuilder getKeyAccessProfilesOrBuilder(int i) {
        return this.keyAccessProfiles_.get(i);
    }

    public List<? extends IccoaDkfConstant$KeyAccessProfileOrBuilder> getKeyAccessProfilesOrBuilderList() {
        return this.keyAccessProfiles_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public IccoaDkfConstant$PassiveEntry getPassiveEntries(int i) {
        return this.passiveEntries_.get(i);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public int getPassiveEntriesCount() {
        return this.passiveEntries_.size();
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public List<IccoaDkfConstant$PassiveEntry> getPassiveEntriesList() {
        return this.passiveEntries_;
    }

    public IccoaDkfConstant$PassiveEntryOrBuilder getPassiveEntriesOrBuilder(int i) {
        return this.passiveEntries_.get(i);
    }

    public List<? extends IccoaDkfConstant$PassiveEntryOrBuilder> getPassiveEntriesOrBuilderList() {
        return this.passiveEntries_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public IccoaDkfConstant$RkeFunction getRkeFunctions(int i) {
        return this.rkeFunctions_.get(i);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public int getRkeFunctionsCount() {
        return this.rkeFunctions_.size();
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public List<IccoaDkfConstant$RkeFunction> getRkeFunctionsList() {
        return this.rkeFunctions_;
    }

    public IccoaDkfConstant$RkeFunctionOrBuilder getRkeFunctionsOrBuilder(int i) {
        return this.rkeFunctions_.get(i);
    }

    public List<? extends IccoaDkfConstant$RkeFunctionOrBuilder> getRkeFunctionsOrBuilderList() {
        return this.rkeFunctions_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public int getShareLimit() {
        return this.shareLimit_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public String getVehicleModel() {
        return this.vehicleModel_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$VehicleProfileOrBuilder
    public ByteString getVehicleModelBytes() {
        return ByteString.copyFromUtf8(this.vehicleModel_);
    }

    public static Builder newBuilder(IccoaDkfConstant$VehicleProfile iccoaDkfConstant$VehicleProfile) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$VehicleProfile);
    }

    public static IccoaDkfConstant$VehicleProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyAccessProfiles(int i, IccoaDkfConstant$KeyAccessProfile iccoaDkfConstant$KeyAccessProfile) {
        iccoaDkfConstant$KeyAccessProfile.getClass();
        ensureKeyAccessProfilesIsMutable();
        this.keyAccessProfiles_.add(i, iccoaDkfConstant$KeyAccessProfile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPassiveEntries(int i, IccoaDkfConstant$PassiveEntry iccoaDkfConstant$PassiveEntry) {
        iccoaDkfConstant$PassiveEntry.getClass();
        ensurePassiveEntriesIsMutable();
        this.passiveEntries_.add(i, iccoaDkfConstant$PassiveEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRkeFunctions(int i, IccoaDkfConstant$RkeFunction iccoaDkfConstant$RkeFunction) {
        iccoaDkfConstant$RkeFunction.getClass();
        ensureRkeFunctionsIsMutable();
        this.rkeFunctions_.add(i, iccoaDkfConstant$RkeFunction);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$VehicleProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$VehicleProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
