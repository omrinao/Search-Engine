package Searching;

import java.util.ArrayList;

public class RetrievedDocument implements Comparable{

    short _startLine;
    short _endLine;
    String _docNum;
    String _city;
    int _length;
    ArrayList<String> _strongEntities;
    double _rank;

    String _text;
    String _officialName;

    public String get_officialName() {
        return _officialName;
    }

    public void set_officialName(String _officialName) {
        this._officialName = _officialName;
    }

    public double get_rank() {
        return _rank;
    }

    public void set_rank(double _rank) {
        this._rank = _rank;
    }

    public ArrayList<String> get_strongEntities() {
        return _strongEntities;
    }

    public void set_strongEntities(ArrayList<String> _strongEntities) {
        this._strongEntities = _strongEntities;
    }

    public String get_text() {
        return _text;
    }

    public void set_text(String _text) {
        this._text = _text;
    }

    public short get_startLine() {
        return _startLine;
    }

    public void set_startLine(short _startLine) {
        this._startLine = _startLine;
    }

    public short get_endLine() {
        return _endLine;
    }

    public void set_endLine(short _endLine) {
        this._endLine = _endLine;
    }

    public String get_docNum() {
        return _docNum;
    }

    public void set_docNum(String _docNum) {
        this._docNum = _docNum;
    }

    public String get_city() {
        return _city;
    }

    public void set_city(String _city) {
        this._city = _city;
    }

    public int get_length() {
        return _length;
    }

    public void set_length(int _length) {
        this._length = _length;
    }

    public void add_rank(double v) {
        _rank+=v;
    }


    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     *
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Object o) {
        RetrievedDocument other = (RetrievedDocument) o;
        return Double.compare(other._rank, _rank);
    }
}