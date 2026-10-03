package pantanal.app;

import android.os.Bundle;
import android.view.View;
import com.oplus.aiunit.vision.oea;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.bean.PantanalUIData;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lpantanal/app/IPantanalService;", "Lpantanal/app/ILifecycle;", "getUIData", "Lpantanal/app/bean/PantanalUIData;", "getView", "Landroid/view/View;", "load", "", "bundle", "Landroid/os/Bundle;", "callback", "Lpantanal/app/OnLoadCallback;", "release", "setUIDataInterceptor", oea.CALLBACK, "Lpantanal/app/UIDataInterceptor;", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IPantanalService extends ILifecycle {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static View getView(@NotNull IPantanalService iPantanalService) {
            return null;
        }

        public static void setUIDataInterceptor(@NotNull IPantanalService iPantanalService, @NotNull UIDataInterceptor cb) {
            Intrinsics.checkNotNullParameter(cb, "cb");
        }
    }

    @Nullable
    PantanalUIData getUIData();

    @Nullable
    View getView();

    void load(@NotNull Bundle bundle, @NotNull OnLoadCallback callback);

    void load(@NotNull OnLoadCallback callback);

    void release();

    void setUIDataInterceptor(@NotNull UIDataInterceptor cb);
}
