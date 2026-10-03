package p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nJvmNameResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolver.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class JvmNameResolver extends JvmNameResolverBase {

    @NotNull
    private final JvmProtoBuf.StringTableTypes types;

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmNameResolver(@NotNull JvmProtoBuf.StringTableTypes types, @NotNull String[] strings) {
        Set set;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(strings, "strings");
        List<Integer> _init_$lambda$0 = types.getLocalNameList();
        if (_init_$lambda$0.isEmpty()) {
            set = SetsKt__SetsKt.emptySet();
        } else {
            Intrinsics.checkNotNullExpressionValue(_init_$lambda$0, "_init_$lambda$0");
            set = CollectionsKt___CollectionsKt.toSet(_init_$lambda$0);
        }
        List<JvmProtoBuf.StringTableTypes.Record> recordList = types.getRecordList();
        Intrinsics.checkNotNullExpressionValue(recordList, "types.recordList");
        super(strings, set, JvmNameResolverKt.toExpandedRecordsList(recordList));
        this.types = types;
    }
}
