package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.smartenginehelper.entity.TextEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__IndentKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0004\u000f\u0010\u0011\u0012B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J;\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJK\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0000\"\b\b\u0001\u0010\u000b*\u00020\u00022(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\r0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJE\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0000\"\b\b\u0001\u0010\u000b*\u00020\u00022\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0001\u0004\u0013\u0014\u0015\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/paging/PageEvent;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "filter", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "transform", "", "map", "Drop", "Insert", "LoadStateUpdate", "StaticList", "Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$LoadStateUpdate;", "Landroidx/paging/PageEvent$StaticList;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PageEvent<T> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Landroidx/paging/PageEvent$Drop;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PageEvent;", "loadType", "Landroidx/paging/LoadType;", "minPageOffset", "", "maxPageOffset", "placeholdersRemaining", "(Landroidx/paging/LoadType;III)V", "getLoadType", "()Landroidx/paging/LoadType;", "getMaxPageOffset", "()I", "getMinPageOffset", "pageCount", "getPageCount", "getPlaceholdersRemaining", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Drop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
    public static final /* data */ class Drop<T> extends PageEvent<T> {

        @NotNull
        private final LoadType loadType;
        private final int maxPageOffset;
        private final int minPageOffset;
        private final int placeholdersRemaining;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[LoadType.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadType.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Drop(@NotNull LoadType loadType, int i, int i2, int i3) {
            super(null);
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            this.loadType = loadType;
            this.minPageOffset = i;
            this.maxPageOffset = i2;
            this.placeholdersRemaining = i3;
            if (!(loadType != LoadType.REFRESH)) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
            }
            if (!(getPageCount() > 0)) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + getPageCount()).toString());
            }
            if (i3 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i3).toString());
        }

        public static /* synthetic */ Drop copy$default(Drop drop, LoadType loadType, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                loadType = drop.loadType;
            }
            if ((i4 & 2) != 0) {
                i = drop.minPageOffset;
            }
            if ((i4 & 4) != 0) {
                i2 = drop.maxPageOffset;
            }
            if ((i4 & 8) != 0) {
                i3 = drop.placeholdersRemaining;
            }
            return drop.copy(loadType, i, i2, i3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        @NotNull
        public final Drop<T> copy(@NotNull LoadType loadType, int minPageOffset, int maxPageOffset, int placeholdersRemaining) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            return new Drop<>(loadType, minPageOffset, maxPageOffset, placeholdersRemaining);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Drop)) {
                return false;
            }
            Drop drop = (Drop) other;
            return this.loadType == drop.loadType && this.minPageOffset == drop.minPageOffset && this.maxPageOffset == drop.maxPageOffset && this.placeholdersRemaining == drop.placeholdersRemaining;
        }

        @NotNull
        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        public final int getPageCount() {
            return (this.maxPageOffset - this.minPageOffset) + 1;
        }

        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        public int hashCode() {
            return (((((this.loadType.hashCode() * 31) + Integer.hashCode(this.minPageOffset)) * 31) + Integer.hashCode(this.maxPageOffset)) * 31) + Integer.hashCode(this.placeholdersRemaining);
        }

        @NotNull
        public String toString() {
            String str;
            int i = WhenMappings.$EnumSwitchMapping$0[this.loadType.ordinal()];
            if (i == 1) {
                str = TextEntity.ELLIPSIZE_END;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            return StringsKt__IndentKt.trimMargin$default("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.minPageOffset + "\n                    |   maxPageOffset: " + this.maxPageOffset + "\n                    |   placeholdersRemaining: " + this.placeholdersRemaining + "\n                    |)", null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 5*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u00015BG\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0002HÖ\u0003J;\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(JK\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0\u0003\"\b\b\u0002\u0010**\u00020\u00022(\u0010+\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0,0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\t\u0010-\u001a\u00020\nHÖ\u0001JE\u0010.\u001a\b\u0012\u0004\u0012\u0002H*0\u0003\"\b\b\u0002\u0010**\u00020\u00022\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J9\u0010/\u001a\b\u0012\u0004\u0012\u0002H*0\u0000\"\b\b\u0002\u0010**\u00020\u00022\u001e\u0010+\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0\b00H\u0082\bJ\b\u00101\u001a\u000202H\u0016JM\u00103\u001a\b\u0012\u0004\u0012\u0002H*0\u0000\"\b\b\u0002\u0010**\u00020\u00022*\u0010+\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0\b0\u000700H\u0080\bø\u0001\u0001¢\u0006\u0002\b4R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"Landroidx/paging/PageEvent$Insert;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PageEvent;", "loadType", "Landroidx/paging/LoadType;", "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersBefore", "", "placeholdersAfter", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "getLoadType", "()Landroidx/paging/LoadType;", "getMediatorLoadStates", "()Landroidx/paging/LoadStates;", "getPages", "()Ljava/util/List;", "getPlaceholdersAfter", "()I", "getPlaceholdersBefore", "getSourceLoadStates", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "filter", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "transform", "", "hashCode", "map", "mapPages", "Lkotlin/Function1;", "toString", "", "transformPages", "transformPages$paging_common", "Companion", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n116#1,3:319\n119#1,5:326\n112#1,7:331\n119#1,5:346\n112#1,7:351\n119#1,5:365\n112#1,7:370\n119#1,5:384\n1549#2:322\n1620#2,3:323\n1549#2:338\n1620#2,2:339\n1549#2:341\n1620#2,3:342\n1622#2:345\n1549#2:358\n1620#2,2:359\n1864#2,3:361\n1622#2:364\n1549#2:377\n1620#2,2:378\n1864#2,3:380\n1622#2:383\n1789#2,3:389\n27#3,5:392\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n*L\n112#1:319,3\n112#1:326,5\n125#1:331,7\n125#1:346,5\n136#1:351,7\n136#1:365,5\n154#1:370,7\n154#1:384,5\n112#1:322\n112#1:323,3\n125#1:338\n125#1:339,2\n128#1:341\n128#1:342,3\n125#1:345\n136#1:358\n136#1:359,2\n139#1:361,3\n136#1:364\n154#1:377\n154#1:378,2\n157#1:380,3\n154#1:383\n233#1:389,3\n236#1:392,5\n*E\n"})
    public static final /* data */ class Insert<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final Insert<Object> EMPTY_REFRESH_LOCAL;

        @NotNull
        private final LoadType loadType;

        @Nullable
        private final LoadStates mediatorLoadStates;

        @NotNull
        private final List<TransformablePage<T>> pages;
        private final int placeholdersAfter;
        private final int placeholdersBefore;

        @NotNull
        private final LoadStates sourceLoadStates;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJF\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJN\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "()V", "EMPTY_REFRESH_LOCAL", "Landroidx/paging/PageEvent$Insert;", "getEMPTY_REFRESH_LOCAL", "()Landroidx/paging/PageEvent$Insert;", "Append", ExifInterface.GPS_DIRECTION_TRUE, "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersAfter", "", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "Prepend", "placeholdersBefore", "Refresh", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Insert Append$default(Companion companion, List list, int i, LoadStates loadStates, LoadStates loadStates2, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Append(list, i, loadStates, loadStates2);
            }

            public static /* synthetic */ Insert Prepend$default(Companion companion, List list, int i, LoadStates loadStates, LoadStates loadStates2, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Prepend(list, i, loadStates, loadStates2);
            }

            public static /* synthetic */ Insert Refresh$default(Companion companion, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, int i3, Object obj) {
                if ((i3 & 16) != 0) {
                    loadStates2 = null;
                }
                return companion.Refresh(list, i, i2, loadStates, loadStates2);
            }

            @NotNull
            public final <T> Insert<T> Append(@NotNull List<TransformablePage<T>> pages, int placeholdersAfter, @NotNull LoadStates sourceLoadStates, @Nullable LoadStates mediatorLoadStates) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.APPEND, pages, -1, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            @NotNull
            public final <T> Insert<T> Prepend(@NotNull List<TransformablePage<T>> pages, int placeholdersBefore, @NotNull LoadStates sourceLoadStates, @Nullable LoadStates mediatorLoadStates) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.PREPEND, pages, placeholdersBefore, -1, sourceLoadStates, mediatorLoadStates, null);
            }

            @NotNull
            public final <T> Insert<T> Refresh(@NotNull List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, @NotNull LoadStates sourceLoadStates, @Nullable LoadStates mediatorLoadStates) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.REFRESH, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            @NotNull
            public final Insert<Object> getEMPTY_REFRESH_LOCAL() {
                return Insert.EMPTY_REFRESH_LOCAL;
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            List listListOf = CollectionsKt__CollectionsJVMKt.listOf(TransformablePage.INSTANCE.getEMPTY_INITIAL_PAGE());
            LoadState.NotLoading.Companion companion2 = LoadState.NotLoading.INSTANCE;
            EMPTY_REFRESH_LOCAL = Companion.Refresh$default(companion, listListOf, 0, 0, new LoadStates(companion2.getIncomplete$paging_common(), companion2.getComplete$paging_common(), companion2.getComplete$paging_common()), null, 16, null);
        }

        public /* synthetic */ Insert(LoadType loadType, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, DefaultConstructorMarker defaultConstructorMarker) {
            this(loadType, list, i, i2, loadStates, loadStates2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Insert copy$default(Insert insert, LoadType loadType, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                loadType = insert.loadType;
            }
            if ((i3 & 2) != 0) {
                list = insert.pages;
            }
            List list2 = list;
            if ((i3 & 4) != 0) {
                i = insert.placeholdersBefore;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = insert.placeholdersAfter;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                loadStates = insert.sourceLoadStates;
            }
            LoadStates loadStates3 = loadStates;
            if ((i3 & 32) != 0) {
                loadStates2 = insert.mediatorLoadStates;
            }
            return insert.copy(loadType, list2, i4, i5, loadStates3, loadStates2);
        }

        private final <R> Insert<R> mapPages(Function1<? super TransformablePage<T>, TransformablePage<R>> transform) {
            LoadType loadType = getLoadType();
            List<TransformablePage<T>> pages = getPages();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(transform.invoke(it.next()));
            }
            return new Insert<>(loadType, arrayList, getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), null);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        @NotNull
        public final List<TransformablePage<T>> component2() {
            return this.pages;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        @NotNull
        public final Insert<T> copy(@NotNull LoadType loadType, @NotNull List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, @NotNull LoadStates sourceLoadStates, @Nullable LoadStates mediatorLoadStates) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            return new Insert<>(loadType, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) other;
            return this.loadType == insert.loadType && Intrinsics.areEqual(this.pages, insert.pages) && this.placeholdersBefore == insert.placeholdersBefore && this.placeholdersAfter == insert.placeholdersAfter && Intrinsics.areEqual(this.sourceLoadStates, insert.sourceLoadStates) && Intrinsics.areEqual(this.mediatorLoadStates, insert.mediatorLoadStates);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0093  */
        /* JADX WARN: Code duplicated, block: B:20:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:22:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:25:0x00e9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:34:0x0121  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0093 -> B:18:0x00b5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ea -> B:27:0x00f9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @org.jetbrains.annotations.Nullable
        public java.lang.Object filter(@org.jetbrains.annotations.NotNull p010kotlin.jvm.functions.Function2<? super T, ? super p010kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r19, @org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<T>> r20) {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.filter(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x009a  */
        /* JADX WARN: Code duplicated, block: B:20:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:22:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:25:0x00f5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:34:0x0133  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009a -> B:18:0x00bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f6 -> B:27:0x0103). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object flatMap(@org.jetbrains.annotations.NotNull p010kotlin.jvm.functions.Function2<? super T, ? super p010kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> r19, @org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> r20) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.flatMap(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public final LoadType getLoadType() {
            return this.loadType;
        }

        @Nullable
        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        @NotNull
        public final List<TransformablePage<T>> getPages() {
            return this.pages;
        }

        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        @NotNull
        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.loadType.hashCode() * 31) + this.pages.hashCode()) * 31) + Integer.hashCode(this.placeholdersBefore)) * 31) + Integer.hashCode(this.placeholdersAfter)) * 31) + this.sourceLoadStates.hashCode()) * 31;
            LoadStates loadStates = this.mediatorLoadStates;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0094  */
        /* JADX WARN: Code duplicated, block: B:20:0x00be  */
        /* JADX WARN: Code duplicated, block: B:22:0x00e0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:25:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0094 -> B:18:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e1 -> B:24:0x00e9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object map(@org.jetbrains.annotations.NotNull p010kotlin.jvm.functions.Function2<? super T, ? super p010kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r18, @org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> r19) {
            /*
                Method dump skipped, instruction units count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.map(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public String toString() {
            List<T> data;
            List<T> data2;
            Iterator<T> it = this.pages.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((TransformablePage) it.next()).getData().size();
            }
            int i = this.placeholdersBefore;
            String strValueOf = SpeechConstant.ENGINE_TYPE_NONE;
            String strValueOf2 = i != -1 ? String.valueOf(i) : SpeechConstant.ENGINE_TYPE_NONE;
            int i2 = this.placeholdersAfter;
            if (i2 != -1) {
                strValueOf = String.valueOf(i2);
            }
            LoadStates loadStates = this.mediatorLoadStates;
            StringBuilder sb = new StringBuilder();
            sb.append("PageEvent.Insert for ");
            sb.append(this.loadType);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            TransformablePage transformablePage = (TransformablePage) CollectionsKt___CollectionsKt.firstOrNull((List) this.pages);
            sb.append((transformablePage == null || (data2 = transformablePage.getData()) == null) ? null : CollectionsKt___CollectionsKt.firstOrNull((List) data2));
            sb.append("\n                    |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) CollectionsKt___CollectionsKt.lastOrNull((List) this.pages);
            sb.append((transformablePage2 == null || (data = transformablePage2.getData()) == null) ? null : CollectionsKt___CollectionsKt.lastOrNull((List) data));
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.sourceLoadStates);
            sb.append("\n                    ");
            String string = sb.toString();
            if (loadStates != null) {
                string = string + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt__IndentKt.trimMargin$default(string + "|)", null, 1, null);
        }

        @NotNull
        public final <R> Insert<R> transformPages$paging_common(@NotNull Function1<? super List<TransformablePage<T>>, ? extends List<TransformablePage<R>>> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return new Insert<>(getLoadType(), transform.invoke(getPages()), getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), null);
        }

        public /* synthetic */ Insert(LoadType loadType, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(loadType, list, i, i2, loadStates, (i3 & 32) != 0 ? null : loadStates2);
        }

        private Insert(LoadType loadType, List<TransformablePage<T>> list, int i, int i2, LoadStates loadStates, LoadStates loadStates2) {
            super(null);
            this.loadType = loadType;
            this.pages = list;
            this.placeholdersBefore = i;
            this.placeholdersAfter = i2;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            if (loadType == LoadType.APPEND || i >= 0) {
                if (loadType == LoadType.PREPEND || i2 >= 0) {
                    if (!(loadType != LoadType.REFRESH || (list.isEmpty() ^ true))) {
                        throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                    }
                    return;
                } else {
                    throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i2).toString());
                }
            }
            throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i).toString());
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PageEvent;", "source", "Landroidx/paging/LoadStates;", "mediator", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "getMediator", "()Landroidx/paging/LoadStates;", "getSource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$LoadStateUpdate\n+ 2 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n27#2,5:319\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$LoadStateUpdate\n*L\n300#1:319,5\n*E\n"})
    public static final /* data */ class LoadStateUpdate<T> extends PageEvent<T> {

        @Nullable
        private final LoadStates mediator;

        @NotNull
        private final LoadStates source;

        public /* synthetic */ LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(loadStates, (i & 2) != 0 ? null : loadStates2);
        }

        public static /* synthetic */ LoadStateUpdate copy$default(LoadStateUpdate loadStateUpdate, LoadStates loadStates, LoadStates loadStates2, int i, Object obj) {
            if ((i & 1) != 0) {
                loadStates = loadStateUpdate.source;
            }
            if ((i & 2) != 0) {
                loadStates2 = loadStateUpdate.mediator;
            }
            return loadStateUpdate.copy(loadStates, loadStates2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LoadStates getSource() {
            return this.source;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LoadStates getMediator() {
            return this.mediator;
        }

        @NotNull
        public final LoadStateUpdate<T> copy(@NotNull LoadStates source, @Nullable LoadStates mediator) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new LoadStateUpdate<>(source, mediator);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) other;
            return Intrinsics.areEqual(this.source, loadStateUpdate.source) && Intrinsics.areEqual(this.mediator, loadStateUpdate.mediator);
        }

        @Nullable
        public final LoadStates getMediator() {
            return this.mediator;
        }

        @NotNull
        public final LoadStates getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            LoadStates loadStates = this.mediator;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        @NotNull
        public String toString() {
            LoadStates loadStates = this.mediator;
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.source + "\n                    ";
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt__IndentKt.trimMargin$default(str + "|)", null, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadStateUpdate(@NotNull LoadStates source, @Nullable LoadStates loadStates) {
            super(null);
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
            this.mediator = loadStates;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003J;\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJK\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0003\"\b\b\u0002\u0010\u001c*\u00020\u00022(\u0010\u001d\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\u001e0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\t\u0010\u001f\u001a\u00020 HÖ\u0001JE\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0003\"\b\b\u0002\u0010\u001c*\u00020\u00022\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\b\u0010\"\u001a\u00020#H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/paging/PageEvent$StaticList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PageEvent;", "data", "", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "getData", "()Ljava/util/List;", "getMediatorLoadStates", "()Landroidx/paging/LoadStates;", "getSourceLoadStates", "component1", "component2", "component3", "copy", "equals", "", "other", "filter", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "transform", "", "hashCode", "", "map", "toString", "", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$StaticList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n1549#2:319\n1620#2,3:320\n1360#2:323\n1446#2,5:324\n766#2:329\n857#2,2:330\n27#3,5:332\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$StaticList\n*L\n48#1:319\n48#1:320,3\n58#1:323\n58#1:324,5\n66#1:329\n66#1:330,2\n73#1:332,5\n*E\n"})
    public static final /* data */ class StaticList<T> extends PageEvent<T> {

        @NotNull
        private final List<T> data;

        @Nullable
        private final LoadStates mediatorLoadStates;

        @Nullable
        private final LoadStates sourceLoadStates;

        public /* synthetic */ StaticList(List list, LoadStates loadStates, LoadStates loadStates2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : loadStates, (i & 4) != 0 ? null : loadStates2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StaticList copy$default(StaticList staticList, List list, LoadStates loadStates, LoadStates loadStates2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = staticList.data;
            }
            if ((i & 2) != 0) {
                loadStates = staticList.sourceLoadStates;
            }
            if ((i & 4) != 0) {
                loadStates2 = staticList.mediatorLoadStates;
            }
            return staticList.copy(list, loadStates, loadStates2);
        }

        @NotNull
        public final List<T> component1() {
            return this.data;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        @NotNull
        public final StaticList<T> copy(@NotNull List<? extends T> data, @Nullable LoadStates sourceLoadStates, @Nullable LoadStates mediatorLoadStates) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new StaticList<>(data, sourceLoadStates, mediatorLoadStates);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StaticList)) {
                return false;
            }
            StaticList staticList = (StaticList) other;
            return Intrinsics.areEqual(this.data, staticList.data) && Intrinsics.areEqual(this.sourceLoadStates, staticList.sourceLoadStates) && Intrinsics.areEqual(this.mediatorLoadStates, staticList.mediatorLoadStates);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0073  */
        /* JADX WARN: Code duplicated, block: B:23:0x0080  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0073 -> B:21:0x0078). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @org.jetbrains.annotations.Nullable
        public java.lang.Object filter(@org.jetbrains.annotations.NotNull p010kotlin.jvm.functions.Function2<? super T, ? super p010kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<T>> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.PageEvent$StaticList$filter$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.PageEvent$StaticList$filter$1 r0 = (androidx.paging.PageEvent$StaticList$filter$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.PageEvent$StaticList$filter$1 r0 = new androidx.paging.PageEvent$StaticList$filter$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L43
                if (r2 != r3) goto L3b
                java.lang.Object r7 = r0.L$4
                java.lang.Object r8 = r0.L$3
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.L$2
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r4 = r0.L$1
                kotlin.jvm.functions.Function2 r4 = (p010kotlin.jvm.functions.Function2) r4
                java.lang.Object r5 = r0.L$0
                androidx.paging.PageEvent$StaticList r5 = (androidx.paging.PageEvent.StaticList) r5
                p010kotlin.ResultKt.throwOnFailure(r9)
                goto L78
            L3b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L43:
                p010kotlin.ResultKt.throwOnFailure(r9)
                java.util.List<T> r9 = r7.data
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L56:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L86
                java.lang.Object r4 = r8.next()
                r0.L$0 = r7
                r0.L$1 = r9
                r0.L$2 = r2
                r0.L$3 = r8
                r0.L$4 = r4
                r0.label = r3
                java.lang.Object r5 = r9.invoke(r4, r0)
                if (r5 != r1) goto L73
                return r1
            L73:
                r6 = r5
                r5 = r7
                r7 = r4
                r4 = r9
                r9 = r6
            L78:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L83
                r2.add(r7)
            L83:
                r9 = r4
                r7 = r5
                goto L56
            L86:
                java.util.List r2 = (java.util.List) r2
                androidx.paging.LoadStates r8 = r7.sourceLoadStates
                androidx.paging.LoadStates r7 = r7.mediatorLoadStates
                androidx.paging.PageEvent$StaticList r9 = new androidx.paging.PageEvent$StaticList
                r9.<init>(r2, r8, r7)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.filter(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0073  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0073 -> B:21:0x0077). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object flatMap(@org.jetbrains.annotations.NotNull p010kotlin.jvm.functions.Function2<? super T, ? super p010kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.paging.PageEvent$StaticList$flatMap$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.paging.PageEvent$StaticList$flatMap$1 r0 = (androidx.paging.PageEvent$StaticList$flatMap$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.PageEvent$StaticList$flatMap$1 r0 = new androidx.paging.PageEvent$StaticList$flatMap$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L44
                if (r2 != r3) goto L3c
                java.lang.Object r6 = r0.L$3
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.L$2
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r2 = r0.L$1
                kotlin.jvm.functions.Function2 r2 = (p010kotlin.jvm.functions.Function2) r2
                java.lang.Object r4 = r0.L$0
                androidx.paging.PageEvent$StaticList r4 = (androidx.paging.PageEvent.StaticList) r4
                p010kotlin.ResultKt.throwOnFailure(r8)
                r5 = r4
                r4 = r7
                r7 = r5
                goto L77
            L3c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L44:
                p010kotlin.ResultKt.throwOnFailure(r8)
                java.util.List<T> r8 = r6.data
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r8 = r8.iterator()
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r5
            L58:
                boolean r4 = r6.hasNext()
                if (r4 == 0) goto L7f
                java.lang.Object r4 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r2
                r0.L$3 = r6
                r0.label = r3
                java.lang.Object r4 = r8.invoke(r4, r0)
                if (r4 != r1) goto L73
                return r1
            L73:
                r5 = r2
                r2 = r8
                r8 = r4
                r4 = r5
            L77:
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                p010kotlin.collections.CollectionsKt.addAll(r4, r8)
                r8 = r2
                r2 = r4
                goto L58
            L7f:
                java.util.List r2 = (java.util.List) r2
                androidx.paging.LoadStates r6 = r7.sourceLoadStates
                androidx.paging.LoadStates r7 = r7.mediatorLoadStates
                androidx.paging.PageEvent$StaticList r8 = new androidx.paging.PageEvent$StaticList
                r8.<init>(r2, r6, r7)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.flatMap(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public final List<T> getData() {
            return this.data;
        }

        @Nullable
        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        @Nullable
        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            LoadStates loadStates = this.sourceLoadStates;
            int iHashCode2 = (iHashCode + (loadStates == null ? 0 : loadStates.hashCode())) * 31;
            LoadStates loadStates2 = this.mediatorLoadStates;
            return iHashCode2 + (loadStates2 != null ? loadStates2.hashCode() : 0);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x006c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0083  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0083 -> B:21:0x0089). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.paging.PageEvent
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object map(@org.jetbrains.annotations.NotNull p010kotlin.jvm.functions.Function2<? super T, ? super p010kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.PageEvent$StaticList$map$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.PageEvent$StaticList$map$1 r0 = (androidx.paging.PageEvent$StaticList$map$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.PageEvent$StaticList$map$1 r0 = new androidx.paging.PageEvent$StaticList$map$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L4a
                if (r2 != r3) goto L42
                java.lang.Object r7 = r0.L$4
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r0.L$3
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.L$2
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r4 = r0.L$1
                kotlin.jvm.functions.Function2 r4 = (p010kotlin.jvm.functions.Function2) r4
                java.lang.Object r5 = r0.L$0
                androidx.paging.PageEvent$StaticList r5 = (androidx.paging.PageEvent.StaticList) r5
                p010kotlin.ResultKt.throwOnFailure(r9)
                r6 = r0
                r0 = r8
                r8 = r5
                r5 = r1
                r1 = r6
                goto L89
            L42:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L4a:
                p010kotlin.ResultKt.throwOnFailure(r9)
                java.util.List<T> r9 = r7.data
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = p010kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r4)
                r2.<init>(r4)
                java.util.Iterator r9 = r9.iterator()
                r6 = r8
                r8 = r7
                r7 = r2
                r2 = r1
                r1 = r0
                r0 = r6
            L66:
                boolean r4 = r9.hasNext()
                if (r4 == 0) goto L91
                java.lang.Object r4 = r9.next()
                r1.L$0 = r8
                r1.L$1 = r0
                r1.L$2 = r7
                r1.L$3 = r9
                r1.L$4 = r7
                r1.label = r3
                java.lang.Object r4 = r0.invoke(r4, r1)
                if (r4 != r2) goto L83
                return r2
            L83:
                r5 = r2
                r2 = r7
                r6 = r0
                r0 = r9
                r9 = r4
                r4 = r6
            L89:
                r7.add(r9)
                r9 = r0
                r7 = r2
                r0 = r4
                r2 = r5
                goto L66
            L91:
                java.util.List r7 = (java.util.List) r7
                androidx.paging.LoadStates r9 = r8.sourceLoadStates
                androidx.paging.LoadStates r8 = r8.mediatorLoadStates
                androidx.paging.PageEvent$StaticList r0 = new androidx.paging.PageEvent$StaticList
                r0.<init>(r7, r9, r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.StaticList.map(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public String toString() {
            LoadStates loadStates = this.mediatorLoadStates;
            String str = "PageEvent.StaticList with " + this.data.size() + " items (\n                    |   first item: " + CollectionsKt___CollectionsKt.firstOrNull((List) this.data) + "\n                    |   last item: " + CollectionsKt___CollectionsKt.lastOrNull((List) this.data) + "\n                    |   sourceLoadStates: " + this.sourceLoadStates + "\n                    ";
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt__IndentKt.trimMargin$default(str + "|)", null, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StaticList(@NotNull List<? extends T> data, @Nullable LoadStates loadStates, @Nullable LoadStates loadStates2) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
        }
    }

    private PageEvent() {
    }

    public /* synthetic */ PageEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ <T> Object filter$suspendImpl(PageEvent<T> pageEvent, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super PageEvent<T>> continuation) {
        return pageEvent;
    }

    public static /* synthetic */ <T, R> Object flatMap$suspendImpl(PageEvent<T> pageEvent, Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
        Intrinsics.checkNotNull(pageEvent, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.flatMap>");
        return pageEvent;
    }

    public static /* synthetic */ <T, R> Object map$suspendImpl(PageEvent<T> pageEvent, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
        Intrinsics.checkNotNull(pageEvent, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>");
        return pageEvent;
    }

    @Nullable
    public Object filter(@NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super PageEvent<T>> continuation) {
        return filter$suspendImpl(this, function2, continuation);
    }

    @Nullable
    public <R> Object flatMap(@NotNull Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function2, @NotNull Continuation<? super PageEvent<R>> continuation) {
        return flatMap$suspendImpl(this, function2, continuation);
    }

    @Nullable
    public <R> Object map(@NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super PageEvent<R>> continuation) {
        return map$suspendImpl(this, function2, continuation);
    }
}
