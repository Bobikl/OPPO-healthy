package com.oplus.aiunit.vision;

import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes12.dex */
public final class uqm implements TileProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MapConfig f17569c;
    public final int a = 256;
    public final int b = 256;
    public final boolean d = false;

    public class a extends com.amap.api.col.p0003sl.m {
        public int r;
        public int s;
        public int t;
        public String u;
        public String v;
        public Random w = new Random();

        public a(int i, int i2, int i3, String str) {
            this.v = "";
            this.r = i;
            this.s = i2;
            this.t = i3;
            this.u = str;
            this.v = m();
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=");
            stringBuffer.append(n0n.j(qdm.a));
            stringBuffer.append("&channel=amapapi");
            if (frm.b(this.r, this.s, this.t) || this.t < 6) {
                stringBuffer.append("&z=");
                stringBuffer.append(this.t);
                stringBuffer.append("&x=");
                stringBuffer.append(this.r);
                stringBuffer.append("&y=");
                stringBuffer.append(this.s);
                stringBuffer.append("&lang=en&size=1&scale=1&style=7");
            } else if (MapsInitializer.isLoadWorldGridMap()) {
                stringBuffer.append("&x=");
                stringBuffer.append(this.r);
                stringBuffer.append("&y=");
                stringBuffer.append(this.s);
                stringBuffer.append("&z=");
                stringBuffer.append(this.t);
                stringBuffer.append("&ds=0");
                stringBuffer.append("&dpitype=webrd");
                stringBuffer.append("&lang=");
                stringBuffer.append(this.u);
                stringBuffer.append("&scale=2");
            }
            return this.v + appendTsScode(stringBuffer.toString());
        }

        public final String m() {
            if (frm.b(this.r, this.s, this.t) || this.t < 6) {
                return String.format(Locale.US, "http://wprd0%d.is.autonavi.com/appmaptile?", Integer.valueOf((this.w.nextInt(100000) % 4) + 1));
            }
            if (MapsInitializer.isLoadWorldGridMap()) {
                return "http://restsdk.amap.com/v4/gridmap?";
            }
            return null;
        }
    }

    public uqm(MapConfig mapConfig) {
        this.f17569c = mapConfig;
    }

    public final byte[] a(int i, int i2, int i3, String str) throws IOException {
        try {
            return new a(i, i2, i3, str).makeHttpRequestWithInterrupted();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            if (!this.d) {
                if (this.f17569c.getMapLanguage().equals("zh_cn")) {
                    if (!MapsInitializer.isLoadWorldGridMap()) {
                        return TileProvider.NO_TILE;
                    }
                    if (i3 < 6 || frm.b(i, i2, i3)) {
                        return TileProvider.NO_TILE;
                    }
                } else if (!MapsInitializer.isLoadWorldGridMap() && i3 >= 6 && !frm.b(i, i2, i3)) {
                    return TileProvider.NO_TILE;
                }
            }
            MapConfig mapConfig = this.f17569c;
            byte[] bArrA = a(i, i2, i3, mapConfig != null ? mapConfig.getMapLanguage() : "zh_cn");
            return bArrA == null ? TileProvider.NO_TILE : Tile.obtain(this.a, this.b, bArrA);
        } catch (IOException unused) {
            return TileProvider.NO_TILE;
        }
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileHeight() {
        return this.b;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileWidth() {
        return this.a;
    }
}
