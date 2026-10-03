package pantanal.decision.entity;

import androidx.annotation.Keep;
import com.pantanal.server.content.recommendlist.ServiceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.decision.DecisionObserver;
import pantanal.decision.ObserverWrapper;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lpantanal/decision/entity/DecisionObserverInfo;", "", "observer", "Lpantanal/decision/DecisionObserver;", "obWrapper", "Lpantanal/decision/ObserverWrapper;", "Lcom/pantanal/server/content/recommendlist/ServiceInfo;", "Lpantanal/decision/StaticServiceInfo;", "(Lpantanal/decision/DecisionObserver;Lpantanal/decision/ObserverWrapper;)V", "getObWrapper", "()Lpantanal/decision/ObserverWrapper;", "getObserver", "()Lpantanal/decision/DecisionObserver;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-decision_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DecisionObserverInfo {

    @NotNull
    private final ObserverWrapper<ServiceInfo> obWrapper;

    @NotNull
    private final DecisionObserver observer;

    public DecisionObserverInfo(@NotNull DecisionObserver observer, @NotNull ObserverWrapper<ServiceInfo> obWrapper) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(obWrapper, "obWrapper");
        this.observer = observer;
        this.obWrapper = obWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DecisionObserverInfo copy$default(DecisionObserverInfo decisionObserverInfo, DecisionObserver decisionObserver, ObserverWrapper observerWrapper, int i, Object obj) {
        if ((i & 1) != 0) {
            decisionObserver = decisionObserverInfo.observer;
        }
        if ((i & 2) != 0) {
            observerWrapper = decisionObserverInfo.obWrapper;
        }
        return decisionObserverInfo.copy(decisionObserver, observerWrapper);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DecisionObserver getObserver() {
        return this.observer;
    }

    @NotNull
    public final ObserverWrapper<ServiceInfo> component2() {
        return this.obWrapper;
    }

    @NotNull
    public final DecisionObserverInfo copy(@NotNull DecisionObserver observer, @NotNull ObserverWrapper<ServiceInfo> obWrapper) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(obWrapper, "obWrapper");
        return new DecisionObserverInfo(observer, obWrapper);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecisionObserverInfo)) {
            return false;
        }
        DecisionObserverInfo decisionObserverInfo = (DecisionObserverInfo) other;
        return Intrinsics.areEqual(this.observer, decisionObserverInfo.observer) && Intrinsics.areEqual(this.obWrapper, decisionObserverInfo.obWrapper);
    }

    @NotNull
    public final ObserverWrapper<ServiceInfo> getObWrapper() {
        return this.obWrapper;
    }

    @NotNull
    public final DecisionObserver getObserver() {
        return this.observer;
    }

    public int hashCode() {
        return (this.observer.hashCode() * 31) + this.obWrapper.hashCode();
    }

    @NotNull
    public String toString() {
        return "DecisionObserverInfo(observer=" + this.observer + ", obWrapper=" + this.obWrapper + ")";
    }
}
