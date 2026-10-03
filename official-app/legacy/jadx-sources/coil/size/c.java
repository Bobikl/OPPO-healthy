package coil.size;

import androidx.annotation.Px;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcoil/size/c;", "", "<init>", "()V", "a", "b", "Lcoil/size/c$a;", "Lcoil/size/c$b;", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public abstract class c {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcoil/size/c$a;", "Lcoil/size/c;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", "px", "<init>", "(I)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nDimension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dimension.kt\ncoil/size/Dimension$Pixels\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        public final int px;

        public a(@Px int i) {
            super(null);
            this.px = i;
            if (!(i > 0)) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.px == ((a) other).px;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public int getPx() {
            return this.px;
        }

        @NotNull
        public String toString() {
            return String.valueOf(this.px);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcoil/size/c$b;", "Lcoil/size/c;", "", "toString", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class b extends c {

        @NotNull
        public static final b INSTANCE = new b();

        public b() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
