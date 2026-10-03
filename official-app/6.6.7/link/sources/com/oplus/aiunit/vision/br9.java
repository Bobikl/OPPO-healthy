package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/br9;", "", "Landroid/view/View;", "view", "", "Landroid/content/Intent;", "intentList", "", "handleStartActivityBySystem", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "", "setViewParams", "createView", "Lorg/json/JSONObject;", "jsonObject", "customParseFromJson", "customParseFromListData", "customApplyListData", "onVisible", "onInVisible", "onRelease", "mAppContext", "Landroid/content/Context;", "getMAppContext", "()Landroid/content/Context;", "setMAppContext", "(Landroid/content/Context;)V", "Lcom/oplus/aiunit/vision/qpi;", "mStartActivityCallback", "Lcom/oplus/aiunit/vision/qpi;", "getMStartActivityCallback", "()Lcom/oplus/aiunit/vision/qpi;", "setMStartActivityCallback", "(Lcom/oplus/aiunit/vision/qpi;)V", "<init>", "()V", "com.oplus.smartengine.customlib"}, k = 1, mv = {1, 4, 2})
public abstract class br9 {

    @Nullable
    private Context mAppContext;

    @Nullable
    private qpi mStartActivityCallback;

    @Nullable
    public abstract View createView(@NotNull Context context);

    public abstract void customApplyListData(@NotNull Context context, @NotNull View view, @Nullable ViewGroup parent);

    public abstract void customParseFromJson(@NotNull Context context, @NotNull JSONObject jsonObject);

    public abstract void customParseFromListData(@NotNull Context context, @NotNull JSONObject jsonObject);

    @Nullable
    public final Context getMAppContext() {
        return this.mAppContext;
    }

    @Nullable
    public final qpi getMStartActivityCallback() {
        return null;
    }

    public final boolean handleStartActivityBySystem(@NotNull View view, @NotNull List<? extends Intent> intentList) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(intentList, "intentList");
        return false;
    }

    public abstract void onInVisible(@Nullable View view);

    public abstract void onRelease(@Nullable View view);

    public abstract void onVisible(@Nullable View view);

    public final void setMAppContext(@Nullable Context context) {
        this.mAppContext = context;
    }

    public final void setMStartActivityCallback(@Nullable qpi qpiVar) {
    }

    public abstract void setViewParams(@NotNull Context context, @NotNull View view, @Nullable ViewGroup parent);
}
