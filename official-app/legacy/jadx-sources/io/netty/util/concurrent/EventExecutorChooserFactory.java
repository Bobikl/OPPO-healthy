package io.netty.util.concurrent;

/* JADX INFO: loaded from: classes10.dex */
public interface EventExecutorChooserFactory {

    public interface EventExecutorChooser {
        EventExecutor next();
    }

    EventExecutorChooser newChooser(EventExecutor[] eventExecutorArr);
}
