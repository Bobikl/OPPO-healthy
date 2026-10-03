package com.oplus.seedling.sdk.pid;

import androidx.annotation.Keep;
import com.opos.process.bridge.base.BridgeConstant;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0085\u0001\u0012:\b\u0002\u0010\u0002\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b`\u0007\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b\u0012(\b\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u0007¢\u0006\u0002\u0010\fJ;\u0010\u0016\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b`\u0007HÆ\u0003J\u0019\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\bHÆ\u0003J)\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u0007HÆ\u0003J\u0089\u0001\u0010\u0019\u001a\u00020\u00002:\b\u0002\u0010\u0002\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b`\u00072\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b2(\b\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R1\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eRL\u0010\u0002\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/oplus/seedling/sdk/pid/PidInfo;", "Ljava/io/Serializable;", "hostPidMap", "Ljava/util/HashMap;", "", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashMap;", "Lkotlin/collections/HashSet;", "umsPidSet", BridgeConstant.KEY_EXTRAS, "", "(Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashMap;)V", "getExtras", "()Ljava/util/HashMap;", "getHostPidMap", "setHostPidMap", "(Ljava/util/HashMap;)V", "getUmsPidSet", "()Ljava/util/HashSet;", "setUmsPidSet", "(Ljava/util/HashSet;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PidInfo implements Serializable {
    private static final long serialVersionUID = -252;

    @Nullable
    private final HashMap<String, Object> extras;

    @NotNull
    private HashMap<String, HashSet<Integer>> hostPidMap;

    @NotNull
    private HashSet<Integer> umsPidSet;

    public PidInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PidInfo copy$default(PidInfo pidInfo, HashMap map, HashSet hashSet, HashMap map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = pidInfo.hostPidMap;
        }
        if ((i & 2) != 0) {
            hashSet = pidInfo.umsPidSet;
        }
        if ((i & 4) != 0) {
            map2 = pidInfo.extras;
        }
        return pidInfo.copy(map, hashSet, map2);
    }

    @NotNull
    public final HashMap<String, HashSet<Integer>> component1() {
        return this.hostPidMap;
    }

    @NotNull
    public final HashSet<Integer> component2() {
        return this.umsPidSet;
    }

    @Nullable
    public final HashMap<String, Object> component3() {
        return this.extras;
    }

    @NotNull
    public final PidInfo copy(@NotNull HashMap<String, HashSet<Integer>> hostPidMap, @NotNull HashSet<Integer> umsPidSet, @Nullable HashMap<String, Object> extras) {
        Intrinsics.checkNotNullParameter(hostPidMap, "hostPidMap");
        Intrinsics.checkNotNullParameter(umsPidSet, "umsPidSet");
        return new PidInfo(hostPidMap, umsPidSet, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PidInfo)) {
            return false;
        }
        PidInfo pidInfo = (PidInfo) other;
        return Intrinsics.areEqual(this.hostPidMap, pidInfo.hostPidMap) && Intrinsics.areEqual(this.umsPidSet, pidInfo.umsPidSet) && Intrinsics.areEqual(this.extras, pidInfo.extras);
    }

    @Nullable
    public final HashMap<String, Object> getExtras() {
        return this.extras;
    }

    @NotNull
    public final HashMap<String, HashSet<Integer>> getHostPidMap() {
        return this.hostPidMap;
    }

    @NotNull
    public final HashSet<Integer> getUmsPidSet() {
        return this.umsPidSet;
    }

    public int hashCode() {
        int iHashCode = ((this.hostPidMap.hashCode() * 31) + this.umsPidSet.hashCode()) * 31;
        HashMap<String, Object> map = this.extras;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final void setHostPidMap(@NotNull HashMap<String, HashSet<Integer>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.hostPidMap = map;
    }

    public final void setUmsPidSet(@NotNull HashSet<Integer> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
        this.umsPidSet = hashSet;
    }

    @NotNull
    public String toString() {
        return "PidInfo(hostPidMap=" + this.hostPidMap + ", umsPidSet=" + this.umsPidSet + ", extras=" + this.extras + ")";
    }

    public PidInfo(@NotNull HashMap<String, HashSet<Integer>> map, @NotNull HashSet<Integer> hashSet, @Nullable HashMap<String, Object> map2) {
        Intrinsics.checkNotNullParameter(map, "hostPidMap");
        Intrinsics.checkNotNullParameter(hashSet, "umsPidSet");
        this.hostPidMap = map;
        this.umsPidSet = hashSet;
        this.extras = map2;
    }

    public /* synthetic */ PidInfo(HashMap map, HashSet hashSet, HashMap map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HashMap() : map, (i & 2) != 0 ? new HashSet() : hashSet, (i & 4) != 0 ? null : map2);
    }
}
