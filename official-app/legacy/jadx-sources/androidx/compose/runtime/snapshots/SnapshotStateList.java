package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.a8i;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.TextEntity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.CollectionToArray;
import p010kotlin.jvm.internal.InlineMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001NB\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001a\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0016\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J)\u0010%\u001a\u00020\u001b2\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0'H\u0082\bJ\u0016\u0010)\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001dJ\u0016\u0010*\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0016\u0010+\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u001bH\u0016J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096\u0002J\u0015\u00102\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J.\u00105\u001a\u0002H6\"\u0004\b\u0001\u001062\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u0002H60'H\u0082\b¢\u0006\u0002\u00107J\"\u00108\u001a\u00020\u001b2\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u001b0'H\u0002J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u000bH\u0016J\u0015\u0010;\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u0016\u0010<\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0015\u0010=\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010,J\u0016\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u0010J\u0016\u0010A\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J+\u0010B\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u0010H\u0000¢\u0006\u0002\bEJ\u001e\u0010F\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010GJ\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u0010H\u0016J\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J)\u0010J\u001a\u00020\u001e2\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0'H\u0082\bJ3\u0010K\u001a\u0002H6\"\u0004\b\u0001\u001062\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u0002H60'¢\u0006\u0002\bLH\u0082\b¢\u0006\u0002\u00107J3\u0010M\u001a\u0002H6\"\u0004\b\u0001\u001062\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u0002H60'¢\u0006\u0002\bLH\u0082\b¢\u0006\u0002\u00107R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012¨\u0006O"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/snapshots/StateObject;", "()V", "debuggerDisplayValue", "", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/List;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "modification", "", "getModification$runtime_release", "()I", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "conditionalUpdate", "block", "Lkotlin/Function1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "contains", "containsAll", ParserTag.TAG_GET, "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "mutate", "R", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "mutateBoolean", "prependStateRecord", "value", EventType.STATE_PACKAGE_CHANGED_REMOVE, "removeAll", "removeAt", "removeRange", "fromIndex", "toIndex", "retainAll", "retainAllInRange", "start", TextEntity.ELLIPSIZE_END, "retainAllInRange$runtime_release", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "toList", a8i.UPDATE, "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n153#1:458\n189#1,6:460\n195#1:467\n153#1:468\n196#1,10:470\n149#1:480\n206#1,5:486\n214#1,6:494\n185#1,10:500\n195#1:511\n153#1:512\n196#1,10:514\n149#1:524\n206#1,5:530\n214#1,6:538\n186#1:544\n189#1,6:545\n195#1:552\n153#1:553\n196#1,10:555\n149#1:565\n206#1,5:571\n214#1,6:579\n149#1:586\n189#1,6:596\n195#1:603\n153#1:604\n196#1,10:606\n149#1:616\n206#1,5:622\n214#1,6:630\n189#1,6:636\n195#1:643\n153#1:644\n196#1,10:646\n149#1:656\n206#1,5:662\n214#1,6:670\n185#1,10:677\n195#1:688\n153#1:689\n196#1,10:691\n149#1:701\n206#1,5:707\n214#1,6:715\n186#1:721\n185#1,10:722\n195#1:733\n153#1:734\n196#1,10:736\n149#1:746\n206#1,5:752\n214#1,6:760\n186#1:766\n159#1,4:767\n163#1:772\n153#1:773\n164#1,8:775\n149#1:783\n172#1,5:789\n179#1,3:797\n159#1,4:800\n163#1:805\n153#1:806\n164#1,8:808\n149#1:816\n172#1,5:822\n179#1,3:830\n153#1:833\n159#1,4:845\n163#1:850\n153#1:851\n164#1,8:853\n149#1:861\n172#1,5:867\n179#1,3:875\n153#1:879\n149#1:882\n189#1,6:892\n195#1:899\n153#1:900\n196#1,10:902\n149#1:912\n206#1,5:918\n214#1,6:926\n153#1:933\n149#1:936\n2180#2:459\n2180#2:469\n2073#2,2:481\n1686#2:483\n2075#2,2:484\n2077#2,3:491\n2180#2:513\n2073#2,2:525\n1686#2:527\n2075#2,2:528\n2077#2,3:535\n2180#2:554\n2073#2,2:566\n1686#2:568\n2075#2,2:569\n2077#2,3:576\n2073#2,2:587\n1686#2:589\n2075#2,5:591\n2180#2:605\n2073#2,2:617\n1686#2:619\n2075#2,2:620\n2077#2,3:627\n2180#2:645\n2073#2,2:657\n1686#2:659\n2075#2,2:660\n2077#2,3:667\n2180#2:690\n2073#2,2:702\n1686#2:704\n2075#2,2:705\n2077#2,3:712\n2180#2:735\n2073#2,2:747\n1686#2:749\n2075#2,2:750\n2077#2,3:757\n2180#2:774\n2073#2,2:784\n1686#2:786\n2075#2,2:787\n2077#2,3:794\n2180#2:807\n2073#2,2:817\n1686#2:819\n2075#2,2:820\n2077#2,3:827\n2180#2:834\n2073#2,2:835\n1686#2:837\n2075#2,5:839\n2180#2:844\n2180#2:852\n2073#2,2:862\n1686#2:864\n2075#2,2:865\n2077#2,3:872\n2180#2:880\n2073#2,2:883\n1686#2:885\n2075#2,5:887\n2180#2:901\n2073#2,2:913\n1686#2:915\n2075#2,2:916\n2077#2,3:923\n2180#2:934\n2073#2,2:937\n1686#2:939\n2075#2,5:941\n70#3:466\n70#3:510\n70#3:551\n70#3:585\n70#3:590\n70#3:602\n70#3:642\n70#3:687\n70#3:732\n70#3:771\n70#3:804\n70#3:838\n70#3:849\n70#3:878\n70#3:881\n70#3:886\n70#3:898\n70#3:932\n70#3:935\n70#3:940\n1#4:676\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n62#1:458\n101#1:460,6\n101#1:467\n101#1:468\n101#1:470,10\n101#1:480\n101#1:486,5\n101#1:494,6\n102#1:500,10\n102#1:511\n102#1:512\n102#1:514,10\n102#1:524\n102#1:530,5\n102#1:538,6\n102#1:544\n107#1:545,6\n107#1:552\n107#1:553\n107#1:555,10\n107#1:565\n107#1:571,5\n107#1:579,6\n110#1:586\n116#1:596,6\n116#1:603\n116#1:604\n116#1:606,10\n116#1:616\n116#1:622,5\n116#1:630,6\n117#1:636,6\n117#1:643\n117#1:644\n117#1:646,10\n117#1:656\n117#1:662,5\n117#1:670,6\n118#1:677,10\n118#1:688\n118#1:689\n118#1:691,10\n118#1:701\n118#1:707,5\n118#1:715,6\n118#1:721\n121#1:722,10\n121#1:733\n121#1:734\n121#1:736,10\n121#1:746\n121#1:752,5\n121#1:760,6\n121#1:766\n125#1:767,4\n125#1:772\n125#1:773\n125#1:775,8\n125#1:783\n125#1:789,5\n125#1:797,3\n132#1:800,4\n132#1:805\n132#1:806\n132#1:808,8\n132#1:816\n132#1:822,5\n132#1:830,3\n145#1:833\n155#1:845,4\n155#1:850\n155#1:851\n155#1:853,8\n155#1:861\n155#1:867,5\n155#1:875,3\n163#1:879\n171#1:882\n185#1:892,6\n185#1:899\n185#1:900\n185#1:902,10\n185#1:912\n185#1:918,5\n185#1:926,6\n195#1:933\n205#1:936\n62#1:459\n101#1:469\n101#1:481,2\n101#1:483\n101#1:484,2\n101#1:491,3\n102#1:513\n102#1:525,2\n102#1:527\n102#1:528,2\n102#1:535,3\n107#1:554\n107#1:566,2\n107#1:568\n107#1:569,2\n107#1:576,3\n110#1:587,2\n110#1:589\n110#1:591,5\n116#1:605\n116#1:617,2\n116#1:619\n116#1:620,2\n116#1:627,3\n117#1:645\n117#1:657,2\n117#1:659\n117#1:660,2\n117#1:667,3\n118#1:690\n118#1:702,2\n118#1:704\n118#1:705,2\n118#1:712,3\n121#1:735\n121#1:747,2\n121#1:749\n121#1:750,2\n121#1:757,3\n125#1:774\n125#1:784,2\n125#1:786\n125#1:787,2\n125#1:794,3\n132#1:807\n132#1:817,2\n132#1:819\n132#1:820,2\n132#1:827,3\n145#1:834\n149#1:835,2\n149#1:837\n149#1:839,5\n153#1:844\n155#1:852\n155#1:862,2\n155#1:864\n155#1:865,2\n155#1:872,3\n163#1:880\n171#1:883,2\n171#1:885\n171#1:887,5\n185#1:901\n185#1:913,2\n185#1:915\n185#1:916,2\n185#1:923,3\n195#1:934\n205#1:937,2\n205#1:939\n205#1:941,5\n101#1:466\n102#1:510\n107#1:551\n109#1:585\n110#1:590\n116#1:602\n117#1:642\n118#1:687\n121#1:732\n125#1:771\n132#1:804\n149#1:838\n155#1:849\n162#1:878\n170#1:881\n171#1:886\n185#1:898\n194#1:932\n204#1:935\n205#1:940\n*E\n"})
public final class SnapshotStateList<T> implements List<T>, StateObject, KMutableList {
    public static final int $stable = 0;

    @NotNull
    private StateRecord firstStateRecord = new StateListStateRecord(ExtensionsKt.persistentListOf());

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "list", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,457:1\n70#2:458\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n76#1:458\n*E\n"})
    public static final class StateListStateRecord<T> extends StateRecord {

        @NotNull
        private PersistentList<? extends T> list;
        private int modification;

        public StateListStateRecord(@NotNull PersistentList<? extends T> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Intrinsics.checkNotNullParameter(value, "value");
            synchronized (SnapshotStateListKt.sync) {
                this.list = ((StateListStateRecord) value).list;
                this.modification = ((StateListStateRecord) value).modification;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }

        @NotNull
        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        /* JADX INFO: renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setList$runtime_release(@NotNull PersistentList<? extends T> persistentList) {
            Intrinsics.checkNotNullParameter(persistentList, "<set-?>");
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean conditionalUpdate(Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> block) {
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z;
        Snapshot current;
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification = stateListStateRecord.getModification();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<? extends T> persistentListInvoke = block.invoke(list$runtime_release);
            z = false;
            if (Intrinsics.areEqual(persistentListInvoke, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification() == modification) {
                            stateListStateRecord3.setList$runtime_release(persistentListInvoke);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                            z = true;
                        }
                        InlineMarker.finallyStart(1);
                    } catch (Throwable th2) {
                        InlineMarker.finallyStart(1);
                        InlineMarker.finallyEnd(1);
                        throw th2;
                    }
                }
                InlineMarker.finallyEnd(1);
                SnapshotKt.notifyWrite(current, this);
                InlineMarker.finallyStart(1);
            }
            InlineMarker.finallyEnd(1);
        } while (!z);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(Function1<? super List<T>, ? extends R> block) {
        int modification;
        PersistentList<T> list$runtime_release;
        R rInvoke;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification = stateListStateRecord.getModification();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            rInvoke = block.invoke(builder);
            PersistentList<T> persistentListBuild = builder.build();
            if (Intrinsics.areEqual(persistentListBuild, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateRecord firstStateRecord2 = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = Snapshot.INSTANCE.getCurrent();
                            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                            if (stateListStateRecord3.getModification() == modification) {
                                stateListStateRecord3.setList$runtime_release(persistentListBuild);
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            InlineMarker.finallyStart(1);
                        } catch (Throwable th2) {
                            InlineMarker.finallyStart(1);
                            InlineMarker.finallyEnd(1);
                            throw th2;
                        }
                    }
                    InlineMarker.finallyEnd(1);
                    SnapshotKt.notifyWrite(current, this);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th3) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th3;
                }
            }
            InlineMarker.finallyEnd(1);
        } while (!z);
        return rInvoke;
    }

    private final boolean mutateBoolean(Function1<? super List<T>, Boolean> block) {
        int modification;
        PersistentList<T> list$runtime_release;
        Boolean boolInvoke;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            boolInvoke = block.invoke(builder);
            PersistentList<T> persistentListBuild = builder.build();
            if (Intrinsics.areEqual(persistentListBuild, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.INSTANCE.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(persistentListBuild);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return boolInvoke.booleanValue();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void update(Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> block) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification = stateListStateRecord.getModification();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<? extends T> persistentListInvoke = block.invoke(list$runtime_release);
            if (Intrinsics.areEqual(persistentListInvoke, list$runtime_release)) {
                return;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification() == modification) {
                            stateListStateRecord3.setList$runtime_release(persistentListInvoke);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                            z = true;
                        } else {
                            z = false;
                        }
                        InlineMarker.finallyStart(1);
                    } catch (Throwable th2) {
                        InlineMarker.finallyStart(1);
                        InlineMarker.finallyEnd(1);
                        throw th2;
                    }
                }
                InlineMarker.finallyEnd(1);
                SnapshotKt.notifyWrite(current, this);
                InlineMarker.finallyStart(1);
            }
            InlineMarker.finallyEnd(1);
        } while (!z);
    }

    private final <R> R withCurrent(Function1<? super StateListStateRecord<T>, ? extends R> block) {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return block.invoke(SnapshotKt.current((StateListStateRecord) firstStateRecord));
    }

    private final <R> R writable(Function1<? super StateListStateRecord<T>, ? extends R> block) {
        Snapshot current;
        R rInvoke;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = block.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        SnapshotKt.notifyWrite(current, this);
        return rInvoke;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0073 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean add(T element) {
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z;
        Snapshot current;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<T> persistentListAdd = list$runtime_release.add(element);
            z = false;
            if (Intrinsics.areEqual(persistentListAdd, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification() == modification) {
                            stateListStateRecord3.setList$runtime_release(persistentListAdd);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int index, @NotNull final Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return mutateBoolean(new Function1<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull List<T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.addAll(index, elements));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        synchronized (SnapshotStateListKt.sync) {
            StateRecord firstStateRecord = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return getReadable$runtime_release().getList$runtime_release().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return getReadable$runtime_release().getList$runtime_release().containsAll(elements);
    }

    @Override // java.util.List
    public T get(int index) {
        return getReadable$runtime_release().getList$runtime_release().get(index);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getModification();
    }

    @NotNull
    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(element);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        value.setNext$runtime_release(getFirstStateRecord());
        this.firstStateRecord = (StateListStateRecord) value;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0078 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z;
        Snapshot current;
        Intrinsics.checkNotNullParameter(elements, "elements");
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<T> persistentListRemoveAll = list$runtime_release.removeAll((Collection<? extends T>) elements);
            z = false;
            if (Intrinsics.areEqual(persistentListRemoveAll, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification() == modification) {
                            stateListStateRecord3.setList$runtime_release(persistentListRemoveAll);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return true;
    }

    public T removeAt(int index) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z;
        T t = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<T> persistentListRemoveAt = list$runtime_release.removeAt(index);
            if (Intrinsics.areEqual(persistentListRemoveAt, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.INSTANCE.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(persistentListRemoveAt);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return t;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void removeRange(int fromIndex, int toIndex) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(fromIndex, toIndex).clear();
            PersistentList<T> persistentListBuild = builder.build();
            if (Intrinsics.areEqual(persistentListBuild, list$runtime_release)) {
                return;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification() == modification) {
                            stateListStateRecord3.setList$runtime_release(persistentListBuild);
                            z = true;
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull final Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return mutateBoolean(new Function1<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull List<T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.retainAll(elements));
            }
        });
    }

    public final int retainAllInRange$runtime_release(@NotNull Collection<? extends T> elements, int start, int end) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z;
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = size();
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(start, end).retainAll(elements);
            PersistentList<T> persistentListBuild = builder.build();
            if (Intrinsics.areEqual(persistentListBuild, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.INSTANCE.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(persistentListBuild);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return size - size();
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z;
        T t = get(index);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(index, element);
            if (Intrinsics.areEqual(persistentList, list$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.INSTANCE.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(persistentList);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        if ((fromIndex >= 0 && fromIndex <= toIndex) && toIndex <= size()) {
            return new SubList(this, fromIndex, toIndex);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @NotNull
    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0078 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z;
        Snapshot current;
        Intrinsics.checkNotNullParameter(elements, "elements");
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<T> persistentListAddAll = list$runtime_release.addAll(elements);
            z = false;
            if (Intrinsics.areEqual(persistentListAddAll, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification() == modification) {
                            stateListStateRecord3.setList$runtime_release(persistentListAddAll);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return new StateListIterator(this, index);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0073 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean remove(Object element) {
        int modification;
        PersistentList<T> list$runtime_release;
        boolean z;
        Snapshot current;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<T> persistentListRemove = list$runtime_release.remove(element);
            z = false;
            if (Intrinsics.areEqual(persistentListRemove, list$runtime_release)) {
                return false;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification() == modification) {
                            stateListStateRecord3.setList$runtime_release(persistentListRemove);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0072 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void add(int index, T element) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<T> persistentListAdd = list$runtime_release.add(index, element);
            if (Intrinsics.areEqual(persistentListAdd, list$runtime_release)) {
                return;
            }
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification() == modification) {
                            stateListStateRecord3.setList$runtime_release(persistentListAdd);
                            z = true;
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
    }
}
