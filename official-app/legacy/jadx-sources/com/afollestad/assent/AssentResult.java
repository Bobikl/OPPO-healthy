package com.afollestad.assent;

import androidx.annotation.CheckResult;
import com.oplus.aiunit.vision.d2h;
import com.oplus.aiunit.vision.qb8;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0010\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0004\b\u0018\u0010\u001cB'\b\u0010\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0018\u0010 J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J#\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016J\u0013\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/afollestad/assent/AssentResult;", "", "", "Lcom/afollestad/assent/Permission;", "c", "a", MapSchema.FIELD_NAME_ENTRY, "", "permissions", "", "d", "([Lcom/afollestad/assent/Permission;)Z", "", "hashCode", "other", "equals", "", "toString", "", "Lcom/afollestad/assent/GrantResult;", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "resultsMap", "<init>", "(Ljava/util/Map;)V", "", "grantResults", "(Ljava/util/Set;Ljava/util/List;)V", "", "Lcom/oplus/aiunit/vision/d2h;", "shouldShowRationale", "(Ljava/util/Set;[ILcom/oplus/aiunit/vision/d2h;)V", "core"}, k = 1, mv = {1, 4, 0})
public final class AssentResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<Permission, GrantResult> resultsMap;

    /* JADX WARN: Multi-variable type inference failed */
    public AssentResult(@NotNull Map<Permission, ? extends GrantResult> resultsMap) {
        Intrinsics.checkParameterIsNotNull(resultsMap, "resultsMap");
        this.resultsMap = resultsMap;
    }

    @CheckResult
    @NotNull
    public final Set<Permission> a() {
        Map<Permission, GrantResult> map = this.resultsMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Permission, GrantResult> entry : map.entrySet()) {
            GrantResult value = entry.getValue();
            if (value == GrantResult.DENIED || value == GrantResult.PERMANENTLY_DENIED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt___CollectionsKt.toSet(linkedHashMap.keySet());
    }

    @NotNull
    public final Map<Permission, GrantResult> b() {
        return this.resultsMap;
    }

    @CheckResult
    @NotNull
    public final Set<Permission> c() {
        Map<Permission, GrantResult> map = this.resultsMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Permission, GrantResult> entry : map.entrySet()) {
            if (entry.getValue() == GrantResult.GRANTED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt___CollectionsKt.toSet(linkedHashMap.keySet());
    }

    @CheckResult
    public final boolean d(@NotNull Permission... permissions) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        Iterator it = SequencesKt___SequencesKt.map(ArraysKt___ArraysKt.asSequence(permissions), new Function1<Permission, GrantResult>() { // from class: com.afollestad.assent.AssentResult$isAllGranted$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final GrantResult invoke(@NotNull Permission permission) {
                Intrinsics.checkParameterIsNotNull(permission, "permission");
                GrantResult grantResult = this.this$0.b().get(permission);
                if (grantResult != null) {
                    return grantResult;
                }
                throw new IllegalStateException(("Permission " + permission + " not in result map.").toString());
            }
        }).iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return true;
            }
            if (((GrantResult) it.next()) != GrantResult.GRANTED) {
                z = false;
            }
        } while (z);
        return false;
    }

    @CheckResult
    @NotNull
    public final Set<Permission> e() {
        Map<Permission, GrantResult> map = this.resultsMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Permission, GrantResult> entry : map.entrySet()) {
            if (entry.getValue() == GrantResult.PERMANENTLY_DENIED) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt___CollectionsKt.toSet(linkedHashMap.keySet());
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof AssentResult) && Intrinsics.areEqual(((AssentResult) other).resultsMap, this.resultsMap);
    }

    public int hashCode() {
        return this.resultsMap.hashCode();
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.resultsMap.entrySet(), ", ", null, null, 0, null, new Function1<Map.Entry<? extends Permission, ? extends GrantResult>, String>() { // from class: com.afollestad.assent.AssentResult.toString.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull Map.Entry<? extends Permission, ? extends GrantResult> it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getKey() + " -> " + it.getValue();
            }
        }, 30, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssentResult(@NotNull Set<? extends Permission> permissions, @NotNull int[] grantResults, @NotNull d2h shouldShowRationale) {
        this(permissions, qb8.b(grantResults, permissions, shouldShowRationale));
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        Intrinsics.checkParameterIsNotNull(grantResults, "grantResults");
        Intrinsics.checkParameterIsNotNull(shouldShowRationale, "shouldShowRationale");
    }

    public AssentResult(@NotNull Set<? extends Permission> permissions, @NotNull List<? extends GrantResult> grantResults) {
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        Intrinsics.checkParameterIsNotNull(grantResults, "grantResults");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(permissions, 10));
        int i = 0;
        for (Object obj : permissions) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new Pair((Permission) obj, grantResults.get(i)));
            i = i2;
        }
        this(MapsKt__MapsKt.toMap(arrayList));
    }
}
