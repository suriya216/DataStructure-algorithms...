class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==1)
            return 1;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arr=1;
        int last=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>last){
                arr++;
                last=points[i][1];
            }
        }
        return arr;
    }
}