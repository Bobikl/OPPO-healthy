package io.netty.util.internal.shaded.org.jctools.queues;

/* JADX INFO: loaded from: classes10.dex */
public final class IndexedQueueSizeUtil {

    public interface IndexedQueue {
        int capacity();

        long lvConsumerIndex();

        long lvProducerIndex();
    }

    public static boolean isEmpty(IndexedQueue indexedQueue) {
        return indexedQueue.lvConsumerIndex() >= indexedQueue.lvProducerIndex();
    }

    public static int size(IndexedQueue indexedQueue) {
        long jLvProducerIndex;
        long jLvConsumerIndex;
        long jLvConsumerIndex2 = indexedQueue.lvConsumerIndex();
        while (true) {
            jLvProducerIndex = indexedQueue.lvProducerIndex();
            jLvConsumerIndex = indexedQueue.lvConsumerIndex();
            if (jLvConsumerIndex2 == jLvConsumerIndex) {
                break;
            }
            jLvConsumerIndex2 = jLvConsumerIndex;
        }
        long j2 = jLvProducerIndex - jLvConsumerIndex;
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < 0) {
            return 0;
        }
        return (indexedQueue.capacity() == -1 || j2 <= ((long) indexedQueue.capacity())) ? (int) j2 : indexedQueue.capacity();
    }
}
