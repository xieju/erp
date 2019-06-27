public class Test {

    @org.junit.Test
    public void test1(){
        double initialScore = 20;
        double maxScore = 0;
        double minScore = 20;
        int j = 10;
        for (int i = 0; i < j; i++) {
            System.out.print("第 "+ i +"次： ");
            if (doRandom()){
                initialScore = initialScore * 2;
                String scoreStr = formatFloatNumber(initialScore);
                System.out.println("X2: "+ initialScore);
            }else {
                initialScore = initialScore / 2;
                String scoreStr = formatFloatNumber(initialScore);
                System.out.println("/2: "+ initialScore);
            }
            if (initialScore > maxScore){
                maxScore = initialScore;
            }
            if (initialScore < minScore){
                minScore = initialScore;
            }
        }
        System.out.println("选择 "+j+" 次,final: "+formatFloatNumber(initialScore));
        System.out.println("最小值为： "+ minScore);
        System.out.println("最大值为： "+ formatFloatNumber(maxScore));
    }

    public boolean doRandom(){
        return Math.random() * 10 > 5;
    }
    public static String formatFloatNumber(double value) {
        if(value != 0.00){
            java.text.DecimalFormat df = new java.text.DecimalFormat("########.00000000");
            return df.format(value);
        }else{
            return "0.00";
        }

    }
}
