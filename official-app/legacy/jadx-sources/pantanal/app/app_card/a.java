package pantanal.app.app_card;

import android.view.View;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.OnLoadCallback;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpantanal/app/app_card/a;", "Lpantanal/app/OnLoadCallback;", "card-smart-engine_release"}, k = 1, mv = {1, 8, 0})
public interface a extends OnLoadCallback {

    /* JADX INFO: renamed from: pantanal.app.app_card.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C1052a {
        public static void a(@NotNull a aVar, @NotNull Object innerCard, @NotNull View view, @Nullable Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(innerCard, "innerCard");
            Intrinsics.checkNotNullParameter(view, "view");
            OnLoadCallback.DefaultImpls.onCardViewCreated(aVar, innerCard, view, map);
        }

        public static void b(@NotNull a aVar, @Nullable View view) {
            OnLoadCallback.DefaultImpls.onFirstFrame(aVar, view);
        }
    }
}
