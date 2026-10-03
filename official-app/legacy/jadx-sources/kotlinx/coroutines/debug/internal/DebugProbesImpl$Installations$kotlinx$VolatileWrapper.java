package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.Volatile;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class DebugProbesImpl$Installations$kotlinx$VolatileWrapper {

    @NotNull
    private static final AtomicIntegerFieldUpdater installations$FU = AtomicIntegerFieldUpdater.newUpdater(DebugProbesImpl$Installations$kotlinx$VolatileWrapper.class, "installations");

    @Volatile
    private volatile int installations;

    private DebugProbesImpl$Installations$kotlinx$VolatileWrapper() {
    }

    public /* synthetic */ DebugProbesImpl$Installations$kotlinx$VolatileWrapper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
