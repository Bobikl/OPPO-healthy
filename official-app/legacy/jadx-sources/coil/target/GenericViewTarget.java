package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.d1l;
import com.oplus.aiunit.vision.rak;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0004J\b\u0010\u0014\u001a\u00020\bH\u0004R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcoil/target/GenericViewTarget;", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/d1l;", "Lcom/oplus/aiunit/vision/rak;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "b", "error", "c", "result", "a", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "onStop", ResourcesUtil.ResourceType.DRAWABLE, b2n.f, "f", "", "i", "Z", "isStarted", "d", "()Landroid/graphics/drawable/Drawable;", MapSchema.FIELD_NAME_ENTRY, "(Landroid/graphics/drawable/Drawable;)V", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public abstract class GenericViewTarget<T extends View> implements d1l<T>, rak, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isStarted;

    @Override // com.oplus.aiunit.vision.coj
    public void a(@NotNull Drawable result) {
        g(result);
    }

    @Override // com.oplus.aiunit.vision.coj
    public void b(@Nullable Drawable placeholder) {
        g(placeholder);
    }

    @Override // com.oplus.aiunit.vision.coj
    public void c(@Nullable Drawable error) {
        g(error);
    }

    @Override // com.oplus.aiunit.vision.rak
    @Nullable
    public abstract Drawable d();

    public abstract void e(@Nullable Drawable drawable);

    public final void f() {
        Object objD = d();
        Animatable animatable = objD instanceof Animatable ? (Animatable) objD : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void g(@Nullable Drawable drawable) {
        Object objD = d();
        Animatable animatable = objD instanceof Animatable ? (Animatable) objD : null;
        if (animatable != null) {
            animatable.stop();
        }
        e(drawable);
        f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner owner) {
        this.isStarted = true;
        f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        this.isStarted = false;
        f();
    }
}
