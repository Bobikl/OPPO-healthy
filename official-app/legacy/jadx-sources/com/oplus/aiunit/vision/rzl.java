package com.oplus.aiunit.vision;

import com.oplus.drs.core.upload.upload.ChannelType;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class rzl {
    public final ExecutorService a;
    public final que b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f16415c;
    public final Map<ChannelType, Executor> d;

    public rzl() {
        ExecutorService executorServiceR = u56.r();
        this.a = executorServiceR;
        this.b = new que(executorServiceR);
        this.f16415c = u56.q();
        this.d = c();
        d();
    }

    public Executor a(ChannelType channelType) {
        Executor executor = this.d.get(channelType);
        if (executor != null) {
            return executor;
        }
        throw new IllegalStateException("Channel " + channelType + " not registered in WorkerRegistry! Please add mapping in initializeWorkerMap().");
    }

    public final String b(Executor executor) {
        if (executor == this.b) {
            return "rtPriorityWorker";
        }
        if (executor == this.a) {
            return "rtWorkerRaw";
        }
        return executor == this.f16415c ? "nrWorker" : "unknown";
    }

    public final Map<ChannelType, Executor> c() {
        EnumMap enumMap = new EnumMap(ChannelType.class);
        enumMap.put(ChannelType.REALTIME, this.b);
        enumMap.put(ChannelType.PSEUDO, this.f16415c);
        enumMap.put(ChannelType.NON_REALTIME, this.f16415c);
        return enumMap;
    }

    public final void d() {
        StringBuilder sb = new StringBuilder();
        sb.append("WorkerRegistry initialized:\n");
        sb.append("┌─────────────────┬──────────────────┐\n");
        sb.append("│ Channel         │ Worker           │\n");
        sb.append("├─────────────────┼──────────────────┤\n");
        for (Map.Entry<ChannelType, Executor> entry : this.d.entrySet()) {
            sb.append(String.format("│ %-15s │ %-16s │\n", entry.getKey().getDisplayName(), b(entry.getValue())));
        }
        sb.append("└─────────────────┴──────────────────┘");
        z6b.q("WorkerRegistry", sb.toString());
    }
}
