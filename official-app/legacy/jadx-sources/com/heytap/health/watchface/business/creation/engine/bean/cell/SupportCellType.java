package com.heytap.health.watchface.business.creation.engine.bean.cell;

import com.heytap.health.watchface.business.creation.engine.bean.cell.times.NumberTimeCell;
import com.oplus.aiunit.vision.EditWidget;
import com.oplus.aiunit.vision.FgImageCell;
import com.oplus.aiunit.vision.ImageCell;
import com.oplus.aiunit.vision.MultiMediaCell;
import com.oplus.aiunit.vision.TextCell;
import com.oplus.aiunit.vision.wwk;
import com.oplus.aiunit.vision.zxf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/watchface/business/creation/engine/bean/cell/SupportCellType;", "", "", "category", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", "Companion", "a", "MultiMediaCellType", "VideoCoverCellType", "WidgetGroupCellType", "TextCellType", "ImageCellType", "NumberTimeCellType", "RotationTimeCellType", "FgImageCellType", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public enum SupportCellType {
    MultiMediaCellType("MultiMedia", MultiMediaCell.class),
    VideoCoverCellType("VideoCover", wwk.class),
    WidgetGroupCellType("EditWidget", EditWidget.class),
    TextCellType("Text", TextCell.class),
    ImageCellType("Image", ImageCell.class),
    NumberTimeCellType("NumberImage", NumberTimeCell.class),
    RotationTimeCellType("RotationImage", zxf.class),
    FgImageCellType("FrontImages", FgImageCell.class);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String category;

    @NotNull
    private final Class<?> clazz;

    /* JADX INFO: renamed from: com.heytap.health.watchface.business.creation.engine.bean.cell.SupportCellType$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/health/watchface/business/creation/engine/bean/cell/SupportCellType$a;", "", "", "category", "Ljava/lang/Class;", "a", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSupportCellType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportCellType.kt\ncom/heytap/health/watchface/business/creation/engine/bean/cell/SupportCellType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
        @JvmStatic
        @Nullable
        public final Class<?> a(@NotNull String category) {
            Intrinsics.checkNotNullParameter(category, "category");
            for (SupportCellType supportCellType : SupportCellType.values()) {
                if (Intrinsics.areEqual(supportCellType.getCategory(), category)) {
                    if (supportCellType != null) {
                        return supportCellType.getClazz();
                    }
                    return null;
                }
            }
            supportCellType = null;
            if (supportCellType != null) {
                return supportCellType.getClazz();
            }
            return null;
        }
    }

    SupportCellType(String str, Class cls) {
        this.category = str;
        this.clazz = cls;
    }

    @JvmStatic
    @Nullable
    public static final Class<?> getCellType(@NotNull String str) {
        return INSTANCE.a(str);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final Class<?> getClazz() {
        return this.clazz;
    }
}
