//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//
//
//
//
//import java.io.*;
//import java.util.HashSet;
//
//
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//
///*
//
//
//
//public class TestClass {
//
//    public static void main(String[] args) throws IOException {
///*import java.io.BufferedReader;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//
//        int memory1 = Integer.parseInt(br.readLine().trim());
//        int memory2 = Integer.parseInt(br.readLine().trim());
//
//        int[] out = solution(memory1, memory2);
//        System.out.print(out[0]);
//        for (int i = 1; i < out.length; i++) {
//            System.out.print(" " + out[i]);
//        }
//
//        wr.close();
//        br.close();
//    }
//
//
//
//
//
//
//
//    static int[] solution(int memory1, int memory2) {
//        int second = 0;
//        int consumption = 1;
//
//        while (true) {
//            second++;
//            // Determine which RAM to consume from
//            if (memory1 >= memory2 && memory1 >= consumption) {
//                memory1 -= consumption;
//            } else if (memory2 > memory1 && memory2 >= consumption) {
//                memory2 -= consumption;
//            } else {
//                // If neither RAM can satisfy the consumption, the computer crashes
//                break;
//            }
//            consumption++;
//        }
//
//        return new int[]{second, memory1, memory2};
//    }
//        public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            PrintWriter wr = new PrintWriter(System.out);
//
//            int N = Integer.parseInt(br.readLine().trim());
//            String candies = br.readLine();
//
//            char out = solve(N, candies);
//            System.out.println(out);
//
//
//
//
//
//            wr.close();
//            br.close();
//        }
//
//        static char solve(int N, String candies) {
//            HashSet<Character> smallCandies = new HashSet<>();
//            HashSet<Character> largeCandies = new HashSet<>();
//
//            // Separate small and large candies
//            for (int i = 0; i < N; i++) {
//                char candy = candies.charAt(i);
//                if (Character.isLowerCase(candy)) {
//                    smallCandies.add(candy);
//                } else if (Character.isUpperCase(candy)) {
//                    largeCandies.add(candy);
//                }
//            }
//
//            char bestBrand = '0'; // Default to '0' if no valid pair is found
//
//            // Check for the best brand
//            for (char largeCandy : largeCandies) {
//                char correspondingSmallCandy = Character.toLowerCase(largeCandy);
//                if (smallCandies.contains(correspondingSmallCandy)) {
//                    // Update bestBrand if the current largeCandy is better
//                    if (bestBrand == '0' || largeCandy > bestBrand) {
//                        bestBrand = largeCandy;
//                    }
//                }
//            }
//
//            return bestBrand;
//        }
//    }
//}
//
//
//
//
//
//
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            PrintWriter wr = new PrintWriter(System.out);
//
//            int N = Integer.parseInt(br.readLine().trim());
//            int K = Integer.parseInt(br.readLine().trim());
//            String[] arr_arr = br.readLine().trim().split(" ");
//            int[] arr = new int[N];
//
//            for (int i = 0; i < N; i++) {
//                arr[i] = Integer.parseInt(arr_arr[i]);
//            }
//
//            int result = solve(N, K, arr);
//            wr.println(result);
//            wr.flush();
//        }
//
//        public static int solve(int N, int K, int[] arr) {
//            List<Integer> odds = new ArrayList<>();
//            List<Integer> evens = new ArrayList<>();
//
//            // Separate odd and even numbers
//            for (int num : arr) {
//                if (num % 2 == 0) {
//                    evens.add(num);
//                } else {
//                    odds.add(num);
//                }
//            }
//
//            // If we don't have equal number of odds and evens, return 0
//            if (odds.size() != evens.size()) {
//                return 0;
//            }
//
//            // Calculate costs of separations
//            List<Integer> costs = new ArrayList<>();
//            for (int i = 0; i < odds.size() - 1; i++) {
//                for (int j = 0; j < evens.size() - 1; j++) {
//                    costs.add(Math.abs(odds.get(i) - evens.get(j)));
//                }
//            }
//
//            // Sort costs
//            Collections.sort(costs);
//
//            // Calculate maximum separations within budget K
//            int separations = 0;
//            for (int cost : costs) {
//                if (K >= cost) {
//                    K -= cost;
//                    separations++;
//                } else {
//                    break;
//                }
//            }
//
//            return separations;
//        }
//    }
//
//
//
//
//
//
//
//import java.util.Scanner;
//
//public class TestClass {
//    public static int Resource(int A, int B, int C) {
//        int count = 0;
//
//        // Use sets of three of the same type
//        count += A / 3;
//        count += B / 3;
//        count += C / 3;
//
//        // Remaining resources after using groups of three
//        A %= 3;
//        B %= 3;
//        C %= 3;
//
//        // Use sets of three different types
//        int minSet = Math.min(A, Math.min(B, C));
//        count += minSet;
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        int C = scanner.nextInt();
//        scanner.close();
//
//        System.out.println(Resource(A, B, C));
//    }
//}
//
//
//
//
//
//
//
//
//import java.util.Scanner;
//
//public class TestClass {
//    public static int solution(int A, int B) {
//        if (B % A == 0) return 0; // Already a multiple
//
//        int minChocolates = Integer.MAX_VALUE;
//
//        // Try increasing A (by X) and find the smallest valid Y
//        for (int X = 0; X <= A; X++) {
//            int newA = A + X;
//            int newB = (B / newA) * newA;
//            if (newB < B) newB += newA; // Get the next multiple
//
//            int Y = newB - B;
//            minChocolates = Math.min(minChocolates, X + Y);
//        }
//
//        return minChocolates;
//    }
//
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        scanner.close();
//
//        System.out.println(solution(A, B));
//    }
//
//}*