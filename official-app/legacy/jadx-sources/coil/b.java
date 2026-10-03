package coil;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "Lcoil/ImageLoader;", "a", "(Landroid/content/Context;)Lcoil/ImageLoader;", "coil-base_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "ImageLoaders")
public final class b {
    @JvmName(name = "create")
    @NotNull
    public static final ImageLoader a(@NotNull Context context) {
        return new ImageLoader.Builder(context).c();
    }
}
