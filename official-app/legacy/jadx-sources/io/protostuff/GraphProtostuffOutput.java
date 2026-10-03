package io.protostuff;

import io.protostuff.runtime.RuntimeSchema;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class GraphProtostuffOutput extends FilterOutput<ProtostuffOutput> {
    private int refCount;
    private final IdentityMap references;

    public GraphProtostuffOutput(ProtostuffOutput protostuffOutput) {
        super(protostuffOutput);
        this.refCount = 0;
        this.references = new IdentityMap();
    }

    @Override // io.protostuff.FilterOutput, io.protostuff.Output
    public <T> void writeObject(int i, T t, Schema<T> schema, boolean z) throws IOException {
        ProtostuffOutput protostuffOutput = (ProtostuffOutput) this.output;
        if (this.references.shouldIncrement(this.refCount, t, protostuffOutput, i)) {
            this.refCount++;
            protostuffOutput.tail = protostuffOutput.sink.writeVarInt32(WireFormat.makeTag(i, 3), protostuffOutput, protostuffOutput.tail);
            schema.writeTo(this, t);
            protostuffOutput.tail = protostuffOutput.sink.writeVarInt32(WireFormat.makeTag(i, 4), protostuffOutput, protostuffOutput.tail);
        }
    }

    public static final class IdentityMap {
        private static final int DEFAULT_CAPACITY = 32;
        private static final int MAXIMUM_CAPACITY = 536870912;
        private static final int MINIMUM_CAPACITY = 4;
        private int size;
        private transient Object[] table;
        private transient int threshold;

        public IdentityMap() {
            init(32);
        }

        private int capacity(int i) {
            int i2 = (i * 3) / 2;
            int i3 = 536870912;
            if (i2 <= 536870912 && i2 >= 0) {
                i3 = 4;
                while (i3 < i2) {
                    i3 <<= 1;
                }
            }
            return i3;
        }

        private static int hash(Object obj, int i) {
            int iIdentityHashCode = System.identityHashCode(obj);
            return ((iIdentityHashCode << 1) - (iIdentityHashCode << 8)) & (i - 1);
        }

        private void init(int i) {
            int i2 = i * 2;
            this.threshold = i2 / 3;
            this.table = new Object[i2];
        }

        private static int nextKeyIndex(int i, int i2) {
            int i3 = i + 2;
            if (i3 < i2) {
                return i3;
            }
            return 0;
        }

        private void resize(int i) {
            int i2 = i * 2;
            Object[] objArr = this.table;
            int length = objArr.length;
            if (length == 1073741824) {
                if (this.threshold == 536870911) {
                    throw new IllegalStateException("Capacity exhausted.");
                }
                this.threshold = RuntimeSchema.MAX_TAG_VALUE;
                return;
            }
            if (length >= i2) {
                return;
            }
            Object[] objArr2 = new Object[i2];
            this.threshold = i2 / 3;
            for (int i3 = 0; i3 < length; i3 += 2) {
                Object obj = objArr[i3];
                if (obj != null) {
                    int i4 = i3 + 1;
                    Object obj2 = objArr[i4];
                    objArr[i3] = null;
                    objArr[i4] = null;
                    int iHash = hash(obj, i2);
                    while (objArr2[iHash] != null) {
                        iHash = nextKeyIndex(iHash, i2);
                    }
                    objArr2[iHash] = obj;
                    objArr2[iHash + 1] = obj2;
                }
            }
            this.table = objArr2;
        }

        public boolean shouldIncrement(int i, Object obj, WriteSession writeSession, int i2) throws IOException {
            Object[] objArr = this.table;
            int length = objArr.length;
            int iHash = hash(obj, length);
            while (true) {
                Object obj2 = objArr[iHash];
                if (obj2 == null) {
                    objArr[iHash] = obj;
                    objArr[iHash + 1] = Integer.valueOf(i);
                    int i3 = this.size + 1;
                    this.size = i3;
                    if (i3 >= this.threshold) {
                        resize(length);
                    }
                    return true;
                }
                if (obj2 == obj) {
                    if ((obj instanceof Map.Entry) && obj.getClass().getName().startsWith("java.util")) {
                        return true;
                    }
                    writeSession.tail = writeSession.sink.writeVarInt32(((Integer) objArr[iHash + 1]).intValue(), writeSession, writeSession.sink.writeVarInt32(WireFormat.makeTag(i2, 6), writeSession, writeSession.tail));
                    return false;
                }
                iHash = nextKeyIndex(iHash, length);
            }
        }

        public IdentityMap(int i) {
            if (i >= 0) {
                init(capacity(i));
                return;
            }
            throw new IllegalArgumentException("expectedMaxSize is negative: " + i);
        }
    }

    public GraphProtostuffOutput(ProtostuffOutput protostuffOutput, int i) {
        super(protostuffOutput);
        this.refCount = 0;
        this.references = new IdentityMap(i);
    }
}
