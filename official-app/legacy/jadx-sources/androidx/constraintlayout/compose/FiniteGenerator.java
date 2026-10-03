package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.channel.client.data.Action;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0010j\b\u0012\u0004\u0012\u00020\u0007`\u0011J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/constraintlayout/compose/FiniteGenerator;", "Landroidx/constraintlayout/compose/GeneratedValue;", "from", "", TypedValues.TransitionType.S_TO, "step", "prefix", "", "postfix", "(FFFLjava/lang/String;Ljava/lang/String;)V", "current", "initial", "max", Action.LIFE_CIRCLE_VALUE_STOP, "", "array", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FiniteGenerator implements GeneratedValue {
    private float current;
    private float initial;
    private float max;

    @NotNull
    private String postfix;

    @NotNull
    private String prefix;
    private float step;
    private boolean stop;

    public FiniteGenerator(float f, float f2, float f3, @NotNull String prefix, @NotNull String postfix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        this.step = f3;
        this.prefix = prefix;
        this.postfix = postfix;
        this.current = f;
        this.initial = f;
        this.max = f2;
    }

    @NotNull
    public final ArrayList<String> array() {
        ArrayList<String> arrayList = new ArrayList<>();
        float f = this.initial;
        int i = (int) f;
        int i2 = (int) f;
        int i3 = (int) this.max;
        if (i2 <= i3) {
            while (true) {
                int i4 = i2 + 1;
                arrayList.add(this.prefix + i + this.postfix);
                i += (int) this.step;
                if (i2 == i3) {
                    break;
                }
                i2 = i4;
            }
        }
        return arrayList;
    }

    @Override // androidx.constraintlayout.compose.GeneratedValue
    /* JADX INFO: renamed from: value */
    public float getValue() {
        float f = this.current;
        if (f >= this.max) {
            this.stop = true;
        }
        if (!this.stop) {
            this.current = f + this.step;
        }
        return this.current;
    }

    public /* synthetic */ FiniteGenerator(float f, float f2, float f3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i & 4) != 0 ? 1.0f : f3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2);
    }
}
