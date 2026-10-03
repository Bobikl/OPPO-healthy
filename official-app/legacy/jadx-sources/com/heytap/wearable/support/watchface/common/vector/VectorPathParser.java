package com.heytap.wearable.support.watchface.common.vector;

import android.graphics.Path;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class VectorPathParser {
    private static final int COORDINATE_LENGTH_1 = 1;
    private static final int COORDINATE_LENGTH_2 = 2;
    private static final int COORDINATE_LENGTH_4 = 4;
    private static final int COORDINATE_LENGTH_6 = 6;
    private static final int COORDINATE_LENGTH_7 = 7;
    private static final String TAG = "VectorPathParser";

    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c2, float[] fArr) {
        arrayList.add(new PathDataNode(c2, fArr));
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            PathDataNode pathDataNode = pathDataNodeArr[i];
            char c2 = pathDataNode.mChar;
            PathDataNode pathDataNode2 = pathDataNodeArr2[i];
            if (c2 != pathDataNode2.mChar || pathDataNode.mParams.length != pathDataNode2.mParams.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float[] copyOfRange(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int iMin = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int iNextStart = nextStart(str, i);
            String strTrim = str.substring(i2, iNextStart).trim();
            if (strTrim.length() > 0) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i2 = iNextStart;
            i = iNextStart + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            addNode(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] pathDataNodeArrCreateNodesFromPathData = createNodesFromPathData(str);
        if (pathDataNodeArrCreateNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(pathDataNodeArrCreateNodesFromPathData, path);
        } catch (RuntimeException e2) {
            SdkDebugLog.e(TAG, "[createPathFromPathData] RuntimeException:" + e2.toString());
        }
        return path;
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    private static void extract(String str, int i, ExtractFloatResult extractFloatResult) {
        extractFloatResult.mEndWithNegOrDot = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ') {
                z = false;
                z3 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z = false;
                        z3 = true;
                        break;
                    case '-':
                        if (i2 == i || z) {
                            z = false;
                        } else {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z = false;
                            z3 = true;
                        }
                        break;
                    case '.':
                        if (z2) {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z = false;
                            z3 = true;
                        } else {
                            z = false;
                            z2 = true;
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = true;
            }
            if (z3) {
                extractFloatResult.mEndPosition = i2;
            }
        }
        extractFloatResult.mEndPosition = i2;
    }

    private static float[] getFloats(String str) {
        int i = 0;
        int i2 = 1;
        if ((str.charAt(0) == 'z') || (str.charAt(0) == 'Z')) {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            while (i2 < length) {
                extract(str, i2, extractFloatResult);
                int i3 = extractFloatResult.mEndPosition;
                if (i2 < i3) {
                    fArr[i] = Float.parseFloat(str.substring(i2, i3));
                    i++;
                }
                i2 = extractFloatResult.mEndWithNegOrDot ? i3 : i3 + 1;
            }
            return copyOfRange(fArr, i);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            PathDataNode pathDataNode = pathDataNodeArr[i];
            PathDataNode pathDataNode2 = pathDataNodeArr2[i];
            pathDataNode.mChar = pathDataNode2.mChar;
            float[] fArr = pathDataNode2.mParams;
            System.arraycopy(fArr, 0, pathDataNode.mParams, 0, fArr.length);
        }
    }

    public static class PathDataNode {
        char mChar;
        float[] mParams;

        public PathDataNode(char c2, float[] fArr) {
            this.mChar = c2;
            this.mParams = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void addCommand(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            Path path2 = path;
            char c4 = c3;
            boolean z = false;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    i2 = i;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    i2 = i;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i2 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i2 = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i4 = 0;
            char c5 = c2;
            while (i4 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 == 'C') {
                        i3 = i4;
                        int i5 = i3 + 2;
                        int i6 = i3 + 3;
                        int i7 = i3 + 4;
                        int i8 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        float f19 = fArr2[i7];
                        f16 = fArr2[i8];
                        float f20 = fArr2[i5];
                        f15 = f19;
                        f12 = fArr2[i6];
                        f11 = f20;
                    } else if (c4 == 'H') {
                        i3 = i4;
                        path2.lineTo(fArr2[i3], f16);
                        f15 = fArr2[i3];
                    } else if (c4 == 'Q') {
                        i3 = i4;
                        int i9 = i3 + 1;
                        int i10 = i3 + 2;
                        int i11 = i3 + 3;
                        path2.quadTo(fArr2[i3], fArr2[i9], fArr2[i10], fArr2[i11]);
                        float f21 = fArr2[i3];
                        float f22 = fArr2[i9];
                        f15 = fArr2[i10];
                        f16 = fArr2[i11];
                        f11 = f21;
                        f12 = f22;
                    } else if (c4 == 'V') {
                        i3 = i4;
                        float f23 = f15;
                        path2 = path;
                        path2.lineTo(f23, fArr2[i3]);
                        f16 = fArr2[i3];
                        f15 = f23;
                    } else if (c4 != 'a') {
                        if (c4 != 'c') {
                            if (c4 == 'h') {
                                path2.rLineTo(fArr2[i4], 0.0f);
                                f15 += fArr2[i4];
                            } else if (c4 != 'q') {
                                if (c4 == 'v') {
                                    path2.rLineTo(0.0f, fArr2[i4]);
                                    f4 = fArr2[i4];
                                } else if (c4 == 'L') {
                                    int i12 = i4 + 1;
                                    path2.lineTo(fArr2[i4], fArr2[i12]);
                                    f15 = fArr2[i4];
                                    f16 = fArr2[i12];
                                } else if (c4 == 'M') {
                                    f15 = fArr2[i4];
                                    f16 = fArr2[i4 + 1];
                                    if (i4 > 0) {
                                        path2.lineTo(f15, f16);
                                    } else {
                                        path2.moveTo(f15, f16);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c4 == 'S') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    float f24 = f15;
                                    int i13 = i4 + 1;
                                    int i14 = i4 + 2;
                                    int i15 = i4 + 3;
                                    path.cubicTo(f24, f16, fArr2[i4], fArr2[i13], fArr2[i14], fArr2[i15]);
                                    float f25 = fArr2[i4];
                                    float f26 = fArr2[i13];
                                    float f27 = fArr2[i14];
                                    f16 = fArr2[i15];
                                    f12 = f26;
                                    f15 = f27;
                                    i3 = i4;
                                    f11 = f25;
                                } else if (c4 == 'T') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int i16 = i4 + 1;
                                    path2.quadTo(f15, f16, fArr2[i4], fArr2[i16]);
                                    i3 = i4;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = fArr2[i4];
                                    f16 = fArr2[i16];
                                } else if (c4 == 'l') {
                                    int i17 = i4 + 1;
                                    path2.rLineTo(fArr2[i4], fArr2[i17]);
                                    f15 += fArr2[i4];
                                    f4 = fArr2[i17];
                                } else if (c4 == 'm') {
                                    float f28 = fArr2[i4];
                                    f15 += f28;
                                    float f29 = fArr2[i4 + 1];
                                    f16 += f29;
                                    if (i4 > 0) {
                                        path2.rLineTo(f28, f29);
                                    } else {
                                        path2.rMoveTo(f28, f29);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c4 == 's') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        float f30 = f15 - f11;
                                        f5 = f16 - f12;
                                        f6 = f30;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int i18 = i4 + 1;
                                    int i19 = i4 + 2;
                                    int i20 = i4 + 3;
                                    path.rCubicTo(f6, f5, fArr2[i4], fArr2[i18], fArr2[i19], fArr2[i20]);
                                    f = fArr2[i4] + f15;
                                    f2 = fArr2[i18] + f16;
                                    f15 += fArr2[i19];
                                    f3 = fArr2[i20];
                                } else if (c4 == 't') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i21 = i4 + 1;
                                    path2.rQuadTo(f7, f8, fArr2[i4], fArr2[i21]);
                                    float f31 = f7 + f15;
                                    float f32 = f8 + f16;
                                    f15 += fArr2[i4];
                                    f16 += fArr2[i21];
                                    f12 = f32;
                                    f11 = f31;
                                }
                                f16 += f4;
                            } else {
                                int i22 = i4 + 1;
                                int i23 = i4 + 2;
                                int i24 = i4 + 3;
                                path2.rQuadTo(fArr2[i4], fArr2[i22], fArr2[i23], fArr2[i24]);
                                f = fArr2[i4] + f15;
                                f2 = fArr2[i22] + f16;
                                f15 += fArr2[i23];
                                f3 = fArr2[i24];
                            }
                            i3 = i4;
                        } else {
                            int i25 = i4 + 2;
                            int i26 = i4 + 3;
                            int i27 = i4 + 4;
                            int i28 = i4 + 5;
                            path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                            f = fArr2[i25] + f15;
                            f2 = fArr2[i26] + f16;
                            f15 += fArr2[i27];
                            f3 = fArr2[i28];
                        }
                        f16 += f3;
                        f11 = f;
                        f12 = f2;
                        i3 = i4;
                    } else {
                        int i29 = i4 + 5;
                        int i30 = i4 + 6;
                        i3 = i4;
                        drawArc(path, f15, f16, fArr2[i29] + f15, fArr2[i30] + f16, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f15 += fArr2[i29];
                        f16 += fArr2[i30];
                        path2 = path;
                    }
                    i4 = i3 + i2;
                    c5 = c3;
                    c4 = c5;
                    z = false;
                } else {
                    i3 = i4;
                    int i31 = i3 + 5;
                    int i32 = i3 + 6;
                    drawArc(path, f15, f16, fArr2[i31], fArr2[i32], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f15 = fArr2[i31];
                    f16 = fArr2[i32];
                }
                f12 = f16;
                f11 = f15;
                i4 = i3 + i2;
                c5 = c3;
                c4 = c5;
                z = false;
            }
            fArr[z ? 1 : 0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        private void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = (d12 * dSin2) - (d13 * dCos2);
            double d15 = d11 * dSin;
            double d16 = d4 * dCos;
            double d17 = (dSin2 * d15) + (dCos2 * d16);
            double d18 = d9 / ((double) iCeil);
            double d19 = d17;
            double d20 = d14;
            int i = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (i < iCeil) {
                double d24 = d23 + d18;
                double dSin3 = Math.sin(d24);
                double dCos3 = Math.cos(d24);
                double d25 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                double d26 = d2 + (d10 * dSin * dCos3) + (d16 * dSin3);
                double d27 = (d12 * dSin3) - (d13 * dCos3);
                double d28 = (dSin3 * d15) + (dCos3 * d16);
                double d29 = d24 - d23;
                double dTan = Math.tan(d29 / 2.0d);
                double dSin4 = (Math.sin(d29) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d21 + (d20 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d22 + (d19 * dSin4)), (float) (d25 - (dSin4 * d27)), (float) (d26 - (dSin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                dSin = dSin;
                d21 = d25;
                d15 = d15;
                dCos = dCos;
                d23 = d24;
                d19 = d28;
                d20 = d27;
                iCeil = iCeil;
                d22 = d26;
                d10 = d3;
            }
        }

        private void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * dCos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * dSin)) / d6;
            double d8 = (((double) (-f)) * dSin) + (d5 * dCos);
            double d9 = f6;
            double d10 = d8 / d9;
            double d11 = f4;
            double d12 = ((((double) f3) * dCos) + (d11 * dSin)) / d6;
            double d13 = ((((double) (-f3)) * dSin) + (d11 * dCos)) / d9;
            double d14 = d7 - d12;
            double d15 = d10 - d13;
            double d16 = (d7 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == 0.0d) {
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
                drawArc(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d19);
            double d20 = d14 * dSqrt;
            double d21 = dSqrt * d15;
            if (z == z2) {
                d = d16 - d21;
                d2 = d17 + d20;
            } else {
                d = d16 + d21;
                d2 = d17 - d20;
            }
            double dAtan2 = Math.atan2(d10 - d2, d7 - d);
            double dAtan3 = Math.atan2(d13 - d2, d12 - d) - dAtan2;
            if (z2 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d22 = d * d6;
            double d23 = d2 * d9;
            arcToBezier(path, (d22 * dCos) - (d23 * dSin), (d22 * dSin) + (d23 * dCos), d6, d9, d3, d5, radians, dAtan2, dAtan3);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (PathDataNode pathDataNode : pathDataNodeArr) {
                pathDataNode.addCommand(path, fArr, c2, pathDataNode.mChar, pathDataNode.mParams);
                c2 = pathDataNode.mChar;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            int i = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i >= fArr.length) {
                    return;
                }
                this.mParams[i] = (fArr[i] * (1.0f - f)) + (pathDataNode2.mParams[i] * f);
                i++;
            }
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mChar = pathDataNode.mChar;
            float[] fArr = pathDataNode.mParams;
            this.mParams = VectorPathParser.copyOfRange(fArr, fArr.length);
        }
    }
}
