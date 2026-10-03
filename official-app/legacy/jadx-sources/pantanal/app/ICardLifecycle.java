package pantanal.app;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lpantanal/app/ICardLifecycle;", "Lpantanal/app/ILifecycle;", "onForceUpdate", "", "lifecycle", "Lpantanal/app/ICardLifecycle$LifeCycleValue;", "onHostChange", "jsonString", "", "onScrollState", "state", "", "onSubscribe", "onUnsubscribe", "LifeCycleValue", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ICardLifecycle extends ILifecycle {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onForceUpdate(@NotNull ICardLifecycle iCardLifecycle, @NotNull LifeCycleValue lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        }

        public static void onScrollState(@NotNull ICardLifecycle iCardLifecycle, int i) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lpantanal/app/ICardLifecycle$LifeCycleValue;", "", "(Ljava/lang/String;I)V", "Unknown", "Subscribe", "Create", "Start", "Resume", "Pause", "Stop", "Destroy", "Unsubscribe", "HostChange", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LifeCycleValue {
        Unknown,
        Subscribe,
        Create,
        Start,
        Resume,
        Pause,
        Stop,
        Destroy,
        Unsubscribe,
        HostChange
    }

    void onForceUpdate(@NotNull LifeCycleValue lifecycle);

    void onHostChange(@NotNull String jsonString);

    void onScrollState(int state);

    void onSubscribe();

    void onUnsubscribe();
}
