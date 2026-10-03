package io.reactivex.rxjava3.internal.queue;

import com.oplus.aiunit.vision.b4h;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MpscLinkedQueue<T> implements b4h<T> {
    public final AtomicReference<LinkedQueueNode<T>> i = new AtomicReference<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<T>> f20620j = new AtomicReference<>();

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        public LinkedQueueNode() {
        }

        public E getAndNullValue() {
            E eLpValue = lpValue();
            spValue(null);
            return eLpValue;
        }

        public E lpValue() {
            return this.value;
        }

        public LinkedQueueNode<E> lvNext() {
            return get();
        }

        public void soNext(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        public void spValue(E e2) {
            this.value = e2;
        }

        public LinkedQueueNode(E e2) {
            spValue(e2);
        }
    }

    public MpscLinkedQueue() {
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        d(linkedQueueNode);
        e(linkedQueueNode);
    }

    public LinkedQueueNode<T> a() {
        return this.f20620j.get();
    }

    public LinkedQueueNode<T> b() {
        return this.f20620j.get();
    }

    public LinkedQueueNode<T> c() {
        return this.i.get();
    }

    @Override // com.oplus.aiunit.vision.f4h
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    public void d(LinkedQueueNode<T> linkedQueueNode) {
        this.f20620j.lazySet(linkedQueueNode);
    }

    public LinkedQueueNode<T> e(LinkedQueueNode<T> linkedQueueNode) {
        return this.i.getAndSet(linkedQueueNode);
    }

    @Override // com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // com.oplus.aiunit.vision.f4h
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(t);
        e(linkedQueueNode).soNext(linkedQueueNode);
        return true;
    }

    @Override // com.oplus.aiunit.vision.b4h, com.oplus.aiunit.vision.f4h
    public T poll() {
        LinkedQueueNode<T> linkedQueueNodeLvNext;
        LinkedQueueNode<T> linkedQueueNodeA = a();
        LinkedQueueNode<T> linkedQueueNodeLvNext2 = linkedQueueNodeA.lvNext();
        if (linkedQueueNodeLvNext2 != null) {
            T andNullValue = linkedQueueNodeLvNext2.getAndNullValue();
            d(linkedQueueNodeLvNext2);
            return andNullValue;
        }
        if (linkedQueueNodeA == c()) {
            return null;
        }
        do {
            linkedQueueNodeLvNext = linkedQueueNodeA.lvNext();
        } while (linkedQueueNodeLvNext == null);
        T andNullValue2 = linkedQueueNodeLvNext.getAndNullValue();
        d(linkedQueueNodeLvNext);
        return andNullValue2;
    }
}
