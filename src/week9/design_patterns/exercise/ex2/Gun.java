package week9.design_patterns.exercise.ex2;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount = 1000;

    public void fireInPool() {
        BulletPool pool = new BulletPool();
        List<Bullet> pList = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = pool.newItem();
            p.setPosition(0);
            pList.add(p);
            for (int j = 0; j < pList.size(); j++) {
                Bullet pp = pList.get(j);
                pp.move();
                System.out.println("-" + pp.getPosition());
                if (pp.getPosition() == 10) {
                    pool.freeIntem(pp);
                    pList.remove(pp);
                }
            }
            System.out.println();
        }
    }

    public void fire() {
        List<Bullet> pList = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = new Bullet();
            p.setPosition(0);
            pList.add(p);
            for (int j = 0; j < pList.size(); j++) {
                Bullet pp = pList.get(j);
                pp.move();
                System.out.println("-" + pp.getPosition());
                if (pp.getPosition() == 10) {
                    pList.remove(pp);
                }
            }
        }
    }
}
