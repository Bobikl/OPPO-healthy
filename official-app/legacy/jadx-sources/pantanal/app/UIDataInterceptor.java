package pantanal.app;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import pantanal.app.bean.PantanalUIData;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lpantanal/app/UIDataInterceptor;", "", "onReceiveUIData", "", "pantanalUiData", "Lpantanal/app/bean/PantanalUIData;", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface UIDataInterceptor {
    boolean onReceiveUIData(@NotNull PantanalUIData pantanalUiData);
}
