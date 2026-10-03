package com.oplus.vfxsdk.common;

import android.util.Log;
import android.view.Choreographer;
import android.view.animation.PathInterpolator;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.dvk;
import com.oplus.aiunit.vision.t0a;
import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.TextEntity;
import com.oplus.wearable.linkservice.sdk.Node;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 S2\u00020\u0001:\u0005TUVWXB\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bQ\u0010RJ \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012J\u0014\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015J\u0014\u0010\u0018\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015J\u001a\u0010\u001a\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0019J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u001e\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0012R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R.\u00106\u001a\u001a\u0012\b\u0012\u000604R\u00020\u000003j\f\u0012\b\u0012\u000604R\u00020\u0000`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00100R\u0016\u0010;\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00100R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010>R\u0016\u0010H\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010>R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR \u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR&\u0010O\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Y"}, d2 = {"Lcom/oplus/vfxsdk/common/Animator;", "", "", "value", TextEntity.ELLIPSIZE_START, TextEntity.ELLIPSIZE_END, "clampValue", "", "reset", ClickApiEntity.TIME, "frameUpdate", "seekTo", "seekNext", "playTo", "restart", "play", "stop", "pause", "", ClickApiEntity.SPEED, "setSpeed", "Lkotlin/Function0;", "cb", "setAnimStartListener", "setAnimEndListener", "Lkotlin/Function1;", "setAnimUpdateListener", "", "isPlay", "isPause", "", "lineName", "", Node.I_KEY, "setAnimKeyValue", "Lcom/oplus/vfxsdk/common/AnimatorValue;", "data", "Lcom/oplus/vfxsdk/common/AnimatorValue;", "getData", "()Lcom/oplus/vfxsdk/common/AnimatorValue;", "Lcom/oplus/vfxsdk/common/Animator$AnimMode;", "mAnimMode", "Lcom/oplus/vfxsdk/common/Animator$AnimMode;", "getMAnimMode", "()Lcom/oplus/vfxsdk/common/Animator$AnimMode;", "setMAnimMode", "(Lcom/oplus/vfxsdk/common/Animator$AnimMode;)V", "mCurrTime", "D", "mStartTime", "mEndTime", "Ljava/util/ArrayList;", "Lcom/oplus/vfxsdk/common/Animator$a;", "Lkotlin/collections/ArrayList;", "mAnimLines", "Ljava/util/ArrayList;", "mAnimSpeed", "F", "mSyncPreTime", "mDirection", "I", "mPlayToDirty", "Z", "mPlayToTime", "Lcom/oplus/vfxsdk/common/Animator$AnimaStatus;", "mAnimStatus", "Lcom/oplus/vfxsdk/common/Animator$AnimaStatus;", "getMAnimStatus", "()Lcom/oplus/vfxsdk/common/Animator$AnimaStatus;", "setMAnimStatus", "(Lcom/oplus/vfxsdk/common/Animator$AnimaStatus;)V", "mAnimEndCb", "mAnimStatusChanged", "Lcom/oplus/vfxsdk/common/Animator$c;", "frameCb", "Lcom/oplus/vfxsdk/common/Animator$c;", "mAnimStartListener", "Lkotlin/jvm/functions/Function0;", "mAnimEndListener", "mAnimUpdateListener", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lcom/oplus/vfxsdk/common/AnimatorValue;)V", "Companion", "AnimMode", "AnimaStatus", "a", "b", "c", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final class Animator {

    @NotNull
    public static final String TAG = "Animator";

    @NotNull
    private final AnimatorValue data;

    @NotNull
    private final c frameCb;
    private boolean mAnimEndCb;

    @Nullable
    private Function0<Unit> mAnimEndListener;

    @NotNull
    private ArrayList<a> mAnimLines;

    @NotNull
    private AnimMode mAnimMode;
    private float mAnimSpeed;

    @Nullable
    private Function0<Unit> mAnimStartListener;

    @NotNull
    private AnimaStatus mAnimStatus;
    private boolean mAnimStatusChanged;

    @Nullable
    private Function1<? super Float, Unit> mAnimUpdateListener;
    private double mCurrTime;
    private int mDirection;
    private double mEndTime;
    private boolean mPlayToDirty;
    private double mPlayToTime;
    private double mStartTime;
    private double mSyncPreTime;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/vfxsdk/common/Animator$AnimMode;", "", "(Ljava/lang/String;I)V", "LOOP", "REVERSE_LOOP", "ONCE", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum AnimMode {
        LOOP,
        REVERSE_LOOP,
        ONCE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<AnimMode> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/oplus/vfxsdk/common/Animator$AnimaStatus;", "", "(Ljava/lang/String;I)V", "Play", "Pause", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum AnimaStatus {
        Play,
        Pause;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<AnimaStatus> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b/\u00100J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001d\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H\u0002R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\"\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\"\u0010(\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b'\u0010\u001eR\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c\"\u0004\b*\u0010\u001eR\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010-¨\u00061"}, d2 = {"Lcom/oplus/vfxsdk/common/Animator$a;", "", "", ClickApiEntity.TIME, "", "forceSeek", "", "f", "", "index", "", "value", "h", "", "bezier", "a", "([Ljava/lang/Float;)V", "e", "Lcom/oplus/vfxsdk/common/AnimLine;", "Lcom/oplus/vfxsdk/common/AnimLine;", "b", "()Lcom/oplus/vfxsdk/common/AnimLine;", "mAnimLine", "D", "mCurrentTime", "c", "F", "getMCurrentValue", "()F", "setMCurrentValue", "(F)V", "mCurrentValue", "", "d", "Ljava/lang/String;", "mName", "Lcom/oplus/aiunit/vision/t0a;", "Lcom/oplus/aiunit/vision/t0a;", "mUpdate", "setMStartTime", "mStartTime", "g", "setMEndTime", "mEndTime", "Lcom/oplus/vfxsdk/common/AnimKey;", "[Lcom/oplus/vfxsdk/common/AnimKey;", "mAnimKeys", "<init>", "(Lcom/oplus/vfxsdk/common/Animator;Lcom/oplus/vfxsdk/common/AnimLine;)V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\ncom/oplus/vfxsdk/common/Animator$AnimatorLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,352:1\n6143#2,2:353\n*S KotlinDebug\n*F\n+ 1 Animator.kt\ncom/oplus/vfxsdk/common/Animator$AnimatorLine\n*L\n37#1:353,2\n*E\n"})
    public final class a {

        @NotNull
        public final AnimLine a;
        public double b;
        public float c;

        @NotNull
        public String d;

        @Nullable
        public final t0a e;
        public float f;
        public float g;

        @NotNull
        public AnimKey[] h;
        public final /* synthetic */ Animator i;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Animator.kt\ncom/oplus/vfxsdk/common/Animator$AnimatorLine\n*L\n1#1,328:1\n37#2:329\n*E\n"})
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Float.valueOf(((AnimKey) t).getTime()), Float.valueOf(((AnimKey) t2).getTime()));
            }
        }

        public a(@NotNull Animator animator, AnimLine animLine) {
            Intrinsics.checkNotNullParameter(animLine, "mAnimLine");
            this.i = animator;
            this.a = animLine;
            this.d = animLine.getName();
            this.e = animLine.getUpdate();
            AnimKey[] animKeys = animLine.getAnimKeys();
            this.h = animKeys;
            if (animKeys.length > 1) {
                ArraysKt.sortWith(animKeys, new a());
            }
            this.f = ((AnimKey) ArraysKt.first(this.h)).getTime();
            this.g = ((AnimKey) ArraysKt.last(this.h)).getTime();
            this.c = ((AnimKey) ArraysKt.first(this.h)).getValue();
            Log.i(dvk.TAG, "Animator=>mStartTime " + this.f + ", mEndTime " + this.g);
        }

        public static /* synthetic */ void g(a aVar, double d, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            aVar.f(d, z);
        }

        public final void a(Float[] bezier) {
            int length = bezier.length;
            for (int i = 0; i < length; i++) {
                float fFloatValue = bezier[i].floatValue();
                float fFloatValue2 = vr3.UNSET;
                if (fFloatValue >= vr3.UNSET) {
                    fFloatValue2 = 1.0f;
                    if (bezier[i].floatValue() <= 1.0f) {
                        fFloatValue2 = bezier[i].floatValue();
                    }
                }
                bezier[i] = Float.valueOf(fFloatValue2);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AnimLine getA() {
            return this.a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getG() {
            return this.g;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getF() {
            return this.f;
        }

        public final void e() {
            int length = this.h.length;
            for (int i = 0; i < length; i++) {
                AnimKey animKey = this.h[i];
                if (this.b <= animKey.getTime()) {
                    if (i <= 0) {
                        this.c = animKey.getValue();
                    } else {
                        int i2 = i - 1;
                        float time = this.h[i2].getTime();
                        float value = this.h[i2].getValue();
                        float time2 = (float) ((this.b - ((double) time)) / ((double) (animKey.getTime() - time)));
                        Float[] bezier = this.h[i2].getBezier();
                        a(bezier);
                        this.c = value + (new PathInterpolator(bezier[0].floatValue(), bezier[1].floatValue(), bezier[2].floatValue(), bezier[3].floatValue()).getInterpolation(time2) * (animKey.getValue() - value));
                    }
                    t0a t0aVar = this.e;
                    if (t0aVar != null) {
                        t0aVar.a(this.d, Float.valueOf(this.c));
                        return;
                    }
                    return;
                }
                if (this.b > this.g) {
                    AnimKey animKey2 = (AnimKey) ArraysKt.last(this.h);
                    if (!(this.c == animKey2.getValue())) {
                        float value2 = animKey2.getValue();
                        this.c = value2;
                        t0a t0aVar2 = this.e;
                        if (t0aVar2 != null) {
                            t0aVar2.a(this.d, Float.valueOf(value2));
                        }
                    }
                }
            }
        }

        public final void f(double time, boolean forceSeek) {
            if (!(this.b == time) || forceSeek) {
                this.b = time;
                e();
            }
        }

        public final void h(int index, float value) {
            this.h[index].setValue(value);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/oplus/vfxsdk/common/Animator$c;", "Landroid/view/Choreographer$FrameCallback;", "", "frameTimeNanos", "", "doFrame", "Ljava/lang/ref/WeakReference;", "Lcom/oplus/vfxsdk/common/Animator;", "kotlin.jvm.PlatformType", "i", "Ljava/lang/ref/WeakReference;", "weakAnimator", "animator", "<init>", "(Lcom/oplus/vfxsdk/common/Animator;)V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class c implements Choreographer.FrameCallback {

        @NotNull
        public final WeakReference<Animator> i;

        public c(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.i = new WeakReference<>(animator);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            Animator animator = this.i.get();
            if (animator == null) {
                return;
            }
            animator.frameUpdate(frameTimeNanos / 1.0E9d);
            if (animator.isPlay()) {
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    public Animator(@NotNull AnimatorValue animatorValue) {
        Intrinsics.checkNotNullParameter(animatorValue, "data");
        this.data = animatorValue;
        this.mAnimMode = AnimMode.ONCE;
        this.mStartTime = Double.MAX_VALUE;
        this.mEndTime = Double.MIN_VALUE;
        this.mAnimLines = new ArrayList<>();
        this.mAnimSpeed = 1.0f;
        this.mSyncPreTime = -1.0d;
        this.mDirection = 1;
        this.mAnimStatus = AnimaStatus.Pause;
        for (AnimLine animLine : animatorValue.getAnimLines()) {
            if (!(animLine.getAnimKeys().length == 0)) {
                a aVar = new a(this, animLine);
                if (aVar.getF() < this.mStartTime) {
                    this.mStartTime = aVar.getF();
                }
                if (aVar.getG() > this.mEndTime) {
                    this.mEndTime = aVar.getG();
                }
                this.mAnimLines.add(aVar);
            }
        }
        this.mCurrTime = 0.0d;
        this.frameCb = new c(this);
    }

    private final double clampValue(double value, double start, double end) {
        if (value > end) {
            return end;
        }
        return value < start ? start : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void frameUpdate(double time) {
        Function1<? super Float, Unit> function1;
        if (this.mSyncPreTime < 0.0d) {
            this.mSyncPreTime = time;
        }
        if (time - this.mSyncPreTime > 0.1d) {
            this.mSyncPreTime = time;
        }
        AnimaStatus animaStatus = this.mAnimStatus;
        AnimaStatus animaStatus2 = AnimaStatus.Play;
        double d = animaStatus == animaStatus2 ? time - this.mSyncPreTime : 0.0d;
        int i = this.mDirection;
        if (i == 1) {
            this.mCurrTime += ((double) this.mAnimSpeed) * d;
        } else {
            this.mCurrTime -= ((double) this.mAnimSpeed) * d;
        }
        double d2 = this.mCurrTime;
        double d3 = this.mEndTime;
        if (d2 > d3 || d2 < 0.0d) {
            AnimMode animMode = this.mAnimMode;
            if (animMode == AnimMode.LOOP) {
                this.mCurrTime = 0.0d;
            } else if (animMode == AnimMode.REVERSE_LOOP) {
                this.mDirection = -i;
            } else if (animMode == AnimMode.ONCE) {
                this.mCurrTime = d2 > d3 ? d3 : 0.0d;
                this.mAnimStatus = AnimaStatus.Pause;
                this.mAnimEndCb = true;
            }
        }
        if (this.mPlayToDirty && Math.abs(this.mCurrTime - this.mPlayToTime) < d * ((double) this.mAnimSpeed) * 2.0d) {
            this.mPlayToDirty = false;
            this.mDirection = 1;
            this.mAnimStatus = AnimaStatus.Pause;
            this.mAnimEndCb = true;
        }
        if (this.mAnimStatusChanged && this.mAnimStatus == animaStatus2) {
            this.mAnimStatusChanged = false;
            Function0<Unit> function0 = this.mAnimStartListener;
            if (function0 != null) {
            }
        }
        for (a aVar : this.mAnimLines) {
            Intrinsics.checkNotNull(aVar);
            a.g(aVar, this.mCurrTime, false, 2, null);
        }
        if (this.mAnimStatus == AnimaStatus.Play && (function1 = this.mAnimUpdateListener) != null) {
        }
        this.mSyncPreTime = time;
        if (this.mAnimEndCb) {
            Function0<Unit> function2 = this.mAnimEndListener;
            if (function2 != null) {
            }
            this.mAnimEndCb = false;
        }
    }

    private final void reset() {
        this.mCurrTime = 0.0d;
        this.mDirection = 1;
        this.mPlayToDirty = false;
    }

    @NotNull
    public final AnimatorValue getData() {
        return this.data;
    }

    @NotNull
    public final AnimMode getMAnimMode() {
        return this.mAnimMode;
    }

    @NotNull
    public final AnimaStatus getMAnimStatus() {
        return this.mAnimStatus;
    }

    public final boolean isPause() {
        return this.mAnimStatus == AnimaStatus.Pause;
    }

    public final boolean isPlay() {
        return this.mAnimStatus == AnimaStatus.Play;
    }

    public final void pause() {
        this.mAnimStatus = AnimaStatus.Pause;
    }

    public final void play() {
        AnimaStatus animaStatus = this.mAnimStatus;
        AnimaStatus animaStatus2 = AnimaStatus.Play;
        if (animaStatus != animaStatus2) {
            Choreographer.getInstance().postFrameCallback(this.frameCb);
            this.mAnimStatusChanged = true;
        }
        this.mAnimStatus = animaStatus2;
    }

    public final void playTo(double time) {
        play();
        double dClampValue = clampValue(time, this.mStartTime, this.mEndTime);
        this.mDirection = this.mCurrTime < dClampValue ? 1 : -1;
        this.mPlayToDirty = true;
        this.mPlayToTime = dClampValue;
    }

    public final void restart() {
        play();
        reset();
    }

    public final void seekNext() {
        pause();
        double d = this.mCurrTime + 0.016666666666666666d;
        this.mCurrTime = d;
        if (d > this.mEndTime) {
            this.mCurrTime = 0.0d;
        }
        Iterator<a> it = this.mAnimLines.iterator();
        while (it.hasNext()) {
            it.next().f(this.mCurrTime, true);
        }
    }

    public final void seekTo(double time) {
        pause();
        this.mCurrTime = time;
        Iterator<a> it = this.mAnimLines.iterator();
        while (it.hasNext()) {
            it.next().f(time, true);
        }
    }

    public final void setAnimEndListener(@NotNull Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.mAnimEndListener = cb;
    }

    public final void setAnimKeyValue(@NotNull String lineName, int key, float value) {
        Intrinsics.checkNotNullParameter(lineName, "lineName");
        for (a aVar : this.mAnimLines) {
            if (Intrinsics.areEqual(aVar.getA().getName(), lineName)) {
                aVar.h(key, value);
            }
        }
    }

    public final void setAnimStartListener(@NotNull Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.mAnimStartListener = cb;
    }

    public final void setAnimUpdateListener(@NotNull Function1<? super Float, Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.mAnimUpdateListener = cb;
    }

    public final void setMAnimMode(@NotNull AnimMode animMode) {
        Intrinsics.checkNotNullParameter(animMode, "<set-?>");
        this.mAnimMode = animMode;
    }

    public final void setMAnimStatus(@NotNull AnimaStatus animaStatus) {
        Intrinsics.checkNotNullParameter(animaStatus, "<set-?>");
        this.mAnimStatus = animaStatus;
    }

    public final void setSpeed(float speed) {
        this.mAnimSpeed = speed;
    }

    public final void stop() {
        pause();
    }
}
