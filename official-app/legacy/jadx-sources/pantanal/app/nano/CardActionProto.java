package pantanal.app.nano;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class CardActionProto extends MessageNano {
    public static final int CLICK = 1;
    public static final int EXPOSED_STATE = 3;
    public static final int INVALIDATE = 4;
    public static final int LIFE_CIRCLE = 2;
    private static volatile CardActionProto[] _emptyArray;
    public int action;
    public int cardId;
    public int cardType;
    public int hostId;
    public ParamEntry[] param;

    public static final class ParamEntry extends MessageNano {
        private static volatile ParamEntry[] _emptyArray;
        public String key;
        public String value;

        public ParamEntry() {
            clear();
        }

        public static ParamEntry[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (_emptyArray == null) {
                        _emptyArray = new ParamEntry[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static ParamEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ParamEntry) MessageNano.mergeFrom(new ParamEntry(), bArr);
        }

        public ParamEntry clear() {
            this.key = "";
            this.value = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!this.key.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.key);
            }
            return !this.value.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.value) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.key.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.key);
            }
            if (!this.value.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.value);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static ParamEntry parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new ParamEntry().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public ParamEntry mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    return this;
                }
                if (tag == 10) {
                    this.key = codedInputByteBufferNano.readString();
                } else if (tag == 18) {
                    this.value = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            }
        }
    }

    public CardActionProto() {
        clear();
    }

    public static CardActionProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new CardActionProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CardActionProto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CardActionProto) MessageNano.mergeFrom(new CardActionProto(), bArr);
    }

    public CardActionProto clear() {
        this.cardType = 0;
        this.cardId = 0;
        this.hostId = 0;
        this.action = 0;
        this.param = ParamEntry.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.cardType) + CodedOutputByteBufferNano.computeInt32Size(2, this.cardId) + CodedOutputByteBufferNano.computeInt32Size(3, this.hostId) + CodedOutputByteBufferNano.computeInt32Size(4, this.action);
        ParamEntry[] paramEntryArr = this.param;
        if (paramEntryArr != null && paramEntryArr.length > 0) {
            int i = 0;
            while (true) {
                ParamEntry[] paramEntryArr2 = this.param;
                if (i >= paramEntryArr2.length) {
                    break;
                }
                ParamEntry paramEntry = paramEntryArr2[i];
                if (paramEntry != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, paramEntry);
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.cardType);
        codedOutputByteBufferNano.writeInt32(2, this.cardId);
        codedOutputByteBufferNano.writeInt32(3, this.hostId);
        codedOutputByteBufferNano.writeInt32(4, this.action);
        ParamEntry[] paramEntryArr = this.param;
        if (paramEntryArr != null && paramEntryArr.length > 0) {
            int i = 0;
            while (true) {
                ParamEntry[] paramEntryArr2 = this.param;
                if (i >= paramEntryArr2.length) {
                    break;
                }
                ParamEntry paramEntry = paramEntryArr2[i];
                if (paramEntry != null) {
                    codedOutputByteBufferNano.writeMessage(5, paramEntry);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static CardActionProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new CardActionProto().mergeFrom(codedInputByteBufferNano);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public CardActionProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.cardType = codedInputByteBufferNano.readInt32();
            } else if (tag == 16) {
                this.cardId = codedInputByteBufferNano.readInt32();
            } else if (tag == 24) {
                this.hostId = codedInputByteBufferNano.readInt32();
            } else if (tag == 32) {
                this.action = codedInputByteBufferNano.readInt32();
            } else if (tag == 42) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                ParamEntry[] paramEntryArr = this.param;
                int length = paramEntryArr == null ? 0 : paramEntryArr.length;
                int i = repeatedFieldArrayLength + length;
                ParamEntry[] paramEntryArr2 = new ParamEntry[i];
                if (length != 0) {
                    System.arraycopy(paramEntryArr, 0, paramEntryArr2, 0, length);
                }
                while (length < i - 1) {
                    ParamEntry paramEntry = new ParamEntry();
                    paramEntryArr2[length] = paramEntry;
                    codedInputByteBufferNano.readMessage(paramEntry);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                ParamEntry paramEntry2 = new ParamEntry();
                paramEntryArr2[length] = paramEntry2;
                codedInputByteBufferNano.readMessage(paramEntry2);
                this.param = paramEntryArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }
}
