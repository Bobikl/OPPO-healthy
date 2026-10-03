package com.coui.appcompat.searchhistory;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ViewGroupKt;
import com.coui.appcompat.chip.COUIChip;
import com.coui.appcompat.searchhistory.COUIFlowLayout;
import com.google.android.material.R;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.gg2;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.chip.R$style;
import com.support.searchhistory.R$drawable;
import com.support.searchhistory.R$layout;
import com.support.searchhistory.R$styleable;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u0086\u00012\u00020\u0001:\u0007\u0087\u0001(\u0088\u0001\u0089\u0001B7\b\u0007\u0012\u0006\u0010\u007f\u001a\u00020~\u0012\f\b\u0002\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001\u0012\t\b\u0002\u0010\u0082\u0001\u001a\u00020\f\u0012\t\b\u0002\u0010\u0083\u0001\u001a\u00020\f¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\u0002*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0003J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\fH\u0002J\u0016\u0010!\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\u0002H\u0014J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0014J0\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0014J \u0010/\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0014J\u0014\u00102\u001a\u00020\u00022\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001eJ\u0006\u00103\u001a\u00020\u0002J\u000e\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u000204J\u000e\u00109\u001a\u00020\u00022\u0006\u00108\u001a\u000207J\u000e\u0010:\u001a\u00020\u00022\u0006\u00108\u001a\u000207R\"\u0010A\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010D\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\"\u0010J\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010M\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010<\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\"\u0010P\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010<\u001a\u0004\bN\u0010>\"\u0004\bO\u0010@R*\u0010Q\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010E\u001a\u0004\bQ\u0010G\"\u0004\bR\u0010IR0\u0010W\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002000Sj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000200`T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010]R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010_R\u0016\u0010a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010`R\u0016\u0010b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010`R\u0016\u0010f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010<R\u0016\u0010h\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010<R\u0016\u0010j\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010iR\u0016\u0010k\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010iR\u0018\u0010n\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010mR\u0014\u0010r\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010qR\u0014\u0010v\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010>R\u0014\u0010x\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010>R\u0017\u0010{\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8F¢\u0006\u0006\u001a\u0004\b|\u0010z¨\u0006\u008a\u0001"}, d2 = {"Lcom/coui/appcompat/searchhistory/COUIFlowLayout;", "Landroid/view/ViewGroup;", "", LogFieldKey.LEVEL_KEY, "", "x", "A", "C", "Landroid/view/View;", "", "alpha", c8l.KEY_B, "", "value", "j", "Lcom/coui/appcompat/searchhistory/COUIPressFeedbackImageView;", "getExpandButton", "getFoldButton", "n", "q", "setHiddenViewsAlpha", "setVisibleViewsAlpha", "widthMeasureSpec", "heightMeasureSpec", "t", "s", "getBaseExpandButton", "y", "getExpandedStateHeight", "getFoldedStateHeight", "", "Lcom/coui/appcompat/searchhistory/COUIFlowLayout$c;", "lines", MapSchema.FIELD_NAME_KEY, "Lcom/coui/appcompat/chip/COUIChip;", "getChip", "onDetachedFromWindow", "onMeasure", "changed", "r", "b", "onLayout", "Landroid/graphics/Canvas;", "canvas", "child", "", "drawingTime", "drawChild", "Lcom/coui/appcompat/searchhistory/COUIFlowLayout$b;", "items", "setItems", LogFieldKey.MESSAGE_KEY, "Lcom/coui/appcompat/searchhistory/COUIFlowLayout$d;", "onItemClickListener", "setOnItemClickListener", "Landroid/view/View$OnClickListener;", "clickListener", "setExpandOnClickListener", "setFoldOnClickListener", "i", "I", "getItemSpacing", "()I", "setItemSpacing", "(I)V", "itemSpacing", "getLineSpacing", "setLineSpacing", "lineSpacing", "Z", "getExpandable", "()Z", "setExpandable", "(Z)V", "expandable", "getMaxRowFolded", "setMaxRowFolded", "maxRowFolded", "getMaxRowUnfolded", "setMaxRowUnfolded", "maxRowUnfolded", "isExpand", "setExpand", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "o", "Ljava/util/LinkedHashMap;", "itemCache", "", LogFieldKey.PROCESS_NAME_KEY, "Ljava/util/List;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Landroid/animation/ValueAnimator;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "runningAnimators", "Lcom/coui/appcompat/searchhistory/COUIFlowLayout$d;", "Landroid/view/View;", "expandButton", "foldButton", "u", "foldLineRemovedChip", "v", "expandedStateHeight", "w", "foldedStateHeight", UserInfo.SEX_FEMALE, "tempHiddenViewsAlphaFlg", "tempVisibleViewsAlphaFlg", "z", "Landroid/view/View$OnClickListener;", "expandOnClickListener", "foldOnClickListener", "getFoldButtonAlpha", "()F", "foldButtonAlpha", "getExpandButtonAlpha", "expandButtonAlpha", "getMaxRow", "maxRow", "getContainerLayoutHeight", "containerLayoutHeight", "getHiddenChips", "()Ljava/util/List;", "hiddenChips", "getVisibleChips", "visibleChips", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "a", "c", "d", "coui-support-searchhistory_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCOUIFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COUIFlowLayout.kt\ncom/coui/appcompat/searchhistory/COUIFlowLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,849:1\n777#2:850\n788#2:851\n1864#2,2:852\n789#2,2:854\n1866#2:856\n791#2:857\n1360#2:858\n1446#2,5:859\n766#2:864\n857#2,2:865\n1360#2:867\n1446#2,5:868\n766#2:873\n857#2,2:874\n1747#2,3:876\n1855#2,2:879\n1855#2,2:881\n1855#2,2:885\n1549#2:889\n1620#2,3:890\n1855#2,2:928\n1855#2,2:930\n777#2:932\n788#2:933\n1864#2,2:934\n789#2,2:936\n1866#2:938\n791#2:939\n275#3,2:883\n252#3:896\n1295#4,2:887\n1295#4:895\n1296#4:897\n215#5,2:893\n42#6:898\n94#6,14:899\n31#6:913\n94#6,14:914\n1#7:940\n*S KotlinDebug\n*F\n+ 1 COUIFlowLayout.kt\ncom/coui/appcompat/searchhistory/COUIFlowLayout\n*L\n98#1:850\n98#1:851\n98#1:852,2\n98#1:854,2\n98#1:856\n98#1:857\n99#1:858\n99#1:859,5\n99#1:864\n99#1:865,2\n105#1:867\n105#1:868,5\n105#1:873\n105#1:874,2\n236#1:876,3\n287#1:879,2\n288#1:881,2\n311#1:885,2\n337#1:889\n337#1:890,3\n504#1:928,2\n513#1:930,2\n661#1:932\n661#1:933\n661#1:934,2\n661#1:936,2\n661#1:938\n661#1:939\n296#1:883,2\n368#1:896\n319#1:887,2\n367#1:895\n367#1:897\n342#1:893,2\n452#1:898\n452#1:899,14\n491#1:913\n491#1:914,14\n*E\n"})
public class COUIFlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener foldOnClickListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int itemSpacing;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int lineSpacing;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean expandable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int maxRowFolded;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int maxRowUnfolded;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isExpand;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashMap<Integer, b> itemCache;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final List<c> lines;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentLinkedQueue<ValueAnimator> runningAnimators;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public d onItemClickListener;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public View expandButton;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public View foldButton;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public View foldLineRemovedChip;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int expandedStateHeight;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public int foldedStateHeight;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public float tempHiddenViewsAlphaFlg;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public float tempVisibleViewsAlphaFlg;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener expandOnClickListener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/coui/appcompat/searchhistory/COUIFlowLayout$b;", "", "", "getContent", "coui-support-searchhistory_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        @NotNull
        String getContent();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0017\u0010\u001d\"\u0004\b!\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/coui/appcompat/searchhistory/COUIFlowLayout$c;", "", "Landroid/view/View;", "view", "", "a", b2n.f, "", "b", "", "offsetLeft", "offsetTop", ParserTag.TAG_MAX_HEIGHT, "isRtl", MapSchema.FIELD_NAME_ENTRY, y04.TIME_STYLE_LEFT_DIR_NAME, "top", "bottom", "f", "I", ParserTag.TAG_MAX_WIDTH, "horizontalSpace", "", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "views", "getUsedWidth", "()I", "setUsedWidth", "(I)V", "usedWidth", "setHeight", Fields.HEIGHT_FIELD, "Landroid/view/View;", "getRemovedView", "()Landroid/view/View;", b2n.g, "(Landroid/view/View;)V", "removedView", "<init>", "(II)V", "coui-support-searchhistory_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCOUIFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COUIFlowLayout.kt\ncom/coui/appcompat/searchhistory/COUIFlowLayout$Line\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,849:1\n1855#2,2:850\n*S KotlinDebug\n*F\n+ 1 COUIFlowLayout.kt\ncom/coui/appcompat/searchhistory/COUIFlowLayout$Line\n*L\n754#1:850,2\n*E\n"})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int maxWidth;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int horizontalSpace;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<View> views = new ArrayList();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int usedWidth;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int height;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public View removedView;

        public c(int i, int i2) {
            this.maxWidth = i;
            this.horizontalSpace = i2;
        }

        public final void a(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            int size = this.views.size();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (size == 0) {
                this.usedWidth = Math.min(measuredWidth, this.maxWidth);
                this.height = measuredHeight;
            } else {
                this.usedWidth += measuredWidth + this.horizontalSpace;
                this.height = Integer.max(measuredHeight, this.height);
            }
            this.views.add(view);
        }

        public final boolean b(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.views.size() == 0) {
                return true;
            }
            return (this.usedWidth + this.horizontalSpace) + view.getMeasuredWidth() <= this.maxWidth;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final List<View> d() {
            return this.views;
        }

        public final void e(int offsetLeft, int offsetTop, int maxHeight, boolean isRtl) {
            for (View view : this.views) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(offsetTop, maxHeight);
                int i = offsetLeft + measuredWidth;
                int iCoerceAtMost2 = RangesKt___RangesKt.coerceAtMost(measuredHeight + iCoerceAtMost, maxHeight);
                if (isRtl) {
                    int i2 = this.maxWidth;
                    view.layout(i2 - i, iCoerceAtMost, i2 - offsetLeft, iCoerceAtMost2);
                } else {
                    view.layout(offsetLeft, iCoerceAtMost, i, iCoerceAtMost2);
                }
                if (view instanceof ImageView) {
                    f(offsetLeft, iCoerceAtMost, iCoerceAtMost2);
                }
                offsetLeft += measuredWidth + this.horizontalSpace;
            }
        }

        public final void f(int left, int top, int bottom) {
            View view = this.removedView;
            if (view != null) {
                view.layout(left, top, view.getMeasuredWidth() + left, bottom);
            }
        }

        public final void g(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.views.size() != 0 && this.views.contains(view)) {
                this.usedWidth -= view.getMeasuredWidth() + this.horizontalSpace;
                this.views.remove(view);
            }
        }

        public final void h(@Nullable View view) {
            this.removedView = view;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/coui/appcompat/searchhistory/COUIFlowLayout$d;", "", "Lcom/coui/appcompat/searchhistory/COUIFlowLayout$b;", "item", "", "a", "coui-support-searchhistory_release"}, k = 1, mv = {1, 8, 0})
    public interface d {
        void a(@NotNull b item);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_CANCEL, ParserTag.TAG_ON_ANIMATION_START, "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnStart$$inlined$addListener$default$1"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 COUIFlowLayout.kt\ncom/coui/appcompat/searchhistory/COUIFlowLayout\n*L\n1#1,127:1\n98#2:128\n95#3:129\n97#4:130\n453#5,2:131\n*E\n"})
    public static final class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            COUIFlowLayout.this.setExpand(true);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_CANCEL, ParserTag.TAG_ON_ANIMATION_START, "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 COUIFlowLayout.kt\ncom/coui/appcompat/searchhistory/COUIFlowLayout\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,127:1\n98#2:128\n492#3,2:129\n97#4:131\n96#5:132\n*E\n"})
    public static final class f implements Animator.AnimatorListener {
        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            COUIFlowLayout.this.setExpand(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUIFlowLayout(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @SuppressLint({"ClickableViewAccessibility", "CustomViewStyleable"})
    private final COUIPressFeedbackImageView getBaseExpandButton() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        COUIPressFeedbackImageView cOUIPressFeedbackImageView = new COUIPressFeedbackImageView(context);
        cOUIPressFeedbackImageView.setScaleType(ImageView.ScaleType.CENTER);
        TypedArray typedArrayObtainStyledAttributes = cOUIPressFeedbackImageView.getContext().obtainStyledAttributes(R$style.Widget_COUI_Chip, R.styleable.Chip);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Chip_chipMinHeight, 0);
        cOUIPressFeedbackImageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        typedArrayObtainStyledAttributes.recycle();
        ph2.c(cOUIPressFeedbackImageView, false);
        return cOUIPressFeedbackImageView;
    }

    private final COUIChip getChip() {
        View viewInflate = View.inflate(getContext(), R$layout.coui_component_item_search_history, null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.coui.appcompat.chip.COUIChip");
        COUIChip cOUIChip = (COUIChip) viewInflate;
        gg2.c(cOUIChip, 4);
        cOUIChip.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.fi2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                COUIFlowLayout.u(this.i, view);
            }
        });
        return cOUIChip;
    }

    private final int getContainerLayoutHeight() {
        return this.isExpand ? this.expandedStateHeight : this.foldedStateHeight;
    }

    private final COUIPressFeedbackImageView getExpandButton() {
        COUIPressFeedbackImageView baseExpandButton = getBaseExpandButton();
        baseExpandButton.setImageResource(R$drawable.coui_component_expand_arrow_drop_down);
        baseExpandButton.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ei2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                COUIFlowLayout.v(this.i, view);
            }
        });
        return baseExpandButton;
    }

    private final float getExpandButtonAlpha() {
        return this.isExpand ? 0.0f : 1.0f;
    }

    private final int getExpandedStateHeight() {
        return k(this.lines) + getPaddingTop() + getPaddingBottom();
    }

    private final COUIPressFeedbackImageView getFoldButton() {
        COUIPressFeedbackImageView baseExpandButton = getBaseExpandButton();
        baseExpandButton.setImageResource(R$drawable.coui_component_expand_arrow_drop_up);
        baseExpandButton.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ci2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                COUIFlowLayout.w(this.i, view);
            }
        });
        return baseExpandButton;
    }

    private final float getFoldButtonAlpha() {
        return this.isExpand ? 1.0f : 0.0f;
    }

    private final int getFoldedStateHeight() {
        List<c> list = this.lines;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (i < this.maxRowFolded) {
                arrayList.add(obj);
            }
            i = i2;
        }
        return k(arrayList) + getPaddingTop() + getPaddingBottom();
    }

    private final int getMaxRow() {
        return this.isExpand ? this.maxRowUnfolded : this.maxRowFolded;
    }

    public static final void o(COUIFlowLayout this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue("fold_button_alpha");
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.tempHiddenViewsAlphaFlg = fFloatValue;
        this$0.setHiddenViewsAlpha(fFloatValue);
    }

    public static final void p(COUIFlowLayout this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue("expand_button_alpha");
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.tempVisibleViewsAlphaFlg = fFloatValue;
        this$0.setVisibleViewsAlpha(fFloatValue);
    }

    public static final void r(COUIFlowLayout this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue("fold_button_alpha");
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.tempHiddenViewsAlphaFlg = ((Float) animatedValue).floatValue();
        Object animatedValue2 = it.getAnimatedValue("expand_button_alpha");
        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        this$0.tempVisibleViewsAlphaFlg = ((Float) animatedValue2).floatValue();
        this$0.setHiddenViewsAlpha(this$0.tempHiddenViewsAlphaFlg);
        this$0.setVisibleViewsAlpha(this$0.tempVisibleViewsAlphaFlg);
    }

    private final void setHiddenViewsAlpha(float alpha) {
        B(this.foldButton, alpha);
        Iterator<T> it = getHiddenChips().iterator();
        while (it.hasNext()) {
            B((View) it.next(), alpha);
        }
        View view = this.foldLineRemovedChip;
        if (view != null) {
            B(view, alpha);
        }
    }

    private final void setVisibleViewsAlpha(float alpha) {
        B(this.expandButton, alpha);
        Iterator<T> it = getVisibleChips().iterator();
        while (it.hasNext()) {
            B((View) it.next(), 1.0f);
        }
    }

    @SensorsDataInstrumented
    public static final void u(COUIFlowLayout this$0, View view) {
        d dVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b bVar = this$0.itemCache.get(Integer.valueOf(view.getId()));
        if (bVar != null && (dVar = this$0.onItemClickListener) != null) {
            dVar.a(bVar);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @SensorsDataInstrumented
    public static final void v(COUIFlowLayout this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n();
        View.OnClickListener onClickListener = this$0.expandOnClickListener;
        if (onClickListener != null && onClickListener != null) {
            onClickListener.onClick(view);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @SensorsDataInstrumented
    public static final void w(COUIFlowLayout this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q();
        View.OnClickListener onClickListener = this$0.foldOnClickListener;
        if (onClickListener != null && onClickListener != null) {
            onClickListener.onClick(view);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @SensorsDataInstrumented
    public static final void z(COUIFlowLayout this$0, View view, d onItemClickListener, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(onItemClickListener, "$onItemClickListener");
        b bVar = this$0.itemCache.get(Integer.valueOf(((COUIChip) view).getId()));
        if (bVar != null) {
            onItemClickListener.a(bVar);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view2);
    }

    public final void A() {
        ConcurrentLinkedQueue<ValueAnimator> concurrentLinkedQueue = this.runningAnimators;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        while (true) {
            ValueAnimator valueAnimatorPoll = this.runningAnimators.poll();
            if (valueAnimatorPoll == null) {
                return;
            } else {
                valueAnimatorPoll.cancel();
            }
        }
    }

    public final void B(View view, float f2) {
        view.setVisibility(j(f2, 0) ? 4 : 0);
        view.setAlpha(f2);
    }

    public final void C() {
        B(this.foldButton, getFoldButtonAlpha());
        B(this.expandButton, getExpandButtonAlpha());
        Iterator<T> it = getVisibleChips().iterator();
        while (it.hasNext()) {
            B((View) it.next(), 1.0f);
        }
        Iterator<T> it2 = getHiddenChips().iterator();
        while (it2.hasNext()) {
            B((View) it2.next(), getFoldButtonAlpha());
        }
        View view = this.foldLineRemovedChip;
        if (view != null) {
            B(view, getFoldButtonAlpha());
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long drawingTime) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.getTop() >= getContainerLayoutHeight() || child.getHeight() == 0) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    public final boolean getExpandable() {
        return this.expandable;
    }

    @NotNull
    public final List<View> getHiddenChips() {
        List<c> list = this.lines;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (i >= this.maxRowFolded) {
                arrayList.add(next);
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ((c) it2.next()).d());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!(((View) obj) instanceof ImageView)) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public final int getItemSpacing() {
        return this.itemSpacing;
    }

    public final int getLineSpacing() {
        return this.lineSpacing;
    }

    public final int getMaxRowFolded() {
        return this.maxRowFolded;
    }

    public final int getMaxRowUnfolded() {
        return this.maxRowUnfolded;
    }

    @NotNull
    public final List<View> getVisibleChips() {
        List<c> list = this.lines;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((c) it.next()).d());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            View view = (View) obj;
            if ((getHiddenChips().contains(view) || (view instanceof ImageView)) ? false : true) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final boolean j(float f2, int i) {
        return ((double) (f2 - ((float) i))) < 0.001d;
    }

    public final int k(List<c> lines) {
        Iterator<T> it = lines.iterator();
        int height = 0;
        while (it.hasNext()) {
            height += ((c) it.next()).getHeight();
        }
        return height + (this.lineSpacing * (lines.size() - 1));
    }

    public final void l() {
        A();
    }

    public final void m() {
        this.lines.clear();
        this.foldLineRemovedChip = null;
        removeAllViews();
        this.itemCache.clear();
    }

    public final void n() {
        if (x()) {
            A();
        } else {
            this.tempHiddenViewsAlphaFlg = -1.0f;
            this.tempVisibleViewsAlphaFlg = -1.0f;
            A();
        }
        float[] fArr = new float[2];
        float f2 = this.tempVisibleViewsAlphaFlg;
        if (f2 < 0.0f) {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        fArr[1] = 0.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("expand_button_alpha", fArr);
        float[] fArr2 = new float[2];
        float f3 = this.tempHiddenViewsAlphaFlg;
        fArr2[0] = f3 >= 0.0f ? f3 : 0.0f;
        fArr2[1] = 1.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("fold_button_alpha", fArr2);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(propertyValuesHolderOfFloat2);
        valueAnimator.setInterpolator(new hj2());
        valueAnimator.setDuration(400L);
        valueAnimator.setStartDelay(100L);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.gi2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                COUIFlowLayout.o(this.i, valueAnimator2);
            }
        });
        valueAnimator.start();
        this.runningAnimators.add(valueAnimator);
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setValues(propertyValuesHolderOfFloat);
        valueAnimator2.setInterpolator(new hj2());
        valueAnimator2.setDuration(250L);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.hi2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                COUIFlowLayout.p(this.i, valueAnimator3);
            }
        });
        valueAnimator2.addListener(new e());
        valueAnimator2.start();
        this.runningAnimators.add(valueAnimator2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t, int r, int b2) {
        int paddingTop = getPaddingTop();
        boolean z = getLayoutDirection() == 1;
        for (c cVar : this.lines) {
            cVar.e(getPaddingStart(), paddingTop, getContainerLayoutHeight(), z);
            paddingTop += cVar.getHeight() + this.lineSpacing;
        }
        Iterator it = SequencesKt___SequencesKt.filter(ViewGroupKt.getChildren(this), new Function1<View, Boolean>() { // from class: com.coui.appcompat.searchhistory.COUIFlowLayout.onLayout.2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull View child) {
                Intrinsics.checkNotNullParameter(child, "child");
                List list = COUIFlowLayout.this.lines;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((c) it2.next()).d());
                }
                return Boolean.valueOf((arrayList.contains(child) || Intrinsics.areEqual(child, COUIFlowLayout.this.foldLineRemovedChip)) ? false : true);
            }
        }).iterator();
        while (it.hasNext()) {
            ((View) it.next()).layout(0, 0, 0, 0);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (this.itemCache.isEmpty()) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.makeMeasureSpec(0, mode));
            return;
        }
        t(widthMeasureSpec, heightMeasureSpec);
        this.expandedStateHeight = getExpandedStateHeight();
        this.foldedStateHeight = getFoldedStateHeight();
        if (y(widthMeasureSpec) && this.expandable) {
            s();
        }
        if (!x()) {
            C();
        }
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getContainerLayoutHeight(), mode));
    }

    public final void q() {
        if (x()) {
            A();
        } else {
            this.tempHiddenViewsAlphaFlg = -1.0f;
            this.tempVisibleViewsAlphaFlg = -1.0f;
            A();
        }
        float[] fArr = new float[2];
        float f2 = this.tempVisibleViewsAlphaFlg;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        fArr[0] = f2;
        fArr[1] = 1.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("expand_button_alpha", fArr);
        float[] fArr2 = new float[2];
        float f3 = this.tempHiddenViewsAlphaFlg;
        fArr2[0] = f3 >= 0.0f ? f3 : 1.0f;
        fArr2[1] = 0.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("fold_button_alpha", fArr2);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        valueAnimator.setInterpolator(new hj2());
        valueAnimator.setDuration(300L);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.ii2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                COUIFlowLayout.r(this.i, valueAnimator2);
            }
        });
        valueAnimator.addListener(new f());
        valueAnimator.start();
        this.runningAnimators.add(valueAnimator);
    }

    public final void s() {
        ArrayList arrayList = new ArrayList(this.lines);
        int size = arrayList.size();
        int i = this.maxRowFolded;
        if (size < i - 1) {
            return;
        }
        c cVar = (c) arrayList.get(i - 1);
        View view = (View) CollectionsKt___CollectionsKt.lastOrNull((List) cVar.d());
        if (view != null && !cVar.b(this.foldButton)) {
            cVar.g(view);
            cVar.h(view);
            this.foldLineRemovedChip = view;
        }
        cVar.a(this.expandButton);
        if (this.isExpand) {
            c cVar2 = (c) CollectionsKt___CollectionsKt.last((List) arrayList);
            View view2 = (View) CollectionsKt___CollectionsKt.lastOrNull((List) cVar2.d());
            if (view2 != null && !cVar2.b(this.expandButton)) {
                cVar2.g(view2);
            }
            cVar2.a(this.foldButton);
        }
    }

    public final void setExpand(boolean z) {
        this.isExpand = z;
        requestLayout();
    }

    public final void setExpandOnClickListener(@NotNull View.OnClickListener clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.expandOnClickListener = clickListener;
    }

    public final void setExpandable(boolean z) {
        this.expandable = z;
    }

    public final void setFoldOnClickListener(@NotNull View.OnClickListener clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.foldOnClickListener = clickListener;
    }

    public final void setItemSpacing(int i) {
        this.itemSpacing = i;
    }

    public final void setItems(@NotNull List<? extends b> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.itemCache.clear();
        LinkedHashMap<Integer, b> linkedHashMap = this.itemCache;
        List<? extends b> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(TuplesKt.to(Integer.valueOf(View.generateViewId()), (b) it.next()));
        }
        MapsKt__MapsKt.putAll(linkedHashMap, arrayList);
        removeAllViews();
        this.expandButton = getExpandButton();
        this.foldButton = getFoldButton();
        for (Map.Entry<Integer, b> entry : this.itemCache.entrySet()) {
            COUIChip chip = getChip();
            chip.setId(entry.getKey().intValue());
            chip.setText(entry.getValue().getContent());
            addView(chip);
        }
        addView(this.expandButton);
        addView(this.foldButton);
    }

    public final void setLineSpacing(int i) {
        this.lineSpacing = i;
    }

    public final void setMaxRowFolded(int i) {
        this.maxRowFolded = i;
    }

    public final void setMaxRowUnfolded(int i) {
        this.maxRowUnfolded = i;
    }

    public final void setOnItemClickListener(@NotNull final d onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        for (final View view : ViewGroupKt.getChildren(this)) {
            if (view instanceof COUIChip) {
                if (view.getVisibility() == 0) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.di2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            COUIFlowLayout.z(this.i, view, onItemClickListener, view2);
                        }
                    });
                }
            }
        }
        this.onItemClickListener = onItemClickListener;
    }

    public final void t(int widthMeasureSpec, int heightMeasureSpec) {
        this.lines.clear();
        this.foldLineRemovedChip = null;
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight();
        c cVar = new c(size, this.itemSpacing);
        this.lines.add(cVar);
        measureChild(this.expandButton, widthMeasureSpec, heightMeasureSpec);
        measureChild(this.foldButton, widthMeasureSpec, heightMeasureSpec);
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            if (!(view instanceof ImageView)) {
                if (z) {
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    B(view, 0.0f);
                } else {
                    measureChild(view, widthMeasureSpec, heightMeasureSpec);
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    if (cVar.b(view)) {
                        cVar.a(view);
                    } else if (this.lines.size() >= getMaxRow()) {
                        B(view, 0.0f);
                        z = true;
                    } else {
                        cVar = new c(size, this.itemSpacing);
                        cVar.a(view);
                        this.lines.add(cVar);
                    }
                }
            }
        }
    }

    public final boolean x() {
        ConcurrentLinkedQueue<ValueAnimator> concurrentLinkedQueue = this.runningAnimators;
        if ((concurrentLinkedQueue instanceof Collection) && concurrentLinkedQueue.isEmpty()) {
            return false;
        }
        Iterator<T> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            if (((ValueAnimator) it.next()).isRunning()) {
                return true;
            }
        }
        return false;
    }

    public final boolean y(int widthMeasureSpec) {
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        int i = 0;
        int iMin = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt instanceof ImageView)) {
                if (i == 0) {
                    iMin = Math.min(childAt.getMeasuredWidth(), size);
                    i2++;
                } else {
                    if (childAt.getMeasuredWidth() + iMin + this.itemSpacing > size) {
                        i2++;
                        i = 0;
                        iMin = 0;
                    }
                    iMin += i == 0 ? Math.min(childAt.getMeasuredWidth(), size) : childAt.getMeasuredWidth() + this.itemSpacing;
                }
                i++;
                if (i2 > this.maxRowFolded) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUIFlowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUIFlowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ COUIFlowLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUIFlowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemCache = new LinkedHashMap<>();
        this.lines = new ArrayList();
        this.runningAnimators = new ConcurrentLinkedQueue<>();
        this.expandButton = getExpandButton();
        this.foldButton = getFoldButton();
        this.tempHiddenViewsAlphaFlg = -1.0f;
        this.tempVisibleViewsAlphaFlg = -1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIFlowLayout, i, i2);
        this.maxRowFolded = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIFlowLayout_maxRowFolded, Integer.MAX_VALUE);
        this.maxRowUnfolded = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIFlowLayout_maxRowUnfolded, Integer.MAX_VALUE);
        this.lineSpacing = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIFlowLayout_lineSpacing, 0);
        this.itemSpacing = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIFlowLayout_itemSpacing, 0);
        this.expandable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIFlowLayout_expandable, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.expandable) {
            return;
        }
        this.maxRowUnfolded = this.maxRowFolded;
    }
}
