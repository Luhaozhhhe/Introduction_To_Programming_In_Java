class Marathon {
    public static void find_the_first(String[] a,int[] b){
        for(int i=0;i<b.length;i++){
            int num=0;
            for(int j=0;j<b.length;j++){
                if(b[i]>b[j]){
                    num++;
                }
            }
            if(num==0){
                System.out.println("name:"+a[i]+"  "+"time:"+b[i]);
            }
        }
    }
    public static void find_the_second(String[] a,int[] b){
        for(int i=0;i<b.length;i++){
            int num=0;
            for(int j=0;j<b.length;j++){
                if(b[i]>b[j]){
                    num++;
                }
            }
            if(num==1){
                System.out.println("name:"+a[i]+"  "+"time:"+b[i]);
            }
        }
    }
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        find_the_first(names, times);//找到第一名的选手并且输出名字和时间
        find_the_second(names, times);//找到第二名的选手并且输出名字和时间

    }
}
