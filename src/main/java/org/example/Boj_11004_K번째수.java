package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_11004_K번째수
public class Boj_11004_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, N-1, K-1);

        System.out.println(arr[K-1]);
    } // end main
    static void quickSort(int[] arr, int s, int e, int K){
        if (s < e) {
            int pivot = partition(arr, s,e);
            if (pivot == K) {
                return;
            }else if(K<pivot){
                quickSort(arr, s, pivot-1, K);
            }else{
                quickSort(arr, pivot+1, e, K);
            }
        }
    } // end quickSort

    static int partition(int[] arr, int s, int e){
        if (s + 1 == e) {
            if(arr[s]>arr[e])swap(arr,s,e);
            return e;
        }
        int M = (s+e)/2;
        swap(arr,s,M);
        int pivot = arr[s];
        int i=s+1, j=e;
        while (i <= j) {
            while (pivot < arr[j] && j > 0) {
                j--;
            }
            while (pivot > arr[i] && i < arr.length - 1) {
                i++;
            }
            if (i <= j) {
                swap(arr,i++,j--);
            }
        }
        arr[s]=arr[j];
        arr[j]=pivot;
        return j;
    } // end partition

    static void swap(int[] arr, int start, int end){
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }
} // end class
