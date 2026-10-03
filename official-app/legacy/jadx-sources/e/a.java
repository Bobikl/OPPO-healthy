package e;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.fqm;
import com.oplus.aiunit.vision.s9m;
import com.oplus.aiunit.vision.t9m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Le/a;", "Lcom/oplus/aiunit/vision/t9m;", ExifInterface.LONGITUDE_EAST, "", "Lcom/oplus/aiunit/vision/s9m;", "a", "Lkotlin/Lazy;", "()Lcom/oplus/aiunit/vision/s9m;", "cardEventPublisher", "Lcom/oplus/aiunit/vision/fqm;", "eventStore", "Lcom/oplus/aiunit/vision/fqm;", "b", "()Lcom/oplus/aiunit/vision/fqm;", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public abstract class a<E extends t9m> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy cardEventPublisher = LazyKt__LazyJVMKt.lazy(C1021a.a);

    /* JADX INFO: renamed from: e.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/t9m;", ExifInterface.LONGITUDE_EAST, "Lcom/oplus/aiunit/vision/s9m;", "a", "()Lcom/oplus/aiunit/vision/s9m;"}, k = 3, mv = {1, 8, 0})
    public static final class C1021a extends Lambda implements Function0<s9m<E>> {
        public static final C1021a a = new C1021a();

        public C1021a() {
            super(0);
        }

        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9m<E> invoke() {
            return new s9m<>();
        }
    }

    @NotNull
    public final s9m<E> a() {
        return (s9m) this.cardEventPublisher.getValue();
    }

    @Nullable
    public final fqm<E> b() {
        return null;
    }
}
