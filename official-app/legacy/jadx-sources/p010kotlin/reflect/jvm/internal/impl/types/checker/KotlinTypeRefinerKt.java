package p010kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p010kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nKotlinTypeRefiner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1549#2:91\n1620#2,3:92\n*S KotlinDebug\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n*L\n78#1:91\n78#1:92,3\n*E\n"})
public final class KotlinTypeRefinerKt {

    @NotNull
    private static final ModuleCapability<Ref<TypeRefinementSupport>> REFINER_CAPABILITY = new ModuleCapability<>("KotlinTypeRefiner");

    @NotNull
    public static final ModuleCapability<Ref<TypeRefinementSupport>> getREFINER_CAPABILITY() {
        return REFINER_CAPABILITY;
    }

    @NotNull
    public static final List<KotlinType> refineTypes(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull Iterable<? extends KotlinType> types) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "<this>");
        Intrinsics.checkNotNullParameter(types, "types");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(types, 10));
        Iterator<? extends KotlinType> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinTypeRefiner.refineType((KotlinTypeMarker) it.next()));
        }
        return arrayList;
    }
}
