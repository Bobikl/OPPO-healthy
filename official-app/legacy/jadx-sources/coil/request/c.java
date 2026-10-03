package coil.request;

import coil.decode.SvgDecoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcoil/request/b;", "", "a", "coil-svg_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "Svgs")
public final class c {
    @Nullable
    public static final String a(@NotNull Parameters parameters) {
        return (String) parameters.d(SvgDecoder.CSS_KEY);
    }
}
