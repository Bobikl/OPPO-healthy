package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAutoAirplaneMode;

/* JADX INFO: loaded from: classes18.dex */
public class ct7 {
    public boolean a;

    public ct7() {
        this.a = true;
    }

    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ct7 clone() {
        ct7 ct7Var = new ct7();
        ct7Var.c(this.a);
        return ct7Var;
    }

    public boolean b() {
        return this.a;
    }

    public void c(boolean z) {
        this.a = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ct7) {
            return ((ct7) obj).a == this.a;
        }
        return super.equals(obj);
    }

    public String toString() {
        return "FlightMode{enable=" + this.a + '}';
    }

    public ct7(boolean z) {
        this.a = z;
    }

    public ct7(SchoolModeProto$SchoolModeAutoAirplaneMode schoolModeProto$SchoolModeAutoAirplaneMode) {
        this.a = true;
        this.a = schoolModeProto$SchoolModeAutoAirplaneMode.getEnable() == 1;
    }
}
