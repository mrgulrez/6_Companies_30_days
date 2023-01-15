class Solution {
   
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        // Create a set to store all the points
        Set<String> set = new HashSet<>();
        set.add(p1[0] + " " + p1[1]);
        set.add(p2[0] + " " + p2[1]);
        set.add(p3[0] + " " + p3[1]);
        set.add(p4[0] + " " + p4[1]);
        // if the set does not contain exactly 4 unique points, return false
        if (set.size() != 4) return false;
        
        // calculate the distance between each pair of points and store them in an array
        int[] dist = new int[6];
        dist[0] = distance(p1, p2);
        dist[1] = distance(p1, p3);
        dist[2] = distance(p1, p4);
        dist[3] = distance(p2, p3);
        dist[4] = distance(p2, p4);
        dist[5] = distance(p3, p4);
        
        // sort the array
        Arrays.sort(dist);
        
        // check if the four smallest distances are equal and the largest distance is equal to the sum of the other two
        return dist[0] == dist[1] && dist[1] == dist[2] && dist[2] == dist[3] && dist[4] == dist[5] && dist[4] == dist[0] * 2;
    }
    
    private int distance(int[] p1, int[] p2) {
        // calculate the distance between two points
        return (p2[1] - p1[1]) * (p2[1] - p1[1]) + (p2[0] - p1[0]) * (p2[0] - p1[0]);
    }
}