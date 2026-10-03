package pantanal.app.bean;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toCategoryInt", "", "Lpantanal/app/bean/CardCategory;", "pantanal-interface_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CardCategoryKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardCategory.values().length];
            try {
                iArr[CardCategory.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardCategory.INSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardCategory.SEEDLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardCategory.WIDGET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardCategory.APP_DRAGONFLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toCategoryInt(@NotNull CardCategory cardCategory) {
        Intrinsics.checkNotNullParameter(cardCategory, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[cardCategory.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 100;
            }
            if (i == 4) {
                return 5;
            }
            if (i != 5) {
                return 4;
            }
        }
        return 2;
    }
}
