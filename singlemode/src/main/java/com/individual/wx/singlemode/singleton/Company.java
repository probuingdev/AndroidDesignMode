package com.individual.wx.singlemode.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Describe:公司模型
 * wx on 2016/12/29.
 */
public class Company {

    private List<Staff> allStaffs = new ArrayList<Staff>();

    public void addStaff(Staff staff) {
        allStaffs.add(staff);
    }

    public void showAllStatffs() {
        for (Staff allStaff : allStaffs) {
            System.out.println("obj" + allStaff.toString());
        }
    }



}
