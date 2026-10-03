package pantanal.app.nano;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class UIDataProto extends MessageNano {
    private static volatile UIDataProto[] _emptyArray;
    public int cardId;
    public byte[] data;
    public String extraMsg;
    public boolean forceChangeCardUI;
    public IdMapsEntry[] idMaps;
    public String layoutName;
    public String name;
    public int themeId;
    public byte[] value;
    public long version;

    public static final class IdMapsEntry extends MessageNano {
        private static volatile IdMapsEntry[] _emptyArray;
        public String key;
        public int value;

        public IdMapsEntry() {
            clear();
        }

        public static IdMapsEntry[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new IdMapsEntry[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static IdMapsEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (IdMapsEntry) MessageNano.mergeFrom(new IdMapsEntry(), bArr);
        }

        public IdMapsEntry clear() {
            this.key = "";
            this.value = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!this.key.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.key);
            }
            int i = this.value;
            return i != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.key.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.key);
            }
            int i = this.value;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static IdMapsEntry parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new IdMapsEntry().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public IdMapsEntry mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    return this;
                }
                if (tag == 10) {
                    this.key = codedInputByteBufferNano.readString();
                } else if (tag == 16) {
                    this.value = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            }
        }
    }

    public UIDataProto() {
        clear();
    }

    public static UIDataProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new UIDataProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static UIDataProto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (UIDataProto) MessageNano.mergeFrom(new UIDataProto(), bArr);
    }

    public UIDataProto clear() {
        this.cardId = 0;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.data = bArr;
        this.idMaps = IdMapsEntry.emptyArray();
        this.name = "";
        this.version = 0L;
        this.themeId = 0;
        this.value = bArr;
        this.forceChangeCardUI = false;
        this.layoutName = "";
        this.extraMsg = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.cardId) + CodedOutputByteBufferNano.computeBytesSize(2, this.data);
        IdMapsEntry[] idMapsEntryArr = this.idMaps;
        if (idMapsEntryArr != null && idMapsEntryArr.length > 0) {
            int i = 0;
            while (true) {
                IdMapsEntry[] idMapsEntryArr2 = this.idMaps;
                if (i >= idMapsEntryArr2.length) {
                    break;
                }
                IdMapsEntry idMapsEntry = idMapsEntryArr2[i];
                if (idMapsEntry != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, idMapsEntry);
                }
                i++;
            }
        }
        if (!this.name.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.name);
        }
        long j2 = this.version;
        if (j2 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(5, j2);
        }
        int i2 = this.themeId;
        if (i2 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i2);
        }
        if (!Arrays.equals(this.value, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.value);
        }
        boolean z = this.forceChangeCardUI;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        if (!this.layoutName.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.layoutName);
        }
        return !this.extraMsg.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(11, this.extraMsg) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.cardId);
        codedOutputByteBufferNano.writeBytes(2, this.data);
        IdMapsEntry[] idMapsEntryArr = this.idMaps;
        if (idMapsEntryArr != null && idMapsEntryArr.length > 0) {
            int i = 0;
            while (true) {
                IdMapsEntry[] idMapsEntryArr2 = this.idMaps;
                if (i >= idMapsEntryArr2.length) {
                    break;
                }
                IdMapsEntry idMapsEntry = idMapsEntryArr2[i];
                if (idMapsEntry != null) {
                    codedOutputByteBufferNano.writeMessage(3, idMapsEntry);
                }
                i++;
            }
        }
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.name);
        }
        long j2 = this.version;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(5, j2);
        }
        int i2 = this.themeId;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i2);
        }
        if (!Arrays.equals(this.value, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(7, this.value);
        }
        boolean z = this.forceChangeCardUI;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        if (!this.layoutName.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.layoutName);
        }
        if (!this.extraMsg.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.extraMsg);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static UIDataProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new UIDataProto().mergeFrom(codedInputByteBufferNano);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public UIDataProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.cardId = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.data = codedInputByteBufferNano.readBytes();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    IdMapsEntry[] idMapsEntryArr = this.idMaps;
                    int length = idMapsEntryArr == null ? 0 : idMapsEntryArr.length;
                    int i = repeatedFieldArrayLength + length;
                    IdMapsEntry[] idMapsEntryArr2 = new IdMapsEntry[i];
                    if (length != 0) {
                        System.arraycopy(idMapsEntryArr, 0, idMapsEntryArr2, 0, length);
                    }
                    while (length < i - 1) {
                        IdMapsEntry idMapsEntry = new IdMapsEntry();
                        idMapsEntryArr2[length] = idMapsEntry;
                        codedInputByteBufferNano.readMessage(idMapsEntry);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    IdMapsEntry idMapsEntry2 = new IdMapsEntry();
                    idMapsEntryArr2[length] = idMapsEntry2;
                    codedInputByteBufferNano.readMessage(idMapsEntry2);
                    this.idMaps = idMapsEntryArr2;
                    break;
                case 34:
                    this.name = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.version = codedInputByteBufferNano.readInt64();
                    break;
                case 48:
                    this.themeId = codedInputByteBufferNano.readInt32();
                    break;
                case 58:
                    this.value = codedInputByteBufferNano.readBytes();
                    break;
                case 64:
                    this.forceChangeCardUI = codedInputByteBufferNano.readBool();
                    break;
                case 82:
                    this.layoutName = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.extraMsg = codedInputByteBufferNano.readString();
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
