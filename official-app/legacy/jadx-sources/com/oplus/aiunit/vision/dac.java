package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {ProtocolEventManager.Event.MAC_ADDRESS, "index"}, tableName = "music_record")
public class dac {

    @ColumnInfo(name = "index")
    public int a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "_id")
    public long f10458c;

    @ColumnInfo(defaultValue = "", name = "title")
    public String d;

    @ColumnInfo(defaultValue = "", name = "artist")
    public String f;

    @ColumnInfo(defaultValue = "", name = lo9.TAG_DEFAULT_CREATION_ALBUM)
    public String g;

    @ColumnInfo(defaultValue = "", name = "path")
    public String h;

    @ColumnInfo(name = "size")
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColumnInfo(defaultValue = "", name = BreakpointSQLiteKey.FILENAME)
    public String f10460j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ColumnInfo(defaultValue = "", name = "folder")
    public String f10461l;

    @Ignore
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Ignore
    public String f10462n;

    @Ignore
    public String o;

    @Ignore
    public String p;

    @NonNull
    @ColumnInfo(defaultValue = "", name = ProtocolEventManager.Event.MAC_ADDRESS)
    public String b = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @ColumnInfo(defaultValue = "", name = "limit_title")
    public String f10459e = "";

    @NonNull
    @ColumnInfo(defaultValue = "", name = "limit_filename")
    public String k = "";

    public String a() {
        return this.g;
    }

    public String b() {
        return this.o;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.f10462n;
    }

    public String e() {
        return this.f10460j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dac dacVar = (dac) obj;
        return Objects.equals(this.b, dacVar.b) && Objects.equals(this.f10459e, dacVar.f10459e) && Objects.equals(this.k, dacVar.k);
    }

    public String f() {
        return this.f10461l;
    }

    public String g() {
        return this.p;
    }

    public long h() {
        return this.f10458c;
    }

    public int hashCode() {
        return Objects.hash(this.b, this.f10459e, this.k);
    }

    @NotNull
    public String i() {
        return this.k;
    }

    @NotNull
    public String j() {
        return this.f10459e;
    }

    public double k() {
        return ((double) this.i) / 1048576.0d;
    }

    public String l() {
        return this.h;
    }

    public int m() {
        return this.i;
    }

    public String n() {
        return this.d;
    }

    public String o() {
        return this.m;
    }

    public void p(String str) {
        this.g = str;
        this.o = rke.a(str);
    }

    public void q(String str) {
        this.f = str;
        this.f10462n = rke.a(str);
    }

    public void r(String str) {
        this.f10460j = str;
        this.k = j1j.d(str, 127);
    }

    public void s(String str) {
        this.f10461l = str;
        this.p = rke.a(str);
    }

    public void t(long j2) {
        this.f10458c = j2;
    }

    public String toString() {
        return "MusicInfoBean{mMacAddress='" + this.b + "', mIndex='" + this.a + "', mId='" + this.f10458c + "', mTitle='" + this.d + "', mLimitTitle='" + this.f10459e + "', mArtist='" + this.f + "', mAlbum='" + this.g + "', mPath='" + this.h + "', mSize=" + this.i + ", mFileName='" + this.f10460j + "', mLimitFileName='" + this.k + "', mFolder='" + this.f10461l + "', mTitlePinyin='" + this.m + "', mArtistPinyin='" + this.f10462n + "', mAlbumPinyin='" + this.o + "', mFolderPinyin='" + this.p + "'}";
    }

    public void u(int i) {
        this.a = i;
    }

    public void v(@NotNull String str) {
        this.b = str;
    }

    public void w(String str) {
        this.h = str;
    }

    public void x(int i) {
        this.i = i;
    }

    public void y(String str) {
        String strTrim = str.trim();
        this.d = strTrim;
        this.m = rke.a(strTrim);
        this.f10459e = j1j.d(strTrim, 127);
    }
}
