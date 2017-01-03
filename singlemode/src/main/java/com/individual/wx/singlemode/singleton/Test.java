package com.individual.wx.singlemode.singleton;

/**
 * Describe:
 * wx on 2016/12/29.
 */
public class Test {
    public static void main(String[] args) {

        Company cp = new Company();
        // TODO: 创建CEO对象
        CEO ceo1 = CEO.getInstance();
        CEO ceo2 = CEO.getInstance();
        // TODO: 入职
        cp.addStaff(ceo1);
        cp.addStaff(ceo2);
        // TODO: 创建VP
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        // TODO: VP入职
        cp.addStaff(vp1);
        cp.addStaff(vp2);
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();
        // TODO: 员工入职
        cp.addStaff(vp1);
        cp.addStaff(vp2);
        cp.addStaff(staff1);
        cp.addStaff(staff2);
        cp.addStaff(staff3);
        // TODO: 查看所有员工
        cp.showAllStatffs();

    }
}
