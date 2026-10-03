package com.heytap.store.base.core.util;

import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.imageloader.LoadStep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"loadImage", "", "view", "Landroid/widget/ImageView;", "imageUrl", "", "placeHolder", "", "errorHolder", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class BindingUtilsKt {
    @BindingAdapter(requireAll = false, value = {"imageUrl", "placeHolder", "errorHolder"})
    public static final void loadImage(@NotNull ImageView view, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null) {
            str = "";
        }
        LoadStep loadStepLoad = ImageLoader.load(str);
        if (num != null) {
            loadStepLoad.placeholder(num.intValue());
        }
        if (num2 != null) {
            loadStepLoad.failure(num2.intValue());
        }
        LoadStep.into$default(loadStepLoad, view, null, 2, null);
    }

    public static /* synthetic */ void loadImage$default(ImageView imageView, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        loadImage(imageView, str, num, num2);
    }
}
