package coil.decode;

import com.oplus.aiunit.vision.b2n;
import java.io.Closeable;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\n\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcoil/decode/d;", "Ljava/io/Closeable;", "Lokio/BufferedSource;", b2n.f, "Lcoil/decode/d$a;", "a", "()Lcoil/decode/d$a;", "getMetadata$annotations", "()V", "metadata", "<init>", "Lcoil/decode/c;", "Lcoil/decode/f;", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public abstract class d implements Closeable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/decode/d$a;", "", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class a {
    }

    public d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract a a();

    @NotNull
    public abstract BufferedSource g();
}
