package week9.behavioral_design_pattern.practice.p3;

public class BinObserver extends Observer{
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}
