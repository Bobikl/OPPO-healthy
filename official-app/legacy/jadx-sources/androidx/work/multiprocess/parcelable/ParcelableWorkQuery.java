package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ParcelableWorkQuery implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkQuery> CREATOR = new Parcelable.Creator<ParcelableWorkQuery>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkQuery.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkQuery createFromParcel(Parcel parcel) {
            return new ParcelableWorkQuery(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkQuery[] newArray(int i) {
            return new ParcelableWorkQuery[i];
        }
    };
    private final WorkQuery mWorkQuery;

    public ParcelableWorkQuery(@NonNull WorkQuery workQuery) {
        this.mWorkQuery = workQuery;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public WorkQuery getWorkQuery() {
        return this.mWorkQuery;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        List<UUID> ids = this.mWorkQuery.getIds();
        parcel.writeInt(ids.size());
        if (!ids.isEmpty()) {
            Iterator<UUID> it = ids.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().toString());
            }
        }
        parcel.writeStringList(this.mWorkQuery.getUniqueWorkNames());
        parcel.writeStringList(this.mWorkQuery.getTags());
        List<WorkInfo.State> states = this.mWorkQuery.getStates();
        parcel.writeInt(states.size());
        if (states.isEmpty()) {
            return;
        }
        Iterator<WorkInfo.State> it2 = states.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(WorkTypeConverters.stateToInt(it2.next()));
        }
    }

    public ParcelableWorkQuery(@NonNull Parcel parcel) {
        List listEmptyList = Collections.emptyList();
        int i = parcel.readInt();
        if (i > 0) {
            listEmptyList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                listEmptyList.add(UUID.fromString(parcel.readString()));
            }
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        List<? extends WorkInfo.State> listEmptyList2 = Collections.emptyList();
        int i3 = parcel.readInt();
        if (i3 > 0) {
            listEmptyList2 = new ArrayList<>(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                listEmptyList2.add(WorkTypeConverters.intToState(parcel.readInt()));
            }
        }
        this.mWorkQuery = WorkQuery.Builder.fromIds(listEmptyList).addUniqueWorkNames(arrayListCreateStringArrayList).addTags(arrayListCreateStringArrayList2).addStates(listEmptyList2).build();
    }
}
