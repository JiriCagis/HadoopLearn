package algorithm.kMeans.data;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.WritableComparable;

/**
 * Container represent 2D vector with decimal coordinates X and Y
 * Created by admin on 05/02/16.
 */
public class Vertex implements WritableComparable<Vertex> {

    private FloatWritable x;
    private FloatWritable y;

    //CONSTRUCTORS
    public Vertex(){
        x = new FloatWritable();
        y = new FloatWritable();
    }

    public Vertex(FloatWritable x, FloatWritable y){
        this.x = x;
    }

    public Vertex(float x, float y){
        this.x = new FloatWritable(x);
        this.y = new FloatWritable(y);
    }

    //LOGIC
    @Override
    public void write(DataOutput dataOutput) throws IOException {
        x.write(dataOutput);
        y.write(dataOutput);

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        x.readFields(dataInput);
        y.readFields(dataInput);
    }


    @Override
    public int compareTo(Vertex o) {
        return toString().compareTo(o.toString());
    }

    //GETTERS AND SETTERS

    public FloatWritable getX() {
        return x;
    }

    public void setX(FloatWritable x) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = new FloatWritable(x);
    }

    public FloatWritable getY() {
        return y;
    }

    public void setY(FloatWritable y) {
        this.y = y;
    }

    public void setY(int y) {
        this.y = new FloatWritable(y);
    }

    @Override
    public String toString() {
        return x.get() +","+y.get();
    }
}
