package com.oplus.aiunit.vision;

import com.afollestad.assent.AssentResult;
import com.afollestad.assent.Permission;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\"\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a \u0010\u000b\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a!\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0018\u001a\u00020\u0016*'\u0012#\u0012!\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0011j\u0002`\u00170\u00102\u0006\u0010\u0015\u001a\u00020\u0012H\u0000¨\u0006\u0019"}, d2 = {"", "Lcom/afollestad/assent/Permission;", "", "", "strings", "", "d", "(Ljava/util/Set;[Ljava/lang/String;)Z", "permissions", "c", "(Ljava/util/Set;[Lcom/afollestad/assent/Permission;)Z", "b", "a", "(Ljava/util/Set;)[Ljava/lang/String;", "f", "([Ljava/lang/String;)Ljava/util/Set;", "", "Lkotlin/Function1;", "Lcom/afollestad/assent/AssentResult;", "Lkotlin/ParameterName;", "name", "result", "", "Lcom/afollestad/assent/Callback;", MapSchema.FIELD_NAME_ENTRY, "core"}, k = 2, mv = {1, 4, 0})
public final class jk3 {
    @NotNull
    public static final String[] a(@NotNull Set<? extends Permission> allValues) {
        Intrinsics.checkParameterIsNotNull(allValues, "$this$allValues");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allValues, 10));
        Iterator<T> it = allValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((Permission) it.next()).getValue());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean b(@NotNull Set<? extends Permission> equalsPermissions, @NotNull Set<? extends Permission> permissions) {
        Intrinsics.checkParameterIsNotNull(equalsPermissions, "$this$equalsPermissions");
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        if (equalsPermissions.size() != permissions.size()) {
            return false;
        }
        Iterator<T> it = equalsPermissions.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!Intrinsics.areEqual(((Permission) it.next()).getValue(), ((Permission) CollectionsKt___CollectionsKt.elementAt(permissions, i)).getValue())) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final boolean c(@NotNull Set<? extends Permission> equalsPermissions, @NotNull Permission... permissions) {
        Intrinsics.checkParameterIsNotNull(equalsPermissions, "$this$equalsPermissions");
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        return b(equalsPermissions, ArraysKt___ArraysKt.toSet(permissions));
    }

    public static final boolean d(@NotNull Set<? extends Permission> equalsStrings, @NotNull String[] strings) {
        Intrinsics.checkParameterIsNotNull(equalsStrings, "$this$equalsStrings");
        Intrinsics.checkParameterIsNotNull(strings, "strings");
        if (equalsStrings.size() != strings.length) {
            return false;
        }
        Iterator<T> it = equalsStrings.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!Intrinsics.areEqual(((Permission) it.next()).getValue(), strings[i])) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final void e(@NotNull List<? extends Function1<? super AssentResult, Unit>> invokeAll, @NotNull AssentResult result) {
        Intrinsics.checkParameterIsNotNull(invokeAll, "$this$invokeAll");
        Intrinsics.checkParameterIsNotNull(result, "result");
        Iterator<? extends Function1<? super AssentResult, Unit>> it = invokeAll.iterator();
        while (it.hasNext()) {
            it.next().invoke(result);
        }
    }

    @NotNull
    public static final Set<Permission> f(@NotNull String[] toPermissions) {
        Intrinsics.checkParameterIsNotNull(toPermissions, "$this$toPermissions");
        ArrayList arrayList = new ArrayList(toPermissions.length);
        for (String str : toPermissions) {
            arrayList.add(Permission.INSTANCE.a(str));
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }
}
