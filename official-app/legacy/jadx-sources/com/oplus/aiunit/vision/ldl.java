package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/ldl;", "", "Companion", "a", "b", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ldl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "WatchFacePacker";

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eJ2\u0010\u0016\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0002J\u0006\u0010\u001f\u001a\u00020\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010 R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010%R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/oplus/aiunit/vision/ldl$a;", "", "", TraceConstants.KEY_PKG_NAME, b2n.g, "versionName", "j", "previewPath", "i", "editPath", "c", "Lcom/oplus/aiunit/vision/hta;", "watchfaceName", MapSchema.FIELD_NAME_KEY, "", "", "map", "b", "", "src", "firstSrc", "fgSrc", "d", "Lcom/oplus/aiunit/vision/g9e;", "patch", b2n.f, "color", MapSchema.FIELD_NAME_ENTRY, "outputPath", "f", "Lcom/oplus/aiunit/vision/lrj;", "a", "Ljava/lang/String;", "templatePath", "Lcom/oplus/aiunit/vision/hta;", "Ljava/util/Map;", "widgetSlotMap", "Ljava/util/List;", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/g9e;", "<init>", "(Ljava/lang/String;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String templatePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public String pkgName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public String versionName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public String previewPath;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public String editPath;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public LangDesc watchfaceName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public Map<Integer, Integer> widgetSlotMap;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public String color;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public String outputPath;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public List<String> src;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public List<String> firstSrc;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public List<String> fgSrc;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public Patch patch;

        public a(@NotNull String templatePath) {
            Intrinsics.checkNotNullParameter(templatePath, "templatePath");
            this.templatePath = templatePath;
        }

        @NotNull
        public final lrj a() {
            String str = this.pkgName;
            Patch patch = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(TraceConstants.KEY_PKG_NAME);
                str = null;
            }
            String str2 = this.templatePath;
            String str3 = this.outputPath;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("outputPath");
                str3 = null;
            }
            lrj lrjVar = new lrj(str, str2, str3);
            LangDesc langDesc = this.watchfaceName;
            if (langDesc == null) {
                Intrinsics.throwUninitializedPropertyAccessException("watchfaceName");
                langDesc = null;
            }
            lrjVar.p(langDesc);
            String str4 = this.previewPath;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewPath");
                str4 = null;
            }
            lrjVar.m(str4);
            String str5 = this.editPath;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editPath");
                str5 = null;
            }
            lrjVar.f(str5);
            String str6 = this.color;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("color");
                str6 = null;
            }
            lrjVar.k(str6);
            String str7 = this.versionName;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("versionName");
                str7 = null;
            }
            lrjVar.o(str7);
            Map<Integer, Integer> map = this.widgetSlotMap;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetSlotMap");
                map = null;
            }
            lrjVar.e(map);
            List<String> list = this.src;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("src");
                list = null;
            }
            List<String> list2 = this.firstSrc;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("firstSrc");
                list2 = null;
            }
            List<String> list3 = this.fgSrc;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fgSrc");
                list3 = null;
            }
            lrjVar.j(list, list2, list3);
            Patch patch2 = this.patch;
            if (patch2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("patch");
            } else {
                patch = patch2;
            }
            lrjVar.l(patch);
            return lrjVar;
        }

        @NotNull
        public final a b(@NotNull Map<Integer, Integer> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.widgetSlotMap = map;
            return this;
        }

        @NotNull
        public final a c(@NotNull String editPath) {
            Intrinsics.checkNotNullParameter(editPath, "editPath");
            this.editPath = editPath;
            return this;
        }

        @NotNull
        public final a d(@NotNull List<String> src, @NotNull List<String> firstSrc, @Nullable List<String> fgSrc) {
            Intrinsics.checkNotNullParameter(src, "src");
            Intrinsics.checkNotNullParameter(firstSrc, "firstSrc");
            this.src = src;
            this.firstSrc = firstSrc;
            if (fgSrc == null) {
                fgSrc = new ArrayList<>();
            }
            this.fgSrc = fgSrc;
            return this;
        }

        @NotNull
        public final a e(@NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
            return this;
        }

        @NotNull
        public final a f(@NotNull String outputPath) {
            Intrinsics.checkNotNullParameter(outputPath, "outputPath");
            this.outputPath = outputPath;
            return this;
        }

        @NotNull
        public final a g(@NotNull Patch patch) {
            Intrinsics.checkNotNullParameter(patch, "patch");
            this.patch = patch;
            return this;
        }

        @NotNull
        public final a h(@NotNull String pkgName) {
            Intrinsics.checkNotNullParameter(pkgName, "pkgName");
            this.pkgName = pkgName;
            return this;
        }

        @NotNull
        public final a i(@NotNull String previewPath) {
            Intrinsics.checkNotNullParameter(previewPath, "previewPath");
            this.previewPath = previewPath;
            return this;
        }

        @NotNull
        public final a j(@NotNull String versionName) {
            Intrinsics.checkNotNullParameter(versionName, "versionName");
            this.versionName = versionName;
            return this;
        }

        @NotNull
        public final a k(@NotNull LangDesc watchfaceName) {
            Intrinsics.checkNotNullParameter(watchfaceName, "watchfaceName");
            this.watchfaceName = watchfaceName;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ldl$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ldl$b;", "", "", "templatePath", "Lcom/oplus/aiunit/vision/ldl$a;", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(@NotNull String templatePath) {
            Intrinsics.checkNotNullParameter(templatePath, "templatePath");
            return new a(templatePath);
        }
    }
}
