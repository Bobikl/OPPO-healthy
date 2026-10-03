package io.netty.util.concurrent;

import com.heytap.speech.engine.constant.EngineConstant;
import io.netty.util.internal.ObjectUtil;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public final class ImmediateExecutor implements Executor {
    public static final ImmediateExecutor INSTANCE = new ImmediateExecutor();

    private ImmediateExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        ((Runnable) ObjectUtil.checkNotNull(runnable, EngineConstant.WAKEUP_TYPE_COMMAND)).run();
    }
}
