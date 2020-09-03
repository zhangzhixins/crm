package com.hy.crm.pojo.vo;

import com.hy.crm.pojo.Aftersale;

import java.util.ArrayList;
import java.util.List;

public class AftersaleExt1 extends Aftersale {
    ArrayList<Integer> aftgrades;

    public List<Integer> getAftgrades() {
        return aftgrades;
    }

    public void setAftgrades(ArrayList<Integer> aftgrades) {
        this.aftgrades = aftgrades;
    }
}
