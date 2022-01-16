package com.tms.lesson5_1;

public enum Prof {

    DIRECTOR,
    WORKER;

    public int kof;

    public void Prof(int kof) {
        this.kof = kof;
    }

    public void setKof(int kof) {
        this.kof = kof;
    }

    public int getKof() {
        return kof;
    }
}
