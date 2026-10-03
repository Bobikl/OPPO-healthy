package coil.request;

import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: coil.request.d, reason: from toString */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0004B!\b\u0002\u0012\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u0011"}, d2 = {"Lcoil/request/d;", "", "", "Ljava/lang/Class;", "a", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/util/Map;", UTraceSQLiteHelperKt.COL_TAGS, "<init>", "(Ljava/util/Map;)V", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class Tags {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Tags EMPTY = new Tags(MapsKt__MapsKt.emptyMap());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<Class<?>, Object> tags;

    /* JADX INFO: renamed from: coil.request.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcoil/request/d$a;", "", "", "Ljava/lang/Class;", UTraceSQLiteHelperKt.COL_TAGS, "Lcoil/request/d;", "a", "EMPTY", "Lcoil/request/d;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Tags a(@NotNull Map<Class<?>, ? extends Object> tags) {
            return new Tags(com.oplus.aiunit.vision.c.b(tags), null);
        }
    }

    public /* synthetic */ Tags(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @NotNull
    public final Map<Class<?>, Object> a() {
        return this.tags;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Tags) && Intrinsics.areEqual(this.tags, ((Tags) other).tags);
    }

    public int hashCode() {
        return this.tags.hashCode();
    }

    @NotNull
    public String toString() {
        return "Tags(tags=" + this.tags + ')';
    }

    public Tags(Map<Class<?>, ? extends Object> map) {
        this.tags = map;
    }
}
