import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1};

        int k = removeDuplicates(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                System.out.print(nums[i] + ",");
            } else {
                System.out.print(",_");
            }
        }
    }

    public static int removeDuplicates(int[] _nums) {
        int tekrar = 0;
        int yazilanIndeks = 0;

        for (int i = 0; i < _nums.length; i++) {

            if (i + 1 < _nums.length) {
                if (_nums[i] == _nums[i + 1]) {
                    tekrar++;
                } else {
                    if (tekrar == 0) {
                        _nums[yazilanIndeks] = _nums[i];
                        yazilanIndeks++;
                    } else if (tekrar >= 1) {
                        _nums[yazilanIndeks] = _nums[i];
                        yazilanIndeks++;
                        _nums[yazilanIndeks] = _nums[i];
                        yazilanIndeks++;
                    }
                    tekrar = 0;
                }
            } else if (i + 1 == _nums.length) {
                if (_nums.length > 1) {
                    if (_nums[i] == _nums[i - 1]) {
                        _nums[yazilanIndeks] = _nums[i];
                        yazilanIndeks++;
                        _nums[yazilanIndeks] = _nums[i];
                        yazilanIndeks++;
                    } else {
                        _nums[yazilanIndeks] = _nums[i];
                        yazilanIndeks++;
                    }
                } else {
                    yazilanIndeks++;
                }
            }
        }
        return yazilanIndeks;
    }

}