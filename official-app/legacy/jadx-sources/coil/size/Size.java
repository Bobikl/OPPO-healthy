package coil.size;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: coil.size.e, reason: from toString */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcoil/size/e;", "", "Lcoil/size/c;", "a", "b", "", "toString", "", "hashCode", "other", "", "equals", "Lcoil/size/c;", "d", "()Lcoil/size/c;", Fields.WIDTH_FIELD, "c", Fields.HEIGHT_FIELD, "<init>", "(Lcoil/size/c;Lcoil/size/c;)V", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Size {

    @JvmField
    @NotNull
    public static final Size ORIGINAL;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final c width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final c height;

    static {
        c.b bVar = c.b.INSTANCE;
        ORIGINAL = new Size(bVar, bVar);
    }

    public Size(@NotNull c cVar, @NotNull c cVar2) {
        this.width = cVar;
        this.height = cVar2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getWidth() {
        return this.width;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getHeight() {
        return this.height;
    }

    @NotNull
    public final c c() {
        return this.height;
    }

    @NotNull
    public final c d() {
        return this.width;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Size)) {
            return false;
        }
        Size size = (Size) other;
        return Intrinsics.areEqual(this.width, size.width) && Intrinsics.areEqual(this.height, size.height);
    }

    public int hashCode() {
        return (this.width.hashCode() * 31) + this.height.hashCode();
    }

    @NotNull
    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }
}
