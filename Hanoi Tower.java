public class TowerOfHanoi {

    public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        
        solveHanoi(n - 1, fromRod, auxRod, toRod);
        
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        solveHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        System.out.println("=== Tower of Hanoi - All scenarios demo ===\n");

        System.out.println("1 disk:");
        solveHanoi(1, 'A', 'C', 'B');
        System.out.println();

        System.out.println("2 disks:");
        solveHanoi(2, 'A', 'C', 'B');
        System.out.println();

        System.out.println("3 disks:");
        solveHanoi(3, 'A', 'C', 'B');
        System.out.println();

        System.out.println("4 disks (will take 15 moves):");
        solveHanoi(4, 'A', 'C', 'B');
    }
}