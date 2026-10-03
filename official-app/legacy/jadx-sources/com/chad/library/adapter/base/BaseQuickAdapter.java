package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.diff.BrvahAsyncDiffer;
import com.chad.library.adapter.base.diff.BrvahListUpdateCallback;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.ac8;
import com.oplus.aiunit.vision.g3b;
import com.oplus.aiunit.vision.g61;
import com.oplus.aiunit.vision.gjk;
import com.oplus.aiunit.vision.kz0;
import com.oplus.aiunit.vision.mhd;
import com.oplus.aiunit.vision.n46;
import com.oplus.aiunit.vision.nhd;
import com.oplus.aiunit.vision.nrh;
import com.oplus.aiunit.vision.orh;
import com.oplus.aiunit.vision.prh;
import com.oplus.aiunit.vision.qhd;
import com.oplus.aiunit.vision.r72;
import com.oplus.aiunit.vision.r91;
import com.oplus.aiunit.vision.rdg;
import com.oplus.aiunit.vision.shd;
import com.oplus.aiunit.vision.up;
import com.oplus.aiunit.vision.x11;
import com.oplus.aiunit.vision.y00;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.ReplaceWith;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001a\b&\u0018\u0000 \u0080\u0002*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0004\u0081\u0002\u0082\u0002B'\b\u0007\u0012\b\b\u0001\u0010G\u001a\u00020\u001a\u0012\u0010\b\u0002\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J%\u0010\f\u001a\u0004\u0018\u00018\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H$¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0014¢\u0006\u0004\b\u0012\u0010\u0017J\u001f\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u001f\u0010!\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010!\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u001a2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150#H\u0016¢\u0006\u0004\b!\u0010$J\u0010\u0010&\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u0017\u0010'\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u001aH\u0014J\u0019\u00100\u001a\u00028\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b2\u00101J\u0019\u00103\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b3\u00104J\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001a05J\u0014\u00109\u001a\u00020\u00052\f\b\u0001\u00108\u001a\u000207\"\u00020\u001aJ\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a05J\u0014\u0010;\u001a\u00020\u00052\f\b\u0001\u00108\u001a\u000207\"\u00020\u001aJ\u001f\u0010=\u001a\u00020\u00052\u0006\u0010<\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b=\u0010\"J\u0018\u0010?\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001aH\u0014J\u0018\u0010@\u001a\u00020.2\u0006\u0010>\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001aH\u0014J\u0018\u0010A\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001aH\u0014J\u0018\u0010B\u001a\u00020.2\u0006\u0010>\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001aH\u0014J\u001f\u0010C\u001a\u00020\u00052\u0006\u0010<\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\bC\u0010\"J\b\u0010D\u001a\u00020\u001aH\u0014J\u0010\u0010E\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0014J\u001f\u0010F\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\bF\u0010\u001dJ!\u0010H\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010G\u001a\u00020\u001aH\u0014¢\u0006\u0004\bH\u0010\u001dJ\u0017\u0010H\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u001a\u0010L\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001a2\b\b\u0001\u0010K\u001a\u00020\u001aJ$\u0010O\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010M\u001a\u00020\u001a2\b\b\u0002\u0010N\u001a\u00020\u001aH\u0007J$\u0010P\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010M\u001a\u00020\u001a2\b\b\u0002\u0010N\u001a\u00020\u001aH\u0007J\u0006\u0010Q\u001a\u00020.J\u000e\u0010S\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\nJ\u0006\u0010T\u001a\u00020\u0005J$\u0010U\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010M\u001a\u00020\u001a2\b\b\u0002\u0010N\u001a\u00020\u001aH\u0007J$\u0010V\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010M\u001a\u00020\u001a2\b\b\u0002\u0010N\u001a\u00020\u001aH\u0007J\u000e\u0010X\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\nJ\u0006\u0010Y\u001a\u00020\u0005J\u0006\u0010Z\u001a\u00020.J\u000e\u0010\\\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\nJ\u000e\u0010\\\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u001aJ\u0006\u0010]\u001a\u00020\u0005J\u0006\u0010^\u001a\u00020.J\u0018\u0010a\u001a\u00020\u00052\u0006\u0010`\u001a\u00020_2\u0006\u0010M\u001a\u00020\u001aH\u0014J\u000e\u0010d\u001a\u00020\u00052\u0006\u0010c\u001a\u00020bJ\u0018\u0010f\u001a\u00020\u00052\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#H\u0017J\u0018\u0010h\u001a\u00020\u00052\u000e\u0010g\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#H\u0016J\u0016\u0010k\u001a\u00020\u00052\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000iH\u0017J\u0018\u0010l\u001a\u00020\u00052\u000e\u0010g\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010iH\u0016J!\u0010m\u001a\u00020\u00052\b\b\u0001\u0010M\u001a\u00020\u001a2\u0006\u0010e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bm\u0010nJ!\u0010o\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u001a2\u0006\u0010e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bo\u0010nJ\u0019\u0010o\u001a\u00020\u00052\b\b\u0001\u0010e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bo\u0010pJ \u0010o\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u001a2\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000iH\u0016J\u0018\u0010o\u001a\u00020\u00052\u000e\b\u0001\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000iH\u0016J\u0012\u0010q\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u001aH\u0017J\u0012\u0010r\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u001aH\u0016J\u0017\u0010q\u001a\u00020\u00052\u0006\u0010e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bq\u0010pJ\u0010\u0010t\u001a\u00020\u00052\u0006\u0010s\u001a\u00020\u001aH\u0004J\u0014\u0010w\u001a\u00020\u00052\f\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000uJ\u0014\u0010z\u001a\u00020\u00052\f\u0010y\u001a\b\u0012\u0004\u0012\u00028\u00000xJ\u000e\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000{H\u0007J\f\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000{J%\u0010\u0080\u0001\u001a\u00020\u00052\u000e\u0010g\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#2\n\b\u0002\u0010\u007f\u001a\u0004\u0018\u00010~H\u0017J#\u0010\u0080\u0001\u001a\u00020\u00052\n\b\u0001\u0010\u0082\u0001\u001a\u00030\u0081\u00012\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0013\u0010\u0085\u0001\u001a\u00020\u00052\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u0001J\u0013\u0010\u0088\u0001\u001a\u00020\u00052\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001J\u0013\u0010\u008a\u0001\u001a\u00020\u00052\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0089\u0001J\u0013\u0010\u008c\u0001\u001a\u00020\u00052\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u008b\u0001J\u0013\u0010\u008e\u0001\u001a\u00020\u00052\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u008d\u0001J\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0086\u0001J\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0089\u0001J\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008b\u0001J\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u0001R\u0015\u0010G\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010\u0093\u0001R<\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000#2\r\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0006@@X\u0086\u000e¢\u0006\u0017\n\u0005\be\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R)\u0010\u009a\u0001\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R)\u0010 \u0001\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010\u009b\u0001\u001a\u0006\b¡\u0001\u0010\u009d\u0001\"\u0006\b¢\u0001\u0010\u009f\u0001R)\u0010£\u0001\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010\u009b\u0001\u001a\u0006\b£\u0001\u0010\u009d\u0001\"\u0006\b¤\u0001\u0010\u009f\u0001R)\u0010¥\u0001\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010\u009b\u0001\u001a\u0006\b¦\u0001\u0010\u009d\u0001\"\u0006\b§\u0001\u0010\u009f\u0001R)\u0010¨\u0001\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010\u009b\u0001\u001a\u0006\b©\u0001\u0010\u009d\u0001\"\u0006\bª\u0001\u0010\u009f\u0001R)\u0010«\u0001\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010\u009b\u0001\u001a\u0006\b¬\u0001\u0010\u009d\u0001\"\u0006\b\u00ad\u0001\u0010\u009f\u0001R)\u0010®\u0001\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010\u009b\u0001\u001a\u0006\b®\u0001\u0010\u009d\u0001\"\u0006\b¯\u0001\u0010\u009f\u0001R8\u0010²\u0001\u001a\u0005\u0018\u00010°\u00012\n\u0010±\u0001\u001a\u0005\u0018\u00010°\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R!\u0010¸\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001a\u0010»\u0001\u001a\u00030º\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u001a\u0010½\u0001\u001a\u00030º\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b½\u0001\u0010¼\u0001R\u001a\u0010¿\u0001\u001a\u00030¾\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Á\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010\u0093\u0001R\u001c\u0010Â\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001c\u0010Æ\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u001c\u0010Ê\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u001c\u0010Í\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001c\u0010Ð\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R,\u0010Ó\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R.\u0010Ù\u0001\u001a\u0004\u0018\u00010)2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u001d\u0010Ý\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u001d\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010Þ\u0001R\u0015\u0010á\u0001\u001a\u00030Ò\u00018F¢\u0006\b\u001a\u0006\bà\u0001\u0010Ö\u0001R\u0015\u0010ä\u0001\u001a\u00030Ì\u00018F¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0015\u0010ç\u0001\u001a\u00030Ï\u00018F¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001R\u0013\u0010*\u001a\u00020)8F¢\u0006\b\u001a\u0006\bè\u0001\u0010Ü\u0001R\u0015\u0010ì\u0001\u001a\u00030é\u00018F¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001R\u0014\u0010ï\u0001\u001a\u00020\u001a8F¢\u0006\b\u001a\u0006\bí\u0001\u0010î\u0001R\u0014\u0010ñ\u0001\u001a\u00020\u001a8F¢\u0006\b\u001a\u0006\bð\u0001\u0010î\u0001R\u0017\u0010ô\u0001\u001a\u0005\u0018\u00010º\u00018F¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u0014\u0010ö\u0001\u001a\u00020\u001a8F¢\u0006\b\u001a\u0006\bõ\u0001\u0010î\u0001R\u0014\u0010ø\u0001\u001a\u00020\u001a8F¢\u0006\b\u001a\u0006\b÷\u0001\u0010î\u0001R\u0017\u0010ú\u0001\u001a\u0005\u0018\u00010º\u00018F¢\u0006\b\u001a\u0006\bù\u0001\u0010ó\u0001R\u0017\u0010ý\u0001\u001a\u0005\u0018\u00010¾\u00018F¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001¨\u0006\u0083\u0002"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "", "checkModule", "Ljava/lang/Class;", "z", "getInstancedGenericKClass", "Landroid/view/View;", "view", "createBaseGenericKInstance", "(Ljava/lang/Class;Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "addAnimation", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "getItemCount", "position", "getItemViewType", "onBindViewHolder", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILjava/util/List;)V", "", "getItemId", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "type", "", "isFixedViewType", "getItem", "(I)Ljava/lang/Object;", "getItemOrNull", "getItemPosition", "(Ljava/lang/Object;)I", "Ljava/util/LinkedHashSet;", "getChildClickViewIds", "", "viewIds", "addChildClickViewIds", "getChildLongClickViewIds", "addChildLongClickViewIds", "viewHolder", "bindViewClickListener", "v", "setOnItemClick", "setOnItemLongClick", "setOnItemChildClick", "setOnItemChildLongClick", "onItemViewHolderCreated", "getDefItemCount", "getDefItemViewType", "onCreateDefViewHolder", "layoutResId", "createBaseViewHolder", "(Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "setFullSpan", "viewId", "getViewByPosition", "index", "orientation", "addHeaderView", "setHeaderView", "hasHeaderLayout", SpeechConstant.KEY_TTS_REQUEST_HEADER, "removeHeaderView", "removeAllHeaderView", "addFooterView", "setFooterView", "footer", "removeFooterView", "removeAllFooterView", "hasFooterLayout", "emptyView", "setEmptyView", "removeEmptyView", "hasEmptyView", "Landroid/animation/Animator;", ParserTag.TAG_ANIM, "startAnim", "Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "animationType", "setAnimationWithDefault", "data", "setNewData", "list", "setNewInstance", "", "newData", "replaceData", "setList", "setData", "(ILjava/lang/Object;)V", "addData", "(Ljava/lang/Object;)V", EventType.STATE_PACKAGE_CHANGED_REMOVE, "removeAt", "size", "compatibilityDataSizeChanged", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "setDiffCallback", "Lcom/oplus/aiunit/vision/r72;", "config", "setDiffConfig", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "getDiffHelper", "getDiffer", "Ljava/lang/Runnable;", "commitCallback", "setDiffNewData", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "diffResult", "Lcom/oplus/aiunit/vision/ac8;", "spanSizeLookup", "setGridSpanSizeLookup", "Lcom/oplus/aiunit/vision/qhd;", "listener", "setOnItemClickListener", "Lcom/oplus/aiunit/vision/shd;", "setOnItemLongClickListener", "Lcom/oplus/aiunit/vision/mhd;", "setOnItemChildClickListener", "Lcom/oplus/aiunit/vision/nhd;", "setOnItemChildLongClickListener", "getOnItemClickListener", "getOnItemLongClickListener", "getOnItemChildClickListener", "getOnItemChildLongClickListener", "I", "<set-?>", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData$com_github_CymChad_brvah", "(Ljava/util/List;)V", "headerWithEmptyEnable", "Z", "getHeaderWithEmptyEnable", "()Z", "setHeaderWithEmptyEnable", "(Z)V", "footerWithEmptyEnable", "getFooterWithEmptyEnable", "setFooterWithEmptyEnable", "isUseEmpty", "setUseEmpty", "headerViewAsFlow", "getHeaderViewAsFlow", "setHeaderViewAsFlow", "footerViewAsFlow", "getFooterViewAsFlow", "setFooterViewAsFlow", "animationEnable", "getAnimationEnable", "setAnimationEnable", "isAnimationFirstOnly", "setAnimationFirstOnly", "Lcom/oplus/aiunit/vision/kz0;", "value", "adapterAnimation", "Lcom/oplus/aiunit/vision/kz0;", "getAdapterAnimation", "()Lcom/oplus/aiunit/vision/kz0;", "setAdapterAnimation", "(Lcom/oplus/aiunit/vision/kz0;)V", "mDiffHelper", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "Landroid/widget/LinearLayout;", "mHeaderLayout", "Landroid/widget/LinearLayout;", "mFooterLayout", "Landroid/widget/FrameLayout;", "mEmptyLayout", "Landroid/widget/FrameLayout;", "mLastPosition", "mSpanSizeLookup", "Lcom/oplus/aiunit/vision/ac8;", "mOnItemClickListener", "Lcom/oplus/aiunit/vision/qhd;", "mOnItemLongClickListener", "Lcom/oplus/aiunit/vision/shd;", "mOnItemChildClickListener", "Lcom/oplus/aiunit/vision/mhd;", "mOnItemChildLongClickListener", "Lcom/oplus/aiunit/vision/nhd;", "Lcom/oplus/aiunit/vision/r91;", "mUpFetchModule", "Lcom/oplus/aiunit/vision/r91;", "Lcom/oplus/aiunit/vision/x11;", "mDraggableModule", "Lcom/oplus/aiunit/vision/x11;", "Lcom/oplus/aiunit/vision/g61;", "mLoadMoreModule", "Lcom/oplus/aiunit/vision/g61;", "getMLoadMoreModule$com_github_CymChad_brvah", "()Lcom/oplus/aiunit/vision/g61;", "setMLoadMoreModule$com_github_CymChad_brvah", "(Lcom/oplus/aiunit/vision/g61;)V", "recyclerViewOrNull", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerViewOrNull", "()Landroidx/recyclerview/widget/RecyclerView;", "childClickViewIds", "Ljava/util/LinkedHashSet;", "childLongClickViewIds", "getLoadMoreModule", "loadMoreModule", "getUpFetchModule", "()Lcom/oplus/aiunit/vision/r91;", "upFetchModule", "getDraggableModule", "()Lcom/oplus/aiunit/vision/x11;", "draggableModule", "getRecyclerView", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "getHeaderViewPosition", "()I", "headerViewPosition", "getHeaderLayoutCount", "headerLayoutCount", "getHeaderLayout", "()Landroid/widget/LinearLayout;", "headerLayout", "getFooterViewPosition", "footerViewPosition", "getFooterLayoutCount", "footerLayoutCount", "getFooterLayout", "footerLayout", "getEmptyLayout", "()Landroid/widget/FrameLayout;", "emptyLayout", "<init>", "(ILjava/util/List;)V", "Companion", "AnimationType", "a", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public abstract class BaseQuickAdapter<T, VH extends BaseViewHolder> extends RecyclerView.Adapter<VH> {
    public static final int EMPTY_VIEW = 268436821;
    public static final int FOOTER_VIEW = 268436275;
    public static final int HEADER_VIEW = 268435729;
    public static final int LOAD_MORE_VIEW = 268436002;

    @Nullable
    private kz0 adapterAnimation;
    private boolean animationEnable;

    @NotNull
    private final LinkedHashSet<Integer> childClickViewIds;

    @NotNull
    private final LinkedHashSet<Integer> childLongClickViewIds;

    @NotNull
    private List<T> data;
    private boolean footerViewAsFlow;
    private boolean footerWithEmptyEnable;
    private boolean headerViewAsFlow;
    private boolean headerWithEmptyEnable;
    private boolean isAnimationFirstOnly;
    private boolean isUseEmpty;
    private final int layoutResId;

    @Nullable
    private BrvahAsyncDiffer<T> mDiffHelper;

    @Nullable
    private x11 mDraggableModule;
    private FrameLayout mEmptyLayout;
    private LinearLayout mFooterLayout;
    private LinearLayout mHeaderLayout;
    private int mLastPosition;

    @Nullable
    private g61 mLoadMoreModule;

    @Nullable
    private mhd mOnItemChildClickListener;

    @Nullable
    private nhd mOnItemChildLongClickListener;

    @Nullable
    private qhd mOnItemClickListener;

    @Nullable
    private shd mOnItemLongClickListener;

    @Nullable
    private ac8 mSpanSizeLookup;

    @Nullable
    private r91 mUpFetchModule;

    @Nullable
    private RecyclerView recyclerViewOrNull;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "", "(Ljava/lang/String;I)V", "AlphaIn", "ScaleIn", "SlideInBottom", "SlideInLeft", "SlideInRight", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            iArr[AnimationType.AlphaIn.ordinal()] = 1;
            iArr[AnimationType.ScaleIn.ordinal()] = 2;
            iArr[AnimationType.SlideInBottom.ordinal()] = 3;
            iArr[AnimationType.SlideInLeft.ordinal()] = 4;
            iArr[AnimationType.SlideInRight.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BaseQuickAdapter(@LayoutRes int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ ac8 access$getMSpanSizeLookup$p(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.getClass();
        return null;
    }

    private final void addAnimation(RecyclerView.ViewHolder holder) {
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || holder.getLayoutPosition() > this.mLastPosition) {
                kz0 y00Var = this.adapterAnimation;
                if (y00Var == null) {
                    y00Var = new y00(0.0f, 1, null);
                }
                View view = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
                for (Animator animator : y00Var.a(view)) {
                    startAnim(animator, holder.getLayoutPosition());
                }
                this.mLastPosition = holder.getLayoutPosition();
            }
        }
    }

    public static /* synthetic */ int addFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addFooterView(view, i, i2);
    }

    public static /* synthetic */ int addHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addHeaderView(view, i, i2);
    }

    @SensorsDataInstrumented
    /* JADX INFO: renamed from: bindViewClickListener$lambda-12$lambda-11$lambda-10, reason: not valid java name */
    private static final void m4529bindViewClickListener$lambda12$lambda11$lambda10(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            SensorsDataAutoTrackHelper.trackViewOnClick(v);
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        Intrinsics.checkNotNullExpressionValue(v, "v");
        this$0.setOnItemChildClick(v, headerLayoutCount);
        SensorsDataAutoTrackHelper.trackViewOnClick(v);
    }

    /* JADX INFO: renamed from: bindViewClickListener$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    private static final boolean m4530bindViewClickListener$lambda15$lambda14$lambda13(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        Intrinsics.checkNotNullExpressionValue(v, "v");
        return this$0.setOnItemChildLongClick(v, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: bindViewClickListener$lambda-7$lambda-6, reason: not valid java name */
    public static final void m4531bindViewClickListener$lambda7$lambda6(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            SensorsDataAutoTrackHelper.trackViewOnClick(v);
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        Intrinsics.checkNotNullExpressionValue(v, "v");
        this$0.setOnItemClick(v, headerLayoutCount);
        SensorsDataAutoTrackHelper.trackViewOnClick(v);
    }

    /* JADX INFO: renamed from: bindViewClickListener$lambda-9$lambda-8, reason: not valid java name */
    private static final boolean m4532bindViewClickListener$lambda9$lambda8(BaseViewHolder viewHolder, BaseQuickAdapter this$0, View v) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        Intrinsics.checkNotNullExpressionValue(v, "v");
        return this$0.setOnItemLongClick(v, headerLayoutCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkModule() {
        if (this instanceof g3b) {
            this.mLoadMoreModule = ((g3b) this).addLoadMoreModule(this);
        }
        if (this instanceof gjk) {
            this.mUpFetchModule = ((gjk) this).a(this);
        }
        if (this instanceof n46) {
            this.mDraggableModule = ((n46) this).a(this);
        }
    }

    private final VH createBaseGenericKInstance(Class<?> z, View view) {
        try {
            if (!z.isMemberClass() || Modifier.isStatic(z.getModifiers())) {
                Constructor<?> declaredConstructor = z.getDeclaredConstructor(View.class);
                Intrinsics.checkNotNullExpressionValue(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(view);
                if (objNewInstance != null) {
                    return (VH) objNewInstance;
                }
                throw new NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
            }
            Constructor<?> declaredConstructor2 = z.getDeclaredConstructor(getClass(), View.class);
            Intrinsics.checkNotNullExpressionValue(declaredConstructor2, "z.getDeclaredConstructor…aClass, View::class.java)");
            declaredConstructor2.setAccessible(true);
            Object objNewInstance2 = declaredConstructor2.newInstance(this, view);
            if (objNewInstance2 != null) {
                return (VH) objNewInstance2;
            }
            throw new NullPointerException("null cannot be cast to non-null type VH of com.chad.library.adapter.base.BaseQuickAdapter");
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return null;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private final Class<?> getInstancedGenericKClass(Class<?> z) {
        try {
            Type genericSuperclass = z.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                return null;
            }
            Type[] types = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            Intrinsics.checkNotNullExpressionValue(types, "types");
            for (Type type : types) {
                if (type instanceof Class) {
                    if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                        return (Class) type;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                        return (Class) rawType;
                    }
                } else {
                    continue;
                }
            }
            return null;
        } catch (TypeNotPresentException e2) {
            e2.printStackTrace();
            return null;
        } catch (GenericSignatureFormatError e3) {
            e3.printStackTrace();
            return null;
        } catch (MalformedParameterizedTypeException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ void setDiffNewData$default(BaseQuickAdapter baseQuickAdapter, List list, Runnable runnable, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDiffNewData");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        baseQuickAdapter.setDiffNewData(list, runnable);
    }

    public static /* synthetic */ int setFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFooterView");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.setFooterView(view, i, i2);
    }

    public static /* synthetic */ int setHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderView");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.setHeaderView(view, i, i2);
    }

    public final void addChildClickViewIds(@IdRes @NotNull int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i : viewIds) {
            this.childClickViewIds.add(Integer.valueOf(i));
        }
    }

    public final void addChildLongClickViewIds(@IdRes @NotNull int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i : viewIds) {
            this.childLongClickViewIds.add(Integer.valueOf(i));
        }
    }

    public void addData(@IntRange(from = 0) int position, T data) {
        this.data.add(position, data);
        notifyItemInserted(position + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return addFooterView$default(this, view, 0, 0, 6, null);
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return addHeaderView$default(this, view, 0, 0, 6, null);
    }

    public void bindViewClickListener(@NotNull final VH viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (this.mOnItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.o81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseQuickAdapter.m4531bindViewClickListener$lambda7$lambda6(viewHolder, this, view);
                }
            });
        }
    }

    public final void compatibilityDataSizeChanged(int size) {
        if (this.data.size() == size) {
            notifyDataSetChanged();
        }
    }

    public abstract void convert(@NotNull VH holder, T item);

    public void convert(@NotNull VH holder, T item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    @NotNull
    public VH createBaseViewHolder(@NotNull ViewGroup parent, @LayoutRes int layoutResId) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return (VH) createBaseViewHolder(up.a(parent, layoutResId));
    }

    @Nullable
    public final kz0 getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    @NotNull
    public final LinkedHashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    @NotNull
    public final LinkedHashSet<Integer> getChildLongClickViewIds() {
        return this.childLongClickViewIds;
    }

    @NotNull
    public final Context getContext() {
        Context context = getRecyclerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
        return context;
    }

    @NotNull
    public final List<T> getData() {
        return this.data;
    }

    public int getDefItemCount() {
        return this.data.size();
    }

    public int getDefItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Deprecated(message = "User getDiffer()", replaceWith = @ReplaceWith(expression = "getDiffer()", imports = {}))
    @NotNull
    public final BrvahAsyncDiffer<T> getDiffHelper() {
        return getDiffer();
    }

    @NotNull
    public final BrvahAsyncDiffer<T> getDiffer() {
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer == null) {
            throw new IllegalStateException("Please use setDiffCallback() or setDiffConfig() first!".toString());
        }
        Intrinsics.checkNotNull(brvahAsyncDiffer);
        return brvahAsyncDiffer;
    }

    @NotNull
    public final x11 getDraggableModule() {
        x11 x11Var = this.mDraggableModule;
        if (x11Var == null) {
            throw new IllegalStateException("Please first implements DraggableModule".toString());
        }
        Intrinsics.checkNotNull(x11Var);
        return x11Var;
    }

    @Nullable
    public final FrameLayout getEmptyLayout() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout != null) {
                return frameLayout;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        return null;
    }

    @Nullable
    public final LinearLayout getFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            if (linearLayout != null) {
                return linearLayout;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        return null;
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final int getFooterViewPosition() {
        if (!hasEmptyView()) {
            return getHeaderLayoutCount() + this.data.size();
        }
        int i = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
        if (this.footerWithEmptyEnable) {
            return i;
        }
        return -1;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    @Nullable
    public final LinearLayout getHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            if (linearLayout != null) {
                return linearLayout;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        return null;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final int getHeaderViewPosition() {
        return (!hasEmptyView() || this.headerWithEmptyEnable) ? 0 : -1;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    public T getItem(@IntRange(from = 0) int position) {
        return this.data.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 1;
        if (!hasEmptyView()) {
            g61 g61Var = this.mLoadMoreModule;
            return getHeaderLayoutCount() + getDefItemCount() + getFooterLayoutCount() + ((g61Var == null || !g61Var.hasLoadMoreView()) ? 0 : 1);
        }
        if (this.headerWithEmptyEnable && hasHeaderLayout()) {
            i = 2;
        }
        return (this.footerWithEmptyEnable && hasFooterLayout()) ? i + 1 : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Nullable
    public T getItemOrNull(@IntRange(from = 0) int position) {
        return (T) CollectionsKt___CollectionsKt.getOrNull(this.data, position);
    }

    public int getItemPosition(@Nullable T item) {
        if (item == null || !(!this.data.isEmpty())) {
            return -1;
        }
        return this.data.indexOf(item);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (hasEmptyView()) {
            boolean z = this.headerWithEmptyEnable && hasHeaderLayout();
            if (position != 0) {
                return position != 1 ? FOOTER_VIEW : FOOTER_VIEW;
            }
            if (z) {
                return HEADER_VIEW;
            }
            return EMPTY_VIEW;
        }
        boolean zHasHeaderLayout = hasHeaderLayout();
        if (zHasHeaderLayout && position == 0) {
            return HEADER_VIEW;
        }
        if (zHasHeaderLayout) {
            position--;
        }
        int size = this.data.size();
        if (position < size) {
            return getDefItemViewType(position);
        }
        return position - size < hasFooterLayout() ? FOOTER_VIEW : LOAD_MORE_VIEW;
    }

    @NotNull
    public final g61 getLoadMoreModule() {
        g61 g61Var = this.mLoadMoreModule;
        if (g61Var == null) {
            throw new IllegalStateException("Please first implements LoadMoreModule".toString());
        }
        Intrinsics.checkNotNull(g61Var);
        return g61Var;
    }

    @Nullable
    /* JADX INFO: renamed from: getMLoadMoreModule$com_github_CymChad_brvah, reason: from getter */
    public final g61 getMLoadMoreModule() {
        return this.mLoadMoreModule;
    }

    @Nullable
    public final mhd getOnItemChildClickListener() {
        return null;
    }

    @Nullable
    public final nhd getOnItemChildLongClickListener() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnItemClickListener, reason: from getter */
    public final qhd getMOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @Nullable
    public final shd getOnItemLongClickListener() {
        return null;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null) {
            throw new IllegalStateException("Please get it after onAttachedToRecyclerView()".toString());
        }
        Intrinsics.checkNotNull(recyclerView);
        return recyclerView;
    }

    @Nullable
    public final RecyclerView getRecyclerViewOrNull() {
        return this.recyclerViewOrNull;
    }

    @NotNull
    public final r91 getUpFetchModule() {
        r91 r91Var = this.mUpFetchModule;
        if (r91Var == null) {
            throw new IllegalStateException("Please first implements UpFetchModule".toString());
        }
        Intrinsics.checkNotNull(r91Var);
        return r91Var;
    }

    @Nullable
    public final View getViewByPosition(int position, @IdRes int viewId) {
        BaseViewHolder baseViewHolder;
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(position)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(viewId);
    }

    public final boolean hasEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                frameLayout = null;
            }
            if (frameLayout.getChildCount() != 0 && this.isUseEmpty) {
                return this.data.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean hasFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean hasHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            linearLayout = null;
        }
        return linearLayout.getChildCount() > 0;
    }

    /* JADX INFO: renamed from: isAnimationFirstOnly, reason: from getter */
    public final boolean getIsAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    public boolean isFixedViewType(int type) {
        return type == 268436821 || type == 268435729 || type == 268436275 || type == 268436002;
    }

    /* JADX INFO: renamed from: isUseEmpty, reason: from getter */
    public final boolean getIsUseEmpty() {
        return this.isUseEmpty;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerViewOrNull = recyclerView;
        x11 x11Var = this.mDraggableModule;
        if (x11Var != null) {
            x11Var.a(recyclerView);
        }
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(this) { // from class: com.chad.library.adapter.base.BaseQuickAdapter.onAttachedToRecyclerView.1
                public final /* synthetic */ BaseQuickAdapter<T, VH> a;

                {
                    this.a = this;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int position) {
                    int itemViewType = this.a.getItemViewType(position);
                    if (itemViewType == 268435729 && this.a.getHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 268436275 && this.a.getFooterViewAsFlow()) {
                        return 1;
                    }
                    BaseQuickAdapter.access$getMSpanSizeLookup$p(this.a);
                    return this.a.isFixedViewType(itemViewType) ? ((GridLayoutManager) layoutManager).getSpanCount() : spanSizeLookup.getSpanSize(position);
                }
            });
        }
    }

    @NotNull
    public VH onCreateDefViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return (VH) createBaseViewHolder(parent, this.layoutResId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerViewOrNull = null;
    }

    public void onItemViewHolderCreated(@NotNull VH viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    @Deprecated(message = "Please use removeAt()", replaceWith = @ReplaceWith(expression = "removeAt(position)", imports = {}))
    public void remove(@IntRange(from = 0) int position) {
        removeAt(position);
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout = null;
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeAt(@IntRange(from = 0) int position) {
        if (position >= this.data.size()) {
            return;
        }
        this.data.remove(position);
        int headerLayoutCount = position + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.data.size() - headerLayoutCount);
    }

    public final void removeEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                frameLayout = null;
            }
            frameLayout.removeAllViews();
        }
    }

    public final void removeFooterView(@NotNull View footer) {
        int footerViewPosition;
        Intrinsics.checkNotNullParameter(footer, "footer");
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout = null;
            }
            linearLayout.removeView(footer);
            LinearLayout linearLayout3 = this.mFooterLayout;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(footerViewPosition);
        }
    }

    public final void removeHeaderView(@NotNull View header) {
        int headerViewPosition;
        Intrinsics.checkNotNullParameter(header, "header");
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout = null;
            }
            linearLayout.removeView(header);
            LinearLayout linearLayout3 = this.mHeaderLayout;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            } else {
                linearLayout2 = linearLayout3;
            }
            if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(headerViewPosition);
        }
    }

    @Deprecated(message = "Please use setData()", replaceWith = @ReplaceWith(expression = "setList(newData)", imports = {}))
    public void replaceData(@NotNull Collection<? extends T> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        setList(newData);
    }

    public final void setAdapterAnimation(@Nullable kz0 kz0Var) {
        this.animationEnable = true;
        this.adapterAnimation = kz0Var;
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    public final void setAnimationFirstOnly(boolean z) {
        this.isAnimationFirstOnly = z;
    }

    public final void setAnimationWithDefault(@NotNull AnimationType animationType) {
        kz0 y00Var;
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i = b.$EnumSwitchMapping$0[animationType.ordinal()];
        if (i == 1) {
            y00Var = new y00(0.0f, 1, null);
        } else if (i == 2) {
            y00Var = new rdg(0.0f, 1, null);
        } else if (i == 3) {
            y00Var = new nrh();
        } else if (i == 4) {
            y00Var = new orh();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            y00Var = new prh();
        }
        setAdapterAnimation(y00Var);
    }

    public void setData(@IntRange(from = 0) int index, T data) {
        if (index >= this.data.size()) {
            return;
        }
        this.data.set(index, data);
        notifyItemChanged(index + getHeaderLayoutCount());
    }

    public final void setData$com_github_CymChad_brvah(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setDiffCallback(@NotNull DiffUtil.ItemCallback<T> diffCallback) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        setDiffConfig(new r72.a(diffCallback).a());
    }

    public final void setDiffConfig(@NotNull r72<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.mDiffHelper = new BrvahAsyncDiffer<>(this, config);
    }

    @JvmOverloads
    public final void setDiffNewData(@Nullable List<T> list) {
        setDiffNewData$default(this, list, null, 2, null);
    }

    public final void setEmptyView(@NotNull View emptyView) {
        boolean z;
        Intrinsics.checkNotNullParameter(emptyView, "emptyView");
        int itemCount = getItemCount();
        FrameLayout frameLayout = null;
        if (this.mEmptyLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(emptyView.getContext());
            this.mEmptyLayout = frameLayout2;
            ViewGroup.LayoutParams layoutParams = emptyView.getLayoutParams();
            frameLayout2.setLayoutParams(layoutParams != null ? new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height) : new ViewGroup.LayoutParams(-1, -1));
            z = true;
        } else {
            ViewGroup.LayoutParams layoutParams2 = emptyView.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                    frameLayout3 = null;
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                layoutParams3.width = layoutParams2.width;
                layoutParams3.height = layoutParams2.height;
                FrameLayout frameLayout4 = this.mEmptyLayout;
                if (frameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                    frameLayout4 = null;
                }
                frameLayout4.setLayoutParams(layoutParams3);
            }
            z = false;
        }
        FrameLayout frameLayout5 = this.mEmptyLayout;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
            frameLayout5 = null;
        }
        frameLayout5.removeAllViews();
        FrameLayout frameLayout6 = this.mEmptyLayout;
        if (frameLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        } else {
            frameLayout = frameLayout6;
        }
        frameLayout.addView(emptyView);
        this.isUseEmpty = true;
        if (z && hasEmptyView()) {
            int i = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 1 : 0;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return setFooterView$default(this, view, 0, 0, 6, null);
    }

    public final void setFooterViewAsFlow(boolean z) {
        this.footerViewAsFlow = z;
    }

    public final void setFooterWithEmptyEnable(boolean z) {
        this.footerWithEmptyEnable = z;
    }

    public void setFullSpan(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    public final void setGridSpanSizeLookup(@Nullable ac8 spanSizeLookup) {
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return setHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final void setHeaderViewAsFlow(boolean z) {
        this.headerViewAsFlow = z;
    }

    public final void setHeaderWithEmptyEnable(boolean z) {
        this.headerWithEmptyEnable = z;
    }

    public void setList(@Nullable Collection<? extends T> list) {
        List<T> list2 = this.data;
        if (list != list2) {
            list2.clear();
            if (!(list == null || list.isEmpty())) {
                this.data.addAll(list);
            }
        } else {
            if (list == null || list.isEmpty()) {
                this.data.clear();
            } else {
                ArrayList arrayList = new ArrayList(list);
                this.data.clear();
                this.data.addAll(arrayList);
            }
        }
        g61 g61Var = this.mLoadMoreModule;
        if (g61Var != null) {
            g61Var.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        g61 g61Var2 = this.mLoadMoreModule;
        if (g61Var2 != null) {
            g61Var2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(@Nullable g61 g61Var) {
        this.mLoadMoreModule = g61Var;
    }

    @Deprecated(message = "Please use setNewInstance(), This method will be removed in the next version", replaceWith = @ReplaceWith(expression = "setNewInstance(data)", imports = {}))
    public void setNewData(@Nullable List<T> data) {
        setNewInstance(data);
    }

    public void setNewInstance(@Nullable List<T> list) {
        if (list == this.data) {
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.data = list;
        g61 g61Var = this.mLoadMoreModule;
        if (g61Var != null) {
            g61Var.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        g61 g61Var2 = this.mLoadMoreModule;
        if (g61Var2 != null) {
            g61Var2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public void setOnItemChildClick(@NotNull View v, int position) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final void setOnItemChildClickListener(@Nullable mhd listener) {
    }

    public boolean setOnItemChildLongClick(@NotNull View v, int position) {
        Intrinsics.checkNotNullParameter(v, "v");
        return false;
    }

    public final void setOnItemChildLongClickListener(@Nullable nhd listener) {
    }

    public void setOnItemClick(@NotNull View v, int position) {
        Intrinsics.checkNotNullParameter(v, "v");
        qhd qhdVar = this.mOnItemClickListener;
        if (qhdVar != null) {
            qhdVar.onItemClick(this, v, position);
        }
    }

    public final void setOnItemClickListener(@Nullable qhd listener) {
        this.mOnItemClickListener = listener;
    }

    public boolean setOnItemLongClick(@NotNull View v, int position) {
        Intrinsics.checkNotNullParameter(v, "v");
        return false;
    }

    public final void setOnItemLongClickListener(@Nullable shd listener) {
    }

    public final void setUseEmpty(boolean z) {
        this.isUseEmpty = z;
    }

    public void startAnim(@NotNull Animator anim, int index) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        anim.start();
    }

    public /* synthetic */ BaseQuickAdapter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        return addFooterView$default(this, view, i, 0, 4, null);
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        return addHeaderView$default(this, view, i, 0, 4, null);
    }

    @NotNull
    public VH createBaseViewHolder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Class<?> instancedGenericKClass = null;
        for (Class<?> superclass = getClass(); instancedGenericKClass == null && superclass != null; superclass = superclass.getSuperclass()) {
            instancedGenericKClass = getInstancedGenericKClass(superclass);
        }
        VH vh = instancedGenericKClass == null ? (VH) new BaseViewHolder(view) : (VH) createBaseGenericKInstance(instancedGenericKClass, view);
        return vh == null ? (VH) new BaseViewHolder(view) : vh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((BaseViewHolder) viewHolder, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public VH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        BaseViewHolder baseViewHolderCreateBaseViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = null;
        switch (viewType) {
            case HEADER_VIEW /* 268435729 */:
                LinearLayout linearLayout = this.mHeaderLayout;
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                    linearLayout = null;
                }
                ViewParent parent2 = linearLayout.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    LinearLayout linearLayout2 = this.mHeaderLayout;
                    if (linearLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                        linearLayout2 = null;
                    }
                    viewGroup.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                } else {
                    view = linearLayout3;
                }
                return (VH) createBaseViewHolder(view);
            case LOAD_MORE_VIEW /* 268436002 */:
                g61 g61Var = this.mLoadMoreModule;
                Intrinsics.checkNotNull(g61Var);
                baseViewHolderCreateBaseViewHolder = createBaseViewHolder(g61Var.getLoadMoreView().getRootView(parent));
                g61 g61Var2 = this.mLoadMoreModule;
                Intrinsics.checkNotNull(g61Var2);
                g61Var2.setupViewHolder$com_github_CymChad_brvah(baseViewHolderCreateBaseViewHolder);
                break;
            case FOOTER_VIEW /* 268436275 */:
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                    linearLayout4 = null;
                }
                ViewParent parent3 = linearLayout4.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent3;
                    LinearLayout linearLayout5 = this.mFooterLayout;
                    if (linearLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                        linearLayout5 = null;
                    }
                    viewGroup2.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.mFooterLayout;
                if (linearLayout6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                } else {
                    view = linearLayout6;
                }
                return (VH) createBaseViewHolder(view);
            case EMPTY_VIEW /* 268436821 */:
                FrameLayout frameLayout = this.mEmptyLayout;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                    frameLayout = null;
                }
                ViewParent parent4 = frameLayout.getParent();
                if (parent4 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent4;
                    FrameLayout frameLayout2 = this.mEmptyLayout;
                    if (frameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                        frameLayout2 = null;
                    }
                    viewGroup3.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                } else {
                    view = frameLayout3;
                }
                return (VH) createBaseViewHolder(view);
            default:
                baseViewHolderCreateBaseViewHolder = onCreateDefViewHolder(parent, viewType);
                bindViewClickListener(baseViewHolderCreateBaseViewHolder, viewType);
                x11 x11Var = this.mDraggableModule;
                if (x11Var != null) {
                    x11Var.h(baseViewHolderCreateBaseViewHolder);
                }
                onItemViewHolderCreated(baseViewHolderCreateBaseViewHolder, viewType);
                break;
        }
        return (VH) baseViewHolderCreateBaseViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull VH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (isFixedViewType(holder.getItemViewType())) {
            setFullSpan(holder);
        } else {
            addAnimation(holder);
        }
    }

    public void remove(T data) {
        int iIndexOf = this.data.indexOf(data);
        if (iIndexOf == -1) {
            return;
        }
        removeAt(iIndexOf);
    }

    @JvmOverloads
    public void setDiffNewData(@Nullable List<T> list, @Nullable Runnable commitCallback) {
        if (hasEmptyView()) {
            setNewInstance(list);
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            brvahAsyncDiffer.f(list, commitCallback);
        }
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        return setFooterView$default(this, view, i, 0, 4, null);
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        return setHeaderView$default(this, view, i, 0, 4, null);
    }

    @JvmOverloads
    public BaseQuickAdapter(@LayoutRes int i, @Nullable List<T> list) {
        this.layoutResId = i;
        this.data = list == null ? new ArrayList<>() : list;
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
        this.mLastPosition = -1;
        checkModule();
        this.childClickViewIds = new LinkedHashSet<>();
        this.childLongClickViewIds = new LinkedHashSet<>();
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view, int index, int orientation) {
        int footerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = null;
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout2;
            linearLayout2.setOrientation(orientation);
            LinearLayout linearLayout3 = this.mFooterLayout;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout3 = null;
            }
            if (orientation == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout4 = this.mFooterLayout;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            linearLayout4 = null;
        }
        int childCount = linearLayout4.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout5 = this.mFooterLayout;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            linearLayout5 = null;
        }
        linearLayout5.addView(view, index);
        LinearLayout linearLayout6 = this.mFooterLayout;
        if (linearLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        } else {
            linearLayout = linearLayout6;
        }
        if (linearLayout.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return index;
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view, int index, int orientation) {
        int headerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = null;
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout2;
            linearLayout2.setOrientation(orientation);
            LinearLayout linearLayout3 = this.mHeaderLayout;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout3 = null;
            }
            if (orientation == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout4 = this.mHeaderLayout;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            linearLayout4 = null;
        }
        int childCount = linearLayout4.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout5 = this.mHeaderLayout;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            linearLayout5 = null;
        }
        linearLayout5.addView(view, index);
        LinearLayout linearLayout6 = this.mHeaderLayout;
        if (linearLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        } else {
            linearLayout = linearLayout6;
        }
        if (linearLayout.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return index;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull VH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        r91 r91Var = this.mUpFetchModule;
        if (r91Var != null) {
            r91Var.a(position);
        }
        g61 g61Var = this.mLoadMoreModule;
        if (g61Var != null) {
            g61Var.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                g61 g61Var2 = this.mLoadMoreModule;
                if (g61Var2 != null) {
                    g61Var2.getLoadMoreView().convert(holder, position, g61Var2.getLoadMoreStatus());
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()));
                break;
        }
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view, int index, int orientation) {
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout3 = this.mFooterLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                    linearLayout3 = null;
                }
                linearLayout3.removeViewAt(index);
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                } else {
                    linearLayout2 = linearLayout4;
                }
                linearLayout2.addView(view, index);
                return index;
            }
        }
        return addFooterView(view, index, orientation);
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view, int index, int orientation) {
        Intrinsics.checkNotNullParameter(view, "view");
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                    linearLayout3 = null;
                }
                linearLayout3.removeViewAt(index);
                LinearLayout linearLayout4 = this.mHeaderLayout;
                if (linearLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                } else {
                    linearLayout2 = linearLayout4;
                }
                linearLayout2.addView(view, index);
                return index;
            }
        }
        return addHeaderView(view, index, orientation);
    }

    public void addData(@NonNull T data) {
        this.data.add(data);
        notifyItemInserted(this.data.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void setDiffNewData(@NonNull @NotNull DiffUtil.DiffResult diffResult, @NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            diffResult.dispatchUpdatesTo(new BrvahListUpdateCallback(this));
            this.data = list;
        }
    }

    public void addData(@IntRange(from = 0) int position, @NotNull Collection<? extends T> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.data.addAll(position, newData);
        notifyItemRangeInserted(position + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public void onBindViewHolder(@NotNull VH holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder((BaseViewHolder) holder, position);
        }
        r91 r91Var = this.mUpFetchModule;
        if (r91Var != null) {
            r91Var.a(position);
        }
        g61 g61Var = this.mLoadMoreModule;
        if (g61Var != null) {
            g61Var.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                g61 g61Var2 = this.mLoadMoreModule;
                if (g61Var2 != null) {
                    g61Var2.getLoadMoreView().convert(holder, position, g61Var2.getLoadMoreStatus());
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()), payloads);
                break;
        }
    }

    public void addData(@NonNull @NotNull Collection<? extends T> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.data.addAll(newData);
        notifyItemRangeInserted((this.data.size() - newData.size()) + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public final void setEmptyView(int layoutResId) {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView != null) {
            View view = LayoutInflater.from(recyclerView.getContext()).inflate(layoutResId, (ViewGroup) recyclerView, false);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            setEmptyView(view);
        }
    }
}
