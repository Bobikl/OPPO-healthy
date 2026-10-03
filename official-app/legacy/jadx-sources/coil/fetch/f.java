package coil.fetch;

import androidx.exifinterface.media.ExifInterface;
import coil.ImageLoader;
import com.oplus.aiunit.vision.frd;
import com.oplus.aiunit.vision.p97;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0003J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcoil/fetch/f;", "", "Lcom/oplus/aiunit/vision/p97;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public interface f {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcoil/fetch/f$a;", "", ExifInterface.GPS_DIRECTION_TRUE, "data", "Lcom/oplus/aiunit/vision/frd;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/fetch/f;", "a", "(Ljava/lang/Object;Lcom/oplus/aiunit/vision/frd;Lcoil/ImageLoader;)Lcoil/fetch/f;", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public interface a<T> {
        @Nullable
        f a(@NotNull T data, @NotNull frd options, @NotNull ImageLoader imageLoader);
    }

    @Nullable
    Object a(@NotNull Continuation<? super p97> continuation);
}
