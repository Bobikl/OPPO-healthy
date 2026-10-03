package com.oplus.pantanal.seedling.intent;

import com.oplus.channel.client.utils.LogUtil;
import com.oplus.smartenginehelper.ParserTag;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/intent/IIntentResultCallBack;", "", "onIntentResult", "", ParserTag.TAG_ACTION, "", ParserTag.TAG_FLAG, "", "isSuccess", "", "onIntentResultCodeCallBack", "resultCode", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IIntentResultCallBack {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/oplus/pantanal/seedling/intent/IIntentResultCallBack$Companion;", "", "()V", "TAG", "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String TAG = "IIntentResultCallBack";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(message = "不推荐使用此方法获取决策是否成功的状态，重复发送时可能会导致返回失败状态，推荐实现onIntentResultCodeCallBack方法")
        @Deprecated
        public static void onIntentResult(@NotNull IIntentResultCallBack iIntentResultCallBack, @NotNull String str, int i, boolean z) {
            Intrinsics.checkNotNullParameter(str, ParserTag.TAG_ACTION);
            IIntentResultCallBack.super.onIntentResult(str, i, z);
        }

        @Deprecated
        public static void onIntentResultCodeCallBack(@NotNull IIntentResultCallBack iIntentResultCallBack, @NotNull String str, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, ParserTag.TAG_ACTION);
            IIntentResultCallBack.super.onIntentResultCodeCallBack(str, i, i2);
        }
    }

    @Deprecated(message = "不推荐使用此方法获取决策是否成功的状态，重复发送时可能会导致返回失败状态，推荐实现onIntentResultCodeCallBack方法")
    default void onIntentResult(@NotNull String action, int flag, boolean isSuccess) {
        Intrinsics.checkNotNullParameter(action, ParserTag.TAG_ACTION);
        LogUtil.w("IIntentResultCallBack", "onIntentResult is Deprecated,please use onIntentResultCodeCallBack first");
    }

    default void onIntentResultCodeCallBack(@NotNull String action, int flag, int resultCode) {
        Intrinsics.checkNotNullParameter(action, ParserTag.TAG_ACTION);
        LogUtil.d("IIntentResultCallBack", "onIntentResultCodeCallBack");
    }
}
