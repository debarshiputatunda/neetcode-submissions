class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 1) return 1;

        Deque<Double> fleet = new ArrayDeque<>();
        int posSpeed[][] = new int [position.length][speed.length];

        for (int i = 0; i < position.length; i++){
            posSpeed [i] [0] = position [i];
            posSpeed [i] [1] = speed [i];
        }

        Arrays.sort(posSpeed, (x, y) -> Integer.compare(x[0], y[0]));

        for (int i = posSpeed.length - 1; i >= 0 ; i --){
            double time = (double) (target - posSpeed [i] [0]) / posSpeed [i] [1];
            if (fleet.isEmpty() || fleet.peek() < time){
                fleet.push(time);
            }
        }
        return fleet.size();
    }
}
