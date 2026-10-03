package com.heytap.store.platform.tools;

import android.widget.Toast;
import androidx.annotation.StringRes;
import com.heytap.webview.extension.jsapi.common.CommonApiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.MutablePropertyReference0Impl;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nJ6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nJ.\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/platform/tools/ToastUtils;", "", "()V", CommonApiMethod.TOAST, "Landroid/widget/Toast;", CardAction.LIFE_CIRCLE_VALUE_SHOW, "", "charSequence", "", "duration", "", "xOffset", "yOffset", "gravity", "stringResId", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class ToastUtils {
    public static final ToastUtils INSTANCE = new ToastUtils();
    private static Toast toast;

    /* JADX INFO: renamed from: com.heytap.store.platform.tools.ToastUtils$show$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0Impl {
        public AnonymousClass1(ToastUtils toastUtils) {
            super(toastUtils, ToastUtils.class, CommonApiMethod.TOAST, "getToast()Landroid/widget/Toast;", 0);
        }

        @Override // p010kotlin.jvm.internal.MutablePropertyReference0Impl, p010kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return ToastUtils.access$getToast$p((ToastUtils) this.receiver);
        }

        @Override // p010kotlin.jvm.internal.MutablePropertyReference0Impl, p010kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ToastUtils.toast = (Toast) obj;
        }
    }

    /* JADX INFO: renamed from: com.heytap.store.platform.tools.ToastUtils$show$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    final /* synthetic */ class AnonymousClass2 extends MutablePropertyReference0Impl {
        public AnonymousClass2(ToastUtils toastUtils) {
            super(toastUtils, ToastUtils.class, CommonApiMethod.TOAST, "getToast()Landroid/widget/Toast;", 0);
        }

        @Override // p010kotlin.jvm.internal.MutablePropertyReference0Impl, p010kotlin.reflect.KProperty0
        @Nullable
        public Object get() {
            return ToastUtils.access$getToast$p((ToastUtils) this.receiver);
        }

        @Override // p010kotlin.jvm.internal.MutablePropertyReference0Impl, p010kotlin.reflect.KMutableProperty0
        public void set(@Nullable Object obj) {
            ToastUtils.toast = (Toast) obj;
        }
    }

    private ToastUtils() {
    }

    public static final /* synthetic */ Toast access$getToast$p(ToastUtils toastUtils) {
        Toast toast2 = toast;
        if (toast2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
        }
        return toast2;
    }

    public static /* synthetic */ void show$default(ToastUtils toastUtils, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        toastUtils.show(i, i2, i3, i4);
    }

    public final void show(@StringRes int stringResId, int duration, int xOffset, int yOffset) {
        show(ResourcesUtils.INSTANCE.getString(stringResId), duration, xOffset, yOffset);
    }

    public static /* synthetic */ void show$default(ToastUtils toastUtils, CharSequence charSequence, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        toastUtils.show(charSequence, i, i2, i3);
    }

    public static /* synthetic */ void show$default(ToastUtils toastUtils, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i = 81;
        }
        toastUtils.show(charSequence, i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }

    public final void show(@NotNull CharSequence charSequence, int duration, int xOffset, int yOffset) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Toast toast2 = toast;
        if (toast2 != null) {
            if (toast2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
            }
            toast2.cancel();
        }
        Toast toastMakeText = Toast.makeText(ContextGetterUtils.INSTANCE.getApp(), "", 0);
        Intrinsics.checkNotNullExpressionValue(toastMakeText, "Toast.makeText(ContextGe…, \"\", Toast.LENGTH_SHORT)");
        toast = toastMakeText;
        if (toastMakeText == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
        }
        toastMakeText.setText(charSequence);
        Toast toast3 = toast;
        if (toast3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
        }
        toast3.setDuration(duration);
        if (xOffset != 0 || yOffset != 0) {
            Toast toast4 = toast;
            if (toast4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
            }
            toast4.setGravity(81, xOffset, yOffset);
        }
        Toast toast5 = toast;
        if (toast5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
        }
        toast5.show();
    }

    public final void show(@NotNull CharSequence charSequence, int gravity, int duration, int xOffset, int yOffset) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Toast toast2 = toast;
        if (toast2 != null) {
            if (toast2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
            }
            toast2.cancel();
        }
        Toast toastMakeText = Toast.makeText(ContextGetterUtils.INSTANCE.getApp(), "", 0);
        Intrinsics.checkNotNullExpressionValue(toastMakeText, "Toast.makeText(ContextGe…, \"\", Toast.LENGTH_SHORT)");
        toast = toastMakeText;
        if (toastMakeText == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
        }
        toastMakeText.setText(charSequence);
        Toast toast3 = toast;
        if (toast3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
        }
        toast3.setDuration(duration);
        Toast toast4 = toast;
        if (toast4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
        }
        toast4.setGravity(gravity, xOffset, yOffset);
        Toast toast5 = toast;
        if (toast5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CommonApiMethod.TOAST);
        }
        toast5.show();
    }
}
