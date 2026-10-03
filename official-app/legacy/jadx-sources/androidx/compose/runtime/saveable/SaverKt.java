package androidx.compose.runtime.saveable;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.b3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aw\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00022.\u0010\u0006\u001a*\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0007¢\u0006\u0002\b\f2#\u0010\r\u001a\u001f\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u000e\u001a\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0010\"\u001c\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"AutoSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "Saver", b3d.ORIGINAL_SEMANTIC, "Saveable", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "autoSaver", ExifInterface.GPS_DIRECTION_TRUE, "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SaverKt {

    @NotNull
    private static final Saver<Object, Object> AutoSaver = Saver(new Function2<SaverScope, Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return obj;
        }
    }, new Function1<Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // p010kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    });

    @NotNull
    public static final <Original, Saveable> Saver<Original, Saveable> Saver(@NotNull final Function2<? super SaverScope, ? super Original, ? extends Saveable> save, @NotNull final Function1<? super Saveable, ? extends Original> restore) {
        Intrinsics.checkNotNullParameter(save, "save");
        Intrinsics.checkNotNullParameter(restore, "restore");
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt.Saver.1
            @Override // androidx.compose.runtime.saveable.Saver
            @Nullable
            public Original restore(@NotNull Saveable value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return restore.invoke(value);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            @Nullable
            public Saveable save(@NotNull SaverScope saverScope, Original original) {
                Intrinsics.checkNotNullParameter(saverScope, "<this>");
                return save.invoke(saverScope, original);
            }
        };
    }

    @NotNull
    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}
