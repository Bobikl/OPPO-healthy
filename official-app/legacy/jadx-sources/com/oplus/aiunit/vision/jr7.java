package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J \u0010\u0010\u001a\u00020\u000f2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH&J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J,\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\n0\u0015H&J,\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\n0\u0015H&J%\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/jr7;", "", "Landroid/content/Context;", "getContext", "Landroidx/recyclerview/widget/RecyclerView;", MapSchema.FIELD_NAME_KEY, "Landroidx/fragment/app/FragmentActivity;", "getActivity", "", "type", "", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/device/flexadapter/a;", "itemView", EventType.STATE_PACKAGE_CHANGED_REMOVE, "", LogFieldKey.MESSAGE_KEY, "position", "s", "v", y15.PARAMS_DATA_TYPE, "Lkotlin/Function1;", "filter", "j", "x", "R", "Ljava/lang/Class;", "clazz", LogFieldKey.LEVEL_KEY, "(Ljava/lang/Class;)Ljava/lang/Object;", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface jr7 {
    @NotNull
    FragmentActivity getActivity();

    @NotNull
    Context getContext();

    boolean j(int dataType, @NotNull Function1<? super com.heytap.health.device.flexadapter.a<?, ?>, Boolean> filter);

    @NotNull
    RecyclerView k();

    @Nullable
    <R> R l(@NotNull Class<R> clazz);

    void m(@NotNull com.heytap.health.device.flexadapter.a<?, ?> itemView, boolean remove);

    boolean p(int type);

    void s(int position);

    int v(int type);

    boolean x(int dataType, @NotNull Function1<? super com.heytap.health.device.flexadapter.a<?, ?>, Boolean> filter);
}
