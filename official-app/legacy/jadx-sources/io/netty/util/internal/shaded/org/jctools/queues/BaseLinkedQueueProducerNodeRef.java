package io.netty.util.internal.shaded.org.jctools.queues;

import com.oplus.aiunit.vision.g9n;
import io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes10.dex */
abstract class BaseLinkedQueueProducerNodeRef<E> extends BaseLinkedQueuePad0<E> {
    static final long P_NODE_OFFSET = UnsafeAccess.fieldOffset(BaseLinkedQueueProducerNodeRef.class, "producerNode");
    private volatile LinkedQueueNode<E> producerNode;

    public final boolean casProducerNode(LinkedQueueNode<E> linkedQueueNode, LinkedQueueNode<E> linkedQueueNode2) {
        return g9n.a(UnsafeAccess.UNSAFE, this, P_NODE_OFFSET, linkedQueueNode, linkedQueueNode2);
    }

    public final LinkedQueueNode<E> lpProducerNode() {
        return this.producerNode;
    }

    public final LinkedQueueNode<E> lvProducerNode() {
        return this.producerNode;
    }

    public final void soProducerNode(LinkedQueueNode<E> linkedQueueNode) {
        UnsafeAccess.UNSAFE.putOrderedObject(this, P_NODE_OFFSET, linkedQueueNode);
    }

    public final void spProducerNode(LinkedQueueNode<E> linkedQueueNode) {
        UnsafeAccess.UNSAFE.putObject(this, P_NODE_OFFSET, linkedQueueNode);
    }
}
