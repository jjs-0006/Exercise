package jp.co.jjs.java_seminar.self_study.q5_6;

public class Sphere {
    double r;
    double pointx;
    double pointy;
    double pointz;

    public Sphere() {
        r = 1;
        pointx = 0;
        pointy = 0;
        pointz = 0;
    }

    public Sphere(double r) {
        this.r = r;;
        pointx = 0;
        pointy = 0;
        pointz = 0;
    }

    public Sphere(double r, double pointx, double pointy, double pointz) {
        this.r = r;
        this.pointx = pointx;
        this.pointy = pointy;
        this.pointz = pointz;
    }

    public void move(double pointx,double pointy,double pointz){
        System.out.print("(" + this.pointx + " , " + this.pointy + " , " + this.pointz + ")から");
        this.pointx = pointx;
        this.pointy = pointy;
        this.pointz = pointz;
        System.out.println("(" + this.pointx + " , " + this.pointy + " , " + this.pointz + ")に変更");
    }

    public void scale(double r){
        System.out.print(this.r + "から");
        this.r = r;
        System.out.println(this.r + "に変更");
    }
}
