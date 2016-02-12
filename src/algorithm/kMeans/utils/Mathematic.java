package algorithm.kMeans.utils;

import algorithm.kMeans.data.Vertex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Class represent mathematical function often use with calculate k-means.
 */
public class Mathematic {

    /**
     * Prevent create this library class.
     */
    private Mathematic() {
    }

    /**
     * Function take line and convert to object Vertex.
     * @param line linue must be formatted as "12.34,10.23"
     * @return object Vertex
     */
    public static Vertex convert(String line) {
        String[] items = line.split(",");
        float x = Float.parseFloat(items[0]);
        float y = Float.parseFloat(items[1]);
        return new Vertex(x, y);
    }

    /**
     * Get first n (count) centroids from input file
     * @param inputFile path to file
     * @param count count centroids for get from input file
     * @return array of centroids
     */
    public static Vertex[] loadCentroids(String inputFile, int count) {
        Vertex[] centroids = new Vertex[count];
        try {
            FileInputStream fis = new FileInputStream(inputFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            for (int i = 0; i < count; i++) {
                centroids[i] = convert(reader.readLine());
            }
            reader.close();
            fis.close();
        } catch (Exception e) {
            System.err.print("Error with decide centroid from input file :( ... \n");
            e.printStackTrace();
        }

        return centroids;
    }

    /**
     * Function calculate euklide distance between two vertices.
     * @param vertex1
     * @param vertex2
     * @return distance
     */
    public static float calculateDistance(Vertex vertex1,Vertex vertex2){
        float x1 = vertex1.getX().get();
        float y1 = vertex1.getY().get();
        float x2 = vertex2.getX().get();
        float y2 = vertex2.getY().get();
        return (float) Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }

}
