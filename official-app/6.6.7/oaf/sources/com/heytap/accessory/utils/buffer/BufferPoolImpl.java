package com.heytap.accessory.utils.buffer;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.heytap.accessory.utils.SystemUtils;
import java.util.LinkedList;
import java.util.TreeMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class BufferPoolImpl {
    private static final int BUFFER_CACHE_SIZE_DEFUALT = 4194304;
    private static final int CHUNK_LIMIT_DEFAULT = 1;
    private static final int MAX_CHUNK_SIZE = 66560;
    private static final int MAX_NUM_OF_BUFFER_AVAILABILITY_RETRY = 3;
    private static final float MIN_CHUNK_DEMAND_FACTOR = 0.9f;
    private static final int MIN_CHUNK_SIZE = 24;
    private static final int NUM_10 = 10;
    private static final int NUM_1048576 = 1048576;
    private static final int NUM_128 = 128;
    private static final int NUM_15 = 15;
    private static final int NUM_19 = 19;
    private static final int NUM_3 = 3;
    private static final int NUM_4 = 4;
    private static final int NUM_40 = 40;
    private static final int NUM_5 = 5;
    private static final int NUM_60 = 60;
    private static final int NUM_80 = 80;
    private static final String TAG = "BufferPoolImpl";
    private static int sBufferCacheSize;
    private static int sCacheThresholdHigh;
    private static int sCacheThresholdMed;
    private static int sCurrentCacheSize;
    private static boolean sIsInitialised;
    private static int sMaxChunkSize;
    private static final TreeMap<Integer, Object> BUFFER_RANGE_MAP = new TreeMap<>();
    private static final SparseArray<Chunk> CHUNK_SPARSE_ARRAY = new SparseArray<>();
    private static final Object BUFFER_ACCESS_LOCK = new Object();

    public static class Chunk {
        private static int sTotalObtainHits;
        private LinkedList<byte[]> mBufferList;
        private int mLimit;
        private int mObtainHits;
        private int mRecycleHits;
        private final int mSize;

        private float getDemandFactor() {
            int i = this.mRecycleHits;
            float f = i;
            float f2 = this.mObtainHits;
            return f == 0.0f ? f2 : f2 / i;
        }

        private float getObtainRatio() {
            return this.mObtainHits / sTotalObtainHits;
        }

        public static void onObtained(Chunk chunk) {
            chunk.onObtained();
            sTotalObtainHits++;
        }

        public synchronized LinkedList<byte[]> getBufferList() {
            return this.mBufferList;
        }

        public synchronized int getObtainHits() {
            return this.mObtainHits;
        }

        public synchronized LinkedList<byte[]> getOrCreateBufferList() {
            if (this.mBufferList == null) {
                this.mBufferList = new LinkedList<>();
            }
            return this.mBufferList;
        }

        public synchronized int getRecycleHits() {
            return this.mRecycleHits;
        }

        public synchronized int getSize() {
            return this.mSize;
        }

        public float getSizeLimit() {
            float obtainRatio;
            synchronized (BufferPoolImpl.BUFFER_ACCESS_LOCK) {
                obtainRatio = BufferPoolImpl.sBufferCacheSize * getObtainRatio();
            }
            return obtainRatio;
        }

        public synchronized boolean onRecycled() {
            this.mRecycleHits++;
            if (this.mBufferList.size() == this.mLimit) {
                if (getDemandFactor() < BufferPoolImpl.MIN_CHUNK_DEMAND_FACTOR) {
                    return false;
                }
                this.mLimit = ((this.mLimit * 3) / 2) + 1;
            }
            return true;
        }

        private Chunk(int i) {
            this.mSize = i;
            this.mObtainHits = 0;
            this.mRecycleHits = 0;
            this.mBufferList = null;
            this.mLimit = 1;
        }

        public synchronized void onObtained() {
            this.mObtainHits++;
        }
    }

    private BufferPoolImpl() {
    }

    private static void addCustomKeys(int i) {
        int[] iArr = {30731, 32779, 61451, 65541};
        synchronized (BUFFER_ACCESS_LOCK) {
            for (int i2 = 0; i2 < 4; i2++) {
                addKey(iArr[i2]);
            }
        }
    }

    private static boolean addKey(int i) {
        synchronized (BUFFER_ACCESS_LOCK) {
            if (i <= sMaxChunkSize) {
                SparseArray<Chunk> sparseArray = CHUNK_SPARSE_ARRAY;
                if (sparseArray.indexOfKey(i) < 0) {
                    BUFFER_RANGE_MAP.put(Integer.valueOf(i), null);
                    sparseArray.put(i, new Chunk(i));
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x002d A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:20:0x0029, B:25:0x0032, B:27:0x0056, B:28:0x006a, B:30:0x006c, B:32:0x0074, B:34:0x0082, B:36:0x0088, B:38:0x008c, B:39:0x0099, B:42:0x009e, B:43:0x00a1, B:44:0x00b9, B:23:0x002d, B:24:0x0030), top: B:50:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0030 A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:20:0x0029, B:25:0x0032, B:27:0x0056, B:28:0x006a, B:30:0x006c, B:32:0x0074, B:34:0x0082, B:36:0x0088, B:38:0x008c, B:39:0x0099, B:42:0x009e, B:43:0x00a1, B:44:0x00b9, B:23:0x002d, B:24:0x0030), top: B:50:0x0013 }] */
    public static boolean clearCache(int i) {
        int i2;
        if (!isInitialised()) {
            Log.w(TAG, "Failed to clear cache - Bufferpool not initialised!");
            return false;
        }
        synchronized (BUFFER_ACCESS_LOCK) {
            try {
                if (i == 5) {
                    i2 = sCacheThresholdHigh;
                } else if (i == 10) {
                    i2 = sCacheThresholdMed;
                } else {
                    if (i != 15) {
                        if (i == 40) {
                            i2 = sCacheThresholdHigh;
                        } else if (i == 60) {
                            i2 = sCacheThresholdMed;
                        } else if (i != 80) {
                            return false;
                        }
                    }
                    i2 = 0;
                }
                String str = TAG;
                Log.v(str, "ClearCache[" + i + "] : Cache Size BEFORE = " + sCurrentCacheSize);
                if (sCurrentCacheSize <= i2) {
                    Log.w(str, "ClearCache : Current cache size is lesser than the threshold of " + i2);
                    return false;
                }
                int size = CHUNK_SPARSE_ARRAY.size();
                for (int i3 = 0; i3 < size; i3++) {
                    LinkedList<byte[]> bufferList = CHUNK_SPARSE_ARRAY.valueAt(i3).getBufferList();
                    if (bufferList != null) {
                        while (!bufferList.isEmpty() && sCurrentCacheSize > i2) {
                            sCurrentCacheSize -= bufferList.removeLast().length;
                        }
                    }
                    if (sCurrentCacheSize <= i2) {
                        break;
                    }
                }
                Log.d(TAG, "ClearCache : Cache Size AFTER = " + sCurrentCacheSize);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String dump() {
        String str;
        LinkedList<byte[]> bufferList;
        if (!isInitialised()) {
            Log.w(TAG, "Failed to dump - Bufferpool not initialised!");
            return " - Bufferpool not initialised! ";
        }
        String str2 = "";
        synchronized (BUFFER_ACCESS_LOCK) {
            int size = CHUNK_SPARSE_ARRAY.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    Chunk chunkValueAt = CHUNK_SPARSE_ARRAY.valueAt(i);
                    if (chunkValueAt != null && (bufferList = chunkValueAt.getBufferList()) != null) {
                        String str3 = "Buffer '" + chunkValueAt.getSize() + "' x " + bufferList.size() + " = \"" + (bufferList.size() * chunkValueAt.getSize()) + "\" bytes [ Obtained " + chunkValueAt.getObtainHits() + " & Recycled " + chunkValueAt.getRecycleHits() + " times ]";
                        Log.v(TAG, str3);
                        str2 = str2 + "\n " + str3;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            String str4 = TAG;
            sb.append(str4);
            sb.append(" ===> \"");
            sb.append(sCurrentCacheSize);
            sb.append("\" bytes");
            String string = sb.toString();
            Log.i(str4, string);
            str = str2 + "\n " + string;
        }
        return str;
    }

    private static int getCeilingSize(int i) {
        Integer numCeilingKey = BUFFER_RANGE_MAP.ceilingKey(Integer.valueOf(i));
        return numCeilingKey == null ? i : numCeilingKey.intValue();
    }

    public static Chunk getChunk(int i) {
        Chunk chunk;
        synchronized (BUFFER_ACCESS_LOCK) {
            chunk = CHUNK_SPARSE_ARRAY.get(i);
        }
        return chunk;
    }

    public static int getCurrentCacheSize() {
        int i;
        if (!isInitialised()) {
            throw new RuntimeException("Bufferpool not initialised!");
        }
        synchronized (BUFFER_ACCESS_LOCK) {
            i = sCurrentCacheSize;
        }
        return i;
    }

    private static int getFloorSize(int i) {
        Integer numFloorKey = BUFFER_RANGE_MAP.floorKey(Integer.valueOf(i));
        return numFloorKey == null ? i : numFloorKey.intValue();
    }

    private static int getNextBigSize(int i) {
        Integer numHigherKey = BUFFER_RANGE_MAP.higherKey(Integer.valueOf(i));
        if (numHigherKey == null) {
            return Integer.MAX_VALUE;
        }
        return numHigherKey.intValue();
    }

    private static int getNextSmallSize(int i) {
        Integer numLowerKey = BUFFER_RANGE_MAP.lowerKey(Integer.valueOf(i));
        if (numLowerKey == null) {
            return Integer.MIN_VALUE;
        }
        return numLowerKey.intValue();
    }

    public static void initialise(Context context) {
        initialise(BufferPoolConfig.createDefault(context));
    }

    public static boolean isInitialised() {
        boolean z;
        synchronized (BUFFER_ACCESS_LOCK) {
            z = sIsInitialised;
        }
        return z;
    }

    public static boolean isLowMemoryDevice(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            return activityManager.isLowRamDevice();
        }
        Log.w(TAG, "isLowMemoryDevice(): ActivityManager is null!");
        return true;
    }

    public static Buffer obtain(int i) {
        if (isInitialised()) {
            return obtain(i, false);
        }
        throw new RuntimeException("Bufferpool not initialised!");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    private static Buffer obtainChunk(int i, int i2, boolean z) {
        byte[] bArrRemoveLast;
        synchronized (BUFFER_ACCESS_LOCK) {
            Chunk chunk = getChunk(i);
            Buffer buffer = null;
            if (chunk == null) {
                return null;
            }
            LinkedList<byte[]> bufferList = chunk.getBufferList();
            if (bufferList == null || bufferList.isEmpty()) {
                return null;
            }
            if (!z) {
                bArrRemoveLast = bufferList.removeLast();
            } else if (i == i2) {
                if (bufferList.getLast().length == i2) {
                    bArrRemoveLast = bufferList.removeLast();
                } else {
                    bArrRemoveLast = null;
                }
            } else if (bufferList.getFirst().length == i2) {
                bArrRemoveLast = bufferList.removeFirst();
            } else {
                bArrRemoveLast = null;
            }
            if (bArrRemoveLast != null) {
                sCurrentCacheSize -= bArrRemoveLast.length;
                Chunk.onObtained(chunk);
                buffer = new Buffer(bArrRemoveLast, i2);
            }
            return buffer;
        }
    }

    public static Buffer obtainExact(int i) {
        if (isInitialised()) {
            return obtain(i, true);
        }
        throw new RuntimeException("Bufferpool not initialised!");
    }

    public static boolean recycle(byte[] bArr) {
        if (!isInitialised()) {
            Log.w(TAG, "Failed to recycle buffer - Bufferpool not initialised!");
            return false;
        }
        if (bArr == null) {
            Log.w(TAG, "Cannot recycle null buffer!");
            return false;
        }
        int length = bArr.length;
        Object obj = BUFFER_ACCESS_LOCK;
        synchronized (obj) {
            if (length > sMaxChunkSize) {
                Log.w(TAG, "Cannot recycle buffer '" + length + "', Non-matcing size!");
                return false;
            }
            int floorSize = getFloorSize(length);
            synchronized (obj) {
                Chunk chunk = getChunk(floorSize);
                if (chunk == null) {
                    return false;
                }
                LinkedList<byte[]> orCreateBufferList = chunk.getOrCreateBufferList();
                if (!chunk.onRecycled()) {
                    return false;
                }
                if (sCurrentCacheSize + length > sBufferCacheSize) {
                    int sizeLimit = ((int) chunk.getSizeLimit()) / floorSize;
                    if (orCreateBufferList.size() >= sizeLimit) {
                        Log.w(TAG, "Cannot recycle buffer '" + floorSize + "', Buffer chunk count(" + orCreateBufferList.size() + ") exceeded the limit" + sizeLimit + "!");
                        return false;
                    }
                    stabilizePool();
                    if (sCurrentCacheSize + length > sBufferCacheSize) {
                        Log.w(TAG, "Cannot recycle buffer '" + floorSize + "', Buffer cache limit exceeded!!!");
                        return false;
                    }
                }
                if (floorSize == length) {
                    orCreateBufferList.addLast(bArr);
                } else {
                    orCreateBufferList.addFirst(bArr);
                }
                sCurrentCacheSize += length;
                return true;
            }
        }
    }

    private static int stabilizePool() {
        int i;
        synchronized (BUFFER_ACCESS_LOCK) {
            int i2 = sCurrentCacheSize;
            int size = CHUNK_SPARSE_ARRAY.size();
            for (int i3 = 0; i3 < size; i3++) {
                Chunk chunkValueAt = CHUNK_SPARSE_ARRAY.valueAt(i3);
                if (chunkValueAt != null) {
                    int sizeLimit = (int) (chunkValueAt.getSizeLimit() / chunkValueAt.getSize());
                    LinkedList<byte[]> bufferList = chunkValueAt.getBufferList();
                    int size2 = bufferList == null ? 0 : bufferList.size();
                    while (size2 > sizeLimit) {
                        if (bufferList != null) {
                            sCurrentCacheSize -= bufferList.removeLast().length;
                            size2--;
                        }
                    }
                }
            }
            Log.w(TAG, "Pool Stabilized; Cache size reduced from  " + i2 + " -> " + sCurrentCacheSize);
            i = i2 - sCurrentCacheSize;
        }
        return i;
    }

    public static boolean testClearCache(int i) {
        return clearCache(i);
    }

    public static Buffer wrapPayload(byte[] bArr, int i) {
        if (!isInitialised()) {
            throw new RuntimeException("Bufferpool not initialised!");
        }
        Buffer bufferObtain = obtain(bArr.length + i);
        bufferObtain.setOffset(i);
        bufferObtain.setPayloadLength(bArr.length);
        SystemUtils.arraycopy(bArr, 0, bufferObtain.getBuffer(), i, bArr.length);
        return bufferObtain;
    }

    public static Buffer wrapPayloadInPlace(byte[] bArr, int i, int i2, int i3, int i4) {
        int length;
        int length2;
        if (!isInitialised()) {
            throw new RuntimeException("Bufferpool not initialised!");
        }
        if (i < i3) {
            int i5 = i + i2;
            int i6 = i3 - i;
            if (bArr.length >= i5 + i6) {
                Log.v(TAG, "shifting data '" + i6 + "' positions to wrap in place...");
                while (i5 >= i) {
                    bArr[i5 + i6] = bArr[i5];
                    i5--;
                }
                i = i3;
            }
        } else {
            int i7 = i + i2 + i4;
            if (bArr.length < i7 && (length2 = i - (length = i7 - bArr.length)) >= 0 && length2 >= i3) {
                for (int i8 = length2; i8 < length2 + i2; i8++) {
                    bArr[i8] = bArr[i8 + length];
                }
                i = length2;
            }
        }
        Buffer buffer = new Buffer(bArr, i3 + i2 + i4);
        buffer.setOffset(i);
        buffer.setPayloadLength(i2);
        return buffer;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053 A[Catch: all -> 0x00bf, TryCatch #0 {, blocks: (B:9:0x0015, B:11:0x0020, B:13:0x0028, B:15:0x0031, B:24:0x0044, B:26:0x0053, B:29:0x005a, B:30:0x005d, B:31:0x0062, B:33:0x006b, B:35:0x0072, B:36:0x0095, B:34:0x006f, B:14:0x002d, B:16:0x0034, B:18:0x0038, B:20:0x003c, B:38:0x0097, B:39:0x00be), top: B:45:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x00bf, TryCatch #0 {, blocks: (B:9:0x0015, B:11:0x0020, B:13:0x0028, B:15:0x0031, B:24:0x0044, B:26:0x0053, B:29:0x005a, B:30:0x005d, B:31:0x0062, B:33:0x006b, B:35:0x0072, B:36:0x0095, B:34:0x006f, B:14:0x002d, B:16:0x0034, B:18:0x0038, B:20:0x003c, B:38:0x0097, B:39:0x00be), top: B:45:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: all -> 0x00bf, TryCatch #0 {, blocks: (B:9:0x0015, B:11:0x0020, B:13:0x0028, B:15:0x0031, B:24:0x0044, B:26:0x0053, B:29:0x005a, B:30:0x005d, B:31:0x0062, B:33:0x006b, B:35:0x0072, B:36:0x0095, B:34:0x006f, B:14:0x002d, B:16:0x0034, B:18:0x0038, B:20:0x003c, B:38:0x0097, B:39:0x00be), top: B:45:0x0015 }] */
    public static void initialise(BufferPoolConfig bufferPoolConfig) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (isInitialised()) {
            Log.w(TAG, "BufferPool already initialised!");
            return;
        }
        if (bufferPoolConfig == null) {
            throw new RuntimeException("Failed to initialise the Bufferpool!");
        }
        synchronized (BUFFER_ACCESS_LOCK) {
            sCurrentCacheSize = 0;
            if (bufferPoolConfig.mIsDefault) {
                if (isLowMemoryDevice(bufferPoolConfig.mContext)) {
                    sBufferCacheSize = 2097152;
                } else {
                    sBufferCacheSize = BUFFER_CACHE_SIZE_DEFUALT;
                }
                sMaxChunkSize = MAX_CHUNK_SIZE;
            } else {
                i = bufferPoolConfig.mMaxChunkSize;
                if (i < 24 || (i2 = bufferPoolConfig.mCacheSize) < i) {
                    throw new RuntimeException("Failed to initialise the Bufferpool! [Cache size=" + bufferPoolConfig.mCacheSize + "; Max chunk size=" + bufferPoolConfig.mMaxChunkSize + "]");
                }
                sBufferCacheSize = i2;
                sMaxChunkSize = i;
                if (i <= MAX_CHUNK_SIZE) {
                }
                int i6 = sBufferCacheSize;
                sCacheThresholdHigh = i6 / 4;
                sCacheThresholdMed = i6 / 2;
                i3 = 36;
                i4 = 24;
                while (i4 <= i) {
                    addKey(i4);
                    if (i4 == 24 && i3 <= i) {
                        addKey(i3);
                    }
                    i4 *= 2;
                    i3 *= 2;
                }
                addCustomKeys(sMaxChunkSize);
                i5 = sMaxChunkSize;
                if (i5 > MAX_CHUNK_SIZE) {
                    addKey(i5);
                } else {
                    addKey(i);
                }
                sIsInitialised = true;
                Log.i(TAG, "BufferPool[v1.0.2] initialised with capacity " + (sBufferCacheSize / NUM_1048576) + "MB");
            }
            i = MAX_CHUNK_SIZE;
            int i7 = sBufferCacheSize;
            sCacheThresholdHigh = i7 / 4;
            sCacheThresholdMed = i7 / 2;
            i3 = 36;
            i4 = 24;
            while (i4 <= i) {
                addKey(i4);
                if (i4 == 24) {
                }
                i4 *= 2;
                i3 *= 2;
            }
            addCustomKeys(sMaxChunkSize);
            i5 = sMaxChunkSize;
            if (i5 > MAX_CHUNK_SIZE) {
                addKey(i5);
            } else {
                addKey(i);
            }
            sIsInitialised = true;
            Log.i(TAG, "BufferPool[v1.0.2] initialised with capacity " + (sBufferCacheSize / NUM_1048576) + "MB");
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[PHI: r2
  0x0084: PHI (r2v1 com.heytap.accessory.utils.buffer.Buffer) = (r2v0 com.heytap.accessory.utils.buffer.Buffer), (r2v2 com.heytap.accessory.utils.buffer.Buffer) binds: [B:11:0x0036, B:30:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    private static Buffer obtain(int i, boolean z) {
        Buffer buffer;
        synchronized (BUFFER_ACCESS_LOCK) {
            if (i > sMaxChunkSize) {
                Log.w(TAG, "Buffer '" + i + "' is not matching with the pool sizes! creating new...");
                buffer = new Buffer(new byte[i], i);
            } else {
                int ceilingSize = z ? i : getCeilingSize(i);
                Buffer bufferObtainChunk = obtainChunk(ceilingSize, i, z);
                if (bufferObtainChunk == null) {
                    int nextBigSize = ceilingSize;
                    for (int i2 = 1; bufferObtainChunk == null && i2 <= 3; i2++) {
                        if (z && i != getCeilingSize(i)) {
                            nextBigSize = getNextSmallSize(nextBigSize);
                        } else {
                            nextBigSize = getNextBigSize(nextBigSize);
                        }
                        if (nextBigSize < 24 || nextBigSize > MAX_CHUNK_SIZE || nextBigSize > sMaxChunkSize) {
                            break;
                            break;
                            break;
                        }
                        bufferObtainChunk = obtainChunk(nextBigSize, i, z);
                    }
                    if (bufferObtainChunk == null) {
                        buffer = new Buffer(new byte[ceilingSize], i);
                        Chunk chunk = getChunk(ceilingSize);
                        if (chunk != null) {
                            Chunk.onObtained(chunk);
                        } else {
                            addKey(ceilingSize);
                            Chunk.onObtained(getChunk(ceilingSize));
                        }
                    } else {
                        buffer = bufferObtainChunk;
                    }
                } else {
                    buffer = bufferObtainChunk;
                }
            }
        }
        return buffer;
    }

    public static Buffer wrapPayload(int i, int i2, byte[] bArr, int i3) {
        if (isInitialised()) {
            Buffer bufferObtain = obtain(i2 + i3);
            bufferObtain.setOffset(i3);
            bufferObtain.setPayloadLength(i2);
            SystemUtils.arraycopy(bArr, i, bufferObtain.getBuffer(), i3, i2);
            return bufferObtain;
        }
        throw new RuntimeException("Bufferpool not initialised!");
    }

    public static Buffer wrapPayload(byte[] bArr, int i, int i2) {
        if (isInitialised()) {
            Buffer bufferObtain = obtain(bArr.length + i + i2);
            bufferObtain.setOffset(i);
            bufferObtain.setPayloadLength(bArr.length);
            SystemUtils.arraycopy(bArr, 0, bufferObtain.getBuffer(), i, bArr.length);
            return bufferObtain;
        }
        throw new RuntimeException("Bufferpool not initialised!");
    }

    public static Buffer wrapPayload(byte[] bArr, int i, int i2, int i3, int i4) {
        if (isInitialised()) {
            Buffer bufferObtain = obtain(i2 + i3 + i4);
            bufferObtain.setOffset(i3);
            bufferObtain.setPayloadLength(i2);
            SystemUtils.arraycopy(bArr, i, bufferObtain.getBuffer(), i3, i2);
            return bufferObtain;
        }
        throw new RuntimeException("Bufferpool not initialised!");
    }

    public static Buffer wrapPayload(Buffer buffer, int i) {
        if (isInitialised()) {
            Buffer bufferObtain = obtain(buffer.getLength() + i);
            bufferObtain.setOffset(i);
            bufferObtain.setPayloadLength(buffer.getLength());
            SystemUtils.arraycopy(buffer.getBuffer(), 0, bufferObtain.getBuffer(), i, buffer.getLength());
            buffer.recycle();
            return bufferObtain;
        }
        throw new RuntimeException("Bufferpool not initialised!");
    }

    public static Buffer wrapPayload(Buffer buffer, int i, int i2) {
        if (isInitialised()) {
            Buffer bufferObtain = obtain(buffer.getLength() + i + i2);
            bufferObtain.setOffset(i);
            bufferObtain.setPayloadLength(buffer.getLength());
            SystemUtils.arraycopy(buffer.getBuffer(), 0, bufferObtain.getBuffer(), i, buffer.getLength());
            buffer.recycle();
            return bufferObtain;
        }
        throw new RuntimeException("Bufferpool not initialised!");
    }
}
