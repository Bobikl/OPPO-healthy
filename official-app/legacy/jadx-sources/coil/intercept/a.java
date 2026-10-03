package coil.intercept;

import coil.size.Size;
import com.oplus.aiunit.vision.m4a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcoil/intercept/a;", "", "Lcoil/intercept/a$a;", "chain", "Lcom/oplus/aiunit/vision/m4a;", "a", "(Lcoil/intercept/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public interface a {

    /* JADX INFO: renamed from: coil.intercept.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcoil/intercept/a$a;", "", "Lcoil/request/a;", "getRequest", "()Lcoil/request/a;", "request", "Lcoil/size/e;", "getSize", "()Lcoil/size/e;", "size", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public interface InterfaceC0135a {
        @NotNull
        coil.request.a getRequest();

        @NotNull
        Size getSize();
    }

    @Nullable
    Object a(@NotNull InterfaceC0135a interfaceC0135a, @NotNull Continuation<? super m4a> continuation);
}
