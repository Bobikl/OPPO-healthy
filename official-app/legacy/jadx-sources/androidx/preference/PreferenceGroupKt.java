package androidx.preference;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.markers.KMutableIterator;
import p010kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0003\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\u0002\u001a0\u0010\r\u001a\u00020\u000e*\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\b\u001aE\u0010\u0013\u001a\u00020\u000e*\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0014H\u0086\b\u001a&\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\b\b\u0000\u0010\u0017*\u00020\u0002*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\n¢\u0006\u0002\u0010\u001a\u001a\u0015\u0010\u0016\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\u0002\u001a\r\u0010\u001b\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\r\u0010\u001c\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e*\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u001f\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010 \u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\n\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006!"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroidx/preference/Preference;", "Landroidx/preference/PreferenceGroup;", "getChildren", "(Landroidx/preference/PreferenceGroup;)Lkotlin/sequences/Sequence;", "size", "", "getSize", "(Landroidx/preference/PreferenceGroup;)I", "contains", "", "preference", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", ParserTag.TAG_GET, ExifInterface.GPS_DIRECTION_TRUE, "key", "", "(Landroidx/preference/PreferenceGroup;Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "preference-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class PreferenceGroupKt {

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroupKt$iterator$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/preference/PreferenceGroupKt$iterator$1", "", "Landroidx/preference/Preference;", "index", "", "hasNext", "", "next", EventType.STATE_PACKAGE_CHANGED_REMOVE, "", "preference-ktx_release"}, k = 1, mv = {1, 1, 15})
    public static final class AnonymousClass1 implements Iterator<Preference>, KMutableIterator {
        final /* synthetic */ PreferenceGroup $this_iterator;
        private int index;

        public AnonymousClass1(PreferenceGroup preferenceGroup) {
            this.$this_iterator = preferenceGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getPreferenceCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            preferenceGroup.removePreference(preferenceGroup.getPreference(i));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @NotNull
        public Preference next() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            Preference preference = preferenceGroup.getPreference(i);
            if (preference != null) {
                return preference;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean contains(@NotNull PreferenceGroup contains, @NotNull Preference preference) {
        Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        Intrinsics.checkParameterIsNotNull(preference, "preference");
        int preferenceCount = contains.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            if (Intrinsics.areEqual(contains.getPreference(i), preference)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(@NotNull PreferenceGroup forEach, @NotNull Function1<? super Preference, Unit> action) {
        Intrinsics.checkParameterIsNotNull(forEach, "$this$forEach");
        Intrinsics.checkParameterIsNotNull(action, "action");
        int preferenceCount = forEach.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            action.invoke(get(forEach, i));
        }
    }

    public static final void forEachIndexed(@NotNull PreferenceGroup forEachIndexed, @NotNull Function2<? super Integer, ? super Preference, Unit> action) {
        Intrinsics.checkParameterIsNotNull(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkParameterIsNotNull(action, "action");
        int preferenceCount = forEachIndexed.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            action.invoke(Integer.valueOf(i), get(forEachIndexed, i));
        }
    }

    @Nullable
    public static final <T extends Preference> T get(@NotNull PreferenceGroup get, @NotNull CharSequence key) {
        Intrinsics.checkParameterIsNotNull(get, "$this$get");
        Intrinsics.checkParameterIsNotNull(key, "key");
        return (T) get.findPreference(key);
    }

    @NotNull
    public static final Sequence<Preference> getChildren(@NotNull final PreferenceGroup children) {
        Intrinsics.checkParameterIsNotNull(children, "$this$children");
        return new Sequence<Preference>() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // p010kotlin.sequences.Sequence
            @NotNull
            public Iterator<Preference> iterator() {
                return PreferenceGroupKt.iterator(children);
            }
        };
    }

    public static final int getSize(@NotNull PreferenceGroup size) {
        Intrinsics.checkParameterIsNotNull(size, "$this$size");
        return size.getPreferenceCount();
    }

    public static final boolean isEmpty(@NotNull PreferenceGroup isEmpty) {
        Intrinsics.checkParameterIsNotNull(isEmpty, "$this$isEmpty");
        return isEmpty.getPreferenceCount() == 0;
    }

    public static final boolean isNotEmpty(@NotNull PreferenceGroup isNotEmpty) {
        Intrinsics.checkParameterIsNotNull(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.getPreferenceCount() != 0;
    }

    @NotNull
    public static final Iterator<Preference> iterator(@NotNull PreferenceGroup iterator) {
        Intrinsics.checkParameterIsNotNull(iterator, "$this$iterator");
        return new AnonymousClass1(iterator);
    }

    public static final void minusAssign(@NotNull PreferenceGroup minusAssign, @NotNull Preference preference) {
        Intrinsics.checkParameterIsNotNull(minusAssign, "$this$minusAssign");
        Intrinsics.checkParameterIsNotNull(preference, "preference");
        minusAssign.removePreference(preference);
    }

    public static final void plusAssign(@NotNull PreferenceGroup plusAssign, @NotNull Preference preference) {
        Intrinsics.checkParameterIsNotNull(plusAssign, "$this$plusAssign");
        Intrinsics.checkParameterIsNotNull(preference, "preference");
        plusAssign.addPreference(preference);
    }

    @NotNull
    public static final Preference get(@NotNull PreferenceGroup get, int i) {
        Intrinsics.checkParameterIsNotNull(get, "$this$get");
        Preference preference = get.getPreference(i);
        if (preference != null) {
            return preference;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + get.getPreferenceCount());
    }
}
