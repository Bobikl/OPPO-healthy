package com.oplus.mydevices.sdk.device;

import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import androidx.core.internal.view.SupportMenu;
import com.google.gson.annotations.SerializedName;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.sgm;
import com.oplus.mydevices.sdk.PrivacyMaskUtils;
import com.oplus.mydevices.sdk.Utils;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bt\n\u0002\u0010\u0002\n\u0002\b8\b\u0087\b\u0018\u0000 ã\u00012\u00020\u0001:\u0004â\u0001ã\u0001BÉ\u0003\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001f\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\b\b\u0002\u0010$\u001a\u00020\u0013\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010+\u001a\u00020\n\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010.\u001a\u00020\n\u0012\b\b\u0002\u0010/\u001a\u00020\u0018\u0012\b\b\u0002\u00100\u001a\u00020\u0013\u0012\b\b\u0002\u00101\u001a\u00020\u0013\u0012\u0018\b\u0002\u00102\u001a\u0012\u0012\u0004\u0012\u00020*03j\b\u0012\u0004\u0012\u00020*`4\u0012\b\b\u0002\u00105\u001a\u00020\u0013\u0012\u0018\b\u0002\u00106\u001a\u0012\u0012\u0004\u0012\u00020703j\b\u0012\u0004\u0012\u000207`4\u0012\u0018\b\u0002\u00108\u001a\u0012\u0012\u0004\u0012\u00020\n03j\b\u0012\u0004\u0012\u00020\n`4¢\u0006\u0002\u00109J\u0011\u0010«\u0001\u001a\u00030¬\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\nJ\n\u0010®\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010°\u0001\u001a\u00020\nHÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010²\u0001\u001a\u00020\nHÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010´\u0001\u001a\u00020\nHÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\nHÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0003HÆ\u0003J\u0012\u0010º\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fHÆ\u0003J\u0012\u0010»\u0001\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001fHÆ\u0003J\n\u0010¼\u0001\u001a\u00020\nHÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0013HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\nHÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\nHÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0013HÆ\u0003J\u001a\u0010É\u0001\u001a\u0012\u0012\u0004\u0012\u00020*03j\b\u0012\u0004\u0012\u00020*`4HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0013HÆ\u0003J\u001a\u0010Ë\u0001\u001a\u0012\u0012\u0004\u0012\u00020703j\b\u0012\u0004\u0012\u000207`4HÂ\u0003J\u001a\u0010Ì\u0001\u001a\u0012\u0012\u0004\u0012\u00020\n03j\b\u0012\u0004\u0012\u00020\n`4HÂ\u0003J\n\u0010Í\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010Ï\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010Ñ\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003JÜ\u0003\u0010Ó\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001f2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00132\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010.\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u00020\u00182\b\b\u0002\u00100\u001a\u00020\u00132\b\b\u0002\u00101\u001a\u00020\u00132\u0018\b\u0002\u00102\u001a\u0012\u0012\u0004\u0012\u00020*03j\b\u0012\u0004\u0012\u00020*`42\b\b\u0002\u00105\u001a\u00020\u00132\u0018\b\u0002\u00106\u001a\u0012\u0012\u0004\u0012\u00020703j\b\u0012\u0004\u0012\u000207`42\u0018\b\u0002\u00108\u001a\u0012\u0012\u0004\u0012\u00020\n03j\b\u0012\u0004\u0012\u00020\n`4HÆ\u0001¢\u0006\u0003\u0010Ô\u0001J\u0015\u0010Õ\u0001\u001a\u00020\u00132\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0007\u0010×\u0001\u001a\u00020\fJ\n\u0010Ø\u0001\u001a\u00020\nHÖ\u0001J\u0007\u0010Ù\u0001\u001a\u00020\u0013J\u0007\u0010Ú\u0001\u001a\u00020\u0013J\u0007\u0010Û\u0001\u001a\u00020\u0013J\u0007\u0010Ü\u0001\u001a\u00020\u0013J\u0010\u0010Ý\u0001\u001a\u00020\u00132\u0007\u0010Þ\u0001\u001a\u00020\nJ\u0011\u0010ß\u0001\u001a\u00030¬\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\nJ\u0010\u0010à\u0001\u001a\u00030¬\u00012\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010á\u0001\u001a\u00020\u0003H\u0016R*\u0010:\u001a\u0012\u0012\u0004\u0012\u00020703j\b\u0012\u0004\u0012\u000207`48FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FRJ\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\n03j\b\u0012\u0004\u0012\u00020\n`42\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\n03j\b\u0012\u0004\u0012\u00020\n`48F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bI\u0010<\u001a\u0004\bJ\u0010>\"\u0004\bK\u0010LR\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010N\"\u0004\bR\u0010PR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010XR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010d\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010N\"\u0004\bf\u0010PR\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010X\"\u0004\bh\u0010ZR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010@\"\u0004\bi\u0010BR$\u00105\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bj\u0010<\u001a\u0004\b5\u0010@\"\u0004\bk\u0010BR\u001a\u0010#\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010N\"\u0004\bm\u0010PR(\u00106\u001a\u0012\u0012\u0004\u0012\u00020703j\b\u0012\u0004\u0012\u000207`48\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\bn\u0010<R&\u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bo\u0010<\u001a\u0004\bp\u0010X\"\u0004\bq\u0010ZR(\u00108\u001a\u0012\u0012\u0004\u0012\u00020\n03j\b\u0012\u0004\u0012\u00020\n`48\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\br\u0010<R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010/\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bw\u0010<\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R$\u0010+\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b|\u0010<\u001a\u0004\b}\u0010N\"\u0004\b~\u0010PR\u001d\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010X\"\u0005\b\u0080\u0001\u0010ZR'\u00100\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0081\u0001\u0010<\u001a\u0005\b\u0082\u0001\u0010@\"\u0005\b\u0083\u0001\u0010BR'\u00101\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0084\u0001\u0010<\u001a\u0005\b\u0085\u0001\u0010@\"\u0005\b\u0086\u0001\u0010BR'\u0010.\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0087\u0001\u0010<\u001a\u0005\b\u0088\u0001\u0010N\"\u0005\b\u0089\u0001\u0010PR7\u00102\u001a\u0012\u0012\u0004\u0012\u00020*03j\b\u0012\u0004\u0012\u00020*`48\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u008a\u0001\u0010<\u001a\u0005\b\u008b\u0001\u0010>\"\u0005\b\u008c\u0001\u0010LR+\u0010)\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b\u008d\u0001\u0010<\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010XR \u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010X\"\u0005\b\u0094\u0001\u0010ZR \u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010X\"\u0005\b\u0096\u0001\u0010ZR$\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010D\"\u0005\b\u0098\u0001\u0010FR\u001c\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010N\"\u0005\b\u009a\u0001\u0010PR$\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010D\"\u0005\b\u009c\u0001\u0010FR\u001c\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010y\"\u0005\b\u009e\u0001\u0010{R$\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R$\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010\u001d\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010y\"\u0005\b¨\u0001\u0010{R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010X\"\u0005\bª\u0001\u0010Z¨\u0006ä\u0001"}, d2 = {"Lcom/oplus/mydevices/sdk/device/DeviceInfo;", "", "deviceId", "", "macAddress", "modelId", "name", "type", "Lcom/oplus/mydevices/sdk/device/DeviceType;", "deviceSecondaryType", "", "connection", "Lcom/oplus/mydevices/sdk/device/Connection;", "batteryInfoList", "", "Lcom/oplus/mydevices/sdk/device/BatteryInfo;", "useState", "Lcom/oplus/mydevices/sdk/device/UseState;", "isActive", "", "status", "data", "feature", "timestamp", "", "connectProtocol", "iconUrl", RunningPostureVideoActivity.VIDEO_PATH, "cardStyle", "versionCode", "shortcuts", "", "Lcom/oplus/mydevices/sdk/device/ShortcutMenu;", "switchMenuList", "Lcom/oplus/mydevices/sdk/device/SwitchMenu;", "linkageVersion", "autoSwitch", "mConnectState", "Lcom/oplus/mydevices/sdk/device/ConnectState;", "deviceEventMessage", "Lcom/oplus/mydevices/sdk/device/DeviceEventMessage;", "mTemplateType", "Lcom/oplus/mydevices/sdk/device/TemplateType;", "mDeviceIcon", "mIconUrl", "mAuthority", "mPriority", "mConnectTime", "mIsSupportAudioConnect", "mIsSupportMultiConnect", "mTemplateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isSupportNoiseCanceling", "mActionMenuList", "Lcom/oplus/mydevices/sdk/device/ActionMenu;", "mBatteryList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/mydevices/sdk/device/DeviceType;Ljava/lang/Integer;Lcom/oplus/mydevices/sdk/device/Connection;Ljava/util/List;Lcom/oplus/mydevices/sdk/device/UseState;ZILjava/lang/String;IJILjava/lang/String;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;IZLcom/oplus/mydevices/sdk/device/ConnectState;Lcom/oplus/mydevices/sdk/device/DeviceEventMessage;Lcom/oplus/mydevices/sdk/device/TemplateType;ILjava/lang/String;Ljava/lang/String;IJZZLjava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V", "actionMenuList", "getActionMenuList$annotations", "()V", "getActionMenuList", "()Ljava/util/ArrayList;", "getAutoSwitch", "()Z", "setAutoSwitch", "(Z)V", "getBatteryInfoList", "()Ljava/util/List;", "setBatteryInfoList", "(Ljava/util/List;)V", "value", "batteryList", "getBatteryList$annotations", "getBatteryList", "setBatteryList", "(Ljava/util/ArrayList;)V", "getCardStyle", "()I", "setCardStyle", "(I)V", "getConnectProtocol", "setConnectProtocol", "getConnection", "()Lcom/oplus/mydevices/sdk/device/Connection;", "setConnection", "(Lcom/oplus/mydevices/sdk/device/Connection;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getDeviceEventMessage", "()Lcom/oplus/mydevices/sdk/device/DeviceEventMessage;", "setDeviceEventMessage", "(Lcom/oplus/mydevices/sdk/device/DeviceEventMessage;)V", "getDeviceId", "getDeviceSecondaryType", "()Ljava/lang/Integer;", "setDeviceSecondaryType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFeature", "setFeature", "getIconUrl", "setIconUrl", "setActive", "isSupportNoiseCanceling$annotations", "setSupportNoiseCanceling", "getLinkageVersion", "setLinkageVersion", "getMActionMenuList$annotations", "getMAuthority$annotations", "getMAuthority", "setMAuthority", "getMBatteryList$annotations", "getMConnectState", "()Lcom/oplus/mydevices/sdk/device/ConnectState;", "setMConnectState", "(Lcom/oplus/mydevices/sdk/device/ConnectState;)V", "getMConnectTime$annotations", "getMConnectTime", "()J", "setMConnectTime", "(J)V", "getMDeviceIcon$annotations", "getMDeviceIcon", "setMDeviceIcon", "getMIconUrl", "setMIconUrl", "getMIsSupportAudioConnect$annotations", "getMIsSupportAudioConnect", "setMIsSupportAudioConnect", "getMIsSupportMultiConnect$annotations", "getMIsSupportMultiConnect", "setMIsSupportMultiConnect", "getMPriority$annotations", "getMPriority", "setMPriority", "getMTemplateList$annotations", "getMTemplateList", "setMTemplateList", "getMTemplateType$annotations", "getMTemplateType", "()Lcom/oplus/mydevices/sdk/device/TemplateType;", "setMTemplateType", "(Lcom/oplus/mydevices/sdk/device/TemplateType;)V", "getMacAddress", "getModelId", "setModelId", "getName", "setName", "getShortcuts", "setShortcuts", "getStatus", "setStatus", "getSwitchMenuList", "setSwitchMenuList", "getTimestamp", "setTimestamp", "getType", "()Lcom/oplus/mydevices/sdk/device/DeviceType;", "setType", "(Lcom/oplus/mydevices/sdk/device/DeviceType;)V", "getUseState", "()Lcom/oplus/mydevices/sdk/device/UseState;", "setUseState", "(Lcom/oplus/mydevices/sdk/device/UseState;)V", "getVersionCode", "setVersionCode", "getVideoUrl", "setVideoUrl", "addFeature", "", "flag", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/mydevices/sdk/device/DeviceType;Ljava/lang/Integer;Lcom/oplus/mydevices/sdk/device/Connection;Ljava/util/List;Lcom/oplus/mydevices/sdk/device/UseState;ZILjava/lang/String;IJILjava/lang/String;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;IZLcom/oplus/mydevices/sdk/device/ConnectState;Lcom/oplus/mydevices/sdk/device/DeviceEventMessage;Lcom/oplus/mydevices/sdk/device/TemplateType;ILjava/lang/String;Ljava/lang/String;IJZZLjava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;)Lcom/oplus/mydevices/sdk/device/DeviceInfo;", "equals", "other", "getConnectionCompat", "hashCode", "isMultiConnectLinkageVersion", "isSingleConnectLinkageVersion", "isSupportDeviceLinkage", "isSupportMultiConnect", "isSupportVersion", "version", "removeFeature", "setConnectionCompat", "toString", "Builder", "Companion", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class DeviceInfo {
    public static final int CARD_STYLE_LARGE = 4;
    public static final int CARD_STYLE_MEDIUM = 2;
    public static final int CARD_STYLE_SMALL = 1;

    @NotNull
    public static final String DEFAULT_MODEL_ID_SUFFIX = "common-model";
    public static final int FEATURE_SMART_HOME_DEVICE = 64;
    public static final int FEATURE_SUPPORT_AUTO_CONNECT_BY_BLE = 512;
    public static final int FEATURE_SUPPORT_HEADSET_NOISE_CANCELING = 4;
    public static final int FEATURE_SUPPORT_IN_EAR_DETECTION_MUSIC_MUTE = 128;
    public static final int FEATURE_SUPPORT_LINKAGE = 1;
    public static final int FEATURE_SUPPORT_MULTI_CONNECT = 2;
    public static final int FEATURE_SUPPORT_SET_ALIAS_BY_BT = 8;
    public static final int FEATURE_SUPPORT_SET_ALIAS_BY_DEVICE_APP = 16;
    public static final int FEATURE_SUPPORT_SET_ALIAS_BY_ONET = 32;
    public static final int FEATURE_SUPPORT_SYNERGY_DEVICE = 256;
    public static final int LINKAGE_VERSION_MULTI_CONNECT = 2;
    public static final int LINKAGE_VERSION_NONE = 0;
    public static final int LINKAGE_VERSION_SINGLE_CONNECT = 1;
    public static final int PROTOCOL_BLUETOOTH = 8;
    public static final int PROTOCOL_DEVICE_OWN = 2;
    public static final int PROTOCOL_OAF = 4;
    public static final int PROTOCOL_ONET = 1;
    public static final int PROTOCOL_UNKNOWN = -1;
    public static final int STATUS_HEADSET_LEFT_IN_EAR = 1;
    public static final int STATUS_HEADSET_RIGHT_IN_EAR = 2;
    public static final int STATUS_TV_OPEN_STATUS = 1;
    public static final int STATUS_TV_SCREEN_CAST_STATUS = 2;
    private boolean autoSwitch;

    @SerializedName("mBatteryInfoList")
    @NotNull
    private List<BatteryInfo> batteryInfoList;
    private int cardStyle;
    private int connectProtocol;

    @Nullable
    private Connection connection;

    @NotNull
    private String data;

    @Nullable
    private DeviceEventMessage deviceEventMessage;

    @SerializedName("mDeviceId")
    @NotNull
    private final String deviceId;

    @Nullable
    private Integer deviceSecondaryType;
    private int feature;

    @NotNull
    private String iconUrl;
    private boolean isActive;
    private boolean isSupportNoiseCanceling;
    private int linkageVersion;
    private ArrayList<ActionMenu> mActionMenuList;

    @Nullable
    private String mAuthority;
    private ArrayList<Integer> mBatteryList;

    @Nullable
    private ConnectState mConnectState;
    private long mConnectTime;
    private int mDeviceIcon;

    @Nullable
    private String mIconUrl;
    private boolean mIsSupportAudioConnect;
    private boolean mIsSupportMultiConnect;
    private int mPriority;

    @NotNull
    private ArrayList<TemplateType> mTemplateList;

    @Nullable
    private TemplateType mTemplateType;

    @SerializedName("mMacAddress")
    @NotNull
    private final String macAddress;

    @SerializedName("modelId")
    @NotNull
    private String modelId;

    @SerializedName("mDeviceName")
    @NotNull
    private String name;

    @Nullable
    private List<ShortcutMenu> shortcuts;
    private int status;

    @Nullable
    private List<SwitchMenu> switchMenuList;
    private long timestamp;

    @SerializedName("mDeviceType")
    @Nullable
    private DeviceType type;

    @SerializedName("mUseState")
    @Nullable
    private UseState useState;
    private long versionCode;

    @Nullable
    private String videoUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u00108\u001a\u00020\u00002\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eJ\u000e\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0006J\u0010\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0010H\u0007J\u001e\u0010=\u001a\u00020\u00002\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u00130\fj\b\u0012\u0004\u0012\u00020\u0013`\u000eJ \u0010?\u001a\u00020\u00002\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\u000eH\u0007J\u0006\u0010@\u001a\u00020AJ\u000e\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0006J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0018H\u0007J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u001aJ\u0010\u0010F\u001a\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0010J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0010J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\"J\u0010\u0010M\u001a\u00020\u00002\b\b\u0001\u0010M\u001a\u00020\u0006J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0010J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0010J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u0010J\u0010\u0010S\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0006H\u0007J\u000e\u0010T\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\tJ\u000e\u0010X\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u0006J\u000e\u0010Z\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\u0010J\u000e\u0010\\\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010]\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010^\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u0006J\"\u0010a\u001a\u00020\u00002\u001a\u0010b\u001a\u0016\u0012\u0004\u0012\u00020-\u0018\u00010\fj\n\u0012\u0004\u0012\u00020-\u0018\u0001`\u000eJ\u000e\u0010c\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u0006J\u0010\u0010e\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\tH\u0007J\u0010\u0010g\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\tH\u0007J\u0010\u0010h\u001a\u00020\u00002\u0006\u0010f\u001a\u00020\tH\u0007J\"\u0010i\u001a\u00020\u00002\u001a\u0010j\u001a\u0016\u0012\u0004\u0012\u000206\u0018\u00010\fj\n\u0012\u0004\u0012\u000206\u0018\u0001`\u000eJ\u000e\u0010k\u001a\u00020\u00002\u0006\u0010l\u001a\u00020\u001aJ\u000e\u0010m\u001a\u00020\u00002\u0006\u0010m\u001a\u000200J\u000e\u0010n\u001a\u00020\u00002\u0006\u0010n\u001a\u000203J\u000e\u0010o\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u001aJ\u000e\u00107\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\fj\b\u0012\u0004\u0012\u00020\u0013`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006p"}, d2 = {"Lcom/oplus/mydevices/sdk/device/DeviceInfo$Builder;", "", "()V", "deviceEventMessage", "Lcom/oplus/mydevices/sdk/device/DeviceEventMessage;", "deviceSecondaryType", "", "Ljava/lang/Integer;", "isActive", "", "isSupportNoiseCanceling", "mActionMenuList", "Ljava/util/ArrayList;", "Lcom/oplus/mydevices/sdk/device/ActionMenu;", "Lkotlin/collections/ArrayList;", "mAuthority", "", "mAutoSwitch", "mBatteryInfoList", "Lcom/oplus/mydevices/sdk/device/BatteryInfo;", "mBatteryList", "mCardStyle", "mConnectProtocol", "mConnectState", "Lcom/oplus/mydevices/sdk/device/ConnectState;", "mConnectTime", "", "mConnection", "Lcom/oplus/mydevices/sdk/device/Connection;", "mData", "mDeviceIcon", "mDeviceId", "mDeviceName", "mDeviceType", "Lcom/oplus/mydevices/sdk/device/DeviceType;", "mFeature", "mIconUrl", "mIsSupportAudioConnect", "mIsSupportMultiConnect", "mLinkageVersion", "mMacAddress", "mModelId", "mPriority", "mShortcuts", "", "Lcom/oplus/mydevices/sdk/device/ShortcutMenu;", "mStatus", "mTemplateType", "Lcom/oplus/mydevices/sdk/device/TemplateType;", "mTimestamp", "mUseState", "Lcom/oplus/mydevices/sdk/device/UseState;", "mVersionCode", "switchMenuList", "Lcom/oplus/mydevices/sdk/device/SwitchMenu;", RunningPostureVideoActivity.VIDEO_PATH, "actionList", "list", "addFeature", "feature", sgm.f16582n, "batteryInfoList", "value", "batteryList", jla.DEFAULT_BUILD_METHOD, "Lcom/oplus/mydevices/sdk/device/DeviceInfo;", "connectProtocol", ServiceNodeBundleKeys.CONNECT_STATE, "state", "connectTime", "connection", "deviceId", "id", ServiceNodeBundleKeys.DEVICE_NAME, "name", "deviceType", "type", "icon", "iconUrl", "url", "mac", "address", "modelId", "priority", "removeFeature", "setActive", "setAutoSwitch", "autoSwitch", "setCardStyle", Const.Arguments.Open.STYLE, "setData", "data", "setDeviceEvent", "setDeviceSecondaryType", "setFeature", "setLinkageVersion", "version", "setShortcuts", "shortcuts", "setStatus", "status", "setSupportAudioConnect", "support", "setSupportMultiConnect", "setSupportNoiseCanceling", "setSwitchMenuList", "menuList", "setTimestamp", "timestamp", "templateType", "useState", "versionCode", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {
        private DeviceEventMessage deviceEventMessage;
        private Integer deviceSecondaryType;
        private boolean isActive;
        private boolean isSupportNoiseCanceling;
        private boolean mAutoSwitch;
        private int mCardStyle;
        private int mConnectProtocol;
        private ConnectState mConnectState;
        private long mConnectTime;
        private Connection mConnection;
        private DeviceType mDeviceType;
        private int mFeature;
        private String mIconUrl;
        private boolean mIsSupportAudioConnect;
        private boolean mIsSupportMultiConnect;
        private int mLinkageVersion;
        private int mPriority;
        private int mStatus;
        private TemplateType mTemplateType;
        private long mTimestamp;
        private UseState mUseState;
        private long mVersionCode;
        private String videoUrl;
        private String mMacAddress = "";
        private String mDeviceId = "";
        private String mDeviceName = "";
        private int mDeviceIcon = -1;
        private String mAuthority = "";
        private ArrayList<ActionMenu> mActionMenuList = new ArrayList<>();
        private ArrayList<Integer> mBatteryList = new ArrayList<>();
        private ArrayList<BatteryInfo> mBatteryInfoList = new ArrayList<>();
        private List<SwitchMenu> switchMenuList = new ArrayList();
        private List<ShortcutMenu> mShortcuts = new ArrayList();
        private String mModelId = "";
        private String mData = "";

        @NotNull
        public final Builder actionList(@NotNull ArrayList<ActionMenu> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.mActionMenuList = list;
            return this;
        }

        @NotNull
        public final Builder addFeature(int feature) {
            this.mFeature = Utils.addFlag(this.mFeature, feature);
            return this;
        }

        @Deprecated(message = "deprecated at os 12")
        @NotNull
        public final Builder auth(@NotNull String auth) {
            Intrinsics.checkNotNullParameter(auth, "auth");
            this.mAuthority = auth;
            return this;
        }

        @NotNull
        public final Builder batteryInfoList(@NotNull ArrayList<BatteryInfo> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.mBatteryInfoList.clear();
            this.mBatteryInfoList.addAll(CollectionsKt___CollectionsKt.sortedWith(value, new Comparator<T>() { // from class: com.oplus.mydevices.sdk.device.DeviceInfo$Builder$$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    BatteryType batteryType = ((BatteryInfo) t).getBatteryType();
                    Integer numValueOf = batteryType != null ? Integer.valueOf(batteryType.ordinal()) : null;
                    BatteryType batteryType2 = ((BatteryInfo) t2).getBatteryType();
                    return ComparisonsKt__ComparisonsKt.compareValues(numValueOf, batteryType2 != null ? Integer.valueOf(batteryType2.ordinal()) : null);
                }
            }));
            this.mBatteryList.clear();
            ArrayList<Integer> arrayList = this.mBatteryList;
            List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(this.mBatteryInfoList, new Comparator<T>() { // from class: com.oplus.mydevices.sdk.device.DeviceInfo$Builder$$special$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    BatteryType batteryType = ((BatteryInfo) t).getBatteryType();
                    Integer numValueOf = batteryType != null ? Integer.valueOf(batteryType.ordinal()) : null;
                    BatteryType batteryType2 = ((BatteryInfo) t2).getBatteryType();
                    return ComparisonsKt__ComparisonsKt.compareValues(numValueOf, batteryType2 != null ? Integer.valueOf(batteryType2.ordinal()) : null);
                }
            });
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
            Iterator it = listSortedWith.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((BatteryInfo) it.next()).getValue()));
            }
            arrayList.addAll(arrayList2);
            return this;
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "batteryList is deprecated for multi battery", replaceWith = @ReplaceWith(expression = "batteryInfoList", imports = {}))
        @NotNull
        public final Builder batteryList(@NotNull ArrayList<Integer> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.mBatteryList = value;
            return this;
        }

        @NotNull
        public final DeviceInfo build() {
            String str = this.mMacAddress;
            String str2 = this.mDeviceId;
            String str3 = this.mDeviceName;
            String str4 = str3 != null ? str3 : "";
            int i = this.mStatus;
            String str5 = this.mModelId;
            String str6 = this.mData;
            int i2 = this.mFeature;
            int i3 = this.mConnectProtocol;
            ArrayList<BatteryInfo> arrayList = this.mBatteryInfoList;
            boolean z = this.isActive;
            long j2 = this.mTimestamp;
            Connection connection = this.mConnection;
            long j3 = this.mVersionCode;
            DeviceType deviceType = this.mDeviceType;
            Integer num = this.deviceSecondaryType;
            DeviceEventMessage deviceEventMessage = this.deviceEventMessage;
            String str7 = this.mIconUrl;
            String str8 = str7 != null ? str7 : "";
            int i4 = 0;
            String str9 = this.videoUrl;
            String str10 = str9 != null ? str9 : "";
            UseState useState = this.mUseState;
            String str11 = this.mAuthority;
            ConnectState connectState = this.mConnectState;
            int i5 = this.mDeviceIcon;
            ArrayList<ActionMenu> arrayList2 = this.mActionMenuList;
            ArrayList<Integer> arrayList3 = this.mBatteryList;
            return new DeviceInfo(str2, str, str5, str4, deviceType, num, connection, arrayList, useState, z, i, str6, i2, j2, i3, str8, str10, i4, j3, this.mShortcuts, this.switchMenuList, this.mLinkageVersion, this.mAutoSwitch, connectState, deviceEventMessage, this.mTemplateType, i5, str7, str11, this.mPriority, this.mConnectTime, this.mIsSupportAudioConnect, this.mIsSupportMultiConnect, null, this.isSupportNoiseCanceling, arrayList2, arrayList3, 131072, 2, null);
        }

        @NotNull
        public final Builder connectProtocol(int connectProtocol) {
            this.mConnectProtocol = connectProtocol;
            return this;
        }

        @Deprecated(message = "deprecated at os 12, use connection instead.")
        @NotNull
        public final Builder connectState(@NotNull ConnectState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.mConnectState = state;
            this.mConnection = new Connection(state, 0L, 0L);
            return this;
        }

        @NotNull
        public final Builder connectTime(long connectTime) {
            this.mConnectTime = connectTime;
            return this;
        }

        @NotNull
        public final Builder connection(@Nullable Connection connection) {
            this.mConnectState = connection != null ? connection.getConnectState() : null;
            this.mConnectTime = connection != null ? connection.getLastConnectTime() : 0L;
            this.mConnection = connection;
            return this;
        }

        @NotNull
        public final Builder deviceId(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.mDeviceId = id;
            return this;
        }

        @NotNull
        public final Builder deviceName(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.mDeviceName = name;
            return this;
        }

        @NotNull
        public final Builder deviceType(@NotNull DeviceType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.mDeviceType = type;
            return this;
        }

        @NotNull
        public final Builder icon(@DrawableRes int icon) {
            this.mDeviceIcon = icon;
            return this;
        }

        @NotNull
        public final Builder iconUrl(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.mIconUrl = url;
            return this;
        }

        @NotNull
        public final Builder mac(@NotNull String address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.mMacAddress = address;
            return this;
        }

        @NotNull
        public final Builder modelId(@NotNull String modelId) {
            Intrinsics.checkNotNullParameter(modelId, "modelId");
            this.mModelId = modelId;
            return this;
        }

        @Deprecated(message = "deprecated at os 12")
        @NotNull
        public final Builder priority(int priority) {
            this.mPriority = priority;
            return this;
        }

        @NotNull
        public final Builder removeFeature(int feature) {
            this.mFeature = Utils.removeFlag(this.mFeature, feature);
            return this;
        }

        @NotNull
        public final Builder setActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        @NotNull
        public final Builder setAutoSwitch(boolean autoSwitch) {
            this.mAutoSwitch = autoSwitch;
            return this;
        }

        @NotNull
        public final Builder setCardStyle(int style) {
            this.mCardStyle = style;
            return this;
        }

        @NotNull
        public final Builder setData(@NotNull String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.mData = data;
            return this;
        }

        @NotNull
        public final Builder setDeviceEvent(@NotNull DeviceEventMessage deviceEventMessage) {
            Intrinsics.checkNotNullParameter(deviceEventMessage, "deviceEventMessage");
            this.deviceEventMessage = deviceEventMessage;
            return this;
        }

        @NotNull
        public final Builder setDeviceSecondaryType(int deviceSecondaryType) {
            this.deviceSecondaryType = Integer.valueOf(deviceSecondaryType);
            return this;
        }

        @NotNull
        public final Builder setFeature(int feature) {
            this.mIsSupportAudioConnect = (feature & 1) == 1;
            this.mIsSupportMultiConnect = (feature & 2) == 2;
            this.isSupportNoiseCanceling = (feature & 4) == 4;
            this.mFeature = feature;
            return this;
        }

        @NotNull
        public final Builder setLinkageVersion(int version) {
            this.mLinkageVersion = version;
            return this;
        }

        @NotNull
        public final Builder setShortcuts(@Nullable ArrayList<ShortcutMenu> shortcuts) {
            this.mShortcuts = shortcuts;
            return this;
        }

        @NotNull
        public final Builder setStatus(int status) {
            this.mStatus = status;
            return this;
        }

        @Deprecated(message = "deprecated at os 12")
        @NotNull
        public final Builder setSupportAudioConnect(boolean support) {
            this.mIsSupportAudioConnect = support;
            return this;
        }

        @Deprecated(message = "deprecated at os 12")
        @NotNull
        public final Builder setSupportMultiConnect(boolean support) {
            this.mIsSupportMultiConnect = support;
            return this;
        }

        @Deprecated(message = "deprecated at os 12")
        @NotNull
        public final Builder setSupportNoiseCanceling(boolean support) {
            this.isSupportNoiseCanceling = support;
            return this;
        }

        @NotNull
        public final Builder setSwitchMenuList(@Nullable ArrayList<SwitchMenu> menuList) {
            this.switchMenuList = menuList;
            return this;
        }

        @NotNull
        public final Builder setTimestamp(long timestamp) {
            this.mTimestamp = timestamp;
            return this;
        }

        @NotNull
        public final Builder templateType(@NotNull TemplateType templateType) {
            Intrinsics.checkNotNullParameter(templateType, "templateType");
            this.mTemplateType = templateType;
            return this;
        }

        @NotNull
        public final Builder useState(@NotNull UseState useState) {
            Intrinsics.checkNotNullParameter(useState, "useState");
            this.mUseState = useState;
            return this;
        }

        @NotNull
        public final Builder versionCode(long version) {
            this.mVersionCode = version;
            return this;
        }

        @NotNull
        public final Builder videoUrl(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.videoUrl = url;
            return this;
        }
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull String str5) {
        this(str, str2, str3, str4, deviceType, num, connection, null, null, false, 0, str5, 0, 0L, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -2176, 31, null);
    }

    private final ArrayList<ActionMenu> component36() {
        return this.mActionMenuList;
    }

    private final ArrayList<Integer> component37() {
        return this.mBatteryList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, DeviceType deviceType, Integer num, Connection connection, List list, UseState useState, boolean z, int i, String str5, int i2, long j2, int i3, String str6, String str7, int i4, long j3, List list2, List list3, int i5, boolean z2, ConnectState connectState, DeviceEventMessage deviceEventMessage, TemplateType templateType, int i6, String str8, String str9, int i7, long j4, boolean z3, boolean z4, ArrayList arrayList, boolean z5, ArrayList arrayList2, ArrayList arrayList3, int i8, int i9, Object obj) {
        String str10 = (i8 & 1) != 0 ? deviceInfo.deviceId : str;
        String str11 = (i8 & 2) != 0 ? deviceInfo.macAddress : str2;
        String str12 = (i8 & 4) != 0 ? deviceInfo.modelId : str3;
        String str13 = (i8 & 8) != 0 ? deviceInfo.name : str4;
        DeviceType deviceType2 = (i8 & 16) != 0 ? deviceInfo.type : deviceType;
        Integer num2 = (i8 & 32) != 0 ? deviceInfo.deviceSecondaryType : num;
        Connection connection2 = (i8 & 64) != 0 ? deviceInfo.connection : connection;
        List list4 = (i8 & 128) != 0 ? deviceInfo.batteryInfoList : list;
        UseState useState2 = (i8 & 256) != 0 ? deviceInfo.useState : useState;
        boolean z6 = (i8 & 512) != 0 ? deviceInfo.isActive : z;
        int i10 = (i8 & 1024) != 0 ? deviceInfo.status : i;
        String str14 = (i8 & 2048) != 0 ? deviceInfo.data : str5;
        int i11 = (i8 & 4096) != 0 ? deviceInfo.feature : i2;
        long j5 = (i8 & 8192) != 0 ? deviceInfo.timestamp : j2;
        int i12 = (i8 & 16384) != 0 ? deviceInfo.connectProtocol : i3;
        return deviceInfo.copy(str10, str11, str12, str13, deviceType2, num2, connection2, list4, useState2, z6, i10, str14, i11, j5, i12, (32768 & i8) != 0 ? deviceInfo.iconUrl : str6, (i8 & 65536) != 0 ? deviceInfo.videoUrl : str7, (i8 & 131072) != 0 ? deviceInfo.cardStyle : i4, (i8 & 262144) != 0 ? deviceInfo.versionCode : j3, (i8 & 524288) != 0 ? deviceInfo.shortcuts : list2, (1048576 & i8) != 0 ? deviceInfo.switchMenuList : list3, (i8 & 2097152) != 0 ? deviceInfo.linkageVersion : i5, (i8 & 4194304) != 0 ? deviceInfo.autoSwitch : z2, (i8 & 8388608) != 0 ? deviceInfo.mConnectState : connectState, (i8 & 16777216) != 0 ? deviceInfo.deviceEventMessage : deviceEventMessage, (i8 & 33554432) != 0 ? deviceInfo.mTemplateType : templateType, (i8 & 67108864) != 0 ? deviceInfo.mDeviceIcon : i6, (i8 & 134217728) != 0 ? deviceInfo.mIconUrl : str8, (i8 & 268435456) != 0 ? deviceInfo.mAuthority : str9, (i8 & 536870912) != 0 ? deviceInfo.mPriority : i7, (i8 & 1073741824) != 0 ? deviceInfo.mConnectTime : j4, (i8 & Integer.MIN_VALUE) != 0 ? deviceInfo.mIsSupportAudioConnect : z3, (i9 & 1) != 0 ? deviceInfo.mIsSupportMultiConnect : z4, (i9 & 2) != 0 ? deviceInfo.mTemplateList : arrayList, (i9 & 4) != 0 ? deviceInfo.isSupportNoiseCanceling : z5, (i9 & 8) != 0 ? deviceInfo.mActionMenuList : arrayList2, (i9 & 16) != 0 ? deviceInfo.mBatteryList : arrayList3);
    }

    @Deprecated(message = "deprecated at os 12")
    public static /* synthetic */ void getActionMenuList$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "battery list is deprecated for multi battery", replaceWith = @ReplaceWith(expression = "batteryInfoList", imports = {}))
    public static /* synthetic */ void getBatteryList$annotations() {
    }

    @Deprecated(message = "deprecated at os 12")
    private static /* synthetic */ void getMActionMenuList$annotations() {
    }

    @Deprecated(message = "deprecated at os 12")
    public static /* synthetic */ void getMAuthority$annotations() {
    }

    @Deprecated(message = "deprecated")
    private static /* synthetic */ void getMBatteryList$annotations() {
    }

    @Deprecated(message = "deprecated at os 12")
    public static /* synthetic */ void getMConnectTime$annotations() {
    }

    @Deprecated(message = "deprecated at os 12")
    public static /* synthetic */ void getMDeviceIcon$annotations() {
    }

    @Deprecated(message = "deprecated at os 12")
    public static /* synthetic */ void getMIsSupportAudioConnect$annotations() {
    }

    @Deprecated(message = "deprecated at os 12")
    public static /* synthetic */ void getMIsSupportMultiConnect$annotations() {
    }

    @Deprecated(message = "deprecated at os 12")
    public static /* synthetic */ void getMPriority$annotations() {
    }

    @Deprecated(message = "deprecated at os 12")
    public static /* synthetic */ void getMTemplateList$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "templateType is deprecated", replaceWith = @ReplaceWith(expression = "mTemplateList", imports = {}))
    public static /* synthetic */ void getMTemplateType$annotations() {
    }

    @Deprecated(message = "deprecated at os 12")
    public static /* synthetic */ void isSupportNoiseCanceling$annotations() {
    }

    public final void addFeature(int flag) {
        this.feature = Utils.addFlag(this.feature, flag);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getFeature() {
        return this.feature;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getConnectProtocol() {
        return this.connectProtocol;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getCardStyle() {
        return this.cardStyle;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    @Nullable
    public final List<ShortcutMenu> component20() {
        return this.shortcuts;
    }

    @Nullable
    public final List<SwitchMenu> component21() {
        return this.switchMenuList;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getLinkageVersion() {
        return this.linkageVersion;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final ConnectState getMConnectState() {
        return this.mConnectState;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final DeviceEventMessage getDeviceEventMessage() {
        return this.deviceEventMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final TemplateType getMTemplateType() {
        return this.mTemplateType;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getMDeviceIcon() {
        return this.mDeviceIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getMIconUrl() {
        return this.mIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getMAuthority() {
        return this.mAuthority;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getMPriority() {
        return this.mPriority;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final long getMConnectTime() {
        return this.mConnectTime;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getMIsSupportAudioConnect() {
        return this.mIsSupportAudioConnect;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getMIsSupportMultiConnect() {
        return this.mIsSupportMultiConnect;
    }

    @NotNull
    public final ArrayList<TemplateType> component34() {
        return this.mTemplateList;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final boolean getIsSupportNoiseCanceling() {
        return this.isSupportNoiseCanceling;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DeviceType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getDeviceSecondaryType() {
        return this.deviceSecondaryType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Connection getConnection() {
        return this.connection;
    }

    @NotNull
    public final List<BatteryInfo> component8() {
        return this.batteryInfoList;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final UseState getUseState() {
        return this.useState;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String deviceId, @NotNull String macAddress, @NotNull String modelId, @NotNull String name, @Nullable DeviceType type, @Nullable Integer deviceSecondaryType, @Nullable Connection connection, @NotNull List<BatteryInfo> batteryInfoList, @Nullable UseState useState, boolean isActive, int status, @NotNull String data, int feature, long timestamp, int connectProtocol, @NotNull String iconUrl, @Nullable String videoUrl, int cardStyle, long versionCode, @Nullable List<ShortcutMenu> shortcuts, @Nullable List<SwitchMenu> switchMenuList, int linkageVersion, boolean autoSwitch, @Nullable ConnectState mConnectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType mTemplateType, int mDeviceIcon, @Nullable String mIconUrl, @Nullable String mAuthority, int mPriority, long mConnectTime, boolean mIsSupportAudioConnect, boolean mIsSupportMultiConnect, @NotNull ArrayList<TemplateType> mTemplateList, boolean isSupportNoiseCanceling, @NotNull ArrayList<ActionMenu> mActionMenuList, @NotNull ArrayList<Integer> mBatteryList) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(batteryInfoList, "batteryInfoList");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(mTemplateList, "mTemplateList");
        Intrinsics.checkNotNullParameter(mActionMenuList, "mActionMenuList");
        Intrinsics.checkNotNullParameter(mBatteryList, "mBatteryList");
        return new DeviceInfo(deviceId, macAddress, modelId, name, type, deviceSecondaryType, connection, batteryInfoList, useState, isActive, status, data, feature, timestamp, connectProtocol, iconUrl, videoUrl, cardStyle, versionCode, shortcuts, switchMenuList, linkageVersion, autoSwitch, mConnectState, deviceEventMessage, mTemplateType, mDeviceIcon, mIconUrl, mAuthority, mPriority, mConnectTime, mIsSupportAudioConnect, mIsSupportMultiConnect, mTemplateList, isSupportNoiseCanceling, mActionMenuList, mBatteryList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.deviceId, deviceInfo.deviceId) && Intrinsics.areEqual(this.macAddress, deviceInfo.macAddress) && Intrinsics.areEqual(this.modelId, deviceInfo.modelId) && Intrinsics.areEqual(this.name, deviceInfo.name) && Intrinsics.areEqual(this.type, deviceInfo.type) && Intrinsics.areEqual(this.deviceSecondaryType, deviceInfo.deviceSecondaryType) && Intrinsics.areEqual(this.connection, deviceInfo.connection) && Intrinsics.areEqual(this.batteryInfoList, deviceInfo.batteryInfoList) && Intrinsics.areEqual(this.useState, deviceInfo.useState) && this.isActive == deviceInfo.isActive && this.status == deviceInfo.status && Intrinsics.areEqual(this.data, deviceInfo.data) && this.feature == deviceInfo.feature && this.timestamp == deviceInfo.timestamp && this.connectProtocol == deviceInfo.connectProtocol && Intrinsics.areEqual(this.iconUrl, deviceInfo.iconUrl) && Intrinsics.areEqual(this.videoUrl, deviceInfo.videoUrl) && this.cardStyle == deviceInfo.cardStyle && this.versionCode == deviceInfo.versionCode && Intrinsics.areEqual(this.shortcuts, deviceInfo.shortcuts) && Intrinsics.areEqual(this.switchMenuList, deviceInfo.switchMenuList) && this.linkageVersion == deviceInfo.linkageVersion && this.autoSwitch == deviceInfo.autoSwitch && Intrinsics.areEqual(this.mConnectState, deviceInfo.mConnectState) && Intrinsics.areEqual(this.deviceEventMessage, deviceInfo.deviceEventMessage) && Intrinsics.areEqual(this.mTemplateType, deviceInfo.mTemplateType) && this.mDeviceIcon == deviceInfo.mDeviceIcon && Intrinsics.areEqual(this.mIconUrl, deviceInfo.mIconUrl) && Intrinsics.areEqual(this.mAuthority, deviceInfo.mAuthority) && this.mPriority == deviceInfo.mPriority && this.mConnectTime == deviceInfo.mConnectTime && this.mIsSupportAudioConnect == deviceInfo.mIsSupportAudioConnect && this.mIsSupportMultiConnect == deviceInfo.mIsSupportMultiConnect && Intrinsics.areEqual(this.mTemplateList, deviceInfo.mTemplateList) && this.isSupportNoiseCanceling == deviceInfo.isSupportNoiseCanceling && Intrinsics.areEqual(this.mActionMenuList, deviceInfo.mActionMenuList) && Intrinsics.areEqual(this.mBatteryList, deviceInfo.mBatteryList);
    }

    @NotNull
    public final ArrayList<ActionMenu> getActionMenuList() {
        return this.mActionMenuList;
    }

    public final boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    @NotNull
    public final List<BatteryInfo> getBatteryInfoList() {
        return this.batteryInfoList;
    }

    @NotNull
    public final ArrayList<Integer> getBatteryList() {
        return this.mBatteryList;
    }

    public final int getCardStyle() {
        return this.cardStyle;
    }

    public final int getConnectProtocol() {
        return this.connectProtocol;
    }

    @Nullable
    public final Connection getConnection() {
        return this.connection;
    }

    @NotNull
    public final Connection getConnectionCompat() {
        Connection connection = this.connection;
        if (connection != null) {
            Intrinsics.checkNotNull(connection);
        } else {
            ConnectState connectState = this.mConnectState;
            if (connectState == null) {
                connectState = ConnectState.DISCONNECTED;
            }
            connection = new Connection(connectState, this.mConnectTime, 0L, null, 12, null);
        }
        return connection;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final DeviceEventMessage getDeviceEventMessage() {
        return this.deviceEventMessage;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final Integer getDeviceSecondaryType() {
        return this.deviceSecondaryType;
    }

    public final int getFeature() {
        return this.feature;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getLinkageVersion() {
        return this.linkageVersion;
    }

    @Nullable
    public final String getMAuthority() {
        return this.mAuthority;
    }

    @Nullable
    public final ConnectState getMConnectState() {
        return this.mConnectState;
    }

    public final long getMConnectTime() {
        return this.mConnectTime;
    }

    public final int getMDeviceIcon() {
        return this.mDeviceIcon;
    }

    @Nullable
    public final String getMIconUrl() {
        return this.mIconUrl;
    }

    public final boolean getMIsSupportAudioConnect() {
        return this.mIsSupportAudioConnect;
    }

    public final boolean getMIsSupportMultiConnect() {
        return this.mIsSupportMultiConnect;
    }

    public final int getMPriority() {
        return this.mPriority;
    }

    @NotNull
    public final ArrayList<TemplateType> getMTemplateList() {
        return this.mTemplateList;
    }

    @Nullable
    public final TemplateType getMTemplateType() {
        return this.mTemplateType;
    }

    @NotNull
    public final String getMacAddress() {
        return this.macAddress;
    }

    @NotNull
    public final String getModelId() {
        return this.modelId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<ShortcutMenu> getShortcuts() {
        return this.shortcuts;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final List<SwitchMenu> getSwitchMenuList() {
        return this.switchMenuList;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final DeviceType getType() {
        return this.type;
    }

    @Nullable
    public final UseState getUseState() {
        return this.useState;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v34, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v52 */
    public int hashCode() {
        String str = this.deviceId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.macAddress;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.modelId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.name;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        DeviceType deviceType = this.type;
        int iHashCode5 = (iHashCode4 + (deviceType != null ? deviceType.hashCode() : 0)) * 31;
        Integer num = this.deviceSecondaryType;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Connection connection = this.connection;
        int iHashCode7 = (iHashCode6 + (connection != null ? connection.hashCode() : 0)) * 31;
        List<BatteryInfo> list = this.batteryInfoList;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        UseState useState = this.useState;
        int iHashCode9 = (iHashCode8 + (useState != null ? useState.hashCode() : 0)) * 31;
        boolean z = this.isActive;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (((iHashCode9 + r2) * 31) + this.status) * 31;
        String str5 = this.data;
        int iHashCode10 = (((i + (str5 != null ? str5.hashCode() : 0)) * 31) + this.feature) * 31;
        long j2 = this.timestamp;
        int i2 = (((iHashCode10 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.connectProtocol) * 31;
        String str6 = this.iconUrl;
        int iHashCode11 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.videoUrl;
        int iHashCode12 = (((iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.cardStyle) * 31;
        long j3 = this.versionCode;
        int i3 = (iHashCode12 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        List<ShortcutMenu> list2 = this.shortcuts;
        int iHashCode13 = (i3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<SwitchMenu> list3 = this.switchMenuList;
        int iHashCode14 = (((iHashCode13 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.linkageVersion) * 31;
        boolean z2 = this.autoSwitch;
        ?? r4 = z2;
        if (z2) {
            r4 = 1;
        }
        int i4 = (iHashCode14 + r4) * 31;
        ConnectState connectState = this.mConnectState;
        int iHashCode15 = (i4 + (connectState != null ? connectState.hashCode() : 0)) * 31;
        DeviceEventMessage deviceEventMessage = this.deviceEventMessage;
        int iHashCode16 = (iHashCode15 + (deviceEventMessage != null ? deviceEventMessage.hashCode() : 0)) * 31;
        TemplateType templateType = this.mTemplateType;
        int iHashCode17 = (((iHashCode16 + (templateType != null ? templateType.hashCode() : 0)) * 31) + this.mDeviceIcon) * 31;
        String str8 = this.mIconUrl;
        int iHashCode18 = (iHashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.mAuthority;
        int iHashCode19 = (((iHashCode18 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.mPriority) * 31;
        long j4 = this.mConnectTime;
        int i5 = (iHashCode19 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        boolean z3 = this.mIsSupportAudioConnect;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i6 = (i5 + r3) * 31;
        boolean z4 = this.mIsSupportMultiConnect;
        ?? r5 = z4;
        if (z4) {
            r5 = 1;
        }
        int i7 = (i6 + r5) * 31;
        ArrayList<TemplateType> arrayList = this.mTemplateList;
        int iHashCode20 = (i7 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        boolean z5 = this.isSupportNoiseCanceling;
        int i8 = (iHashCode20 + (z5 ? 1 : z5)) * 31;
        ArrayList<ActionMenu> arrayList2 = this.mActionMenuList;
        int iHashCode21 = (i8 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        ArrayList<Integer> arrayList3 = this.mBatteryList;
        return iHashCode21 + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isMultiConnectLinkageVersion() {
        return Utils.supportFlag(this.linkageVersion, 2);
    }

    public final boolean isSingleConnectLinkageVersion() {
        return Utils.supportFlag(this.linkageVersion, 1);
    }

    public final boolean isSupportDeviceLinkage() {
        return this.mIsSupportAudioConnect || Utils.supportFlag(this.feature, 1);
    }

    public final boolean isSupportMultiConnect() {
        return this.mIsSupportMultiConnect || Utils.supportFlag(this.feature, 2);
    }

    public final boolean isSupportNoiseCanceling() {
        return this.isSupportNoiseCanceling;
    }

    public final boolean isSupportVersion(int version) {
        return Utils.supportFlag(this.linkageVersion, version);
    }

    public final void removeFeature(int flag) {
        this.feature = Utils.removeFlag(this.feature, flag);
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setAutoSwitch(boolean z) {
        this.autoSwitch = z;
    }

    public final void setBatteryInfoList(@NotNull List<BatteryInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.batteryInfoList = list;
    }

    public final void setBatteryList(@NotNull ArrayList<Integer> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mBatteryList = value;
    }

    public final void setCardStyle(int i) {
        this.cardStyle = i;
    }

    public final void setConnectProtocol(int i) {
        this.connectProtocol = i;
    }

    public final void setConnection(@Nullable Connection connection) {
        this.connection = connection;
    }

    public final void setConnectionCompat(@NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.connection = connection;
        this.mConnectState = connection.getConnectState();
    }

    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final void setDeviceEventMessage(@Nullable DeviceEventMessage deviceEventMessage) {
        this.deviceEventMessage = deviceEventMessage;
    }

    public final void setDeviceSecondaryType(@Nullable Integer num) {
        this.deviceSecondaryType = num;
    }

    public final void setFeature(int i) {
        this.feature = i;
    }

    public final void setIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iconUrl = str;
    }

    public final void setLinkageVersion(int i) {
        this.linkageVersion = i;
    }

    public final void setMAuthority(@Nullable String str) {
        this.mAuthority = str;
    }

    public final void setMConnectState(@Nullable ConnectState connectState) {
        this.mConnectState = connectState;
    }

    public final void setMConnectTime(long j2) {
        this.mConnectTime = j2;
    }

    public final void setMDeviceIcon(int i) {
        this.mDeviceIcon = i;
    }

    public final void setMIconUrl(@Nullable String str) {
        this.mIconUrl = str;
    }

    public final void setMIsSupportAudioConnect(boolean z) {
        this.mIsSupportAudioConnect = z;
    }

    public final void setMIsSupportMultiConnect(boolean z) {
        this.mIsSupportMultiConnect = z;
    }

    public final void setMPriority(int i) {
        this.mPriority = i;
    }

    public final void setMTemplateList(@NotNull ArrayList<TemplateType> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mTemplateList = arrayList;
    }

    public final void setMTemplateType(@Nullable TemplateType templateType) {
        this.mTemplateType = templateType;
    }

    public final void setModelId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.modelId = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setShortcuts(@Nullable List<ShortcutMenu> list) {
        this.shortcuts = list;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setSupportNoiseCanceling(boolean z) {
        this.isSupportNoiseCanceling = z;
    }

    public final void setSwitchMenuList(@Nullable List<SwitchMenu> list) {
        this.switchMenuList = list;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public final void setType(@Nullable DeviceType deviceType) {
        this.type = deviceType;
    }

    public final void setUseState(@Nullable UseState useState) {
        this.useState = useState;
    }

    public final void setVersionCode(long j2) {
        this.versionCode = j2;
    }

    public final void setVideoUrl(@Nullable String str) {
        this.videoUrl = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("~~DeviceInfo(deviceId='");
        sb.append(this.deviceId);
        sb.append("', ");
        sb.append("macAddress='");
        PrivacyMaskUtils privacyMaskUtils = PrivacyMaskUtils.INSTANCE;
        sb.append(privacyMaskUtils.maskMacAddress(this.macAddress));
        sb.append("', ");
        sb.append("modelId='");
        sb.append(this.modelId);
        sb.append("', ");
        sb.append("name='");
        sb.append(privacyMaskUtils.maskName(this.name));
        sb.append("', ");
        sb.append("connection=");
        sb.append(this.connection);
        sb.append(", ");
        sb.append("mConnectState=");
        sb.append(this.mConnectState);
        sb.append("batteryInfoList=");
        sb.append(this.batteryInfoList);
        sb.append(", ");
        sb.append("isActive=");
        sb.append(this.isActive);
        sb.append(", ");
        sb.append("status=");
        sb.append(this.status);
        sb.append(", ");
        sb.append("data='");
        sb.append(privacyMaskUtils.maskMacAddress(this.data));
        sb.append("', ");
        sb.append("cardStyle='");
        sb.append(this.cardStyle);
        sb.append("', ");
        sb.append("iconUrl='");
        sb.append(this.iconUrl);
        sb.append("', ");
        sb.append("feature=");
        sb.append(this.feature);
        sb.append(", ");
        sb.append("linkageVersion=");
        sb.append(this.linkageVersion);
        sb.append(", ");
        sb.append("autoSwitch=");
        sb.append(this.autoSwitch);
        sb.append(", ");
        sb.append("shortcuts=");
        sb.append(privacyMaskUtils.maskMacAddress(String.valueOf(this.shortcuts)));
        sb.append(", ");
        sb.append("timestamp=");
        sb.append(this.timestamp);
        sb.append(")~~");
        return sb.toString();
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, @NotNull String str5) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, false, 0, str5, 0, 0L, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -2560, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, 0, 0L, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -4096, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, 0L, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -8192, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -16384, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -32768, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, SupportMenu.CATEGORY_MASK, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -131072, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -262144, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -524288, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -1048576, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -2097152, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -4194304, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -8388608, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -16777216, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -33554432, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, 0, null, null, 0, 0L, false, false, null, false, null, null, -67108864, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, null, null, 0, 0L, false, false, null, false, null, null, -134217728, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str8) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, str8, null, 0, 0L, false, false, null, false, null, null, -268435456, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str8, @Nullable String str9) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, str8, str9, 0, 0L, false, false, null, false, null, null, -536870912, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str8, @Nullable String str9, int i7) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, str8, str9, i7, 0L, false, false, null, false, null, null, -1073741824, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str8, @Nullable String str9, int i7, long j4) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, str8, str9, i7, j4, false, false, null, false, null, null, Integer.MIN_VALUE, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str8, @Nullable String str9, int i7, long j4, boolean z3) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, str8, str9, i7, j4, z3, false, null, false, null, null, 0, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str8, @Nullable String str9, int i7, long j4, boolean z3, boolean z4) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, str8, str9, i7, j4, z3, z4, null, false, null, null, 0, 30, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str8, @Nullable String str9, int i7, long j4, boolean z3, boolean z4, @NotNull ArrayList<TemplateType> arrayList) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, str8, str9, i7, j4, z3, z4, arrayList, false, null, null, 0, 28, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str8, @Nullable String str9, int i7, long j4, boolean z3, boolean z4, @NotNull ArrayList<TemplateType> arrayList, boolean z5) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, str8, str9, i7, j4, z3, z4, arrayList, z5, null, null, 0, 24, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, int i, @NotNull String str5, int i2, long j2, int i3, @NotNull String str6, @Nullable String str7, int i4, long j3, @Nullable List<ShortcutMenu> list2, @Nullable List<SwitchMenu> list3, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str8, @Nullable String str9, int i7, long j4, boolean z3, boolean z4, @NotNull ArrayList<TemplateType> arrayList, boolean z5, @NotNull ArrayList<ActionMenu> arrayList2) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, i, str5, i2, j2, i3, str6, str7, i4, j3, list2, list3, i5, z2, connectState, deviceEventMessage, templateType, i6, str8, str9, i7, j4, z3, z4, arrayList, z5, arrayList2, null, 0, 16, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @Nullable UseState useState, boolean z, @NotNull String str5) {
        this(str, str2, str3, str4, deviceType, num, connection, list, useState, z, 0, str5, 0, 0L, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -3072, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> list, @NotNull String str5) {
        this(str, str2, str3, str4, deviceType, num, connection, list, null, false, 0, str5, 0, 0L, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -2304, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @Nullable Integer num, @NotNull String str5) {
        this(str, str2, str3, str4, deviceType, num, null, null, null, false, 0, str5, 0, 0L, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -2112, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable DeviceType deviceType, @NotNull String str5) {
        this(str, str2, str3, str4, deviceType, null, null, null, null, false, 0, str5, 0, 0L, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -2080, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this(str, str2, str3, str4, null, null, null, null, null, false, 0, str5, 0, 0L, 0, null, null, 0, 0L, null, null, 0, false, null, null, null, 0, null, null, 0, 0L, false, false, null, false, null, null, -2064, 31, null);
    }

    @JvmOverloads
    public DeviceInfo(@NotNull String deviceId, @NotNull String macAddress, @NotNull String modelId, @NotNull String name, @Nullable DeviceType deviceType, @Nullable Integer num, @Nullable Connection connection, @NotNull List<BatteryInfo> batteryInfoList, @Nullable UseState useState, boolean z, int i, @NotNull String data, int i2, long j2, int i3, @NotNull String iconUrl, @Nullable String str, int i4, long j3, @Nullable List<ShortcutMenu> list, @Nullable List<SwitchMenu> list2, int i5, boolean z2, @Nullable ConnectState connectState, @Nullable DeviceEventMessage deviceEventMessage, @Nullable TemplateType templateType, int i6, @Nullable String str2, @Nullable String str3, int i7, long j4, boolean z3, boolean z4, @NotNull ArrayList<TemplateType> mTemplateList, boolean z5, @NotNull ArrayList<ActionMenu> mActionMenuList, @NotNull ArrayList<Integer> mBatteryList) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(batteryInfoList, "batteryInfoList");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(mTemplateList, "mTemplateList");
        Intrinsics.checkNotNullParameter(mActionMenuList, "mActionMenuList");
        Intrinsics.checkNotNullParameter(mBatteryList, "mBatteryList");
        this.deviceId = deviceId;
        this.macAddress = macAddress;
        this.modelId = modelId;
        this.name = name;
        this.type = deviceType;
        this.deviceSecondaryType = num;
        this.connection = connection;
        this.batteryInfoList = batteryInfoList;
        this.useState = useState;
        this.isActive = z;
        this.status = i;
        this.data = data;
        this.feature = i2;
        this.timestamp = j2;
        this.connectProtocol = i3;
        this.iconUrl = iconUrl;
        this.videoUrl = str;
        this.cardStyle = i4;
        this.versionCode = j3;
        this.shortcuts = list;
        this.switchMenuList = list2;
        this.linkageVersion = i5;
        this.autoSwitch = z2;
        this.mConnectState = connectState;
        this.deviceEventMessage = deviceEventMessage;
        this.mTemplateType = templateType;
        this.mDeviceIcon = i6;
        this.mIconUrl = str2;
        this.mAuthority = str3;
        this.mPriority = i7;
        this.mConnectTime = j4;
        this.mIsSupportAudioConnect = z3;
        this.mIsSupportMultiConnect = z4;
        this.mTemplateList = mTemplateList;
        this.isSupportNoiseCanceling = z5;
        this.mActionMenuList = mActionMenuList;
        this.mBatteryList = mBatteryList;
    }

    public /* synthetic */ DeviceInfo(String str, String str2, String str3, String str4, DeviceType deviceType, Integer num, Connection connection, List list, UseState useState, boolean z, int i, String str5, int i2, long j2, int i3, String str6, String str7, int i4, long j3, List list2, List list3, int i5, boolean z2, ConnectState connectState, DeviceEventMessage deviceEventMessage, TemplateType templateType, int i6, String str8, String str9, int i7, long j4, boolean z3, boolean z4, ArrayList arrayList, boolean z5, ArrayList arrayList2, ArrayList arrayList3, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i8 & 16) != 0 ? null : deviceType, (i8 & 32) != 0 ? null : num, (i8 & 64) != 0 ? null : connection, (i8 & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i8 & 256) != 0 ? null : useState, (i8 & 512) != 0 ? false : z, (i8 & 1024) != 0 ? 0 : i, str5, (i8 & 4096) != 0 ? 0 : i2, (i8 & 8192) != 0 ? 0L : j2, (i8 & 16384) != 0 ? 0 : i3, (32768 & i8) != 0 ? "" : str6, (65536 & i8) != 0 ? "" : str7, (131072 & i8) != 0 ? 0 : i4, (262144 & i8) != 0 ? 0L : j3, (524288 & i8) != 0 ? new ArrayList() : list2, (1048576 & i8) != 0 ? new ArrayList() : list3, (2097152 & i8) != 0 ? 0 : i5, (4194304 & i8) != 0 ? false : z2, (8388608 & i8) != 0 ? null : connectState, (16777216 & i8) != 0 ? null : deviceEventMessage, (33554432 & i8) != 0 ? null : templateType, (67108864 & i8) != 0 ? -1 : i6, (134217728 & i8) != 0 ? null : str8, (268435456 & i8) != 0 ? "" : str9, (536870912 & i8) != 0 ? 0 : i7, (1073741824 & i8) != 0 ? 0L : j4, (i8 & Integer.MIN_VALUE) != 0 ? false : z3, (i9 & 1) != 0 ? false : z4, (i9 & 2) != 0 ? new ArrayList() : arrayList, (i9 & 4) != 0 ? false : z5, (i9 & 8) != 0 ? new ArrayList() : arrayList2, (i9 & 16) != 0 ? new ArrayList() : arrayList3);
    }
}
