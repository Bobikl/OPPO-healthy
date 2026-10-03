package com.heytap.accessory.transport.credit;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes14.dex */
public class c extends com.heytap.accessory.transport.credit.a {
    public static final String a = "c";
    public static SparseArray<SparseArray<a>> b = new SparseArray<>();

    public static class a {
        public long b;
        public long d;
        public int a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2789c = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2790e = 0;

        public a(int i, int i2) {
            if (i2 == 1) {
                if (i == 2) {
                    this.b = 6396313L;
                } else if (i == 1) {
                    this.b = 3250585L;
                } else if (i == 0) {
                    this.b = 8388608L;
                }
                this.d = this.b;
                return;
            }
            if (i2 == 2) {
                if (i == 2) {
                    this.b = 1279262L;
                } else if (i == 1) {
                    this.b = 650117L;
                } else if (i == 0) {
                    this.b = 1677721L;
                }
                this.d = this.b;
                return;
            }
            if (i2 != 4) {
                this.b = 0L;
                this.d = 0L;
                return;
            }
            if (i == 2) {
                this.b = 6246L;
            } else if (i == 1) {
                this.b = 3174L;
            } else if (i == 0) {
                this.b = 8192L;
            }
            this.d = this.b;
        }
    }

    public c() {
        a();
    }

    public final void a() {
        b(1);
        b(2);
        b(4);
    }

    public final void b(int i) {
        if (b.get(i) == null) {
            SparseArray<a> sparseArray = new SparseArray<>();
            for (int i2 = 0; i2 <= 2; i2++) {
                sparseArray.put(i2, new a(i2, i));
            }
            b.put(i, sparseArray);
        }
    }

    @Override // com.heytap.accessory.transport.credit.a
    public boolean a(int i, int i2, int i3, boolean z) {
        int i4;
        SparseArray<a> sparseArray = b.get(i);
        if (sparseArray == null) {
            com.heytap.accessory.base.logging.a.b(a, "isCreditAvailable: Entry not found for connectivity " + i);
            return false;
        }
        synchronized (sparseArray) {
            a aVar = sparseArray.get(i2);
            if (aVar == null) {
                com.heytap.accessory.base.logging.a.a(a, "No matching credit - classType : " + i2 + "");
                aVar = sparseArray.get(1);
            }
            String str = a;
            com.heytap.accessory.base.logging.a.a(str, "classType:" + i2 + ",AvailableCredits:" + aVar.b + ",mCreditsGivenTo:" + aVar.f2789c + ",mUsedCredits:" + aVar.f2790e);
            if (aVar.b == 0 && (i4 = aVar.f2789c) >= 0) {
                a aVar2 = sparseArray.get(i4);
                if (aVar2 != null) {
                    aVar2.b -= aVar.d;
                }
                aVar.b = aVar.d;
                com.heytap.accessory.base.logging.a.a(str, "Taking back credits: " + aVar.b + " from Class: " + aVar.f2789c);
                aVar.f2789c = -1;
            }
            if (aVar.b <= 0) {
                com.heytap.accessory.base.logging.a.a(str, "current credits < 0:" + aVar.b);
                return false;
            }
            if (z) {
                aVar.a++;
                com.heytap.accessory.base.logging.a.a(str, "incrementSessionCount -  connectivity : " + i + " classType : " + i2 + " sessionCount : " + aVar.a);
            }
            aVar.b -= (long) i3;
            com.heytap.accessory.base.logging.a.a(str, "isCreditAvailable classType:" + i2 + ",mAvailableCredits:" + aVar.b);
            aVar.f2790e = aVar.f2790e + i3;
            return true;
        }
    }

    @Override // com.heytap.accessory.transport.credit.a
    public synchronized boolean a(int i, int i2, int i3) {
        SparseArray<a> sparseArray = b.get(i);
        if (sparseArray == null) {
            com.heytap.accessory.base.logging.a.b(a, "isCreditAvailable: Entry not found for connectivity " + i);
            return false;
        }
        a aVar = sparseArray.get(i2);
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.a(a, "No matching credit - classType : " + i2 + "");
            aVar = sparseArray.get(1);
        }
        aVar.b += (long) i3;
        com.heytap.accessory.base.logging.a.a(a, "decrementCredit classType:" + i2 + ",mAvailableCredits:" + aVar.b);
        aVar.f2790e = Math.max(aVar.f2790e - i3, 0);
        return true;
    }

    @Override // com.heytap.accessory.transport.credit.a
    public boolean a(int i, int i2) {
        SparseArray<a> sparseArray = b.get(i);
        if (sparseArray == null) {
            com.heytap.accessory.base.logging.a.b(a, "decrementSessionCount: Entry not found for connectivity " + i);
            return false;
        }
        synchronized (sparseArray) {
            a aVar = sparseArray.get(i2);
            if (aVar == null) {
                com.heytap.accessory.base.logging.a.b(a, "No matching credit - classType : " + i2 + "");
                return false;
            }
            int i3 = aVar.a;
            if (i3 > 0) {
                aVar.a = i3 - 1;
                com.heytap.accessory.base.logging.a.a(a, "decrementSessionCount -  connectivity : " + i + " classType : " + i2 + " sessionCount : " + aVar.a);
                if (aVar.a == 0) {
                    for (int size = sparseArray.size() - 1; size >= 0; size--) {
                        if (size != i2) {
                            a aVarValueAt = sparseArray.valueAt(size);
                            if (aVarValueAt.a > 0) {
                                aVarValueAt.b += aVar.b;
                                com.heytap.accessory.base.logging.a.a(a, "Donated Credits: " + aVar.b + " to Class: " + size);
                                aVar.b = 0L;
                                aVar.f2789c = size;
                                break;
                            }
                        }
                    }
                }
                return false;
            }
            com.heytap.accessory.base.logging.a.b(a, "Session count for Traffic class " + i2 + " is already 0!");
            return false;
        }
    }

    @Override // com.heytap.accessory.transport.credit.a
    public void a(int i) {
        SparseArray<a> sparseArray = b.get(i);
        if (sparseArray == null) {
            com.heytap.accessory.base.logging.a.b(a, "resetCredits: Entry not found for connectivity " + i);
            return;
        }
        synchronized (sparseArray) {
            for (int i2 = 0; i2 <= sparseArray.size() - 1; i2++) {
                a aVar = sparseArray.get(i2);
                if (aVar != null) {
                    aVar.b = aVar.d;
                    aVar.f2790e = 0;
                }
            }
        }
    }
}
