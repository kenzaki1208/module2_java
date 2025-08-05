package week9.behavioral_design_pattern.practice.p3;

public class OctObserver extends Observer{
    public OctObserver (Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
