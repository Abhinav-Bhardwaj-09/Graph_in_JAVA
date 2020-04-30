package Graph_using_BFS_Algorithm;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 29-04-2020
 * Time: 16:52
 */

public class MyGraph {
    ArrayList<GraphNode> arr[];
    public MyGraph(int n){
        arr = new ArrayList[n];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = new ArrayList<GraphNode>();
        }
    }

    public void add_UndirectedEdges( int start , int end ){
        arr[start].add(new GraphNode(end));
    }

    public String toString(){
        return "MyGraph { " + "arr = " + Arrays.toString(arr) + '}' ;
    }

}
