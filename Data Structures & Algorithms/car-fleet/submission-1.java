class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n= position.length;
        //for 0 n
        //[i][0]=pos
        //[i][1]=speed
        //sort
        //lasttime = target-pos/speed;
        //lasttime > time fleet++
        int cars[][] = new int[n][2];
        for(int i =0;i<n;i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a,b)->(b[0]-a[0]));
        double lasttime=0;
        int fleet=0;
        for(int i =0;i<n;i++){
            double t = (double)(target - cars[i][0])/cars[i][1];

            if(t>lasttime){
                fleet++;
                lasttime = t;
            }
        }
        return fleet;

    }
}
