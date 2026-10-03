package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcoil/target/ImageViewTarget;", "Lcoil/target/GenericViewTarget;", "Landroid/widget/ImageView;", "", "other", "", "equals", "", "hashCode", "j", "Landroid/widget/ImageView;", b2n.g, "()Landroid/widget/ImageView;", "view", "Landroid/graphics/drawable/Drawable;", "value", "d", "()Landroid/graphics/drawable/Drawable;", MapSchema.FIELD_NAME_ENTRY, "(Landroid/graphics/drawable/Drawable;)V", ResourcesUtil.ResourceType.DRAWABLE, "<init>", "(Landroid/widget/ImageView;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageView view;

    public ImageViewTarget(@NotNull ImageView imageView) {
        this.view = imageView;
    }

    @Override // coil.target.GenericViewTarget, com.oplus.aiunit.vision.rak
    @Nullable
    public Drawable d() {
        return getView().getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public void e(@Nullable Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageViewTarget) && Intrinsics.areEqual(getView(), ((ImageViewTarget) other).getView());
    }

    @Override // com.oplus.aiunit.vision.d1l
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public ImageView getView() {
        return this.view;
    }

    public int hashCode() {
        return getView().hashCode();
    }
}
