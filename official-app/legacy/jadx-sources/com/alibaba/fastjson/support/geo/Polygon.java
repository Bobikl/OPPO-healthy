package com.alibaba.fastjson.support.geo;

import com.alibaba.fastjson.annotation.JSONType;
import com.oplus.aiunit.vision.tme;

/* JADX INFO: loaded from: classes12.dex */
@JSONType(orders = {"type", "bbox", "coordinates"}, typeName = tme.c.POLYGON_SHAPE)
public class Polygon extends Geometry {
    private double[][][] coordinates;

    public Polygon() {
        super(tme.c.POLYGON_SHAPE);
    }

    public double[][][] getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(double[][][] dArr) {
        this.coordinates = dArr;
    }
}
