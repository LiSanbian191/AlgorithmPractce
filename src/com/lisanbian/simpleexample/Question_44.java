package com.lisanbian.simpleexample;
/**
 * 数字序列中某一位的数字
 */
public class Question_44 {
    public static void main(String[] args) {
        Question_44 question_44 = new Question_44();

        System.out.println(question_44.digitAtIndex(2));
    }

    public  int digitAtIndex(int index){
        if (index < 0)return -1;

        int digits = 1;  //表示位数（1为个位数、2为十位数...）

        while (true){
            //表示这个位数有多少个数字（1位数有10个、两位数是90个、三位数是900个）
            int numbersOfDigits = numberOfDigits(digits);

            //表示这个位数的数字总的位数（10*1、90*2、900*3）
            int totalNumbersOfDigits = numbersOfDigits * digits;

            //表示找到index位于哪个位数digits上
            if (index < totalNumbersOfDigits){
                return digitAtIndex(index, digits);
            }
            else {
                //直接跳过前面的数字
                index = index - totalNumbersOfDigits;
            }
            //继续查找下一个位数
            digits++;
        }
    }

    //找出这个位数有多少个数字
    private int numberOfDigits(int digits) {
        if (digits == 1)return 10;

        int count = (int)Math.pow(10, digits-1);
        return count*9;
    }

    //利用这个函数可以找到位于index的那位数
    private int digitAtIndex(int index, int digits) {
        //找到当前的数值，要求的index位数就是这个数值其中一位
        int number = beginNumber(digits) + index / digits;

        //从右边开始计数，看那位数处于数值的哪一个位置
        int indexFromRight = digits - index % digits;

        for (int i=1; i < indexFromRight; i++){
            number = number / 10;
        }
        //返回个位数的值，也是要找的那个数
        return number % 10;
    }

    private int beginNumber(int digits) {
        if (digits == 1){
            return 0;
        }else {
            return (int)Math.pow(10,digits-1);
        }
    }



}
