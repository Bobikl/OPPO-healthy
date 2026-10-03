package com.heytap.store.base.widget.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/store/base/widget/font/OppoFontUtils;", "", "()V", "fontMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroid/graphics/Typeface;", "createFont", "context", "Landroid/content/Context;", "font", "Lcom/heytap/store/base/widget/font/OppoFont;", "getFont", "Companion", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OppoFontUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<OppoFontUtils> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<OppoFontUtils>() { // from class: com.heytap.store.base.widget.font.OppoFontUtils$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final OppoFontUtils invoke() {
            return new OppoFontUtils(null);
        }
    });

    @NotNull
    private final ConcurrentHashMap<String, Typeface> fontMap;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/base/widget/font/OppoFontUtils$Companion;", "", "()V", "instance", "Lcom/heytap/store/base/widget/font/OppoFontUtils;", "getInstance", "()Lcom/heytap/store/base/widget/font/OppoFontUtils;", "instance$delegate", "Lkotlin/Lazy;", "getFont", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "font", "Lcom/heytap/store/base/widget/font/OppoFont;", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final OppoFontUtils getInstance() {
            return (OppoFontUtils) OppoFontUtils.instance$delegate.getValue();
        }

        @Nullable
        public final Typeface getFont(@NotNull Context context, @NotNull OppoFont font) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(font, "font");
            return OppoFontUtils.INSTANCE.getInstance().getFont(context, font);
        }
    }

    public /* synthetic */ OppoFontUtils(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Typeface createFont(Context context, OppoFont font) {
        Object obj = font.getValue().second;
        Intrinsics.checkNotNullExpressionValue(obj, "font.value.second");
        return ResourcesCompat.getFont(context, ((Number) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Typeface getFont(Context context, OppoFont font) {
        String fontKey = (String) font.getValue().first;
        Typeface typeface = this.fontMap.get(fontKey);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceCreateFont = createFont(context, font);
        ConcurrentHashMap<String, Typeface> concurrentHashMap = this.fontMap;
        Intrinsics.checkNotNullExpressionValue(fontKey, "fontKey");
        concurrentHashMap.put(fontKey, typefaceCreateFont);
        return typefaceCreateFont;
    }

    private OppoFontUtils() {
        this.fontMap = new ConcurrentHashMap<>();
    }
}
