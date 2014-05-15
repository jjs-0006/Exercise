package jp.co.jjs.java_seminar.self_study.q5_5;

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
}
