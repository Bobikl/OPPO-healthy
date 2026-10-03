package pantanal.app;

import android.view.View;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0011J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lpantanal/app/OnLoadCallback;", "", "onCardViewCreated", "", "innerCard", "view", "Landroid/view/View;", "extraMap", "", "", "onError", "code", "", "message", "onFirstFrame", "onPreview", "onSuccess", "EngineLoadCode", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OnLoadCallback {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onCardViewCreated(@NotNull OnLoadCallback onLoadCallback, @NotNull Object innerCard, @NotNull View view, @Nullable Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(innerCard, "innerCard");
            Intrinsics.checkNotNullParameter(view, "view");
            bs9.a.c(t6e.INSTANCE, "OnLoadCallback", "onCardViewCreated default impl.", false, null, false, 0, false, null, 252, null);
        }

        public static void onError(@NotNull OnLoadCallback onLoadCallback, int i, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            bs9.a.c(t6e.INSTANCE, "OnLoadCallback", "onError default impl.", false, null, false, 0, false, null, 252, null);
        }

        public static void onFirstFrame(@NotNull OnLoadCallback onLoadCallback, @Nullable View view) {
            bs9.a.c(t6e.INSTANCE, "OnLoadCallback", "onFirstFrame default impl.", false, null, false, 0, false, null, 252, null);
        }

        public static void onPreview(@NotNull OnLoadCallback onLoadCallback, @NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            bs9.a.c(t6e.INSTANCE, "OnLoadCallback", "onPreview default impl.", false, null, false, 0, false, null, 252, null);
        }

        public static void onSuccess(@NotNull OnLoadCallback onLoadCallback, @NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            bs9.a.c(t6e.INSTANCE, "OnLoadCallback", "onSuccess default impl.", false, null, false, 0, false, null, 252, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lpantanal/app/OnLoadCallback$EngineLoadCode;", "", "()V", "ERROR_DATA", "", "ERROR_ENGINE_TYPE_UNSET", "ERROR_FILE_NOT_FOUND", "ERROR_INCOMPATIBLE", "ERROR_INSPECTOR_UNREADY", "ERROR_INSTALL_FAILED", "ERROR_INSTANT_ENGINE_INIT", "ERROR_INSTANT_GET_VIEW", "ERROR_INSTANT_RESULT_NULL", "ERROR_PAGE_NOT_FOUND", "ERROR_SEEDLING_INIT_FAILED", "ERROR_SEEDLING_LOAD_FAILED", "ERROR_SMART_ENGINE_CODE_INFLATE", "ERROR_SMART_ENGINE_CODE_REFRESH", "ERROR_SMART_ENGINE_CODE_UNKNOWN_DATA", "ERROR_TIME_OUT", "ERROR_UNKNOW", "ERROR_URL", "SEEDLING_CARD_CONFIG_ERROR", "SEEDLING_HOST_USE_ERROR", "SEEDLING_INTERRUPT_BY_ENTRANCE", "SEEDLING_PLUGIN_FEATURE_NOT_SUPPORT", "SEEDLING_PLUGIN_THROW_EXCE_ERROR", "SEEDLING_PLUGIN_VERIFY_ERROR", "SEEDLING_SERVICE_ID_ERROR", "SEEDLING_TASK_IS_CANCELED", "SEEDLING_UPK_COPY_ERROR", "SEEDLING_UPK_LOAD_ERROR", "SEEDLING_WAIT_CARD_DATA_TIME_OUT", "SUCCESS_INSTANT_GET_VIEW", "SUCCUSS_SEEDLING_LOAD_FINISHED", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EngineLoadCode {
        public static final int ERROR_DATA = 1008;
        public static final int ERROR_ENGINE_TYPE_UNSET = 1009;
        public static final int ERROR_FILE_NOT_FOUND = 1003;
        public static final int ERROR_INCOMPATIBLE = 1006;
        public static final int ERROR_INSPECTOR_UNREADY = 1007;
        public static final int ERROR_INSTALL_FAILED = 1004;
        public static final int ERROR_INSTANT_ENGINE_INIT = 1001;
        public static final int ERROR_INSTANT_GET_VIEW = 0;
        public static final int ERROR_INSTANT_RESULT_NULL = -102;
        public static final int ERROR_PAGE_NOT_FOUND = 1005;
        public static final int ERROR_SEEDLING_INIT_FAILED = 4096;
        public static final int ERROR_SEEDLING_LOAD_FAILED = 2048;
        public static final int ERROR_SMART_ENGINE_CODE_INFLATE = 2;
        public static final int ERROR_SMART_ENGINE_CODE_REFRESH = 3;
        public static final int ERROR_SMART_ENGINE_CODE_UNKNOWN_DATA = 4;
        public static final int ERROR_TIME_OUT = 1010;
        public static final int ERROR_UNKNOW = 1000;
        public static final int ERROR_URL = 1002;

        @NotNull
        public static final EngineLoadCode INSTANCE = new EngineLoadCode();
        public static final int SEEDLING_CARD_CONFIG_ERROR = 2006;
        public static final int SEEDLING_HOST_USE_ERROR = 2003;
        public static final int SEEDLING_INTERRUPT_BY_ENTRANCE = 2007;
        public static final int SEEDLING_PLUGIN_FEATURE_NOT_SUPPORT = 1003;
        public static final int SEEDLING_PLUGIN_THROW_EXCE_ERROR = 1002;
        public static final int SEEDLING_PLUGIN_VERIFY_ERROR = 1001;
        public static final int SEEDLING_SERVICE_ID_ERROR = 2004;
        public static final int SEEDLING_TASK_IS_CANCELED = 2005;
        public static final int SEEDLING_UPK_COPY_ERROR = 2001;
        public static final int SEEDLING_UPK_LOAD_ERROR = 2002;
        public static final int SEEDLING_WAIT_CARD_DATA_TIME_OUT = 2008;
        public static final int SUCCESS_INSTANT_GET_VIEW = 200;
        public static final int SUCCUSS_SEEDLING_LOAD_FINISHED = 1024;

        private EngineLoadCode() {
        }
    }

    void onCardViewCreated(@NotNull Object innerCard, @NotNull View view, @Nullable Map<String, ? extends Object> extraMap);

    void onError(int code, @NotNull String message);

    void onFirstFrame(@Nullable View view);

    void onPreview(@NotNull View view);

    void onSuccess(@NotNull View view);
}
