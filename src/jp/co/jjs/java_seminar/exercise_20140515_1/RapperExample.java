package jp.co.jjs.java_seminar.exercise_20140515_1;

public class RapperExample {

    public static void main(String[] args) {
        Integer i = new Integer(10);
        System.out.println(i + " " +  i.toString() + " " + i.doubleValue() + " " +i.compareTo(11) + " " + i);
        Character c = new Character('a');
        System.out.println(c);
        Double d = new Double(1.3);
        System.out.println(Double.MAX_VALUE + " "  + Double.MIN_NORMAL + " " + d.intValue());
    }

}
