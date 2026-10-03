package com.oplus.seedling.datachannelserver.proto.nano;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class SuperChannelDataProto extends MessageNano {
    private static volatile SuperChannelDataProto[] _emptyArray;
    public int cardId;
    public int compress;
    public byte[] data;
    public boolean forceUpdate;

    public SuperChannelDataProto() {
        clear();
    }

    public static SuperChannelDataProto[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new SuperChannelDataProto[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SuperChannelDataProto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SuperChannelDataProto) MessageNano.mergeFrom(new SuperChannelDataProto(), bArr);
    }

    public SuperChannelDataProto clear() {
        this.cardId = 0;
        this.data = WireFormatNano.EMPTY_BYTES;
        this.compress = 0;
        this.forceUpdate = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.cardId) + CodedOutputByteBufferNano.computeBytesSize(2, this.data);
        int i = this.compress;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        return iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(8, this.forceUpdate);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.cardId);
        codedOutputByteBufferNano.writeBytes(2, this.data);
        int i = this.compress;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        codedOutputByteBufferNano.writeBool(8, this.forceUpdate);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static SuperChannelDataProto parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new SuperChannelDataProto().mergeFrom(codedInputByteBufferNano);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public SuperChannelDataProto mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.cardId = codedInputByteBufferNano.readInt32();
            } else if (tag == 18) {
                this.data = codedInputByteBufferNano.readBytes();
            } else if (tag == 24) {
                this.compress = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                this.forceUpdate = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                return this;
            }
        }
    }
}
