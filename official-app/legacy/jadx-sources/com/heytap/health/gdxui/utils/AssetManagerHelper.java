package com.heytap.health.gdxui.utils;

import androidx.exifinterface.media.ExifInterface;
import com.badlogic.gdx.graphics.Texture;
import com.oplus.aiunit.vision.di0;
import com.oplus.aiunit.vision.ptj;
import com.oplus.aiunit.vision.vtj;
import com.oplus.aiunit.vision.xtj;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u001d\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0004R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/gdxui/utils/AssetManagerHelper;", "", "", "path", "", "a", "b", "f", ExifInterface.GPS_DIRECTION_TRUE, "d", "(Ljava/lang/String;)Ljava/lang/Object;", "name", "Lcom/heytap/health/gdxui/utils/AssetManagerHelper$b;", MapSchema.FIELD_NAME_ENTRY, "c", "Lcom/oplus/aiunit/vision/di0;", "Lcom/oplus/aiunit/vision/di0;", "getManager", "()Lcom/oplus/aiunit/vision/di0;", "manager", "<init>", "()V", "Companion", "gdx_ui_release"}, k = 1, mv = {1, 8, 0})
public final class AssetManagerHelper {
    public static final int PER_FRAME_LOAD_MILLI = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final di0 manager = new di0();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/gdxui/utils/AssetManagerHelper$b;", "", "Lcom/oplus/aiunit/vision/xtj;", "a", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getGetter", "()Lkotlin/jvm/functions/Function0;", "getter", "b", "Lcom/oplus/aiunit/vision/xtj;", "cache", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "gdx_ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Function0<xtj> getter;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public xtj cache;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Function0<? extends xtj> getter) {
            Intrinsics.checkNotNullParameter(getter, "getter");
            this.getter = getter;
        }

        @Nullable
        public final xtj a() {
            if (this.cache == null) {
                this.cache = this.getter.invoke();
            }
            return this.cache;
        }
    }

    public final void a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        vtj.b bVar = new vtj.b();
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
        bVar.f = textureFilter;
        bVar.g = textureFilter;
        this.manager.E(path, Texture.class, bVar);
    }

    public final void b(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.manager.D(path, ptj.class);
    }

    public final void c() {
        this.manager.dispose();
    }

    @Nullable
    public final <T> T d(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return (T) this.manager.s(path, false);
    }

    @NotNull
    public final b e(@NotNull final String path, @NotNull final String name) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        return new b(new Function0<xtj>() { // from class: com.heytap.health.gdxui.utils.AssetManagerHelper$getFromTextureAtlas$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final xtj invoke() {
                ptj ptjVar = (ptj) this.this$0.d(path);
                if (ptjVar != null) {
                    return ptjVar.i(name);
                }
                return null;
            }
        });
    }

    public final void f() {
        this.manager.M(2);
    }
}
