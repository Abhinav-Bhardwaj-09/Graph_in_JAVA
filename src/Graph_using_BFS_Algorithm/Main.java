package Graph_using_BFS_Algorithm;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 29-04-2020
 * Time: 16:53
 */

public class Main {
    public static void main(String[] args) {
        MyGraph obj = new MyGraph(5);
        obj.add_UndirectedEdges(0, 1);
        obj.add_UndirectedEdges(0, 2);
        obj.add_UndirectedEdges(1, 3);
        obj.add_UndirectedEdges(1, 4);

        System.out.println(obj);

    }
}