package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function4;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052)\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0002\u0010\u0010RI\u0010\u0003\u001a1\u0012\u0004\u0012\u00020\u0005\u0012'\u0012%\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/constraintlayout/compose/DesignElements;", "", "()V", "map", "Ljava/util/HashMap;", "", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/Composable;", "getMap", "()Ljava/util/HashMap;", "setMap", "(Ljava/util/HashMap;)V", "define", "name", "function", "(Ljava/lang/String;Lkotlin/jvm/functions/Function4;)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DesignElements {

    @NotNull
    public static final DesignElements INSTANCE = new DesignElements();

    @NotNull
    private static HashMap<String, Function4<String, HashMap<String, String>, Composer, Integer, Unit>> map = new HashMap<>();
    public static final int $stable = 8;

    private DesignElements() {
    }

    public final void define(@NotNull String name, @NotNull Function4<? super String, ? super HashMap<String, String>, ? super Composer, ? super Integer, Unit> function) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(function, "function");
        map.put(name, function);
    }

    @NotNull
    public final HashMap<String, Function4<String, HashMap<String, String>, Composer, Integer, Unit>> getMap() {
        return map;
    }

    public final void setMap(@NotNull HashMap<String, Function4<String, HashMap<String, String>, Composer, Integer, Unit>> map2) {
        Intrinsics.checkNotNullParameter(map2, "<set-?>");
        map = map2;
    }
}
