package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final class State {
    static final State INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token, int i, int i2, int i3) {
        this.token = token;
        this.mode = i;
        this.binaryShiftByteCount = i2;
        this.bitCount = i3;
    }

    private static int calculateBinaryShiftCost(State state) {
        int i = state.binaryShiftByteCount;
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }

    public State addBinaryShiftChar(int i) {
        int i2;
        Token tokenAdd = this.token;
        int i3 = this.mode;
        int i4 = this.bitCount;
        if (i3 == 4 || i3 == 2) {
            int i5 = HighLevelEncoder.LATCH_TABLE[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            tokenAdd = tokenAdd.add(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.binaryShiftByteCount;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        State state = new State(tokenAdd, i3, i8 + 1, i4 + i2);
        return state.binaryShiftByteCount == 2078 ? state.endBinaryShift(i + 1) : state;
    }

    public State endBinaryShift(int i) {
        int i2 = this.binaryShiftByteCount;
        return i2 == 0 ? this : new State(this.token.addBinaryShift(i - i2, i2), this.mode, 0, this.bitCount);
    }

    public int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public int getMode() {
        return this.mode;
    }

    public Token getToken() {
        return this.token;
    }

    public boolean isBetterThanOrEqualTo(State state) {
        int iCalculateBinaryShiftCost = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i = this.binaryShiftByteCount;
        int i2 = state.binaryShiftByteCount;
        if (i < i2) {
            iCalculateBinaryShiftCost += calculateBinaryShiftCost(state) - calculateBinaryShiftCost(this);
        } else if (i > i2 && i2 > 0) {
            iCalculateBinaryShiftCost += 10;
        }
        return iCalculateBinaryShiftCost <= state.bitCount;
    }

    public State latchAndAppend(int i, int i2) {
        int i3 = this.bitCount;
        Token tokenAdd = this.token;
        int i4 = this.mode;
        if (i != i4) {
            int i5 = HighLevelEncoder.LATCH_TABLE[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            tokenAdd = tokenAdd.add(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new State(tokenAdd.add(i2, i8), i, 0, i3 + i8);
    }

    public State shiftAndAppend(int i, int i2) {
        Token token = this.token;
        int i3 = this.mode;
        int i4 = i3 == 2 ? 4 : 5;
        return new State(token.add(HighLevelEncoder.SHIFT_TABLE[i3][i], i4).add(i2, 5), this.mode, 0, this.bitCount + i4 + 5);
    }

    public BitArray toBitArray(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (Token previous = endBinaryShift(bArr.length).token; previous != null; previous = previous.getPrevious()) {
            linkedList.addFirst(previous);
        }
        BitArray bitArray = new BitArray();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((Token) it.next()).appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount));
    }
}
