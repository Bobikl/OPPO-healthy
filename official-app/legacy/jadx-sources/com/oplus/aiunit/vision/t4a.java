package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.resposiveui.config.NearUIConfig;
import com.heytap.health.community.focus.ImageLink;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\"\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nJ$\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\f\u0010\u0011\u001a\u00020\u0007*\u00020\u0010H\u0002R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/t4a;", "", "Landroid/content/Context;", "context", "", "Lcom/heytap/health/community/focus/ImageLink;", "imgLink", "", "b", ParserTag.SPAN_COUNT, "Lcom/oplus/aiunit/vision/t4a$a;", "imageSize", "d", MapSchema.FIELD_NAME_ENTRY, "imageListSize", "c", "", "a", "Ljava/lang/Float;", "getDensity", "()Ljava/lang/Float;", "density", "<init>", "(Ljava/lang/Float;)V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageSizeControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSizeControl.kt\ncom/heytap/health/community/focus/view/ImageSizeControl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class t4a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Float density;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.t4a$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/t4a$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", UserInfo.SEX_FEMALE, "b", "()F", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "<init>", "(FF)V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Size {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final float width;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final float height;

        public Size(float f, float f2) {
            this.width = f;
            this.height = f2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getWidth() {
            return this.width;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return Float.compare(this.width, size.width) == 0 && Float.compare(this.height, size.height) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.width) * 31) + Float.hashCode(this.height);
        }

        @NotNull
        public String toString() {
            return "Size(width=" + this.width + ", height=" + this.height + ")";
        }
    }

    public t4a(@Nullable Float f) {
        this.density = f;
    }

    public final int a(float f) {
        Float f2 = this.density;
        if (f2 == null) {
            return ejg.a(op.n().p(), f);
        }
        f2.floatValue();
        return (int) ((f * this.density.floatValue()) + 0.5f);
    }

    public final int b(@NotNull Context context, @NotNull List<ImageLink> imgLink) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imgLink, "imgLink");
        if (com.heytap.health.base.resposiveui.config.a.m(context).q().getValue() == NearUIConfig.Status.UNFOLD) {
            return imgLink.size();
        }
        int size = imgLink.size();
        if (size != 1) {
            return size != 4 ? 3 : 2;
        }
        return 1;
    }

    public final Size c(Context context, int imageListSize) {
        return imageListSize == 1 ? new Size(ejg.a(context, 296.0f), ejg.a(context, 166.0f)) : new Size(ejg.a(context, 146.0f), ejg.a(context, 116.0f));
    }

    @NotNull
    public final Size d(@NotNull Context context, int spanCount, @Nullable Size imageSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        return com.heytap.health.base.resposiveui.config.a.m(context).q().getValue() == NearUIConfig.Status.UNFOLD ? c(context, spanCount) : e(context, spanCount, imageSize);
    }

    public final Size e(Context context, int spanCount, Size imageSize) {
        if (spanCount == 2) {
            return new Size(-1.0f, 0.75f);
        }
        if (spanCount == 3) {
            return new Size(-1.0f, -1.0f);
        }
        if (imageSize != null) {
            if (!(imageSize.getWidth() == imageSize.getHeight())) {
                return imageSize.getWidth() > imageSize.getHeight() ? new Size(a(154.0f), a(154.0f)) : new Size(a(154.0f), a(205.0f));
            }
        }
        return new Size(a(154.0f), a(154.0f));
    }

    public /* synthetic */ t4a(Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f);
    }
}
