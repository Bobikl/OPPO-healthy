package androidx.constraintlayout.compose;

import com.oplus.channel.client.data.Action;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/constraintlayout/compose/Generator;", "Landroidx/constraintlayout/compose/GeneratedValue;", "start", "", "incrementBy", "(FF)V", "current", Action.LIFE_CIRCLE_VALUE_STOP, "", "value", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Generator implements GeneratedValue {
    private float current;
    private float incrementBy;
    private boolean stop;

    public Generator(float f, float f2) {
        this.incrementBy = f2;
        this.current = f;
    }

    @Override // androidx.constraintlayout.compose.GeneratedValue
    /* JADX INFO: renamed from: value */
    public float getValue() {
        if (!this.stop) {
            this.current += this.incrementBy;
        }
        return this.current;
    }
}
