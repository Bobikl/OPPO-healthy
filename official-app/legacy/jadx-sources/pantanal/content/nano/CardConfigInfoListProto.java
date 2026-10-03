package pantanal.content.nano;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.oplus.drs.core.net.entity.UploadStateAware;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class CardConfigInfoListProto extends MessageNano {
    private static volatile CardConfigInfoListProto[] _emptyArray;
    public int cardConfigResultStatus;
    public CardConfigInfoProto[] list;

    public static final class CardConfigInfoProto extends MessageNano {
        public static final int APP = 2;
        public static final int CONTENT_OPERATION = 3;
        public static final int FOUR_PLUS_FOUR = 3;
        public static final int HOT = 3;
        public static final int INSTANT = 1;
        public static final int NEW = 2;
        public static final int NONE = 1;
        public static final int NOTIFICATION_LG = 9;
        public static final int NOTIFICATION_MD = 8;
        public static final int NOTIFICATION_SM = 7;
        public static final int N_PLUS_FOUR = 4;
        public static final int ONE_PLUS_ONE = 10;
        public static final int ONE_PLUS_TWO = 5;
        public static final int SEEDING = 100;
        public static final int SERVICE = 4;
        public static final int TWO_PLUS_FOUR = 2;
        public static final int TWO_PLUS_TWO = 1;
        public static final int UNAVAILABLE = 4;
        public static final int WIDGET_ONE_PLUS_ONE = 6;
        private static volatile CardConfigInfoProto[] _emptyArray;
        public String bizPkgName;
        public CardMaintainProto cardMaintain;
        public int category;
        public String componentName;
        public int defaultSubscribed;
        public String desc;
        public int displayArea;
        public String distributeType;
        public boolean dragonFlySecure;
        public String dragonFlyService;
        public int dragonFlyType;
        public String extras;
        public String groupIcon;
        public int groupId;
        public int groupOrder;
        public String groupTitle;
        public String identification;
        public String instantCardUrl;
        public boolean isDarkStyle;
        public String loadFailDp;
        public String loadFailPicPath;
        public String loadingBgIcon;
        public String loadingIcon;
        public String materialPreview;
        public int minHeight;
        public int minWidth;
        public String miniAppIcon;
        public String name;
        public int operatingIcon;
        public int orderInGroup;
        public String packageName;
        public String preview;
        public String previewSw480;
        public int reservedFlag;
        public boolean resizable;
        public String serviceId;
        public String settingUrl;
        public int showTitle;
        public boolean showWhenLocked;
        public int size;
        public String skeletonDarkPicPath;
        public String skeletonPicPath;
        public boolean supportSuperChannel;
        public int type;

        public CardConfigInfoProto() {
            clear();
        }

        public static CardConfigInfoProto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CardConfigInfoProto[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static CardConfigInfoProto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CardConfigInfoProto) MessageNano.mergeFrom(new CardConfigInfoProto(), bArr);
        }

        public CardConfigInfoProto clear() {
            this.groupId = 0;
            this.groupTitle = "";
            this.groupIcon = "";
            this.type = 0;
            this.name = "";
            this.desc = "";
            this.preview = "";
            this.size = 1;
            this.orderInGroup = 0;
            this.packageName = "";
            this.componentName = "";
            this.category = 0;
            this.resizable = false;
            this.operatingIcon = 1;
            this.settingUrl = "";
            this.displayArea = 0;
            this.minWidth = 0;
            this.minHeight = 0;
            this.loadingIcon = "";
            this.loadingBgIcon = "";
            this.reservedFlag = 0;
            this.defaultSubscribed = 0;
            this.groupOrder = -1;
            this.previewSw480 = "";
            this.serviceId = "";
            this.dragonFlyType = 0;
            this.dragonFlySecure = false;
            this.dragonFlyService = "";
            this.skeletonPicPath = "";
            this.skeletonDarkPicPath = "";
            this.loadFailPicPath = "";
            this.loadFailDp = "";
            this.showTitle = 0;
            this.miniAppIcon = "";
            this.isDarkStyle = false;
            this.showWhenLocked = false;
            this.instantCardUrl = "";
            this.supportSuperChannel = false;
            this.identification = "";
            this.cardMaintain = null;
            this.materialPreview = "";
            this.distributeType = "";
            this.bizPkgName = "";
            this.extras = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.groupId) + CodedOutputByteBufferNano.computeStringSize(2, this.groupTitle) + CodedOutputByteBufferNano.computeStringSize(3, this.groupIcon) + CodedOutputByteBufferNano.computeInt32Size(4, this.type) + CodedOutputByteBufferNano.computeStringSize(5, this.name) + CodedOutputByteBufferNano.computeStringSize(6, this.desc) + CodedOutputByteBufferNano.computeStringSize(7, this.preview) + CodedOutputByteBufferNano.computeInt32Size(8, this.size);
            int i = this.orderInGroup;
            if (i != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i);
            }
            int iComputeStringSize = iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.packageName) + CodedOutputByteBufferNano.computeStringSize(11, this.componentName) + CodedOutputByteBufferNano.computeInt32Size(12, this.category) + CodedOutputByteBufferNano.computeBoolSize(13, this.resizable) + CodedOutputByteBufferNano.computeInt32Size(14, this.operatingIcon) + CodedOutputByteBufferNano.computeStringSize(15, this.settingUrl);
            int i2 = this.displayArea;
            if (i2 != 0) {
                iComputeStringSize += CodedOutputByteBufferNano.computeInt32Size(16, i2);
            }
            int i3 = this.minWidth;
            if (i3 != 0) {
                iComputeStringSize += CodedOutputByteBufferNano.computeInt32Size(17, i3);
            }
            int i4 = this.minHeight;
            if (i4 != 0) {
                iComputeStringSize += CodedOutputByteBufferNano.computeInt32Size(18, i4);
            }
            if (!this.loadingIcon.equals("")) {
                iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(19, this.loadingIcon);
            }
            if (!this.loadingBgIcon.equals("")) {
                iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(20, this.loadingBgIcon);
            }
            int i5 = this.reservedFlag;
            if (i5 != 0) {
                iComputeStringSize += CodedOutputByteBufferNano.computeInt32Size(21, i5);
            }
            int i6 = this.defaultSubscribed;
            if (i6 != 0) {
                iComputeStringSize += CodedOutputByteBufferNano.computeInt32Size(22, i6);
            }
            int i7 = this.groupOrder;
            if (i7 != -1) {
                iComputeStringSize += CodedOutputByteBufferNano.computeInt32Size(23, i7);
            }
            if (!this.previewSw480.equals("")) {
                iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(24, this.previewSw480);
            }
            int iComputeStringSize2 = iComputeStringSize + CodedOutputByteBufferNano.computeStringSize(25, this.serviceId);
            int i8 = this.dragonFlyType;
            if (i8 != 0) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeInt32Size(51, i8);
            }
            boolean z = this.dragonFlySecure;
            if (z) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeBoolSize(52, z);
            }
            if (!this.dragonFlyService.equals("")) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeStringSize(53, this.dragonFlyService);
            }
            if (!this.skeletonPicPath.equals("")) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeStringSize(54, this.skeletonPicPath);
            }
            if (!this.skeletonDarkPicPath.equals("")) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeStringSize(55, this.skeletonDarkPicPath);
            }
            if (!this.loadFailPicPath.equals("")) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeStringSize(56, this.loadFailPicPath);
            }
            if (!this.loadFailDp.equals("")) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeStringSize(57, this.loadFailDp);
            }
            int i9 = this.showTitle;
            if (i9 != 0) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeInt32Size(58, i9);
            }
            if (!this.miniAppIcon.equals("")) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeStringSize(59, this.miniAppIcon);
            }
            boolean z2 = this.isDarkStyle;
            if (z2) {
                iComputeStringSize2 += CodedOutputByteBufferNano.computeBoolSize(60, z2);
            }
            int iComputeBoolSize = iComputeStringSize2 + CodedOutputByteBufferNano.computeBoolSize(61, this.showWhenLocked);
            if (!this.instantCardUrl.equals("")) {
                iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(62, this.instantCardUrl);
            }
            boolean z3 = this.supportSuperChannel;
            if (z3) {
                iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(63, z3);
            }
            if (!this.identification.equals("")) {
                iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(64, this.identification);
            }
            CardMaintainProto cardMaintainProto = this.cardMaintain;
            if (cardMaintainProto != null) {
                iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(65, cardMaintainProto);
            }
            if (!this.materialPreview.equals("")) {
                iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(66, this.materialPreview);
            }
            if (!this.distributeType.equals("")) {
                iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(67, this.distributeType);
            }
            if (!this.bizPkgName.equals("")) {
                iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(68, this.bizPkgName);
            }
            return !this.extras.equals("") ? iComputeBoolSize + CodedOutputByteBufferNano.computeStringSize(69, this.extras) : iComputeBoolSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.groupId);
            codedOutputByteBufferNano.writeString(2, this.groupTitle);
            codedOutputByteBufferNano.writeString(3, this.groupIcon);
            codedOutputByteBufferNano.writeInt32(4, this.type);
            codedOutputByteBufferNano.writeString(5, this.name);
            codedOutputByteBufferNano.writeString(6, this.desc);
            codedOutputByteBufferNano.writeString(7, this.preview);
            codedOutputByteBufferNano.writeInt32(8, this.size);
            int i = this.orderInGroup;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(9, i);
            }
            codedOutputByteBufferNano.writeString(10, this.packageName);
            codedOutputByteBufferNano.writeString(11, this.componentName);
            codedOutputByteBufferNano.writeInt32(12, this.category);
            codedOutputByteBufferNano.writeBool(13, this.resizable);
            codedOutputByteBufferNano.writeInt32(14, this.operatingIcon);
            codedOutputByteBufferNano.writeString(15, this.settingUrl);
            int i2 = this.displayArea;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeInt32(16, i2);
            }
            int i3 = this.minWidth;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeInt32(17, i3);
            }
            int i4 = this.minHeight;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeInt32(18, i4);
            }
            if (!this.loadingIcon.equals("")) {
                codedOutputByteBufferNano.writeString(19, this.loadingIcon);
            }
            if (!this.loadingBgIcon.equals("")) {
                codedOutputByteBufferNano.writeString(20, this.loadingBgIcon);
            }
            int i5 = this.reservedFlag;
            if (i5 != 0) {
                codedOutputByteBufferNano.writeInt32(21, i5);
            }
            int i6 = this.defaultSubscribed;
            if (i6 != 0) {
                codedOutputByteBufferNano.writeInt32(22, i6);
            }
            int i7 = this.groupOrder;
            if (i7 != -1) {
                codedOutputByteBufferNano.writeInt32(23, i7);
            }
            if (!this.previewSw480.equals("")) {
                codedOutputByteBufferNano.writeString(24, this.previewSw480);
            }
            codedOutputByteBufferNano.writeString(25, this.serviceId);
            int i8 = this.dragonFlyType;
            if (i8 != 0) {
                codedOutputByteBufferNano.writeInt32(51, i8);
            }
            boolean z = this.dragonFlySecure;
            if (z) {
                codedOutputByteBufferNano.writeBool(52, z);
            }
            if (!this.dragonFlyService.equals("")) {
                codedOutputByteBufferNano.writeString(53, this.dragonFlyService);
            }
            if (!this.skeletonPicPath.equals("")) {
                codedOutputByteBufferNano.writeString(54, this.skeletonPicPath);
            }
            if (!this.skeletonDarkPicPath.equals("")) {
                codedOutputByteBufferNano.writeString(55, this.skeletonDarkPicPath);
            }
            if (!this.loadFailPicPath.equals("")) {
                codedOutputByteBufferNano.writeString(56, this.loadFailPicPath);
            }
            if (!this.loadFailDp.equals("")) {
                codedOutputByteBufferNano.writeString(57, this.loadFailDp);
            }
            int i9 = this.showTitle;
            if (i9 != 0) {
                codedOutputByteBufferNano.writeInt32(58, i9);
            }
            if (!this.miniAppIcon.equals("")) {
                codedOutputByteBufferNano.writeString(59, this.miniAppIcon);
            }
            boolean z2 = this.isDarkStyle;
            if (z2) {
                codedOutputByteBufferNano.writeBool(60, z2);
            }
            codedOutputByteBufferNano.writeBool(61, this.showWhenLocked);
            if (!this.instantCardUrl.equals("")) {
                codedOutputByteBufferNano.writeString(62, this.instantCardUrl);
            }
            boolean z3 = this.supportSuperChannel;
            if (z3) {
                codedOutputByteBufferNano.writeBool(63, z3);
            }
            if (!this.identification.equals("")) {
                codedOutputByteBufferNano.writeString(64, this.identification);
            }
            CardMaintainProto cardMaintainProto = this.cardMaintain;
            if (cardMaintainProto != null) {
                codedOutputByteBufferNano.writeMessage(65, cardMaintainProto);
            }
            if (!this.materialPreview.equals("")) {
                codedOutputByteBufferNano.writeString(66, this.materialPreview);
            }
            if (!this.distributeType.equals("")) {
                codedOutputByteBufferNano.writeString(67, this.distributeType);
            }
            if (!this.bizPkgName.equals("")) {
                codedOutputByteBufferNano.writeString(68, this.bizPkgName);
            }
            if (!this.extras.equals("")) {
                codedOutputByteBufferNano.writeString(69, this.extras);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static CardConfigInfoProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CardConfigInfoProto().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public CardConfigInfoProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    case 0:
                        return this;
                    case 8:
                        this.groupId = codedInputByteBufferNano.readInt32();
                        break;
                    case 18:
                        this.groupTitle = codedInputByteBufferNano.readString();
                        break;
                    case 26:
                        this.groupIcon = codedInputByteBufferNano.readString();
                        break;
                    case 32:
                        this.type = codedInputByteBufferNano.readInt32();
                        break;
                    case 42:
                        this.name = codedInputByteBufferNano.readString();
                        break;
                    case 50:
                        this.desc = codedInputByteBufferNano.readString();
                        break;
                    case 58:
                        this.preview = codedInputByteBufferNano.readString();
                        break;
                    case 64:
                        int int32 = codedInputByteBufferNano.readInt32();
                        switch (int32) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                this.size = int32;
                                break;
                        }
                        break;
                    case 72:
                        this.orderInGroup = codedInputByteBufferNano.readInt32();
                        break;
                    case 82:
                        this.packageName = codedInputByteBufferNano.readString();
                        break;
                    case 90:
                        this.componentName = codedInputByteBufferNano.readString();
                        break;
                    case 96:
                        this.category = codedInputByteBufferNano.readInt32();
                        break;
                    case 104:
                        this.resizable = codedInputByteBufferNano.readBool();
                        break;
                    case 112:
                        int int33 = codedInputByteBufferNano.readInt32();
                        if (int33 == 1 || int33 == 2 || int33 == 3 || int33 == 4) {
                            this.operatingIcon = int33;
                        }
                        break;
                    case 122:
                        this.settingUrl = codedInputByteBufferNano.readString();
                        break;
                    case 128:
                        this.displayArea = codedInputByteBufferNano.readInt32();
                        break;
                    case 136:
                        this.minWidth = codedInputByteBufferNano.readInt32();
                        break;
                    case 144:
                        this.minHeight = codedInputByteBufferNano.readInt32();
                        break;
                    case 154:
                        this.loadingIcon = codedInputByteBufferNano.readString();
                        break;
                    case 162:
                        this.loadingBgIcon = codedInputByteBufferNano.readString();
                        break;
                    case 168:
                        this.reservedFlag = codedInputByteBufferNano.readInt32();
                        break;
                    case 176:
                        this.defaultSubscribed = codedInputByteBufferNano.readInt32();
                        break;
                    case 184:
                        this.groupOrder = codedInputByteBufferNano.readInt32();
                        break;
                    case 194:
                        this.previewSw480 = codedInputByteBufferNano.readString();
                        break;
                    case 202:
                        this.serviceId = codedInputByteBufferNano.readString();
                        break;
                    case 408:
                        this.dragonFlyType = codedInputByteBufferNano.readInt32();
                        break;
                    case 416:
                        this.dragonFlySecure = codedInputByteBufferNano.readBool();
                        break;
                    case 426:
                        this.dragonFlyService = codedInputByteBufferNano.readString();
                        break;
                    case UploadStateAware.HTTP_URL_SIGN_INVALID /* 434 */:
                        this.skeletonPicPath = codedInputByteBufferNano.readString();
                        break;
                    case UploadStateAware.HTTP_DESERIALIZE_FAILED /* 442 */:
                        this.skeletonDarkPicPath = codedInputByteBufferNano.readString();
                        break;
                    case 450:
                        this.loadFailPicPath = codedInputByteBufferNano.readString();
                        break;
                    case 458:
                        this.loadFailDp = codedInputByteBufferNano.readString();
                        break;
                    case 464:
                        this.showTitle = codedInputByteBufferNano.readInt32();
                        break;
                    case 474:
                        this.miniAppIcon = codedInputByteBufferNano.readString();
                        break;
                    case 480:
                        this.isDarkStyle = codedInputByteBufferNano.readBool();
                        break;
                    case 488:
                        this.showWhenLocked = codedInputByteBufferNano.readBool();
                        break;
                    case 498:
                        this.instantCardUrl = codedInputByteBufferNano.readString();
                        break;
                    case 504:
                        this.supportSuperChannel = codedInputByteBufferNano.readBool();
                        break;
                    case 514:
                        this.identification = codedInputByteBufferNano.readString();
                        break;
                    case 522:
                        if (this.cardMaintain == null) {
                            this.cardMaintain = new CardMaintainProto();
                        }
                        codedInputByteBufferNano.readMessage(this.cardMaintain);
                        break;
                    case 530:
                        this.materialPreview = codedInputByteBufferNano.readString();
                        break;
                    case 538:
                        this.distributeType = codedInputByteBufferNano.readString();
                        break;
                    case 546:
                        this.bizPkgName = codedInputByteBufferNano.readString();
                        break;
                    case 554:
                        this.extras = codedInputByteBufferNano.readString();
                        break;
                    default:
                        if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                            return this;
                        }
                        break;
                        break;
                }
            }
        }
    }

    public static final class CardMaintainProto extends MessageNano {
        private static volatile CardMaintainProto[] _emptyArray;
        public String description;
        public String style;

        public CardMaintainProto() {
            clear();
        }

        public static CardMaintainProto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new CardMaintainProto[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static CardMaintainProto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CardMaintainProto) MessageNano.mergeFrom(new CardMaintainProto(), bArr);
        }

        public CardMaintainProto clear() {
            this.style = "";
            this.description = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!this.style.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.style);
            }
            return !this.description.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.description) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.style.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.style);
            }
            if (!this.description.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.description);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static CardMaintainProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CardMaintainProto().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public CardMaintainProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    return this;
                }
                if (tag == 10) {
                    this.style = codedInputByteBufferNano.readString();
                } else if (tag == 18) {
                    this.description = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            }
        }
    }

    public CardConfigInfoListProto() {
        clear();
    }

    public static CardConfigInfoListProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new CardConfigInfoListProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CardConfigInfoListProto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CardConfigInfoListProto) MessageNano.mergeFrom(new CardConfigInfoListProto(), bArr);
    }

    public CardConfigInfoListProto clear() {
        this.list = CardConfigInfoProto.emptyArray();
        this.cardConfigResultStatus = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        CardConfigInfoProto[] cardConfigInfoProtoArr = this.list;
        if (cardConfigInfoProtoArr != null && cardConfigInfoProtoArr.length > 0) {
            int i = 0;
            while (true) {
                CardConfigInfoProto[] cardConfigInfoProtoArr2 = this.list;
                if (i >= cardConfigInfoProtoArr2.length) {
                    break;
                }
                CardConfigInfoProto cardConfigInfoProto = cardConfigInfoProtoArr2[i];
                if (cardConfigInfoProto != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, cardConfigInfoProto);
                }
                i++;
            }
        }
        int i2 = this.cardConfigResultStatus;
        return i2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        CardConfigInfoProto[] cardConfigInfoProtoArr = this.list;
        if (cardConfigInfoProtoArr != null && cardConfigInfoProtoArr.length > 0) {
            int i = 0;
            while (true) {
                CardConfigInfoProto[] cardConfigInfoProtoArr2 = this.list;
                if (i >= cardConfigInfoProtoArr2.length) {
                    break;
                }
                CardConfigInfoProto cardConfigInfoProto = cardConfigInfoProtoArr2[i];
                if (cardConfigInfoProto != null) {
                    codedOutputByteBufferNano.writeMessage(1, cardConfigInfoProto);
                }
                i++;
            }
        }
        int i2 = this.cardConfigResultStatus;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static CardConfigInfoListProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new CardConfigInfoListProto().mergeFrom(codedInputByteBufferNano);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public CardConfigInfoListProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                CardConfigInfoProto[] cardConfigInfoProtoArr = this.list;
                int length = cardConfigInfoProtoArr == null ? 0 : cardConfigInfoProtoArr.length;
                int i = repeatedFieldArrayLength + length;
                CardConfigInfoProto[] cardConfigInfoProtoArr2 = new CardConfigInfoProto[i];
                if (length != 0) {
                    System.arraycopy(cardConfigInfoProtoArr, 0, cardConfigInfoProtoArr2, 0, length);
                }
                while (length < i - 1) {
                    CardConfigInfoProto cardConfigInfoProto = new CardConfigInfoProto();
                    cardConfigInfoProtoArr2[length] = cardConfigInfoProto;
                    codedInputByteBufferNano.readMessage(cardConfigInfoProto);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                CardConfigInfoProto cardConfigInfoProto2 = new CardConfigInfoProto();
                cardConfigInfoProtoArr2[length] = cardConfigInfoProto2;
                codedInputByteBufferNano.readMessage(cardConfigInfoProto2);
                this.list = cardConfigInfoProtoArr2;
            } else if (tag == 16) {
                this.cardConfigResultStatus = codedInputByteBufferNano.readInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }
}
