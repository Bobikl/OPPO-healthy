package com.lifesense.device.scale.application.interfaces.algorithm;

/* JADX INFO: loaded from: classes4.dex */
public class WeightAlgorithm {
    public static double getBasalMetabolism(boolean z, double d, double d2) {
        if (d == 0.0d || d2 == 0.0d) {
            return 0.0d;
        }
        return (d * 21.6d * (1.0d - (d2 / 100.0d))) + 370.0d;
    }

    public static double getBmi(double d, double d2) {
        if (d == 0.0d || d2 == 0.0d) {
            return 0.0d;
        }
        return d / (d2 * d2);
    }

    public static double getBone(boolean z, double d) {
        double d2;
        double d3;
        if (d == 0.0d) {
            return 0.0d;
        }
        if (z) {
            d2 = d * 0.0525d;
            d3 = 0.116d;
        } else {
            d2 = d * 0.0944d;
            d3 = -1.22d;
        }
        double d4 = d2 + d3;
        double d5 = 0.5d;
        if (d4 >= 0.5d) {
            d5 = 10.0d;
            if (d4 <= 10.0d) {
                return d4;
            }
        }
        return d5;
    }

    public static double getFat(boolean z, double d, double d2, double d3, double d4, double d5, boolean z2) {
        double s;
        double d6;
        double d7;
        if (d == 0.0d || d2 == 0.0d || d4 == 0.0d || d5 == 0.0d || d5 == 0.0d) {
            return 0.0d;
        }
        double d8 = d5 - 10.0d;
        if (!z2) {
            s = z ? (((((60.3d - ((((486583.0d * d2) * d2) / d) / d8)) + ((((9.146d * d) / d2) / d2) / d8)) - ((((251.193d * d2) * d2) / d) / d4)) + ((1625303.0d / d8) / d8)) - (d8 * 0.0139d)) + (d4 * 0.05975d) : (((((57.621d - (((186.422d * d2) * d2) / d)) - ((((382280.0d * d2) * d2) / d) / d8)) + (((128.005d * d) / d2) / d8)) - ((0.0728d * d) / d2)) + ((7816.359d / d2) / d8)) - ((((d * 3.333d) / d2) / d2) / d4);
        } else {
            if (d3 == 0.0d) {
                return 0.0d;
            }
            double d9 = d2 * d2;
            double d10 = d / d9;
            if (z) {
                d6 = ((d3 * 0.375d) - 21.954d) + ((d * 0.422d) / d9);
                d7 = 0.004937d;
            } else {
                d6 = ((d3 * 0.119d) - 3.082d) + ((d * 0.933d) / d9);
                d7 = 0.009328d;
            }
            s = (d6 - (d4 * d7)) + getS(d8, getK(z, d10, d8));
        }
        double d11 = 5.0d;
        if (s >= 5.0d) {
            d11 = 80.0d;
            if (s <= 80.0d) {
                return s;
            }
        }
        return d11;
    }

    public static double getK(boolean z, double d, double d2) {
        double d3;
        double d4;
        double d5;
        double d6;
        if (z) {
            if (d < 18.0d) {
                d5 = 550.0d;
                d6 = 600.0d;
                return getSimpleK(d2, d5, d6, 860.0d);
            }
            if (d < 25.0d) {
                d3 = 430.0d;
                d4 = 580.0d;
            } else {
                d3 = 400.0d;
                d4 = 500.0d;
            }
            return getSimpleK(d2, d3, d4, 860.0d);
        }
        if (d < 18.0d) {
            d5 = 500.0d;
            d6 = 700.0d;
            return getSimpleK(d2, d5, d6, 860.0d);
        }
        if (d < 25.0d) {
            d3 = 480.0d;
            d4 = 650.0d;
        } else {
            d3 = 450.0d;
            d4 = 550.0d;
        }
        return getSimpleK(d2, d3, d4, 860.0d);
    }

    public static double getMus(boolean z, double d, double d2) {
        if (d == 0.0d || d2 == 0.0d) {
            return 0.0d;
        }
        return z ? ((0.95d * d) - ((d2 * 0.0095d) * d)) - 0.13d : ((0.914d * d) + 1.13d) - ((d2 * 0.00914d) * d);
    }

    public static double getProtein(boolean z, double d, double d2, double d3, double d4) {
        if (d == 0.0d || d2 == 0.0d || d3 == 0.0d || d4 == 0.0d) {
            return 0.0d;
        }
        return ((((d - ((d2 * d) / 100.0d)) - ((d3 * d) / 100.0d)) - d4) / d) * 100.0d;
    }

    public static double getS(double d, double d2) {
        if (d < 860.0d) {
            return ((d / 500.0d) * d2) - 2.0d;
        }
        return 1.96d;
    }

    public static double getSimpleK(double d, double d2, double d3, double d4) {
        if (d < d2) {
            return 1.5d;
        }
        if (d < d3) {
            return 2.0d;
        }
        return d < d4 ? 2.3d : 0.0d;
    }

    public static double getTbw(boolean z, double d, double d2, double d3) {
        if (d3 == 0.0d || d == 0.0d || d2 == 0.0d) {
            return 0.0d;
        }
        double d4 = d3 - 10.0d;
        double d5 = z ? ((((((259672.5d * d) * d) / d2) / d4) + 30.849d) + (((0.372d * d4) / d) / d2)) - (((d * 2.581d) * d2) / d4) : ((((201468.7d * d) * d) / d2) / d4) + 23.018d + ((421.543d / d2) / d) + ((d * 160.445d) / d2);
        double d6 = 25.0d;
        if (d5 >= 25.0d) {
            d6 = 90.0d;
            if (d5 <= 90.0d) {
                return d5;
            }
        }
        return d6;
    }

    public static double getVisceralFat(boolean z, double d, double d2, double d3) {
        double d4;
        double d5;
        if (d == 0.0d || d2 == 0.0d || d3 == 0.0d) {
            return 0.0d;
        }
        double d6 = d2 - 10.0d;
        if (z) {
            d4 = ((0.758d * d) - ((d * 105.877d) / d6)) + (d3 * 0.15d);
            d5 = 9.486d;
        } else {
            d4 = ((0.533d * d) - ((d * 50.833d) / d6)) + (d3 * 0.05d);
            d5 = 6.819d;
        }
        return d4 - d5;
    }
}
