package cc.openhome;

public class Exercise3 {
    public static void main(String[] args) {
        // 氣泡排序
        int[] numbers = {70, 80, 31, 37, 10, 1, 48, 60, 33, 80};
        var flag = true; 
        for(var i = 0; i < numbers.length - 1 && flag; i++) { 
            flag = false; 
            for(var j = 0; j < numbers.length - i - 1; j++) { 
                if(numbers[j + 1] < numbers[j]) { 
                    int t = numbers[j + 1]; 
                    numbers[j + 1] = numbers[j]; 
                    numbers[j] = t;
                    flag = true; 
                } 
            } 
        }
        for(var number : numbers) {
            System.out.printf("%3d", number);
        }
    }
}
