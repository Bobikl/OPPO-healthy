package coil.size;

import androidx.annotation.Px;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001a\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0000\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "Lcoil/size/e;", "a", "", "b", "(Lcoil/size/e;)Z", "isOriginal", "coil-base_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-Sizes")
public final class b {
    @NotNull
    public static final Size a(@Px int i, @Px int i2) {
        return new Size(a.a(i), a.a(i2));
    }

    public static final boolean b(@NotNull Size size) {
        return Intrinsics.areEqual(size, Size.ORIGINAL);
    }
}
