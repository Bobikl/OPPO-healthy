package com.oplus.aiunit.vision;

import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0011\u000fB\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004J<\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\u0016\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002R(\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/lmd;", "", "", "key", "Ljava/lang/Class;", "Lcom/oplus/aiunit/vision/tmd;", "clazz", "", "c", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "directive", "", "directives", "originData", "b", "", "a", "Ljava/util/Map;", "map", "<init>", "()V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class lmd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final lmd b = b.INSTANCE.a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Class<?>> map;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.lmd$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/lmd$a;", "", "Lcom/oplus/aiunit/vision/lmd;", "instance", "Lcom/oplus/aiunit/vision/lmd;", "a", "()Lcom/oplus/aiunit/vision/lmd;", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final lmd a() {
            return lmd.b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/lmd$b;", "", "Lcom/oplus/aiunit/vision/lmd;", "a", "Lcom/oplus/aiunit/vision/lmd;", "()Lcom/oplus/aiunit/vision/lmd;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        @NotNull
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final lmd holder = new lmd(null);

        @NotNull
        public final lmd a() {
            return holder;
        }
    }

    public /* synthetic */ lmd(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[Catch: InstantiationException -> 0x0034, IllegalAccessException -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, blocks: (B:4:0x0011, B:6:0x0019, B:23:0x003a, B:25:0x0042, B:31:0x0058), top: B:43:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x005f A[Catch: InstantiationException -> 0x0069, IllegalAccessException -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IllegalAccessException -> 0x006c, InstantiationException -> 0x0069, blocks: (B:10:0x0024, B:16:0x0030, B:13:0x002a, B:28:0x004c, B:33:0x005f), top: B:45:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.oplus.aiunit.vision.tmd] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.oplus.aiunit.vision.tmd] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.oplus.aiunit.vision.tmd] */
    @Nullable
    public final tmd b(@Nullable Directive<? extends DirectivePayload> directive, @Nullable List<? extends Directive<? extends DirectivePayload>> directives, @Nullable String originData) {
        bmd bmdVar;
        tmd tmdVar;
        i55 i55Var;
        tmd tmdVar2;
        Class<?> cls = this.map.get(bnd.INSTANCE.a(directive));
        ?? r0 = 0;
        r0 = 0;
        try {
            if (cls != null) {
                try {
                    if (bmd.class.isAssignableFrom(cls)) {
                        bmdVar = (bmd) cls.newInstance();
                        if (directive != null) {
                            if (bmdVar != null) {
                                bmdVar.setDirective(directive);
                            }
                            if (bmdVar != null) {
                                bmdVar.setOrigin(originData);
                            }
                            if (bmdVar == null) {
                                tmdVar = bmdVar;
                            } else {
                                bmdVar.setDirectiveGroup(directives);
                                tmdVar = bmdVar;
                            }
                        }
                    } else if (cls == null && tmd.class.isAssignableFrom(cls)) {
                        tmdVar2 = (tmd) cls.newInstance();
                        if (directive != null && tmdVar2 != null) {
                            tmdVar2.setDirective(directive);
                            tmdVar2.setOrigin(originData);
                            tmdVar2.setDirectiveGroup(directives);
                            tmdVar = tmdVar2;
                        }
                    } else {
                        if (cls != null) {
                            return null;
                        }
                        i55Var = new i55();
                        if (directive != null) {
                            tmdVar = i55Var;
                            i55Var.setDirective(directive);
                            i55Var.setOrigin(originData);
                            i55Var.setDirectiveGroup(directives);
                            tmdVar = i55Var;
                        }
                    }
                } catch (IllegalAccessException e2) {
                    e = e2;
                    e.printStackTrace();
                    return r0;
                } catch (InstantiationException e3) {
                    e = e3;
                    e.printStackTrace();
                    return r0;
                }
            } else if (cls == null) {
                if (cls != null) {
                    return null;
                }
                i55Var = new i55();
                if (directive != null) {
                    tmdVar = i55Var;
                    i55Var.setDirective(directive);
                    i55Var.setOrigin(originData);
                    i55Var.setDirectiveGroup(directives);
                    tmdVar = i55Var;
                }
            } else {
                if (cls != null) {
                    return null;
                }
                i55Var = new i55();
                if (directive != null) {
                    tmdVar = i55Var;
                    i55Var.setDirective(directive);
                    i55Var.setOrigin(originData);
                    i55Var.setDirectiveGroup(directives);
                    tmdVar = i55Var;
                }
            }
            tmdVar = bmdVar;
            tmdVar = i55Var;
            tmdVar = tmdVar2;
            tmdVar = tmdVar2;
            r0 = tmdVar;
            return r0;
        } catch (IllegalAccessException e4) {
            e = e4;
            r0 = cls;
        } catch (InstantiationException e5) {
            e = e5;
            r0 = cls;
        }
    }

    public final void c(@NotNull String key, @NotNull Class<? extends tmd> clazz) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.map.put(key, clazz);
    }

    public lmd() {
        this.map = new LinkedHashMap();
    }
}
