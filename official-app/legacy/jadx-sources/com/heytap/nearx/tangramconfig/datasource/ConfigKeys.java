package com.heytap.nearx.tangramconfig.datasource;

import com.heytap.nearx.tangramconfig.BuildConfig;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\u0006\u0010\f\u001a\u00020\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/heytap/nearx/tangramconfig/datasource/ConfigKeys;", "", "keyList", "", "", "(Ljava/util/List;)V", "startTime", "", "equalList", "", "keys", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getStartTime", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConfigKeys {

    @NotNull
    private final List<String> keyList;
    private final long startTime;

    /* JADX WARN: Multi-variable type inference failed */
    public ConfigKeys() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equalList(@NotNull CopyOnWriteArrayList<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        if (this.keyList.size() == keys.size()) {
            int size = this.keyList.size();
            for (int i = 0; i < size; i++) {
                if (!keys.contains(this.keyList.get(i))) {
                    return false;
                }
            }
            return true;
        }
        if (keys.containsAll(this.keyList)) {
            keys.removeAll(CollectionsKt___CollectionsKt.toSet(this.keyList));
            return keys.size() == 0;
        }
        if (this.keyList.containsAll(keys)) {
            return true;
        }
        Set setIntersect = CollectionsKt___CollectionsKt.intersect(keys, CollectionsKt___CollectionsKt.toSet(this.keyList));
        if (setIntersect != null && (!setIntersect.isEmpty())) {
            keys.removeAll(setIntersect);
        }
        return false;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public ConfigKeys(@NotNull List<String> keyList) {
        Intrinsics.checkNotNullParameter(keyList, "keyList");
        this.keyList = keyList;
        this.startTime = System.currentTimeMillis();
    }

    public /* synthetic */ ConfigKeys(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CopyOnWriteArrayList() : list);
    }
}
