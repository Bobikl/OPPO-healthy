package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.heytap.health.watchface.business.creation.engine.bean.cell.SupportCellType;
import com.heytap.health.watchface.business.creation.engine.bean.cell.times.NumberTimeCell;
import com.heytap.health.watchface.business.creation.engine.compress.CompressType;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.TypeIntrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 J2\u00020\u0001:\u0001(B\u001f\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u0010F\u001a\u00020\u0002\u0012\u0006\u0010G\u001a\u00020\u0002¢\u0006\u0004\bH\u0010IJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fJ0\u0010\u0014\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aJ*\u0010\u001e\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0002J*\u0010 \u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0002J$\u0010#\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002J\u001e\u0010%\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010&\u001a\u00020\u0004H\u0002J\u0016\u0010(\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002J\"\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010*2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00100\u0010H\u0002R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b-\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00104R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010<R\u0016\u0010?\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u0016\u0010A\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010CR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00106R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00106R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010E¨\u0006K"}, d2 = {"Lcom/oplus/aiunit/vision/lrj;", "", "", "versionName", "", "o", "path", LogFieldKey.MESSAGE_KEY, "f", "Lcom/oplus/aiunit/vision/hta;", "watchfaceName", LogFieldKey.PROCESS_NAME_KEY, "", "", "map", MapSchema.FIELD_NAME_ENTRY, "", "src", "firstSrc", "fgSrc", "j", "Lcom/oplus/aiunit/vision/g9e;", "patch", LogFieldKey.LEVEL_KEY, "color", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/watchface/business/creation/engine/compress/CompressType;", "compressType", "c", "cells", "i", "Lcom/oplus/aiunit/vision/m7a;", b2n.g, "styleCells", "fgCellSrc", b2n.f, "styles", "n", "d", "source", "a", "list", "", "b", "Ljava/lang/String;", "getPkgName", "()Ljava/lang/String;", TraceConstants.KEY_PKG_NAME, "Lcom/oplus/aiunit/vision/efb;", "Lcom/oplus/aiunit/vision/efb;", "manifestConfig", "Lcom/oplus/aiunit/vision/o7a;", "Lcom/oplus/aiunit/vision/o7a;", "infosConfig", "Ljava/util/List;", "aodStyleCells", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "", "Ljava/util/Set;", "imageSources", "videoSources", "previewSource", "editPreviewSource", "newBasePkgFullPath", "Lcom/oplus/aiunit/vision/wrf;", "Lcom/oplus/aiunit/vision/wrf;", "resFileHelper", "Lcom/oplus/aiunit/vision/g9e;", "templatePath", "exportNewPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTemplateResModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemplateResModifier.kt\ncom/heytap/health/watchface/business/creation/engine/TemplateResModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,344:1\n1#2:345\n1855#3:346\n1855#3,2:347\n1856#3:349\n1855#3:350\n1855#3,2:351\n1856#3:353\n1855#3,2:354\n1855#3,2:356\n1855#3,2:358\n1855#3,2:360\n1855#3,2:362\n*S KotlinDebug\n*F\n+ 1 TemplateResModifier.kt\ncom/heytap/health/watchface/business/creation/engine/TemplateResModifier\n*L\n139#1:346\n141#1:347,2\n139#1:349\n155#1:350\n156#1:351,2\n155#1:353\n246#1:354,2\n273#1:356,2\n286#1:358,2\n309#1:360,2\n321#1:362,2\n*E\n"})
public final class lrj {

    @NotNull
    public static final String ATTRIBUTE_TIME = "TIME";

    @NotNull
    public static final String TAG = "TemplateResModifier";

    @NotNull
    public static final String TYPE_WIDGET = "widget";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String pkgName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public ManifestConfig manifestConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public InfosConfig infosConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<Object> styleCells;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Object> aodStyleCells;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public Gson gson;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Set<String> imageSources;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Set<String> videoSources;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String previewSource;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String editPreviewSource;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public String newBasePkgFullPath;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public wrf resFileHelper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public List<String> src;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<String> firstSrc;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public List<String> fgSrc;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Patch patch;

    public lrj(@NotNull String pkgName, @NotNull String templatePath, @NotNull String exportNewPath) {
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        Intrinsics.checkNotNullParameter(templatePath, "templatePath");
        Intrinsics.checkNotNullParameter(exportNewPath, "exportNewPath");
        this.pkgName = pkgName;
        this.gson = new Gson();
        this.imageSources = new LinkedHashSet();
        this.videoSources = new LinkedHashSet();
        this.previewSource = "";
        this.editPreviewSource = "";
        this.newBasePkgFullPath = "";
        String str = exportNewPath + "/" + pkgName;
        this.newBasePkgFullPath = str;
        nd7.INSTANCE.e(templatePath, str, false);
        xrf xrfVar = new xrf(this.newBasePkgFullPath);
        this.resFileHelper = xrfVar.getResFileHelper();
        this.manifestConfig = xrfVar.getManifestConfig();
        this.infosConfig = xrfVar.getInfosConfig();
        ManifestConfig manifestConfig = this.manifestConfig;
        manifestConfig.d(CollectionsKt__CollectionsKt.arrayListOf(b(manifestConfig.b())));
        ManifestConfig manifestConfig2 = this.manifestConfig;
        manifestConfig2.c(CollectionsKt__CollectionsKt.arrayListOf(b(manifestConfig2.a())));
        this.styleCells = this.manifestConfig.b().get(0);
        this.aodStyleCells = this.manifestConfig.a().get(0);
        ManifestConfig manifestConfig3 = this.manifestConfig;
        String strA = d3e.INSTANCE.a(pkgName);
        Intrinsics.checkNotNull(strA);
        manifestConfig3.e(strA);
        this.infosConfig.d(pkgName);
    }

    public final void a(List<String> source) {
        for (String str : source) {
            if (StringsKt__StringsJVMKt.endsWith$default(str, ".mp4", false, 2, null)) {
                this.videoSources.add(str);
            } else if (StringsKt__StringsJVMKt.endsWith$default(str, ".png", false, 2, null)) {
                this.imageSources.add(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Object> b(List<? extends List<? extends Object>> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list.get(0)) {
            ltl.a(TAG, "it " + obj);
            if (obj != null) {
                LinkedTreeMap linkedTreeMap = (LinkedTreeMap) obj;
                V v = linkedTreeMap.get("widget");
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.String");
                String str = (String) v;
                Class<?> clsA = SupportCellType.INSTANCE.a(str);
                if (clsA == null) {
                    throw new RuntimeException("Not find category and not support." + str);
                }
                Gson gson = this.gson;
                Object objFromJson = gson.fromJson(gson.toJson(linkedTreeMap), (Class<Object>) clsA);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(\n         …ategory\n                )");
                arrayList.add(objFromJson);
            }
        }
        return arrayList;
    }

    @NotNull
    public final String c(@NotNull CompressType compressType) throws Throwable {
        Intrinsics.checkNotNullParameter(compressType, "compressType");
        ltl.a(TAG, "export pkgName " + this.pkgName + " infosConfig.isPatch " + this.infosConfig.getIsPatch() + " patch " + this.infosConfig.getPatch());
        if (this.infosConfig.getIsPatch() == 1) {
            Patch patch = this.patch;
            Intrinsics.checkNotNull(patch);
            List<String> listA = patch.a();
            Intrinsics.checkNotNull(listA);
            a(listA);
        } else {
            d();
        }
        String strD = this.resFileHelper.d();
        String strH = this.resFileHelper.h();
        ArrayList<Pair> arrayList = new ArrayList();
        arrayList.add(new Pair(this.imageSources, strD));
        arrayList.add(new Pair(this.videoSources, strH));
        for (Pair pair : arrayList) {
            nd7.INSTANCE.f((Set) pair.getFirst(), (String) pair.getSecond());
        }
        nd7 nd7Var = nd7.INSTANCE;
        nd7Var.b(this.previewSource, strD, wrf.DEFAULT_PREVIEW_IMG_NAME);
        nd7Var.b(this.editPreviewSource, strD, wrf.DEFAULT_EDIT_IMG_NAME);
        ArrayList<Pair> arrayList2 = new ArrayList();
        arrayList2.add(new Pair(this.manifestConfig, "manifest.json"));
        arrayList2.add(new Pair(this.infosConfig, wrf.DEFAULT_INFO_RES_NAME));
        for (Pair pair2 : arrayList2) {
            nd7.INSTANCE.s(this.gson, pair2.getFirst(), this.resFileHelper.a(), (String) pair2.getSecond());
        }
        return (compressType == CompressType.ZIP ? new t7m() : new ae1()).a(this.resFileHelper);
    }

    public final void d() {
        this.infosConfig.e(0);
        List<String> list = this.src;
        Intrinsics.checkNotNull(list);
        a(list);
        Set<String> set = this.imageSources;
        List<String> list2 = this.firstSrc;
        Intrinsics.checkNotNull(list2);
        set.addAll(list2);
        List<String> list3 = this.fgSrc;
        if (list3 != null) {
            this.imageSources.addAll(list3);
        }
    }

    public final void e(@NotNull Map<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        ltl.a(TAG, "setWidgetToSlots map " + map + " ");
        i(this.styleCells, map);
        i(this.aodStyleCells, map);
        h(this.infosConfig.a(), map);
    }

    public final void f(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.editPreviewSource = path;
    }

    public final void g(List<? extends Object> styleCells, List<String> fgCellSrc) {
        Object next;
        Iterator<T> it = styleCells.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof FgImageCell));
        if (!(!fgCellSrc.isEmpty())) {
            if (next != null) {
                ((FgImageCell) next).d(CollectionsKt__CollectionsKt.emptyList());
                ltl.a(TAG, "setFgStyle cleared FrontImages src, no fg resource provided");
                return;
            }
            return;
        }
        if (next != null) {
            ((FgImageCell) next).d(fgCellSrc);
            return;
        }
        FgImageCell fgImageCell = new FgImageCell(CollectionsKt__CollectionsKt.emptyList());
        fgImageCell.d(fgCellSrc);
        Intrinsics.checkNotNull(styleCells, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
        TypeIntrinsics.asMutableList(styleCells).add(fgImageCell);
        ltl.a(TAG, "setFgStyle added new FrontImages cell with src=" + fgCellSrc);
    }

    public final void h(List<InfoStyles> cells, Map<Integer, Integer> map) {
        Iterator<T> it = cells.iterator();
        while (it.hasNext()) {
            for (ComplicationConfigs complicationConfigs : ((InfoStyles) it.next()).a()) {
                if (map.containsKey(Integer.valueOf(complicationConfigs.getProviderMode()))) {
                    Integer num = map.get(Integer.valueOf(complicationConfigs.getProviderMode()));
                    Intrinsics.checkNotNull(num);
                    complicationConfigs.c(num.intValue());
                    ltl.i(TAG, "setInfoStyleWidgets set id " + complicationConfigs.getProviderMode() + " -> providerId " + complicationConfigs.getProviderId());
                }
            }
        }
    }

    public final void i(List<? extends Object> cells, Map<Integer, Integer> map) {
        for (Object obj : cells) {
            if (obj instanceof EditWidget) {
                for (Widget widget : ((EditWidget) obj).d()) {
                    if (map.containsKey(Integer.valueOf(widget.getId()))) {
                        Integer num = map.get(Integer.valueOf(widget.getId()));
                        Intrinsics.checkNotNull(num);
                        widget.c(num.intValue());
                        ltl.i(TAG, "setInfoStyleWidgets set id " + widget.getId() + " -> providerId " + widget.getProviderId());
                    }
                }
            }
        }
    }

    public final void j(@NotNull List<String> src, @NotNull List<String> firstSrc, @NotNull List<String> fgSrc) {
        Object obj;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(firstSrc, "firstSrc");
        Intrinsics.checkNotNullParameter(fgSrc, "fgSrc");
        ltl.i(TAG, "src " + src + " firstSrc " + firstSrc);
        this.src = src;
        this.firstSrc = firstSrc;
        this.fgSrc = fgSrc;
        Iterator<T> it = src.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt__StringsJVMKt.endsWith$default((String) next, ".mp4", false, 2, null));
        this.infosConfig.g(next != null ? "9" : "1");
        Iterator<T> it2 = this.styleCells.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!(next2 instanceof MultiMediaCell));
        if (next2 == null) {
            ltl.i(TAG, "Normal mode style not found MultiMediaCell.");
            return;
        }
        MultiMediaCell multiMediaCell = (MultiMediaCell) next2;
        nd7 nd7Var = nd7.INSTANCE;
        multiMediaCell.d(nd7Var.l(src));
        List<String> listL = nd7Var.l(firstSrc);
        multiMediaCell.e(listL);
        List<String> listL2 = nd7Var.l(fgSrc);
        g(this.styleCells, listL2);
        g(this.aodStyleCells, listL2);
        for (Object obj2 : this.aodStyleCells) {
            if (obj2 instanceof wwk) {
                obj = obj2;
                break;
            }
        }
        if (obj == null) {
            ltl.i(TAG, "Aod Style not found VideoCoverCell.");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.heytap.health.watchface.business.creation.engine.bean.cell.VideoCoverCell");
        ((wwk) obj).d(listL);
    }

    public final void k(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        n(this.styleCells, color);
        n(this.aodStyleCells, color);
    }

    public final void l(@NotNull Patch patch) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        ltl.d(TAG, "setPatchSource patch " + patch);
        this.patch = patch;
        if (patch.a() == null || patch.b() == null) {
            this.infosConfig.e(0);
            return;
        }
        this.infosConfig.e(1);
        InfosConfig infosConfig = this.infosConfig;
        nd7 nd7Var = nd7.INSTANCE;
        List<String> listA = patch.a();
        Intrinsics.checkNotNull(listA);
        List<String> listL = nd7Var.l(listA);
        List<String> listB = patch.b();
        Intrinsics.checkNotNull(listB);
        infosConfig.f(new Patch(listL, nd7Var.l(listB)));
    }

    public final void m(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.previewSource = path;
    }

    public final void n(List<? extends Object> styles, String color) {
        for (Object obj : styles) {
            if (obj instanceof NumberTimeCell) {
                ((NumberTimeCell) obj).e(color);
            } else {
                if (obj instanceof ImageCell) {
                    ImageCell imageCell = (ImageCell) obj;
                    if (Intrinsics.areEqual(imageCell.getAttribute(), "TIME")) {
                        imageCell.e(color);
                    }
                }
                if (obj instanceof TextCell) {
                    TextCell textCell = (TextCell) obj;
                    if (Intrinsics.areEqual(textCell.getAttribute(), "TIME")) {
                        textCell.e(color);
                    }
                }
            }
        }
    }

    public final void o(@NotNull String versionName) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.infosConfig.i(versionName);
        this.infosConfig.h(d3e.INSTANCE.b(versionName));
    }

    public final void p(@NotNull LangDesc watchfaceName) {
        Intrinsics.checkNotNullParameter(watchfaceName, "watchfaceName");
        this.infosConfig.j(watchfaceName);
        this.manifestConfig.f(watchfaceName);
    }
}
