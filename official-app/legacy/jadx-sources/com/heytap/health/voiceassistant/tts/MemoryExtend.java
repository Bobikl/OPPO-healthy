package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005¢\u0006\u0002\u0010\u0006J%\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005HÆ\u0003J/\u0010\n\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R-\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/voiceassistant/tts/MemoryExtend;", "", "extend", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "getExtend", "()Ljava/util/HashMap;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MemoryExtend {

    @NotNull
    private final HashMap<String, Object> extend;

    public MemoryExtend(@NotNull HashMap<String, Object> extend) {
        Intrinsics.checkNotNullParameter(extend, "extend");
        this.extend = extend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemoryExtend copy$default(MemoryExtend memoryExtend, HashMap map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = memoryExtend.extend;
        }
        return memoryExtend.copy(map);
    }

    @NotNull
    public final HashMap<String, Object> component1() {
        return this.extend;
    }

    @NotNull
    public final MemoryExtend copy(@NotNull HashMap<String, Object> extend) {
        Intrinsics.checkNotNullParameter(extend, "extend");
        return new MemoryExtend(extend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MemoryExtend) && Intrinsics.areEqual(this.extend, ((MemoryExtend) other).extend);
    }

    @NotNull
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    public int hashCode() {
        return this.extend.hashCode();
    }

    @NotNull
    public String toString() {
        return "MemoryExtend(extend=" + this.extend + ")";
    }
}
