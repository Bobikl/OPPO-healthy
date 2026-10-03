package pantanal.app.groupcard.plugininterface;

import android.view.animation.Interpolator;
import com.oplus.aiunit.vision.alf;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0003$\n%B-\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lpantanal/app/groupcard/plugininterface/AnimAction;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lpantanal/app/groupcard/plugininterface/AnimAction$Target;", "a", "Lpantanal/app/groupcard/plugininterface/AnimAction$Target;", "getTarget", "()Lpantanal/app/groupcard/plugininterface/AnimAction$Target;", "target", "Lpantanal/app/groupcard/plugininterface/AnimAction$Action;", "b", "Lpantanal/app/groupcard/plugininterface/AnimAction$Action;", "getAction", "()Lpantanal/app/groupcard/plugininterface/AnimAction$Action;", "action", "", "c", "J", "getDuration", "()J", "duration", "Landroid/view/animation/Interpolator;", "d", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", ParserTag.TAG_INTERPOLATOR, "<init>", "(Lpantanal/app/groupcard/plugininterface/AnimAction$Target;Lpantanal/app/groupcard/plugininterface/AnimAction$Action;JLandroid/view/animation/Interpolator;)V", "Companion", "Action", "Target", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AnimAction {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final AnimAction f20788e;

    @NotNull
    public static final AnimAction f;

    @NotNull
    public static final AnimAction g;

    @NotNull
    public static final AnimAction h;

    @NotNull
    public static final AnimAction i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final AnimAction f20789j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Target target;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Action action;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long duration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Interpolator interpolator;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lpantanal/app/groupcard/plugininterface/AnimAction$Action;", "", "(Ljava/lang/String;I)V", alf.IN, "OUT", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Action {
        IN,
        OUT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lpantanal/app/groupcard/plugininterface/AnimAction$Target;", "", "(Ljava/lang/String;I)V", "BACKGROUND", "CONTENT", "MASK", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Target {
        BACKGROUND,
        CONTENT,
        MASK
    }

    static {
        Target target = Target.BACKGROUND;
        Action action = Action.IN;
        f20788e = new AnimAction(target, action, 0L, null, 12, null);
        Action action2 = Action.OUT;
        long j2 = 0;
        Interpolator interpolator = null;
        int i2 = 12;
        DefaultConstructorMarker defaultConstructorMarker = null;
        f = new AnimAction(target, action2, j2, interpolator, i2, defaultConstructorMarker);
        Target target2 = Target.CONTENT;
        g = new AnimAction(target2, action, j2, interpolator, i2, defaultConstructorMarker);
        h = new AnimAction(target2, action2, j2, interpolator, i2, defaultConstructorMarker);
        Target target3 = Target.MASK;
        i = new AnimAction(target3, action, j2, interpolator, i2, defaultConstructorMarker);
        f20789j = new AnimAction(target3, action2, j2, interpolator, i2, defaultConstructorMarker);
    }

    public AnimAction(@NotNull Target target, @NotNull Action action, long j2, @Nullable Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(action, "action");
        this.target = target;
        this.action = action;
        this.duration = j2;
        this.interpolator = interpolator;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimAction)) {
            return false;
        }
        AnimAction animAction = (AnimAction) other;
        return this.target == animAction.target && this.action == animAction.action && this.duration == animAction.duration && Intrinsics.areEqual(this.interpolator, animAction.interpolator);
    }

    public int hashCode() {
        int iHashCode = ((((this.target.hashCode() * 31) + this.action.hashCode()) * 31) + Long.hashCode(this.duration)) * 31;
        Interpolator interpolator = this.interpolator;
        return iHashCode + (interpolator == null ? 0 : interpolator.hashCode());
    }

    @NotNull
    public String toString() {
        return "AnimAction(target=" + this.target + ", action=" + this.action + ", duration=" + this.duration + ", interpolator=" + this.interpolator + ")";
    }

    public /* synthetic */ AnimAction(Target target, Action action, long j2, Interpolator interpolator, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(target, action, (i2 & 4) != 0 ? -1L : j2, (i2 & 8) != 0 ? null : interpolator);
    }
}
