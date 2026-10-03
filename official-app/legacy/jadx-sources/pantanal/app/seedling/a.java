package pantanal.app.seedling;

import android.view.View;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.OnLoadCallback;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\t"}, d2 = {"Lpantanal/app/seedling/a;", "Lpantanal/app/OnLoadCallback;", "Landroid/view/View;", "view", "", "code", "", "a", "onFirstFrame", "card-seedling_release"}, k = 1, mv = {1, 8, 0})
public interface a extends OnLoadCallback {

    /* JADX INFO: renamed from: pantanal.app.seedling.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C1054a {
        public static void a(@NotNull a aVar, @NotNull Object innerCard, @NotNull View view, @Nullable Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(innerCard, "innerCard");
            Intrinsics.checkNotNullParameter(view, "view");
            OnLoadCallback.DefaultImpls.onCardViewCreated(aVar, innerCard, view, map);
        }
    }

    void a(@NotNull View view, int code);

    @Override // pantanal.app.OnLoadCallback
    void onFirstFrame(@Nullable View view);
}
